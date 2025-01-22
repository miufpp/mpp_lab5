package lab5.prob1.rulesets;

import java.awt.Component;
import java.util.HashMap;

import lab5.prob1.gui.BookWindow;
import lab5.prob1.gui.CDWindow;

//import lesson5.labsolns.prob1.gui.BookWindow;
//import lesson5.labsolns.prob1.gui.CDWindow;


final public class RuleSetFactory {
	private RuleSetFactory(){}
	static HashMap<Class<? extends Component>, RuleSet> map = new HashMap<>();
	static {
		map.put(CDWindow.class, new CDRuleSet());
		map.put(BookWindow.class, new BookRuleSet());
	}
	
	public static RuleSet getRuleSet(Component c) {
		Class<? extends Component> c1 = c.getClass();
		if(!map.containsKey(c1)) {
			throw new IllegalArgumentException("No RuleSet found for this Component");
		}
		return map.get(c1);
	}
	
}
