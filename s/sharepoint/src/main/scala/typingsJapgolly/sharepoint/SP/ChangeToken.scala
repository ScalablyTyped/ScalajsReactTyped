package typingsJapgolly.sharepoint.SP

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChangeToken
  extends StObject
     with ClientValueObject {
  
  def get_stringValue(): String
  
  def set_stringValue(value: String): Unit
}
object ChangeToken {
  
  inline def apply(
    customFromJson: Any => Boolean,
    customWriteToXml: (XmlWriter, SerializationContext) => Boolean,
    fromJson: Any => Callback,
    get_stringValue: CallbackTo[String],
    get_typeId: CallbackTo[String],
    set_stringValue: String => Callback,
    writeToXml: (XmlWriter, SerializationContext) => Callback
  ): ChangeToken = {
    val __obj = js.Dynamic.literal(customFromJson = js.Any.fromFunction1(customFromJson), customWriteToXml = js.Any.fromFunction2(customWriteToXml), fromJson = js.Any.fromFunction1((t0: Any) => fromJson(t0).runNow()), get_stringValue = get_stringValue.toJsFn, get_typeId = get_typeId.toJsFn, set_stringValue = js.Any.fromFunction1((t0: String) => set_stringValue(t0).runNow()), writeToXml = js.Any.fromFunction2((t0: XmlWriter, t1: SerializationContext) => (writeToXml(t0, t1)).runNow()))
    __obj.asInstanceOf[ChangeToken]
  }
  
  extension [Self <: ChangeToken](x: Self) {
    
    inline def setGet_stringValue(value: CallbackTo[String]): Self = StObject.set(x, "get_stringValue", value.toJsFn)
    
    inline def setSet_stringValue(value: String => Callback): Self = StObject.set(x, "set_stringValue", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
  }
}
