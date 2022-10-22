package typingsJapgolly.jsrsasign.jsrsasign.KJUR.asn1

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.jsrsasign.anon.Tlv
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** base class for ASN.1 DER encoder object */
trait ASN1Object extends StObject {
  
  /**
    * get hexadecimal string of ASN.1 TLV bytes
    * @return hexadecimal string of ASN.1 TLV
    */
  def getEncodedHex(): String
  
  def getFreshValueHex(): String
  
  /**
    * get hexadecimal ASN.1 TLV length(L) bytes from TLV value(V)
    * @return hexadecimal string of ASN.1 TLV length(L)
    */
  def getLengthHexFromValue(): String
  
  /**
    * get hexadecimal string of ASN.1 TLV value(V) bytes
    * @return hexadecimal string of ASN.1 TLV value(V) bytes
    */
  def getValueHex(): String
  
  /** hexadecimal string of ASN.1 TLV length(L) */
  var hL: String
  
  /** hexadecimal string of ASN.1 TLV tag(T) */
  var hT: String
  
  /** hexadecimal string of ASN.1 TLV */
  var hTLV: String
  
  /** hexadecimal string of ASN.1 TLV value(V) */
  var hV: String
  
  /** flag whether internal data was changed */
  var isModified: String
  
  /** JSON object parameter for ASN.1 encode */
  var params: Tlv | Null
}
object ASN1Object {
  
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
  ): ASN1Object = {
    val __obj = js.Dynamic.literal(getEncodedHex = getEncodedHex.toJsFn, getFreshValueHex = getFreshValueHex.toJsFn, getLengthHexFromValue = getLengthHexFromValue.toJsFn, getValueHex = getValueHex.toJsFn, hL = hL.asInstanceOf[js.Any], hT = hT.asInstanceOf[js.Any], hTLV = hTLV.asInstanceOf[js.Any], hV = hV.asInstanceOf[js.Any], isModified = isModified.asInstanceOf[js.Any], params = null)
    __obj.asInstanceOf[ASN1Object]
  }
  
  extension [Self <: ASN1Object](x: Self) {
    
    inline def setGetEncodedHex(value: CallbackTo[String]): Self = StObject.set(x, "getEncodedHex", value.toJsFn)
    
    inline def setGetFreshValueHex(value: CallbackTo[String]): Self = StObject.set(x, "getFreshValueHex", value.toJsFn)
    
    inline def setGetLengthHexFromValue(value: CallbackTo[String]): Self = StObject.set(x, "getLengthHexFromValue", value.toJsFn)
    
    inline def setGetValueHex(value: CallbackTo[String]): Self = StObject.set(x, "getValueHex", value.toJsFn)
    
    inline def setHL(value: String): Self = StObject.set(x, "hL", value.asInstanceOf[js.Any])
    
    inline def setHT(value: String): Self = StObject.set(x, "hT", value.asInstanceOf[js.Any])
    
    inline def setHTLV(value: String): Self = StObject.set(x, "hTLV", value.asInstanceOf[js.Any])
    
    inline def setHV(value: String): Self = StObject.set(x, "hV", value.asInstanceOf[js.Any])
    
    inline def setIsModified(value: String): Self = StObject.set(x, "isModified", value.asInstanceOf[js.Any])
    
    inline def setParams(value: Tlv): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    inline def setParamsNull: Self = StObject.set(x, "params", null)
  }
}
