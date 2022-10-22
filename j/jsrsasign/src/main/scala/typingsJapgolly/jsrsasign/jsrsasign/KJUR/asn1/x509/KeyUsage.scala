package typingsJapgolly.jsrsasign.jsrsasign.KJUR.asn1.x509

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.jsrsasign.jsrsasign.KJUR.asn1.HexParam
import typingsJapgolly.jsrsasign.jsrsasign.KJUR.asn1.NameParam
import typingsJapgolly.jsrsasign.jsrsasign.KJUR.asn1.ObjectIdentifierParam
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * KeyUsage ASN.1 structure class
  * @param params associative array of parameters (ex. {'bin': '11', 'critical': true})
  */
trait KeyUsage
  extends StObject
     with Extension {
  
  def getExtnValueHex(): String
  
  def setPurposeArray(purposeArray: js.Array[ObjectIdentifierParam | HexParam | NameParam]): Unit
}
object KeyUsage {
  
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
    setPurposeArray: js.Array[ObjectIdentifierParam | HexParam | NameParam] => Callback
  ): KeyUsage = {
    val __obj = js.Dynamic.literal(getEncodedHex = getEncodedHex.toJsFn, getExtnValueHex = getExtnValueHex.toJsFn, getFreshValueHex = getFreshValueHex.toJsFn, getLengthHexFromValue = getLengthHexFromValue.toJsFn, getValueHex = getValueHex.toJsFn, hL = hL.asInstanceOf[js.Any], hT = hT.asInstanceOf[js.Any], hTLV = hTLV.asInstanceOf[js.Any], hV = hV.asInstanceOf[js.Any], isModified = isModified.asInstanceOf[js.Any], setPurposeArray = js.Any.fromFunction1((t0: js.Array[ObjectIdentifierParam | HexParam | NameParam]) => setPurposeArray(t0).runNow()), params = null)
    __obj.asInstanceOf[KeyUsage]
  }
  
  extension [Self <: KeyUsage](x: Self) {
    
    inline def setGetExtnValueHex(value: CallbackTo[String]): Self = StObject.set(x, "getExtnValueHex", value.toJsFn)
    
    inline def setSetPurposeArray(value: js.Array[ObjectIdentifierParam | HexParam | NameParam] => Callback): Self = StObject.set(x, "setPurposeArray", js.Any.fromFunction1((t0: js.Array[ObjectIdentifierParam | HexParam | NameParam]) => value(t0).runNow()))
  }
}
