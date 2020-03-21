package typingsJapgolly.ionicCore.componentsMod.LocalJSX

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.CustomEvent
import typingsJapgolly.ionicCore.ionicCoreStrings.ios
import typingsJapgolly.ionicCore.ionicCoreStrings.md
import typingsJapgolly.ionicCore.mod.ComponentProps
import typingsJapgolly.ionicCore.mod.ComponentRef
import typingsJapgolly.ionicCore.oldAnimationAnimationInterfaceMod.Animation
import typingsJapgolly.ionicCore.oldAnimationAnimationInterfaceMod.AnimationBuilder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IonModal extends js.Object {
  /**
    * If `true`, the modal will animate.
    */
  var animated: js.UndefOr[Boolean] = js.undefined
  /**
    * If `true`, the modal will be dismissed when the backdrop is clicked.
    */
  var backdropDismiss: js.UndefOr[Boolean] = js.undefined
  /**
    * The component to display inside of the modal.
    */
  var component: ComponentRef
  /**
    * The data to pass to the modal component.
    */
  var componentProps: js.UndefOr[ComponentProps[Null]] = js.undefined
  /**
    * Additional classes to apply for custom CSS. If multiple classes are provided they should be separated by spaces.
    */
  var cssClass: js.UndefOr[String | js.Array[String]] = js.undefined
  /**
    * Animation to use when the modal is presented.
    */
  var enterAnimation: js.UndefOr[AnimationBuilder] = js.undefined
  /**
    * If `true`, the keyboard will be automatically dismissed when the overlay is presented.
    */
  var keyboardClose: js.UndefOr[Boolean] = js.undefined
  /**
    * Animation to use when the modal is dismissed.
    */
  var leaveAnimation: js.UndefOr[AnimationBuilder] = js.undefined
  /**
    * The mode determines which platform styles to use.
    */
  var mode: js.UndefOr[ios | md] = js.undefined
  /**
    * Emitted after the modal has dismissed.
    */
  var onIonModalDidDismiss: js.UndefOr[js.Function1[/* event */ CustomEvent, Unit]] = js.undefined
  /**
    * Emitted after the modal has presented.
    */
  var onIonModalDidPresent: js.UndefOr[js.Function1[/* event */ CustomEvent, Unit]] = js.undefined
  /**
    * Emitted before the modal has dismissed.
    */
  var onIonModalWillDismiss: js.UndefOr[js.Function1[/* event */ CustomEvent, Unit]] = js.undefined
  /**
    * Emitted before the modal has presented.
    */
  var onIonModalWillPresent: js.UndefOr[js.Function1[/* event */ CustomEvent, Unit]] = js.undefined
  /**
    * If `true`, a backdrop will be displayed behind the modal.
    */
  var showBackdrop: js.UndefOr[Boolean] = js.undefined
}

object IonModal {
  @scala.inline
  def apply(
    animated: js.UndefOr[Boolean] = js.undefined,
    backdropDismiss: js.UndefOr[Boolean] = js.undefined,
    component: ComponentRef = null,
    componentProps: ComponentProps[Null] = null,
    cssClass: String | js.Array[String] = null,
    enterAnimation: (/* Animation */ Animation, /* baseEl */ js.Any, /* opts */ js.UndefOr[js.Any]) => CallbackTo[js.Promise[Animation]] = null,
    keyboardClose: js.UndefOr[Boolean] = js.undefined,
    leaveAnimation: (/* Animation */ Animation, /* baseEl */ js.Any, /* opts */ js.UndefOr[js.Any]) => CallbackTo[js.Promise[Animation]] = null,
    mode: ios | md = null,
    onIonModalDidDismiss: /* event */ CustomEvent => Callback = null,
    onIonModalDidPresent: /* event */ CustomEvent => Callback = null,
    onIonModalWillDismiss: /* event */ CustomEvent => Callback = null,
    onIonModalWillPresent: /* event */ CustomEvent => Callback = null,
    showBackdrop: js.UndefOr[Boolean] = js.undefined
  ): IonModal = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animated)) __obj.updateDynamic("animated")(animated.asInstanceOf[js.Any])
    if (!js.isUndefined(backdropDismiss)) __obj.updateDynamic("backdropDismiss")(backdropDismiss.asInstanceOf[js.Any])
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (componentProps != null) __obj.updateDynamic("componentProps")(componentProps.asInstanceOf[js.Any])
    if (cssClass != null) __obj.updateDynamic("cssClass")(cssClass.asInstanceOf[js.Any])
    if (enterAnimation != null) __obj.updateDynamic("enterAnimation")(js.Any.fromFunction3((t0: /* Animation */ typingsJapgolly.ionicCore.oldAnimationAnimationInterfaceMod.Animation, t1: /* baseEl */ js.Any, t2: /* opts */ js.UndefOr[js.Any]) => enterAnimation(t0, t1, t2).runNow()))
    if (!js.isUndefined(keyboardClose)) __obj.updateDynamic("keyboardClose")(keyboardClose.asInstanceOf[js.Any])
    if (leaveAnimation != null) __obj.updateDynamic("leaveAnimation")(js.Any.fromFunction3((t0: /* Animation */ typingsJapgolly.ionicCore.oldAnimationAnimationInterfaceMod.Animation, t1: /* baseEl */ js.Any, t2: /* opts */ js.UndefOr[js.Any]) => leaveAnimation(t0, t1, t2).runNow()))
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (onIonModalDidDismiss != null) __obj.updateDynamic("onIonModalDidDismiss")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.CustomEvent) => onIonModalDidDismiss(t0).runNow()))
    if (onIonModalDidPresent != null) __obj.updateDynamic("onIonModalDidPresent")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.CustomEvent) => onIonModalDidPresent(t0).runNow()))
    if (onIonModalWillDismiss != null) __obj.updateDynamic("onIonModalWillDismiss")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.CustomEvent) => onIonModalWillDismiss(t0).runNow()))
    if (onIonModalWillPresent != null) __obj.updateDynamic("onIonModalWillPresent")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.CustomEvent) => onIonModalWillPresent(t0).runNow()))
    if (!js.isUndefined(showBackdrop)) __obj.updateDynamic("showBackdrop")(showBackdrop.asInstanceOf[js.Any])
    __obj.asInstanceOf[IonModal]
  }
}

