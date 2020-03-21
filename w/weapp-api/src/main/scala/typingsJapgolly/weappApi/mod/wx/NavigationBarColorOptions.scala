package typingsJapgolly.weappApi.mod.wx

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigationBarColorOptions extends CommonCallbackOptions {
  //  动画效果
  var animation: NavigationBarColorAnimationOptions
  // 背景颜色值，有效值为十六进制颜色
  var backgroundColor: String
  // 前景颜色值，包括按钮、标题、状态栏的颜色，仅支持 #ffffff 和 #000000
  var frontColor: String
}

object NavigationBarColorOptions {
  @scala.inline
  def apply(
    animation: NavigationBarColorAnimationOptions,
    backgroundColor: String,
    frontColor: String,
    complete: /* res */ js.Any => Callback = null,
    fail: /* res */ js.Any => Callback = null,
    success: /* res */ js.Any => Callback = null
  ): NavigationBarColorOptions = {
    val __obj = js.Dynamic.literal(animation = animation.asInstanceOf[js.Any], backgroundColor = backgroundColor.asInstanceOf[js.Any], frontColor = frontColor.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1((t0: /* res */ js.Any) => complete(t0).runNow()))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1((t0: /* res */ js.Any) => fail(t0).runNow()))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1((t0: /* res */ js.Any) => success(t0).runNow()))
    __obj.asInstanceOf[NavigationBarColorOptions]
  }
}

