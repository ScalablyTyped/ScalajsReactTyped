package typingsJapgolly.semanticUiReact.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.semanticUiReact.portalPortalMod.PortalProps
import typingsJapgolly.semanticUiReact.transitionTransitionMod.TransitionEventData
import typingsJapgolly.semanticUiReact.transitionTransitionMod.TransitionProps
import typingsJapgolly.semanticUiReact.transitionablePortalMod.default
import typingsJapgolly.semanticUiReact.transitionablePortalTransitionablePortalMod.TransitionablePortalProps
import typingsJapgolly.semanticUiReact.transitionablePortalTransitionablePortalMod.TransitionablePortalState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object TransitionablePortal {
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    onClose: (/* nothing */ Null, /* data */ PortalProps with TransitionablePortalState) => Callback = null,
    onHide: (/* nothing */ Null, /* data */ TransitionEventData with TransitionablePortalState) => Callback = null,
    onOpen: (/* nothing */ Null, /* data */ PortalProps with TransitionablePortalState) => Callback = null,
    onStart: (/* nothing */ Null, /* data */ TransitionEventData with TransitionablePortalState) => Callback = null,
    open: js.UndefOr[Boolean] = js.undefined,
    transition: TransitionProps = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[TransitionablePortalProps, default, Unit, TransitionablePortalProps] = {
    val __obj = js.Dynamic.literal()
  
      if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction2((t0: /* nothing */ scala.Null, t1: /* data */ typingsJapgolly.semanticUiReact.portalPortalMod.PortalProps with typingsJapgolly.semanticUiReact.transitionablePortalTransitionablePortalMod.TransitionablePortalState) => onClose(t0, t1).runNow()))
    if (onHide != null) __obj.updateDynamic("onHide")(js.Any.fromFunction2((t0: /* nothing */ scala.Null, t1: /* data */ typingsJapgolly.semanticUiReact.transitionTransitionMod.TransitionEventData with typingsJapgolly.semanticUiReact.transitionablePortalTransitionablePortalMod.TransitionablePortalState) => onHide(t0, t1).runNow()))
    if (onOpen != null) __obj.updateDynamic("onOpen")(js.Any.fromFunction2((t0: /* nothing */ scala.Null, t1: /* data */ typingsJapgolly.semanticUiReact.portalPortalMod.PortalProps with typingsJapgolly.semanticUiReact.transitionablePortalTransitionablePortalMod.TransitionablePortalState) => onOpen(t0, t1).runNow()))
    if (onStart != null) __obj.updateDynamic("onStart")(js.Any.fromFunction2((t0: /* nothing */ scala.Null, t1: /* data */ typingsJapgolly.semanticUiReact.transitionTransitionMod.TransitionEventData with typingsJapgolly.semanticUiReact.transitionablePortalTransitionablePortalMod.TransitionablePortalState) => onStart(t0, t1).runNow()))
    if (!js.isUndefined(open)) __obj.updateDynamic("open")(open.asInstanceOf[js.Any])
    if (transition != null) __obj.updateDynamic("transition")(transition.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.semanticUiReact.transitionablePortalTransitionablePortalMod.TransitionablePortalProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.semanticUiReact.transitionablePortalMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.semanticUiReact.transitionablePortalTransitionablePortalMod.TransitionablePortalProps])(children: _*)
  }
  @JSImport("semantic-ui-react/dist/commonjs/addons/TransitionablePortal", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

