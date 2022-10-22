package typingsJapgolly.sharepoint.SP.Utilities

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.sharepoint.SP.ClientValueObject
import typingsJapgolly.sharepoint.SP.SerializationContext
import typingsJapgolly.sharepoint.SP.XmlWriter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EmailProperties
  extends StObject
     with ClientValueObject {
  
  def get_additionalHeaders(): Any
  
  def get_bCC(): js.Array[String]
  
  def get_body(): String
  
  def get_cC(): js.Array[String]
  
  def get_from(): String
  
  def get_subject(): String
  
  def get_to(): js.Array[String]
  
  def set_additionalHeaders(value: Any): Unit
  
  def set_bCC(value: js.Array[String]): Unit
  
  def set_body(value: String): Unit
  
  def set_cC(value: js.Array[String]): Unit
  
  def set_from(value: String): Unit
  
  def set_subject(value: String): Unit
  
  def set_to(value: js.Array[String]): Unit
}
object EmailProperties {
  
  inline def apply(
    customFromJson: Any => Boolean,
    customWriteToXml: (XmlWriter, SerializationContext) => Boolean,
    fromJson: Any => Callback,
    get_additionalHeaders: CallbackTo[Any],
    get_bCC: CallbackTo[js.Array[String]],
    get_body: CallbackTo[String],
    get_cC: CallbackTo[js.Array[String]],
    get_from: CallbackTo[String],
    get_subject: CallbackTo[String],
    get_to: CallbackTo[js.Array[String]],
    get_typeId: CallbackTo[String],
    set_additionalHeaders: Any => Callback,
    set_bCC: js.Array[String] => Callback,
    set_body: String => Callback,
    set_cC: js.Array[String] => Callback,
    set_from: String => Callback,
    set_subject: String => Callback,
    set_to: js.Array[String] => Callback,
    writeToXml: (XmlWriter, SerializationContext) => Callback
  ): EmailProperties = {
    val __obj = js.Dynamic.literal(customFromJson = js.Any.fromFunction1(customFromJson), customWriteToXml = js.Any.fromFunction2(customWriteToXml), fromJson = js.Any.fromFunction1((t0: Any) => fromJson(t0).runNow()), get_additionalHeaders = get_additionalHeaders.toJsFn, get_bCC = get_bCC.toJsFn, get_body = get_body.toJsFn, get_cC = get_cC.toJsFn, get_from = get_from.toJsFn, get_subject = get_subject.toJsFn, get_to = get_to.toJsFn, get_typeId = get_typeId.toJsFn, set_additionalHeaders = js.Any.fromFunction1((t0: Any) => set_additionalHeaders(t0).runNow()), set_bCC = js.Any.fromFunction1((t0: js.Array[String]) => set_bCC(t0).runNow()), set_body = js.Any.fromFunction1((t0: String) => set_body(t0).runNow()), set_cC = js.Any.fromFunction1((t0: js.Array[String]) => set_cC(t0).runNow()), set_from = js.Any.fromFunction1((t0: String) => set_from(t0).runNow()), set_subject = js.Any.fromFunction1((t0: String) => set_subject(t0).runNow()), set_to = js.Any.fromFunction1((t0: js.Array[String]) => set_to(t0).runNow()), writeToXml = js.Any.fromFunction2((t0: XmlWriter, t1: SerializationContext) => (writeToXml(t0, t1)).runNow()))
    __obj.asInstanceOf[EmailProperties]
  }
  
  extension [Self <: EmailProperties](x: Self) {
    
    inline def setGet_additionalHeaders(value: CallbackTo[Any]): Self = StObject.set(x, "get_additionalHeaders", value.toJsFn)
    
    inline def setGet_bCC(value: CallbackTo[js.Array[String]]): Self = StObject.set(x, "get_bCC", value.toJsFn)
    
    inline def setGet_body(value: CallbackTo[String]): Self = StObject.set(x, "get_body", value.toJsFn)
    
    inline def setGet_cC(value: CallbackTo[js.Array[String]]): Self = StObject.set(x, "get_cC", value.toJsFn)
    
    inline def setGet_from(value: CallbackTo[String]): Self = StObject.set(x, "get_from", value.toJsFn)
    
    inline def setGet_subject(value: CallbackTo[String]): Self = StObject.set(x, "get_subject", value.toJsFn)
    
    inline def setGet_to(value: CallbackTo[js.Array[String]]): Self = StObject.set(x, "get_to", value.toJsFn)
    
    inline def setSet_additionalHeaders(value: Any => Callback): Self = StObject.set(x, "set_additionalHeaders", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def setSet_bCC(value: js.Array[String] => Callback): Self = StObject.set(x, "set_bCC", js.Any.fromFunction1((t0: js.Array[String]) => value(t0).runNow()))
    
    inline def setSet_body(value: String => Callback): Self = StObject.set(x, "set_body", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSet_cC(value: js.Array[String] => Callback): Self = StObject.set(x, "set_cC", js.Any.fromFunction1((t0: js.Array[String]) => value(t0).runNow()))
    
    inline def setSet_from(value: String => Callback): Self = StObject.set(x, "set_from", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSet_subject(value: String => Callback): Self = StObject.set(x, "set_subject", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSet_to(value: js.Array[String] => Callback): Self = StObject.set(x, "set_to", js.Any.fromFunction1((t0: js.Array[String]) => value(t0).runNow()))
  }
}
