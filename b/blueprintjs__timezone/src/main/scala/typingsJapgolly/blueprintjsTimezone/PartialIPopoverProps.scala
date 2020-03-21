package typingsJapgolly.blueprintjsTimezone

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.raw.React.Element
import org.scalajs.dom.raw.HTMLDivElement
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.blueprintjsCore.popoverMod.PopoverInteractionKind
import typingsJapgolly.blueprintjsCore.popoverSharedPropsMod.PopoverPosition
import typingsJapgolly.popperJs.mod.Boundary
import typingsJapgolly.popperJs.mod.Modifiers
import typingsJapgolly.react.mod.HTMLAttributes
import typingsJapgolly.react.mod.HTMLProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@blueprintjs/core.@blueprintjs/core.IPopoverProps> */
trait PartialIPopoverProps extends js.Object {
  var autoFocus: js.UndefOr[Boolean] = js.undefined
  var backdropProps: js.UndefOr[HTMLProps[HTMLDivElement]] = js.undefined
  var boundary: js.UndefOr[Boundary] = js.undefined
  var canEscapeKeyClose: js.UndefOr[Boolean] = js.undefined
  var captureDismiss: js.UndefOr[Boolean] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var content: js.UndefOr[String | Element] = js.undefined
  var defaultIsOpen: js.UndefOr[Boolean] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var enforceFocus: js.UndefOr[Boolean] = js.undefined
  var fill: js.UndefOr[Boolean] = js.undefined
  var hasBackdrop: js.UndefOr[Boolean] = js.undefined
  var hoverCloseDelay: js.UndefOr[Double] = js.undefined
  var hoverOpenDelay: js.UndefOr[Double] = js.undefined
  var inheritDarkTheme: js.UndefOr[Boolean] = js.undefined
  var interactionKind: js.UndefOr[PopoverInteractionKind] = js.undefined
  var isOpen: js.UndefOr[Boolean] = js.undefined
  var `lazy`: js.UndefOr[Boolean] = js.undefined
  var minimal: js.UndefOr[Boolean] = js.undefined
  var modifiers: js.UndefOr[Modifiers] = js.undefined
  var onClose: js.UndefOr[js.Function1[/* event */ js.UndefOr[ReactEventFrom[HTMLElement]], Unit]] = js.undefined
  var onClosed: js.UndefOr[js.Function1[/* node */ HTMLElement, Unit]] = js.undefined
  var onClosing: js.UndefOr[js.Function1[/* node */ HTMLElement, Unit]] = js.undefined
  var onInteraction: js.UndefOr[
    js.Function2[/* nextOpenState */ Boolean, /* e */ js.UndefOr[ReactEventFrom[HTMLElement]], Unit]
  ] = js.undefined
  var onOpened: js.UndefOr[js.Function1[/* node */ HTMLElement, Unit]] = js.undefined
  var onOpening: js.UndefOr[js.Function1[/* node */ HTMLElement, Unit]] = js.undefined
  var openOnTargetFocus: js.UndefOr[Boolean] = js.undefined
  var popoverClassName: js.UndefOr[String] = js.undefined
  var popoverRef: js.UndefOr[js.Function1[/* ref */ HTMLDivElement | Null, Unit]] = js.undefined
  var portalClassName: js.UndefOr[String] = js.undefined
  var portalContainer: js.UndefOr[HTMLElement] = js.undefined
  var position: js.UndefOr[PopoverPosition] = js.undefined
  var target: js.UndefOr[String | Element] = js.undefined
  var targetClassName: js.UndefOr[String] = js.undefined
  var targetProps: js.UndefOr[HTMLAttributes[HTMLElement]] = js.undefined
  var targetTagName: js.UndefOr[
    /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 175 */ js.Any
  ] = js.undefined
  var transitionDuration: js.UndefOr[Double] = js.undefined
  var usePortal: js.UndefOr[Boolean] = js.undefined
  var wrapperTagName: js.UndefOr[
    /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 175 */ js.Any
  ] = js.undefined
}

object PartialIPopoverProps {
  @scala.inline
  def apply(
    autoFocus: js.UndefOr[Boolean] = js.undefined,
    backdropProps: HTMLProps[HTMLDivElement] = null,
    boundary: Boundary = null,
    canEscapeKeyClose: js.UndefOr[Boolean] = js.undefined,
    captureDismiss: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    content: String | Element = null,
    defaultIsOpen: js.UndefOr[Boolean] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    enforceFocus: js.UndefOr[Boolean] = js.undefined,
    fill: js.UndefOr[Boolean] = js.undefined,
    hasBackdrop: js.UndefOr[Boolean] = js.undefined,
    hoverCloseDelay: Int | Double = null,
    hoverOpenDelay: Int | Double = null,
    inheritDarkTheme: js.UndefOr[Boolean] = js.undefined,
    interactionKind: PopoverInteractionKind = null,
    isOpen: js.UndefOr[Boolean] = js.undefined,
    `lazy`: js.UndefOr[Boolean] = js.undefined,
    minimal: js.UndefOr[Boolean] = js.undefined,
    modifiers: Modifiers = null,
    onClose: /* event */ js.UndefOr[ReactEventFrom[HTMLElement]] => Callback = null,
    onClosed: /* node */ HTMLElement => Callback = null,
    onClosing: /* node */ HTMLElement => Callback = null,
    onInteraction: (/* nextOpenState */ Boolean, /* e */ js.UndefOr[ReactEventFrom[HTMLElement]]) => Callback = null,
    onOpened: /* node */ HTMLElement => Callback = null,
    onOpening: /* node */ HTMLElement => Callback = null,
    openOnTargetFocus: js.UndefOr[Boolean] = js.undefined,
    popoverClassName: String = null,
    popoverRef: /* ref */ HTMLDivElement | Null => Callback = null,
    portalClassName: String = null,
    portalContainer: HTMLElement = null,
    position: PopoverPosition = null,
    target: String | Element = null,
    targetClassName: String = null,
    targetProps: HTMLAttributes[HTMLElement] = null,
    targetTagName: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 175 */ js.Any = null,
    transitionDuration: Int | Double = null,
    usePortal: js.UndefOr[Boolean] = js.undefined,
    wrapperTagName: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 175 */ js.Any = null
  ): PartialIPopoverProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoFocus)) __obj.updateDynamic("autoFocus")(autoFocus.asInstanceOf[js.Any])
    if (backdropProps != null) __obj.updateDynamic("backdropProps")(backdropProps.asInstanceOf[js.Any])
    if (boundary != null) __obj.updateDynamic("boundary")(boundary.asInstanceOf[js.Any])
    if (!js.isUndefined(canEscapeKeyClose)) __obj.updateDynamic("canEscapeKeyClose")(canEscapeKeyClose.asInstanceOf[js.Any])
    if (!js.isUndefined(captureDismiss)) __obj.updateDynamic("captureDismiss")(captureDismiss.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultIsOpen)) __obj.updateDynamic("defaultIsOpen")(defaultIsOpen.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (!js.isUndefined(enforceFocus)) __obj.updateDynamic("enforceFocus")(enforceFocus.asInstanceOf[js.Any])
    if (!js.isUndefined(fill)) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (!js.isUndefined(hasBackdrop)) __obj.updateDynamic("hasBackdrop")(hasBackdrop.asInstanceOf[js.Any])
    if (hoverCloseDelay != null) __obj.updateDynamic("hoverCloseDelay")(hoverCloseDelay.asInstanceOf[js.Any])
    if (hoverOpenDelay != null) __obj.updateDynamic("hoverOpenDelay")(hoverOpenDelay.asInstanceOf[js.Any])
    if (!js.isUndefined(inheritDarkTheme)) __obj.updateDynamic("inheritDarkTheme")(inheritDarkTheme.asInstanceOf[js.Any])
    if (interactionKind != null) __obj.updateDynamic("interactionKind")(interactionKind.asInstanceOf[js.Any])
    if (!js.isUndefined(isOpen)) __obj.updateDynamic("isOpen")(isOpen.asInstanceOf[js.Any])
    if (!js.isUndefined(`lazy`)) __obj.updateDynamic("lazy")(`lazy`.asInstanceOf[js.Any])
    if (!js.isUndefined(minimal)) __obj.updateDynamic("minimal")(minimal.asInstanceOf[js.Any])
    if (modifiers != null) __obj.updateDynamic("modifiers")(modifiers.asInstanceOf[js.Any])
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction1((t0: /* event */ js.UndefOr[japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLElement]]) => onClose(t0).runNow()))
    if (onClosed != null) __obj.updateDynamic("onClosed")(js.Any.fromFunction1((t0: /* node */ org.scalajs.dom.raw.HTMLElement) => onClosed(t0).runNow()))
    if (onClosing != null) __obj.updateDynamic("onClosing")(js.Any.fromFunction1((t0: /* node */ org.scalajs.dom.raw.HTMLElement) => onClosing(t0).runNow()))
    if (onInteraction != null) __obj.updateDynamic("onInteraction")(js.Any.fromFunction2((t0: /* nextOpenState */ scala.Boolean, t1: /* e */ js.UndefOr[japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLElement]]) => onInteraction(t0, t1).runNow()))
    if (onOpened != null) __obj.updateDynamic("onOpened")(js.Any.fromFunction1((t0: /* node */ org.scalajs.dom.raw.HTMLElement) => onOpened(t0).runNow()))
    if (onOpening != null) __obj.updateDynamic("onOpening")(js.Any.fromFunction1((t0: /* node */ org.scalajs.dom.raw.HTMLElement) => onOpening(t0).runNow()))
    if (!js.isUndefined(openOnTargetFocus)) __obj.updateDynamic("openOnTargetFocus")(openOnTargetFocus.asInstanceOf[js.Any])
    if (popoverClassName != null) __obj.updateDynamic("popoverClassName")(popoverClassName.asInstanceOf[js.Any])
    if (popoverRef != null) __obj.updateDynamic("popoverRef")(js.Any.fromFunction1((t0: /* ref */ org.scalajs.dom.raw.HTMLDivElement | scala.Null) => popoverRef(t0).runNow()))
    if (portalClassName != null) __obj.updateDynamic("portalClassName")(portalClassName.asInstanceOf[js.Any])
    if (portalContainer != null) __obj.updateDynamic("portalContainer")(portalContainer.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (targetClassName != null) __obj.updateDynamic("targetClassName")(targetClassName.asInstanceOf[js.Any])
    if (targetProps != null) __obj.updateDynamic("targetProps")(targetProps.asInstanceOf[js.Any])
    if (targetTagName != null) __obj.updateDynamic("targetTagName")(targetTagName.asInstanceOf[js.Any])
    if (transitionDuration != null) __obj.updateDynamic("transitionDuration")(transitionDuration.asInstanceOf[js.Any])
    if (!js.isUndefined(usePortal)) __obj.updateDynamic("usePortal")(usePortal.asInstanceOf[js.Any])
    if (wrapperTagName != null) __obj.updateDynamic("wrapperTagName")(wrapperTagName.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialIPopoverProps]
  }
}

