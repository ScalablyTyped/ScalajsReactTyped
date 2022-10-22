package typingsJapgolly.sharepoint.SP

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FieldUrlValue
  extends StObject
     with ClientValueObject {
  
  def get_description(): String
  
  def get_url(): String
  
  def set_description(value: String): Unit
  
  def set_url(value: String): Unit
}
object FieldUrlValue {
  
  inline def apply(
    customFromJson: Any => Boolean,
    customWriteToXml: (XmlWriter, SerializationContext) => Boolean,
    fromJson: Any => Callback,
    get_description: CallbackTo[String],
    get_typeId: CallbackTo[String],
    get_url: CallbackTo[String],
    set_description: String => Callback,
    set_url: String => Callback,
    writeToXml: (XmlWriter, SerializationContext) => Callback
  ): FieldUrlValue = {
    val __obj = js.Dynamic.literal(customFromJson = js.Any.fromFunction1(customFromJson), customWriteToXml = js.Any.fromFunction2(customWriteToXml), fromJson = js.Any.fromFunction1((t0: Any) => fromJson(t0).runNow()), get_description = get_description.toJsFn, get_typeId = get_typeId.toJsFn, get_url = get_url.toJsFn, set_description = js.Any.fromFunction1((t0: String) => set_description(t0).runNow()), set_url = js.Any.fromFunction1((t0: String) => set_url(t0).runNow()), writeToXml = js.Any.fromFunction2((t0: XmlWriter, t1: SerializationContext) => (writeToXml(t0, t1)).runNow()))
    __obj.asInstanceOf[FieldUrlValue]
  }
  
  extension [Self <: FieldUrlValue](x: Self) {
    
    inline def setGet_description(value: CallbackTo[String]): Self = StObject.set(x, "get_description", value.toJsFn)
    
    inline def setGet_url(value: CallbackTo[String]): Self = StObject.set(x, "get_url", value.toJsFn)
    
    inline def setSet_description(value: String => Callback): Self = StObject.set(x, "set_description", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSet_url(value: String => Callback): Self = StObject.set(x, "set_url", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
  }
}
