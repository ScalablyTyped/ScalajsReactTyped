package typingsJapgolly.sharepoint.SP

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebResponseInfo
  extends StObject
     with ClientValueObject {
  
  def get_body(): String
  
  def get_headers(): Any
  
  def get_statusCode(): Double
  
  def set_body(value: String): Unit
  
  def set_headers(value: Any): Unit
  
  def set_statusCode(value: Double): Unit
}
object WebResponseInfo {
  
  inline def apply(
    customFromJson: Any => Boolean,
    customWriteToXml: (XmlWriter, SerializationContext) => Boolean,
    fromJson: Any => Callback,
    get_body: CallbackTo[String],
    get_headers: CallbackTo[Any],
    get_statusCode: CallbackTo[Double],
    get_typeId: CallbackTo[String],
    set_body: String => Callback,
    set_headers: Any => Callback,
    set_statusCode: Double => Callback,
    writeToXml: (XmlWriter, SerializationContext) => Callback
  ): WebResponseInfo = {
    val __obj = js.Dynamic.literal(customFromJson = js.Any.fromFunction1(customFromJson), customWriteToXml = js.Any.fromFunction2(customWriteToXml), fromJson = js.Any.fromFunction1((t0: Any) => fromJson(t0).runNow()), get_body = get_body.toJsFn, get_headers = get_headers.toJsFn, get_statusCode = get_statusCode.toJsFn, get_typeId = get_typeId.toJsFn, set_body = js.Any.fromFunction1((t0: String) => set_body(t0).runNow()), set_headers = js.Any.fromFunction1((t0: Any) => set_headers(t0).runNow()), set_statusCode = js.Any.fromFunction1((t0: Double) => set_statusCode(t0).runNow()), writeToXml = js.Any.fromFunction2((t0: XmlWriter, t1: SerializationContext) => (writeToXml(t0, t1)).runNow()))
    __obj.asInstanceOf[WebResponseInfo]
  }
  
  extension [Self <: WebResponseInfo](x: Self) {
    
    inline def setGet_body(value: CallbackTo[String]): Self = StObject.set(x, "get_body", value.toJsFn)
    
    inline def setGet_headers(value: CallbackTo[Any]): Self = StObject.set(x, "get_headers", value.toJsFn)
    
    inline def setGet_statusCode(value: CallbackTo[Double]): Self = StObject.set(x, "get_statusCode", value.toJsFn)
    
    inline def setSet_body(value: String => Callback): Self = StObject.set(x, "set_body", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSet_headers(value: Any => Callback): Self = StObject.set(x, "set_headers", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def setSet_statusCode(value: Double => Callback): Self = StObject.set(x, "set_statusCode", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
  }
}
