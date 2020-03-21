package typingsJapgolly.minappEnv.wx

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShowShareMenuOption extends js.Object {
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[ShowShareMenuCompleteCallback] = js.undefined
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[ShowShareMenuFailCallback] = js.undefined
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[ShowShareMenuSuccessCallback] = js.undefined
  /** 是否使用带 shareTicket 的转发[详情]((转发#获取更多转发信息)) */
  var withShareTicket: js.UndefOr[Boolean] = js.undefined
}

object ShowShareMenuOption {
  @scala.inline
  def apply(
    complete: /* res */ GeneralCallbackResult => Callback = null,
    fail: /* res */ GeneralCallbackResult => Callback = null,
    success: /* res */ GeneralCallbackResult => Callback = null,
    withShareTicket: js.UndefOr[Boolean] = js.undefined
  ): ShowShareMenuOption = {
    val __obj = js.Dynamic.literal()
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1((t0: /* res */ typingsJapgolly.minappEnv.wx.GeneralCallbackResult) => complete(t0).runNow()))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1((t0: /* res */ typingsJapgolly.minappEnv.wx.GeneralCallbackResult) => fail(t0).runNow()))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1((t0: /* res */ typingsJapgolly.minappEnv.wx.GeneralCallbackResult) => success(t0).runNow()))
    if (!js.isUndefined(withShareTicket)) __obj.updateDynamic("withShareTicket")(withShareTicket.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShowShareMenuOption]
  }
}

