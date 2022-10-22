package typingsJapgolly.recharts.components

import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.recharts.anon.PartialYPadding
import typingsJapgolly.recharts.mod.AxisDomain
import typingsJapgolly.recharts.mod.AxisInterval
import typingsJapgolly.recharts.mod.ContentRenderer
import typingsJapgolly.recharts.mod.DataKey
import typingsJapgolly.recharts.mod.LabelProps
import typingsJapgolly.recharts.mod.RechartsFunction
import typingsJapgolly.recharts.mod.ScaleType
import typingsJapgolly.recharts.mod.YAxisProps
import typingsJapgolly.recharts.rechartsStrings.category
import typingsJapgolly.recharts.rechartsStrings.left
import typingsJapgolly.recharts.rechartsStrings.number
import typingsJapgolly.recharts.rechartsStrings.right
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object YAxis {
  
  @JSImport("recharts", "YAxis")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.recharts.mod.YAxis] {
    
    inline def allowDataOverflow(value: Boolean): this.type = set("allowDataOverflow", value.asInstanceOf[js.Any])
    
    inline def allowDecimals(value: Boolean): this.type = set("allowDecimals", value.asInstanceOf[js.Any])
    
    inline def allowDuplicatedCategory(value: Boolean): this.type = set("allowDuplicatedCategory", value.asInstanceOf[js.Any])
    
    inline def angle(value: Double): this.type = set("angle", value.asInstanceOf[js.Any])
    
    inline def axisLine(value: Boolean | js.Object): this.type = set("axisLine", value.asInstanceOf[js.Any])
    
    inline def dataKey(value: DataKey): this.type = set("dataKey", value.asInstanceOf[js.Any])
    
    inline def dataKeyFunction1(value: /* dataObject */ Any => String | Double | (js.Tuple2[Double, Double]) | Null): this.type = set("dataKey", js.Any.fromFunction1(value))
    
    inline def domain(value: js.Tuple2[AxisDomain, AxisDomain]): this.type = set("domain", value.asInstanceOf[js.Any])
    
    inline def dx(value: Double): this.type = set("dx", value.asInstanceOf[js.Any])
    
    inline def dy(value: Double): this.type = set("dy", value.asInstanceOf[js.Any])
    
    inline def height(value: Double): this.type = set("height", value.asInstanceOf[js.Any])
    
    inline def hide(value: Boolean): this.type = set("hide", value.asInstanceOf[js.Any])
    
    inline def interval(value: AxisInterval): this.type = set("interval", value.asInstanceOf[js.Any])
    
    inline def label(value: String | Double | typingsJapgolly.recharts.mod.Label | LabelProps): this.type = set("label", value.asInstanceOf[js.Any])
    
    inline def minTickGap(value: Double): this.type = set("minTickGap", value.asInstanceOf[js.Any])
    
    inline def mirror(value: Boolean): this.type = set("mirror", value.asInstanceOf[js.Any])
    
    inline def name(value: String | Double): this.type = set("name", value.asInstanceOf[js.Any])
    
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
    
    inline def orientation(value: left | right): this.type = set("orientation", value.asInstanceOf[js.Any])
    
    inline def padding(value: PartialYPadding): this.type = set("padding", value.asInstanceOf[js.Any])
    
    inline def reversed(value: Boolean): this.type = set("reversed", value.asInstanceOf[js.Any])
    
    inline def scale(value: ScaleType | RechartsFunction): this.type = set("scale", value.asInstanceOf[js.Any])
    
    inline def stroke(value: String): this.type = set("stroke", value.asInstanceOf[js.Any])
    
    inline def tick(value: Boolean | ContentRenderer[Any] | js.Object | Element): this.type = set("tick", value.asInstanceOf[js.Any])
    
    inline def tickCount(value: Double): this.type = set("tickCount", value.asInstanceOf[js.Any])
    
    inline def tickFormatter(value: /* value */ Any => Any): this.type = set("tickFormatter", js.Any.fromFunction1(value))
    
    inline def tickFunction1(value: Any => Node): this.type = set("tick", js.Any.fromFunction1(value))
    
    inline def tickLine(value: Boolean | js.Object): this.type = set("tickLine", value.asInstanceOf[js.Any])
    
    inline def tickMargin(value: Double): this.type = set("tickMargin", value.asInstanceOf[js.Any])
    
    inline def tickSize(value: Double): this.type = set("tickSize", value.asInstanceOf[js.Any])
    
    inline def tickVdomElement(value: VdomElement): this.type = set("tick", value.rawElement.asInstanceOf[js.Any])
    
    inline def ticks(value: js.Array[Any]): this.type = set("ticks", value.asInstanceOf[js.Any])
    
    inline def ticksVarargs(value: Any*): this.type = set("ticks", js.Array(value*))
    
    inline def `type`(value: number | category): this.type = set("type", value.asInstanceOf[js.Any])
    
    inline def unit(value: String | Double): this.type = set("unit", value.asInstanceOf[js.Any])
    
    inline def width(value: Double): this.type = set("width", value.asInstanceOf[js.Any])
    
    inline def yAxisId(value: String | Double): this.type = set("yAxisId", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: YAxis.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: YAxisProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
