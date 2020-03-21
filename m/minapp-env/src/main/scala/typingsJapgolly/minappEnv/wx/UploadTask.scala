package typingsJapgolly.minappEnv.wx

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UploadTask extends js.Object {
  /** [UploadTask.abort()](UploadTask.abort.md)
    *
    * 中断上传任务
    *
    * 最低基础库： `1.4.0` */
  def abort(): Unit
  /** [UploadTask.offHeadersReceived(function callback)](UploadTask.offHeadersReceived.md)
    *
    * 取消监听 HTTP Response Header 事件
    *
    * 最低基础库： `2.1.0` */
  def offHeadersReceived(/** HTTP Response Header 事件的回调函数 */
  callback: UploadTaskOffHeadersReceivedCallback): Unit
  /** [UploadTask.offProgressUpdate(function callback)](UploadTask.offProgressUpdate.md)
    *
    * 取消监听上传进度变化事件
    *
    * 最低基础库： `2.1.0` */
  def offProgressUpdate(/** 上传进度变化事件的回调函数 */
  callback: UploadTaskOffProgressUpdateCallback): Unit
  /** [UploadTask.onHeadersReceived(function callback)](UploadTask.onHeadersReceived.md)
    *
    * 监听 HTTP Response Header 事件。会比请求完成事件更早
    *
    * 最低基础库： `2.1.0` */
  def onHeadersReceived(/** HTTP Response Header 事件的回调函数 */
  callback: UploadTaskOnHeadersReceivedCallback): Unit
  /** [UploadTask.onProgressUpdate(function callback)](UploadTask.onProgressUpdate.md)
    *
    * 监听上传进度变化事件
    *
    * 最低基础库： `1.4.0` */
  def onProgressUpdate(/** 上传进度变化事件的回调函数 */
  callback: UploadTaskOnProgressUpdateCallback): Unit
}

object UploadTask {
  @scala.inline
  def apply(
    abort: Callback,
    offHeadersReceived: UploadTaskOffHeadersReceivedCallback => Callback,
    offProgressUpdate: UploadTaskOffProgressUpdateCallback => Callback,
    onHeadersReceived: UploadTaskOnHeadersReceivedCallback => Callback,
    onProgressUpdate: UploadTaskOnProgressUpdateCallback => Callback
  ): UploadTask = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("abort")(abort.toJsFn)
    __obj.updateDynamic("offHeadersReceived")(js.Any.fromFunction1((t0: typingsJapgolly.minappEnv.wx.UploadTaskOffHeadersReceivedCallback) => offHeadersReceived(t0).runNow()))
    __obj.updateDynamic("offProgressUpdate")(js.Any.fromFunction1((t0: typingsJapgolly.minappEnv.wx.UploadTaskOffProgressUpdateCallback) => offProgressUpdate(t0).runNow()))
    __obj.updateDynamic("onHeadersReceived")(js.Any.fromFunction1((t0: typingsJapgolly.minappEnv.wx.UploadTaskOnHeadersReceivedCallback) => onHeadersReceived(t0).runNow()))
    __obj.updateDynamic("onProgressUpdate")(js.Any.fromFunction1((t0: typingsJapgolly.minappEnv.wx.UploadTaskOnProgressUpdateCallback) => onProgressUpdate(t0).runNow()))
    __obj.asInstanceOf[UploadTask]
  }
}

