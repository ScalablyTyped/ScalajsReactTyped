package typingsJapgolly.wxJsSdkDt.wx

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * 需要打开的卡券列表
  */
trait OpenCardConfig extends WxBaseRequestConfig {
  var cardList: js.Array[OpenCardObj]
}

object OpenCardConfig {
  @scala.inline
  def apply(
    cardList: js.Array[OpenCardObj],
    cancel: js.UndefOr[Callback] = js.undefined,
    complete: /* res */ js.UndefOr[js.Any] => Callback = null,
    fail: /* error */ js.UndefOr[js.Any] => Callback = null,
    success: /* res */ js.UndefOr[js.Any] => Callback = null
  ): OpenCardConfig = {
    val __obj = js.Dynamic.literal(cardList = cardList.asInstanceOf[js.Any])
    cancel.foreach(p => __obj.updateDynamic("cancel")(p.toJsFn))
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1((t0: /* res */ js.UndefOr[js.Any]) => complete(t0).runNow()))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1((t0: /* error */ js.UndefOr[js.Any]) => fail(t0).runNow()))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1((t0: /* res */ js.UndefOr[js.Any]) => success(t0).runNow()))
    __obj.asInstanceOf[OpenCardConfig]
  }
}

