package lab5.prob1.rulesets;

import java.awt.Component;

import lab5.prob1.gui.BookWindow;

//import lesson5.labsolns.prob1.gui.*;


/**
 * Rules:
 * 1. All fields must be nonempty
 * 2. Isbn must be numeric and consist of either 10 or 13 characters
 * 3. If Isbn has length 10, the first digit must be 0 or 1
 * 4. If Isbn has length 13, the first 3 digits must be either 978 or 979
 * 5. Price must be a floating point number with two decimal places 
 * 6. Price must be a number greater than 0.49.
 *
 */
public class BookRuleSet implements RuleSet {
	private BookWindow bookWindow;
	@Override
	public void applyRules(Component ob) throws RuleException {
		bookWindow = (BookWindow) ob;
		noneEmptyRule();
		isbnRule();
		priceRule();
	}
	
	private void noneEmptyRule() throws RuleException{
		if(bookWindow.getIsbnValue().trim().isEmpty() || bookWindow.getPriceValue().trim().isEmpty() || bookWindow.getTitleValue().trim().isEmpty())
			throw new RuleException("No empty fields should be submitted");
	}
	
	private void isbnRule() throws RuleException{
		String isbn = bookWindow.getIsbnValue().trim();
		try {
			Integer.parseInt(isbn);
		}catch(NumberFormatException e) {
			throw new RuleException("ISBN is a number");
		}
		if(isbn.length() != 10 && isbn.length() !=13) {
			throw new RuleException("Out of range");
		}
		else {
			if (isbn.length() == 10) {
                if (isbn.charAt(0) != '0' && isbn.charAt(0) != '1') {
                    throw new RuleException("First digit of 10-digit ISBN must be 0 or 1");
                }
            } else
            {if (!isbn.startsWith("978") && !isbn.startsWith("979")) {
                throw new RuleException(" 13-digit ISBNs must begin with either '978' or '979'");}
            }
		}
	}
	
	private void  priceRule() throws RuleException{
		String price = bookWindow.getPriceValue().trim();
		try {
            Double.parseDouble(price);
        } catch (NumberFormatException exception) {
            throw new RuleException("Price must be a floating point number.");
        }

        if (price.split("\\.")[1].length() != 2) {
            throw new RuleException("Price must have exactly two digits after the decimal point.");

        }
        if (Double.parseDouble(price) <= 0.49) throw new RuleException("Price must have value bigger than 0.49.");
	}
	

}
