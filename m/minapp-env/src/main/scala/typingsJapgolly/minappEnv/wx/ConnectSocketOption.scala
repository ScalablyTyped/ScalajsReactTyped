package typingsJapgolly.minappEnv.wx

import japgolly.scalajs.react.Callback
import typingsJapgolly.minappEnv.Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectSocketOption extends js.Object {
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[ConnectSocketCompleteCallback] = js.undefined
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[ConnectSocketFailCallback] = js.undefined
  /** HTTP Header，Header 中不能设置 Referer */
  var header: js.UndefOr[js.Object] = js.undefined
  /** 子协议数组
    *
    * 最低基础库： `1.4.0` */
  var protocols: js.UndefOr[Array[String]] = js.undefined
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[ConnectSocketSuccessCallback] = js.undefined
  /** 开发者服务器 wss 接口地址 */
  var url: String
}

object ConnectSocketOption {
  @scala.inline
  def apply(
    url: String,
    complete: /* res */ GeneralCallbackResult => Callback = null,
    fail: /* res */ GeneralCallbackResult => Callback = null,
    header: js.Object = null,
    protocols: Array[String] = null,
    success: /* res */ GeneralCallbackResult => Callback = null
  ): ConnectSocketOption = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1((t0: /* res */ typingsJapgolly.minappEnv.wx.GeneralCallbackResult) => complete(t0).runNow()))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1((t0: /* res */ typingsJapgolly.minappEnv.wx.GeneralCallbackResult) => fail(t0).runNow()))
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (protocols != null) __obj.updateDynamic("protocols")(protocols.asInstanceOf[js.Any])
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1((t0: /* res */ typingsJapgolly.minappEnv.wx.GeneralCallbackResult) => success(t0).runNow()))
    __obj.asInstanceOf[ConnectSocketOption]
  }
}

