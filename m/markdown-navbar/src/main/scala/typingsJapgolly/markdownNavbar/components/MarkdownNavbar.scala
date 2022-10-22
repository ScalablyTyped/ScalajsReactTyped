package typingsJapgolly.markdownNavbar.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.HTMLDivElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.markdownNavbar.mod.MarkdownNavbarProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object MarkdownNavbar {
  
  inline def apply(source: String): Builder = {
    val __props = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[MarkdownNavbarProps]))
  }
  
  @JSImport("markdown-navbar", JSImport.Namespace)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def declarative(value: Boolean): this.type = set("declarative", value.asInstanceOf[js.Any])
    
    inline def headingTopOffset(value: Double): this.type = set("headingTopOffset", value.asInstanceOf[js.Any])
    
    inline def onHashChange(value: (/* newHash */ String, /* oldHash */ String) => Callback): this.type = set("onHashChange", js.Any.fromFunction2((t0: /* newHash */ String, t1: /* oldHash */ String) => (value(t0, t1)).runNow()))
    
    inline def onNavItemClick(
      value: (/* event */ ReactMouseEventFrom[HTMLDivElement], /* element */ HTMLDivElement, /* hashValue */ String) => Callback
    ): this.type = set("onNavItemClick", js.Any.fromFunction3((t0: /* event */ ReactMouseEventFrom[HTMLDivElement], t1: /* element */ HTMLDivElement, t2: /* hashValue */ String) => (value(t0, t1, t2)).runNow()))
    
    inline def ordered(value: Boolean): this.type = set("ordered", value.asInstanceOf[js.Any])
    
    inline def updateHashAuto(value: Boolean): this.type = set("updateHashAuto", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: MarkdownNavbarProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
