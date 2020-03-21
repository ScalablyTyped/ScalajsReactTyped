package typingsJapgolly.baiduApp.swan

import japgolly.scalajs.react.Callback
import typingsJapgolly.baiduApp.AnonDuration
import typingsJapgolly.baiduApp.baiduAppStrings.Numbersign000000
import typingsJapgolly.baiduApp.baiduAppStrings.Numbersignffffff
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetNavigationBarColorOptions
  extends BaseOptions[js.Any, js.Any] {
  /**
  		 * 动画效果
  		 */
  var animation: js.UndefOr[AnonDuration] = js.undefined
  /**
  		 * 背景颜色值，有效值为十六进制颜色
  		 */
  var backgroundColor: String
  /**
  		 * 前景颜色值，包括按钮、标题、状态栏的颜色，仅支持 #ffffff 和 #000000
  		 */
  var frontColor: Numbersignffffff | Numbersign000000
}

object SetNavigationBarColorOptions {
  @scala.inline
  def apply(
    backgroundColor: String,
    frontColor: Numbersignffffff | Numbersign000000,
    animation: AnonDuration = null,
    complete: /* res */ js.Any => Callback = null,
    fail: js.Any => Callback = null,
    success: js.Any => Callback = null
  ): SetNavigationBarColorOptions = {
    val __obj = js.Dynamic.literal(backgroundColor = backgroundColor.asInstanceOf[js.Any], frontColor = frontColor.asInstanceOf[js.Any])
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1((t0: /* res */ js.Any) => complete(t0).runNow()))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1((t0: js.Any) => fail(t0).runNow()))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1((t0: js.Any) => success(t0).runNow()))
    __obj.asInstanceOf[SetNavigationBarColorOptions]
  }
}

