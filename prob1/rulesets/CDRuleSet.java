package lab5.prob1.rulesets;

import java.awt.Component;
import java.text.DecimalFormat;

import lab5.prob1.gui.CDWindow;

/**
 * Rules:
 *  1. All fields must be nonempty 
 *  2. Price must be a floating point number with two decimal places 
 *  3. Price must be a number greater than 0.49. 
 */

public class CDRuleSet implements RuleSet {
	private CDWindow cdWindow;

	@Override
	public void applyRules(Component ob) throws RuleException {
		cdWindow =  (CDWindow) ob;
		nonemptyRule();
		priceRule();
	}
	
	private void nonemptyRule() throws RuleException{
		if(cdWindow.getArtistValue().trim().isEmpty() ||
			cdWindow.getTitleValue().trim().isEmpty() ||
			cdWindow.getPriceValue().trim().isEmpty()) {
			throw new RuleException("All fields must be non-empty");
		}
		
	}
	
	private void priceRule() throws RuleException{
		String priceValue = cdWindow.getPriceValue();
		
		try {
			Double.parseDouble(priceValue);
		}catch(NumberFormatException e) {
			throw new RuleException("Wrong Price format");
		}
		
		if(priceValue.split("\\.")[1].length() !=2) {
			throw new RuleException("Price has 2 decimal places");
		}
		if(Double.parseDouble(priceValue)<=0.49) {
			throw new RuleException("Price should be more than 0.49");
		}
		
	}
	
}
