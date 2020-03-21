package typingsJapgolly.weixinApp.wx

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetTabBarBadgeOptions
  extends BaseOptions[js.Any, js.Any] {
  /**
  		 * tabBar的哪一项，从左边算起
  		 */
  var index: Double
  /**
  		 * 显示的文本，超过 3 个字符则显示成“…”
  		 */
  var text: String
}

object SetTabBarBadgeOptions {
  @scala.inline
  def apply(
    index: Double,
    text: String,
    complete: /* res */ js.Any => Callback = null,
    fail: js.Any => Callback = null,
    success: js.Any => Callback = null
  ): SetTabBarBadgeOptions = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1((t0: /* res */ js.Any) => complete(t0).runNow()))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1((t0: js.Any) => fail(t0).runNow()))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1((t0: js.Any) => success(t0).runNow()))
    __obj.asInstanceOf[SetTabBarBadgeOptions]
  }
}

