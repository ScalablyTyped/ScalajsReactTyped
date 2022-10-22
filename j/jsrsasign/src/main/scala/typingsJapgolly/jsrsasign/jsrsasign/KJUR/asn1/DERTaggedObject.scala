package typingsJapgolly.jsrsasign.jsrsasign.KJUR.asn1

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * class for ASN.1 DER TaggedObject
  *
  * @description
  * Parameter 'tagNoNex' is ASN.1 tag(T) value for this object.
  * For example, if you find '[1]' tag in a ASN.1 dump,
  * 'tagNoHex' will be 'a1'.
  *
  * As for optional argument 'params' for constructor, you can specify *ANY* of
  * following properties:
  *
  * - explicit - specify true if this is explicit tag otherwise false
  *   (default is 'true').
  * - tag - specify tag (default is 'a0' which means [0])
  * - obj - specify ASN1Object which is tagged
  *
  * @example
  * d1 = new KJUR.asn1.DERUTF8String({'str':'a'});
  * d2 = new KJUR.asn1.DERTaggedObject({'obj': d1});
  * hex = d2.getEncodedHex();
  */
trait DERTaggedObject
  extends StObject
     with ASN1Object {
  
  /**
    * set value by an ASN1Object
    * @param isExplicitFlag flag for explicit/implicit tag
    * @param tagNoHex hexadecimal string of ASN.1 tag
    * @param asn1Object ASN.1 to encapsulate
    */
  def setASN1Object(isExplicitFlag: Boolean, tagNoHex: String, asn1Object: ASN1Object): Unit
}
object DERTaggedObject {
  
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
    setASN1Object: (Boolean, String, ASN1Object) => Callback
  ): DERTaggedObject = {
    val __obj = js.Dynamic.literal(getEncodedHex = getEncodedHex.toJsFn, getFreshValueHex = getFreshValueHex.toJsFn, getLengthHexFromValue = getLengthHexFromValue.toJsFn, getValueHex = getValueHex.toJsFn, hL = hL.asInstanceOf[js.Any], hT = hT.asInstanceOf[js.Any], hTLV = hTLV.asInstanceOf[js.Any], hV = hV.asInstanceOf[js.Any], isModified = isModified.asInstanceOf[js.Any], setASN1Object = js.Any.fromFunction3((t0: Boolean, t1: String, t2: ASN1Object) => (setASN1Object(t0, t1, t2)).runNow()), params = null)
    __obj.asInstanceOf[DERTaggedObject]
  }
  
  extension [Self <: DERTaggedObject](x: Self) {
    
    inline def setSetASN1Object(value: (Boolean, String, ASN1Object) => Callback): Self = StObject.set(x, "setASN1Object", js.Any.fromFunction3((t0: Boolean, t1: String, t2: ASN1Object) => (value(t0, t1, t2)).runNow()))
  }
}
