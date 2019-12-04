package typingsJapgolly.semanticDashUiDashReact.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.semanticDashUiDashReact.distCommonjsAddonsPortalPortalMod.PortalProps
import typingsJapgolly.semanticDashUiDashReact.distCommonjsAddonsTransitionablePortalMod.default
import typingsJapgolly.semanticDashUiDashReact.distCommonjsAddonsTransitionablePortalTransitionablePortalMod.TransitionablePortalProps
import typingsJapgolly.semanticDashUiDashReact.distCommonjsAddonsTransitionablePortalTransitionablePortalMod.TransitionablePortalState
import typingsJapgolly.semanticDashUiDashReact.distCommonjsModulesTransitionTransitionMod.TransitionEventData
import typingsJapgolly.semanticDashUiDashReact.distCommonjsModulesTransitionTransitionMod.TransitionProps
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
    overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[TransitionablePortalProps, default, Unit, TransitionablePortalProps] = {
    val __obj = js.Dynamic.literal()
  
      if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction2((t0: /* nothing */ scala.Null, t1: /* data */ typingsJapgolly.semanticDashUiDashReact.distCommonjsAddonsPortalPortalMod.PortalProps with typingsJapgolly.semanticDashUiDashReact.distCommonjsAddonsTransitionablePortalTransitionablePortalMod.TransitionablePortalState) => onClose(t0, t1).runNow()))
    if (onHide != null) __obj.updateDynamic("onHide")(js.Any.fromFunction2((t0: /* nothing */ scala.Null, t1: /* data */ typingsJapgolly.semanticDashUiDashReact.distCommonjsModulesTransitionTransitionMod.TransitionEventData with typingsJapgolly.semanticDashUiDashReact.distCommonjsAddonsTransitionablePortalTransitionablePortalMod.TransitionablePortalState) => onHide(t0, t1).runNow()))
    if (onOpen != null) __obj.updateDynamic("onOpen")(js.Any.fromFunction2((t0: /* nothing */ scala.Null, t1: /* data */ typingsJapgolly.semanticDashUiDashReact.distCommonjsAddonsPortalPortalMod.PortalProps with typingsJapgolly.semanticDashUiDashReact.distCommonjsAddonsTransitionablePortalTransitionablePortalMod.TransitionablePortalState) => onOpen(t0, t1).runNow()))
    if (onStart != null) __obj.updateDynamic("onStart")(js.Any.fromFunction2((t0: /* nothing */ scala.Null, t1: /* data */ typingsJapgolly.semanticDashUiDashReact.distCommonjsModulesTransitionTransitionMod.TransitionEventData with typingsJapgolly.semanticDashUiDashReact.distCommonjsAddonsTransitionablePortalTransitionablePortalMod.TransitionablePortalState) => onStart(t0, t1).runNow()))
    if (!js.isUndefined(open)) __obj.updateDynamic("open")(open.asInstanceOf[js.Any])
    if (transition != null) __obj.updateDynamic("transition")(transition.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.semanticDashUiDashReact.distCommonjsAddonsTransitionablePortalTransitionablePortalMod.TransitionablePortalProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.semanticDashUiDashReact.distCommonjsAddonsTransitionablePortalMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.semanticDashUiDashReact.distCommonjsAddonsTransitionablePortalTransitionablePortalMod.TransitionablePortalProps])(children: _*)
  }
  @JSImport("semantic-ui-react/dist/commonjs/addons/TransitionablePortal", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

