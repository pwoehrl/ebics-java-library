/*
 * XML Type:  PartnerInfoType
 * Namespace: http://www.ebics.org/H003
 * Java type: org.kopi.ebics.schema.h003.PartnerInfoType
 *
 * Automatically generated - do not modify.
 */
package org.kopi.ebics.schema.h003;


/**
 * An XML PartnerInfoType(@http://www.ebics.org/H003).
 *
 * This is a complex type.
 */
public interface PartnerInfoType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PartnerInfoType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE38346ABFB9D0612C4CA50E995509F1D").resolveHandle("partnerinfotype4e18type");
    
    /**
     * Gets the "AddressInfo" element
     */
    org.kopi.ebics.schema.h003.AddressInfoType getAddressInfo();
    
    /**
     * Sets the "AddressInfo" element
     */
    void setAddressInfo(org.kopi.ebics.schema.h003.AddressInfoType addressInfo);
    
    /**
     * Appends and returns a new empty "AddressInfo" element
     */
    org.kopi.ebics.schema.h003.AddressInfoType addNewAddressInfo();
    
    /**
     * Gets the "BankInfo" element
     */
    org.kopi.ebics.schema.h003.BankInfoType getBankInfo();
    
    /**
     * Sets the "BankInfo" element
     */
    void setBankInfo(org.kopi.ebics.schema.h003.BankInfoType bankInfo);
    
    /**
     * Appends and returns a new empty "BankInfo" element
     */
    org.kopi.ebics.schema.h003.BankInfoType addNewBankInfo();
    
    /**
     * Gets array of all "AccountInfo" elements
     */
    org.kopi.ebics.schema.h003.PartnerInfoType.AccountInfo[] getAccountInfoArray();
    
    /**
     * Gets ith "AccountInfo" element
     */
    org.kopi.ebics.schema.h003.PartnerInfoType.AccountInfo getAccountInfoArray(int i);
    
    /**
     * Returns number of "AccountInfo" element
     */
    int sizeOfAccountInfoArray();
    
    /**
     * Sets array of all "AccountInfo" element
     */
    void setAccountInfoArray(org.kopi.ebics.schema.h003.PartnerInfoType.AccountInfo[] accountInfoArray);
    
    /**
     * Sets ith "AccountInfo" element
     */
    void setAccountInfoArray(int i, org.kopi.ebics.schema.h003.PartnerInfoType.AccountInfo accountInfo);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "AccountInfo" element
     */
    org.kopi.ebics.schema.h003.PartnerInfoType.AccountInfo insertNewAccountInfo(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "AccountInfo" element
     */
    org.kopi.ebics.schema.h003.PartnerInfoType.AccountInfo addNewAccountInfo();
    
    /**
     * Removes the ith "AccountInfo" element
     */
    void removeAccountInfo(int i);
    
    /**
     * Gets array of all "OrderInfo" elements
     */
    org.kopi.ebics.schema.h003.AuthOrderInfoType[] getOrderInfoArray();
    
    /**
     * Gets ith "OrderInfo" element
     */
    org.kopi.ebics.schema.h003.AuthOrderInfoType getOrderInfoArray(int i);
    
    /**
     * Returns number of "OrderInfo" element
     */
    int sizeOfOrderInfoArray();
    
    /**
     * Sets array of all "OrderInfo" element
     */
    void setOrderInfoArray(org.kopi.ebics.schema.h003.AuthOrderInfoType[] orderInfoArray);
    
    /**
     * Sets ith "OrderInfo" element
     */
    void setOrderInfoArray(int i, org.kopi.ebics.schema.h003.AuthOrderInfoType orderInfo);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "OrderInfo" element
     */
    org.kopi.ebics.schema.h003.AuthOrderInfoType insertNewOrderInfo(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "OrderInfo" element
     */
    org.kopi.ebics.schema.h003.AuthOrderInfoType addNewOrderInfo();
    
    /**
     * Removes the ith "OrderInfo" element
     */
    void removeOrderInfo(int i);
    
    /**
     * An XML AccountInfo(@http://www.ebics.org/H003).
     *
     * This is a complex type.
     */
    public interface AccountInfo extends org.kopi.ebics.schema.h003.AccountType
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AccountInfo.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE38346ABFB9D0612C4CA50E995509F1D").resolveHandle("accountinfod45felemtype");
        
        /**
         * Gets the "UsageOrderTypes" element
         */
        java.util.List getUsageOrderTypes();
        
        /**
         * Gets (as xml) the "UsageOrderTypes" element
         */
        org.kopi.ebics.schema.h003.OrderTListType xgetUsageOrderTypes();
        
        /**
         * True if has "UsageOrderTypes" element
         */
        boolean isSetUsageOrderTypes();
        
        /**
         * Sets the "UsageOrderTypes" element
         */
        void setUsageOrderTypes(java.util.List usageOrderTypes);
        
        /**
         * Sets (as xml) the "UsageOrderTypes" element
         */
        void xsetUsageOrderTypes(org.kopi.ebics.schema.h003.OrderTListType usageOrderTypes);
        
        /**
         * Unsets the "UsageOrderTypes" element
         */
        void unsetUsageOrderTypes();
        
        /**
         * Gets the "ID" attribute
         */
        java.lang.String getID();
        
        /**
         * Gets (as xml) the "ID" attribute
         */
        org.kopi.ebics.schema.h003.AccountIDType xgetID();
        
        /**
         * Sets the "ID" attribute
         */
        void setID(java.lang.String id);
        
        /**
         * Sets (as xml) the "ID" attribute
         */
        void xsetID(org.kopi.ebics.schema.h003.AccountIDType id);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.kopi.ebics.schema.h003.PartnerInfoType.AccountInfo newInstance() {
              return (org.kopi.ebics.schema.h003.PartnerInfoType.AccountInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.kopi.ebics.schema.h003.PartnerInfoType.AccountInfo newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.kopi.ebics.schema.h003.PartnerInfoType.AccountInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.kopi.ebics.schema.h003.PartnerInfoType newInstance() {
          return (org.kopi.ebics.schema.h003.PartnerInfoType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.kopi.ebics.schema.h003.PartnerInfoType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.kopi.ebics.schema.h003.PartnerInfoType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.kopi.ebics.schema.h003.PartnerInfoType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.kopi.ebics.schema.h003.PartnerInfoType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.kopi.ebics.schema.h003.PartnerInfoType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.kopi.ebics.schema.h003.PartnerInfoType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.kopi.ebics.schema.h003.PartnerInfoType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.kopi.ebics.schema.h003.PartnerInfoType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.kopi.ebics.schema.h003.PartnerInfoType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.kopi.ebics.schema.h003.PartnerInfoType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.kopi.ebics.schema.h003.PartnerInfoType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.kopi.ebics.schema.h003.PartnerInfoType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.kopi.ebics.schema.h003.PartnerInfoType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.kopi.ebics.schema.h003.PartnerInfoType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.kopi.ebics.schema.h003.PartnerInfoType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.kopi.ebics.schema.h003.PartnerInfoType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.kopi.ebics.schema.h003.PartnerInfoType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.kopi.ebics.schema.h003.PartnerInfoType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.kopi.ebics.schema.h003.PartnerInfoType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.kopi.ebics.schema.h003.PartnerInfoType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.kopi.ebics.schema.h003.PartnerInfoType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.kopi.ebics.schema.h003.PartnerInfoType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.kopi.ebics.schema.h003.PartnerInfoType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.kopi.ebics.schema.h003.PartnerInfoType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.kopi.ebics.schema.h003.PartnerInfoType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.kopi.ebics.schema.h003.PartnerInfoType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.kopi.ebics.schema.h003.PartnerInfoType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.kopi.ebics.schema.h003.PartnerInfoType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.kopi.ebics.schema.h003.PartnerInfoType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.kopi.ebics.schema.h003.PartnerInfoType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.kopi.ebics.schema.h003.PartnerInfoType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.kopi.ebics.schema.h003.PartnerInfoType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.kopi.ebics.schema.h003.PartnerInfoType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.kopi.ebics.schema.h003.PartnerInfoType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
