package typingsJapgolly.antdMobileRn.tabBarPropsTypeMod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabBarItemProps extends js.Object {
  var badge: js.UndefOr[String | Double] = js.undefined
  var icon: js.UndefOr[TabIcon] = js.undefined
  var onPress: js.UndefOr[js.Function0[Unit]] = js.undefined
  var selected: js.UndefOr[Boolean] = js.undefined
  var selectedIcon: js.UndefOr[TabIcon] = js.undefined
  var title: String
}

object TabBarItemProps {
  @scala.inline
  def apply(
    title: String,
    badge: String | Double = null,
    icon: TabIcon = null,
    onPress: js.UndefOr[Callback] = js.undefined,
    selected: js.UndefOr[Boolean] = js.undefined,
    selectedIcon: TabIcon = null
  ): TabBarItemProps = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
    if (badge != null) __obj.updateDynamic("badge")(badge.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    onPress.foreach(p => __obj.updateDynamic("onPress")(p.toJsFn))
    if (!js.isUndefined(selected)) __obj.updateDynamic("selected")(selected.asInstanceOf[js.Any])
    if (selectedIcon != null) __obj.updateDynamic("selectedIcon")(selectedIcon.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabBarItemProps]
  }
}

