package typingsJapgolly.ionicReact

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Ref
import japgolly.scalajs.react.raw.React.RefHandle
import org.scalajs.dom.raw.CustomEvent
import typingsJapgolly.ionicCore.alertInterfaceMod.AlertButton
import typingsJapgolly.ionicCore.alertInterfaceMod.AlertInput
import typingsJapgolly.ionicCore.componentsMod._Global_.HTMLIonAlertElement
import typingsJapgolly.ionicCore.mod.Mode
import typingsJapgolly.ionicCore.oldAnimationAnimationInterfaceMod.Animation
import typingsJapgolly.ionicCore.oldAnimationAnimationInterfaceMod.AnimationBuilder
import typingsJapgolly.react.mod.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined @ionic/core.@ionic/core.AlertOptions & @ionic/react.@ionic/react/dist/types/components/createControllerComponent.ReactControllerProps & {  forwardedRef ? :react.react.RefObject<@ionic/core.@ionic/core/dist/types/components._Global_.HTMLIonAlertElement> | undefined} & react.react.RefAttributes<@ionic/core.@ionic/core/dist/types/components._Global_.HTMLIonAlertElement> */
trait AlertOptionsReactControll extends js.Object {
  var animated: js.UndefOr[Boolean] = js.undefined
  var backdropDismiss: js.UndefOr[Boolean] = js.undefined
  var buttons: js.UndefOr[js.Array[AlertButton | String]] = js.undefined
  var cssClass: js.UndefOr[String | js.Array[String]] = js.undefined
  var enterAnimation: js.UndefOr[AnimationBuilder] = js.undefined
  var forwardedRef: js.UndefOr[RefHandle[HTMLIonAlertElement]] = js.undefined
  var header: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var inputs: js.UndefOr[js.Array[AlertInput]] = js.undefined
  var isOpen: Boolean
  var key: js.UndefOr[Key] = js.undefined
  var keyboardClose: js.UndefOr[Boolean] = js.undefined
  var leaveAnimation: js.UndefOr[AnimationBuilder] = js.undefined
  var message: js.UndefOr[String] = js.undefined
  var mode: js.UndefOr[Mode] = js.undefined
  var onDidDismiss: js.UndefOr[js.Function1[/* event */ CustomEvent, Unit]] = js.undefined
  var onDidPresent: js.UndefOr[js.Function1[/* event */ CustomEvent, Unit]] = js.undefined
  var onWillDismiss: js.UndefOr[js.Function1[/* event */ CustomEvent, Unit]] = js.undefined
  var onWillPresent: js.UndefOr[js.Function1[/* event */ CustomEvent, Unit]] = js.undefined
  var ref: js.UndefOr[Ref] = js.undefined
  var subHeader: js.UndefOr[String] = js.undefined
  var translucent: js.UndefOr[Boolean] = js.undefined
}

object AlertOptionsReactControll {
  @scala.inline
  def apply(
    isOpen: Boolean,
    animated: js.UndefOr[Boolean] = js.undefined,
    backdropDismiss: js.UndefOr[Boolean] = js.undefined,
    buttons: js.Array[AlertButton | String] = null,
    cssClass: String | js.Array[String] = null,
    enterAnimation: (/* Animation */ Animation, /* baseEl */ js.Any, /* opts */ js.UndefOr[js.Any]) => CallbackTo[js.Promise[Animation]] = null,
    forwardedRef: RefHandle[HTMLIonAlertElement] = null,
    header: String = null,
    id: String = null,
    inputs: js.Array[AlertInput] = null,
    key: Key = null,
    keyboardClose: js.UndefOr[Boolean] = js.undefined,
    leaveAnimation: (/* Animation */ Animation, /* baseEl */ js.Any, /* opts */ js.UndefOr[js.Any]) => CallbackTo[js.Promise[Animation]] = null,
    message: String = null,
    mode: Mode = null,
    onDidDismiss: /* event */ CustomEvent => Callback = null,
    onDidPresent: /* event */ CustomEvent => Callback = null,
    onWillDismiss: /* event */ CustomEvent => Callback = null,
    onWillPresent: /* event */ CustomEvent => Callback = null,
    ref: Ref = null,
    subHeader: String = null,
    translucent: js.UndefOr[Boolean] = js.undefined
  ): AlertOptionsReactControll = {
    val __obj = js.Dynamic.literal(isOpen = isOpen.asInstanceOf[js.Any])
    if (!js.isUndefined(animated)) __obj.updateDynamic("animated")(animated.asInstanceOf[js.Any])
    if (!js.isUndefined(backdropDismiss)) __obj.updateDynamic("backdropDismiss")(backdropDismiss.asInstanceOf[js.Any])
    if (buttons != null) __obj.updateDynamic("buttons")(buttons.asInstanceOf[js.Any])
    if (cssClass != null) __obj.updateDynamic("cssClass")(cssClass.asInstanceOf[js.Any])
    if (enterAnimation != null) __obj.updateDynamic("enterAnimation")(js.Any.fromFunction3((t0: /* Animation */ typingsJapgolly.ionicCore.oldAnimationAnimationInterfaceMod.Animation, t1: /* baseEl */ js.Any, t2: /* opts */ js.UndefOr[js.Any]) => enterAnimation(t0, t1, t2).runNow()))
    if (forwardedRef != null) __obj.updateDynamic("forwardedRef")(forwardedRef.asInstanceOf[js.Any])
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (inputs != null) __obj.updateDynamic("inputs")(inputs.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (!js.isUndefined(keyboardClose)) __obj.updateDynamic("keyboardClose")(keyboardClose.asInstanceOf[js.Any])
    if (leaveAnimation != null) __obj.updateDynamic("leaveAnimation")(js.Any.fromFunction3((t0: /* Animation */ typingsJapgolly.ionicCore.oldAnimationAnimationInterfaceMod.Animation, t1: /* baseEl */ js.Any, t2: /* opts */ js.UndefOr[js.Any]) => leaveAnimation(t0, t1, t2).runNow()))
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (onDidDismiss != null) __obj.updateDynamic("onDidDismiss")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.CustomEvent) => onDidDismiss(t0).runNow()))
    if (onDidPresent != null) __obj.updateDynamic("onDidPresent")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.CustomEvent) => onDidPresent(t0).runNow()))
    if (onWillDismiss != null) __obj.updateDynamic("onWillDismiss")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.CustomEvent) => onWillDismiss(t0).runNow()))
    if (onWillPresent != null) __obj.updateDynamic("onWillPresent")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.CustomEvent) => onWillPresent(t0).runNow()))
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (subHeader != null) __obj.updateDynamic("subHeader")(subHeader.asInstanceOf[js.Any])
    if (!js.isUndefined(translucent)) __obj.updateDynamic("translucent")(translucent.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlertOptionsReactControll]
  }
}

