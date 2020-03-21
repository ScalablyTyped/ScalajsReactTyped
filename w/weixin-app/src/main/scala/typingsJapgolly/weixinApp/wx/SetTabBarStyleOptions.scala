package typingsJapgolly.weixinApp.wx

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetTabBarStyleOptions
  extends BaseOptions[js.Any, js.Any] {
  /** tab 的背景色 */
  var backgroundColor: String
  /** tabbar上边框的颜色， 仅支持 black/white */
  var borderStyle: String
  /** tab 上的文字默认颜色 */
  var color: String
  /** tab 上的文字选中时的颜色 */
  var selectedColor: String
}

object SetTabBarStyleOptions {
  @scala.inline
  def apply(
    backgroundColor: String,
    borderStyle: String,
    color: String,
    selectedColor: String,
    complete: /* res */ js.Any => Callback = null,
    fail: js.Any => Callback = null,
    success: js.Any => Callback = null
  ): SetTabBarStyleOptions = {
    val __obj = js.Dynamic.literal(backgroundColor = backgroundColor.asInstanceOf[js.Any], borderStyle = borderStyle.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], selectedColor = selectedColor.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1((t0: /* res */ js.Any) => complete(t0).runNow()))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1((t0: js.Any) => fail(t0).runNow()))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1((t0: js.Any) => success(t0).runNow()))
    __obj.asInstanceOf[SetTabBarStyleOptions]
  }
}

