package typingsJapgolly.reactNativeSvgCharts.mod

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.CanvasRenderingContext2D
import typingsJapgolly.d3Path.mod.Path_
import typingsJapgolly.d3Scale.mod.ScaleBand_
import typingsJapgolly.d3Shape.mod.CurveFactory
import typingsJapgolly.d3Shape.mod.CurveGenerator
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactNativeSvgCharts.AnonBottom
import typingsJapgolly.reactNativeSvgCharts.PartialPathProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartProps[T] extends js.Object {
  var animate: js.UndefOr[Boolean] = js.undefined
  var animationDuration: js.UndefOr[Double] = js.undefined
  var contentInset: js.UndefOr[AnonBottom] = js.undefined
  var curve: js.UndefOr[CurveFactory] = js.undefined
  var data: js.Array[T]
  var gridMax: js.UndefOr[Double] = js.undefined
  var gridMin: js.UndefOr[Double] = js.undefined
  var gridProps: js.UndefOr[GridProps[_]] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var numberOfTicks: js.UndefOr[Double] = js.undefined
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var svg: js.UndefOr[PartialPathProps] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
  var xAccessor: js.UndefOr[AccessorFunction[T, Double]] = js.undefined
  var xMax: js.UndefOr[Double] = js.undefined
  var xMin: js.UndefOr[Double] = js.undefined
  var xScale: js.UndefOr[ScaleFunction] = js.undefined
  var yAccessor: js.UndefOr[AccessorFunction[T, Double]] = js.undefined
  var yMax: js.UndefOr[Double] = js.undefined
  var yMin: js.UndefOr[Double] = js.undefined
  var yScale: js.UndefOr[ScaleFunction] = js.undefined
}

object ChartProps {
  @scala.inline
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
    yScale: js.UndefOr[CallbackTo[(ScaleType[js.Any, js.Any]) | ScaleBand_[js.Any]]] = js.undefined
  ): ChartProps[T] = {
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
    __obj.asInstanceOf[ChartProps[T]]
  }
}

