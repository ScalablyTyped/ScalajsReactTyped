package typingsJapgolly.ionicCore

import typingsJapgolly.ionicCore.componentsMod._Global_.HTMLIonPickerElement
import typingsJapgolly.ionicCore.ionicCoreStrings.ios
import typingsJapgolly.ionicCore.ionicCoreStrings.md
import typingsJapgolly.ionicCore.oldAnimationAnimationInterfaceMod.Animation
import typingsJapgolly.ionicCore.overlaysInterfaceMod.OverlayEventDetail
import typingsJapgolly.ionicCore.overlaysInterfaceMod.OverlayInterface
import typingsJapgolly.ionicCore.pickerInterfaceMod.PickerButton
import typingsJapgolly.ionicCore.pickerInterfaceMod.PickerColumn
import typingsJapgolly.ionicCore.stencilCoreMod.ComponentInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/core/dist/types/components/picker/picker", JSImport.Namespace)
@js.native
object pickerMod extends js.Object {
  @js.native
  class Picker ()
    extends ComponentInterface
       with OverlayInterface {
    @JSName("animation")
    var animation_Picker: js.UndefOr[Animation] = js.native
    /**
      * If `true`, the picker will be dismissed when the backdrop is clicked.
      */
    var backdropDismiss: Boolean = js.native
    var buttonClick: js.Any = js.native
    /**
      * Array of buttons to be displayed at the top of the picker.
      */
    var buttons: js.Array[PickerButton] = js.native
    /**
      * Array of columns to be displayed in the picker.
      */
    var columns: js.Array[PickerColumn] = js.native
    /**
      * Additional classes to apply for custom CSS. If multiple classes are
      * provided they should be separated by spaces.
      */
    var cssClass: js.UndefOr[String | js.Array[String]] = js.native
    /**
      * Number of milliseconds to wait before dismissing the picker.
      */
    var duration: Double = js.native
    var durationTimeout: js.Any = js.native
    @JSName("el")
    var el_Picker: HTMLIonPickerElement = js.native
    var getSelected: js.Any = js.native
    @JSName("mode")
    var mode_Picker: ios | md = js.native
    var onBackdropTap: js.Any = js.native
    /**
      * If `true`, a backdrop will be displayed behind the picker.
      */
    var showBackdrop: Boolean = js.native
    /**
      * Get the column that matches the specified name.
      *
      * @param name The name of the column.
      */
    def getColumn(name: String): js.Promise[js.UndefOr[PickerColumn]] = js.native
    /**
      * Returns a promise that resolves when the picker did dismiss.
      */
    def onDidDismiss(): js.Promise[OverlayEventDetail[_]] = js.native
    /**
      * Returns a promise that resolves when the picker will dismiss.
      */
    def onWillDismiss(): js.Promise[OverlayEventDetail[_]] = js.native
    @JSName("render")
    def render_MPicker(): js.Any = js.native
  }
  
}

