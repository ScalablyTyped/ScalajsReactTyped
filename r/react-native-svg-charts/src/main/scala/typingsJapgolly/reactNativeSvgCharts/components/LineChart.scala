package typingsJapgolly.reactNativeSvgCharts.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.CanvasRenderingContext2D
import typingsJapgolly.d3Path.mod.Path_
import typingsJapgolly.d3Scale.mod.ScaleBand_
import typingsJapgolly.d3Shape.mod.CurveGenerator
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactNativeSvgCharts.AnonBottom
import typingsJapgolly.reactNativeSvgCharts.PartialPathProps
import typingsJapgolly.reactNativeSvgCharts.mod.AccessorFunctionProps
import typingsJapgolly.reactNativeSvgCharts.mod.ChartProps
import typingsJapgolly.reactNativeSvgCharts.mod.GridProps
import typingsJapgolly.reactNativeSvgCharts.mod.ScaleType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object LineChart {
  def apply[T](
    data: js.Array[T],
    animate: js.UndefOr[Boolean] = js.undefined,
    animationDuration: Int | Double = null,
    contentInset: AnonBottom = null,
    curve: /* context */ CanvasRenderingContext2D | Path_ => CallbackTo[CurveGenerator] = null,
    gridMax: Int | Double = null,
    gridMin: Int | Double = null,
    gridProps: GridProps[_] = null,
    height: Int | Double = null,
    numberOfTicks: Int | Double = null,
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
    ChartProps[T], 
    typingsJapgolly.reactNativeSvgCharts.mod.LineChart[T], 
    Unit, 
    ChartProps[T]
  ] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
  
      if (!js.isUndefined(animate)) __obj.updateDynamic("animate")(animate.asInstanceOf[js.Any])
    if (animationDuration != null) __obj.updateDynamic("animationDuration")(animationDuration.asInstanceOf[js.Any])
    if (contentInset != null) __obj.updateDynamic("contentInset")(contentInset.asInstanceOf[js.Any])
    if (curve != null) __obj.updateDynamic("curve")(js.Any.fromFunction1((t0: /* context */ org.scalajs.dom.raw.CanvasRenderingContext2D | typingsJapgolly.d3Path.mod.Path_) => curve(t0).runNow()))
    if (gridMax != null) __obj.updateDynamic("gridMax")(gridMax.asInstanceOf[js.Any])
    if (gridMin != null) __obj.updateDynamic("gridMin")(gridMin.asInstanceOf[js.Any])
    if (gridProps != null) __obj.updateDynamic("gridProps")(gridProps.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (numberOfTicks != null) __obj.updateDynamic("numberOfTicks")(numberOfTicks.asInstanceOf[js.Any])
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
  typingsJapgolly.reactNativeSvgCharts.mod.ChartProps[T], 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactNativeSvgCharts.mod.LineChart[T]](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactNativeSvgCharts.mod.ChartProps[T]])(children: _*)
  }
  @JSImport("react-native-svg-charts", "LineChart")
  @js.native
  object componentImport extends js.Object
  
}

