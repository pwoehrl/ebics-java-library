/*
 * XML Type:  TransformsType
 * Namespace: http://www.w3.org/2000/09/xmldsig#
 * Java type: org.kopi.ebics.schema.xmldsig.TransformsType
 *
 * Automatically generated - do not modify.
 */
package org.kopi.ebics.schema.xmldsig.impl;
/**
 * An XML TransformsType(@http://www.w3.org/2000/09/xmldsig#).
 *
 * This is a complex type.
 */
public class TransformsTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.kopi.ebics.schema.xmldsig.TransformsType
{
    private static final long serialVersionUID = 1L;
    
    public TransformsTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TRANSFORM$0 = 
        new javax.xml.namespace.QName("http://www.w3.org/2000/09/xmldsig#", "Transform");
    
    
    /**
     * Gets array of all "Transform" elements
     */
    public org.kopi.ebics.schema.xmldsig.TransformType[] getTransformArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(TRANSFORM$0, targetList);
            org.kopi.ebics.schema.xmldsig.TransformType[] result = new org.kopi.ebics.schema.xmldsig.TransformType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Transform" element
     */
    public org.kopi.ebics.schema.xmldsig.TransformType getTransformArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.xmldsig.TransformType target = null;
            target = (org.kopi.ebics.schema.xmldsig.TransformType)get_store().find_element_user(TRANSFORM$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Transform" element
     */
    public int sizeOfTransformArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TRANSFORM$0);
        }
    }
    
    /**
     * Sets array of all "Transform" element
     */
    public void setTransformArray(org.kopi.ebics.schema.xmldsig.TransformType[] transformArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(transformArray, TRANSFORM$0);
        }
    }
    
    /**
     * Sets ith "Transform" element
     */
    public void setTransformArray(int i, org.kopi.ebics.schema.xmldsig.TransformType transform)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.xmldsig.TransformType target = null;
            target = (org.kopi.ebics.schema.xmldsig.TransformType)get_store().find_element_user(TRANSFORM$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(transform);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Transform" element
     */
    public org.kopi.ebics.schema.xmldsig.TransformType insertNewTransform(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.xmldsig.TransformType target = null;
            target = (org.kopi.ebics.schema.xmldsig.TransformType)get_store().insert_element_user(TRANSFORM$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Transform" element
     */
    public org.kopi.ebics.schema.xmldsig.TransformType addNewTransform()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.xmldsig.TransformType target = null;
            target = (org.kopi.ebics.schema.xmldsig.TransformType)get_store().add_element_user(TRANSFORM$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "Transform" element
     */
    public void removeTransform(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TRANSFORM$0, i);
        }
    }
}
