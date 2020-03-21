package typingsJapgolly.minappEnv.wx

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthorizeOption extends js.Object {
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[AuthorizeCompleteCallback] = js.undefined
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[AuthorizeFailCallback] = js.undefined
  /** 需要获取权限的 scope，详见 [scope 列表]((授权#scope-列表)) */
  var scope: String
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[AuthorizeSuccessCallback] = js.undefined
}

object AuthorizeOption {
  @scala.inline
  def apply(
    scope: String,
    complete: /* res */ GeneralCallbackResult => Callback = null,
    fail: /* res */ GeneralCallbackResult => Callback = null,
    success: /* res */ GeneralCallbackResult => Callback = null
  ): AuthorizeOption = {
    val __obj = js.Dynamic.literal(scope = scope.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1((t0: /* res */ typingsJapgolly.minappEnv.wx.GeneralCallbackResult) => complete(t0).runNow()))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1((t0: /* res */ typingsJapgolly.minappEnv.wx.GeneralCallbackResult) => fail(t0).runNow()))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1((t0: /* res */ typingsJapgolly.minappEnv.wx.GeneralCallbackResult) => success(t0).runNow()))
    __obj.asInstanceOf[AuthorizeOption]
  }
}

