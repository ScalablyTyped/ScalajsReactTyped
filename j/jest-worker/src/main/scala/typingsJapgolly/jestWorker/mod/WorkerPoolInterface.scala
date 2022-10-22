package typingsJapgolly.jestWorker.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.node.NodeJS.ReadableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkerPoolInterface extends StObject {
  
  def createWorker(options: WorkerOptions2): WorkerInterface
  
  def end(): js.Promise[PoolExitResult]
  
  def getStderr(): ReadableStream
  
  def getStdout(): ReadableStream
  
  def getWorkers(): js.Array[WorkerInterface]
  
  def send(
    workerId: Double,
    request: ChildMessage,
    onStart: OnStart,
    onEnd: OnEnd,
    onCustomMessage: OnCustomMessage
  ): Unit
  @JSName("send")
  var send_Original: WorkerCallback
}
object WorkerPoolInterface {
  
  inline def apply(
    createWorker: WorkerOptions2 => WorkerInterface,
    end: CallbackTo[js.Promise[PoolExitResult]],
    getStderr: CallbackTo[ReadableStream],
    getStdout: CallbackTo[ReadableStream],
    getWorkers: CallbackTo[js.Array[WorkerInterface]],
    send: (/* workerId */ Double, /* request */ ChildMessage, /* onStart */ OnStart, /* onEnd */ OnEnd, /* onCustomMessage */ OnCustomMessage) => Callback
  ): WorkerPoolInterface = {
    val __obj = js.Dynamic.literal(createWorker = js.Any.fromFunction1(createWorker), end = end.toJsFn, getStderr = getStderr.toJsFn, getStdout = getStdout.toJsFn, getWorkers = getWorkers.toJsFn, send = js.Any.fromFunction5((t0: /* workerId */ Double, t1: /* request */ ChildMessage, t2: /* onStart */ OnStart, t3: /* onEnd */ OnEnd, t4: /* onCustomMessage */ OnCustomMessage) => (send(t0, t1, t2, t3, t4)).runNow()))
    __obj.asInstanceOf[WorkerPoolInterface]
  }
  
  extension [Self <: WorkerPoolInterface](x: Self) {
    
    inline def setCreateWorker(value: WorkerOptions2 => WorkerInterface): Self = StObject.set(x, "createWorker", js.Any.fromFunction1(value))
    
    inline def setEnd(value: CallbackTo[js.Promise[PoolExitResult]]): Self = StObject.set(x, "end", value.toJsFn)
    
    inline def setGetStderr(value: CallbackTo[ReadableStream]): Self = StObject.set(x, "getStderr", value.toJsFn)
    
    inline def setGetStdout(value: CallbackTo[ReadableStream]): Self = StObject.set(x, "getStdout", value.toJsFn)
    
    inline def setGetWorkers(value: CallbackTo[js.Array[WorkerInterface]]): Self = StObject.set(x, "getWorkers", value.toJsFn)
    
    inline def setSend(
      value: (/* workerId */ Double, /* request */ ChildMessage, /* onStart */ OnStart, /* onEnd */ OnEnd, /* onCustomMessage */ OnCustomMessage) => Callback
    ): Self = StObject.set(x, "send", js.Any.fromFunction5((t0: /* workerId */ Double, t1: /* request */ ChildMessage, t2: /* onStart */ OnStart, t3: /* onEnd */ OnEnd, t4: /* onCustomMessage */ OnCustomMessage) => (value(t0, t1, t2, t3, t4)).runNow()))
  }
}
