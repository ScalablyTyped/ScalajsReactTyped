package typingsJapgolly.fundamentalReact.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.Element
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.fundamentalReact.libTabsTabGroupMod.TabGroupProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TabGroup {
  
  @JSImport("fundamental-react", "TabGroup")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.fundamentalReact.mod.TabGroup] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def disableStyles(value: Boolean): this.type = set("disableStyles", value.asInstanceOf[js.Any])
    
    inline def onTabClick(value: (/* event */ ReactMouseEventFrom[Element], /* index */ Double) => Callback): this.type = set("onTabClick", js.Any.fromFunction2((t0: /* event */ ReactMouseEventFrom[Element], t1: /* index */ Double) => (value(t0, t1)).runNow()))
    
    inline def selectedIndex(value: Double): this.type = set("selectedIndex", value.asInstanceOf[js.Any])
    
    inline def size(value: Any): this.type = set("size", value.asInstanceOf[js.Any])
    
    inline def tabGroupProps(value: Any): this.type = set("tabGroupProps", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: TabGroup.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: TabGroupProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
