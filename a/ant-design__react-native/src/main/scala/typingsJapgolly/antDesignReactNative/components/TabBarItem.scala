package typingsJapgolly.antDesignReactNative.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.antDesignReactNative.AnonBadge
import typingsJapgolly.antDesignReactNative.libStyleMod.Theme
import typingsJapgolly.antDesignReactNative.tabBarItemMod.TabBarItemProps
import typingsJapgolly.antDesignReactNative.tabBarItemMod.default
import typingsJapgolly.antDesignReactNative.tabBarPropsTypeMod.TabBarIcon
import typingsJapgolly.reactNative.mod.ImageStyle
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.std.ReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object TabBarItem {
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
    unselectedTintColor: String = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[TabBarItemProps, default, Unit, TabBarItemProps] = {
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
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.antDesignReactNative.tabBarItemMod.TabBarItemProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.antDesignReactNative.tabBarItemMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.antDesignReactNative.tabBarItemMod.TabBarItemProps])(children: _*)
  }
  @JSImport("@ant-design/react-native/lib/tab-bar/TabBarItem", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

