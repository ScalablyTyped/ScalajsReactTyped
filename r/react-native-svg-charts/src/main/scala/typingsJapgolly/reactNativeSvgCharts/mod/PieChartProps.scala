package typingsJapgolly.reactNativeSvgCharts.mod

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.CanvasRenderingContext2D
import typingsJapgolly.d3Path.mod.Path_
import typingsJapgolly.d3Scale.mod.ScaleBand_
import typingsJapgolly.d3Shape.mod.CurveGenerator
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactNativeSvgCharts.AnonBottom
import typingsJapgolly.reactNativeSvgCharts.PartialPathProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PieChartProps[T /* <: PieChartData */] extends ChartProps[T] {
  var innerRadius: js.UndefOr[Double | String] = js.undefined
  var labelRadius: js.UndefOr[Double | String] = js.undefined
  var outerRadius: js.UndefOr[Double | String] = js.undefined
  var padAngle: js.UndefOr[Double] = js.undefined
  var sort: js.UndefOr[SortFunction[T]] = js.undefined
  var valueAccessor: js.UndefOr[AccessorFunction[T, Double]] = js.undefined
}

object PieChartProps {
  @scala.inline
  def apply[T /* <: PieChartData */](
    data: js.Array[T],
    animate: js.UndefOr[Boolean] = js.undefined,
    animationDuration: Int | Double = null,
    contentInset: AnonBottom = null,
    curve: /* context */ CanvasRenderingContext2D | Path_ => CallbackTo[CurveGenerator] = null,
    gridMax: Int | Double = null,
    gridMin: Int | Double = null,
    gridProps: GridProps[_] = null,
    height: Int | Double = null,
    innerRadius: Double | String = null,
    labelRadius: Double | String = null,
    numberOfTicks: Int | Double = null,
    outerRadius: Double | String = null,
    padAngle: Int | Double = null,
    sort: (T, T) => CallbackTo[Double] = null,
    style: StyleProp[ViewStyle] = null,
    svg: PartialPathProps = null,
    valueAccessor: /* props */ AccessorFunctionProps[T] => CallbackTo[Double] = null,
    width: Int | Double = null,
    xAccessor: /* props */ AccessorFunctionProps[T] => CallbackTo[Double] = null,
    xMax: Int | Double = null,
    xMin: Int | Double = null,
    xScale: js.UndefOr[CallbackTo[(ScaleType[js.Any, js.Any]) | ScaleBand_[js.Any]]] = js.undefined,
    yAccessor: /* props */ AccessorFunctionProps[T] => CallbackTo[Double] = null,
    yMax: Int | Double = null,
    yMin: Int | Double = null,
    yScale: js.UndefOr[CallbackTo[(ScaleType[js.Any, js.Any]) | ScaleBand_[js.Any]]] = js.undefined
  ): PieChartProps[T] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    if (!js.isUndefined(animate)) __obj.updateDynamic("animate")(animate.asInstanceOf[js.Any])
    if (animationDuration != null) __obj.updateDynamic("animationDuration")(animationDuration.asInstanceOf[js.Any])
    if (contentInset != null) __obj.updateDynamic("contentInset")(contentInset.asInstanceOf[js.Any])
    if (curve != null) __obj.updateDynamic("curve")(js.Any.fromFunction1((t0: /* context */ org.scalajs.dom.raw.CanvasRenderingContext2D | typingsJapgolly.d3Path.mod.Path_) => curve(t0).runNow()))
    if (gridMax != null) __obj.updateDynamic("gridMax")(gridMax.asInstanceOf[js.Any])
    if (gridMin != null) __obj.updateDynamic("gridMin")(gridMin.asInstanceOf[js.Any])
    if (gridProps != null) __obj.updateDynamic("gridProps")(gridProps.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (innerRadius != null) __obj.updateDynamic("innerRadius")(innerRadius.asInstanceOf[js.Any])
    if (labelRadius != null) __obj.updateDynamic("labelRadius")(labelRadius.asInstanceOf[js.Any])
    if (numberOfTicks != null) __obj.updateDynamic("numberOfTicks")(numberOfTicks.asInstanceOf[js.Any])
    if (outerRadius != null) __obj.updateDynamic("outerRadius")(outerRadius.asInstanceOf[js.Any])
    if (padAngle != null) __obj.updateDynamic("padAngle")(padAngle.asInstanceOf[js.Any])
    if (sort != null) __obj.updateDynamic("sort")(js.Any.fromFunction2((t0: T, t1: T) => sort(t0, t1).runNow()))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (svg != null) __obj.updateDynamic("svg")(svg.asInstanceOf[js.Any])
    if (valueAccessor != null) __obj.updateDynamic("valueAccessor")(js.Any.fromFunction1((t0: /* props */ typingsJapgolly.reactNativeSvgCharts.mod.AccessorFunctionProps[T]) => valueAccessor(t0).runNow()))
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (xAccessor != null) __obj.updateDynamic("xAccessor")(js.Any.fromFunction1((t0: /* props */ typingsJapgolly.reactNativeSvgCharts.mod.AccessorFunctionProps[T]) => xAccessor(t0).runNow()))
    if (xMax != null) __obj.updateDynamic("xMax")(xMax.asInstanceOf[js.Any])
    if (xMin != null) __obj.updateDynamic("xMin")(xMin.asInstanceOf[js.Any])
    xScale.foreach(p => __obj.updateDynamic("xScale")(p.toJsFn))
    if (yAccessor != null) __obj.updateDynamic("yAccessor")(js.Any.fromFunction1((t0: /* props */ typingsJapgolly.reactNativeSvgCharts.mod.AccessorFunctionProps[T]) => yAccessor(t0).runNow()))
    if (yMax != null) __obj.updateDynamic("yMax")(yMax.asInstanceOf[js.Any])
    if (yMin != null) __obj.updateDynamic("yMin")(yMin.asInstanceOf[js.Any])
    yScale.foreach(p => __obj.updateDynamic("yScale")(p.toJsFn))
    __obj.asInstanceOf[PieChartProps[T]]
  }
}

