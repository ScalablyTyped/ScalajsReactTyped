package typingsJapgolly.wxJsSdkDt.wx

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StartSearchBeaconsConfig extends WxBaseRequestConfig {
  /**
    * 摇周边的业务ticket, 系统自动添加在摇出来的页面链接后面
    */
  var ticket: String
  /**
    * 完成后的回调
    */
  @JSName("complete")
  def complete_MStartSearchBeaconsConfig(argv: js.Any): Unit
}

object StartSearchBeaconsConfig {
  @scala.inline
  def apply(
    complete: js.Any => Callback,
    ticket: String,
    cancel: js.UndefOr[Callback] = js.undefined,
    fail: /* error */ js.UndefOr[js.Any] => Callback = null,
    success: /* res */ js.UndefOr[js.Any] => Callback = null
  ): StartSearchBeaconsConfig = {
    val __obj = js.Dynamic.literal(ticket = ticket.asInstanceOf[js.Any])
    __obj.updateDynamic("complete")(js.Any.fromFunction1((t0: js.Any) => complete(t0).runNow()))
    cancel.foreach(p => __obj.updateDynamic("cancel")(p.toJsFn))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1((t0: /* error */ js.UndefOr[js.Any]) => fail(t0).runNow()))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1((t0: /* res */ js.UndefOr[js.Any]) => success(t0).runNow()))
    __obj.asInstanceOf[StartSearchBeaconsConfig]
  }
}

