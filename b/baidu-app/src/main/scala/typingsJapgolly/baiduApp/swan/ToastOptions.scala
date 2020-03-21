package typingsJapgolly.baiduApp.swan

import japgolly.scalajs.react.Callback
import typingsJapgolly.baiduApp.baiduAppStrings.loading
import typingsJapgolly.baiduApp.baiduAppStrings.success
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// #endregion
// #region 界面API列表
trait ToastOptions
  extends BaseOptions[js.Any, js.Any] {
  /**
  		 * 提示的延迟时间，单位毫秒，默认：1500
  		 */
  var duration: js.UndefOr[Double] = js.undefined
  /**
  		 * 图标，只支持"success"、"loading"
  		 */
  var icon: js.UndefOr[success | loading] = js.undefined
  /**
  		 * 自定义图标的本地路径，image 的优先级高于 icon
  		 */
  var image: js.UndefOr[String] = js.undefined
  /**
  		 * 是否显示透明蒙层，防止触摸穿透，默认：false
  		 */
  var mask: js.UndefOr[Boolean] = js.undefined
  /**
  		 * 提示的内容
  		 */
  var title: String
}

object ToastOptions {
  @scala.inline
  def apply(
    title: String,
    complete: /* res */ js.Any => Callback = null,
    duration: Int | Double = null,
    fail: js.Any => Callback = null,
    icon: success | loading = null,
    image: String = null,
    mask: js.UndefOr[Boolean] = js.undefined,
    success: js.Any => Callback = null
  ): ToastOptions = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1((t0: /* res */ js.Any) => complete(t0).runNow()))
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1((t0: js.Any) => fail(t0).runNow()))
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    if (!js.isUndefined(mask)) __obj.updateDynamic("mask")(mask.asInstanceOf[js.Any])
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1((t0: js.Any) => success(t0).runNow()))
    __obj.asInstanceOf[ToastOptions]
  }
}

