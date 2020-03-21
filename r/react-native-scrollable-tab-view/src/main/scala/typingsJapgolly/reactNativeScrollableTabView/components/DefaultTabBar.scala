package typingsJapgolly.reactNativeScrollableTabView.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Element
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactNative.mod.Animated.Value
import typingsJapgolly.reactNative.mod.LayoutChangeEvent
import typingsJapgolly.reactNative.mod.TextStyle
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactNativeScrollableTabView.TabBarPropsDefaultTabBarP
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object DefaultTabBar {
  def apply(
    activeTab: Int | Double = null,
    activeTextColor: String = null,
    backgroundColor: String = null,
    containerWidth: Int | Double = null,
    goToPage: /* pageNumber */ Double => Callback = null,
    inactiveTextColor: String = null,
    renderTab: (/* name */ String, /* pageIndex */ Double, /* isTabActive */ Boolean, /* onPressHandler */ js.Function1[/* pageNumber */ Double, Unit], /* onLayoutHandler */ js.UndefOr[js.Function1[/* event */ LayoutChangeEvent, Unit]]) => CallbackTo[Element] = null,
    scrollValue: Value = null,
    style: ViewStyle = null,
    tabStyle: ViewStyle = null,
    tabs: js.Array[Element] = null,
    textStyle: TextStyle = null,
    underlineStyle: ViewStyle = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    TabBarPropsDefaultTabBarP, 
    typingsJapgolly.reactNativeScrollableTabView.mod.DefaultTabBar, 
    Unit, 
    TabBarPropsDefaultTabBarP
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (activeTab != null) __obj.updateDynamic("activeTab")(activeTab.asInstanceOf[js.Any])
    if (activeTextColor != null) __obj.updateDynamic("activeTextColor")(activeTextColor.asInstanceOf[js.Any])
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (containerWidth != null) __obj.updateDynamic("containerWidth")(containerWidth.asInstanceOf[js.Any])
    if (goToPage != null) __obj.updateDynamic("goToPage")(js.Any.fromFunction1((t0: /* pageNumber */ scala.Double) => goToPage(t0).runNow()))
    if (inactiveTextColor != null) __obj.updateDynamic("inactiveTextColor")(inactiveTextColor.asInstanceOf[js.Any])
    if (renderTab != null) __obj.updateDynamic("renderTab")(js.Any.fromFunction5((t0: /* name */ java.lang.String, t1: /* pageIndex */ scala.Double, t2: /* isTabActive */ scala.Boolean, t3: /* onPressHandler */ js.Function1[/* pageNumber */ scala.Double, scala.Unit], t4: /* onLayoutHandler */ js.UndefOr[
  js.Function1[/* event */ typingsJapgolly.reactNative.mod.LayoutChangeEvent, scala.Unit]]) => renderTab(t0, t1, t2, t3, t4).runNow()))
    if (scrollValue != null) __obj.updateDynamic("scrollValue")(scrollValue.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (tabStyle != null) __obj.updateDynamic("tabStyle")(tabStyle.asInstanceOf[js.Any])
    if (tabs != null) __obj.updateDynamic("tabs")(tabs.asInstanceOf[js.Any])
    if (textStyle != null) __obj.updateDynamic("textStyle")(textStyle.asInstanceOf[js.Any])
    if (underlineStyle != null) __obj.updateDynamic("underlineStyle")(underlineStyle.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactNativeScrollableTabView.TabBarPropsDefaultTabBarP, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactNativeScrollableTabView.mod.DefaultTabBar](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactNativeScrollableTabView.TabBarPropsDefaultTabBarP])(children: _*)
  }
  @JSImport("react-native-scrollable-tab-view", "DefaultTabBar")
  @js.native
  object componentImport extends js.Object
  
}

