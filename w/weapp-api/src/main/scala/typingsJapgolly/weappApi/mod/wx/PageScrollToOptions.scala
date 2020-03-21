package typingsJapgolly.weappApi.mod.wx

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//  滚动
trait PageScrollToOptions extends CommonCallbackOptions {
  //  滚动动画的时长，单位 ms。默认300
  var duration: Double
  //  滚动到页面的目标位置，单位 px
  var scrollTop: Double
}

object PageScrollToOptions {
  @scala.inline
  def apply(
    duration: Double,
    scrollTop: Double,
    complete: /* res */ js.Any => Callback = null,
    fail: /* res */ js.Any => Callback = null,
    success: /* res */ js.Any => Callback = null
  ): PageScrollToOptions = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], scrollTop = scrollTop.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1((t0: /* res */ js.Any) => complete(t0).runNow()))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1((t0: /* res */ js.Any) => fail(t0).runNow()))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1((t0: /* res */ js.Any) => success(t0).runNow()))
    __obj.asInstanceOf[PageScrollToOptions]
  }
}

