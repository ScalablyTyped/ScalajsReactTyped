package typingsJapgolly.jsrsasign.jsrsasign.KJUR.asn1.x509

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.jsrsasign.jsrsasign.CertificateTBSParams
import typingsJapgolly.jsrsasign.jsrsasign.KJUR.asn1.ASN1Object
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * ASN.1 TBSCertificate structure class<br/>
  * @param params JSON object of TBSCertificate parameters
  *
  * @description
  * <br/>
  * NOTE: TBSCertificate class is updated without backward
  * compatibility from jsrsasign 9.0.0 asn1x509 2.0.0.
  * Most of methods are removed and parameters can be set
  * by JSON object.
  *
  * @example
  * new TBSCertificate({
  *  version: 3, // this can be omitted, the default is 3.
  *  serial: {hex: "1234..."}, // DERInteger parameter
  *  sigalg: "SHA256withRSA",
  *  issuer: {array:[[{type:'O',value:'Test',ds:'prn'}]]}, // X500Name parameter
  *  notbefore: "151231235959Z", // string, passed to Time
  *  notafter: "251231235959Z", // string, passed to Time
  *  subject: {array:[[{type:'O',value:'Test',ds:'prn'}]]}, // X500Name parameter
  *  sbjpubkey: "-----BEGIN...", // KEYUTIL.getKey pubkey parameter
  *  // As for extension parameters, please see extension class
  *  // All extension parameters need to have "extname" parameter additionaly.
  *  ext:[{
  *   extname:"keyUsage",critical:true,
  *   names:["digitalSignature","keyEncipherment"]
  *  },{
  *   extname:"cRLDistributionPoints",
  *   array:[{dpname:{full:[{uri:"http://example.com/a1.crl"}]}}]
  *  }, ...]
  * })
  *
  * var tbsc = new TBSCertificate();
  * tbsc.setByParam({version:3,serial:{hex:'1234...'},...});
  */
trait TBSCertificate
  extends StObject
     with ASN1Object {
  
  /**
    * get array of ASN.1 object for extensions<br/>
    * @param params JSON object of TBSCertificate parameters
    * @example
    * tbsc = new KJUR.asn1.x509.TBSCertificate();
    * tbsc.setByParam({version:3, serial:{hex:'1234...'},...});
    */
  def setByParam(params: CertificateTBSParams): Unit
}
object TBSCertificate {
  
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
    setByParam: CertificateTBSParams => Callback
  ): TBSCertificate = {
    val __obj = js.Dynamic.literal(getEncodedHex = getEncodedHex.toJsFn, getFreshValueHex = getFreshValueHex.toJsFn, getLengthHexFromValue = getLengthHexFromValue.toJsFn, getValueHex = getValueHex.toJsFn, hL = hL.asInstanceOf[js.Any], hT = hT.asInstanceOf[js.Any], hTLV = hTLV.asInstanceOf[js.Any], hV = hV.asInstanceOf[js.Any], isModified = isModified.asInstanceOf[js.Any], setByParam = js.Any.fromFunction1((t0: CertificateTBSParams) => setByParam(t0).runNow()), params = null)
    __obj.asInstanceOf[TBSCertificate]
  }
  
  extension [Self <: TBSCertificate](x: Self) {
    
    inline def setSetByParam(value: CertificateTBSParams => Callback): Self = StObject.set(x, "setByParam", js.Any.fromFunction1((t0: CertificateTBSParams) => value(t0).runNow()))
  }
}
