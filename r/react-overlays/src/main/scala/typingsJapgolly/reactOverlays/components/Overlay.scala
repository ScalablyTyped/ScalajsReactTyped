package typingsJapgolly.reactOverlays.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Element
import japgolly.scalajs.react.raw.React.Node
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.react.mod.ReactInstance
import typingsJapgolly.reactOverlays.overlayMod.OverlayProps
import typingsJapgolly.reactOverlays.overlayMod.OverlayRenderProps
import typingsJapgolly.reactOverlays.overlayMod.Placements
import typingsJapgolly.reactOverlays.portalMod.PortalProps
import typingsJapgolly.reactOverlays.reactOverlaysStrings.click
import typingsJapgolly.reactOverlays.reactOverlaysStrings.mousedown
import typingsJapgolly.reactTransitionGroup.transitionMod.TransitionProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Overlay {
  def apply(
    container: Node | js.Function = null,
    flip: js.UndefOr[Boolean] = js.undefined,
    onEnter: /* node */ HTMLElement => CallbackTo[js.Any] = null,
    onEntered: /* node */ HTMLElement => CallbackTo[js.Any] = null,
    onEntering: /* node */ HTMLElement => CallbackTo[js.Any] = null,
    onExit: /* node */ HTMLElement => CallbackTo[js.Any] = null,
    onExited: /* node */ HTMLElement => CallbackTo[js.Any] = null,
    onExiting: /* node */ HTMLElement => CallbackTo[js.Any] = null,
    onHide: (/* props */ PortalProps, /* repeated */ js.Any) => CallbackTo[js.Any] = null,
    onRendered: js.Function = null,
    placement: Placements = null,
    popperConfig: js.Object = null,
    rootClose: js.UndefOr[Boolean] = js.undefined,
    rootCloseDisabled: js.UndefOr[Boolean] = js.undefined,
    rootCloseEvent: click | mousedown = null,
    show: js.UndefOr[Boolean] = js.undefined,
    target: ReactInstance | js.Function0[ReactInstance] = null,
    transition: ComponentType[TransitionProps] = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: OverlayRenderProps => CallbackTo[Element]
  ): UnmountedWithRoot[OverlayProps, typingsJapgolly.reactOverlays.mod.Overlay, Unit, OverlayProps] = {
    val __obj = js.Dynamic.literal()
  
      __obj.updateDynamic("children")(js.Any.fromFunction1((t0: typingsJapgolly.reactOverlays.overlayMod.OverlayRenderProps) => children(t0).runNow()))
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (!js.isUndefined(flip)) __obj.updateDynamic("flip")(flip.asInstanceOf[js.Any])
    if (onEnter != null) __obj.updateDynamic("onEnter")(js.Any.fromFunction1((t0: /* node */ org.scalajs.dom.raw.HTMLElement) => onEnter(t0).runNow()))
    if (onEntered != null) __obj.updateDynamic("onEntered")(js.Any.fromFunction1((t0: /* node */ org.scalajs.dom.raw.HTMLElement) => onEntered(t0).runNow()))
    if (onEntering != null) __obj.updateDynamic("onEntering")(js.Any.fromFunction1((t0: /* node */ org.scalajs.dom.raw.HTMLElement) => onEntering(t0).runNow()))
    if (onExit != null) __obj.updateDynamic("onExit")(js.Any.fromFunction1((t0: /* node */ org.scalajs.dom.raw.HTMLElement) => onExit(t0).runNow()))
    if (onExited != null) __obj.updateDynamic("onExited")(js.Any.fromFunction1((t0: /* node */ org.scalajs.dom.raw.HTMLElement) => onExited(t0).runNow()))
    if (onExiting != null) __obj.updateDynamic("onExiting")(js.Any.fromFunction1((t0: /* node */ org.scalajs.dom.raw.HTMLElement) => onExiting(t0).runNow()))
    if (onHide != null) __obj.updateDynamic("onHide")(js.Any.fromFunction2((t0: /* props */ typingsJapgolly.reactOverlays.portalMod.PortalProps, t1: /* repeated */ js.Any) => onHide(t0, t1).runNow()))
    if (onRendered != null) __obj.updateDynamic("onRendered")(onRendered.asInstanceOf[js.Any])
    if (placement != null) __obj.updateDynamic("placement")(placement.asInstanceOf[js.Any])
    if (popperConfig != null) __obj.updateDynamic("popperConfig")(popperConfig.asInstanceOf[js.Any])
    if (!js.isUndefined(rootClose)) __obj.updateDynamic("rootClose")(rootClose.asInstanceOf[js.Any])
    if (!js.isUndefined(rootCloseDisabled)) __obj.updateDynamic("rootCloseDisabled")(rootCloseDisabled.asInstanceOf[js.Any])
    if (rootCloseEvent != null) __obj.updateDynamic("rootCloseEvent")(rootCloseEvent.asInstanceOf[js.Any])
    if (!js.isUndefined(show)) __obj.updateDynamic("show")(show.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (transition != null) __obj.updateDynamic("transition")(transition.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactOverlays.overlayMod.OverlayProps, 
  japgolly.scalajs.react.Children.None, 
  typingsJapgolly.reactOverlays.mod.Overlay](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactOverlays.overlayMod.OverlayProps])
  }
  @JSImport("react-overlays", "Overlay")
  @js.native
  object componentImport extends js.Object
  
}

