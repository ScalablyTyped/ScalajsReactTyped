package typingsJapgolly.antDesignReactNative.tabBarItemMod

import japgolly.scalajs.react.Callback
import typingsJapgolly.antDesignReactNative.AnonBadge
import typingsJapgolly.antDesignReactNative.libStyleMod.Theme
import typingsJapgolly.antDesignReactNative.tabBarPropsTypeMod.TabBarIcon
import typingsJapgolly.reactNative.mod.ImageStyle
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.std.ReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabBarItemProps extends js.Object {
  var badge: js.UndefOr[String | Double] = js.undefined
  var icon: js.UndefOr[TabBarIcon] = js.undefined
  var iconStyle: js.UndefOr[StyleProp[ImageStyle]] = js.undefined
  var onPress: js.UndefOr[js.Function0[Unit]] = js.undefined
  var renderAsOriginal: js.UndefOr[Boolean] = js.undefined
  var selected: js.UndefOr[Boolean] = js.undefined
  var selectedIcon: js.UndefOr[TabBarIcon] = js.undefined
  var styles: js.UndefOr[ReturnType[js.Function1[/* theme */ Theme, AnonBadge]]] = js.undefined
  var tintColor: js.UndefOr[String] = js.undefined
  var title: String
  var unselectedTintColor: js.UndefOr[String] = js.undefined
}

object TabBarItemProps {
  @scala.inline
  def apply(
    title: String,
    badge: String | Double = null,
    icon: TabBarIcon = null,
    iconStyle: StyleProp[ImageStyle] = null,
    onPress: js.UndefOr[Callback] = js.undefined,
    renderAsOriginal: js.UndefOr[Boolean] = js.undefined,
    selected: js.UndefOr[Boolean] = js.undefined,
    selectedIcon: TabBarIcon = null,
    styles: ReturnType[js.Function1[/* theme */ Theme, AnonBadge]] = null,
    tintColor: String = null,
    unselectedTintColor: String = null
  ): TabBarItemProps = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
    if (badge != null) __obj.updateDynamic("badge")(badge.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (iconStyle != null) __obj.updateDynamic("iconStyle")(iconStyle.asInstanceOf[js.Any])
    onPress.foreach(p => __obj.updateDynamic("onPress")(p.toJsFn))
    if (!js.isUndefined(renderAsOriginal)) __obj.updateDynamic("renderAsOriginal")(renderAsOriginal.asInstanceOf[js.Any])
    if (!js.isUndefined(selected)) __obj.updateDynamic("selected")(selected.asInstanceOf[js.Any])
    if (selectedIcon != null) __obj.updateDynamic("selectedIcon")(selectedIcon.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (tintColor != null) __obj.updateDynamic("tintColor")(tintColor.asInstanceOf[js.Any])
    if (unselectedTintColor != null) __obj.updateDynamic("unselectedTintColor")(unselectedTintColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabBarItemProps]
  }
}

