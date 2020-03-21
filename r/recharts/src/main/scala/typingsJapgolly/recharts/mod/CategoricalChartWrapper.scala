package typingsJapgolly.recharts.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.raw.React.Node
import typingsJapgolly.recharts.PartialMargin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CategoricalChartWrapper[L] extends js.Object {
  var barCategoryGap: js.UndefOr[Double | String] = js.undefined
  var barGap: js.UndefOr[Double | String] = js.undefined
  var barSize: js.UndefOr[Double | String] = js.undefined
  var baseValue: js.UndefOr[BaseValueType] = js.undefined
  var children: js.UndefOr[Node | js.Array[Node]] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var compact: js.UndefOr[Boolean] = js.undefined
  var data: js.UndefOr[js.Array[js.Object]] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var layout: js.UndefOr[L] = js.undefined
  var margin: js.UndefOr[PartialMargin] = js.undefined
  var maxBarSize: js.UndefOr[Double] = js.undefined
  var onClick: js.UndefOr[RechartsFunction] = js.undefined
  var onMouseDown: js.UndefOr[RechartsFunction] = js.undefined
  var onMouseEnter: js.UndefOr[RechartsFunction] = js.undefined
  var onMouseLeave: js.UndefOr[RechartsFunction] = js.undefined
  var onMouseMove: js.UndefOr[RechartsFunction] = js.undefined
  var onMouseUp: js.UndefOr[RechartsFunction] = js.undefined
  var reverseStackOrder: js.UndefOr[Boolean] = js.undefined
  var stackOffset: js.UndefOr[StackOffsetType] = js.undefined
  var style: js.UndefOr[js.Object] = js.undefined
  var syncId: js.UndefOr[String | Double] = js.undefined
  var throttleDelay: js.UndefOr[Double] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object CategoricalChartWrapper {
  @scala.inline
  def apply[L](
    barCategoryGap: Double | String = null,
    barGap: Double | String = null,
    barSize: Double | String = null,
    baseValue: BaseValueType = null,
    children: Node | js.Array[Node] = null,
    className: String = null,
    compact: js.UndefOr[Boolean] = js.undefined,
    data: js.Array[js.Object] = null,
    height: Int | Double = null,
    layout: L = null,
    margin: PartialMargin = null,
    maxBarSize: Int | Double = null,
    onClick: /* repeated */ js.Any => Callback = null,
    onMouseDown: /* repeated */ js.Any => Callback = null,
    onMouseEnter: /* repeated */ js.Any => Callback = null,
    onMouseLeave: /* repeated */ js.Any => Callback = null,
    onMouseMove: /* repeated */ js.Any => Callback = null,
    onMouseUp: /* repeated */ js.Any => Callback = null,
    reverseStackOrder: js.UndefOr[Boolean] = js.undefined,
    stackOffset: StackOffsetType = null,
    style: js.Object = null,
    syncId: String | Double = null,
    throttleDelay: Int | Double = null,
    width: Int | Double = null
  ): CategoricalChartWrapper[L] = {
    val __obj = js.Dynamic.literal()
    if (barCategoryGap != null) __obj.updateDynamic("barCategoryGap")(barCategoryGap.asInstanceOf[js.Any])
    if (barGap != null) __obj.updateDynamic("barGap")(barGap.asInstanceOf[js.Any])
    if (barSize != null) __obj.updateDynamic("barSize")(barSize.asInstanceOf[js.Any])
    if (baseValue != null) __obj.updateDynamic("baseValue")(baseValue.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(compact)) __obj.updateDynamic("compact")(compact.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (layout != null) __obj.updateDynamic("layout")(layout.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (maxBarSize != null) __obj.updateDynamic("maxBarSize")(maxBarSize.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => onClick(t0).runNow()))
    if (onMouseDown != null) __obj.updateDynamic("onMouseDown")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => onMouseDown(t0).runNow()))
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => onMouseEnter(t0).runNow()))
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => onMouseLeave(t0).runNow()))
    if (onMouseMove != null) __obj.updateDynamic("onMouseMove")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => onMouseMove(t0).runNow()))
    if (onMouseUp != null) __obj.updateDynamic("onMouseUp")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => onMouseUp(t0).runNow()))
    if (!js.isUndefined(reverseStackOrder)) __obj.updateDynamic("reverseStackOrder")(reverseStackOrder.asInstanceOf[js.Any])
    if (stackOffset != null) __obj.updateDynamic("stackOffset")(stackOffset.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (syncId != null) __obj.updateDynamic("syncId")(syncId.asInstanceOf[js.Any])
    if (throttleDelay != null) __obj.updateDynamic("throttleDelay")(throttleDelay.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[CategoricalChartWrapper[L]]
  }
}

