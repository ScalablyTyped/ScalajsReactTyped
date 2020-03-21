package typingsJapgolly.antdMobile.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.antdMobile.tabBarPropsTypeMod.TabIcon
import typingsJapgolly.antdMobile.tabMod.TabProps
import typingsJapgolly.antdMobile.tabMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Tab {
  def apply(
    prefixCls: String,
    badge: String | Double = null,
    dataAttrs: StringDictionary[String] = null,
    dot: js.UndefOr[Boolean] = js.undefined,
    icon: TabIcon = null,
    onClick: js.UndefOr[Callback] = js.undefined,
    selected: js.UndefOr[Boolean] = js.undefined,
    selectedIcon: TabIcon = null,
    tintColor: String = null,
    title: String = null,
    unselectedTintColor: String = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[TabProps, default, Unit, TabProps] = {
    val __obj = js.Dynamic.literal(prefixCls = prefixCls.asInstanceOf[js.Any])
  
      if (badge != null) __obj.updateDynamic("badge")(badge.asInstanceOf[js.Any])
    if (dataAttrs != null) __obj.updateDynamic("dataAttrs")(dataAttrs.asInstanceOf[js.Any])
    if (!js.isUndefined(dot)) __obj.updateDynamic("dot")(dot.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    onClick.foreach(p => __obj.updateDynamic("onClick")(p.toJsFn))
    if (!js.isUndefined(selected)) __obj.updateDynamic("selected")(selected.asInstanceOf[js.Any])
    if (selectedIcon != null) __obj.updateDynamic("selectedIcon")(selectedIcon.asInstanceOf[js.Any])
    if (tintColor != null) __obj.updateDynamic("tintColor")(tintColor.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (unselectedTintColor != null) __obj.updateDynamic("unselectedTintColor")(unselectedTintColor.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.antdMobile.tabMod.TabProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.antdMobile.tabMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.antdMobile.tabMod.TabProps])(children: _*)
  }
  @JSImport("antd-mobile/lib/tab-bar/Tab", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

