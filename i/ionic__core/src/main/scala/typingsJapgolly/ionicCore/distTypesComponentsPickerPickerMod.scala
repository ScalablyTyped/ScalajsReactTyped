package typingsJapgolly.ionicCore

import org.scalajs.dom.HTMLElement
import typingsJapgolly.ionicCore.distTypesComponentsMod.global.HTMLIonPickerElement
import typingsJapgolly.ionicCore.distTypesComponentsPickerPickerInterfaceMod.PickerAttributes
import typingsJapgolly.ionicCore.distTypesComponentsPickerPickerInterfaceMod.PickerButton
import typingsJapgolly.ionicCore.distTypesComponentsPickerPickerInterfaceMod.PickerColumn
import typingsJapgolly.ionicCore.distTypesStencilPublicRuntimeMod.ComponentInterface
import typingsJapgolly.ionicCore.distTypesUtilsOverlaysInterfaceMod.OverlayEventDetail
import typingsJapgolly.ionicCore.distTypesUtilsOverlaysInterfaceMod.OverlayInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesComponentsPickerPickerMod {
  
  @JSImport("@ionic/core/dist/types/components/picker/picker", "Picker")
  @js.native
  open class Picker ()
    extends StObject
       with ComponentInterface
       with OverlayInterface {
    
    /**
      * If `true`, the picker will be dismissed when the backdrop is clicked.
      */
    var backdropDismiss: Boolean = js.native
    
    /* private */ var buttonClick: Any = js.native
    
    /**
      * Array of buttons to be displayed at the top of the picker.
      */
    var buttons: js.Array[PickerButton] = js.native
    
    /* private */ var callButtonHandler: Any = js.native
    
    /**
      * Array of columns to be displayed in the picker.
      */
    var columns: js.Array[PickerColumn] = js.native
    
    @JSName("connectedCallback")
    def connectedCallback_MPicker(): Unit = js.native
    
    /**
      * Additional classes to apply for custom CSS. If multiple classes are
      * provided they should be separated by spaces.
      */
    var cssClass: js.UndefOr[String | js.Array[String]] = js.native
    
    /* private */ var dispatchCancelHandler: Any = js.native
    
    /**
      * Number of milliseconds to wait before dismissing the picker.
      */
    var duration: Double = js.native
    
    /* private */ var durationTimeout: Any = js.native
    
    @JSName("el")
    var el_Picker: HTMLIonPickerElement = js.native
    
    /**
      * Get the column that matches the specified name.
      *
      * @param name The name of the column.
      */
    def getColumn(name: String): js.Promise[js.UndefOr[PickerColumn]] = js.native
    
    /* private */ var getSelected: Any = js.native
    
    /**
      * Additional attributes to pass to the picker.
      */
    var htmlAttributes: js.UndefOr[PickerAttributes] = js.native
    
    var lastFocus: js.UndefOr[HTMLElement] = js.native
    
    /* private */ var onBackdropTap: Any = js.native
    
    /**
      * Returns a promise that resolves when the picker did dismiss.
      */
    def onDidDismiss[T](): js.Promise[OverlayEventDetail[T]] = js.native
    
    /**
      * Returns a promise that resolves when the picker will dismiss.
      */
    def onWillDismiss[T](): js.Promise[OverlayEventDetail[T]] = js.native
    
    @JSName("render")
    def render_MPicker(): Any = js.native
    
    /**
      * If `true`, a backdrop will be displayed behind the picker.
      */
    var showBackdrop: Boolean = js.native
  }
}
