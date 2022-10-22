package typingsJapgolly.sharepoint.SP

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListDataValidationFailure
  extends StObject
     with ClientValueObject {
  
  def get_displayName(): String
  
  def get_message(): String
  
  def get_name(): String
  
  def get_reason(): ListDataValidationFailureReason
  
  def get_validationType(): ListDataValidationType
}
object ListDataValidationFailure {
  
  inline def apply(
    customFromJson: Any => Boolean,
    customWriteToXml: (XmlWriter, SerializationContext) => Boolean,
    fromJson: Any => Callback,
    get_displayName: CallbackTo[String],
    get_message: CallbackTo[String],
    get_name: CallbackTo[String],
    get_reason: CallbackTo[ListDataValidationFailureReason],
    get_typeId: CallbackTo[String],
    get_validationType: CallbackTo[ListDataValidationType],
    writeToXml: (XmlWriter, SerializationContext) => Callback
  ): ListDataValidationFailure = {
    val __obj = js.Dynamic.literal(customFromJson = js.Any.fromFunction1(customFromJson), customWriteToXml = js.Any.fromFunction2(customWriteToXml), fromJson = js.Any.fromFunction1((t0: Any) => fromJson(t0).runNow()), get_displayName = get_displayName.toJsFn, get_message = get_message.toJsFn, get_name = get_name.toJsFn, get_reason = get_reason.toJsFn, get_typeId = get_typeId.toJsFn, get_validationType = get_validationType.toJsFn, writeToXml = js.Any.fromFunction2((t0: XmlWriter, t1: SerializationContext) => (writeToXml(t0, t1)).runNow()))
    __obj.asInstanceOf[ListDataValidationFailure]
  }
  
  extension [Self <: ListDataValidationFailure](x: Self) {
    
    inline def setGet_displayName(value: CallbackTo[String]): Self = StObject.set(x, "get_displayName", value.toJsFn)
    
    inline def setGet_message(value: CallbackTo[String]): Self = StObject.set(x, "get_message", value.toJsFn)
    
    inline def setGet_name(value: CallbackTo[String]): Self = StObject.set(x, "get_name", value.toJsFn)
    
    inline def setGet_reason(value: CallbackTo[ListDataValidationFailureReason]): Self = StObject.set(x, "get_reason", value.toJsFn)
    
    inline def setGet_validationType(value: CallbackTo[ListDataValidationType]): Self = StObject.set(x, "get_validationType", value.toJsFn)
  }
}
