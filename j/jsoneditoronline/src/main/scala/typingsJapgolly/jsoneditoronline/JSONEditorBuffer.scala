package typingsJapgolly.jsoneditoronline

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JSONEditorBuffer extends StObject {
  
  def flush(): String
  
  def set(text: String): Unit
  
  var text: String
}
object JSONEditorBuffer {
  
  inline def apply(flush: CallbackTo[String], set: String => Callback, text: String): JSONEditorBuffer = {
    val __obj = js.Dynamic.literal(flush = flush.toJsFn, set = js.Any.fromFunction1((t0: String) => set(t0).runNow()), text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSONEditorBuffer]
  }
  
  extension [Self <: JSONEditorBuffer](x: Self) {
    
    inline def setFlush(value: CallbackTo[String]): Self = StObject.set(x, "flush", value.toJsFn)
    
    inline def setSet(value: String => Callback): Self = StObject.set(x, "set", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
