package typingsJapgolly.meteor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MailComposer extends StObject {
  
  def addHeader(name: String, value: String): Unit
  
  def pipe(stream: Any): Unit
  
  def setMessageOption(from: String, to: String, body: String, html: String): Unit
  
  def streamMessage(): Unit
}
object MailComposer {
  
  inline def apply(
    addHeader: (String, String) => japgolly.scalajs.react.Callback,
    pipe: Any => japgolly.scalajs.react.Callback,
    setMessageOption: (String, String, String, String) => japgolly.scalajs.react.Callback,
    streamMessage: japgolly.scalajs.react.Callback
  ): MailComposer = {
    val __obj = js.Dynamic.literal(addHeader = js.Any.fromFunction2((t0: String, t1: String) => (addHeader(t0, t1)).runNow()), pipe = js.Any.fromFunction1((t0: Any) => pipe(t0).runNow()), setMessageOption = js.Any.fromFunction4((t0: String, t1: String, t2: String, t3: String) => (setMessageOption(t0, t1, t2, t3)).runNow()), streamMessage = streamMessage.toJsFn)
    __obj.asInstanceOf[MailComposer]
  }
  
  extension [Self <: MailComposer](x: Self) {
    
    inline def setAddHeader(value: (String, String) => japgolly.scalajs.react.Callback): Self = StObject.set(x, "addHeader", js.Any.fromFunction2((t0: String, t1: String) => (value(t0, t1)).runNow()))
    
    inline def setPipe(value: Any => japgolly.scalajs.react.Callback): Self = StObject.set(x, "pipe", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def setSetMessageOption(value: (String, String, String, String) => japgolly.scalajs.react.Callback): Self = StObject.set(x, "setMessageOption", js.Any.fromFunction4((t0: String, t1: String, t2: String, t3: String) => (value(t0, t1, t2, t3)).runNow()))
    
    inline def setStreamMessage(value: japgolly.scalajs.react.Callback): Self = StObject.set(x, "streamMessage", value.toJsFn)
  }
}
