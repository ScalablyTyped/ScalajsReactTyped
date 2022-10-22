package typingsJapgolly.reactNativeSvgCharts.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.facade.React.Component
import org.scalajs.dom.CanvasRenderingContext2D
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.d3Path.mod.Path_
import typingsJapgolly.d3Scale.mod.ScaleBand_
import typingsJapgolly.d3Shape.mod.CurveGenerator
import typingsJapgolly.d3Shape.mod.Series
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactNativeSvg.libTypescriptElementsLinearGradientMod.LinearGradientProps
import typingsJapgolly.reactNativeSvg.libTypescriptElementsRadialGradientMod.RadialGradientProps
import typingsJapgolly.reactNativeSvgCharts.anon.Bottom
import typingsJapgolly.reactNativeSvgCharts.anon.Color
import typingsJapgolly.reactNativeSvgCharts.anon.PartialPathProps
import typingsJapgolly.reactNativeSvgCharts.mod.AccessorFunctionProps
import typingsJapgolly.reactNativeSvgCharts.mod.GridProps
import typingsJapgolly.reactNativeSvgCharts.mod.ScaleType
import typingsJapgolly.reactNativeSvgCharts.mod.StackedAreaChartProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object StackedAreaChart {
  
  inline def apply[T](colors: js.Array[String], data: js.Array[T], keys: js.Array[/* keyof T */ String]): Builder[T] = {
    val __props = js.Dynamic.literal(colors = colors.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], keys = keys.asInstanceOf[js.Any])
    new Builder[T](js.Array(this.component, __props.asInstanceOf[StackedAreaChartProps[T]]))
  }
  
  @JSImport("react-native-svg-charts", "StackedAreaChart")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder[T] (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactNativeSvgCharts.mod.StackedAreaChart[T]] {
    
    inline def animate(value: Boolean): this.type = set("animate", value.asInstanceOf[js.Any])
    
    inline def animationDuration(value: Double): this.type = set("animationDuration", value.asInstanceOf[js.Any])
    
    inline def contentInset(value: Bottom): this.type = set("contentInset", value.asInstanceOf[js.Any])
    
    inline def curve(value: /* context */ CanvasRenderingContext2D | Path_ => CurveGenerator): this.type = set("curve", js.Any.fromFunction1(value))
    
    inline def extras(value: js.Array[Any]): this.type = set("extras", value.asInstanceOf[js.Any])
    
    inline def extrasVarargs(value: Any*): this.type = set("extras", js.Array(value*))
    
    inline def gridMax(value: Double): this.type = set("gridMax", value.asInstanceOf[js.Any])
    
    inline def gridMin(value: Double): this.type = set("gridMin", value.asInstanceOf[js.Any])
    
    inline def gridProps(value: GridProps[Any]): this.type = set("gridProps", value.asInstanceOf[js.Any])
    
    inline def height(value: Double): this.type = set("height", value.asInstanceOf[js.Any])
    
    inline def numberOfTicks(value: Double): this.type = set("numberOfTicks", value.asInstanceOf[js.Any])
    
    inline def offset(value: (/* series */ Series[Any, Any], /* order */ js.Array[Double]) => Callback): this.type = set("offset", js.Any.fromFunction2((t0: /* series */ Series[Any, Any], t1: /* order */ js.Array[Double]) => (value(t0, t1)).runNow()))
    
    inline def order(value: /* series */ Series[Any, Any] => js.Array[Double]): this.type = set("order", js.Any.fromFunction1(value))
    
    inline def renderDecorator(value: CallbackTo[js.Object]): this.type = set("renderDecorator", value.toJsFn)
    
    inline def renderGradient(
      value: /* props */ Color[T] => Component[(LinearGradientProps | RadialGradientProps) & js.Object, js.Object]
    ): this.type = set("renderGradient", js.Any.fromFunction1(value))
    
    inline def showGrid(value: Boolean): this.type = set("showGrid", value.asInstanceOf[js.Any])
    
    inline def style(value: StyleProp[ViewStyle]): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def styleNull: this.type = set("style", null)
    
    inline def svg(value: PartialPathProps): this.type = set("svg", value.asInstanceOf[js.Any])
    
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
  
  def withProps[T](p: StackedAreaChartProps[T]): Builder[T] = new Builder[T](js.Array(this.component, p.asInstanceOf[js.Any]))
}
