/*
 * XML Type:  NationalBankCodeType
 * Namespace: http://www.ebics.org/H003
 * Java type: org.kopi.ebics.schema.h003.NationalBankCodeType
 *
 * Automatically generated - do not modify.
 */
package org.kopi.ebics.schema.h003;


/**
 * An XML NationalBankCodeType(@http://www.ebics.org/H003).
 *
 * This is an atomic type that is a restriction of org.kopi.ebics.schema.h003.NationalBankCodeType.
 */
public interface NationalBankCodeType extends org.apache.xmlbeans.XmlNormalizedString
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(NationalBankCodeType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE38346ABFB9D0612C4CA50E995509F1D").resolveHandle("nationalbankcodetype0f0ftype");
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.kopi.ebics.schema.h003.NationalBankCodeType newValue(java.lang.Object obj) {
          return (org.kopi.ebics.schema.h003.NationalBankCodeType) type.newValue( obj ); }
        
        public static org.kopi.ebics.schema.h003.NationalBankCodeType newInstance() {
          return (org.kopi.ebics.schema.h003.NationalBankCodeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.kopi.ebics.schema.h003.NationalBankCodeType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.kopi.ebics.schema.h003.NationalBankCodeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.kopi.ebics.schema.h003.NationalBankCodeType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.kopi.ebics.schema.h003.NationalBankCodeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.kopi.ebics.schema.h003.NationalBankCodeType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.kopi.ebics.schema.h003.NationalBankCodeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.kopi.ebics.schema.h003.NationalBankCodeType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.kopi.ebics.schema.h003.NationalBankCodeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.kopi.ebics.schema.h003.NationalBankCodeType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.kopi.ebics.schema.h003.NationalBankCodeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.kopi.ebics.schema.h003.NationalBankCodeType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.kopi.ebics.schema.h003.NationalBankCodeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.kopi.ebics.schema.h003.NationalBankCodeType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.kopi.ebics.schema.h003.NationalBankCodeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.kopi.ebics.schema.h003.NationalBankCodeType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.kopi.ebics.schema.h003.NationalBankCodeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.kopi.ebics.schema.h003.NationalBankCodeType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.kopi.ebics.schema.h003.NationalBankCodeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.kopi.ebics.schema.h003.NationalBankCodeType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.kopi.ebics.schema.h003.NationalBankCodeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.kopi.ebics.schema.h003.NationalBankCodeType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.kopi.ebics.schema.h003.NationalBankCodeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.kopi.ebics.schema.h003.NationalBankCodeType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.kopi.ebics.schema.h003.NationalBankCodeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.kopi.ebics.schema.h003.NationalBankCodeType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.kopi.ebics.schema.h003.NationalBankCodeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.kopi.ebics.schema.h003.NationalBankCodeType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.kopi.ebics.schema.h003.NationalBankCodeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.kopi.ebics.schema.h003.NationalBankCodeType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.kopi.ebics.schema.h003.NationalBankCodeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.kopi.ebics.schema.h003.NationalBankCodeType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.kopi.ebics.schema.h003.NationalBankCodeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.kopi.ebics.schema.h003.NationalBankCodeType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.kopi.ebics.schema.h003.NationalBankCodeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
