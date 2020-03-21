package typingsJapgolly.reactNativeSvgCharts.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.reactNativeSvgCharts.PartialLineProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridProps[T] extends js.Object {
  var belowChart: js.UndefOr[Boolean] = js.undefined
  var direction: js.UndefOr[GridDirection] = js.undefined
  var svg: js.UndefOr[PartialLineProps] = js.undefined
  var ticks: js.UndefOr[js.Array[T]] = js.undefined
  var x: js.UndefOr[js.Function1[/* t */ T, Double]] = js.undefined
  var y: js.UndefOr[js.Function1[/* t */ T, Double]] = js.undefined
}

object GridProps {
  @scala.inline
  def apply[T](
    belowChart: js.UndefOr[Boolean] = js.undefined,
    direction: GridDirection = null,
    svg: PartialLineProps = null,
    ticks: js.Array[T] = null,
    x: /* t */ T => CallbackTo[Double] = null,
    y: /* t */ T => CallbackTo[Double] = null
  ): GridProps[T] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(belowChart)) __obj.updateDynamic("belowChart")(belowChart.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (svg != null) __obj.updateDynamic("svg")(svg.asInstanceOf[js.Any])
    if (ticks != null) __obj.updateDynamic("ticks")(ticks.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(js.Any.fromFunction1((t0: /* t */ T) => x(t0).runNow()))
    if (y != null) __obj.updateDynamic("y")(js.Any.fromFunction1((t0: /* t */ T) => y(t0).runNow()))
    __obj.asInstanceOf[GridProps[T]]
  }
}

