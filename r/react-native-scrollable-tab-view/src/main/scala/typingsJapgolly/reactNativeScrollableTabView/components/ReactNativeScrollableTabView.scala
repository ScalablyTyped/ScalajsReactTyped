package typingsJapgolly.reactNativeScrollableTabView.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Element
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactNative.mod.ScrollViewProps
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.TextStyle
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactNativeScrollableTabView.TabBarProps
import typingsJapgolly.reactNativeScrollableTabView.mod.ChangeTabProperties
import typingsJapgolly.reactNativeScrollableTabView.mod.ScrollableTabViewProperties
import typingsJapgolly.reactNativeScrollableTabView.mod.default
import typingsJapgolly.reactNativeScrollableTabView.reactNativeScrollableTabViewBooleans.`false`
import typingsJapgolly.reactNativeScrollableTabView.reactNativeScrollableTabViewStrings.bottom
import typingsJapgolly.reactNativeScrollableTabView.reactNativeScrollableTabViewStrings.overlayBottom
import typingsJapgolly.reactNativeScrollableTabView.reactNativeScrollableTabViewStrings.overlayTop
import typingsJapgolly.reactNativeScrollableTabView.reactNativeScrollableTabViewStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactNativeScrollableTabView {
  def apply(
    contentProps: ScrollViewProps = null,
    initialPage: Int | Double = null,
    locked: js.UndefOr[Boolean] = js.undefined,
    onChangeTab: /* value */ ChangeTabProperties => Callback = null,
    onScroll: /* value */ Double => Callback = null,
    page: Int | Double = null,
    prerenderingSiblingsNumber: Int | Double = null,
    renderTabBar: (js.Function1[/* props */ TabBarProps, Element]) | `false` = null,
    scrollWithoutAnimation: js.UndefOr[Boolean] = js.undefined,
    style: StyleProp[ViewStyle] = null,
    tabBarActiveTextColor: String = null,
    tabBarBackgroundColor: String = null,
    tabBarInactiveTextColor: String = null,
    tabBarPosition: top | bottom | overlayTop | overlayBottom = null,
    tabBarTextStyle: StyleProp[TextStyle] = null,
    tabBarUnderlineStyle: StyleProp[ViewStyle] = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[ScrollableTabViewProperties, default, Unit, ScrollableTabViewProperties] = {
    val __obj = js.Dynamic.literal()
  
      if (contentProps != null) __obj.updateDynamic("contentProps")(contentProps.asInstanceOf[js.Any])
    if (initialPage != null) __obj.updateDynamic("initialPage")(initialPage.asInstanceOf[js.Any])
    if (!js.isUndefined(locked)) __obj.updateDynamic("locked")(locked.asInstanceOf[js.Any])
    if (onChangeTab != null) __obj.updateDynamic("onChangeTab")(js.Any.fromFunction1((t0: /* value */ typingsJapgolly.reactNativeScrollableTabView.mod.ChangeTabProperties) => onChangeTab(t0).runNow()))
    if (onScroll != null) __obj.updateDynamic("onScroll")(js.Any.fromFunction1((t0: /* value */ scala.Double) => onScroll(t0).runNow()))
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (prerenderingSiblingsNumber != null) __obj.updateDynamic("prerenderingSiblingsNumber")(prerenderingSiblingsNumber.asInstanceOf[js.Any])
    if (renderTabBar != null) __obj.updateDynamic("renderTabBar")(renderTabBar.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollWithoutAnimation)) __obj.updateDynamic("scrollWithoutAnimation")(scrollWithoutAnimation.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (tabBarActiveTextColor != null) __obj.updateDynamic("tabBarActiveTextColor")(tabBarActiveTextColor.asInstanceOf[js.Any])
    if (tabBarBackgroundColor != null) __obj.updateDynamic("tabBarBackgroundColor")(tabBarBackgroundColor.asInstanceOf[js.Any])
    if (tabBarInactiveTextColor != null) __obj.updateDynamic("tabBarInactiveTextColor")(tabBarInactiveTextColor.asInstanceOf[js.Any])
    if (tabBarPosition != null) __obj.updateDynamic("tabBarPosition")(tabBarPosition.asInstanceOf[js.Any])
    if (tabBarTextStyle != null) __obj.updateDynamic("tabBarTextStyle")(tabBarTextStyle.asInstanceOf[js.Any])
    if (tabBarUnderlineStyle != null) __obj.updateDynamic("tabBarUnderlineStyle")(tabBarUnderlineStyle.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactNativeScrollableTabView.mod.ScrollableTabViewProperties, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactNativeScrollableTabView.mod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactNativeScrollableTabView.mod.ScrollableTabViewProperties])(children: _*)
  }
  @JSImport("react-native-scrollable-tab-view", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

