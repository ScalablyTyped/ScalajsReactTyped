package typingsJapgolly.reactPopperTooltip.typesMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Node
import typingsJapgolly.popperJs.mod.Popper.Placement
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.reactPopper.mod.PopperArrowProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TooltipProps extends js.Object {
  var arrowProps: PopperArrowProps
  var closeOnOutOfBoundaries: Boolean
  var innerRef: Ref
  var outOfBoundaries: Boolean | Null
  var placement: Placement
  var style: CSSProperties
  var trigger: Trigger
  def clearScheduled(): Unit
  def hideTooltip(): Unit
  def scheduleUpdate(): Unit
  def tooltip(arg: TooltipArg): Node
}

object TooltipProps {
  @scala.inline
  def apply(
    arrowProps: PopperArrowProps,
    clearScheduled: Callback,
    closeOnOutOfBoundaries: Boolean,
    hideTooltip: Callback,
    placement: Placement,
    scheduleUpdate: Callback,
    style: CSSProperties,
    tooltip: TooltipArg => CallbackTo[Node],
    trigger: Trigger,
    innerRef: Ref = null,
    outOfBoundaries: js.UndefOr[Boolean] = js.undefined
  ): TooltipProps = {
    val __obj = js.Dynamic.literal(arrowProps = arrowProps.asInstanceOf[js.Any], closeOnOutOfBoundaries = closeOnOutOfBoundaries.asInstanceOf[js.Any], placement = placement.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], trigger = trigger.asInstanceOf[js.Any])
    __obj.updateDynamic("clearScheduled")(clearScheduled.toJsFn)
    __obj.updateDynamic("hideTooltip")(hideTooltip.toJsFn)
    __obj.updateDynamic("scheduleUpdate")(scheduleUpdate.toJsFn)
    __obj.updateDynamic("tooltip")(js.Any.fromFunction1((t0: typingsJapgolly.reactPopperTooltip.typesMod.TooltipArg) => tooltip(t0).runNow()))
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    if (!js.isUndefined(outOfBoundaries)) __obj.updateDynamic("outOfBoundaries")(outOfBoundaries.asInstanceOf[js.Any])
    __obj.asInstanceOf[TooltipProps]
  }
}

