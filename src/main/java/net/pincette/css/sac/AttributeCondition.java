/*
 * Copyright (c) 1999 World Wide Web Consortium,
 * (Massachusetts Institute of Technology, Institut National de
 * Recherche en Informatique et en Automatique, Keio University). All
 * Rights Reserved. This program is distributed under the W3C's Software
 * Intellectual Property License. This program is distributed in the
 * hope that it will be useful, but WITHOUT ANY WARRANTY; without even
 * the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR
 * PURPOSE.
 * See W3C License http://www.w3.org/Consortium/Legal/ for more details.
 *
 * $Id: AttributeCondition.java,v 1.5 2002/06/17 14:10:09 plehegar Exp $
 */
package net.pincette.css.sac;

/**
 * @version $Revision: 1.5 $
 * @author  Philippe Le Hegaret
 * @see Condition#SAC_ATTRIBUTE_CONDITION
 * @see Condition#SAC_ONE_OF_ATTRIBUTE_CONDITION
 * @see Condition#SAC_BEGIN_HYPHEN_ATTRIBUTE_CONDITION
 * @see Condition#SAC_ID_CONDITION
 * @see Condition#SAC_CLASS_CONDITION
 * @see Condition#SAC_PSEUDO_CLASS_CONDITION
 */
public interface AttributeCondition extends Condition {

    /**
     * Returns the
     * <a href="http://www.w3.org/TR/REC-xml-names/#dt-NSName">namespace
     * URI</a> of this attribute condition.
     * <p><code>NULL</code> if :
     * <ul>
     * <li>this attribute condition can match any namespace.
     * <li>this attribute is an id attribute.
     * </ul>
     */
    public String getNamespaceURI();

    /**
     * Returns the
     * <a href="http://www.w3.org/TR/REC-xml-names/#NT-LocalPart">local part</a>
     * of the
     * <a href="http://www.w3.org/TR/REC-xml-names/#ns-qualnames">qualified
     * name</a> of this attribute.
     * <p><code>NULL</code> if :
     * <ul>
     * <li><p>this attribute condition can match any attribute.
     * <li><p>this attribute is a class attribute.
     * <li><p>this attribute is an id attribute.
     * <li><p>this attribute is a pseudo-class attribute.
     * </ul>
     */
    public String getLocalName();

    /**
     * Returns <code>true</code> if the attribute must have an explicit value
     * in the original document, <code>false</code> otherwise.
     */
    public boolean getSpecified();

    /**
     * Returns the value of the attribute.
     * If this attribute is a class or a pseudo class attribute, you'll get
     * the class name (or psedo class name) without the '.' or ':'.
     */
    public String getValue();
}
