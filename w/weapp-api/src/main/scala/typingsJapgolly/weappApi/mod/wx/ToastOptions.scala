package typingsJapgolly.weappApi.mod.wx

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToastOptions extends CommonCallbackOptions {
  //  提示的延迟时间，默认值1500ms
  var duration: js.UndefOr[Double] = js.undefined
  // 图标，默认值'success'
  var icon: js.UndefOr[typingsJapgolly.weappApi.mod.wx.icon] = js.undefined
  //  自定义图标的本地路径，image 的优先级高于 icon
  var imgage: js.UndefOr[String] = js.undefined
  //  是否显示透明蒙层，防止触摸穿透，默认值false
  var mask: Boolean
  // 提示的内容
  var title: String
}

object ToastOptions {
  @scala.inline
  def apply(
    mask: Boolean,
    title: String,
    complete: /* res */ js.Any => Callback = null,
    duration: Int | Double = null,
    fail: /* res */ js.Any => Callback = null,
    icon: icon = null,
    imgage: String = null,
    success: /* res */ js.Any => Callback = null
  ): ToastOptions = {
    val __obj = js.Dynamic.literal(mask = mask.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1((t0: /* res */ js.Any) => complete(t0).runNow()))
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1((t0: /* res */ js.Any) => fail(t0).runNow()))
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (imgage != null) __obj.updateDynamic("imgage")(imgage.asInstanceOf[js.Any])
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1((t0: /* res */ js.Any) => success(t0).runNow()))
    __obj.asInstanceOf[ToastOptions]
  }
}

