package typingsJapgolly.reactNativeScrollableTabView

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Element
import typingsJapgolly.reactNative.mod.Animated.Value
import typingsJapgolly.reactNative.mod.LayoutChangeEvent
import typingsJapgolly.reactNative.mod.TextStyle
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactNativeScrollableTabView.mod.RenderTabProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-native-scrollable-tab-view.react-native-scrollable-tab-view.TabBarProps<react-native-scrollable-tab-view.react-native-scrollable-tab-view.DefaultTabBarProps> */
trait TabBarPropsDefaultTabBarP extends js.Object {
  var activeTab: js.UndefOr[Double] = js.undefined
  var activeTextColor: js.UndefOr[String] = js.undefined
  var backgroundColor: js.UndefOr[String] = js.undefined
  var containerWidth: js.UndefOr[Double] = js.undefined
  var goToPage: js.UndefOr[js.Function1[/* pageNumber */ Double, Unit]] = js.undefined
  var inactiveTextColor: js.UndefOr[String] = js.undefined
  var renderTab: js.UndefOr[RenderTabProperties] = js.undefined
  var scrollValue: js.UndefOr[Value] = js.undefined
  var style: js.UndefOr[ViewStyle] = js.undefined
  var tabStyle: js.UndefOr[ViewStyle] = js.undefined
  var tabs: js.UndefOr[js.Array[Element]] = js.undefined
  var textStyle: js.UndefOr[TextStyle] = js.undefined
  var underlineStyle: js.UndefOr[ViewStyle] = js.undefined
}

object TabBarPropsDefaultTabBarP {
  @scala.inline
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
    underlineStyle: ViewStyle = null
  ): TabBarPropsDefaultTabBarP = {
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
    __obj.asInstanceOf[TabBarPropsDefaultTabBarP]
  }
}

