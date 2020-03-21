package typingsJapgolly.baseui.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Node
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.MouseEvent
import typingsJapgolly.baseui.baseuiStrings.auto
import typingsJapgolly.baseui.baseuiStrings.bottom
import typingsJapgolly.baseui.baseuiStrings.bottomLeft
import typingsJapgolly.baseui.baseuiStrings.bottomRight
import typingsJapgolly.baseui.baseuiStrings.click
import typingsJapgolly.baseui.baseuiStrings.hover
import typingsJapgolly.baseui.baseuiStrings.left
import typingsJapgolly.baseui.baseuiStrings.leftBottom
import typingsJapgolly.baseui.baseuiStrings.leftTop
import typingsJapgolly.baseui.baseuiStrings.menu
import typingsJapgolly.baseui.baseuiStrings.none
import typingsJapgolly.baseui.baseuiStrings.right
import typingsJapgolly.baseui.baseuiStrings.rightBottom
import typingsJapgolly.baseui.baseuiStrings.rightTop
import typingsJapgolly.baseui.baseuiStrings.tooltip
import typingsJapgolly.baseui.baseuiStrings.top
import typingsJapgolly.baseui.baseuiStrings.topLeft
import typingsJapgolly.baseui.baseuiStrings.topRight
import typingsJapgolly.baseui.popoverMod.Overrides
import typingsJapgolly.baseui.tooltipMod.TooltipProps
import typingsJapgolly.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Tooltip {
  def apply(
    isOpen: Boolean,
    accessibilityType: none | menu | tooltip = null,
    animateOutTime: Int | Double = null,
    autoFocus: js.UndefOr[Boolean] = js.undefined,
    content: Node | js.Function0[Node] = null,
    `data-baseweb`: String = null,
    focusLock: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    ignoreBoundary: js.UndefOr[Boolean] = js.undefined,
    mountNode: HTMLElement = null,
    onBlur: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    onClick: /* e */ Event_ => CallbackTo[js.Any] = null,
    onClickOutside: /* event */ MouseEvent => CallbackTo[js.Any] = null,
    onEsc: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    onFocus: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    onMouseEnter: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    onMouseEnterDelay: Int | Double = null,
    onMouseLeave: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    onMouseLeaveDelay: Int | Double = null,
    overrides: Overrides = null,
    placement: topLeft | leftBottom | topRight | rightBottom | bottomLeft | right | auto | bottomRight | leftTop | left | bottom | rightTop | top = null,
    popperOptions: js.Any = null,
    renderAll: js.UndefOr[Boolean] = js.undefined,
    returnFocus: js.UndefOr[Boolean] = js.undefined,
    showArrow: js.UndefOr[Boolean] = js.undefined,
    triggerType: click | hover = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[TooltipProps, typingsJapgolly.baseui.tooltipMod.Tooltip, Unit, TooltipProps] = {
    val __obj = js.Dynamic.literal(isOpen = isOpen.asInstanceOf[js.Any])
  
      if (accessibilityType != null) __obj.updateDynamic("accessibilityType")(accessibilityType.asInstanceOf[js.Any])
    if (animateOutTime != null) __obj.updateDynamic("animateOutTime")(animateOutTime.asInstanceOf[js.Any])
    if (!js.isUndefined(autoFocus)) __obj.updateDynamic("autoFocus")(autoFocus.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (`data-baseweb` != null) __obj.updateDynamic("data-baseweb")(`data-baseweb`.asInstanceOf[js.Any])
    if (!js.isUndefined(focusLock)) __obj.updateDynamic("focusLock")(focusLock.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreBoundary)) __obj.updateDynamic("ignoreBoundary")(ignoreBoundary.asInstanceOf[js.Any])
    if (mountNode != null) __obj.updateDynamic("mountNode")(mountNode.asInstanceOf[js.Any])
    onBlur.foreach(p => __obj.updateDynamic("onBlur")(p.toJsFn))
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.std.Event_) => onClick(t0).runNow()))
    if (onClickOutside != null) __obj.updateDynamic("onClickOutside")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.MouseEvent) => onClickOutside(t0).runNow()))
    onEsc.foreach(p => __obj.updateDynamic("onEsc")(p.toJsFn))
    onFocus.foreach(p => __obj.updateDynamic("onFocus")(p.toJsFn))
    onMouseEnter.foreach(p => __obj.updateDynamic("onMouseEnter")(p.toJsFn))
    if (onMouseEnterDelay != null) __obj.updateDynamic("onMouseEnterDelay")(onMouseEnterDelay.asInstanceOf[js.Any])
    onMouseLeave.foreach(p => __obj.updateDynamic("onMouseLeave")(p.toJsFn))
    if (onMouseLeaveDelay != null) __obj.updateDynamic("onMouseLeaveDelay")(onMouseLeaveDelay.asInstanceOf[js.Any])
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    if (placement != null) __obj.updateDynamic("placement")(placement.asInstanceOf[js.Any])
    if (popperOptions != null) __obj.updateDynamic("popperOptions")(popperOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(renderAll)) __obj.updateDynamic("renderAll")(renderAll.asInstanceOf[js.Any])
    if (!js.isUndefined(returnFocus)) __obj.updateDynamic("returnFocus")(returnFocus.asInstanceOf[js.Any])
    if (!js.isUndefined(showArrow)) __obj.updateDynamic("showArrow")(showArrow.asInstanceOf[js.Any])
    if (triggerType != null) __obj.updateDynamic("triggerType")(triggerType.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.baseui.tooltipMod.TooltipProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.baseui.tooltipMod.Tooltip](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.baseui.tooltipMod.TooltipProps])(children: _*)
  }
  @JSImport("baseui/tooltip", "Tooltip")
  @js.native
  object componentImport extends js.Object
  
}

