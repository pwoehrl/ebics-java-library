/*
 * An XML document type.
 * Localname: ebicsResponse
 * Namespace: http://www.ebics.org/H003
 * Java type: org.kopi.ebics.schema.h003.EbicsResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.kopi.ebics.schema.h003;


/**
 * A document containing one ebicsResponse(@http://www.ebics.org/H003) element.
 *
 * This is a complex type.
 */
public interface EbicsResponseDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(EbicsResponseDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE38346ABFB9D0612C4CA50E995509F1D").resolveHandle("ebicsresponseb4f5doctype");
    
    /**
     * Gets the "ebicsResponse" element
     */
    org.kopi.ebics.schema.h003.EbicsResponseDocument.EbicsResponse getEbicsResponse();
    
    /**
     * Sets the "ebicsResponse" element
     */
    void setEbicsResponse(org.kopi.ebics.schema.h003.EbicsResponseDocument.EbicsResponse ebicsResponse);
    
    /**
     * Appends and returns a new empty "ebicsResponse" element
     */
    org.kopi.ebics.schema.h003.EbicsResponseDocument.EbicsResponse addNewEbicsResponse();
    
    /**
     * An XML ebicsResponse(@http://www.ebics.org/H003).
     *
     * This is a complex type.
     */
    public interface EbicsResponse extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(EbicsResponse.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE38346ABFB9D0612C4CA50E995509F1D").resolveHandle("ebicsresponse055eelemtype");
        
        /**
         * Gets the "header" element
         */
        org.kopi.ebics.schema.h003.EbicsResponseDocument.EbicsResponse.Header getHeader();
        
        /**
         * Sets the "header" element
         */
        void setHeader(org.kopi.ebics.schema.h003.EbicsResponseDocument.EbicsResponse.Header header);
        
        /**
         * Appends and returns a new empty "header" element
         */
        org.kopi.ebics.schema.h003.EbicsResponseDocument.EbicsResponse.Header addNewHeader();
        
        /**
         * Gets the "AuthSignature" element
         */
        org.kopi.ebics.schema.xmldsig.SignatureType getAuthSignature();
        
        /**
         * Sets the "AuthSignature" element
         */
        void setAuthSignature(org.kopi.ebics.schema.xmldsig.SignatureType authSignature);
        
        /**
         * Appends and returns a new empty "AuthSignature" element
         */
        org.kopi.ebics.schema.xmldsig.SignatureType addNewAuthSignature();
        
        /**
         * Gets the "body" element
         */
        org.kopi.ebics.schema.h003.EbicsResponseDocument.EbicsResponse.Body getBody();
        
        /**
         * Sets the "body" element
         */
        void setBody(org.kopi.ebics.schema.h003.EbicsResponseDocument.EbicsResponse.Body body);
        
        /**
         * Appends and returns a new empty "body" element
         */
        org.kopi.ebics.schema.h003.EbicsResponseDocument.EbicsResponse.Body addNewBody();
        
        /**
         * Gets the "Version" attribute
         */
        java.lang.String getVersion();
        
        /**
         * Gets (as xml) the "Version" attribute
         */
        org.kopi.ebics.schema.h003.ProtocolVersionType xgetVersion();
        
        /**
         * Sets the "Version" attribute
         */
        void setVersion(java.lang.String version);
        
        /**
         * Sets (as xml) the "Version" attribute
         */
        void xsetVersion(org.kopi.ebics.schema.h003.ProtocolVersionType version);
        
        /**
         * Gets the "Revision" attribute
         */
        int getRevision();
        
        /**
         * Gets (as xml) the "Revision" attribute
         */
        org.kopi.ebics.schema.h003.ProtocolRevisionType xgetRevision();
        
        /**
         * True if has "Revision" attribute
         */
        boolean isSetRevision();
        
        /**
         * Sets the "Revision" attribute
         */
        void setRevision(int revision);
        
        /**
         * Sets (as xml) the "Revision" attribute
         */
        void xsetRevision(org.kopi.ebics.schema.h003.ProtocolRevisionType revision);
        
        /**
         * Unsets the "Revision" attribute
         */
        void unsetRevision();
        
        /**
         * An XML header(@http://www.ebics.org/H003).
         *
         * This is a complex type.
         */
        public interface Header extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Header.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE38346ABFB9D0612C4CA50E995509F1D").resolveHandle("headera947elemtype");
            
            /**
             * Gets the "static" element
             */
            org.kopi.ebics.schema.h003.ResponseStaticHeaderType getStatic();
            
            /**
             * Sets the "static" element
             */
            void setStatic(org.kopi.ebics.schema.h003.ResponseStaticHeaderType xstatic);
            
            /**
             * Appends and returns a new empty "static" element
             */
            org.kopi.ebics.schema.h003.ResponseStaticHeaderType addNewStatic();
            
            /**
             * Gets the "mutable" element
             */
            org.kopi.ebics.schema.h003.ResponseMutableHeaderType getMutable();
            
            /**
             * Sets the "mutable" element
             */
            void setMutable(org.kopi.ebics.schema.h003.ResponseMutableHeaderType mutable);
            
            /**
             * Appends and returns a new empty "mutable" element
             */
            org.kopi.ebics.schema.h003.ResponseMutableHeaderType addNewMutable();
            
            /**
             * Gets the "authenticate" attribute
             */
            boolean getAuthenticate();
            
            /**
             * Gets (as xml) the "authenticate" attribute
             */
            org.apache.xmlbeans.XmlBoolean xgetAuthenticate();
            
            /**
             * Sets the "authenticate" attribute
             */
            void setAuthenticate(boolean authenticate);
            
            /**
             * Sets (as xml) the "authenticate" attribute
             */
            void xsetAuthenticate(org.apache.xmlbeans.XmlBoolean authenticate);
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static org.kopi.ebics.schema.h003.EbicsResponseDocument.EbicsResponse.Header newInstance() {
                  return (org.kopi.ebics.schema.h003.EbicsResponseDocument.EbicsResponse.Header) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static org.kopi.ebics.schema.h003.EbicsResponseDocument.EbicsResponse.Header newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (org.kopi.ebics.schema.h003.EbicsResponseDocument.EbicsResponse.Header) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML body(@http://www.ebics.org/H003).
         *
         * This is a complex type.
         */
        public interface Body extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Body.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE38346ABFB9D0612C4CA50E995509F1D").resolveHandle("body521celemtype");
            
            /**
             * Gets the "DataTransfer" element
             */
            org.kopi.ebics.schema.h003.DataTransferResponseType getDataTransfer();
            
            /**
             * True if has "DataTransfer" element
             */
            boolean isSetDataTransfer();
            
            /**
             * Sets the "DataTransfer" element
             */
            void setDataTransfer(org.kopi.ebics.schema.h003.DataTransferResponseType dataTransfer);
            
            /**
             * Appends and returns a new empty "DataTransfer" element
             */
            org.kopi.ebics.schema.h003.DataTransferResponseType addNewDataTransfer();
            
            /**
             * Unsets the "DataTransfer" element
             */
            void unsetDataTransfer();
            
            /**
             * Gets the "ReturnCode" element
             */
            org.kopi.ebics.schema.h003.EbicsResponseDocument.EbicsResponse.Body.ReturnCode getReturnCode();
            
            /**
             * Sets the "ReturnCode" element
             */
            void setReturnCode(org.kopi.ebics.schema.h003.EbicsResponseDocument.EbicsResponse.Body.ReturnCode returnCode);
            
            /**
             * Appends and returns a new empty "ReturnCode" element
             */
            org.kopi.ebics.schema.h003.EbicsResponseDocument.EbicsResponse.Body.ReturnCode addNewReturnCode();
            
            /**
             * Gets the "TimestampBankParameter" element
             */
            org.kopi.ebics.schema.h003.EbicsResponseDocument.EbicsResponse.Body.TimestampBankParameter getTimestampBankParameter();
            
            /**
             * True if has "TimestampBankParameter" element
             */
            boolean isSetTimestampBankParameter();
            
            /**
             * Sets the "TimestampBankParameter" element
             */
            void setTimestampBankParameter(org.kopi.ebics.schema.h003.EbicsResponseDocument.EbicsResponse.Body.TimestampBankParameter timestampBankParameter);
            
            /**
             * Appends and returns a new empty "TimestampBankParameter" element
             */
            org.kopi.ebics.schema.h003.EbicsResponseDocument.EbicsResponse.Body.TimestampBankParameter addNewTimestampBankParameter();
            
            /**
             * Unsets the "TimestampBankParameter" element
             */
            void unsetTimestampBankParameter();
            
            /**
             * An XML ReturnCode(@http://www.ebics.org/H003).
             *
             * This is an atomic type that is a restriction of org.kopi.ebics.schema.h003.EbicsResponseDocument$EbicsResponse$Body$ReturnCode.
             */
            public interface ReturnCode extends org.kopi.ebics.schema.h003.ReturnCodeType
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ReturnCode.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE38346ABFB9D0612C4CA50E995509F1D").resolveHandle("returncode0b43elemtype");
                
                /**
                 * Gets the "authenticate" attribute
                 */
                boolean getAuthenticate();
                
                /**
                 * Gets (as xml) the "authenticate" attribute
                 */
                org.apache.xmlbeans.XmlBoolean xgetAuthenticate();
                
                /**
                 * Sets the "authenticate" attribute
                 */
                void setAuthenticate(boolean authenticate);
                
                /**
                 * Sets (as xml) the "authenticate" attribute
                 */
                void xsetAuthenticate(org.apache.xmlbeans.XmlBoolean authenticate);
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static org.kopi.ebics.schema.h003.EbicsResponseDocument.EbicsResponse.Body.ReturnCode newInstance() {
                      return (org.kopi.ebics.schema.h003.EbicsResponseDocument.EbicsResponse.Body.ReturnCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static org.kopi.ebics.schema.h003.EbicsResponseDocument.EbicsResponse.Body.ReturnCode newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (org.kopi.ebics.schema.h003.EbicsResponseDocument.EbicsResponse.Body.ReturnCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * An XML TimestampBankParameter(@http://www.ebics.org/H003).
             *
             * This is an atomic type that is a restriction of org.kopi.ebics.schema.h003.EbicsResponseDocument$EbicsResponse$Body$TimestampBankParameter.
             */
            public interface TimestampBankParameter extends org.kopi.ebics.schema.h003.TimestampType
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TimestampBankParameter.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE38346ABFB9D0612C4CA50E995509F1D").resolveHandle("timestampbankparameter6e69elemtype");
                
                /**
                 * Gets the "authenticate" attribute
                 */
                boolean getAuthenticate();
                
                /**
                 * Gets (as xml) the "authenticate" attribute
                 */
                org.apache.xmlbeans.XmlBoolean xgetAuthenticate();
                
                /**
                 * Sets the "authenticate" attribute
                 */
                void setAuthenticate(boolean authenticate);
                
                /**
                 * Sets (as xml) the "authenticate" attribute
                 */
                void xsetAuthenticate(org.apache.xmlbeans.XmlBoolean authenticate);
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static org.kopi.ebics.schema.h003.EbicsResponseDocument.EbicsResponse.Body.TimestampBankParameter newInstance() {
                      return (org.kopi.ebics.schema.h003.EbicsResponseDocument.EbicsResponse.Body.TimestampBankParameter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static org.kopi.ebics.schema.h003.EbicsResponseDocument.EbicsResponse.Body.TimestampBankParameter newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (org.kopi.ebics.schema.h003.EbicsResponseDocument.EbicsResponse.Body.TimestampBankParameter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static org.kopi.ebics.schema.h003.EbicsResponseDocument.EbicsResponse.Body newInstance() {
                  return (org.kopi.ebics.schema.h003.EbicsResponseDocument.EbicsResponse.Body) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static org.kopi.ebics.schema.h003.EbicsResponseDocument.EbicsResponse.Body newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (org.kopi.ebics.schema.h003.EbicsResponseDocument.EbicsResponse.Body) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.kopi.ebics.schema.h003.EbicsResponseDocument.EbicsResponse newInstance() {
              return (org.kopi.ebics.schema.h003.EbicsResponseDocument.EbicsResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.kopi.ebics.schema.h003.EbicsResponseDocument.EbicsResponse newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.kopi.ebics.schema.h003.EbicsResponseDocument.EbicsResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.kopi.ebics.schema.h003.EbicsResponseDocument newInstance() {
          return (org.kopi.ebics.schema.h003.EbicsResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.kopi.ebics.schema.h003.EbicsResponseDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.kopi.ebics.schema.h003.EbicsResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.kopi.ebics.schema.h003.EbicsResponseDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.kopi.ebics.schema.h003.EbicsResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.kopi.ebics.schema.h003.EbicsResponseDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.kopi.ebics.schema.h003.EbicsResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.kopi.ebics.schema.h003.EbicsResponseDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.kopi.ebics.schema.h003.EbicsResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.kopi.ebics.schema.h003.EbicsResponseDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.kopi.ebics.schema.h003.EbicsResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.kopi.ebics.schema.h003.EbicsResponseDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.kopi.ebics.schema.h003.EbicsResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.kopi.ebics.schema.h003.EbicsResponseDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.kopi.ebics.schema.h003.EbicsResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.kopi.ebics.schema.h003.EbicsResponseDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.kopi.ebics.schema.h003.EbicsResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.kopi.ebics.schema.h003.EbicsResponseDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.kopi.ebics.schema.h003.EbicsResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.kopi.ebics.schema.h003.EbicsResponseDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.kopi.ebics.schema.h003.EbicsResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.kopi.ebics.schema.h003.EbicsResponseDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.kopi.ebics.schema.h003.EbicsResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.kopi.ebics.schema.h003.EbicsResponseDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.kopi.ebics.schema.h003.EbicsResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.kopi.ebics.schema.h003.EbicsResponseDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.kopi.ebics.schema.h003.EbicsResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.kopi.ebics.schema.h003.EbicsResponseDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.kopi.ebics.schema.h003.EbicsResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.kopi.ebics.schema.h003.EbicsResponseDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.kopi.ebics.schema.h003.EbicsResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.kopi.ebics.schema.h003.EbicsResponseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.kopi.ebics.schema.h003.EbicsResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.kopi.ebics.schema.h003.EbicsResponseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.kopi.ebics.schema.h003.EbicsResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
