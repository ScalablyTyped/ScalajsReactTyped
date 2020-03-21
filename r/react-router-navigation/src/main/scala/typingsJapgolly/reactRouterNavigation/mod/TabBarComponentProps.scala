package typingsJapgolly.reactRouterNavigation.mod

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Element
import japgolly.scalajs.react.raw.React.Node
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.TextStyle
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactRouterNavigation.reactRouterNavigationStrings.bottom
import typingsJapgolly.reactRouterNavigation.reactRouterNavigationStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabBarComponentProps extends TabBarProps {
  var children: js.UndefOr[js.Array[Element]] = js.undefined
}

object TabBarComponentProps {
  @scala.inline
  def apply(
    children: js.Array[Element] = null,
    hideTabBar: js.UndefOr[Boolean] = js.undefined,
    label: String = null,
    labelStyle: StyleProp[TextStyle] = null,
    renderLabel: /* props */ TabSubViewProps => CallbackTo[Node] = null,
    renderTabBar: /* props */ TabSubViewProps => CallbackTo[Node] = null,
    renderTabIcon: /* props */ TabSubViewProps => CallbackTo[Node] = null,
    tabActiveTintColor: String = null,
    tabBarIndicatorStyle: StyleProp[ViewStyle] = null,
    tabBarPosition: top | bottom = null,
    tabBarStyle: StyleProp[ViewStyle] = null,
    tabStyle: StyleProp[ViewStyle] = null,
    tabTintColor: String = null
  ): TabBarComponentProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(hideTabBar)) __obj.updateDynamic("hideTabBar")(hideTabBar.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (labelStyle != null) __obj.updateDynamic("labelStyle")(labelStyle.asInstanceOf[js.Any])
    if (renderLabel != null) __obj.updateDynamic("renderLabel")(js.Any.fromFunction1((t0: /* props */ typingsJapgolly.reactRouterNavigation.mod.TabSubViewProps) => renderLabel(t0).runNow()))
    if (renderTabBar != null) __obj.updateDynamic("renderTabBar")(js.Any.fromFunction1((t0: /* props */ typingsJapgolly.reactRouterNavigation.mod.TabSubViewProps) => renderTabBar(t0).runNow()))
    if (renderTabIcon != null) __obj.updateDynamic("renderTabIcon")(js.Any.fromFunction1((t0: /* props */ typingsJapgolly.reactRouterNavigation.mod.TabSubViewProps) => renderTabIcon(t0).runNow()))
    if (tabActiveTintColor != null) __obj.updateDynamic("tabActiveTintColor")(tabActiveTintColor.asInstanceOf[js.Any])
    if (tabBarIndicatorStyle != null) __obj.updateDynamic("tabBarIndicatorStyle")(tabBarIndicatorStyle.asInstanceOf[js.Any])
    if (tabBarPosition != null) __obj.updateDynamic("tabBarPosition")(tabBarPosition.asInstanceOf[js.Any])
    if (tabBarStyle != null) __obj.updateDynamic("tabBarStyle")(tabBarStyle.asInstanceOf[js.Any])
    if (tabStyle != null) __obj.updateDynamic("tabStyle")(tabStyle.asInstanceOf[js.Any])
    if (tabTintColor != null) __obj.updateDynamic("tabTintColor")(tabTintColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabBarComponentProps]
  }
}

