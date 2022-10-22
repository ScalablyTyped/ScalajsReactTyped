package typingsJapgolly.jsrsasign.jsrsasign.KJUR.asn1

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * class for ASN.1 DER Sequence
  *
  * @description
  * As for argument 'params' for constructor, you can specify one of
  * following properties:
  *
  * - array - specify array of ASN1Object to set elements of content
  *
  * NOTE: 'params' can be omitted.
  */
trait DERSequence
  extends StObject
     with DERAbstractStructured {
  
  def getFreshValueHex(): String
}
object DERSequence {
  
  inline def apply(
    appendASN1Object: ASN1Object => Callback,
    asn1Array: js.Array[ASN1Object],
    getFreshValueHex: CallbackTo[String],
    setByASN1ObjectArray: js.Array[ASN1Object] => String
  ): DERSequence = {
    val __obj = js.Dynamic.literal(appendASN1Object = js.Any.fromFunction1((t0: ASN1Object) => appendASN1Object(t0).runNow()), asn1Array = asn1Array.asInstanceOf[js.Any], getFreshValueHex = getFreshValueHex.toJsFn, setByASN1ObjectArray = js.Any.fromFunction1(setByASN1ObjectArray))
    __obj.asInstanceOf[DERSequence]
  }
  
  extension [Self <: DERSequence](x: Self) {
    
    inline def setGetFreshValueHex(value: CallbackTo[String]): Self = StObject.set(x, "getFreshValueHex", value.toJsFn)
  }
}
