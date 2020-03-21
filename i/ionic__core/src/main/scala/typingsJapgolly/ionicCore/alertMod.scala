package typingsJapgolly.ionicCore

import typingsJapgolly.ionicCore.alertInterfaceMod.AlertButton
import typingsJapgolly.ionicCore.alertInterfaceMod.AlertInput
import typingsJapgolly.ionicCore.componentsMod._Global_.HTMLIonAlertElement
import typingsJapgolly.ionicCore.ionicCoreStrings.ios
import typingsJapgolly.ionicCore.ionicCoreStrings.md
import typingsJapgolly.ionicCore.oldAnimationAnimationInterfaceMod.Animation
import typingsJapgolly.ionicCore.overlaysInterfaceMod.OverlayEventDetail
import typingsJapgolly.ionicCore.overlaysInterfaceMod.OverlayInterface
import typingsJapgolly.ionicCore.stencilCoreMod.ComponentInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/core/dist/types/components/alert/alert", JSImport.Namespace)
@js.native
object alertMod extends js.Object {
  @js.native
  class Alert ()
    extends ComponentInterface
       with OverlayInterface {
    var activeId: js.UndefOr[js.Any] = js.native
    @JSName("animation")
    var animation_Alert: js.UndefOr[Animation] = js.native
    /**
      * If `true`, the alert will be dismissed when the backdrop is clicked.
      */
    var backdropDismiss: Boolean = js.native
    var buttonClick: js.Any = js.native
    /**
      * Array of buttons to be added to the alert.
      */
    var buttons: js.Array[AlertButton | String] = js.native
    var callButtonHandler: js.Any = js.native
    var cbClick: js.Any = js.native
    /**
      * Additional classes to apply for custom CSS. If multiple classes are
      * provided they should be separated by spaces.
      */
    var cssClass: js.UndefOr[String | js.Array[String]] = js.native
    var dispatchCancelHandler: js.Any = js.native
    @JSName("el")
    var el_Alert: HTMLIonAlertElement = js.native
    var getValues: js.Any = js.native
    /**
      * The main title in the heading of the alert.
      */
    var header: js.UndefOr[String] = js.native
    var inputType: js.UndefOr[js.Any] = js.native
    /**
      * Array of input to show in the alert.
      */
    var inputs: js.Array[AlertInput] = js.native
    /**
      * The main message to be displayed in the alert.
      * `message` can accept either plaintext or HTML as a string.
      * To display characters normally reserved for HTML, they
      * must be escaped. For example `<Ionic>` would become
      * `&lt;Ionic&gt;`
      *
      * For more information: [Security Documentation](https://ionicframework.com/docs/faq/security)
      */
    var message: js.UndefOr[String] = js.native
    @JSName("mode")
    var mode_Alert: ios | md = js.native
    var onBackdropTap: js.Any = js.native
    var processedButtons: js.Any = js.native
    var processedInputs: js.Any = js.native
    var rbClick: js.Any = js.native
    var renderAlertButtons: js.Any = js.native
    var renderAlertInputs: js.Any = js.native
    var renderCheckbox: js.Any = js.native
    var renderInput: js.Any = js.native
    var renderRadio: js.Any = js.native
    /**
      * The subtitle in the heading of the alert. Displayed under the title.
      */
    var subHeader: js.UndefOr[String] = js.native
    /**
      * If `true`, the alert will be translucent.
      * Only applies when the mode is `"ios"` and the device supports
      * [`backdrop-filter`](https://developer.mozilla.org/en-US/docs/Web/CSS/backdrop-filter#Browser_compatibility).
      */
    var translucent: Boolean = js.native
    def buttonsChanged(): Unit = js.native
    @JSName("componentWillLoad")
    def componentWillLoad_MAlert(): Unit = js.native
    def inputsChanged(): Unit = js.native
    /**
      * Returns a promise that resolves when the alert did dismiss.
      */
    def onDidDismiss(): js.Promise[OverlayEventDetail[_]] = js.native
    /**
      * Returns a promise that resolves when the alert will dismiss.
      */
    def onWillDismiss(): js.Promise[OverlayEventDetail[_]] = js.native
    @JSName("render")
    def render_MAlert(): js.Any = js.native
  }
  
}

