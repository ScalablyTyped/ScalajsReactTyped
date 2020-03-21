package typingsJapgolly.weappApi.mod.wx

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// 上传
/**
  * 一个可以监听上传进度变化事件，以及取消上传任务的对象
  */
trait UploadTask extends js.Object {
  //  中断上传任务
  def abort(): Unit
  //  取消监听 HTTP Response Header 事件
  def offHeadersReceived(callback: DataResponseCallback): Unit
  //  取消监听上传进度变化事件
  def offProgressUpdate(callback: js.Function1[/* res */ OnProgressCallbackOptions, js.Object]): Unit
  //  监听 HTTP Response Header 事件。会比请求完成事件更早
  def onHeadersReceived(callback: DataResponseCallback): Unit
  //  上传进度变化事件的回调函数
  def onProgressUpdate(callback: js.Function1[/* res */ OnProgressCallbackOptions, js.Object]): Unit
}

object UploadTask {
  @scala.inline
  def apply(
    abort: Callback,
    offHeadersReceived: DataResponseCallback => Callback,
    offProgressUpdate: js.Function1[/* res */ OnProgressCallbackOptions, js.Object] => Callback,
    onHeadersReceived: DataResponseCallback => Callback,
    onProgressUpdate: js.Function1[/* res */ OnProgressCallbackOptions, js.Object] => Callback
  ): UploadTask = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("abort")(abort.toJsFn)
    __obj.updateDynamic("offHeadersReceived")(js.Any.fromFunction1((t0: typingsJapgolly.weappApi.mod.wx.DataResponseCallback) => offHeadersReceived(t0).runNow()))
    __obj.updateDynamic("offProgressUpdate")(js.Any.fromFunction1((t0: js.Function1[/* res */ typingsJapgolly.weappApi.mod.wx.OnProgressCallbackOptions, js.Object]) => offProgressUpdate(t0).runNow()))
    __obj.updateDynamic("onHeadersReceived")(js.Any.fromFunction1((t0: typingsJapgolly.weappApi.mod.wx.DataResponseCallback) => onHeadersReceived(t0).runNow()))
    __obj.updateDynamic("onProgressUpdate")(js.Any.fromFunction1((t0: js.Function1[/* res */ typingsJapgolly.weappApi.mod.wx.OnProgressCallbackOptions, js.Object]) => onProgressUpdate(t0).runNow()))
    __obj.asInstanceOf[UploadTask]
  }
}

