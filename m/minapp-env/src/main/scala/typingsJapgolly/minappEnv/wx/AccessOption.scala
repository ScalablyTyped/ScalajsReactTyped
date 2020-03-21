package typingsJapgolly.minappEnv.wx

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccessOption extends js.Object {
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[AccessCompleteCallback] = js.undefined
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[AccessFailCallback] = js.undefined
  /** 要判断是否存在的文件/目录路径 */
  var path: String
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[AccessSuccessCallback] = js.undefined
}

object AccessOption {
  @scala.inline
  def apply(
    path: String,
    complete: /* res */ GeneralCallbackResult => Callback = null,
    fail: /* result */ AccessFailCallbackResult => Callback = null,
    success: /* res */ GeneralCallbackResult => Callback = null
  ): AccessOption = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1((t0: /* res */ typingsJapgolly.minappEnv.wx.GeneralCallbackResult) => complete(t0).runNow()))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1((t0: /* result */ typingsJapgolly.minappEnv.wx.AccessFailCallbackResult) => fail(t0).runNow()))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1((t0: /* res */ typingsJapgolly.minappEnv.wx.GeneralCallbackResult) => success(t0).runNow()))
    __obj.asInstanceOf[AccessOption]
  }
}

