package typingsJapgolly.sharepoint.SP

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListDataValidationExceptionValue
  extends StObject
     with ClientValueObject {
  
  def get_fieldFailures(): js.Array[ListDataValidationFailure]
  
  def get_itemFailure(): ListDataValidationFailure
}
object ListDataValidationExceptionValue {
  
  inline def apply(
    customFromJson: Any => Boolean,
    customWriteToXml: (XmlWriter, SerializationContext) => Boolean,
    fromJson: Any => Callback,
    get_fieldFailures: CallbackTo[js.Array[ListDataValidationFailure]],
    get_itemFailure: CallbackTo[ListDataValidationFailure],
    get_typeId: CallbackTo[String],
    writeToXml: (XmlWriter, SerializationContext) => Callback
  ): ListDataValidationExceptionValue = {
    val __obj = js.Dynamic.literal(customFromJson = js.Any.fromFunction1(customFromJson), customWriteToXml = js.Any.fromFunction2(customWriteToXml), fromJson = js.Any.fromFunction1((t0: Any) => fromJson(t0).runNow()), get_fieldFailures = get_fieldFailures.toJsFn, get_itemFailure = get_itemFailure.toJsFn, get_typeId = get_typeId.toJsFn, writeToXml = js.Any.fromFunction2((t0: XmlWriter, t1: SerializationContext) => (writeToXml(t0, t1)).runNow()))
    __obj.asInstanceOf[ListDataValidationExceptionValue]
  }
  
  extension [Self <: ListDataValidationExceptionValue](x: Self) {
    
    inline def setGet_fieldFailures(value: CallbackTo[js.Array[ListDataValidationFailure]]): Self = StObject.set(x, "get_fieldFailures", value.toJsFn)
    
    inline def setGet_itemFailure(value: CallbackTo[ListDataValidationFailure]): Self = StObject.set(x, "get_itemFailure", value.toJsFn)
  }
}
