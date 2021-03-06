/*
 * XML Type:  FDLOrderParamsType
 * Namespace: http://www.ebics.org/H003
 * Java type: org.kopi.ebics.schema.h003.FDLOrderParamsType
 *
 * Automatically generated - do not modify.
 */
package org.kopi.ebics.schema.h003.impl;
/**
 * An XML FDLOrderParamsType(@http://www.ebics.org/H003).
 *
 * This is a complex type.
 */
public class FDLOrderParamsTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.kopi.ebics.schema.h003.FDLOrderParamsType
{
    private static final long serialVersionUID = 1L;
    
    public FDLOrderParamsTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DATERANGE$0 = 
        new javax.xml.namespace.QName("http://www.ebics.org/H003", "DateRange");
    private static final javax.xml.namespace.QName PARAMETER$2 = 
        new javax.xml.namespace.QName("http://www.ebics.org/H003", "Parameter");
    private static final javax.xml.namespace.QName FILEFORMAT$4 = 
        new javax.xml.namespace.QName("http://www.ebics.org/H003", "FileFormat");
    
    
    /**
     * Gets the "DateRange" element
     */
    public org.kopi.ebics.schema.h003.FDLOrderParamsType.DateRange getDateRange()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.FDLOrderParamsType.DateRange target = null;
            target = (org.kopi.ebics.schema.h003.FDLOrderParamsType.DateRange)get_store().find_element_user(DATERANGE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "DateRange" element
     */
    public boolean isSetDateRange()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATERANGE$0) != 0;
        }
    }
    
    /**
     * Sets the "DateRange" element
     */
    public void setDateRange(org.kopi.ebics.schema.h003.FDLOrderParamsType.DateRange dateRange)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.FDLOrderParamsType.DateRange target = null;
            target = (org.kopi.ebics.schema.h003.FDLOrderParamsType.DateRange)get_store().find_element_user(DATERANGE$0, 0);
            if (target == null)
            {
                target = (org.kopi.ebics.schema.h003.FDLOrderParamsType.DateRange)get_store().add_element_user(DATERANGE$0);
            }
            target.set(dateRange);
        }
    }
    
    /**
     * Appends and returns a new empty "DateRange" element
     */
    public org.kopi.ebics.schema.h003.FDLOrderParamsType.DateRange addNewDateRange()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.FDLOrderParamsType.DateRange target = null;
            target = (org.kopi.ebics.schema.h003.FDLOrderParamsType.DateRange)get_store().add_element_user(DATERANGE$0);
            return target;
        }
    }
    
    /**
     * Unsets the "DateRange" element
     */
    public void unsetDateRange()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATERANGE$0, 0);
        }
    }
    
    /**
     * Gets array of all "Parameter" elements
     */
    public org.kopi.ebics.schema.h003.ParameterDocument.Parameter[] getParameterArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PARAMETER$2, targetList);
            org.kopi.ebics.schema.h003.ParameterDocument.Parameter[] result = new org.kopi.ebics.schema.h003.ParameterDocument.Parameter[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Parameter" element
     */
    public org.kopi.ebics.schema.h003.ParameterDocument.Parameter getParameterArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.ParameterDocument.Parameter target = null;
            target = (org.kopi.ebics.schema.h003.ParameterDocument.Parameter)get_store().find_element_user(PARAMETER$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Parameter" element
     */
    public int sizeOfParameterArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PARAMETER$2);
        }
    }
    
    /**
     * Sets array of all "Parameter" element
     */
    public void setParameterArray(org.kopi.ebics.schema.h003.ParameterDocument.Parameter[] parameterArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(parameterArray, PARAMETER$2);
        }
    }
    
    /**
     * Sets ith "Parameter" element
     */
    public void setParameterArray(int i, org.kopi.ebics.schema.h003.ParameterDocument.Parameter parameter)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.ParameterDocument.Parameter target = null;
            target = (org.kopi.ebics.schema.h003.ParameterDocument.Parameter)get_store().find_element_user(PARAMETER$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(parameter);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Parameter" element
     */
    public org.kopi.ebics.schema.h003.ParameterDocument.Parameter insertNewParameter(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.ParameterDocument.Parameter target = null;
            target = (org.kopi.ebics.schema.h003.ParameterDocument.Parameter)get_store().insert_element_user(PARAMETER$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Parameter" element
     */
    public org.kopi.ebics.schema.h003.ParameterDocument.Parameter addNewParameter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.ParameterDocument.Parameter target = null;
            target = (org.kopi.ebics.schema.h003.ParameterDocument.Parameter)get_store().add_element_user(PARAMETER$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "Parameter" element
     */
    public void removeParameter(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PARAMETER$2, i);
        }
    }
    
    /**
     * Gets the "FileFormat" element
     */
    public org.kopi.ebics.schema.h003.FileFormatType getFileFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.FileFormatType target = null;
            target = (org.kopi.ebics.schema.h003.FileFormatType)get_store().find_element_user(FILEFORMAT$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "FileFormat" element
     */
    public void setFileFormat(org.kopi.ebics.schema.h003.FileFormatType fileFormat)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.FileFormatType target = null;
            target = (org.kopi.ebics.schema.h003.FileFormatType)get_store().find_element_user(FILEFORMAT$4, 0);
            if (target == null)
            {
                target = (org.kopi.ebics.schema.h003.FileFormatType)get_store().add_element_user(FILEFORMAT$4);
            }
            target.set(fileFormat);
        }
    }
    
    /**
     * Appends and returns a new empty "FileFormat" element
     */
    public org.kopi.ebics.schema.h003.FileFormatType addNewFileFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.FileFormatType target = null;
            target = (org.kopi.ebics.schema.h003.FileFormatType)get_store().add_element_user(FILEFORMAT$4);
            return target;
        }
    }
    /**
     * An XML DateRange(@http://www.ebics.org/H003).
     *
     * This is a complex type.
     */
    public static class DateRangeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.kopi.ebics.schema.h003.FDLOrderParamsType.DateRange
    {
        private static final long serialVersionUID = 1L;
        
        public DateRangeImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName START$0 = 
            new javax.xml.namespace.QName("http://www.ebics.org/H003", "Start");
        private static final javax.xml.namespace.QName END$2 = 
            new javax.xml.namespace.QName("http://www.ebics.org/H003", "End");
        
        
        /**
         * Gets the "Start" element
         */
        public java.util.Calendar getStart()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(START$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "Start" element
         */
        public org.kopi.ebics.schema.h003.DateType xgetStart()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.kopi.ebics.schema.h003.DateType target = null;
                target = (org.kopi.ebics.schema.h003.DateType)get_store().find_element_user(START$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "Start" element
         */
        public void setStart(java.util.Calendar start)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(START$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(START$0);
                }
                target.setCalendarValue(start);
            }
        }
        
        /**
         * Sets (as xml) the "Start" element
         */
        public void xsetStart(org.kopi.ebics.schema.h003.DateType start)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.kopi.ebics.schema.h003.DateType target = null;
                target = (org.kopi.ebics.schema.h003.DateType)get_store().find_element_user(START$0, 0);
                if (target == null)
                {
                    target = (org.kopi.ebics.schema.h003.DateType)get_store().add_element_user(START$0);
                }
                target.set(start);
            }
        }
        
        /**
         * Gets the "End" element
         */
        public java.util.Calendar getEnd()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(END$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "End" element
         */
        public org.kopi.ebics.schema.h003.DateType xgetEnd()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.kopi.ebics.schema.h003.DateType target = null;
                target = (org.kopi.ebics.schema.h003.DateType)get_store().find_element_user(END$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "End" element
         */
        public void setEnd(java.util.Calendar end)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(END$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(END$2);
                }
                target.setCalendarValue(end);
            }
        }
        
        /**
         * Sets (as xml) the "End" element
         */
        public void xsetEnd(org.kopi.ebics.schema.h003.DateType end)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.kopi.ebics.schema.h003.DateType target = null;
                target = (org.kopi.ebics.schema.h003.DateType)get_store().find_element_user(END$2, 0);
                if (target == null)
                {
                    target = (org.kopi.ebics.schema.h003.DateType)get_store().add_element_user(END$2);
                }
                target.set(end);
            }
        }
    }
}
