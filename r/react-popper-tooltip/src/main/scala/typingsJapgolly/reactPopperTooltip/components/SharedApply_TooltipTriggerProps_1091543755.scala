package typingsJapgolly.reactPopperTooltip.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Node
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.popperJs.mod.Popper.Modifiers
import typingsJapgolly.popperJs.mod.Popper.Placement
import typingsJapgolly.reactPopperTooltip.typesMod.ChildrenArg
import typingsJapgolly.reactPopperTooltip.typesMod.Ref
import typingsJapgolly.reactPopperTooltip.typesMod.TooltipArg
import typingsJapgolly.reactPopperTooltip.typesMod.TooltipTriggerProps
import typingsJapgolly.reactPopperTooltip.typesMod.Trigger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

abstract class SharedApply_TooltipTriggerProps_1091543755[ComponentRef] () {
  val componentImport: js.Any
  def apply(
    closeOnOutOfBoundaries: Boolean,
    defaultTooltipShown: Boolean,
    delayHide: Double,
    delayShow: Double,
    followCursor: Boolean,
    placement: Placement,
    portalContainer: HTMLElement,
    trigger: Trigger,
    usePortal: Boolean,
    onVisibilityChange: Boolean => Callback,
    tooltip: TooltipArg => CallbackTo[Node],
    getTooltipRef: Ref = null,
    getTriggerRef: Ref = null,
    modifiers: Modifiers = null,
    tooltipShown: js.UndefOr[Boolean] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildrenArg => CallbackTo[Node]
  ): UnmountedWithRoot[TooltipTriggerProps, ComponentRef, Unit, TooltipTriggerProps] = {
    val __obj = js.Dynamic.literal(closeOnOutOfBoundaries = closeOnOutOfBoundaries.asInstanceOf[js.Any], defaultTooltipShown = defaultTooltipShown.asInstanceOf[js.Any], delayHide = delayHide.asInstanceOf[js.Any], delayShow = delayShow.asInstanceOf[js.Any], followCursor = followCursor.asInstanceOf[js.Any], placement = placement.asInstanceOf[js.Any], portalContainer = portalContainer.asInstanceOf[js.Any], trigger = trigger.asInstanceOf[js.Any], usePortal = usePortal.asInstanceOf[js.Any])
  
      __obj.updateDynamic("children")(js.Any.fromFunction1((t0: typingsJapgolly.reactPopperTooltip.typesMod.ChildrenArg) => children(t0).runNow()))
    __obj.updateDynamic("onVisibilityChange")(js.Any.fromFunction1((t0: scala.Boolean) => onVisibilityChange(t0).runNow()))
    __obj.updateDynamic("tooltip")(js.Any.fromFunction1((t0: typingsJapgolly.reactPopperTooltip.typesMod.TooltipArg) => tooltip(t0).runNow()))
    if (getTooltipRef != null) __obj.updateDynamic("getTooltipRef")(getTooltipRef.asInstanceOf[js.Any])
    if (getTriggerRef != null) __obj.updateDynamic("getTriggerRef")(getTriggerRef.asInstanceOf[js.Any])
    if (modifiers != null) __obj.updateDynamic("modifiers")(modifiers.asInstanceOf[js.Any])
    if (!js.isUndefined(tooltipShown)) __obj.updateDynamic("tooltipShown")(tooltipShown.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactPopperTooltip.typesMod.TooltipTriggerProps, 
  japgolly.scalajs.react.Children.None, 
  ComponentRef](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactPopperTooltip.typesMod.TooltipTriggerProps])
  }
}

