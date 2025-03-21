/*
 * (c) COPYRIGHT 1999 World Wide Web Consortium
 * (Massachusetts Institute of Technology, Institut National de Recherche
 *  en Informatique et en Automatique, Keio University).
 * All Rights Reserved. http://www.w3.org/Consortium/Legal/
 *
 * $Id: ConditionalSelector.java,v 1.2 1999/09/25 12:32:36 plehegar Exp $
 */
package net.pincette.css.sac;

/**
 * @version $Revision: 1.2 $
 * @author  Philippe Le Hegaret
 * @see Selector#SAC_CONDITIONAL_SELECTOR
 */
public interface ConditionalSelector extends SimpleSelector {

    /**
     * Returns the simple selector.
     * <p>The simple selector can't be a <code>ConditionalSelector</code>.</p>
     */
    public SimpleSelector getSimpleSelector();

    /**
     * Returns the condition to be applied on the simple selector.
     */
    public Condition getCondition();
}
