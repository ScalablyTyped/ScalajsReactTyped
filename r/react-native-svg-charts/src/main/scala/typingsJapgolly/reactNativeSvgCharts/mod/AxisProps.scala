package typingsJapgolly.reactNativeSvgCharts.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.d3Scale.mod.ScaleBand_
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactNativeSvgCharts.PartialTextProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AxisProps[T] extends js.Object {
  var data: js.Array[T]
  var formatLabel: js.UndefOr[js.Function2[/* value */ js.Any, /* index */ Double, Double | String]] = js.undefined
  var numberOfTicks: js.UndefOr[Double] = js.undefined
  var scale: js.UndefOr[ScaleFunction] = js.undefined
  var spacingInner: js.UndefOr[Double] = js.undefined
  var spacingOuter: js.UndefOr[Double] = js.undefined
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var svg: js.UndefOr[PartialTextProps] = js.undefined
}

object AxisProps {
  @scala.inline
  def apply[T](
    data: js.Array[T],
    formatLabel: (/* value */ js.Any, /* index */ Double) => CallbackTo[Double | String] = null,
    numberOfTicks: Int | Double = null,
    scale: js.UndefOr[CallbackTo[(ScaleType[js.Any, js.Any]) | ScaleBand_[js.Any]]] = js.undefined,
    spacingInner: Int | Double = null,
    spacingOuter: Int | Double = null,
    style: StyleProp[ViewStyle] = null,
    svg: PartialTextProps = null
  ): AxisProps[T] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    if (formatLabel != null) __obj.updateDynamic("formatLabel")(js.Any.fromFunction2((t0: /* value */ js.Any, t1: /* index */ scala.Double) => formatLabel(t0, t1).runNow()))
    if (numberOfTicks != null) __obj.updateDynamic("numberOfTicks")(numberOfTicks.asInstanceOf[js.Any])
    scale.foreach(p => __obj.updateDynamic("scale")(p.toJsFn))
    if (spacingInner != null) __obj.updateDynamic("spacingInner")(spacingInner.asInstanceOf[js.Any])
    if (spacingOuter != null) __obj.updateDynamic("spacingOuter")(spacingOuter.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (svg != null) __obj.updateDynamic("svg")(svg.asInstanceOf[js.Any])
    __obj.asInstanceOf[AxisProps[T]]
  }
}

