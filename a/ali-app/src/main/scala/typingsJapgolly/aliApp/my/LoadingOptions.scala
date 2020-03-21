package typingsJapgolly.aliApp.my

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoadingOptions
  extends BaseOptions[js.Any, js.Any] {
  /**
  		 * loading的文字内容
  		 */
  var content: js.UndefOr[String] = js.undefined
  /**
  		 * 延迟显示，单位 ms，默认 0。如果在此时间之前调用了 my.hideLoading 则不会显示
  		 */
  var delay: js.UndefOr[Double] = js.undefined
}

object LoadingOptions {
  @scala.inline
  def apply(
    complete: /* res */ js.Any => Callback = null,
    content: String = null,
    delay: Int | Double = null,
    fail: js.Any => Callback = null,
    success: js.Any => Callback = null
  ): LoadingOptions = {
    val __obj = js.Dynamic.literal()
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1((t0: /* res */ js.Any) => complete(t0).runNow()))
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1((t0: js.Any) => fail(t0).runNow()))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1((t0: js.Any) => success(t0).runNow()))
    __obj.asInstanceOf[LoadingOptions]
  }
}

