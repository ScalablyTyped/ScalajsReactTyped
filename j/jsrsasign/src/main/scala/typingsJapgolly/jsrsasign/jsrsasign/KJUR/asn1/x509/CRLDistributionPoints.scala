package typingsJapgolly.jsrsasign.jsrsasign.KJUR.asn1.x509

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.jsrsasign.jsrsasign.KJUR.asn1.ASN1Object
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * CRLDistributionPoints ASN.1 structure class
  * @param params associative array of parameters (ex. {'uri': 'http://a.com/', 'critical': true})
  * @description
  * ```
  * id-ce-cRLDistributionPoints OBJECT IDENTIFIER ::=  { id-ce 31 }
  *
  * CRLDistributionPoints ::= SEQUENCE SIZE (1..MAX) OF DistributionPoint
  *
  * DistributionPoint ::= SEQUENCE {
  *      distributionPoint       [0]     DistributionPointName OPTIONAL,
  *      reasons                 [1]     ReasonFlags OPTIONAL,
  *      cRLIssuer               [2]     GeneralNames OPTIONAL }
  *
  * DistributionPointName ::= CHOICE {
  *      fullName                [0]     GeneralNames,
  *      nameRelativeToCRLIssuer [1]     RelativeDistinguishedName }
  *
  * ReasonFlags ::= BIT STRING {
  *      unused                  (0),
  *      keyCompromise           (1),
  *      cACompromise            (2),
  *      affiliationChanged      (3),
  *      superseded              (4),
  *      cessationOfOperation    (5),
  *      certificateHold         (6),
  *      privilegeWithdrawn      (7),
  *      aACompromise            (8) }
  * ```
  */
trait CRLDistributionPoints
  extends StObject
     with Extension {
  
  def getExtnValueHex(): String
  
  def setByDPArray(dpArray: js.Array[ASN1Object]): Unit
  
  def setByOneURI(uri: String): Unit
}
object CRLDistributionPoints {
  
  inline def apply(
    getEncodedHex: CallbackTo[String],
    getExtnValueHex: CallbackTo[String],
    getFreshValueHex: CallbackTo[String],
    getLengthHexFromValue: CallbackTo[String],
    getValueHex: CallbackTo[String],
    hL: String,
    hT: String,
    hTLV: String,
    hV: String,
    isModified: String,
    setByDPArray: js.Array[ASN1Object] => Callback,
    setByOneURI: String => Callback
  ): CRLDistributionPoints = {
    val __obj = js.Dynamic.literal(getEncodedHex = getEncodedHex.toJsFn, getExtnValueHex = getExtnValueHex.toJsFn, getFreshValueHex = getFreshValueHex.toJsFn, getLengthHexFromValue = getLengthHexFromValue.toJsFn, getValueHex = getValueHex.toJsFn, hL = hL.asInstanceOf[js.Any], hT = hT.asInstanceOf[js.Any], hTLV = hTLV.asInstanceOf[js.Any], hV = hV.asInstanceOf[js.Any], isModified = isModified.asInstanceOf[js.Any], setByDPArray = js.Any.fromFunction1((t0: js.Array[ASN1Object]) => setByDPArray(t0).runNow()), setByOneURI = js.Any.fromFunction1((t0: String) => setByOneURI(t0).runNow()), params = null)
    __obj.asInstanceOf[CRLDistributionPoints]
  }
  
  extension [Self <: CRLDistributionPoints](x: Self) {
    
    inline def setGetExtnValueHex(value: CallbackTo[String]): Self = StObject.set(x, "getExtnValueHex", value.toJsFn)
    
    inline def setSetByDPArray(value: js.Array[ASN1Object] => Callback): Self = StObject.set(x, "setByDPArray", js.Any.fromFunction1((t0: js.Array[ASN1Object]) => value(t0).runNow()))
    
    inline def setSetByOneURI(value: String => Callback): Self = StObject.set(x, "setByOneURI", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
  }
}
