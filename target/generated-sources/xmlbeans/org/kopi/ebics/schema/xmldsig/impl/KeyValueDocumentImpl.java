/*
 * An XML document type.
 * Localname: KeyValue
 * Namespace: http://www.w3.org/2000/09/xmldsig#
 * Java type: org.kopi.ebics.schema.xmldsig.KeyValueDocument
 *
 * Automatically generated - do not modify.
 */
package org.kopi.ebics.schema.xmldsig.impl;
/**
 * A document containing one KeyValue(@http://www.w3.org/2000/09/xmldsig#) element.
 *
 * This is a complex type.
 */
public class KeyValueDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.kopi.ebics.schema.xmldsig.KeyValueDocument
{
    private static final long serialVersionUID = 1L;
    
    public KeyValueDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName KEYVALUE$0 = 
        new javax.xml.namespace.QName("http://www.w3.org/2000/09/xmldsig#", "KeyValue");
    
    
    /**
     * Gets the "KeyValue" element
     */
    public org.kopi.ebics.schema.xmldsig.KeyValueType getKeyValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.xmldsig.KeyValueType target = null;
            target = (org.kopi.ebics.schema.xmldsig.KeyValueType)get_store().find_element_user(KEYVALUE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "KeyValue" element
     */
    public void setKeyValue(org.kopi.ebics.schema.xmldsig.KeyValueType keyValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.xmldsig.KeyValueType target = null;
            target = (org.kopi.ebics.schema.xmldsig.KeyValueType)get_store().find_element_user(KEYVALUE$0, 0);
            if (target == null)
            {
                target = (org.kopi.ebics.schema.xmldsig.KeyValueType)get_store().add_element_user(KEYVALUE$0);
            }
            target.set(keyValue);
        }
    }
    
    /**
     * Appends and returns a new empty "KeyValue" element
     */
    public org.kopi.ebics.schema.xmldsig.KeyValueType addNewKeyValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.xmldsig.KeyValueType target = null;
            target = (org.kopi.ebics.schema.xmldsig.KeyValueType)get_store().add_element_user(KEYVALUE$0);
            return target;
        }
    }
}
