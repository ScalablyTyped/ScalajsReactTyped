package typingsJapgolly.reactTabsRedux.components

import japgolly.scalajs.react.Callback
import org.scalajs.dom.Event
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactTabsRedux.tabLinkMod.TabLinkProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TabLink {
  
  inline def apply(to: Double | String): Builder = {
    val __props = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[TabLinkProps]))
  }
  
  @JSImport("react-tabs-redux", "TabLink")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactTabsRedux.mod.TabLink] {
    
    inline def default(value: Boolean): this.type = set("default", value.asInstanceOf[js.Any])
    
    inline def activeClassName(value: String): this.type = set("activeClassName", value.asInstanceOf[js.Any])
    
    inline def activeStyle(value: js.Object): this.type = set("activeStyle", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def component(value: String): this.type = set("component", value.asInstanceOf[js.Any])
    
    inline def disableInlineStyles(value: Boolean): this.type = set("disableInlineStyles", value.asInstanceOf[js.Any])
    
    inline def handleSelect(value: (/* tab */ String, /* name */ String) => Callback): this.type = set("handleSelect", js.Any.fromFunction2((t0: /* tab */ String, t1: /* name */ String) => (value(t0, t1)).runNow()))
    
    inline def isActive(value: Boolean): this.type = set("isActive", value.asInstanceOf[js.Any])
    
    inline def namespace(value: String): this.type = set("namespace", value.asInstanceOf[js.Any])
    
    inline def onClick(value: /* event */ Event => Callback): this.type = set("onClick", js.Any.fromFunction1((t0: /* event */ Event) => value(t0).runNow()))
    
    inline def style(value: js.Object): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: TabLinkProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
