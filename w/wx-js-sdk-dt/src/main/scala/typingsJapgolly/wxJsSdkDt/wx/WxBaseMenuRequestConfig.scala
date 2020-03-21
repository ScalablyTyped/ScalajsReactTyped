package typingsJapgolly.wxJsSdkDt.wx

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * 所有Menu中的相关接口的请求参数
  */
trait WxBaseMenuRequestConfig extends WxBaseRequestConfig {
  /**
    * 监听Menu中的按钮点击时触发的方法
    */
  var trigger: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object WxBaseMenuRequestConfig {
  @scala.inline
  def apply(
    cancel: js.UndefOr[Callback] = js.undefined,
    complete: /* res */ js.UndefOr[js.Any] => Callback = null,
    fail: /* error */ js.UndefOr[js.Any] => Callback = null,
    success: /* res */ js.UndefOr[js.Any] => Callback = null,
    trigger: js.UndefOr[Callback] = js.undefined
  ): WxBaseMenuRequestConfig = {
    val __obj = js.Dynamic.literal()
    cancel.foreach(p => __obj.updateDynamic("cancel")(p.toJsFn))
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1((t0: /* res */ js.UndefOr[js.Any]) => complete(t0).runNow()))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1((t0: /* error */ js.UndefOr[js.Any]) => fail(t0).runNow()))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1((t0: /* res */ js.UndefOr[js.Any]) => success(t0).runNow()))
    trigger.foreach(p => __obj.updateDynamic("trigger")(p.toJsFn))
    __obj.asInstanceOf[WxBaseMenuRequestConfig]
  }
}

