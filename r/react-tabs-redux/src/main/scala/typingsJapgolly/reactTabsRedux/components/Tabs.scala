package typingsJapgolly.reactTabsRedux.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactTabsRedux.tabsMod.TabsProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Tabs {
  
  @JSImport("react-tabs-redux", "Tabs")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactTabsRedux.mod.Tabs] {
    
    inline def activeLinkStyle(value: js.Object): this.type = set("activeLinkStyle", value.asInstanceOf[js.Any])
    
    inline def disableInlineStyles(value: Boolean): this.type = set("disableInlineStyles", value.asInstanceOf[js.Any])
    
    inline def handleSelect(value: (/* tab */ String, /* name */ String) => Callback): this.type = set("handleSelect", js.Any.fromFunction2((t0: /* tab */ String, t1: /* name */ String) => (value(t0, t1)).runNow()))
    
    inline def name(value: String): this.type = set("name", value.asInstanceOf[js.Any])
    
    inline def onChange(value: (/* selectedTab */ String, /* name */ String) => Callback): this.type = set("onChange", js.Any.fromFunction2((t0: /* selectedTab */ String, t1: /* name */ String) => (value(t0, t1)).runNow()))
    
    inline def renderActiveTabContentOnly(value: Boolean): this.type = set("renderActiveTabContentOnly", value.asInstanceOf[js.Any])
    
    inline def selectedTab(value: String): this.type = set("selectedTab", value.asInstanceOf[js.Any])
    
    inline def visibleTabStyle(value: js.Object): this.type = set("visibleTabStyle", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Tabs.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: TabsProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
