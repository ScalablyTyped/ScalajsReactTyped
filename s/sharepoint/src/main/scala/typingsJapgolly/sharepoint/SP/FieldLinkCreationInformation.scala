package typingsJapgolly.sharepoint.SP

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FieldLinkCreationInformation
  extends StObject
     with ClientValueObject {
  
  def get_field(): Field
  
  def set_field(value: Field): Unit
}
object FieldLinkCreationInformation {
  
  inline def apply(
    customFromJson: Any => Boolean,
    customWriteToXml: (XmlWriter, SerializationContext) => Boolean,
    fromJson: Any => Callback,
    get_field: CallbackTo[Field],
    get_typeId: CallbackTo[String],
    set_field: Field => Callback,
    writeToXml: (XmlWriter, SerializationContext) => Callback
  ): FieldLinkCreationInformation = {
    val __obj = js.Dynamic.literal(customFromJson = js.Any.fromFunction1(customFromJson), customWriteToXml = js.Any.fromFunction2(customWriteToXml), fromJson = js.Any.fromFunction1((t0: Any) => fromJson(t0).runNow()), get_field = get_field.toJsFn, get_typeId = get_typeId.toJsFn, set_field = js.Any.fromFunction1((t0: Field) => set_field(t0).runNow()), writeToXml = js.Any.fromFunction2((t0: XmlWriter, t1: SerializationContext) => (writeToXml(t0, t1)).runNow()))
    __obj.asInstanceOf[FieldLinkCreationInformation]
  }
  
  extension [Self <: FieldLinkCreationInformation](x: Self) {
    
    inline def setGet_field(value: CallbackTo[Field]): Self = StObject.set(x, "get_field", value.toJsFn)
    
    inline def setSet_field(value: Field => Callback): Self = StObject.set(x, "set_field", js.Any.fromFunction1((t0: Field) => value(t0).runNow()))
  }
}
