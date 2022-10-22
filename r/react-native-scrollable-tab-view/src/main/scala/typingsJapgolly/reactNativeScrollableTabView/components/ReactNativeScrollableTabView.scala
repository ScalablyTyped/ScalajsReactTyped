package typingsJapgolly.reactNativeScrollableTabView.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.reactNative.mod.ScrollViewProps
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.TextStyle
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactNativeScrollableTabView.anon.TabBarProps
import typingsJapgolly.reactNativeScrollableTabView.mod.ChangeTabProperties
import typingsJapgolly.reactNativeScrollableTabView.mod.ScrollableTabViewProperties
import typingsJapgolly.reactNativeScrollableTabView.mod.default
import typingsJapgolly.reactNativeScrollableTabView.reactNativeScrollableTabViewBooleans.`false`
import typingsJapgolly.reactNativeScrollableTabView.reactNativeScrollableTabViewStrings.bottom
import typingsJapgolly.reactNativeScrollableTabView.reactNativeScrollableTabViewStrings.overlayBottom
import typingsJapgolly.reactNativeScrollableTabView.reactNativeScrollableTabViewStrings.overlayTop
import typingsJapgolly.reactNativeScrollableTabView.reactNativeScrollableTabViewStrings.top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactNativeScrollableTabView {
  
  @JSImport("react-native-scrollable-tab-view", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def contentProps(value: ScrollViewProps): this.type = set("contentProps", value.asInstanceOf[js.Any])
    
    inline def initialPage(value: Double): this.type = set("initialPage", value.asInstanceOf[js.Any])
    
    inline def locked(value: Boolean): this.type = set("locked", value.asInstanceOf[js.Any])
    
    inline def onChangeTab(value: /* value */ ChangeTabProperties => Callback): this.type = set("onChangeTab", js.Any.fromFunction1((t0: /* value */ ChangeTabProperties) => value(t0).runNow()))
    
    inline def onScroll(value: /* value */ Double => Callback): this.type = set("onScroll", js.Any.fromFunction1((t0: /* value */ Double) => value(t0).runNow()))
    
    inline def page(value: Double): this.type = set("page", value.asInstanceOf[js.Any])
    
    inline def prerenderingSiblingsNumber(value: Double): this.type = set("prerenderingSiblingsNumber", value.asInstanceOf[js.Any])
    
    inline def renderTabBar(value: (js.Function1[/* props */ TabBarProps, Element]) | `false`): this.type = set("renderTabBar", value.asInstanceOf[js.Any])
    
    inline def renderTabBarFunction1(value: /* props */ TabBarProps => Element): this.type = set("renderTabBar", js.Any.fromFunction1(value))
    
    inline def scrollWithoutAnimation(value: Boolean): this.type = set("scrollWithoutAnimation", value.asInstanceOf[js.Any])
    
    inline def style(value: StyleProp[ViewStyle]): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def styleNull: this.type = set("style", null)
    
    inline def tabBarActiveTextColor(value: String): this.type = set("tabBarActiveTextColor", value.asInstanceOf[js.Any])
    
    inline def tabBarBackgroundColor(value: String): this.type = set("tabBarBackgroundColor", value.asInstanceOf[js.Any])
    
    inline def tabBarInactiveTextColor(value: String): this.type = set("tabBarInactiveTextColor", value.asInstanceOf[js.Any])
    
    inline def tabBarPosition(value: top | bottom | overlayTop | overlayBottom): this.type = set("tabBarPosition", value.asInstanceOf[js.Any])
    
    inline def tabBarTextStyle(value: StyleProp[TextStyle]): this.type = set("tabBarTextStyle", value.asInstanceOf[js.Any])
    
    inline def tabBarTextStyleNull: this.type = set("tabBarTextStyle", null)
    
    inline def tabBarUnderlineStyle(value: StyleProp[ViewStyle]): this.type = set("tabBarUnderlineStyle", value.asInstanceOf[js.Any])
    
    inline def tabBarUnderlineStyleNull: this.type = set("tabBarUnderlineStyle", null)
  }
  
  implicit def make(companion: ReactNativeScrollableTabView.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ScrollableTabViewProperties): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
