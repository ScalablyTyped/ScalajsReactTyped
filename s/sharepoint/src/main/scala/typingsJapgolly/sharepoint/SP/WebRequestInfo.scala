package typingsJapgolly.sharepoint.SP

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebRequestInfo
  extends StObject
     with ClientValueObject {
  
  def get_body(): String
  
  def get_headers(): Any
  
  def get_method(): String
  
  def get_url(): String
  
  def set_body(value: String): Unit
  
  def set_headers(value: Any): Unit
  
  def set_method(value: String): Unit
  
  def set_url(value: String): Unit
}
object WebRequestInfo {
  
  inline def apply(
    customFromJson: Any => Boolean,
    customWriteToXml: (XmlWriter, SerializationContext) => Boolean,
    fromJson: Any => Callback,
    get_body: CallbackTo[String],
    get_headers: CallbackTo[Any],
    get_method: CallbackTo[String],
    get_typeId: CallbackTo[String],
    get_url: CallbackTo[String],
    set_body: String => Callback,
    set_headers: Any => Callback,
    set_method: String => Callback,
    set_url: String => Callback,
    writeToXml: (XmlWriter, SerializationContext) => Callback
  ): WebRequestInfo = {
    val __obj = js.Dynamic.literal(customFromJson = js.Any.fromFunction1(customFromJson), customWriteToXml = js.Any.fromFunction2(customWriteToXml), fromJson = js.Any.fromFunction1((t0: Any) => fromJson(t0).runNow()), get_body = get_body.toJsFn, get_headers = get_headers.toJsFn, get_method = get_method.toJsFn, get_typeId = get_typeId.toJsFn, get_url = get_url.toJsFn, set_body = js.Any.fromFunction1((t0: String) => set_body(t0).runNow()), set_headers = js.Any.fromFunction1((t0: Any) => set_headers(t0).runNow()), set_method = js.Any.fromFunction1((t0: String) => set_method(t0).runNow()), set_url = js.Any.fromFunction1((t0: String) => set_url(t0).runNow()), writeToXml = js.Any.fromFunction2((t0: XmlWriter, t1: SerializationContext) => (writeToXml(t0, t1)).runNow()))
    __obj.asInstanceOf[WebRequestInfo]
  }
  
  extension [Self <: WebRequestInfo](x: Self) {
    
    inline def setGet_body(value: CallbackTo[String]): Self = StObject.set(x, "get_body", value.toJsFn)
    
    inline def setGet_headers(value: CallbackTo[Any]): Self = StObject.set(x, "get_headers", value.toJsFn)
    
    inline def setGet_method(value: CallbackTo[String]): Self = StObject.set(x, "get_method", value.toJsFn)
    
    inline def setGet_url(value: CallbackTo[String]): Self = StObject.set(x, "get_url", value.toJsFn)
    
    inline def setSet_body(value: String => Callback): Self = StObject.set(x, "set_body", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSet_headers(value: Any => Callback): Self = StObject.set(x, "set_headers", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def setSet_method(value: String => Callback): Self = StObject.set(x, "set_method", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSet_url(value: String => Callback): Self = StObject.set(x, "set_url", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
  }
}
