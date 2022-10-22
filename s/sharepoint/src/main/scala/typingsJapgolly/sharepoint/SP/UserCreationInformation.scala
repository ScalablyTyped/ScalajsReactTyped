package typingsJapgolly.sharepoint.SP

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserCreationInformation
  extends StObject
     with ClientValueObject {
  
  def get_email(): String
  
  def get_loginName(): String
  
  def get_title(): String
  
  def set_email(value: String): Unit
  
  def set_loginName(value: String): Unit
  
  def set_title(value: String): Unit
}
object UserCreationInformation {
  
  inline def apply(
    customFromJson: Any => Boolean,
    customWriteToXml: (XmlWriter, SerializationContext) => Boolean,
    fromJson: Any => Callback,
    get_email: CallbackTo[String],
    get_loginName: CallbackTo[String],
    get_title: CallbackTo[String],
    get_typeId: CallbackTo[String],
    set_email: String => Callback,
    set_loginName: String => Callback,
    set_title: String => Callback,
    writeToXml: (XmlWriter, SerializationContext) => Callback
  ): UserCreationInformation = {
    val __obj = js.Dynamic.literal(customFromJson = js.Any.fromFunction1(customFromJson), customWriteToXml = js.Any.fromFunction2(customWriteToXml), fromJson = js.Any.fromFunction1((t0: Any) => fromJson(t0).runNow()), get_email = get_email.toJsFn, get_loginName = get_loginName.toJsFn, get_title = get_title.toJsFn, get_typeId = get_typeId.toJsFn, set_email = js.Any.fromFunction1((t0: String) => set_email(t0).runNow()), set_loginName = js.Any.fromFunction1((t0: String) => set_loginName(t0).runNow()), set_title = js.Any.fromFunction1((t0: String) => set_title(t0).runNow()), writeToXml = js.Any.fromFunction2((t0: XmlWriter, t1: SerializationContext) => (writeToXml(t0, t1)).runNow()))
    __obj.asInstanceOf[UserCreationInformation]
  }
  
  extension [Self <: UserCreationInformation](x: Self) {
    
    inline def setGet_email(value: CallbackTo[String]): Self = StObject.set(x, "get_email", value.toJsFn)
    
    inline def setGet_loginName(value: CallbackTo[String]): Self = StObject.set(x, "get_loginName", value.toJsFn)
    
    inline def setGet_title(value: CallbackTo[String]): Self = StObject.set(x, "get_title", value.toJsFn)
    
    inline def setSet_email(value: String => Callback): Self = StObject.set(x, "set_email", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSet_loginName(value: String => Callback): Self = StObject.set(x, "set_loginName", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSet_title(value: String => Callback): Self = StObject.set(x, "set_title", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
  }
}
