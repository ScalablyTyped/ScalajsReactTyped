package typingsJapgolly.recharts.components

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.recharts.anon.PartialMargin
import typingsJapgolly.recharts.mod.AreaChartProps
import typingsJapgolly.recharts.mod.BaseValueType
import typingsJapgolly.recharts.mod.LayoutType
import typingsJapgolly.recharts.mod.RechartsFunction
import typingsJapgolly.recharts.mod.StackOffsetType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object AreaChart {
  
  @JSImport("recharts", "AreaChart")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.recharts.mod.AreaChart] {
    
    inline def barCategoryGap(value: Double | String): this.type = set("barCategoryGap", value.asInstanceOf[js.Any])
    
    inline def barGap(value: Double | String): this.type = set("barGap", value.asInstanceOf[js.Any])
    
    inline def barSize(value: Double | String): this.type = set("barSize", value.asInstanceOf[js.Any])
    
    inline def baseValue(value: BaseValueType): this.type = set("baseValue", value.asInstanceOf[js.Any])
    
    inline def children(value: Node | js.Array[Node]): this.type = set("children", value.asInstanceOf[js.Any])
    
    inline def childrenNull: this.type = set("children", null)
    
    inline def childrenVarargs(value: (Element | Empty | JsNumber | Node | String)*): this.type = set("children", js.Array(value*))
    
    inline def childrenVdomElement(value: VdomElement): this.type = set("children", value.rawElement.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def compact(value: Boolean): this.type = set("compact", value.asInstanceOf[js.Any])
    
    inline def data(value: js.Array[js.Object]): this.type = set("data", value.asInstanceOf[js.Any])
    
    inline def dataVarargs(value: js.Object*): this.type = set("data", js.Array(value*))
    
    inline def height(value: Double): this.type = set("height", value.asInstanceOf[js.Any])
    
    inline def layout(value: LayoutType): this.type = set("layout", value.asInstanceOf[js.Any])
    
    inline def margin(value: PartialMargin): this.type = set("margin", value.asInstanceOf[js.Any])
    
    inline def maxBarSize(value: Double): this.type = set("maxBarSize", value.asInstanceOf[js.Any])
    
    inline def onClick(value: RechartsFunction): this.type = set("onClick", value.asInstanceOf[js.Any])
    
    inline def onMouseDown(value: RechartsFunction): this.type = set("onMouseDown", value.asInstanceOf[js.Any])
    
    inline def onMouseEnter(value: RechartsFunction): this.type = set("onMouseEnter", value.asInstanceOf[js.Any])
    
    inline def onMouseLeave(value: RechartsFunction): this.type = set("onMouseLeave", value.asInstanceOf[js.Any])
    
    inline def onMouseMove(value: RechartsFunction): this.type = set("onMouseMove", value.asInstanceOf[js.Any])
    
    inline def onMouseOut(value: RechartsFunction): this.type = set("onMouseOut", value.asInstanceOf[js.Any])
    
    inline def onMouseOver(value: RechartsFunction): this.type = set("onMouseOver", value.asInstanceOf[js.Any])
    
    inline def onMouseUp(value: RechartsFunction): this.type = set("onMouseUp", value.asInstanceOf[js.Any])
    
    inline def onTouchCancel(value: RechartsFunction): this.type = set("onTouchCancel", value.asInstanceOf[js.Any])
    
    inline def onTouchEnd(value: RechartsFunction): this.type = set("onTouchEnd", value.asInstanceOf[js.Any])
    
    inline def onTouchMove(value: RechartsFunction): this.type = set("onTouchMove", value.asInstanceOf[js.Any])
    
    inline def onTouchStart(value: RechartsFunction): this.type = set("onTouchStart", value.asInstanceOf[js.Any])
    
    inline def reverseStackOrder(value: Boolean): this.type = set("reverseStackOrder", value.asInstanceOf[js.Any])
    
    inline def stackOffset(value: StackOffsetType): this.type = set("stackOffset", value.asInstanceOf[js.Any])
    
    inline def style(value: js.Object): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def syncId(value: String | Double): this.type = set("syncId", value.asInstanceOf[js.Any])
    
    inline def throttleDelay(value: Double): this.type = set("throttleDelay", value.asInstanceOf[js.Any])
    
    inline def width(value: Double): this.type = set("width", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: AreaChart.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: AreaChartProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
