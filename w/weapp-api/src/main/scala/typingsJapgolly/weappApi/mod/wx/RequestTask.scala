package typingsJapgolly.weappApi.mod.wx

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * 网络请求任务对象
  */
trait RequestTask extends js.Object {
  //  中断请求任务
  def abort(): Unit
  //  取消监听 HTTP Response Header 事件
  def offHeadersReceived(callback: DataResponseCallback): Unit
  //  监听 HTTP Response Header 事件。会比请求完成事件更早
  def onHeadersReceived(callback: DataResponseCallback): Unit
}

object RequestTask {
  @scala.inline
  def apply(
    abort: Callback,
    offHeadersReceived: DataResponseCallback => Callback,
    onHeadersReceived: DataResponseCallback => Callback
  ): RequestTask = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("abort")(abort.toJsFn)
    __obj.updateDynamic("offHeadersReceived")(js.Any.fromFunction1((t0: typingsJapgolly.weappApi.mod.wx.DataResponseCallback) => offHeadersReceived(t0).runNow()))
    __obj.updateDynamic("onHeadersReceived")(js.Any.fromFunction1((t0: typingsJapgolly.weappApi.mod.wx.DataResponseCallback) => onHeadersReceived(t0).runNow()))
    __obj.asInstanceOf[RequestTask]
  }
}

