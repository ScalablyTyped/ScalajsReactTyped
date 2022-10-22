package typingsJapgolly.reactRouterNavigation.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.ComponentClassP
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.TextStyle
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactRouter.distLibComponentsMod.RouterProps
import typingsJapgolly.reactRouterNavigation.mod.TabBarProps
import typingsJapgolly.reactRouterNavigation.mod.TabProps
import typingsJapgolly.reactRouterNavigation.mod.TabSubViewProps
import typingsJapgolly.reactRouterNavigation.reactRouterNavigationStrings.bottom
import typingsJapgolly.reactRouterNavigation.reactRouterNavigationStrings.top
import typingsJapgolly.reactRouterNavigationCore.mod.RouteProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Tab {
  
  @JSImport("react-router-navigation", "Tab")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def children(value: (js.Function1[/* props */ RouterProps, Node]) | Node): this.type = set("children", value.asInstanceOf[js.Any])
    
    inline def childrenFunction1(value: /* props */ RouterProps => Node): this.type = set("children", js.Any.fromFunction1(value))
    
    inline def childrenNull: this.type = set("children", null)
    
    inline def childrenVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("children", js.Array(value*))
    
    inline def childrenVdomElement(value: VdomElement): this.type = set("children", value.rawElement.asInstanceOf[js.Any])
    
    inline def component(value: ComponentClassP[RouterProps & js.Object]): this.type = set("component", value.asInstanceOf[js.Any])
    
    inline def exact(value: Boolean): this.type = set("exact", value.asInstanceOf[js.Any])
    
    inline def hideTabBar(value: Boolean): this.type = set("hideTabBar", value.asInstanceOf[js.Any])
    
    inline def label(value: String): this.type = set("label", value.asInstanceOf[js.Any])
    
    inline def labelStyle(value: StyleProp[TextStyle]): this.type = set("labelStyle", value.asInstanceOf[js.Any])
    
    inline def labelStyleNull: this.type = set("labelStyle", null)
    
    inline def onIndexChange(value: /* index */ Double => Callback): this.type = set("onIndexChange", js.Any.fromFunction1((t0: /* index */ Double) => value(t0).runNow()))
    
    inline def onReset(value: /* props */ TabBarProps & RouteProps => Callback): this.type = set("onReset", js.Any.fromFunction1((t0: /* props */ TabBarProps & RouteProps) => value(t0).runNow()))
    
    inline def path(value: String): this.type = set("path", value.asInstanceOf[js.Any])
    
    inline def render(value: /* props */ RouterProps => Node): this.type = set("render", js.Any.fromFunction1(value))
    
    inline def renderLabel(value: /* props */ TabSubViewProps => Node): this.type = set("renderLabel", js.Any.fromFunction1(value))
    
    inline def renderTabBar(value: /* props */ TabSubViewProps => Node): this.type = set("renderTabBar", js.Any.fromFunction1(value))
    
    inline def renderTabIcon(value: /* props */ TabSubViewProps => Node): this.type = set("renderTabIcon", js.Any.fromFunction1(value))
    
    inline def strict(value: Boolean): this.type = set("strict", value.asInstanceOf[js.Any])
    
    inline def tabActiveTintColor(value: String): this.type = set("tabActiveTintColor", value.asInstanceOf[js.Any])
    
    inline def tabBarIndicatorStyle(value: StyleProp[ViewStyle]): this.type = set("tabBarIndicatorStyle", value.asInstanceOf[js.Any])
    
    inline def tabBarIndicatorStyleNull: this.type = set("tabBarIndicatorStyle", null)
    
    inline def tabBarPosition(value: top | bottom): this.type = set("tabBarPosition", value.asInstanceOf[js.Any])
    
    inline def tabBarStyle(value: StyleProp[ViewStyle]): this.type = set("tabBarStyle", value.asInstanceOf[js.Any])
    
    inline def tabBarStyleNull: this.type = set("tabBarStyle", null)
    
    inline def tabStyle(value: StyleProp[ViewStyle]): this.type = set("tabStyle", value.asInstanceOf[js.Any])
    
    inline def tabStyleNull: this.type = set("tabStyle", null)
    
    inline def tabTintColor(value: String): this.type = set("tabTintColor", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Tab.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: TabProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
