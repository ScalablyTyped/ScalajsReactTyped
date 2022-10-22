package typingsJapgolly.reactRouterTabs.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactRouterTabs.mod.RoutedTabsProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object RoutedTabs {
  
  @JSImport("react-router-tabs", "RoutedTabs")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def activeTabClassName(value: String): this.type = set("activeTabClassName", value.asInstanceOf[js.Any])
    
    inline def activeTabStyle(value: js.Object): this.type = set("activeTabStyle", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def startPathWith(value: String): this.type = set("startPathWith", value.asInstanceOf[js.Any])
    
    inline def style(value: js.Object): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def tabClassName(value: String): this.type = set("tabClassName", value.asInstanceOf[js.Any])
    
    inline def tabStyle(value: js.Object): this.type = set("tabStyle", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: RoutedTabs.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: RoutedTabsProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
