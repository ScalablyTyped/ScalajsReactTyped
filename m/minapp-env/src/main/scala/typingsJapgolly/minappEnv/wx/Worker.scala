package typingsJapgolly.minappEnv.wx

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Worker extends js.Object {
  /** [Worker.onMessage(function callback)](Worker.onMessage.md)
    *
    * 监听主线程/Worker 线程向当前线程发送的消息的事件。 */
  def onMessage(/** 主线程/Worker 线程向当前线程发送的消息的事件的回调函数 */
  callback: WorkerOnMessageCallback): Unit
  /** [Worker.postMessage(Object message)](Worker.postMessage.md)
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
  message: js.Object): Unit
  /** [Worker.terminate()](Worker.terminate.md)
    *
    * 结束当前 Worker 线程。仅限在主线程 worker 对象上调用。 */
  def terminate(): Unit
}

object Worker {
  @scala.inline
  def apply(
    onMessage: WorkerOnMessageCallback => Callback,
    postMessage: js.Object => Callback,
    terminate: Callback
  ): Worker = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("onMessage")(js.Any.fromFunction1((t0: typingsJapgolly.minappEnv.wx.WorkerOnMessageCallback) => onMessage(t0).runNow()))
    __obj.updateDynamic("postMessage")(js.Any.fromFunction1((t0: js.Object) => postMessage(t0).runNow()))
    __obj.updateDynamic("terminate")(terminate.toJsFn)
    __obj.asInstanceOf[Worker]
  }
}

