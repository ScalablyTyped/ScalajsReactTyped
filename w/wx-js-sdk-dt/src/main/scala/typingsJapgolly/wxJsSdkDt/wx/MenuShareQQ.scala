package typingsJapgolly.wxJsSdkDt.wx

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @deprecated
  */
trait MenuShareQQ extends ShareTimelineConfig {
  /**
    * 分享描述
    */
  var desc: String
}

object MenuShareQQ {
  @scala.inline
  def apply(
    desc: String,
    link: String,
    title: String,
    cancel: js.UndefOr[Callback] = js.undefined,
    complete: /* res */ js.UndefOr[js.Any] => Callback = null,
    fail: /* error */ js.UndefOr[js.Any] => Callback = null,
    imgUrl: String = null,
    success: /* res */ js.UndefOr[js.Any] => Callback = null,
    trigger: js.UndefOr[Callback] = js.undefined
  ): MenuShareQQ = {
    val __obj = js.Dynamic.literal(desc = desc.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    cancel.foreach(p => __obj.updateDynamic("cancel")(p.toJsFn))
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1((t0: /* res */ js.UndefOr[js.Any]) => complete(t0).runNow()))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1((t0: /* error */ js.UndefOr[js.Any]) => fail(t0).runNow()))
    if (imgUrl != null) __obj.updateDynamic("imgUrl")(imgUrl.asInstanceOf[js.Any])
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1((t0: /* res */ js.UndefOr[js.Any]) => success(t0).runNow()))
    trigger.foreach(p => __obj.updateDynamic("trigger")(p.toJsFn))
    __obj.asInstanceOf[MenuShareQQ]
  }
}

