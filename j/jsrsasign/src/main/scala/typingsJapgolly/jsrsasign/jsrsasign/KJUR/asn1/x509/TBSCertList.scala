package typingsJapgolly.jsrsasign.jsrsasign.KJUR.asn1.x509

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.jsrsasign.jsrsasign.KJUR.asn1.ASN1Object
import typingsJapgolly.jsrsasign.jsrsasign.KJUR.asn1.IntegerParam
import typingsJapgolly.jsrsasign.jsrsasign.KJUR.asn1.NameParam
import typingsJapgolly.jsrsasign.jsrsasign.KJUR.asn1.StringParam
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * ASN.1 TBSCertList structure class for CRL
  * @param params associative array of parameters (ex. {})
  * @example
  *  var o = new KJUR.asn1.x509.TBSCertList();
  *  o.setSignatureAlgByParam({'name': 'SHA1withRSA'});
  *  o.setIssuerByParam({'str': '/C=US/O=a'});
  *  o.setNotThisUpdateByParam({'str': '130504235959Z'});
  *  o.setNotNextUpdateByParam({'str': '140504235959Z'});
  *  o.addRevokedCert({'int': 4}, {'str':'130514235959Z'}));
  *  o.addRevokedCert({'hex': '0f34dd'}, {'str':'130514235959Z'}));
  *
  * // TBSCertList  ::=  SEQUENCE  {
  * //        version                 Version OPTIONAL,
  * //                                     -- if present, MUST be v2
  * //        signature               AlgorithmIdentifier,
  * //        issuer                  Name,
  * //        thisUpdate              Time,
  * //        nextUpdate              Time OPTIONAL,
  * //        revokedCertificates     SEQUENCE OF SEQUENCE  {
  * //             userCertificate         CertificateSerialNumber,
  * //             revocationDate          Time,
  * //             crlEntryExtensions      Extensions OPTIONAL
  * //                                      -- if present, version MUST be v2
  * //                                  }  OPTIONAL,
  * //        crlExtensions           [0]  EXPLICIT Extensions OPTIONAL
  */
trait TBSCertList
  extends StObject
     with ASN1Object {
  
  /**
    * add revoked certificate by parameter
    * @param snParam DERInteger parameter for certificate serial number
    * @param timeParam Time parameter for revocation date
    * @example
    * tbsc.addRevokedCert({'int': 3}, {'str': '130508235959Z'});
    * @see KJUR.asn1.x509.Time
    */
  def addRevokedCert(snParam: IntegerParam, timeParam: StringParam): Unit
  
  /**
    * set issuer name field by parameter
    * @param x500NameParam X500Name parameter
    * @example
    * tbsc.setIssuerParam({'str': '/C=US/CN=b'});
    * @see KJUR.asn1.x509.X500Name
    */
  def setIssuerByParam(x500NameParam: StringParam): Unit
  
  /**
    * set nextUpdate field by parameter
    * @param timeParam Time parameter
    * @example
    * tbsc.setNextUpdateByParam({'str': '130508235959Z'});
    * @see KJUR.asn1.x509.Time
    */
  def setNextUpdateByParam(timeParam: StringParam): Unit
  
  /**
    * set signature algorithm field by parameter
    * @param algIdParam AlgorithmIdentifier parameter
    * @example
    * tbsc.setSignatureAlgByParam({'name': 'SHA1withRSA'});
    */
  def setSignatureAlgByParam(algIdParam: NameParam): Unit
  
  /**
    * set thisUpdate field by parameter
    * @param timeParam Time parameter
    * @example
    * tbsc.setThisUpdateByParam({'str': '130508235959Z'});
    * @see KJUR.asn1.x509.Time
    */
  def setThisUpdateByParam(timeParam: StringParam): Unit
}
object TBSCertList {
  
  inline def apply(
    addRevokedCert: (IntegerParam, StringParam) => Callback,
    getEncodedHex: CallbackTo[String],
    getFreshValueHex: CallbackTo[String],
    getLengthHexFromValue: CallbackTo[String],
    getValueHex: CallbackTo[String],
    hL: String,
    hT: String,
    hTLV: String,
    hV: String,
    isModified: String,
    setIssuerByParam: StringParam => Callback,
    setNextUpdateByParam: StringParam => Callback,
    setSignatureAlgByParam: NameParam => Callback,
    setThisUpdateByParam: StringParam => Callback
  ): TBSCertList = {
    val __obj = js.Dynamic.literal(addRevokedCert = js.Any.fromFunction2((t0: IntegerParam, t1: StringParam) => (addRevokedCert(t0, t1)).runNow()), getEncodedHex = getEncodedHex.toJsFn, getFreshValueHex = getFreshValueHex.toJsFn, getLengthHexFromValue = getLengthHexFromValue.toJsFn, getValueHex = getValueHex.toJsFn, hL = hL.asInstanceOf[js.Any], hT = hT.asInstanceOf[js.Any], hTLV = hTLV.asInstanceOf[js.Any], hV = hV.asInstanceOf[js.Any], isModified = isModified.asInstanceOf[js.Any], setIssuerByParam = js.Any.fromFunction1((t0: StringParam) => setIssuerByParam(t0).runNow()), setNextUpdateByParam = js.Any.fromFunction1((t0: StringParam) => setNextUpdateByParam(t0).runNow()), setSignatureAlgByParam = js.Any.fromFunction1((t0: NameParam) => setSignatureAlgByParam(t0).runNow()), setThisUpdateByParam = js.Any.fromFunction1((t0: StringParam) => setThisUpdateByParam(t0).runNow()), params = null)
    __obj.asInstanceOf[TBSCertList]
  }
  
  extension [Self <: TBSCertList](x: Self) {
    
    inline def setAddRevokedCert(value: (IntegerParam, StringParam) => Callback): Self = StObject.set(x, "addRevokedCert", js.Any.fromFunction2((t0: IntegerParam, t1: StringParam) => (value(t0, t1)).runNow()))
    
    inline def setSetIssuerByParam(value: StringParam => Callback): Self = StObject.set(x, "setIssuerByParam", js.Any.fromFunction1((t0: StringParam) => value(t0).runNow()))
    
    inline def setSetNextUpdateByParam(value: StringParam => Callback): Self = StObject.set(x, "setNextUpdateByParam", js.Any.fromFunction1((t0: StringParam) => value(t0).runNow()))
    
    inline def setSetSignatureAlgByParam(value: NameParam => Callback): Self = StObject.set(x, "setSignatureAlgByParam", js.Any.fromFunction1((t0: NameParam) => value(t0).runNow()))
    
    inline def setSetThisUpdateByParam(value: StringParam => Callback): Self = StObject.set(x, "setThisUpdateByParam", js.Any.fromFunction1((t0: StringParam) => value(t0).runNow()))
  }
}
