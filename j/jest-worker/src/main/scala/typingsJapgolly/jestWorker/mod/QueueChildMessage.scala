package typingsJapgolly.jestWorker.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueueChildMessage extends StObject {
  
  def onCustomMessage(message: js.Array[Any]): Unit
  def onCustomMessage(message: Any): Unit
  @JSName("onCustomMessage")
  var onCustomMessage_Original: OnCustomMessage
  
  def onEnd(err: js.Error, result: Any): Unit
  def onEnd(err: Null, result: Any): Unit
  @JSName("onEnd")
  var onEnd_Original: OnEnd
  
  def onStart(worker: WorkerInterface): Unit
  @JSName("onStart")
  var onStart_Original: OnStart
  
  var request: ChildMessageCall
}
object QueueChildMessage {
  
  inline def apply(
    onCustomMessage: /* message */ js.Array[Any] | Any => Callback,
    onEnd: (/* err */ js.Error | Null, /* result */ Any) => Callback,
    onStart: /* worker */ WorkerInterface => Callback,
    request: ChildMessageCall
  ): QueueChildMessage = {
    val __obj = js.Dynamic.literal(onCustomMessage = js.Any.fromFunction1((t0: /* message */ js.Array[Any] | Any) => onCustomMessage(t0).runNow()), onEnd = js.Any.fromFunction2((t0: /* err */ js.Error | Null, t1: /* result */ Any) => (onEnd(t0, t1)).runNow()), onStart = js.Any.fromFunction1((t0: /* worker */ WorkerInterface) => onStart(t0).runNow()), request = request.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueueChildMessage]
  }
  
  extension [Self <: QueueChildMessage](x: Self) {
    
    inline def setOnCustomMessage(value: /* message */ js.Array[Any] | Any => Callback): Self = StObject.set(x, "onCustomMessage", js.Any.fromFunction1((t0: /* message */ js.Array[Any] | Any) => value(t0).runNow()))
    
    inline def setOnEnd(value: (/* err */ js.Error | Null, /* result */ Any) => Callback): Self = StObject.set(x, "onEnd", js.Any.fromFunction2((t0: /* err */ js.Error | Null, t1: /* result */ Any) => (value(t0, t1)).runNow()))
    
    inline def setOnStart(value: /* worker */ WorkerInterface => Callback): Self = StObject.set(x, "onStart", js.Any.fromFunction1((t0: /* worker */ WorkerInterface) => value(t0).runNow()))
    
    inline def setRequest(value: ChildMessageCall): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
  }
}
