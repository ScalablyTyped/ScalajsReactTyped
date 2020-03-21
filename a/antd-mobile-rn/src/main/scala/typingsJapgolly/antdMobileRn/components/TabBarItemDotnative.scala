package typingsJapgolly.antdMobileRn.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.antdMobileRn.tabBarItemNativeMod.TabBarItemProps
import typingsJapgolly.antdMobileRn.tabBarItemNativeMod.default
import typingsJapgolly.reactNative.mod.ImageRequireSource
import typingsJapgolly.reactNative.mod.ImageStyle
import typingsJapgolly.reactNative.mod.ImageURISource
import typingsJapgolly.reactNative.mod.StyleProp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object TabBarItemDotnative {
  def apply(
    title: String,
    badge: String | Double = null,
    icon: ImageURISource | js.Array[ImageURISource] | ImageRequireSource = null,
    iconStyle: StyleProp[ImageStyle] = null,
    onPress: js.UndefOr[Callback] = js.undefined,
    renderAsOriginal: js.UndefOr[Boolean] = js.undefined,
    selected: js.UndefOr[Boolean] = js.undefined,
    selectedIcon: ImageURISource | js.Array[ImageURISource] | ImageRequireSource = null,
    styles: js.Any = null,
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
  typingsJapgolly.antdMobileRn.tabBarItemNativeMod.TabBarItemProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.antdMobileRn.tabBarItemNativeMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.antdMobileRn.tabBarItemNativeMod.TabBarItemProps])(children: _*)
  }
  @JSImport("antd-mobile-rn/lib/tab-bar/TabBarItem.native", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

