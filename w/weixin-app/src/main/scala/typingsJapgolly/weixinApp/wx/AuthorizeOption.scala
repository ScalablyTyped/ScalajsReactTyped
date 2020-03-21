package typingsJapgolly.weixinApp.wx

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// 开放接口-----设置
trait AuthorizeOption extends js.Object {
  var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  var fail: js.UndefOr[js.Function0[Unit]] = js.undefined
  var scope: Scope
  var success: js.UndefOr[js.Function1[/* res */ ErrMsgResponse, Unit]] = js.undefined
}

object AuthorizeOption {
  @scala.inline
  def apply(
    scope: Scope,
    complete: js.UndefOr[Callback] = js.undefined,
    fail: js.UndefOr[Callback] = js.undefined,
    success: /* res */ ErrMsgResponse => Callback = null
  ): AuthorizeOption = {
    val __obj = js.Dynamic.literal(scope = scope.asInstanceOf[js.Any])
    complete.foreach(p => __obj.updateDynamic("complete")(p.toJsFn))
    fail.foreach(p => __obj.updateDynamic("fail")(p.toJsFn))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1((t0: /* res */ typingsJapgolly.weixinApp.wx.ErrMsgResponse) => success(t0).runNow()))
    __obj.asInstanceOf[AuthorizeOption]
  }
}

