package typingsJapgolly.semanticDashUiDashReact.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.semanticDashUiDashReact.distCommonjsGenericMod.SemanticTRANSITIONS
import typingsJapgolly.semanticDashUiDashReact.distCommonjsModulesTransitionMod.default
import typingsJapgolly.semanticDashUiDashReact.distCommonjsModulesTransitionTransitionMod.TransitionEventData
import typingsJapgolly.semanticDashUiDashReact.distCommonjsModulesTransitionTransitionMod.TransitionPropDuration
import typingsJapgolly.semanticDashUiDashReact.distCommonjsModulesTransitionTransitionMod.TransitionProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Transition {
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    animation: SemanticTRANSITIONS | String = null,
    directional: js.UndefOr[Boolean] = js.undefined,
    duration: Double | String | TransitionPropDuration = null,
    mountOnShow: js.UndefOr[Boolean] = js.undefined,
    onComplete: (/* nothing */ Null, /* data */ TransitionEventData) => Callback = null,
    onHide: (/* nothing */ Null, /* data */ TransitionEventData) => Callback = null,
    onShow: (/* nothing */ Null, /* data */ TransitionEventData) => Callback = null,
    onStart: (/* nothing */ Null, /* data */ TransitionEventData) => Callback = null,
    reactKey: String = null,
    transitionOnMount: js.UndefOr[Boolean] = js.undefined,
    unmountOnHide: js.UndefOr[Boolean] = js.undefined,
    visible: js.UndefOr[Boolean] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[TransitionProps, default, Unit, TransitionProps] = {
    val __obj = js.Dynamic.literal()
  
      if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (!js.isUndefined(directional)) __obj.updateDynamic("directional")(directional.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (!js.isUndefined(mountOnShow)) __obj.updateDynamic("mountOnShow")(mountOnShow.asInstanceOf[js.Any])
    if (onComplete != null) __obj.updateDynamic("onComplete")(js.Any.fromFunction2((t0: /* nothing */ scala.Null, t1: /* data */ typingsJapgolly.semanticDashUiDashReact.distCommonjsModulesTransitionTransitionMod.TransitionEventData) => onComplete(t0, t1).runNow()))
    if (onHide != null) __obj.updateDynamic("onHide")(js.Any.fromFunction2((t0: /* nothing */ scala.Null, t1: /* data */ typingsJapgolly.semanticDashUiDashReact.distCommonjsModulesTransitionTransitionMod.TransitionEventData) => onHide(t0, t1).runNow()))
    if (onShow != null) __obj.updateDynamic("onShow")(js.Any.fromFunction2((t0: /* nothing */ scala.Null, t1: /* data */ typingsJapgolly.semanticDashUiDashReact.distCommonjsModulesTransitionTransitionMod.TransitionEventData) => onShow(t0, t1).runNow()))
    if (onStart != null) __obj.updateDynamic("onStart")(js.Any.fromFunction2((t0: /* nothing */ scala.Null, t1: /* data */ typingsJapgolly.semanticDashUiDashReact.distCommonjsModulesTransitionTransitionMod.TransitionEventData) => onStart(t0, t1).runNow()))
    if (reactKey != null) __obj.updateDynamic("reactKey")(reactKey.asInstanceOf[js.Any])
    if (!js.isUndefined(transitionOnMount)) __obj.updateDynamic("transitionOnMount")(transitionOnMount.asInstanceOf[js.Any])
    if (!js.isUndefined(unmountOnHide)) __obj.updateDynamic("unmountOnHide")(unmountOnHide.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.semanticDashUiDashReact.distCommonjsModulesTransitionTransitionMod.TransitionProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.semanticDashUiDashReact.distCommonjsModulesTransitionMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.semanticDashUiDashReact.distCommonjsModulesTransitionTransitionMod.TransitionProps])(children: _*)
  }
  @JSImport("semantic-ui-react/dist/commonjs/modules/Transition", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

