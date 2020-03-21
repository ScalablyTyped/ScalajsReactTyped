package typingsJapgolly.reactOverlays.overlayMod

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Element
import japgolly.scalajs.react.raw.React.Node
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.react.mod.ReactInstance
import typingsJapgolly.reactOverlays.mod.TransitionCallbacks
import typingsJapgolly.reactOverlays.portalMod.PortalProps
import typingsJapgolly.reactOverlays.reactOverlaysStrings.click
import typingsJapgolly.reactOverlays.reactOverlaysStrings.mousedown
import typingsJapgolly.reactTransitionGroup.transitionMod.TransitionProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OverlayProps
  extends TransitionCallbacks
     with PortalProps {
  /**
    * Enables the Popper.js `flip` modifier, allowing the Overlay to
    * automatically adjust it's placement in case of overlap with the viewport or toggle.
    */
  var flip: js.UndefOr[Boolean] = js.undefined
  /**
    * A Callback fired by the Overlay when it wishes to be hidden.
    *
    * __required__ when `rootClose` is `true`.
    */
  var onHide: js.UndefOr[js.Function2[/* props */ PortalProps, /* repeated */ js.Any, _]] = js.undefined
  /** Specify where the overlay element is positioned in relation to the target element */
  var placement: js.UndefOr[Placements] = js.undefined
  /**
    * A set of popper options and props passed directly to react-popper's Popper component.
    */
  var popperConfig: js.UndefOr[js.Object] = js.undefined
  /**
    * Specify whether the overlay should trigger `onHide` when the user clicks outside the overlay
    */
  var rootClose: js.UndefOr[Boolean] = js.undefined
  /**
    * Specify disabled for disable RootCloseWrapper
    */
  var rootCloseDisabled: js.UndefOr[Boolean] = js.undefined
  /**
    * Specify event for toggling overlay
    */
  var rootCloseEvent: js.UndefOr[click | mousedown] = js.undefined
  /**
    * Set the visibility of the Overlay
    */
  var show: js.UndefOr[Boolean] = js.undefined
  var target: js.UndefOr[ReactInstance | js.Function0[ReactInstance]] = js.undefined
  /**
    * A `react-transition-group@2.0.0` `<Transition/>` component
    * used to animate the overlay as it changes visibility.
    */
  var transition: js.UndefOr[ComponentType[TransitionProps]] = js.undefined
  /**
    * A render prop that returns an element to overlay and position. See
    * the [react-popper documentation](https://github.com/FezVrasta/react-popper#children) for more info.
    */
  def children(renderProps: OverlayRenderProps): Element
}

object OverlayProps {
  @scala.inline
  def apply(
    children: OverlayRenderProps => CallbackTo[Element],
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
    transition: ComponentType[TransitionProps] = null
  ): OverlayProps = {
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
    __obj.asInstanceOf[OverlayProps]
  }
}

