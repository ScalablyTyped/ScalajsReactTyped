package typingsJapgolly.jsrsasign.jsrsasign.KJUR.asn1

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.jsrsasign.jsrsasign.BigInteger
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * class for ASN.1 DER Enumerated
  * @description
  * As for argument 'params' for constructor, you can specify one of
  * following properties:
  *
  * - int - specify initial ASN.1 value(V) by integer value
  * - hex - specify initial ASN.1 value(V) by a hexadecimal string
  *
  * NOTE: 'params' can be omitted.
  * @example
  * new KJUR.asn1.DEREnumerated(123);
  * new KJUR.asn1.DEREnumerated({int: 123});
  * new KJUR.asn1.DEREnumerated({hex: '1fad'});
  */
trait DEREnumerated
  extends StObject
     with ASN1Object {
  
  /**
    * set value by Tom Wu's BigInteger object
    * @param bigIntegerValue value to set
    */
  def setByBigInteger(bigIntegerValue: BigInteger): Unit
  
  /**
    * set value by integer value
    * @param intValue integer value to set
    */
  def setByInteger(intValue: Double): Unit
  
  /**
    * set value by integer value
    * @param newHexString hexadecimal string of integer value
    * @description
    * NOTE: Value shall be represented by minimum octet length of
    * two's complement representation.
    */
  def setValueHex(newHexString: String): Unit
}
object DEREnumerated {
  
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
    setByBigInteger: BigInteger => Callback,
    setByInteger: Double => Callback,
    setValueHex: String => Callback
  ): DEREnumerated = {
    val __obj = js.Dynamic.literal(getEncodedHex = getEncodedHex.toJsFn, getFreshValueHex = getFreshValueHex.toJsFn, getLengthHexFromValue = getLengthHexFromValue.toJsFn, getValueHex = getValueHex.toJsFn, hL = hL.asInstanceOf[js.Any], hT = hT.asInstanceOf[js.Any], hTLV = hTLV.asInstanceOf[js.Any], hV = hV.asInstanceOf[js.Any], isModified = isModified.asInstanceOf[js.Any], setByBigInteger = js.Any.fromFunction1((t0: BigInteger) => setByBigInteger(t0).runNow()), setByInteger = js.Any.fromFunction1((t0: Double) => setByInteger(t0).runNow()), setValueHex = js.Any.fromFunction1((t0: String) => setValueHex(t0).runNow()), params = null)
    __obj.asInstanceOf[DEREnumerated]
  }
  
  extension [Self <: DEREnumerated](x: Self) {
    
    inline def setSetByBigInteger(value: BigInteger => Callback): Self = StObject.set(x, "setByBigInteger", js.Any.fromFunction1((t0: BigInteger) => value(t0).runNow()))
    
    inline def setSetByInteger(value: Double => Callback): Self = StObject.set(x, "setByInteger", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSetValueHex(value: String => Callback): Self = StObject.set(x, "setValueHex", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
  }
}
