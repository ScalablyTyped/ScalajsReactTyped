package typingsJapgolly.semanticUiReact.transitionablePortalTransitionablePortalMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.semanticUiReact.portalPortalMod.PortalProps
import typingsJapgolly.semanticUiReact.transitionTransitionMod.TransitionEventData
import typingsJapgolly.semanticUiReact.transitionTransitionMod.TransitionProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransitionablePortalProps
  extends StrictTransitionablePortalProps
     with /* key */ StringDictionary[js.Any]

object TransitionablePortalProps {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    children: VdomNode = null,
    onClose: (/* nothing */ Null, /* data */ PortalProps with TransitionablePortalState) => Callback = null,
    onHide: (/* nothing */ Null, /* data */ TransitionEventData with TransitionablePortalState) => Callback = null,
    onOpen: (/* nothing */ Null, /* data */ PortalProps with TransitionablePortalState) => Callback = null,
    onStart: (/* nothing */ Null, /* data */ TransitionEventData with TransitionablePortalState) => Callback = null,
    open: js.UndefOr[Boolean] = js.undefined,
    transition: TransitionProps = null
  ): TransitionablePortalProps = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction2((t0: /* nothing */ scala.Null, t1: /* data */ typingsJapgolly.semanticUiReact.portalPortalMod.PortalProps with typingsJapgolly.semanticUiReact.transitionablePortalTransitionablePortalMod.TransitionablePortalState) => onClose(t0, t1).runNow()))
    if (onHide != null) __obj.updateDynamic("onHide")(js.Any.fromFunction2((t0: /* nothing */ scala.Null, t1: /* data */ typingsJapgolly.semanticUiReact.transitionTransitionMod.TransitionEventData with typingsJapgolly.semanticUiReact.transitionablePortalTransitionablePortalMod.TransitionablePortalState) => onHide(t0, t1).runNow()))
    if (onOpen != null) __obj.updateDynamic("onOpen")(js.Any.fromFunction2((t0: /* nothing */ scala.Null, t1: /* data */ typingsJapgolly.semanticUiReact.portalPortalMod.PortalProps with typingsJapgolly.semanticUiReact.transitionablePortalTransitionablePortalMod.TransitionablePortalState) => onOpen(t0, t1).runNow()))
    if (onStart != null) __obj.updateDynamic("onStart")(js.Any.fromFunction2((t0: /* nothing */ scala.Null, t1: /* data */ typingsJapgolly.semanticUiReact.transitionTransitionMod.TransitionEventData with typingsJapgolly.semanticUiReact.transitionablePortalTransitionablePortalMod.TransitionablePortalState) => onStart(t0, t1).runNow()))
    if (!js.isUndefined(open)) __obj.updateDynamic("open")(open.asInstanceOf[js.Any])
    if (transition != null) __obj.updateDynamic("transition")(transition.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransitionablePortalProps]
  }
}

