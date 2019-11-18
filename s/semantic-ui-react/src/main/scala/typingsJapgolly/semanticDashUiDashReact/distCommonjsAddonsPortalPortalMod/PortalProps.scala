package typingsJapgolly.semanticDashUiDashReact.distCommonjsAddonsPortalPortalMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.raw.React.Ref
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PortalProps
  extends StrictPortalProps
     with /* key */ StringDictionary[js.Any]

object PortalProps {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    children: VdomNode = null,
    closeOnDocumentClick: js.UndefOr[Boolean] = js.undefined,
    closeOnEscape: js.UndefOr[Boolean] = js.undefined,
    closeOnPortalMouseLeave: js.UndefOr[Boolean] = js.undefined,
    closeOnTriggerBlur: js.UndefOr[Boolean] = js.undefined,
    closeOnTriggerClick: js.UndefOr[Boolean] = js.undefined,
    closeOnTriggerMouseLeave: js.UndefOr[Boolean] = js.undefined,
    defaultOpen: js.UndefOr[Boolean] = js.undefined,
    eventPool: String = null,
    mountNode: js.Any = null,
    mouseEnterDelay: Int | Double = null,
    mouseLeaveDelay: Int | Double = null,
    onClose: (/* event */ ReactMouseEventFrom[HTMLElement], /* data */ PortalProps) => Callback = null,
    onMount: (/* nothing */ Null, /* data */ PortalProps) => Callback = null,
    onOpen: (/* event */ ReactMouseEventFrom[HTMLElement], /* data */ PortalProps) => Callback = null,
    onUnmount: (/* nothing */ Null, /* data */ PortalProps) => Callback = null,
    open: js.UndefOr[Boolean] = js.undefined,
    openOnTriggerClick: js.UndefOr[Boolean] = js.undefined,
    openOnTriggerFocus: js.UndefOr[Boolean] = js.undefined,
    openOnTriggerMouseEnter: js.UndefOr[Boolean] = js.undefined,
    trigger: VdomNode = null,
    triggerRef: Ref = null
  ): PortalProps = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    if (!js.isUndefined(closeOnDocumentClick)) __obj.updateDynamic("closeOnDocumentClick")(closeOnDocumentClick.asInstanceOf[js.Any])
    if (!js.isUndefined(closeOnEscape)) __obj.updateDynamic("closeOnEscape")(closeOnEscape.asInstanceOf[js.Any])
    if (!js.isUndefined(closeOnPortalMouseLeave)) __obj.updateDynamic("closeOnPortalMouseLeave")(closeOnPortalMouseLeave.asInstanceOf[js.Any])
    if (!js.isUndefined(closeOnTriggerBlur)) __obj.updateDynamic("closeOnTriggerBlur")(closeOnTriggerBlur.asInstanceOf[js.Any])
    if (!js.isUndefined(closeOnTriggerClick)) __obj.updateDynamic("closeOnTriggerClick")(closeOnTriggerClick.asInstanceOf[js.Any])
    if (!js.isUndefined(closeOnTriggerMouseLeave)) __obj.updateDynamic("closeOnTriggerMouseLeave")(closeOnTriggerMouseLeave.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultOpen)) __obj.updateDynamic("defaultOpen")(defaultOpen.asInstanceOf[js.Any])
    if (eventPool != null) __obj.updateDynamic("eventPool")(eventPool.asInstanceOf[js.Any])
    if (mountNode != null) __obj.updateDynamic("mountNode")(mountNode.asInstanceOf[js.Any])
    if (mouseEnterDelay != null) __obj.updateDynamic("mouseEnterDelay")(mouseEnterDelay.asInstanceOf[js.Any])
    if (mouseLeaveDelay != null) __obj.updateDynamic("mouseLeaveDelay")(mouseLeaveDelay.asInstanceOf[js.Any])
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction2((t0: /* event */ japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLElement], t1: /* data */ typingsJapgolly.semanticDashUiDashReact.distCommonjsAddonsPortalPortalMod.PortalProps) => onClose(t0, t1).runNow()))
    if (onMount != null) __obj.updateDynamic("onMount")(js.Any.fromFunction2((t0: /* nothing */ scala.Null, t1: /* data */ typingsJapgolly.semanticDashUiDashReact.distCommonjsAddonsPortalPortalMod.PortalProps) => onMount(t0, t1).runNow()))
    if (onOpen != null) __obj.updateDynamic("onOpen")(js.Any.fromFunction2((t0: /* event */ japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLElement], t1: /* data */ typingsJapgolly.semanticDashUiDashReact.distCommonjsAddonsPortalPortalMod.PortalProps) => onOpen(t0, t1).runNow()))
    if (onUnmount != null) __obj.updateDynamic("onUnmount")(js.Any.fromFunction2((t0: /* nothing */ scala.Null, t1: /* data */ typingsJapgolly.semanticDashUiDashReact.distCommonjsAddonsPortalPortalMod.PortalProps) => onUnmount(t0, t1).runNow()))
    if (!js.isUndefined(open)) __obj.updateDynamic("open")(open.asInstanceOf[js.Any])
    if (!js.isUndefined(openOnTriggerClick)) __obj.updateDynamic("openOnTriggerClick")(openOnTriggerClick.asInstanceOf[js.Any])
    if (!js.isUndefined(openOnTriggerFocus)) __obj.updateDynamic("openOnTriggerFocus")(openOnTriggerFocus.asInstanceOf[js.Any])
    if (!js.isUndefined(openOnTriggerMouseEnter)) __obj.updateDynamic("openOnTriggerMouseEnter")(openOnTriggerMouseEnter.asInstanceOf[js.Any])
    if (trigger != null) __obj.updateDynamic("trigger")(trigger.rawNode.asInstanceOf[js.Any])
    if (triggerRef != null) __obj.updateDynamic("triggerRef")(triggerRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[PortalProps]
  }
}

