package typingsJapgolly.reactNativeSvgCharts.components

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.CanvasRenderingContext2D
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.d3Path.mod.Path_
import typingsJapgolly.d3Scale.mod.ScaleBand_
import typingsJapgolly.d3Shape.mod.CurveGenerator
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactNativeSvgCharts.anon.Bottom
import typingsJapgolly.reactNativeSvgCharts.anon.PartialPathProps
import typingsJapgolly.reactNativeSvgCharts.mod.AccessorFunctionProps
import typingsJapgolly.reactNativeSvgCharts.mod.GridProps
import typingsJapgolly.reactNativeSvgCharts.mod.PieChartData
import typingsJapgolly.reactNativeSvgCharts.mod.PieChartProps
import typingsJapgolly.reactNativeSvgCharts.mod.ScaleType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PieChart {
  
  inline def apply[T /* <: PieChartData */](data: js.Array[T]): Builder[T] = {
    val __props = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    new Builder[T](js.Array(this.component, __props.asInstanceOf[PieChartProps[T]]))
  }
  
  @JSImport("react-native-svg-charts", "PieChart")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder[T /* <: PieChartData */] (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactNativeSvgCharts.mod.PieChart[T]] {
    
    inline def animate(value: Boolean): this.type = set("animate", value.asInstanceOf[js.Any])
    
    inline def animationDuration(value: Double): this.type = set("animationDuration", value.asInstanceOf[js.Any])
    
    inline def contentInset(value: Bottom): this.type = set("contentInset", value.asInstanceOf[js.Any])
    
    inline def curve(value: /* context */ CanvasRenderingContext2D | Path_ => CurveGenerator): this.type = set("curve", js.Any.fromFunction1(value))
    
    inline def endAngle(value: Double): this.type = set("endAngle", value.asInstanceOf[js.Any])
    
    inline def gridMax(value: Double): this.type = set("gridMax", value.asInstanceOf[js.Any])
    
    inline def gridMin(value: Double): this.type = set("gridMin", value.asInstanceOf[js.Any])
    
    inline def gridProps(value: GridProps[Any]): this.type = set("gridProps", value.asInstanceOf[js.Any])
    
    inline def height(value: Double): this.type = set("height", value.asInstanceOf[js.Any])
    
    inline def innerRadius(value: Double | String): this.type = set("innerRadius", value.asInstanceOf[js.Any])
    
    inline def labelRadius(value: Double | String): this.type = set("labelRadius", value.asInstanceOf[js.Any])
    
    inline def numberOfTicks(value: Double): this.type = set("numberOfTicks", value.asInstanceOf[js.Any])
    
    inline def outerRadius(value: Double | String): this.type = set("outerRadius", value.asInstanceOf[js.Any])
    
    inline def padAngle(value: Double): this.type = set("padAngle", value.asInstanceOf[js.Any])
    
    inline def sort(value: (T, T) => Double): this.type = set("sort", js.Any.fromFunction2(value))
    
    inline def startAngle(value: Double): this.type = set("startAngle", value.asInstanceOf[js.Any])
    
    inline def style(value: StyleProp[ViewStyle]): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def styleNull: this.type = set("style", null)
    
    inline def svg(value: PartialPathProps): this.type = set("svg", value.asInstanceOf[js.Any])
    
    inline def valueAccessor(value: /* props */ AccessorFunctionProps[T] => Double): this.type = set("valueAccessor", js.Any.fromFunction1(value))
    
    inline def width(value: Double): this.type = set("width", value.asInstanceOf[js.Any])
    
    inline def xAccessor(value: /* props */ AccessorFunctionProps[T] => Double): this.type = set("xAccessor", js.Any.fromFunction1(value))
    
    inline def xMax(value: Double): this.type = set("xMax", value.asInstanceOf[js.Any])
    
    inline def xMin(value: Double): this.type = set("xMin", value.asInstanceOf[js.Any])
    
    inline def xScale(value: CallbackTo[(ScaleType[Any, Any]) | ScaleBand_[Any]]): this.type = set("xScale", value.toJsFn)
    
    inline def yAccessor(value: /* props */ AccessorFunctionProps[T] => Double): this.type = set("yAccessor", js.Any.fromFunction1(value))
    
    inline def yMax(value: Double): this.type = set("yMax", value.asInstanceOf[js.Any])
    
    inline def yMin(value: Double): this.type = set("yMin", value.asInstanceOf[js.Any])
    
    inline def yScale(value: CallbackTo[(ScaleType[Any, Any]) | ScaleBand_[Any]]): this.type = set("yScale", value.toJsFn)
  }
  
  def withProps[T /* <: PieChartData */](p: PieChartProps[T]): Builder[T] = new Builder[T](js.Array(this.component, p.asInstanceOf[js.Any]))
}
