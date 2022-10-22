package typingsJapgolly.reactRouterNavigation.components

import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.TextStyle
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactRouterNavigation.mod.TabBarComponentProps
import typingsJapgolly.reactRouterNavigation.mod.TabSubViewProps
import typingsJapgolly.reactRouterNavigation.reactRouterNavigationStrings.bottom
import typingsJapgolly.reactRouterNavigation.reactRouterNavigationStrings.top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Tabs {
  
  @JSImport("react-router-navigation", "Tabs")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactRouterNavigation.mod.Tabs] {
    
    inline def children(value: js.Array[Element]): this.type = set("children", value.asInstanceOf[js.Any])
    
    inline def childrenVarargs(value: Element*): this.type = set("children", js.Array(value*))
    
    inline def hideTabBar(value: Boolean): this.type = set("hideTabBar", value.asInstanceOf[js.Any])
    
    inline def label(value: String): this.type = set("label", value.asInstanceOf[js.Any])
    
    inline def labelStyle(value: StyleProp[TextStyle]): this.type = set("labelStyle", value.asInstanceOf[js.Any])
    
    inline def labelStyleNull: this.type = set("labelStyle", null)
    
    inline def renderLabel(value: /* props */ TabSubViewProps => Node): this.type = set("renderLabel", js.Any.fromFunction1(value))
    
    inline def renderTabBar(value: /* props */ TabSubViewProps => Node): this.type = set("renderTabBar", js.Any.fromFunction1(value))
    
    inline def renderTabIcon(value: /* props */ TabSubViewProps => Node): this.type = set("renderTabIcon", js.Any.fromFunction1(value))
    
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
  
  implicit def make(companion: Tabs.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: TabBarComponentProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
