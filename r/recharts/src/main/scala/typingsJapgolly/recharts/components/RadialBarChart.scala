package typingsJapgolly.recharts.components

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.recharts.anon.PartialMargin
import typingsJapgolly.recharts.mod.BaseValueType
import typingsJapgolly.recharts.mod.RadialBarChartProps
import typingsJapgolly.recharts.mod.RechartsFunction
import typingsJapgolly.recharts.mod.StackOffsetType
import typingsJapgolly.recharts.rechartsStrings.radial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object RadialBarChart {
  
  @JSImport("recharts", "RadialBarChart")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.recharts.mod.RadialBarChart] {
    
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
    
    inline def cx(value: String | Double): this.type = set("cx", value.asInstanceOf[js.Any])
    
    inline def cy(value: String | Double): this.type = set("cy", value.asInstanceOf[js.Any])
    
    inline def data(value: js.Array[js.Object]): this.type = set("data", value.asInstanceOf[js.Any])
    
    inline def dataVarargs(value: js.Object*): this.type = set("data", js.Array(value*))
    
    inline def endAngle(value: Double): this.type = set("endAngle", value.asInstanceOf[js.Any])
    
    inline def height(value: Double): this.type = set("height", value.asInstanceOf[js.Any])
    
    inline def innerRadius(value: String | Double): this.type = set("innerRadius", value.asInstanceOf[js.Any])
    
    inline def layout(value: radial): this.type = set("layout", value.asInstanceOf[js.Any])
    
    inline def margin(value: PartialMargin): this.type = set("margin", value.asInstanceOf[js.Any])
    
    inline def maxBarSize(value: Double): this.type = set("maxBarSize", value.asInstanceOf[js.Any])
    
    inline def onClick(value: RechartsFunction): this.type = set("onClick", value.asInstanceOf[js.Any])
    
    inline def onMouseDown(value: RechartsFunction): this.type = set("onMouseDown", value.asInstanceOf[js.Any])
    
    inline def onMouseEnter(value: RechartsFunction): this.type = set("onMouseEnter", value.asInstanceOf[js.Any])
    
    inline def onMouseLeave(value: RechartsFunction): this.type = set("onMouseLeave", value.asInstanceOf[js.Any])
    
    inline def onMouseMove(value: RechartsFunction): this.type = set("onMouseMove", value.asInstanceOf[js.Any])
    
    inline def onMouseUp(value: RechartsFunction): this.type = set("onMouseUp", value.asInstanceOf[js.Any])
    
    inline def outerRadius(value: String | Double): this.type = set("outerRadius", value.asInstanceOf[js.Any])
    
    inline def reverseStackOrder(value: Boolean): this.type = set("reverseStackOrder", value.asInstanceOf[js.Any])
    
    inline def stackOffset(value: StackOffsetType): this.type = set("stackOffset", value.asInstanceOf[js.Any])
    
    inline def startAngle(value: Double): this.type = set("startAngle", value.asInstanceOf[js.Any])
    
    inline def style(value: js.Object): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def syncId(value: String | Double): this.type = set("syncId", value.asInstanceOf[js.Any])
    
    inline def throttleDelay(value: Double): this.type = set("throttleDelay", value.asInstanceOf[js.Any])
    
    inline def width(value: Double): this.type = set("width", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: RadialBarChart.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: RadialBarChartProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
