package typingsJapgolly.rcDrawer.components

import japgolly.scalajs.react.Callback
import org.scalajs.dom.HTMLDivElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.rcDrawer.esDrawerPanelMod.DrawerPanelProps
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.Ref
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DrawerPanel {
  
  inline def apply(prefixCls: String): Builder = {
    val __props = js.Dynamic.literal(prefixCls = prefixCls.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[DrawerPanelProps]))
  }
  
  @JSImport("rc-drawer/es/DrawerPanel", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def containerRef(value: Ref[HTMLDivElement]): this.type = set("containerRef", value.asInstanceOf[js.Any])
    
    inline def containerRefFunction1(value: HTMLDivElement | Null => Callback): this.type = set("containerRef", js.Any.fromFunction1((t0: HTMLDivElement | Null) => value(t0).runNow()))
    
    inline def containerRefNull: this.type = set("containerRef", null)
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: DrawerPanelProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
