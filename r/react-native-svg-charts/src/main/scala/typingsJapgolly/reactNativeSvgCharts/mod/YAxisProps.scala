package typingsJapgolly.reactNativeSvgCharts.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.d3Scale.mod.ScaleBand_
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactNativeSvgCharts.AnonTop
import typingsJapgolly.reactNativeSvgCharts.PartialTextProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait YAxisProps[T] extends AxisProps[T] {
  var contentInset: js.UndefOr[AnonTop] = js.undefined
  var max: js.UndefOr[Double] = js.undefined
  var min: js.UndefOr[Double] = js.undefined
  var yAccessor: js.UndefOr[AccessorFunction[T, _]] = js.undefined
}

object YAxisProps {
  @scala.inline
  def apply[T](
    data: js.Array[T],
    contentInset: AnonTop = null,
    formatLabel: (/* value */ js.Any, /* index */ Double) => CallbackTo[Double | String] = null,
    max: Int | Double = null,
    min: Int | Double = null,
    numberOfTicks: Int | Double = null,
    scale: js.UndefOr[CallbackTo[(ScaleType[js.Any, js.Any]) | ScaleBand_[js.Any]]] = js.undefined,
    spacingInner: Int | Double = null,
    spacingOuter: Int | Double = null,
    style: StyleProp[ViewStyle] = null,
    svg: PartialTextProps = null,
    yAccessor: /* props */ AccessorFunctionProps[T] => CallbackTo[js.Any] = null
  ): YAxisProps[T] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    if (contentInset != null) __obj.updateDynamic("contentInset")(contentInset.asInstanceOf[js.Any])
    if (formatLabel != null) __obj.updateDynamic("formatLabel")(js.Any.fromFunction2((t0: /* value */ js.Any, t1: /* index */ scala.Double) => formatLabel(t0, t1).runNow()))
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (numberOfTicks != null) __obj.updateDynamic("numberOfTicks")(numberOfTicks.asInstanceOf[js.Any])
    scale.foreach(p => __obj.updateDynamic("scale")(p.toJsFn))
    if (spacingInner != null) __obj.updateDynamic("spacingInner")(spacingInner.asInstanceOf[js.Any])
    if (spacingOuter != null) __obj.updateDynamic("spacingOuter")(spacingOuter.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (svg != null) __obj.updateDynamic("svg")(svg.asInstanceOf[js.Any])
    if (yAccessor != null) __obj.updateDynamic("yAccessor")(js.Any.fromFunction1((t0: /* props */ typingsJapgolly.reactNativeSvgCharts.mod.AccessorFunctionProps[T]) => yAccessor(t0).runNow()))
    __obj.asInstanceOf[YAxisProps[T]]
  }
}

