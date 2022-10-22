package typingsJapgolly.jsoneditoronline

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JSONFormatter extends StObject {
  
  def get(): js.Object
  
  def getText(): String
  
  def onError(err: String): Unit
  
  def set(json: js.Object): Unit
  
  def setText(jsonString: String): Unit
}
object JSONFormatter {
  
  inline def apply(
    get: CallbackTo[js.Object],
    getText: CallbackTo[String],
    onError: String => Callback,
    set: js.Object => Callback,
    setText: String => Callback
  ): JSONFormatter = {
    val __obj = js.Dynamic.literal(get = get.toJsFn, getText = getText.toJsFn, onError = js.Any.fromFunction1((t0: String) => onError(t0).runNow()), set = js.Any.fromFunction1((t0: js.Object) => set(t0).runNow()), setText = js.Any.fromFunction1((t0: String) => setText(t0).runNow()))
    __obj.asInstanceOf[JSONFormatter]
  }
  
  extension [Self <: JSONFormatter](x: Self) {
    
    inline def setGet(value: CallbackTo[js.Object]): Self = StObject.set(x, "get", value.toJsFn)
    
    inline def setGetText(value: CallbackTo[String]): Self = StObject.set(x, "getText", value.toJsFn)
    
    inline def setOnError(value: String => Callback): Self = StObject.set(x, "onError", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSet(value: js.Object => Callback): Self = StObject.set(x, "set", js.Any.fromFunction1((t0: js.Object) => value(t0).runNow()))
    
    inline def setSetText(value: String => Callback): Self = StObject.set(x, "setText", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
  }
}
