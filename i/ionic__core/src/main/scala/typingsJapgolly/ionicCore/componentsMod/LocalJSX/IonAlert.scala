package typingsJapgolly.ionicCore.componentsMod.LocalJSX

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.CustomEvent
import typingsJapgolly.ionicCore.alertInterfaceMod.AlertButton
import typingsJapgolly.ionicCore.alertInterfaceMod.AlertInput
import typingsJapgolly.ionicCore.ionicCoreStrings.ios
import typingsJapgolly.ionicCore.ionicCoreStrings.md
import typingsJapgolly.ionicCore.oldAnimationAnimationInterfaceMod.Animation
import typingsJapgolly.ionicCore.oldAnimationAnimationInterfaceMod.AnimationBuilder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IonAlert extends js.Object {
  /**
    * If `true`, the alert will animate.
    */
  var animated: js.UndefOr[Boolean] = js.undefined
  /**
    * If `true`, the alert will be dismissed when the backdrop is clicked.
    */
  var backdropDismiss: js.UndefOr[Boolean] = js.undefined
  /**
    * Array of buttons to be added to the alert.
    */
  var buttons: js.UndefOr[js.Array[AlertButton | String]] = js.undefined
  /**
    * Additional classes to apply for custom CSS. If multiple classes are provided they should be separated by spaces.
    */
  var cssClass: js.UndefOr[String | js.Array[String]] = js.undefined
  /**
    * Animation to use when the alert is presented.
    */
  var enterAnimation: js.UndefOr[AnimationBuilder] = js.undefined
  /**
    * The main title in the heading of the alert.
    */
  var header: js.UndefOr[String] = js.undefined
  /**
    * Array of input to show in the alert.
    */
  var inputs: js.UndefOr[js.Array[AlertInput]] = js.undefined
  /**
    * If `true`, the keyboard will be automatically dismissed when the overlay is presented.
    */
  var keyboardClose: js.UndefOr[Boolean] = js.undefined
  /**
    * Animation to use when the alert is dismissed.
    */
  var leaveAnimation: js.UndefOr[AnimationBuilder] = js.undefined
  /**
    * The main message to be displayed in the alert. `message` can accept either plaintext or HTML as a string. To display characters normally reserved for HTML, they must be escaped. For example `<Ionic>` would become `&lt;Ionic&gt;`  For more information: [Security Documentation](https://ionicframework.com/docs/faq/security)
    */
  var message: js.UndefOr[String] = js.undefined
  /**
    * The mode determines which platform styles to use.
    */
  var mode: js.UndefOr[ios | md] = js.undefined
  /**
    * Emitted after the alert has dismissed.
    */
  var onIonAlertDidDismiss: js.UndefOr[js.Function1[/* event */ CustomEvent, Unit]] = js.undefined
  /**
    * Emitted after the alert has presented.
    */
  var onIonAlertDidPresent: js.UndefOr[js.Function1[/* event */ CustomEvent, Unit]] = js.undefined
  /**
    * Emitted before the alert has dismissed.
    */
  var onIonAlertWillDismiss: js.UndefOr[js.Function1[/* event */ CustomEvent, Unit]] = js.undefined
  /**
    * Emitted before the alert has presented.
    */
  var onIonAlertWillPresent: js.UndefOr[js.Function1[/* event */ CustomEvent, Unit]] = js.undefined
  /**
    * The subtitle in the heading of the alert. Displayed under the title.
    */
  var subHeader: js.UndefOr[String] = js.undefined
  /**
    * If `true`, the alert will be translucent. Only applies when the mode is `"ios"` and the device supports [`backdrop-filter`](https://developer.mozilla.org/en-US/docs/Web/CSS/backdrop-filter#Browser_compatibility).
    */
  var translucent: js.UndefOr[Boolean] = js.undefined
}

object IonAlert {
  @scala.inline
  def apply(
    animated: js.UndefOr[Boolean] = js.undefined,
    backdropDismiss: js.UndefOr[Boolean] = js.undefined,
    buttons: js.Array[AlertButton | String] = null,
    cssClass: String | js.Array[String] = null,
    enterAnimation: (/* Animation */ Animation, /* baseEl */ js.Any, /* opts */ js.UndefOr[js.Any]) => CallbackTo[js.Promise[Animation]] = null,
    header: String = null,
    inputs: js.Array[AlertInput] = null,
    keyboardClose: js.UndefOr[Boolean] = js.undefined,
    leaveAnimation: (/* Animation */ Animation, /* baseEl */ js.Any, /* opts */ js.UndefOr[js.Any]) => CallbackTo[js.Promise[Animation]] = null,
    message: String = null,
    mode: ios | md = null,
    onIonAlertDidDismiss: /* event */ CustomEvent => Callback = null,
    onIonAlertDidPresent: /* event */ CustomEvent => Callback = null,
    onIonAlertWillDismiss: /* event */ CustomEvent => Callback = null,
    onIonAlertWillPresent: /* event */ CustomEvent => Callback = null,
    subHeader: String = null,
    translucent: js.UndefOr[Boolean] = js.undefined
  ): IonAlert = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animated)) __obj.updateDynamic("animated")(animated.asInstanceOf[js.Any])
    if (!js.isUndefined(backdropDismiss)) __obj.updateDynamic("backdropDismiss")(backdropDismiss.asInstanceOf[js.Any])
    if (buttons != null) __obj.updateDynamic("buttons")(buttons.asInstanceOf[js.Any])
    if (cssClass != null) __obj.updateDynamic("cssClass")(cssClass.asInstanceOf[js.Any])
    if (enterAnimation != null) __obj.updateDynamic("enterAnimation")(js.Any.fromFunction3((t0: /* Animation */ typingsJapgolly.ionicCore.oldAnimationAnimationInterfaceMod.Animation, t1: /* baseEl */ js.Any, t2: /* opts */ js.UndefOr[js.Any]) => enterAnimation(t0, t1, t2).runNow()))
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (inputs != null) __obj.updateDynamic("inputs")(inputs.asInstanceOf[js.Any])
    if (!js.isUndefined(keyboardClose)) __obj.updateDynamic("keyboardClose")(keyboardClose.asInstanceOf[js.Any])
    if (leaveAnimation != null) __obj.updateDynamic("leaveAnimation")(js.Any.fromFunction3((t0: /* Animation */ typingsJapgolly.ionicCore.oldAnimationAnimationInterfaceMod.Animation, t1: /* baseEl */ js.Any, t2: /* opts */ js.UndefOr[js.Any]) => leaveAnimation(t0, t1, t2).runNow()))
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (onIonAlertDidDismiss != null) __obj.updateDynamic("onIonAlertDidDismiss")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.CustomEvent) => onIonAlertDidDismiss(t0).runNow()))
    if (onIonAlertDidPresent != null) __obj.updateDynamic("onIonAlertDidPresent")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.CustomEvent) => onIonAlertDidPresent(t0).runNow()))
    if (onIonAlertWillDismiss != null) __obj.updateDynamic("onIonAlertWillDismiss")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.CustomEvent) => onIonAlertWillDismiss(t0).runNow()))
    if (onIonAlertWillPresent != null) __obj.updateDynamic("onIonAlertWillPresent")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.CustomEvent) => onIonAlertWillPresent(t0).runNow()))
    if (subHeader != null) __obj.updateDynamic("subHeader")(subHeader.asInstanceOf[js.Any])
    if (!js.isUndefined(translucent)) __obj.updateDynamic("translucent")(translucent.asInstanceOf[js.Any])
    __obj.asInstanceOf[IonAlert]
  }
}

