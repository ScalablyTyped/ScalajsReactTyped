package typingsJapgolly.jsrsasign.jsrsasign.KJUR.asn1.x509

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.jsrsasign.jsrsasign.KJUR.asn1.ASN1Object
import typingsJapgolly.jsrsasign.jsrsasign.KJUR.asn1.IntegerParam
import typingsJapgolly.jsrsasign.jsrsasign.KJUR.asn1.StringParam
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * ASN.1 CRLEntry structure class for CRL
  * @param params associative array of parameters (ex. {})
  * @example
  * var e = new KJUR.asn1.x509.CRLEntry({'time': {'str': '130514235959Z'}, 'sn': {'int': 234}});
  *
  * // revokedCertificates     SEQUENCE OF SEQUENCE  {
  * //     userCertificate         CertificateSerialNumber,
  * //     revocationDate          Time,
  * //     crlEntryExtensions      Extensions OPTIONAL
  * //                             -- if present, version MUST be v2 }
  */
trait CRLEntry
  extends StObject
     with ASN1Object {
  
  /**
    * set DERInteger parameter for serial number of revoked certificate
    * @param intParam DERInteger parameter for certificate serial number
    * @example
    * entry.setCertSerial({'int': 3});
    */
  def setCertSerial(intParam: IntegerParam): Unit
  
  /**
    * set Time parameter for revocation date
    * @param timeParam Time parameter for revocation date
    * @example
    * entry.setRevocationDate({'str': '130508235959Z'});
    */
  def setRevocationDate(timeParam: StringParam): Unit
}
object CRLEntry {
  
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
    setCertSerial: IntegerParam => Callback,
    setRevocationDate: StringParam => Callback
  ): CRLEntry = {
    val __obj = js.Dynamic.literal(getEncodedHex = getEncodedHex.toJsFn, getFreshValueHex = getFreshValueHex.toJsFn, getLengthHexFromValue = getLengthHexFromValue.toJsFn, getValueHex = getValueHex.toJsFn, hL = hL.asInstanceOf[js.Any], hT = hT.asInstanceOf[js.Any], hTLV = hTLV.asInstanceOf[js.Any], hV = hV.asInstanceOf[js.Any], isModified = isModified.asInstanceOf[js.Any], setCertSerial = js.Any.fromFunction1((t0: IntegerParam) => setCertSerial(t0).runNow()), setRevocationDate = js.Any.fromFunction1((t0: StringParam) => setRevocationDate(t0).runNow()), params = null)
    __obj.asInstanceOf[CRLEntry]
  }
  
  extension [Self <: CRLEntry](x: Self) {
    
    inline def setSetCertSerial(value: IntegerParam => Callback): Self = StObject.set(x, "setCertSerial", js.Any.fromFunction1((t0: IntegerParam) => value(t0).runNow()))
    
    inline def setSetRevocationDate(value: StringParam => Callback): Self = StObject.set(x, "setRevocationDate", js.Any.fromFunction1((t0: StringParam) => value(t0).runNow()))
  }
}
