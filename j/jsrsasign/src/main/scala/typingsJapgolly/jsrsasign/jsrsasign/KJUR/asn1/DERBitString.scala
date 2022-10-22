package typingsJapgolly.jsrsasign.jsrsasign.KJUR.asn1

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * class for ASN.1 DER encoded BitString primitive
  * @description
  * As for argument 'params' for constructor, you can specify one of
  * following properties:
  *
  * - bin - specify binary string (ex. '10111')
  * - array - specify array of boolean (ex. [true,false,true,true])
  * - hex - specify hexadecimal string of ASN.1 value(V) including unused bits
  * - obj - specify `KJUR.asn1.ASN1Util.newObject`
  *   argument for "BitString encapsulates" structure.
  *
  * NOTE1: 'params' can be omitted.
  * NOTE2: 'obj' parameter have been supported since
  * asn1 1.0.11, jsrsasign 6.1.1 (2016-Sep-25).
  *
  * @example
  * // default constructor
  * o = new KJUR.asn1.DERBitString();
  * // initialize with binary string
  * o = new KJUR.asn1.DERBitString({bin: "1011"});
  * // initialize with boolean array
  * o = new KJUR.asn1.DERBitString({array: [true,false,true,true]});
  * // initialize with hexadecimal string (04 is unused bits)
  * o = new KJUR.asn1.DEROctetString({hex: "04bac0"});
  * // initialize with ASN1Util.newObject argument for encapsulated
  * o = new KJUR.asn1.DERBitString({obj: {seq: [{int: 3}, {prnstr: 'aaa'}]}});
  * // above generates a ASN.1 data like this:
  * // BIT STRING, encapsulates {
  * //   SEQUENCE {
  * //     INTEGER 3
  * //     PrintableString 'aaa'
  * //     }
  * //   }
  */
trait DERBitString
  extends StObject
     with ASN1Object {
  
  /**
    * set ASN.1 DER BitString by binary string
    * @param binaryString binary value string (i.e. '10111')
    * @description
    * Its unused bits will be calculated automatically by length of
    * 'binaryValue'.
    *
    * NOTE: Trailing zeros '0' will be ignored.
    * @example
    * o = new KJUR.asn1.DERBitString();
    * o.setByBooleanArray("01011");
    */
  def setByBinaryString(binaryString: String): Unit
  
  /**
    * set ASN.1 TLV value(V) by an array of boolean
    * @param booleanArray array of boolean (ex. [true, false, true])
    * @description
    * NOTE: Trailing falses will be ignored in the ASN.1 DER Object.
    * @example
    * o = new KJUR.asn1.DERBitString();
    * o.setByBooleanArray([false, true, false, true, true]);
    */
  def setByBooleanArray(booleanArray: js.Array[Boolean]): Unit
  
  /**
    * set ASN.1 value(V) by a hexadecimal string including unused bits
    */
  def setHexValueIncludingUnusedBits(newHexStringIncludingUnusedBits: String): Unit
  
  /**
    * set ASN.1 value(V) by unused bit and hexadecimal string of value
    */
  def setUnusedBitsAndHexValue(unusedBits: Double, hValue: String): Unit
}
object DERBitString {
  
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
    setByBinaryString: String => Callback,
    setByBooleanArray: js.Array[Boolean] => Callback,
    setHexValueIncludingUnusedBits: String => Callback,
    setUnusedBitsAndHexValue: (Double, String) => Callback
  ): DERBitString = {
    val __obj = js.Dynamic.literal(getEncodedHex = getEncodedHex.toJsFn, getFreshValueHex = getFreshValueHex.toJsFn, getLengthHexFromValue = getLengthHexFromValue.toJsFn, getValueHex = getValueHex.toJsFn, hL = hL.asInstanceOf[js.Any], hT = hT.asInstanceOf[js.Any], hTLV = hTLV.asInstanceOf[js.Any], hV = hV.asInstanceOf[js.Any], isModified = isModified.asInstanceOf[js.Any], setByBinaryString = js.Any.fromFunction1((t0: String) => setByBinaryString(t0).runNow()), setByBooleanArray = js.Any.fromFunction1((t0: js.Array[Boolean]) => setByBooleanArray(t0).runNow()), setHexValueIncludingUnusedBits = js.Any.fromFunction1((t0: String) => setHexValueIncludingUnusedBits(t0).runNow()), setUnusedBitsAndHexValue = js.Any.fromFunction2((t0: Double, t1: String) => (setUnusedBitsAndHexValue(t0, t1)).runNow()), params = null)
    __obj.asInstanceOf[DERBitString]
  }
  
  extension [Self <: DERBitString](x: Self) {
    
    inline def setSetByBinaryString(value: String => Callback): Self = StObject.set(x, "setByBinaryString", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSetByBooleanArray(value: js.Array[Boolean] => Callback): Self = StObject.set(x, "setByBooleanArray", js.Any.fromFunction1((t0: js.Array[Boolean]) => value(t0).runNow()))
    
    inline def setSetHexValueIncludingUnusedBits(value: String => Callback): Self = StObject.set(x, "setHexValueIncludingUnusedBits", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSetUnusedBitsAndHexValue(value: (Double, String) => Callback): Self = StObject.set(x, "setUnusedBitsAndHexValue", js.Any.fromFunction2((t0: Double, t1: String) => (value(t0, t1)).runNow()))
  }
}
