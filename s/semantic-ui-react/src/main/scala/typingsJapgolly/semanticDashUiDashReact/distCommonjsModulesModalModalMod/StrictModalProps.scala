package typingsJapgolly.semanticDashUiDashReact.distCommonjsModulesModalModalMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.raw.React.Ref
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.react.reactMod.CSSProperties
import typingsJapgolly.semanticDashUiDashReact.distCommonjsAddonsPortalPortalMod.StrictPortalProps
import typingsJapgolly.semanticDashUiDashReact.distCommonjsGenericMod.SemanticShorthandItem
import typingsJapgolly.semanticDashUiDashReact.distCommonjsModulesModalModalActionsMod.ModalActionsProps
import typingsJapgolly.semanticDashUiDashReact.distCommonjsModulesModalModalContentMod.ModalContentProps
import typingsJapgolly.semanticDashUiDashReact.distCommonjsModulesModalModalHeaderMod.ModalHeaderProps
import typingsJapgolly.semanticDashUiDashReact.semanticDashUiDashReactNumbers.`true`
import typingsJapgolly.semanticDashUiDashReact.semanticDashUiDashReactStrings.blurring
import typingsJapgolly.semanticDashUiDashReact.semanticDashUiDashReactStrings.fullscreen
import typingsJapgolly.semanticDashUiDashReact.semanticDashUiDashReactStrings.inverted
import typingsJapgolly.semanticDashUiDashReact.semanticDashUiDashReactStrings.large
import typingsJapgolly.semanticDashUiDashReact.semanticDashUiDashReactStrings.mini
import typingsJapgolly.semanticDashUiDashReact.semanticDashUiDashReactStrings.small
import typingsJapgolly.semanticDashUiDashReact.semanticDashUiDashReactStrings.tiny
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StrictModalProps extends StrictPortalProps {
  /** Shorthand for Modal.Actions. Typically an array of button shorthand. */
  var actions: js.UndefOr[SemanticShorthandItem[ModalActionsProps]] = js.undefined
  /** An element type to render as (string or function). */
  var as: js.UndefOr[js.Any] = js.undefined
  /** A Modal can reduce its complexity */
  var basic: js.UndefOr[Boolean] = js.undefined
  /** A modal can be vertically centered in the viewport */
  var centered: js.UndefOr[Boolean] = js.undefined
  /** Additional classes. */
  var className: js.UndefOr[String] = js.undefined
  /** Icon. */
  var closeIcon: js.UndefOr[js.Any] = js.undefined
  /** Whether or not the Modal should close when the dimmer is clicked. */
  var closeOnDimmerClick: js.UndefOr[Boolean] = js.undefined
  /** A Modal can be passed content via shorthand. */
  var content: js.UndefOr[SemanticShorthandItem[ModalContentProps]] = js.undefined
  /** A modal can appear in a dimmer. */
  var dimmer: js.UndefOr[`true` | blurring | inverted] = js.undefined
  /** A Modal can be passed header via shorthand. */
  var header: js.UndefOr[SemanticShorthandItem[ModalHeaderProps]] = js.undefined
  /**
    * Action onClick handler when using shorthand `actions`.
    *
    * @param {SyntheticEvent} event - React's original SyntheticEvent.
    * @param {object} data - All props.
    */
  var onActionClick: js.UndefOr[
    js.Function2[/* event */ ReactMouseEventFrom[HTMLElement], /* data */ ModalProps, Unit]
  ] = js.undefined
  /**
    * Called when a close event happens.
    *
    * @param {SyntheticEvent} event - React's original SyntheticEvent.
    * @param {object} data - All props.
    */
  @JSName("onClose")
  var onClose_StrictModalProps: js.UndefOr[
    js.Function2[/* event */ ReactMouseEventFrom[HTMLElement], /* data */ ModalProps, Unit]
  ] = js.undefined
  /**
    * Called when the portal is mounted on the DOM.
    *
    * @param {null}
    * @param {object} data - All props.
    */
  @JSName("onMount")
  var onMount_StrictModalProps: js.UndefOr[js.Function2[/* nothing */ Null, /* data */ ModalProps, Unit]] = js.undefined
  /**
    * Called when an open event happens.
    *
    * @param {SyntheticEvent} event - React's original SyntheticEvent.
    * @param {object} data - All props.
    */
  @JSName("onOpen")
  var onOpen_StrictModalProps: js.UndefOr[
    js.Function2[/* event */ ReactMouseEventFrom[HTMLElement], /* data */ ModalProps, Unit]
  ] = js.undefined
  /**
    * Called when the portal is unmounted from the DOM.
    *
    * @param {null}
    * @param {object} data - All props.
    */
  @JSName("onUnmount")
  var onUnmount_StrictModalProps: js.UndefOr[js.Function2[/* nothing */ Null, /* data */ ModalProps, Unit]] = js.undefined
  /** A modal can vary in size. */
  var size: js.UndefOr[mini | tiny | small | large | fullscreen] = js.undefined
  /** Custom styles. */
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object StrictModalProps {
  @scala.inline
  def apply(
    actions: SemanticShorthandItem[ModalActionsProps] = null,
    as: js.Any = null,
    basic: js.UndefOr[Boolean] = js.undefined,
    centered: js.UndefOr[Boolean] = js.undefined,
    children: VdomNode = null,
    className: String = null,
    closeIcon: js.Any = null,
    closeOnDimmerClick: js.UndefOr[Boolean] = js.undefined,
    closeOnDocumentClick: js.UndefOr[Boolean] = js.undefined,
    closeOnEscape: js.UndefOr[Boolean] = js.undefined,
    closeOnPortalMouseLeave: js.UndefOr[Boolean] = js.undefined,
    closeOnTriggerBlur: js.UndefOr[Boolean] = js.undefined,
    closeOnTriggerClick: js.UndefOr[Boolean] = js.undefined,
    closeOnTriggerMouseLeave: js.UndefOr[Boolean] = js.undefined,
    content: SemanticShorthandItem[ModalContentProps] = null,
    defaultOpen: js.UndefOr[Boolean] = js.undefined,
    dimmer: `true` | blurring | inverted = null,
    eventPool: String = null,
    header: SemanticShorthandItem[ModalHeaderProps] = null,
    mountNode: js.Any = null,
    mouseEnterDelay: Int | Double = null,
    mouseLeaveDelay: Int | Double = null,
    onActionClick: (/* event */ ReactMouseEventFrom[HTMLElement], /* data */ ModalProps) => Callback = null,
    onClose: (/* event */ ReactMouseEventFrom[HTMLElement], /* data */ ModalProps) => Callback = null,
    onMount: (/* nothing */ Null, /* data */ ModalProps) => Callback = null,
    onOpen: (/* event */ ReactMouseEventFrom[HTMLElement], /* data */ ModalProps) => Callback = null,
    onUnmount: (/* nothing */ Null, /* data */ ModalProps) => Callback = null,
    open: js.UndefOr[Boolean] = js.undefined,
    openOnTriggerClick: js.UndefOr[Boolean] = js.undefined,
    openOnTriggerFocus: js.UndefOr[Boolean] = js.undefined,
    openOnTriggerMouseEnter: js.UndefOr[Boolean] = js.undefined,
    size: mini | tiny | small | large | fullscreen = null,
    style: CSSProperties = null,
    trigger: VdomNode = null,
    triggerRef: Ref = null
  ): StrictModalProps = {
    val __obj = js.Dynamic.literal()
    if (actions != null) __obj.updateDynamic("actions")(actions.asInstanceOf[js.Any])
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (!js.isUndefined(basic)) __obj.updateDynamic("basic")(basic.asInstanceOf[js.Any])
    if (!js.isUndefined(centered)) __obj.updateDynamic("centered")(centered.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (closeIcon != null) __obj.updateDynamic("closeIcon")(closeIcon.asInstanceOf[js.Any])
    if (!js.isUndefined(closeOnDimmerClick)) __obj.updateDynamic("closeOnDimmerClick")(closeOnDimmerClick.asInstanceOf[js.Any])
    if (!js.isUndefined(closeOnDocumentClick)) __obj.updateDynamic("closeOnDocumentClick")(closeOnDocumentClick.asInstanceOf[js.Any])
    if (!js.isUndefined(closeOnEscape)) __obj.updateDynamic("closeOnEscape")(closeOnEscape.asInstanceOf[js.Any])
    if (!js.isUndefined(closeOnPortalMouseLeave)) __obj.updateDynamic("closeOnPortalMouseLeave")(closeOnPortalMouseLeave.asInstanceOf[js.Any])
    if (!js.isUndefined(closeOnTriggerBlur)) __obj.updateDynamic("closeOnTriggerBlur")(closeOnTriggerBlur.asInstanceOf[js.Any])
    if (!js.isUndefined(closeOnTriggerClick)) __obj.updateDynamic("closeOnTriggerClick")(closeOnTriggerClick.asInstanceOf[js.Any])
    if (!js.isUndefined(closeOnTriggerMouseLeave)) __obj.updateDynamic("closeOnTriggerMouseLeave")(closeOnTriggerMouseLeave.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultOpen)) __obj.updateDynamic("defaultOpen")(defaultOpen.asInstanceOf[js.Any])
    if (dimmer != null) __obj.updateDynamic("dimmer")(dimmer.asInstanceOf[js.Any])
    if (eventPool != null) __obj.updateDynamic("eventPool")(eventPool.asInstanceOf[js.Any])
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (mountNode != null) __obj.updateDynamic("mountNode")(mountNode.asInstanceOf[js.Any])
    if (mouseEnterDelay != null) __obj.updateDynamic("mouseEnterDelay")(mouseEnterDelay.asInstanceOf[js.Any])
    if (mouseLeaveDelay != null) __obj.updateDynamic("mouseLeaveDelay")(mouseLeaveDelay.asInstanceOf[js.Any])
    if (onActionClick != null) __obj.updateDynamic("onActionClick")(js.Any.fromFunction2((t0: /* event */ japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLElement], t1: /* data */ typingsJapgolly.semanticDashUiDashReact.distCommonjsModulesModalModalMod.ModalProps) => onActionClick(t0, t1).runNow()))
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction2((t0: /* event */ japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLElement], t1: /* data */ typingsJapgolly.semanticDashUiDashReact.distCommonjsModulesModalModalMod.ModalProps) => onClose(t0, t1).runNow()))
    if (onMount != null) __obj.updateDynamic("onMount")(js.Any.fromFunction2((t0: /* nothing */ scala.Null, t1: /* data */ typingsJapgolly.semanticDashUiDashReact.distCommonjsModulesModalModalMod.ModalProps) => onMount(t0, t1).runNow()))
    if (onOpen != null) __obj.updateDynamic("onOpen")(js.Any.fromFunction2((t0: /* event */ japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLElement], t1: /* data */ typingsJapgolly.semanticDashUiDashReact.distCommonjsModulesModalModalMod.ModalProps) => onOpen(t0, t1).runNow()))
    if (onUnmount != null) __obj.updateDynamic("onUnmount")(js.Any.fromFunction2((t0: /* nothing */ scala.Null, t1: /* data */ typingsJapgolly.semanticDashUiDashReact.distCommonjsModulesModalModalMod.ModalProps) => onUnmount(t0, t1).runNow()))
    if (!js.isUndefined(open)) __obj.updateDynamic("open")(open.asInstanceOf[js.Any])
    if (!js.isUndefined(openOnTriggerClick)) __obj.updateDynamic("openOnTriggerClick")(openOnTriggerClick.asInstanceOf[js.Any])
    if (!js.isUndefined(openOnTriggerFocus)) __obj.updateDynamic("openOnTriggerFocus")(openOnTriggerFocus.asInstanceOf[js.Any])
    if (!js.isUndefined(openOnTriggerMouseEnter)) __obj.updateDynamic("openOnTriggerMouseEnter")(openOnTriggerMouseEnter.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (trigger != null) __obj.updateDynamic("trigger")(trigger.rawNode.asInstanceOf[js.Any])
    if (triggerRef != null) __obj.updateDynamic("triggerRef")(triggerRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[StrictModalProps]
  }
}

