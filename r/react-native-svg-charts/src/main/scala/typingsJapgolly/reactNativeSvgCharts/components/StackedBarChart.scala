package typingsJapgolly.reactNativeSvgCharts.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Component
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.CanvasRenderingContext2D
import typingsJapgolly.d3Path.mod.Path_
import typingsJapgolly.d3Scale.mod.ScaleBand_
import typingsJapgolly.d3Shape.mod.CurveGenerator
import typingsJapgolly.d3Shape.mod.Series
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactNativeSvg.mod.LinearGradientProps
import typingsJapgolly.reactNativeSvg.mod.RadialGradientProps
import typingsJapgolly.reactNativeSvgCharts.AnonBottom
import typingsJapgolly.reactNativeSvgCharts.AnonId
import typingsJapgolly.reactNativeSvgCharts.PartialPathProps
import typingsJapgolly.reactNativeSvgCharts.mod.AccessorFunctionProps
import typingsJapgolly.reactNativeSvgCharts.mod.GridProps
import typingsJapgolly.reactNativeSvgCharts.mod.ScaleType
import typingsJapgolly.reactNativeSvgCharts.mod.StackedBarChartProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object StackedBarChart {
  def apply[T](
    colors: js.Array[String],
    data: js.Array[T],
    keys: js.Array[String],
    animate: js.UndefOr[Boolean] = js.undefined,
    animationDuration: Int | Double = null,
    contentInset: AnonBottom = null,
    curve: /* context */ CanvasRenderingContext2D | Path_ => CallbackTo[CurveGenerator] = null,
    extra: js.UndefOr[CallbackTo[js.Object]] = js.undefined,
    extras: js.Array[_] = null,
    gridMax: Int | Double = null,
    gridMin: Int | Double = null,
    gridProps: GridProps[_] = null,
    height: Int | Double = null,
    horizontal: js.UndefOr[Boolean] = js.undefined,
    numberOfTicks: Int | Double = null,
    offset: (/* series */ Series[js.Any, js.Any], /* order */ js.Array[Double]) => Callback = null,
    order: /* series */ Series[js.Any, js.Any] => CallbackTo[js.Array[Double]] = null,
    renderGradient: /* props */ AnonId => CallbackTo[Component[(LinearGradientProps | RadialGradientProps) with js.Object, js.Object]] = null,
    showGrid: js.UndefOr[Boolean] = js.undefined,
    spacingInner: Int | Double = null,
    spacingOuter: Int | Double = null,
    strokeColor: String = null,
    style: StyleProp[ViewStyle] = null,
    svg: PartialPathProps = null,
    width: Int | Double = null,
    xAccessor: /* props */ AccessorFunctionProps[T] => CallbackTo[Double] = null,
    xMax: Int | Double = null,
    xMin: Int | Double = null,
    xScale: js.UndefOr[CallbackTo[(ScaleType[js.Any, js.Any]) | ScaleBand_[js.Any]]] = js.undefined,
    yAccessor: /* props */ AccessorFunctionProps[T] => CallbackTo[Double] = null,
    yMax: Int | Double = null,
    yMin: Int | Double = null,
    yScale: js.UndefOr[CallbackTo[(ScaleType[js.Any, js.Any]) | ScaleBand_[js.Any]]] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    StackedBarChartProps[T], 
    typingsJapgolly.reactNativeSvgCharts.mod.StackedBarChart[T], 
    Unit, 
    StackedBarChartProps[T]
  ] = {
    val __obj = js.Dynamic.literal(colors = colors.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], keys = keys.asInstanceOf[js.Any])
  
      if (!js.isUndefined(animate)) __obj.updateDynamic("animate")(animate.asInstanceOf[js.Any])
    if (animationDuration != null) __obj.updateDynamic("animationDuration")(animationDuration.asInstanceOf[js.Any])
    if (contentInset != null) __obj.updateDynamic("contentInset")(contentInset.asInstanceOf[js.Any])
    if (curve != null) __obj.updateDynamic("curve")(js.Any.fromFunction1((t0: /* context */ org.scalajs.dom.raw.CanvasRenderingContext2D | typingsJapgolly.d3Path.mod.Path_) => curve(t0).runNow()))
    extra.foreach(p => __obj.updateDynamic("extra")(p.toJsFn))
    if (extras != null) __obj.updateDynamic("extras")(extras.asInstanceOf[js.Any])
    if (gridMax != null) __obj.updateDynamic("gridMax")(gridMax.asInstanceOf[js.Any])
    if (gridMin != null) __obj.updateDynamic("gridMin")(gridMin.asInstanceOf[js.Any])
    if (gridProps != null) __obj.updateDynamic("gridProps")(gridProps.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(horizontal)) __obj.updateDynamic("horizontal")(horizontal.asInstanceOf[js.Any])
    if (numberOfTicks != null) __obj.updateDynamic("numberOfTicks")(numberOfTicks.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(js.Any.fromFunction2((t0: /* series */ typingsJapgolly.d3Shape.mod.Series[js.Any, js.Any], t1: /* order */ js.Array[scala.Double]) => offset(t0, t1).runNow()))
    if (order != null) __obj.updateDynamic("order")(js.Any.fromFunction1((t0: /* series */ typingsJapgolly.d3Shape.mod.Series[js.Any, js.Any]) => order(t0).runNow()))
    if (renderGradient != null) __obj.updateDynamic("renderGradient")(js.Any.fromFunction1((t0: /* props */ typingsJapgolly.reactNativeSvgCharts.AnonId) => renderGradient(t0).runNow()))
    if (!js.isUndefined(showGrid)) __obj.updateDynamic("showGrid")(showGrid.asInstanceOf[js.Any])
    if (spacingInner != null) __obj.updateDynamic("spacingInner")(spacingInner.asInstanceOf[js.Any])
    if (spacingOuter != null) __obj.updateDynamic("spacingOuter")(spacingOuter.asInstanceOf[js.Any])
    if (strokeColor != null) __obj.updateDynamic("strokeColor")(strokeColor.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (svg != null) __obj.updateDynamic("svg")(svg.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (xAccessor != null) __obj.updateDynamic("xAccessor")(js.Any.fromFunction1((t0: /* props */ typingsJapgolly.reactNativeSvgCharts.mod.AccessorFunctionProps[T]) => xAccessor(t0).runNow()))
    if (xMax != null) __obj.updateDynamic("xMax")(xMax.asInstanceOf[js.Any])
    if (xMin != null) __obj.updateDynamic("xMin")(xMin.asInstanceOf[js.Any])
    xScale.foreach(p => __obj.updateDynamic("xScale")(p.toJsFn))
    if (yAccessor != null) __obj.updateDynamic("yAccessor")(js.Any.fromFunction1((t0: /* props */ typingsJapgolly.reactNativeSvgCharts.mod.AccessorFunctionProps[T]) => yAccessor(t0).runNow()))
    if (yMax != null) __obj.updateDynamic("yMax")(yMax.asInstanceOf[js.Any])
    if (yMin != null) __obj.updateDynamic("yMin")(yMin.asInstanceOf[js.Any])
    yScale.foreach(p => __obj.updateDynamic("yScale")(p.toJsFn))
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactNativeSvgCharts.mod.StackedBarChartProps[T], 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactNativeSvgCharts.mod.StackedBarChart[T]](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactNativeSvgCharts.mod.StackedBarChartProps[T]])(children: _*)
  }
  @JSImport("react-native-svg-charts", "StackedBarChart")
  @js.native
  object componentImport extends js.Object
  
}

