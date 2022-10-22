package typingsJapgolly.reactStackGrid.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.reactStackGrid.mod.Grid
import typingsJapgolly.reactStackGrid.mod.StackGridProps
import typingsJapgolly.reactStackGrid.mod.Units
import typingsJapgolly.reactStackGrid.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactStackGrid {
  
  inline def apply(columnWidth: Double | String): Builder = {
    val __props = js.Dynamic.literal(columnWidth = columnWidth.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[StackGridProps]))
  }
  
  @JSImport("react-stack-grid", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def appear(value: Callback): this.type = set("appear", value.toJsFn)
    
    inline def appearDelay(value: Double): this.type = set("appearDelay", value.asInstanceOf[js.Any])
    
    inline def appeared(value: Callback): this.type = set("appeared", value.toJsFn)
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def component(value: String): this.type = set("component", value.asInstanceOf[js.Any])
    
    inline def duration(value: Double): this.type = set("duration", value.asInstanceOf[js.Any])
    
    inline def easing(value: String): this.type = set("easing", value.asInstanceOf[js.Any])
    
    inline def enableSSR(value: Boolean): this.type = set("enableSSR", value.asInstanceOf[js.Any])
    
    inline def enter(value: Callback): this.type = set("enter", value.toJsFn)
    
    inline def entered(value: Callback): this.type = set("entered", value.toJsFn)
    
    inline def gridRef(value: /* grid */ Grid => Callback): this.type = set("gridRef", js.Any.fromFunction1((t0: /* grid */ Grid) => value(t0).runNow()))
    
    inline def gutterHeight(value: Double): this.type = set("gutterHeight", value.asInstanceOf[js.Any])
    
    inline def gutterWidth(value: Double): this.type = set("gutterWidth", value.asInstanceOf[js.Any])
    
    inline def horizontal(value: Boolean): this.type = set("horizontal", value.asInstanceOf[js.Any])
    
    inline def itemComponent(value: String): this.type = set("itemComponent", value.asInstanceOf[js.Any])
    
    inline def leaved(value: Callback): this.type = set("leaved", value.toJsFn)
    
    inline def monitorImagesLoaded(value: Boolean): this.type = set("monitorImagesLoaded", value.asInstanceOf[js.Any])
    
    inline def onLayout(value: Callback): this.type = set("onLayout", value.toJsFn)
    
    inline def rtl(value: Boolean): this.type = set("rtl", value.asInstanceOf[js.Any])
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def units(value: Units): this.type = set("units", value.asInstanceOf[js.Any])
    
    inline def userAgent(value: String): this.type = set("userAgent", value.asInstanceOf[js.Any])
    
    inline def vendorPrefix(value: Boolean): this.type = set("vendorPrefix", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: StackGridProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
