package typingsJapgolly.rmcTabs.propsTypeMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Node
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.rmcTabs.modelsMod.Models.TabData
import typingsJapgolly.rmcTabs.rmcTabsStrings.bottom
import typingsJapgolly.rmcTabs.rmcTabsStrings.left
import typingsJapgolly.rmcTabs.rmcTabsStrings.right
import typingsJapgolly.rmcTabs.rmcTabsStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabBarPropsType extends js.Object {
  /** current active tab */
  var activeTab: Double
  /** use animate | default: true */
  var animated: Boolean
  var instanceId: Double
  /** on tab click */
  var onTabClick: js.UndefOr[js.Function2[/* tab */ TabData, /* index */ Double, Unit]] = js.undefined
  /** page size of tabbar's tab | default: 5 */
  var page: js.UndefOr[Double] = js.undefined
  /** render the tab of tabbar */
  var renderTab: js.UndefOr[js.Function1[/* tab */ TabData, Node]] = js.undefined
  /** render the underline of tabbar */
  var renderUnderline: js.UndefOr[js.Function1[/* style */ CSSProperties | js.Any, Node]] = js.undefined
  /** tabBar active text color */
  var tabBarActiveTextColor: js.UndefOr[String] = js.undefined
  /** tabBar background color */
  var tabBarBackgroundColor: js.UndefOr[String] = js.undefined
  /** tabBar inactive text color */
  var tabBarInactiveTextColor: js.UndefOr[String] = js.undefined
  /** tabBar's position | defualt: top */
  var tabBarPosition: js.UndefOr[top | bottom | left | right] = js.undefined
  /** tabBar text style */
  var tabBarTextStyle: js.UndefOr[CSSProperties | js.Any] = js.undefined
  /** tabBar underline style */
  var tabBarUnderlineStyle: js.UndefOr[CSSProperties | js.Any] = js.undefined
  /** tabs data */
  var tabs: js.Array[TabData]
  /** call this function to switch tab */
  def goToTab(index: Double): Unit
}

object TabBarPropsType {
  @scala.inline
  def apply(
    activeTab: Double,
    animated: Boolean,
    goToTab: Double => Callback,
    instanceId: Double,
    tabs: js.Array[TabData],
    onTabClick: (/* tab */ TabData, /* index */ Double) => Callback = null,
    page: Int | Double = null,
    renderTab: /* tab */ TabData => CallbackTo[Node] = null,
    renderUnderline: /* style */ CSSProperties | js.Any => CallbackTo[Node] = null,
    tabBarActiveTextColor: String = null,
    tabBarBackgroundColor: String = null,
    tabBarInactiveTextColor: String = null,
    tabBarPosition: top | bottom | left | right = null,
    tabBarTextStyle: CSSProperties | js.Any = null,
    tabBarUnderlineStyle: CSSProperties | js.Any = null
  ): TabBarPropsType = {
    val __obj = js.Dynamic.literal(activeTab = activeTab.asInstanceOf[js.Any], animated = animated.asInstanceOf[js.Any], instanceId = instanceId.asInstanceOf[js.Any], tabs = tabs.asInstanceOf[js.Any])
    __obj.updateDynamic("goToTab")(js.Any.fromFunction1((t0: scala.Double) => goToTab(t0).runNow()))
    if (onTabClick != null) __obj.updateDynamic("onTabClick")(js.Any.fromFunction2((t0: /* tab */ typingsJapgolly.rmcTabs.modelsMod.Models.TabData, t1: /* index */ scala.Double) => onTabClick(t0, t1).runNow()))
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (renderTab != null) __obj.updateDynamic("renderTab")(js.Any.fromFunction1((t0: /* tab */ typingsJapgolly.rmcTabs.modelsMod.Models.TabData) => renderTab(t0).runNow()))
    if (renderUnderline != null) __obj.updateDynamic("renderUnderline")(js.Any.fromFunction1((t0: /* style */ typingsJapgolly.react.mod.CSSProperties | js.Any) => renderUnderline(t0).runNow()))
    if (tabBarActiveTextColor != null) __obj.updateDynamic("tabBarActiveTextColor")(tabBarActiveTextColor.asInstanceOf[js.Any])
    if (tabBarBackgroundColor != null) __obj.updateDynamic("tabBarBackgroundColor")(tabBarBackgroundColor.asInstanceOf[js.Any])
    if (tabBarInactiveTextColor != null) __obj.updateDynamic("tabBarInactiveTextColor")(tabBarInactiveTextColor.asInstanceOf[js.Any])
    if (tabBarPosition != null) __obj.updateDynamic("tabBarPosition")(tabBarPosition.asInstanceOf[js.Any])
    if (tabBarTextStyle != null) __obj.updateDynamic("tabBarTextStyle")(tabBarTextStyle.asInstanceOf[js.Any])
    if (tabBarUnderlineStyle != null) __obj.updateDynamic("tabBarUnderlineStyle")(tabBarUnderlineStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabBarPropsType]
  }
}

