package typingsJapgolly.reactPopperTooltip.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Node
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.popperJs.mod.Popper.Placement
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.reactPopper.mod.PopperArrowProps
import typingsJapgolly.reactPopperTooltip.tooltipMod.default
import typingsJapgolly.reactPopperTooltip.typesMod.Ref
import typingsJapgolly.reactPopperTooltip.typesMod.TooltipArg
import typingsJapgolly.reactPopperTooltip.typesMod.TooltipProps
import typingsJapgolly.reactPopperTooltip.typesMod.Trigger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Tooltip {
  def apply(
    arrowProps: PopperArrowProps,
    closeOnOutOfBoundaries: Boolean,
    placement: Placement,
    style: CSSProperties,
    trigger: Trigger,
    clearScheduled: Callback,
    hideTooltip: Callback,
    scheduleUpdate: Callback,
    tooltip: TooltipArg => CallbackTo[Node],
    innerRef: Ref = null,
    outOfBoundaries: js.UndefOr[Boolean] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[TooltipProps, default, Unit, TooltipProps] = {
    val __obj = js.Dynamic.literal(arrowProps = arrowProps.asInstanceOf[js.Any], closeOnOutOfBoundaries = closeOnOutOfBoundaries.asInstanceOf[js.Any], placement = placement.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], trigger = trigger.asInstanceOf[js.Any])
  
      __obj.updateDynamic("clearScheduled")(clearScheduled.toJsFn)
    __obj.updateDynamic("hideTooltip")(hideTooltip.toJsFn)
    __obj.updateDynamic("scheduleUpdate")(scheduleUpdate.toJsFn)
    __obj.updateDynamic("tooltip")(js.Any.fromFunction1((t0: typingsJapgolly.reactPopperTooltip.typesMod.TooltipArg) => tooltip(t0).runNow()))
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    if (!js.isUndefined(outOfBoundaries)) __obj.updateDynamic("outOfBoundaries")(outOfBoundaries.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactPopperTooltip.typesMod.TooltipProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactPopperTooltip.tooltipMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactPopperTooltip.typesMod.TooltipProps])(children: _*)
  }
  @JSImport("react-popper-tooltip/dist/Tooltip", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

