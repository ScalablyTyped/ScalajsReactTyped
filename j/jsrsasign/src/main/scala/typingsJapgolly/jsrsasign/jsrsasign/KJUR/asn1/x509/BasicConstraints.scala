package typingsJapgolly.jsrsasign.jsrsasign.KJUR.asn1.x509

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * BasicConstraints ASN.1 structure class
  * @param params associative array of parameters (ex. {'cA': true, 'critical': true})
  */
trait BasicConstraints
  extends StObject
     with Extension {
  
  def getExtnValueHex(): String
}
object BasicConstraints {
  
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
    isModified: String
  ): BasicConstraints = {
    val __obj = js.Dynamic.literal(getEncodedHex = getEncodedHex.toJsFn, getExtnValueHex = getExtnValueHex.toJsFn, getFreshValueHex = getFreshValueHex.toJsFn, getLengthHexFromValue = getLengthHexFromValue.toJsFn, getValueHex = getValueHex.toJsFn, hL = hL.asInstanceOf[js.Any], hT = hT.asInstanceOf[js.Any], hTLV = hTLV.asInstanceOf[js.Any], hV = hV.asInstanceOf[js.Any], isModified = isModified.asInstanceOf[js.Any], params = null)
    __obj.asInstanceOf[BasicConstraints]
  }
  
  extension [Self <: BasicConstraints](x: Self) {
    
    inline def setGetExtnValueHex(value: CallbackTo[String]): Self = StObject.set(x, "getExtnValueHex", value.toJsFn)
  }
}
