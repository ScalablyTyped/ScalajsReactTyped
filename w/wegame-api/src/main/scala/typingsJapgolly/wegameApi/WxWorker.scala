package typingsJapgolly.wegameApi

import japgolly.scalajs.react.Callback
import typingsJapgolly.wegameApi.anon.Message
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WxWorker extends StObject {
  
  /**
    * 监听接收主线程/Worker 线程向当前线程发送的消息
    * @param callback.res.message 接收主线程/Worker 线程向当前线程发送的消息
    */
  def onMessage(callback: js.Function1[/* res */ Message, Unit]): Unit
  
  /**
    * 监听 worker线程被系统回收事件（当iOS系统资源紧张时，worker线程存在被系统回收的可能，开发者可监听此事件并重新创建一个worker）。仅限在主线程 worker 对象上调用。
    */
  def onProcessKilled(callback: js.Function0[Unit]): Unit
  
  /**
    * 向主线程或Worker线程发送的消息。
    * @param message 需要发送的消息，必须是一个可序列化的 JavaScript 对象。
    */
  def postMessage(message: Any): Unit
  
  /**
    * 结束当前 worker 线程，仅限在主线程 worker 对象上调用。
    */
  def terminate(): Unit
}
object WxWorker {
  
  inline def apply(
    onMessage: js.Function1[/* res */ Message, Unit] => Callback,
    onProcessKilled: js.Function0[Unit] => Callback,
    postMessage: Any => Callback,
    terminate: Callback
  ): WxWorker = {
    val __obj = js.Dynamic.literal(onMessage = js.Any.fromFunction1((t0: js.Function1[/* res */ Message, Unit]) => onMessage(t0).runNow()), onProcessKilled = js.Any.fromFunction1((t0: js.Function0[Unit]) => onProcessKilled(t0).runNow()), postMessage = js.Any.fromFunction1((t0: Any) => postMessage(t0).runNow()), terminate = terminate.toJsFn)
    __obj.asInstanceOf[WxWorker]
  }
  
  extension [Self <: WxWorker](x: Self) {
    
    inline def setOnMessage(value: js.Function1[/* res */ Message, Unit] => Callback): Self = StObject.set(x, "onMessage", js.Any.fromFunction1((t0: js.Function1[/* res */ Message, Unit]) => value(t0).runNow()))
    
    inline def setOnProcessKilled(value: js.Function0[Unit] => Callback): Self = StObject.set(x, "onProcessKilled", js.Any.fromFunction1((t0: js.Function0[Unit]) => value(t0).runNow()))
    
    inline def setPostMessage(value: Any => Callback): Self = StObject.set(x, "postMessage", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def setTerminate(value: Callback): Self = StObject.set(x, "terminate", value.toJsFn)
  }
}
