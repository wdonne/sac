/*
 * (c) COPYRIGHT 1999 World Wide Web Consortium
 * (Massachusetts Institute of Technology, Institut National de Recherche
 *  en Informatique et en Automatique, Keio University).
 * All Rights Reserved. http://www.w3.org/Consortium/Legal/
 *
 * $Id: SiblingSelector.java,v 1.3 2000/07/27 21:19:21 plehegar Exp $
 */
package net.pincette.css.sac;

/**
 * @version $Revision: 1.3 $
 * @author  Philippe Le Hegaret
 * @see Selector#SAC_DIRECT_ADJACENT_SELECTOR
 */
public interface SiblingSelector extends Selector {

    public static final short ANY_NODE = 201;

    /**
     * The node type to considered in the siblings list.
     * All DOM node types are supported. In order to support the "any" node
     * type, the code ANY_NODE is added to the DOM node types.
     */
    public short getNodeType();

    /**
     * Returns the first selector.
     */
    public Selector getSelector();

    /*
     * Returns the second selector.
     */
    public SimpleSelector getSiblingSelector();
}
