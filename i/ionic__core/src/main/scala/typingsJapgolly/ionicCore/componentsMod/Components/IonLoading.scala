package typingsJapgolly.ionicCore.componentsMod.Components

import typingsJapgolly.ionicCore.ionicCoreStrings.ios
import typingsJapgolly.ionicCore.ionicCoreStrings.md
import typingsJapgolly.ionicCore.oldAnimationAnimationInterfaceMod.AnimationBuilder
import typingsJapgolly.ionicCore.overlaysInterfaceMod.OverlayEventDetail
import typingsJapgolly.ionicCore.spinnerConfigsMod.SpinnerTypes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IonLoading extends js.Object {
  /**
    * If `true`, the loading indicator will animate.
    */
  var animated: Boolean = js.native
  /**
    * If `true`, the loading indicator will be dismissed when the backdrop is clicked.
    */
  var backdropDismiss: Boolean = js.native
  /**
    * Additional classes to apply for custom CSS. If multiple classes are provided they should be separated by spaces.
    */
  var cssClass: js.UndefOr[String | js.Array[String]] = js.native
  /**
    * Number of milliseconds to wait before dismissing the loading indicator.
    */
  var duration: Double = js.native
  /**
    * Animation to use when the loading indicator is presented.
    */
  var enterAnimation: js.UndefOr[AnimationBuilder] = js.native
  /**
    * If `true`, the keyboard will be automatically dismissed when the overlay is presented.
    */
  var keyboardClose: Boolean = js.native
  /**
    * Animation to use when the loading indicator is dismissed.
    */
  var leaveAnimation: js.UndefOr[AnimationBuilder] = js.native
  /**
    * Optional text content to display in the loading indicator.
    */
  var message: js.UndefOr[String] = js.native
  /**
    * The mode determines which platform styles to use.
    */
  var mode: js.UndefOr[ios | md] = js.native
  var overlayIndex: Double = js.native
  /**
    * If `true`, a backdrop will be displayed behind the loading indicator.
    */
  var showBackdrop: Boolean = js.native
  /**
    * The name of the spinner to display.
    */
  var spinner: js.UndefOr[SpinnerTypes | Null] = js.native
  /**
    * If `true`, the loading indicator will be translucent. Only applies when the mode is `"ios"` and the device supports [`backdrop-filter`](https://developer.mozilla.org/en-US/docs/Web/CSS/backdrop-filter#Browser_compatibility).
    */
  var translucent: Boolean = js.native
  /**
    * Dismiss the loading overlay after it has been presented.
    * @param data Any data to emit in the dismiss events.
    * @param role The role of the element that is dismissing the loading. This can be useful in a button handler for determining which button was clicked to dismiss the loading. Some examples include: ``"cancel"`, `"destructive"`, "selected"`, and `"backdrop"`.
    */
  def dismiss(): js.Promise[Boolean] = js.native
  def dismiss(data: js.Any): js.Promise[Boolean] = js.native
  def dismiss(data: js.Any, role: String): js.Promise[Boolean] = js.native
  /**
    * Returns a promise that resolves when the loading did dismiss.
    */
  def onDidDismiss(): js.Promise[OverlayEventDetail[_]] = js.native
  /**
    * Returns a promise that resolves when the loading will dismiss.
    */
  def onWillDismiss(): js.Promise[OverlayEventDetail[_]] = js.native
  /**
    * Present the loading overlay after it has been created.
    */
  def present(): js.Promise[Unit] = js.native
}

