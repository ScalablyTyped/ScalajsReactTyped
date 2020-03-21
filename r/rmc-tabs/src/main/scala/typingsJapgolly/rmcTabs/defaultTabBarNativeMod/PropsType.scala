package typingsJapgolly.rmcTabs.defaultTabBarNativeMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Node
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.rmcTabs.AnonTabBar
import typingsJapgolly.rmcTabs.modelsMod.Models.TabData
import typingsJapgolly.rmcTabs.propsTypeMod.TabBarPropsType
import typingsJapgolly.rmcTabs.rmcTabsStrings.bottom
import typingsJapgolly.rmcTabs.rmcTabsStrings.left
import typingsJapgolly.rmcTabs.rmcTabsStrings.right
import typingsJapgolly.rmcTabs.rmcTabsStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PropsType extends TabBarPropsType {
  /** default: false */
  var dynamicTabUnderlineWidth: js.UndefOr[Boolean] = js.undefined
  var keyboardShouldPersistTaps: js.UndefOr[Boolean] = js.undefined
  var scrollValue: js.UndefOr[js.Any] = js.undefined
  var styles: js.UndefOr[AnonTabBar] = js.undefined
  var tabStyle: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RN.ViewStyle */ js.Any
  ] = js.undefined
  var tabsContainerStyle: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RN.ViewStyle */ js.Any
  ] = js.undefined
}

object PropsType {
  @scala.inline
  def apply(
    activeTab: Double,
    animated: Boolean,
    goToTab: Double => Callback,
    instanceId: Double,
    tabs: js.Array[TabData],
    dynamicTabUnderlineWidth: js.UndefOr[Boolean] = js.undefined,
    keyboardShouldPersistTaps: js.UndefOr[Boolean] = js.undefined,
    onTabClick: (/* tab */ TabData, /* index */ Double) => Callback = null,
    page: Int | Double = null,
    renderTab: /* tab */ TabData => CallbackTo[Node] = null,
    renderUnderline: /* style */ CSSProperties | js.Any => CallbackTo[Node] = null,
    scrollValue: js.Any = null,
    styles: AnonTabBar = null,
    tabBarActiveTextColor: String = null,
    tabBarBackgroundColor: String = null,
    tabBarInactiveTextColor: String = null,
    tabBarPosition: top | bottom | left | right = null,
    tabBarTextStyle: CSSProperties | js.Any = null,
    tabBarUnderlineStyle: CSSProperties | js.Any = null,
    tabStyle: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RN.ViewStyle */ js.Any = null,
    tabsContainerStyle: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RN.ViewStyle */ js.Any = null
  ): PropsType = {
    val __obj = js.Dynamic.literal(activeTab = activeTab.asInstanceOf[js.Any], animated = animated.asInstanceOf[js.Any], instanceId = instanceId.asInstanceOf[js.Any], tabs = tabs.asInstanceOf[js.Any])
    __obj.updateDynamic("goToTab")(js.Any.fromFunction1((t0: scala.Double) => goToTab(t0).runNow()))
    if (!js.isUndefined(dynamicTabUnderlineWidth)) __obj.updateDynamic("dynamicTabUnderlineWidth")(dynamicTabUnderlineWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(keyboardShouldPersistTaps)) __obj.updateDynamic("keyboardShouldPersistTaps")(keyboardShouldPersistTaps.asInstanceOf[js.Any])
    if (onTabClick != null) __obj.updateDynamic("onTabClick")(js.Any.fromFunction2((t0: /* tab */ typingsJapgolly.rmcTabs.modelsMod.Models.TabData, t1: /* index */ scala.Double) => onTabClick(t0, t1).runNow()))
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (renderTab != null) __obj.updateDynamic("renderTab")(js.Any.fromFunction1((t0: /* tab */ typingsJapgolly.rmcTabs.modelsMod.Models.TabData) => renderTab(t0).runNow()))
    if (renderUnderline != null) __obj.updateDynamic("renderUnderline")(js.Any.fromFunction1((t0: /* style */ typingsJapgolly.react.mod.CSSProperties | js.Any) => renderUnderline(t0).runNow()))
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
    __obj.asInstanceOf[PropsType]
  }
}

