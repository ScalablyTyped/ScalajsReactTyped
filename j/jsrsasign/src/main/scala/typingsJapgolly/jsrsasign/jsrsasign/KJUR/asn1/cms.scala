package typingsJapgolly.jsrsasign.jsrsasign.KJUR.asn1

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.jsrsasign.anon.E
import typingsJapgolly.jsrsasign.anon.EciObj
import typingsJapgolly.jsrsasign.jsrsasign.KJUR.crypto.DSA
import typingsJapgolly.jsrsasign.jsrsasign.KJUR.crypto.ECDSA
import typingsJapgolly.jsrsasign.jsrsasign.KJUR.jws.JWS.JsonWebKey
import typingsJapgolly.jsrsasign.jsrsasign.RSAKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * kjur's ASN.1 class for Cryptographic Message Syntax(CMS)
  *
  * This name space provides
  * [RFC 5652 Cryptographic Message Syntax (CMS)](https://tools.ietf.org/html/rfc5652) SignedData generator.
  *
  * __FEATURES__
  *
  * - easily generate CMS SignedData
  * - easily verify CMS SignedData
  * - APIs are very similar to BouncyCastle library ASN.1 classes. So easy to learn.
  *
  *
  * __PROVIDED CLASSES__
  *
  * - `KJUR.asn1.cms.SignedData`
  * - `KJUR.asn1.cms.SignerInfo`
  * - `KJUR.asn1.cms.AttributeList`
  * - `KJUR.asn1.cms.ContentInfo`
  * - `KJUR.asn1.cms.EncapsulatedContentInfo`
  * - `KJUR.asn1.cms.IssuerAndSerialNumber`
  * - `KJUR.asn1.cms.CMSUtil`
  * - `KJUR.asn1.cms.Attribute`
  * - `KJUR.asn1.cms.ContentType`
  * - `KJUR.asn1.cms.MessageDigest`
  * - `KJUR.asn1.cms.SigningTime`
  * - `KJUR.asn1.cms.SigningCertificate`
  * - `KJUR.asn1.cms.SigningCertificateV2`
  */
object cms {
  
  /**
    * Attribute class for base of CMS attribute
    * @param params associative array of parameters
    * @description
    * ```
    * Attributes ::= SET OF Attribute
    * Attribute ::= SEQUENCE {
    *    type               OBJECT IDENTIFIER,
    *    values             AttributeSetValue }
    * AttributeSetValue ::= SET OF ANY
    * ```
    */
  trait Attribute
    extends StObject
       with ASN1Object
  object Attribute {
    
    inline def apply(
      getEncodedHex: CallbackTo[String],
      getFreshValueHex: CallbackTo[String],
      getLengthHexFromValue: CallbackTo[String],
      getValueHex: CallbackTo[String],
      hL: String,
      hT: String,
      hTLV: String,
      hV: String,
      isModified: String
    ): Attribute = {
      val __obj = js.Dynamic.literal(getEncodedHex = getEncodedHex.toJsFn, getFreshValueHex = getFreshValueHex.toJsFn, getLengthHexFromValue = getLengthHexFromValue.toJsFn, getValueHex = getValueHex.toJsFn, hL = hL.asInstanceOf[js.Any], hT = hT.asInstanceOf[js.Any], hTLV = hTLV.asInstanceOf[js.Any], hV = hV.asInstanceOf[js.Any], isModified = isModified.asInstanceOf[js.Any], params = null)
      __obj.asInstanceOf[Attribute]
    }
  }
  
  /**
    * class for Attributes ASN.1 structure for CMS
    * @param params associative array of parameters
    * @description
    * ```
    * Attributes ::= SET OF Attribute
    * Attribute ::= SEQUENCE {
    *    type               OBJECT IDENTIFIER,
    *    values             AttributeSetValue }
    * ```
    * @example
    * // specify by X500Name and DERInteger
    * o = new KJUR.asn1.cms.AttributeList({sorted: false}); // ASN.1 BER unsorted SET OF
    * o = new KJUR.asn1.cms.AttributeList();  // ASN.1 DER sorted by default
    * o.clear();                              // clear list of Attributes
    * n = o.length();                         // get number of Attribute
    * o.add(new KJUR.asn1.cms.SigningTime()); // add SigningTime attribute
    * hex = o.getEncodedHex();                // get hex encoded ASN.1 data
    */
  trait AttributeList
    extends StObject
       with ASN1Object {
    
    def add(item: Attribute): Unit
    
    def clear(): Unit
    
    def length(): Double
  }
  object AttributeList {
    
    inline def apply(
      add: Attribute => Callback,
      clear: Callback,
      getEncodedHex: CallbackTo[String],
      getFreshValueHex: CallbackTo[String],
      getLengthHexFromValue: CallbackTo[String],
      getValueHex: CallbackTo[String],
      hL: String,
      hT: String,
      hTLV: String,
      hV: String,
      isModified: String,
      length: CallbackTo[Double]
    ): AttributeList = {
      val __obj = js.Dynamic.literal(add = js.Any.fromFunction1((t0: Attribute) => add(t0).runNow()), clear = clear.toJsFn, getEncodedHex = getEncodedHex.toJsFn, getFreshValueHex = getFreshValueHex.toJsFn, getLengthHexFromValue = getLengthHexFromValue.toJsFn, getValueHex = getValueHex.toJsFn, hL = hL.asInstanceOf[js.Any], hT = hT.asInstanceOf[js.Any], hTLV = hTLV.asInstanceOf[js.Any], hV = hV.asInstanceOf[js.Any], isModified = isModified.asInstanceOf[js.Any], length = length.toJsFn, params = null)
      __obj.asInstanceOf[AttributeList]
    }
    
    extension [Self <: AttributeList](x: Self) {
      
      inline def setAdd(value: Attribute => Callback): Self = StObject.set(x, "add", js.Any.fromFunction1((t0: Attribute) => value(t0).runNow()))
      
      inline def setClear(value: Callback): Self = StObject.set(x, "clear", value.toJsFn)
      
      inline def setLength(value: CallbackTo[Double]): Self = StObject.set(x, "length", value.toJsFn)
    }
  }
  
  /**
    * class for ContentInfo ASN.1 structure for CMS
    * @param params associative array of parameters
    * @description
    * ```
    * ContentInfo ::= SEQUENCE {
    *    contentType ContentType,
    *    content [0] EXPLICIT ANY DEFINED BY contentType }
    * ContentType ::= OBJECT IDENTIFIER
    * ```
    * @example
    * a = [new KJUR.asn1.DERInteger({int: 1}),
    *      new KJUR.asn1.DERInteger({int: 2})];
    * seq = new KJUR.asn1.DERSequence({array: a});
    * o = new KJUR.asn1.cms.ContentInfo({type: 'data', obj: seq});
    */
  trait ContentInfo
    extends StObject
       with ASN1Object {
    
    def setContentType(params: String): Unit
  }
  object ContentInfo {
    
    inline def apply(
      getEncodedHex: CallbackTo[String],
      getFreshValueHex: CallbackTo[String],
      getLengthHexFromValue: CallbackTo[String],
      getValueHex: CallbackTo[String],
      hL: String,
      hT: String,
      hTLV: String,
      hV: String,
      isModified: String,
      setContentType: String => Callback
    ): ContentInfo = {
      val __obj = js.Dynamic.literal(getEncodedHex = getEncodedHex.toJsFn, getFreshValueHex = getFreshValueHex.toJsFn, getLengthHexFromValue = getLengthHexFromValue.toJsFn, getValueHex = getValueHex.toJsFn, hL = hL.asInstanceOf[js.Any], hT = hT.asInstanceOf[js.Any], hTLV = hTLV.asInstanceOf[js.Any], hV = hV.asInstanceOf[js.Any], isModified = isModified.asInstanceOf[js.Any], setContentType = js.Any.fromFunction1((t0: String) => setContentType(t0).runNow()), params = null)
      __obj.asInstanceOf[ContentInfo]
    }
    
    extension [Self <: ContentInfo](x: Self) {
      
      inline def setSetContentType(value: String => Callback): Self = StObject.set(x, "setContentType", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    }
  }
  
  /**
    * class for CMS ContentType attribute
    * @param params associative array of parameters
    * @description
    * ```
    * Attribute ::= SEQUENCE {
    *    type               OBJECT IDENTIFIER,
    *    values             AttributeSetValue }
    * AttributeSetValue ::= SET OF ANY
    * ContentType ::= OBJECT IDENTIFIER
    * ```
    * @example
    * o = new KJUR.asn1.cms.ContentType({name: 'data'});
    * o = new KJUR.asn1.cms.ContentType({oid: '1.2.840.113549.1.9.16.1.4'});
    */
  type ContentType = Attribute
  
  /**
    * class for EncapsulatedContentInfo ASN.1 structure for CMS
    * @param params associative array of parameters
    * @description
    * ```
    * EncapsulatedContentInfo ::= SEQUENCE {
    *    eContentType ContentType,
    *    eContent [0] EXPLICIT OCTET STRING OPTIONAL }
    * ContentType ::= OBJECT IDENTIFIER
    * ```
    * @example
    * o = new KJUR.asn1.cms.EncapsulatedContentInfo();
    * o.setContentType('1.2.3.4.5');     // specify eContentType by OID
    * o.setContentType('data');          // specify eContentType by name
    * o.setContentValueHex('a1a2a4...'); // specify eContent data by hex string
    * o.setContentValueStr('apple');     // specify eContent data by UTF-8 string
    * // for detached contents (i.e. data not concluded in eContent)
    * o.isDetached = true;               // false as default
    */
  @js.native
  trait EncapsulatedContentInfo
    extends StObject
       with ASN1Object {
    
    def setContentType(nameOrOid: String): Unit = js.native
    
    def setContentValue(params: HexParam): Unit = js.native
    def setContentValue(params: StringParam): Unit = js.native
    
    def setContentValueHex(valueHex: String): Unit = js.native
    
    def setContentValueStr(valueStr: String): Unit = js.native
  }
  
  /**
    * class for IssuerAndSerialNumber ASN.1 structure for CMS
    * @param params associative array of parameters
    * @description
    * ```
    * IssuerAndSerialNumber ::= SEQUENCE {
    *    issuer Name,
    *    serialNumber CertificateSerialNumber }
    * CertificateSerialNumber ::= INTEGER
    * ```
    * @example
    * // specify by X500Name and DERInteger
    * o = new KJUR.asn1.cms.IssuerAndSerialNumber(
    *      {issuer: {str: '/C=US/O=T1'}, serial {int: 3}});
    * // specify by PEM certificate
    * o = new KJUR.asn1.cms.IssuerAndSerialNumber({cert: certPEM});
    * o = new KJUR.asn1.cms.IssuerAndSerialNumber(certPEM); // since 1.0.3
    */
  trait IssuerAndSerialNumber
    extends StObject
       with ASN1Object {
    
    def setByCertPEM(certPEM: String): Unit
  }
  object IssuerAndSerialNumber {
    
    inline def apply(
      getEncodedHex: CallbackTo[String],
      getFreshValueHex: CallbackTo[String],
      getLengthHexFromValue: CallbackTo[String],
      getValueHex: CallbackTo[String],
      hL: String,
      hT: String,
      hTLV: String,
      hV: String,
      isModified: String,
      setByCertPEM: String => Callback
    ): IssuerAndSerialNumber = {
      val __obj = js.Dynamic.literal(getEncodedHex = getEncodedHex.toJsFn, getFreshValueHex = getFreshValueHex.toJsFn, getLengthHexFromValue = getLengthHexFromValue.toJsFn, getValueHex = getValueHex.toJsFn, hL = hL.asInstanceOf[js.Any], hT = hT.asInstanceOf[js.Any], hTLV = hTLV.asInstanceOf[js.Any], hV = hV.asInstanceOf[js.Any], isModified = isModified.asInstanceOf[js.Any], setByCertPEM = js.Any.fromFunction1((t0: String) => setByCertPEM(t0).runNow()), params = null)
      __obj.asInstanceOf[IssuerAndSerialNumber]
    }
    
    extension [Self <: IssuerAndSerialNumber](x: Self) {
      
      inline def setSetByCertPEM(value: String => Callback): Self = StObject.set(x, "setByCertPEM", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    }
  }
  
  /**
    * class for CMS MessageDigest attribute
    * @param params associative array of parameters
    * @description
    * ```
    * Attribute ::= SEQUENCE {
    *    type               OBJECT IDENTIFIER,
    *    values             AttributeSetValue }
    * AttributeSetValue ::= SET OF ANY
    * MessageDigest ::= OCTET STRING
    * ```
    * @example
    * o = new KJUR.asn1.cms.MessageDigest({hex: 'a1a2a3a4...'});
    */
  type MessageDigest = Attribute
  
  /**
    * class for SignerInfo ASN.1 structure of CMS SignedData
    * @param params associative array of parameters
    * @description
    * ```
    * SignedData ::= SEQUENCE {
    *    version CMSVersion,
    *    digestAlgorithms DigestAlgorithmIdentifiers,
    *    encapContentInfo EncapsulatedContentInfo,
    *    certificates [0] IMPLICIT CertificateSet OPTIONAL,
    *    crls [1] IMPLICIT RevocationInfoChoices OPTIONAL,
    *    signerInfos SignerInfos }
    * SignerInfos ::= SET OF SignerInfo
    * CertificateSet ::= SET OF CertificateChoices
    * DigestAlgorithmIdentifiers ::= SET OF DigestAlgorithmIdentifier
    * CertificateSet ::= SET OF CertificateChoices
    * RevocationInfoChoices ::= SET OF RevocationInfoChoice
    * ```
    *
    * @example
    * sd = new KJUR.asn1.cms.SignedData();
    * sd.dEncapContentInfo.setContentValueStr("test string");
    * sd.signerInfoList[0].setForContentAndHash({sdObj: sd,
    *                                            eciObj: sd.dEncapContentInfo,
    *                                            hashAlg: 'sha256'});
    * sd.signerInfoList[0].dSignedAttrs.add(new KJUR.asn1.cms.SigningTime());
    * sd.signerInfoList[0].setSignerIdentifier(certPEM);
    * sd.signerInfoList[0].sign(prvP8PEM, "SHA256withRSA");
    * hex = sd.getContentInfoEncodedHex();
    */
  trait SignedData
    extends StObject
       with ASN1Object {
    
    def addCertificatesByPEM(certPEM: String): Unit
    
    def getContentInfo(): ContentInfo
    
    def getContentInfoEncodedHex(): String
    
    def getPEM(): String
    
    var signerInfoList: js.Array[SignerInfo]
  }
  object SignedData {
    
    inline def apply(
      addCertificatesByPEM: String => Callback,
      getContentInfo: CallbackTo[ContentInfo],
      getContentInfoEncodedHex: CallbackTo[String],
      getEncodedHex: CallbackTo[String],
      getFreshValueHex: CallbackTo[String],
      getLengthHexFromValue: CallbackTo[String],
      getPEM: CallbackTo[String],
      getValueHex: CallbackTo[String],
      hL: String,
      hT: String,
      hTLV: String,
      hV: String,
      isModified: String,
      signerInfoList: js.Array[SignerInfo]
    ): SignedData = {
      val __obj = js.Dynamic.literal(addCertificatesByPEM = js.Any.fromFunction1((t0: String) => addCertificatesByPEM(t0).runNow()), getContentInfo = getContentInfo.toJsFn, getContentInfoEncodedHex = getContentInfoEncodedHex.toJsFn, getEncodedHex = getEncodedHex.toJsFn, getFreshValueHex = getFreshValueHex.toJsFn, getLengthHexFromValue = getLengthHexFromValue.toJsFn, getPEM = getPEM.toJsFn, getValueHex = getValueHex.toJsFn, hL = hL.asInstanceOf[js.Any], hT = hT.asInstanceOf[js.Any], hTLV = hTLV.asInstanceOf[js.Any], hV = hV.asInstanceOf[js.Any], isModified = isModified.asInstanceOf[js.Any], signerInfoList = signerInfoList.asInstanceOf[js.Any], params = null)
      __obj.asInstanceOf[SignedData]
    }
    
    extension [Self <: SignedData](x: Self) {
      
      inline def setAddCertificatesByPEM(value: String => Callback): Self = StObject.set(x, "addCertificatesByPEM", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setGetContentInfo(value: CallbackTo[ContentInfo]): Self = StObject.set(x, "getContentInfo", value.toJsFn)
      
      inline def setGetContentInfoEncodedHex(value: CallbackTo[String]): Self = StObject.set(x, "getContentInfoEncodedHex", value.toJsFn)
      
      inline def setGetPEM(value: CallbackTo[String]): Self = StObject.set(x, "getPEM", value.toJsFn)
      
      inline def setSignerInfoList(value: js.Array[SignerInfo]): Self = StObject.set(x, "signerInfoList", value.asInstanceOf[js.Any])
      
      inline def setSignerInfoListVarargs(value: SignerInfo*): Self = StObject.set(x, "signerInfoList", js.Array(value*))
    }
  }
  
  /**
    * class for SignerInfo ASN.1 structure of CMS SignedData
    * @param params associative array of parameters
    * @description
    * ```
    * SignerInfo ::= SEQUENCE {
    *    version CMSVersion,
    *    sid SignerIdentifier,
    *    digestAlgorithm DigestAlgorithmIdentifier,
    *    signedAttrs [0] IMPLICIT SignedAttributes OPTIONAL,
    *    signatureAlgorithm SignatureAlgorithmIdentifier,
    *    signature SignatureValue,
    *    unsignedAttrs [1] IMPLICIT UnsignedAttributes OPTIONAL }
    * ```
    * @example
    * o = new KJUR.asn1.cms.SignerInfo();
    * o.setSignerIdentifier(certPEMstring);
    * o.dSignedAttrs.add(new KJUR.asn1.cms.ContentType({name: 'data'}));
    * o.dSignedAttrs.add(new KJUR.asn1.cms.MessageDigest({hex: 'a1b2...'}));
    * o.dSignedAttrs.add(new KJUR.asn1.cms.SigningTime());
    * o.sign(privteKeyParam, "SHA1withRSA");
    */
  @js.native
  trait SignerInfo
    extends StObject
       with ASN1Object {
    
    def addUnsigned(attr: Attribute): Unit = js.native
    
    /**
      * set ContentType/MessageDigest/DigestAlgorithms for SignerInfo/SignedData
      * @param params JSON parameter to set content related field
      * @description
      * This method will specify following fields by a parameters:
      *
      * - add ContentType signed attribute by encapContentInfo
      * - add MessageDigest signed attribute by encapContentInfo and hashAlg
      * - add a hash algorithm used in MessageDigest to digestAlgorithms field of SignedData
      * - set a hash algorithm used in MessageDigest to digestAlgorithm field of SignerInfo
      *
      * Argument 'params' is an associative array having following elements:
      *
      * - eciObj - `KJUR.asn1.cms.EncapsulatedContentInfo` object
      * - sdObj - `KJUR.asn1.cms.SignedData` object (Option) to set DigestAlgorithms
      * - hashAlg - string of hash algorithm name which is used for MessageDigest attribute
      *
      * some of elements can be omited.
      * @example
      * sd = new KJUR.asn1.cms.SignedData();
      * signerInfo.setForContentAndHash({sdObj: sd,
      *                                  eciObj: sd.dEncapContentInfo,
      *                                  hashAlg: 'sha256'});
      */
    def setForContentAndHash(params: EciObj): Unit = js.native
    
    def setSignerIdentifier(params: String): Unit = js.native
    
    def sign(keyParam: String, sigAlg: String): Unit = js.native
    def sign(keyParam: E, sigAlg: String): Unit = js.native
    def sign(keyParam: DSA, sigAlg: String): Unit = js.native
    def sign(keyParam: ECDSA, sigAlg: String): Unit = js.native
    def sign(keyParam: JsonWebKey, sigAlg: String): Unit = js.native
    def sign(keyParam: RSAKey, sigAlg: String): Unit = js.native
  }
  
  /**
    * class for CMS SigningCertificate attribute
    * @param params associative array of parameters
    * @description
    * ```
    * Attribute ::= SEQUENCE {
    *    type               OBJECT IDENTIFIER,
    *    values             AttributeSetValue }
    * AttributeSetValue ::= SET OF ANY
    * SigningCertificate ::= SEQUENCE {
    *    certs SEQUENCE OF ESSCertID,
    *    policies SEQUENCE OF PolicyInformation OPTIONAL }
    * ESSCertID ::= SEQUENCE {
    *    certHash Hash,
    *    issuerSerial IssuerSerial OPTIONAL }
    * IssuerSerial ::= SEQUENCE {
    *    issuer GeneralNames,
    *    serialNumber CertificateSerialNumber }
    * ```
    * @example
    * o = new KJUR.asn1.cms.SigningCertificate({array: [certPEM]});
    */
  trait SigningCertificate
    extends StObject
       with Attribute {
    
    def setCerts(listPEM: js.Array[String]): Unit
  }
  object SigningCertificate {
    
    inline def apply(
      getEncodedHex: CallbackTo[String],
      getFreshValueHex: CallbackTo[String],
      getLengthHexFromValue: CallbackTo[String],
      getValueHex: CallbackTo[String],
      hL: String,
      hT: String,
      hTLV: String,
      hV: String,
      isModified: String,
      setCerts: js.Array[String] => Callback
    ): SigningCertificate = {
      val __obj = js.Dynamic.literal(getEncodedHex = getEncodedHex.toJsFn, getFreshValueHex = getFreshValueHex.toJsFn, getLengthHexFromValue = getLengthHexFromValue.toJsFn, getValueHex = getValueHex.toJsFn, hL = hL.asInstanceOf[js.Any], hT = hT.asInstanceOf[js.Any], hTLV = hTLV.asInstanceOf[js.Any], hV = hV.asInstanceOf[js.Any], isModified = isModified.asInstanceOf[js.Any], setCerts = js.Any.fromFunction1((t0: js.Array[String]) => setCerts(t0).runNow()), params = null)
      __obj.asInstanceOf[SigningCertificate]
    }
    
    extension [Self <: SigningCertificate](x: Self) {
      
      inline def setSetCerts(value: js.Array[String] => Callback): Self = StObject.set(x, "setCerts", js.Any.fromFunction1((t0: js.Array[String]) => value(t0).runNow()))
    }
  }
  
  /**
    * class for CMS SigningCertificateV2 attribute
    * @param params associative array of parameters
    * @description
    * ```
    * oid-signingCertificateV2 = 1.2.840.113549.1.9.16.2.47
    * Attribute ::= SEQUENCE {
    *    type               OBJECT IDENTIFIER,
    *    values             AttributeSetValue }
    * AttributeSetValue ::= SET OF ANY
    * SigningCertificateV2 ::=  SEQUENCE {
    *    certs        SEQUENCE OF ESSCertIDv2,
    *    policies     SEQUENCE OF PolicyInformation OPTIONAL }
    * ESSCertIDv2 ::=  SEQUENCE {
    *    hashAlgorithm           AlgorithmIdentifier
    *                            DEFAULT {algorithm id-sha256},
    *    certHash                Hash,
    *    issuerSerial            IssuerSerial OPTIONAL }
    * Hash ::= OCTET STRING
    * IssuerSerial ::= SEQUENCE {
    *    issuer                  GeneralNames,
    *    serialNumber            CertificateSerialNumber }
    * ```
    * @example
    * // hash algorithm is sha256 by default:
    * o = new KJUR.asn1.cms.SigningCertificateV2({array: [certPEM]});
    * o = new KJUR.asn1.cms.SigningCertificateV2({array: [certPEM],
    *                                             hashAlg: 'sha512'});
    */
  trait SigningCertificateV2
    extends StObject
       with Attribute {
    
    def setCerts(listPEM: js.Array[String], hashAlg: String): Unit
  }
  object SigningCertificateV2 {
    
    inline def apply(
      getEncodedHex: CallbackTo[String],
      getFreshValueHex: CallbackTo[String],
      getLengthHexFromValue: CallbackTo[String],
      getValueHex: CallbackTo[String],
      hL: String,
      hT: String,
      hTLV: String,
      hV: String,
      isModified: String,
      setCerts: (js.Array[String], String) => Callback
    ): SigningCertificateV2 = {
      val __obj = js.Dynamic.literal(getEncodedHex = getEncodedHex.toJsFn, getFreshValueHex = getFreshValueHex.toJsFn, getLengthHexFromValue = getLengthHexFromValue.toJsFn, getValueHex = getValueHex.toJsFn, hL = hL.asInstanceOf[js.Any], hT = hT.asInstanceOf[js.Any], hTLV = hTLV.asInstanceOf[js.Any], hV = hV.asInstanceOf[js.Any], isModified = isModified.asInstanceOf[js.Any], setCerts = js.Any.fromFunction2((t0: js.Array[String], t1: String) => (setCerts(t0, t1)).runNow()), params = null)
      __obj.asInstanceOf[SigningCertificateV2]
    }
    
    extension [Self <: SigningCertificateV2](x: Self) {
      
      inline def setSetCerts(value: (js.Array[String], String) => Callback): Self = StObject.set(x, "setCerts", js.Any.fromFunction2((t0: js.Array[String], t1: String) => (value(t0, t1)).runNow()))
    }
  }
  
  /**
    * class for CMS SigningTime attribute
    * @param params associative array of parameters
    * @description
    * ```
    * Attribute ::= SEQUENCE {
    *    type               OBJECT IDENTIFIER,
    *    values             AttributeSetValue }
    * AttributeSetValue ::= SET OF ANY
    * SigningTime  ::= Time
    * Time ::= CHOICE {
    *    utcTime UTCTime,
    *    generalTime GeneralizedTime }
    * ```
    * @example
    * o = new KJUR.asn1.cms.SigningTime(); // current time UTCTime by default
    * o = new KJUR.asn1.cms.SigningTime({type: 'gen'}); // current time GeneralizedTime
    * o = new KJUR.asn1.cms.SigningTime({str: '20140517093800Z'}); // specified GeneralizedTime
    * o = new KJUR.asn1.cms.SigningTime({str: '140517093800Z'}); // specified UTCTime
    */
  type SigningTime = Attribute
}
