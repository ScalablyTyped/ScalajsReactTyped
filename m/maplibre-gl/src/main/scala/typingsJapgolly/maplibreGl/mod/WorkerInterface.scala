package typingsJapgolly.maplibreGl.mod

import typingsJapgolly.maplibreGl.maplibreGlStrings.message
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkerInterface extends StObject {
  
  @JSName("addEventListener")
  def addEventListener_message(`type`: message, listener: MessageListener): scala.Unit
  
  def postMessage(message: Any): scala.Unit
  
  @JSName("removeEventListener")
  def removeEventListener_message(`type`: message, listener: MessageListener): scala.Unit
  
  def terminate(): scala.Unit
}
object WorkerInterface {
  
  inline def apply(
    addEventListener: (message, MessageListener) => japgolly.scalajs.react.Callback,
    postMessage: Any => japgolly.scalajs.react.Callback,
    removeEventListener: (message, MessageListener) => japgolly.scalajs.react.Callback,
    terminate: japgolly.scalajs.react.Callback
  ): WorkerInterface = {
    val __obj = js.Dynamic.literal(addEventListener = js.Any.fromFunction2((t0: message, t1: MessageListener) => (addEventListener(t0, t1)).runNow()), postMessage = js.Any.fromFunction1((t0: Any) => postMessage(t0).runNow()), removeEventListener = js.Any.fromFunction2((t0: message, t1: MessageListener) => (removeEventListener(t0, t1)).runNow()), terminate = terminate.toJsFn)
    __obj.asInstanceOf[WorkerInterface]
  }
  
  extension [Self <: WorkerInterface](x: Self) {
    
    inline def setAddEventListener(value: (message, MessageListener) => japgolly.scalajs.react.Callback): Self = StObject.set(x, "addEventListener", js.Any.fromFunction2((t0: message, t1: MessageListener) => (value(t0, t1)).runNow()))
    
    inline def setPostMessage(value: Any => japgolly.scalajs.react.Callback): Self = StObject.set(x, "postMessage", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def setRemoveEventListener(value: (message, MessageListener) => japgolly.scalajs.react.Callback): Self = StObject.set(x, "removeEventListener", js.Any.fromFunction2((t0: message, t1: MessageListener) => (value(t0, t1)).runNow()))
    
    inline def setTerminate(value: japgolly.scalajs.react.Callback): Self = StObject.set(x, "terminate", value.toJsFn)
  }
}
