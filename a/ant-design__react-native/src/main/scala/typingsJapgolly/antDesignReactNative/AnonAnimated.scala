package typingsJapgolly.antDesignReactNative

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Node
import typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.bottom
import typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.top
import typingsJapgolly.antDesignReactNative.tabsPropsTypeMod.TabData
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.TextStyle
import typingsJapgolly.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAnimated extends js.Object {
  var activeTab: Double
  var animated: Boolean
  var goToTab: js.Any
  var instanceId: Double
  var onTabClick: js.UndefOr[js.Function2[/* tab */ TabData, /* index */ Double, Unit]] = js.undefined
  var renderTab: js.UndefOr[js.Function1[/* tab */ TabData, Node]] = js.undefined
  var renderUnderline: js.UndefOr[js.Function1[/* style */ js.Any, Node]] = js.undefined
  var tabBarActiveTextColor: js.UndefOr[String] = js.undefined
  var tabBarBackgroundColor: js.UndefOr[String] = js.undefined
  var tabBarInactiveTextColor: js.UndefOr[String] = js.undefined
  var tabBarPosition: js.UndefOr[top | bottom] = js.undefined
  var tabBarTextStyle: StyleProp[TextStyle]
  var tabBarUnderlineStyle: StyleProp[ViewStyle]
  var tabs: js.Array[TabData]
}

object AnonAnimated {
  @scala.inline
  def apply(
    activeTab: Double,
    animated: Boolean,
    goToTab: js.Any,
    instanceId: Double,
    tabs: js.Array[TabData],
    onTabClick: (/* tab */ TabData, /* index */ Double) => Callback = null,
    renderTab: /* tab */ TabData => CallbackTo[Node] = null,
    renderUnderline: /* style */ js.Any => CallbackTo[Node] = null,
    tabBarActiveTextColor: String = null,
    tabBarBackgroundColor: String = null,
    tabBarInactiveTextColor: String = null,
    tabBarPosition: top | bottom = null,
    tabBarTextStyle: StyleProp[TextStyle] = null,
    tabBarUnderlineStyle: StyleProp[ViewStyle] = null
  ): AnonAnimated = {
    val __obj = js.Dynamic.literal(activeTab = activeTab.asInstanceOf[js.Any], animated = animated.asInstanceOf[js.Any], goToTab = goToTab.asInstanceOf[js.Any], instanceId = instanceId.asInstanceOf[js.Any], tabs = tabs.asInstanceOf[js.Any])
    if (onTabClick != null) __obj.updateDynamic("onTabClick")(js.Any.fromFunction2((t0: /* tab */ typingsJapgolly.antDesignReactNative.tabsPropsTypeMod.TabData, t1: /* index */ scala.Double) => onTabClick(t0, t1).runNow()))
    if (renderTab != null) __obj.updateDynamic("renderTab")(js.Any.fromFunction1((t0: /* tab */ typingsJapgolly.antDesignReactNative.tabsPropsTypeMod.TabData) => renderTab(t0).runNow()))
    if (renderUnderline != null) __obj.updateDynamic("renderUnderline")(js.Any.fromFunction1((t0: /* style */ js.Any) => renderUnderline(t0).runNow()))
    if (tabBarActiveTextColor != null) __obj.updateDynamic("tabBarActiveTextColor")(tabBarActiveTextColor.asInstanceOf[js.Any])
    if (tabBarBackgroundColor != null) __obj.updateDynamic("tabBarBackgroundColor")(tabBarBackgroundColor.asInstanceOf[js.Any])
    if (tabBarInactiveTextColor != null) __obj.updateDynamic("tabBarInactiveTextColor")(tabBarInactiveTextColor.asInstanceOf[js.Any])
    if (tabBarPosition != null) __obj.updateDynamic("tabBarPosition")(tabBarPosition.asInstanceOf[js.Any])
    if (tabBarTextStyle != null) __obj.updateDynamic("tabBarTextStyle")(tabBarTextStyle.asInstanceOf[js.Any])
    if (tabBarUnderlineStyle != null) __obj.updateDynamic("tabBarUnderlineStyle")(tabBarUnderlineStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAnimated]
  }
}

