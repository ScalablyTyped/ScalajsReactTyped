package typingsJapgolly.semanticUiReact.transitionablePortalTransitionablePortalMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.semanticUiReact.portalPortalMod.PortalProps
import typingsJapgolly.semanticUiReact.transitionTransitionMod.TransitionEventData
import typingsJapgolly.semanticUiReact.transitionTransitionMod.TransitionProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StrictTransitionablePortalProps extends js.Object {
  /** Primary content. */
  var children: Node
  /**
    * Called when a close event happens.
    *
    * @param {SyntheticEvent} event - React's original SyntheticEvent.
    * @param {object} data - All props and internal state.
    */
  var onClose: js.UndefOr[
    js.Function2[/* nothing */ Null, /* data */ PortalProps with TransitionablePortalState, Unit]
  ] = js.undefined
  /**
    * Callback on each transition that changes visibility to hidden.
    *
    * @param {null}
    * @param {object} data - All props with status.
    */
  var onHide: js.UndefOr[
    js.Function2[
      /* nothing */ Null, 
      /* data */ TransitionEventData with TransitionablePortalState, 
      Unit
    ]
  ] = js.undefined
  /**
    * Called when an open event happens.
    *
    * @param {SyntheticEvent} event - React's original SyntheticEvent.
    * @param {object} data - All props and internal state.
    */
  var onOpen: js.UndefOr[
    js.Function2[/* nothing */ Null, /* data */ PortalProps with TransitionablePortalState, Unit]
  ] = js.undefined
  /**
    * Callback on animation start.
    *
    * @param {null}
    * @param {object} data - All props with status.
    */
  var onStart: js.UndefOr[
    js.Function2[
      /* nothing */ Null, 
      /* data */ TransitionEventData with TransitionablePortalState, 
      Unit
    ]
  ] = js.undefined
  /** Controls whether or not the portal is displayed. */
  var open: js.UndefOr[Boolean] = js.undefined
  /** Transition props. */
  var transition: js.UndefOr[TransitionProps] = js.undefined
}

object StrictTransitionablePortalProps {
  @scala.inline
  def apply(
    children: VdomNode = null,
    onClose: (/* nothing */ Null, /* data */ PortalProps with TransitionablePortalState) => Callback = null,
    onHide: (/* nothing */ Null, /* data */ TransitionEventData with TransitionablePortalState) => Callback = null,
    onOpen: (/* nothing */ Null, /* data */ PortalProps with TransitionablePortalState) => Callback = null,
    onStart: (/* nothing */ Null, /* data */ TransitionEventData with TransitionablePortalState) => Callback = null,
    open: js.UndefOr[Boolean] = js.undefined,
    transition: TransitionProps = null
  ): StrictTransitionablePortalProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction2((t0: /* nothing */ scala.Null, t1: /* data */ typingsJapgolly.semanticUiReact.portalPortalMod.PortalProps with typingsJapgolly.semanticUiReact.transitionablePortalTransitionablePortalMod.TransitionablePortalState) => onClose(t0, t1).runNow()))
    if (onHide != null) __obj.updateDynamic("onHide")(js.Any.fromFunction2((t0: /* nothing */ scala.Null, t1: /* data */ typingsJapgolly.semanticUiReact.transitionTransitionMod.TransitionEventData with typingsJapgolly.semanticUiReact.transitionablePortalTransitionablePortalMod.TransitionablePortalState) => onHide(t0, t1).runNow()))
    if (onOpen != null) __obj.updateDynamic("onOpen")(js.Any.fromFunction2((t0: /* nothing */ scala.Null, t1: /* data */ typingsJapgolly.semanticUiReact.portalPortalMod.PortalProps with typingsJapgolly.semanticUiReact.transitionablePortalTransitionablePortalMod.TransitionablePortalState) => onOpen(t0, t1).runNow()))
    if (onStart != null) __obj.updateDynamic("onStart")(js.Any.fromFunction2((t0: /* nothing */ scala.Null, t1: /* data */ typingsJapgolly.semanticUiReact.transitionTransitionMod.TransitionEventData with typingsJapgolly.semanticUiReact.transitionablePortalTransitionablePortalMod.TransitionablePortalState) => onStart(t0, t1).runNow()))
    if (!js.isUndefined(open)) __obj.updateDynamic("open")(open.asInstanceOf[js.Any])
    if (transition != null) __obj.updateDynamic("transition")(transition.asInstanceOf[js.Any])
    __obj.asInstanceOf[StrictTransitionablePortalProps]
  }
}

