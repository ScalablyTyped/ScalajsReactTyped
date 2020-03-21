package typingsJapgolly.rmcTabs

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.rmcTabs.modelsMod.Models.TabData
import typingsJapgolly.rmcTabs.propsTypeMod.TabBarPropsType
import typingsJapgolly.rmcTabs.rmcTabsBooleans.`false`
import typingsJapgolly.rmcTabs.rmcTabsStrings.bottom
import typingsJapgolly.rmcTabs.rmcTabsStrings.horizontal
import typingsJapgolly.rmcTabs.rmcTabsStrings.left
import typingsJapgolly.rmcTabs.rmcTabsStrings.right
import typingsJapgolly.rmcTabs.rmcTabsStrings.top
import typingsJapgolly.rmcTabs.rmcTabsStrings.vertical
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<{  children ? :react.react.ReactNode}> & std.Readonly<rmc-tabs.rmc-tabs/lib/Tabs.PropsType> */
trait ReadonlychildrenReactNode extends js.Object {
  val animated: js.UndefOr[Boolean] = js.undefined
  val children: js.UndefOr[Node] = js.undefined
  val destroyInactiveTab: js.UndefOr[Boolean] = js.undefined
  val distanceToChangeTab: js.UndefOr[Double] = js.undefined
  val initialPage: js.UndefOr[Double | String] = js.undefined
  val noRenderContent: js.UndefOr[Boolean] = js.undefined
  val onChange: js.UndefOr[js.Function2[/* tab */ TabData, /* index */ Double, Unit]] = js.undefined
  val onTabClick: js.UndefOr[js.Function2[/* tab */ TabData, /* index */ Double, Unit]] = js.undefined
  val page: js.UndefOr[Double | String] = js.undefined
  val prefixCls: js.UndefOr[String] = js.undefined
  val prerenderingSiblingsNumber: js.UndefOr[Double] = js.undefined
  val renderTabBar: js.UndefOr[(js.Function1[/* props */ TabBarPropsType, Node]) | `false`] = js.undefined
  val swipeable: js.UndefOr[Boolean] = js.undefined
  val tabBarActiveTextColor: js.UndefOr[String] = js.undefined
  val tabBarBackgroundColor: js.UndefOr[String] = js.undefined
  val tabBarInactiveTextColor: js.UndefOr[String] = js.undefined
  val tabBarPosition: js.UndefOr[top | bottom | left | right] = js.undefined
  val tabBarTextStyle: js.UndefOr[CSSProperties | js.Any] = js.undefined
  val tabBarUnderlineStyle: js.UndefOr[CSSProperties | js.Any] = js.undefined
  val tabDirection: js.UndefOr[horizontal | vertical] = js.undefined
  val tabs: js.Array[TabData]
  val useLeftInsteadTransform: js.UndefOr[Boolean] = js.undefined
  val useOnPan: js.UndefOr[Boolean] = js.undefined
  val usePaged: js.UndefOr[Boolean] = js.undefined
}

object ReadonlychildrenReactNode {
  @scala.inline
  def apply(
    tabs: js.Array[TabData],
    animated: js.UndefOr[Boolean] = js.undefined,
    children: VdomNode = null,
    destroyInactiveTab: js.UndefOr[Boolean] = js.undefined,
    distanceToChangeTab: Int | Double = null,
    initialPage: Double | String = null,
    noRenderContent: js.UndefOr[Boolean] = js.undefined,
    onChange: (/* tab */ TabData, /* index */ Double) => Callback = null,
    onTabClick: (/* tab */ TabData, /* index */ Double) => Callback = null,
    page: Double | String = null,
    prefixCls: String = null,
    prerenderingSiblingsNumber: Int | Double = null,
    renderTabBar: (js.Function1[/* props */ TabBarPropsType, Node]) | `false` = null,
    swipeable: js.UndefOr[Boolean] = js.undefined,
    tabBarActiveTextColor: String = null,
    tabBarBackgroundColor: String = null,
    tabBarInactiveTextColor: String = null,
    tabBarPosition: top | bottom | left | right = null,
    tabBarTextStyle: CSSProperties | js.Any = null,
    tabBarUnderlineStyle: CSSProperties | js.Any = null,
    tabDirection: horizontal | vertical = null,
    useLeftInsteadTransform: js.UndefOr[Boolean] = js.undefined,
    useOnPan: js.UndefOr[Boolean] = js.undefined,
    usePaged: js.UndefOr[Boolean] = js.undefined
  ): ReadonlychildrenReactNode = {
    val __obj = js.Dynamic.literal(tabs = tabs.asInstanceOf[js.Any])
    if (!js.isUndefined(animated)) __obj.updateDynamic("animated")(animated.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    if (!js.isUndefined(destroyInactiveTab)) __obj.updateDynamic("destroyInactiveTab")(destroyInactiveTab.asInstanceOf[js.Any])
    if (distanceToChangeTab != null) __obj.updateDynamic("distanceToChangeTab")(distanceToChangeTab.asInstanceOf[js.Any])
    if (initialPage != null) __obj.updateDynamic("initialPage")(initialPage.asInstanceOf[js.Any])
    if (!js.isUndefined(noRenderContent)) __obj.updateDynamic("noRenderContent")(noRenderContent.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction2((t0: /* tab */ typingsJapgolly.rmcTabs.modelsMod.Models.TabData, t1: /* index */ scala.Double) => onChange(t0, t1).runNow()))
    if (onTabClick != null) __obj.updateDynamic("onTabClick")(js.Any.fromFunction2((t0: /* tab */ typingsJapgolly.rmcTabs.modelsMod.Models.TabData, t1: /* index */ scala.Double) => onTabClick(t0, t1).runNow()))
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (prerenderingSiblingsNumber != null) __obj.updateDynamic("prerenderingSiblingsNumber")(prerenderingSiblingsNumber.asInstanceOf[js.Any])
    if (renderTabBar != null) __obj.updateDynamic("renderTabBar")(renderTabBar.asInstanceOf[js.Any])
    if (!js.isUndefined(swipeable)) __obj.updateDynamic("swipeable")(swipeable.asInstanceOf[js.Any])
    if (tabBarActiveTextColor != null) __obj.updateDynamic("tabBarActiveTextColor")(tabBarActiveTextColor.asInstanceOf[js.Any])
    if (tabBarBackgroundColor != null) __obj.updateDynamic("tabBarBackgroundColor")(tabBarBackgroundColor.asInstanceOf[js.Any])
    if (tabBarInactiveTextColor != null) __obj.updateDynamic("tabBarInactiveTextColor")(tabBarInactiveTextColor.asInstanceOf[js.Any])
    if (tabBarPosition != null) __obj.updateDynamic("tabBarPosition")(tabBarPosition.asInstanceOf[js.Any])
    if (tabBarTextStyle != null) __obj.updateDynamic("tabBarTextStyle")(tabBarTextStyle.asInstanceOf[js.Any])
    if (tabBarUnderlineStyle != null) __obj.updateDynamic("tabBarUnderlineStyle")(tabBarUnderlineStyle.asInstanceOf[js.Any])
    if (tabDirection != null) __obj.updateDynamic("tabDirection")(tabDirection.asInstanceOf[js.Any])
    if (!js.isUndefined(useLeftInsteadTransform)) __obj.updateDynamic("useLeftInsteadTransform")(useLeftInsteadTransform.asInstanceOf[js.Any])
    if (!js.isUndefined(useOnPan)) __obj.updateDynamic("useOnPan")(useOnPan.asInstanceOf[js.Any])
    if (!js.isUndefined(usePaged)) __obj.updateDynamic("usePaged")(usePaged.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlychildrenReactNode]
  }
}

