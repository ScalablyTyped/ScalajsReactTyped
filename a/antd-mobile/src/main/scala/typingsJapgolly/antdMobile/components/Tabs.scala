package typingsJapgolly.antdMobile.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Node
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.antdMobile.tabsMod.default
import typingsJapgolly.antdMobile.tabsPropsTypeMod.TabsProps
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

object Tabs {
  def apply(
    tabs: js.Array[TabData],
    animated: js.UndefOr[Boolean] = js.undefined,
    destroyInactiveTab: js.UndefOr[Boolean] = js.undefined,
    distanceToChangeTab: Int | Double = null,
    initialPage: Double | String = null,
    noRenderContent: js.UndefOr[Boolean] = js.undefined,
    onChange: (/* tab */ TabData, /* index */ Double) => Callback = null,
    onTabClick: (/* tab */ TabData, /* index */ Double) => Callback = null,
    page: Double | String = null,
    prerenderingSiblingsNumber: Int | Double = null,
    renderTab: /* tab */ TabData => CallbackTo[Node] = null,
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
    usePaged: js.UndefOr[Boolean] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[TabsProps, default, Unit, TabsProps] = {
    val __obj = js.Dynamic.literal(tabs = tabs.asInstanceOf[js.Any])
  
      if (!js.isUndefined(animated)) __obj.updateDynamic("animated")(animated.asInstanceOf[js.Any])
    if (!js.isUndefined(destroyInactiveTab)) __obj.updateDynamic("destroyInactiveTab")(destroyInactiveTab.asInstanceOf[js.Any])
    if (distanceToChangeTab != null) __obj.updateDynamic("distanceToChangeTab")(distanceToChangeTab.asInstanceOf[js.Any])
    if (initialPage != null) __obj.updateDynamic("initialPage")(initialPage.asInstanceOf[js.Any])
    if (!js.isUndefined(noRenderContent)) __obj.updateDynamic("noRenderContent")(noRenderContent.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction2((t0: /* tab */ typingsJapgolly.rmcTabs.modelsMod.Models.TabData, t1: /* index */ scala.Double) => onChange(t0, t1).runNow()))
    if (onTabClick != null) __obj.updateDynamic("onTabClick")(js.Any.fromFunction2((t0: /* tab */ typingsJapgolly.rmcTabs.modelsMod.Models.TabData, t1: /* index */ scala.Double) => onTabClick(t0, t1).runNow()))
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (prerenderingSiblingsNumber != null) __obj.updateDynamic("prerenderingSiblingsNumber")(prerenderingSiblingsNumber.asInstanceOf[js.Any])
    if (renderTab != null) __obj.updateDynamic("renderTab")(js.Any.fromFunction1((t0: /* tab */ typingsJapgolly.rmcTabs.modelsMod.Models.TabData) => renderTab(t0).runNow()))
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
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.antdMobile.tabsPropsTypeMod.TabsProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.antdMobile.tabsMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.antdMobile.tabsPropsTypeMod.TabsProps])(children: _*)
  }
  @JSImport("antd-mobile/lib/tabs", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

