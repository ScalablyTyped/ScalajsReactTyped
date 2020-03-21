package typingsJapgolly.antDesignReactNative.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Node
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.bottom
import typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.left
import typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.right
import typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.top
import typingsJapgolly.antDesignReactNative.defaultTabBarMod.PropsType
import typingsJapgolly.antDesignReactNative.tabsPropsTypeMod.TabData
import typingsJapgolly.antDesignReactNative.tabsStyleMod.TabBarStyle
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.TextStyle
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.std.Partial
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
    dynamicTabUnderlineWidth: js.UndefOr[Boolean] = js.undefined,
    keyboardShouldPersistTaps: js.UndefOr[Boolean] = js.undefined,
    onTabClick: (/* tab */ TabData, /* index */ Double) => Callback = null,
    page: Int | Double = null,
    renderTab: /* tab */ TabData => CallbackTo[Node] = null,
    renderUnderline: /* style */ js.Any => CallbackTo[Node] = null,
    scrollValue: js.Any = null,
    styles: Partial[TabBarStyle] = null,
    tabBarActiveTextColor: String = null,
    tabBarBackgroundColor: String = null,
    tabBarInactiveTextColor: String = null,
    tabBarPosition: top | bottom | left | right = null,
    tabBarTextStyle: StyleProp[TextStyle] = null,
    tabBarUnderlineStyle: StyleProp[ViewStyle] = null,
    tabStyle: ViewStyle = null,
    tabsContainerStyle: ViewStyle = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    PropsType, 
    typingsJapgolly.antDesignReactNative.defaultTabBarMod.DefaultTabBar, 
    Unit, 
    PropsType
  ] = {
    val __obj = js.Dynamic.literal(activeTab = activeTab.asInstanceOf[js.Any], animated = animated.asInstanceOf[js.Any], instanceId = instanceId.asInstanceOf[js.Any], tabs = tabs.asInstanceOf[js.Any])
  
      __obj.updateDynamic("goToTab")(js.Any.fromFunction1((t0: scala.Double) => goToTab(t0).runNow()))
    if (!js.isUndefined(dynamicTabUnderlineWidth)) __obj.updateDynamic("dynamicTabUnderlineWidth")(dynamicTabUnderlineWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(keyboardShouldPersistTaps)) __obj.updateDynamic("keyboardShouldPersistTaps")(keyboardShouldPersistTaps.asInstanceOf[js.Any])
    if (onTabClick != null) __obj.updateDynamic("onTabClick")(js.Any.fromFunction2((t0: /* tab */ typingsJapgolly.antDesignReactNative.tabsPropsTypeMod.TabData, t1: /* index */ scala.Double) => onTabClick(t0, t1).runNow()))
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (renderTab != null) __obj.updateDynamic("renderTab")(js.Any.fromFunction1((t0: /* tab */ typingsJapgolly.antDesignReactNative.tabsPropsTypeMod.TabData) => renderTab(t0).runNow()))
    if (renderUnderline != null) __obj.updateDynamic("renderUnderline")(js.Any.fromFunction1((t0: /* style */ js.Any) => renderUnderline(t0).runNow()))
    if (scrollValue != null) __obj.updateDynamic("scrollValue")(scrollValue.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (tabBarActiveTextColor != null) __obj.updateDynamic("tabBarActiveTextColor")(tabBarActiveTextColor.asInstanceOf[js.Any])
    if (tabBarBackgroundColor != null) __obj.updateDynamic("tabBarBackgroundColor")(tabBarBackgroundColor.asInstanceOf[js.Any])
    if (tabBarInactiveTextColor != null) __obj.updateDynamic("tabBarInactiveTextColor")(tabBarInactiveTextColor.asInstanceOf[js.Any])
    if (tabBarPosition != null) __obj.updateDynamic("tabBarPosition")(tabBarPosition.asInstanceOf[js.Any])
    if (tabBarTextStyle != null) __obj.updateDynamic("tabBarTextStyle")(tabBarTextStyle.asInstanceOf[js.Any])
    if (tabBarUnderlineStyle != null) __obj.updateDynamic("tabBarUnderlineStyle")(tabBarUnderlineStyle.asInstanceOf[js.Any])
    if (tabStyle != null) __obj.updateDynamic("tabStyle")(tabStyle.asInstanceOf[js.Any])
    if (tabsContainerStyle != null) __obj.updateDynamic("tabsContainerStyle")(tabsContainerStyle.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.antDesignReactNative.defaultTabBarMod.PropsType, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.antDesignReactNative.defaultTabBarMod.DefaultTabBar](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.antDesignReactNative.defaultTabBarMod.PropsType])(children: _*)
  }
  @JSImport("@ant-design/react-native/lib/tabs/DefaultTabBar", "DefaultTabBar")
  @js.native
  object componentImport extends js.Object
  
}

