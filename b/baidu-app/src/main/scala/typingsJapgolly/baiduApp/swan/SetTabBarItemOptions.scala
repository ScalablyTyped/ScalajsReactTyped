package typingsJapgolly.baiduApp.swan

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetTabBarItemOptions
  extends BaseOptions[js.Any, js.Any] {
  /**
  		 * 图片路径, icon 大小限制为40kb
  		 * 建议尺寸为 81px * 81px
  		 * 当 postion 为 top 时，此参数无效，不支持网络图片
  		 */
  var iconPath: js.UndefOr[String] = js.undefined
  /** tabBar 的哪一项，从左边算起 */
  var index: Double
  /**
  		 * 选中时的图片路径
  		 * icon 大小限制为40kb，建议尺寸为 81px * 81px
  		 * 当 postion 为 top
  		 */
  var selectedIconPath: js.UndefOr[String] = js.undefined
  /** tab 上按钮文字 */
  var text: js.UndefOr[String] = js.undefined
}

object SetTabBarItemOptions {
  @scala.inline
  def apply(
    index: Double,
    complete: /* res */ js.Any => Callback = null,
    fail: js.Any => Callback = null,
    iconPath: String = null,
    selectedIconPath: String = null,
    success: js.Any => Callback = null,
    text: String = null
  ): SetTabBarItemOptions = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1((t0: /* res */ js.Any) => complete(t0).runNow()))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1((t0: js.Any) => fail(t0).runNow()))
    if (iconPath != null) __obj.updateDynamic("iconPath")(iconPath.asInstanceOf[js.Any])
    if (selectedIconPath != null) __obj.updateDynamic("selectedIconPath")(selectedIconPath.asInstanceOf[js.Any])
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1((t0: js.Any) => success(t0).runNow()))
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetTabBarItemOptions]
  }
}

