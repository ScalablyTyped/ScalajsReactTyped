package typingsJapgolly.rmcTabs.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Node
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.rmcTabs.defaultTabBarMod.PropsType
import typingsJapgolly.rmcTabs.modelsMod.Models.TabData
import typingsJapgolly.rmcTabs.rmcTabsStrings.bottom
import typingsJapgolly.rmcTabs.rmcTabsStrings.left
import typingsJapgolly.rmcTabs.rmcTabsStrings.right
import typingsJapgolly.rmcTabs.rmcTabsStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object DefaultTabBar {
  def apply(
    activeTab: Double,
    animated: Boolean,
    instanceId: Double,
    tabs: js.Array[TabData],
    goToTab: Double => Callback,
    onTabClick: (/* tab */ TabData, /* index */ Double) => Callback = null,
    page: Int | Double = null,
    prefixCls: String = null,
    renderTab: /* tab */ TabData => CallbackTo[Node] = null,
    renderUnderline: /* style */ CSSProperties | js.Any => CallbackTo[Node] = null,
    tabBarActiveTextColor: String = null,
    tabBarBackgroundColor: String = null,
    tabBarInactiveTextColor: String = null,
    tabBarPosition: top | bottom | left | right = null,
    tabBarTextStyle: CSSProperties | js.Any = null,
    tabBarUnderlineStyle: CSSProperties | js.Any = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[PropsType, typingsJapgolly.rmcTabs.mod.DefaultTabBar, Unit, PropsType] = {
    val __obj = js.Dynamic.literal(activeTab = activeTab.asInstanceOf[js.Any], animated = animated.asInstanceOf[js.Any], instanceId = instanceId.asInstanceOf[js.Any], tabs = tabs.asInstanceOf[js.Any])
  
      __obj.updateDynamic("goToTab")(js.Any.fromFunction1((t0: scala.Double) => goToTab(t0).runNow()))
    if (onTabClick != null) __obj.updateDynamic("onTabClick")(js.Any.fromFunction2((t0: /* tab */ typingsJapgolly.rmcTabs.modelsMod.Models.TabData, t1: /* index */ scala.Double) => onTabClick(t0, t1).runNow()))
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (renderTab != null) __obj.updateDynamic("renderTab")(js.Any.fromFunction1((t0: /* tab */ typingsJapgolly.rmcTabs.modelsMod.Models.TabData) => renderTab(t0).runNow()))
    if (renderUnderline != null) __obj.updateDynamic("renderUnderline")(js.Any.fromFunction1((t0: /* style */ typingsJapgolly.react.mod.CSSProperties | js.Any) => renderUnderline(t0).runNow()))
    if (tabBarActiveTextColor != null) __obj.updateDynamic("tabBarActiveTextColor")(tabBarActiveTextColor.asInstanceOf[js.Any])
    if (tabBarBackgroundColor != null) __obj.updateDynamic("tabBarBackgroundColor")(tabBarBackgroundColor.asInstanceOf[js.Any])
    if (tabBarInactiveTextColor != null) __obj.updateDynamic("tabBarInactiveTextColor")(tabBarInactiveTextColor.asInstanceOf[js.Any])
    if (tabBarPosition != null) __obj.updateDynamic("tabBarPosition")(tabBarPosition.asInstanceOf[js.Any])
    if (tabBarTextStyle != null) __obj.updateDynamic("tabBarTextStyle")(tabBarTextStyle.asInstanceOf[js.Any])
    if (tabBarUnderlineStyle != null) __obj.updateDynamic("tabBarUnderlineStyle")(tabBarUnderlineStyle.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.rmcTabs.defaultTabBarMod.PropsType, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.rmcTabs.mod.DefaultTabBar](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.rmcTabs.defaultTabBarMod.PropsType])(children: _*)
  }
  @JSImport("rmc-tabs", "DefaultTabBar")
  @js.native
  object componentImport extends js.Object
  
}

