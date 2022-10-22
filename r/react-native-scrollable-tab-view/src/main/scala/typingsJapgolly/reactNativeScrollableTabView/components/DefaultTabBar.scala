package typingsJapgolly.reactNativeScrollableTabView.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.reactNative.mod.Animated.Value
import typingsJapgolly.reactNative.mod.LayoutChangeEvent
import typingsJapgolly.reactNative.mod.TextStyle
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactNativeScrollableTabView.anon.TabBarPropsDefaultTabBarP
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DefaultTabBar {
  
  @JSImport("react-native-scrollable-tab-view", "DefaultTabBar")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactNativeScrollableTabView.mod.DefaultTabBar] {
    
    inline def activeTab(value: Double): this.type = set("activeTab", value.asInstanceOf[js.Any])
    
    inline def activeTextColor(value: String): this.type = set("activeTextColor", value.asInstanceOf[js.Any])
    
    inline def backgroundColor(value: String): this.type = set("backgroundColor", value.asInstanceOf[js.Any])
    
    inline def containerWidth(value: Double): this.type = set("containerWidth", value.asInstanceOf[js.Any])
    
    inline def goToPage(value: /* pageNumber */ Double => Callback): this.type = set("goToPage", js.Any.fromFunction1((t0: /* pageNumber */ Double) => value(t0).runNow()))
    
    inline def inactiveTextColor(value: String): this.type = set("inactiveTextColor", value.asInstanceOf[js.Any])
    
    inline def renderTab(
      value: (/* name */ String, /* pageIndex */ Double, /* isTabActive */ Boolean, /* onPressHandler */ js.Function1[/* pageNumber */ Double, Unit], /* onLayoutHandler */ js.UndefOr[js.Function1[/* event */ LayoutChangeEvent, Unit]]) => Element
    ): this.type = set("renderTab", js.Any.fromFunction5(value))
    
    inline def scrollValue(value: Value): this.type = set("scrollValue", value.asInstanceOf[js.Any])
    
    inline def style(value: ViewStyle): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def tabStyle(value: ViewStyle): this.type = set("tabStyle", value.asInstanceOf[js.Any])
    
    inline def tabs(value: js.Array[Element]): this.type = set("tabs", value.asInstanceOf[js.Any])
    
    inline def tabsVarargs(value: Element*): this.type = set("tabs", js.Array(value*))
    
    inline def textStyle(value: TextStyle): this.type = set("textStyle", value.asInstanceOf[js.Any])
    
    inline def underlineStyle(value: ViewStyle): this.type = set("underlineStyle", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: DefaultTabBar.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: TabBarPropsDefaultTabBarP): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
