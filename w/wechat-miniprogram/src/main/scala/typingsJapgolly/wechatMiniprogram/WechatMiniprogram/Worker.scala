package typingsJapgolly.wechatMiniprogram.WechatMiniprogram

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Worker extends StObject {
  
  /** [Worker.onMessage(function callback)](https://developers.weixin.qq.com/miniprogram/dev/api/worker/Worker.onMessage.html)
    *
    * 监听主线程/Worker 线程向当前线程发送的消息的事件。 */
  def onMessage(/** 主线程/Worker 线程向当前线程发送的消息的事件的回调函数 */
  callback: WorkerOnMessageCallback): Unit
  
  /** [Worker.onProcessKilled(function callback)](https://developers.weixin.qq.com/miniprogram/dev/api/worker/Worker.onProcessKilled.html)
    *
    * 监听 worker线程被系统回收事件（当iOS系统资源紧张时，worker线程存在被系统回收的可能，开发者可监听此事件并重新创建一个worker）。仅限在主线程 worker 对象上调用。 */
  def onProcessKilled(/** worker线程被系统回收事件的回调函数 */
  callback: OnProcessKilledCallback): Unit
  
  /** [Worker.postMessage(Object message)](https://developers.weixin.qq.com/miniprogram/dev/api/worker/Worker.postMessage.html)
  *
  * 向主线程/Worker 线程发送的消息。
  *
  * **示例代码**
  *
  *
  * worker 线程中
  * ```js
  worker.postMessage({
    msg: 'hello from worker'
  })
  ```
  *
  * 主线程中
  * ```js
  const worker = wx.createWorker('workers/request/index.js')
  worker.postMessage({
    msg: 'hello from main'
  })
  ``` */
  def postMessage(/** 需要发送的消息，必须是一个可序列化的 JavaScript key-value 形式的对象。 */
  message: IAnyObject): Unit
  
  /** [Worker.terminate()](https://developers.weixin.qq.com/miniprogram/dev/api/worker/Worker.terminate.html)
    *
    * 结束当前 Worker 线程。仅限在主线程 worker 对象上调用。 */
  def terminate(): Unit
}
object Worker {
  
  inline def apply(
    onMessage: WorkerOnMessageCallback => Callback,
    onProcessKilled: OnProcessKilledCallback => Callback,
    postMessage: IAnyObject => Callback,
    terminate: Callback
  ): Worker = {
    val __obj = js.Dynamic.literal(onMessage = js.Any.fromFunction1((t0: WorkerOnMessageCallback) => onMessage(t0).runNow()), onProcessKilled = js.Any.fromFunction1((t0: OnProcessKilledCallback) => onProcessKilled(t0).runNow()), postMessage = js.Any.fromFunction1((t0: IAnyObject) => postMessage(t0).runNow()), terminate = terminate.toJsFn)
    __obj.asInstanceOf[Worker]
  }
  
  extension [Self <: Worker](x: Self) {
    
    inline def setOnMessage(value: WorkerOnMessageCallback => Callback): Self = StObject.set(x, "onMessage", js.Any.fromFunction1((t0: WorkerOnMessageCallback) => value(t0).runNow()))
    
    inline def setOnProcessKilled(value: OnProcessKilledCallback => Callback): Self = StObject.set(x, "onProcessKilled", js.Any.fromFunction1((t0: OnProcessKilledCallback) => value(t0).runNow()))
    
    inline def setPostMessage(value: IAnyObject => Callback): Self = StObject.set(x, "postMessage", js.Any.fromFunction1((t0: IAnyObject) => value(t0).runNow()))
    
    inline def setTerminate(value: Callback): Self = StObject.set(x, "terminate", value.toJsFn)
  }
}
