package typingsJapgolly.ionicCore

import typingsJapgolly.ionicCore.actionSheetInterfaceMod.ActionSheetButton
import typingsJapgolly.ionicCore.componentsMod._Global_.HTMLIonActionSheetElement
import typingsJapgolly.ionicCore.ionicCoreStrings.ios
import typingsJapgolly.ionicCore.ionicCoreStrings.md
import typingsJapgolly.ionicCore.overlaysInterfaceMod.OverlayEventDetail
import typingsJapgolly.ionicCore.overlaysInterfaceMod.OverlayInterface
import typingsJapgolly.ionicCore.stencilCoreMod.ComponentInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/core/dist/types/components/action-sheet/action-sheet", JSImport.Namespace)
@js.native
object actionSheetMod extends js.Object {
  @js.native
  class ActionSheet ()
    extends ComponentInterface
       with OverlayInterface {
    @JSName("animation")
    var animation_ActionSheet: js.UndefOr[js.Any] = js.native
    /**
      * If `true`, the action sheet will be dismissed when the backdrop is clicked.
      */
    var backdropDismiss: Boolean = js.native
    var buttonClick: js.Any = js.native
    /**
      * An array of buttons for the action sheet.
      */
    var buttons: js.Array[ActionSheetButton | String] = js.native
    var callButtonHandler: js.Any = js.native
    /**
      * Additional classes to apply for custom CSS. If multiple classes are
      * provided they should be separated by spaces.
      */
    var cssClass: js.UndefOr[String | js.Array[String]] = js.native
    var dispatchCancelHandler: js.Any = js.native
    @JSName("el")
    var el_ActionSheet: HTMLIonActionSheetElement = js.native
    var getButtons: js.Any = js.native
    /**
      * Title for the action sheet.
      */
    var header: js.UndefOr[String] = js.native
    @JSName("mode")
    var mode_ActionSheet: ios | md = js.native
    var onBackdropTap: js.Any = js.native
    /**
      * Subtitle for the action sheet.
      */
    var subHeader: js.UndefOr[String] = js.native
    /**
      * If `true`, the action sheet will be translucent.
      * Only applies when the mode is `"ios"` and the device supports
      * [`backdrop-filter`](https://developer.mozilla.org/en-US/docs/Web/CSS/backdrop-filter#Browser_compatibility).
      */
    var translucent: Boolean = js.native
    /**
      * Returns a promise that resolves when the action sheet did dismiss.
      */
    def onDidDismiss(): js.Promise[OverlayEventDetail[_]] = js.native
    /**
      * Returns a promise that resolves when the action sheet will dismiss.
      *
      */
    def onWillDismiss(): js.Promise[OverlayEventDetail[_]] = js.native
    @JSName("render")
    def render_MActionSheet(): js.Any = js.native
  }
  
}

