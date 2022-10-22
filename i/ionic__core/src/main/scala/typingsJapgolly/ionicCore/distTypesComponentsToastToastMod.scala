package typingsJapgolly.ionicCore

import typingsJapgolly.ionicCore.distTypesComponentsMod.global.HTMLIonToastElement
import typingsJapgolly.ionicCore.distTypesComponentsToastToastInterfaceMod.ToastAttributes
import typingsJapgolly.ionicCore.distTypesComponentsToastToastInterfaceMod.ToastButton
import typingsJapgolly.ionicCore.distTypesStencilPublicRuntimeMod.ComponentInterface
import typingsJapgolly.ionicCore.distTypesUtilsOverlaysInterfaceMod.OverlayEventDetail
import typingsJapgolly.ionicCore.distTypesUtilsOverlaysInterfaceMod.OverlayInterface
import typingsJapgolly.ionicCore.distTypesUtilsSanitizationMod.IonicSafeString
import typingsJapgolly.ionicCore.ionicCoreStrings.bottom
import typingsJapgolly.ionicCore.ionicCoreStrings.end
import typingsJapgolly.ionicCore.ionicCoreStrings.middle
import typingsJapgolly.ionicCore.ionicCoreStrings.start
import typingsJapgolly.ionicCore.ionicCoreStrings.top
import typingsJapgolly.ionicCore.mod.Color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesComponentsToastToastMod {
  
  @JSImport("@ionic/core/dist/types/components/toast/toast", "Toast")
  @js.native
  open class Toast ()
    extends StObject
       with ComponentInterface
       with OverlayInterface {
    
    /* private */ var buttonClick: Any = js.native
    
    /**
      * An array of buttons for the toast.
      */
    var buttons: js.UndefOr[js.Array[ToastButton | String]] = js.native
    
    /* private */ var callButtonHandler: Any = js.native
    
    /**
      * The color to use from your application's color palette.
      * Default options are: `"primary"`, `"secondary"`, `"tertiary"`, `"success"`, `"warning"`, `"danger"`, `"light"`, `"medium"`, and `"dark"`.
      * For more information on colors, see [theming](/docs/theming/basics).
      */
    var color: js.UndefOr[Color] = js.native
    
    @JSName("connectedCallback")
    def connectedCallback_MToast(): Unit = js.native
    
    /**
      * Additional classes to apply for custom CSS. If multiple classes are
      * provided they should be separated by spaces.
      */
    var cssClass: js.UndefOr[String | js.Array[String]] = js.native
    
    /* private */ var dispatchCancelHandler: Any = js.native
    
    /**
      * How many milliseconds to wait before hiding the toast. By default, it will show
      * until `dismiss()` is called.
      */
    var duration: Double = js.native
    
    /* private */ var durationTimeout: Any = js.native
    
    @JSName("el")
    var el_Toast: HTMLIonToastElement = js.native
    
    /* private */ var getButtons: Any = js.native
    
    /**
      * Header to be shown in the toast.
      */
    var header: js.UndefOr[String] = js.native
    
    /**
      * Additional attributes to pass to the toast.
      */
    var htmlAttributes: js.UndefOr[ToastAttributes] = js.native
    
    /**
      * The name of the icon to display, or the path to a valid SVG file. See `ion-icon`.
      * https://ionic.io/ionicons
      */
    var icon: js.UndefOr[String] = js.native
    
    /**
      * Message to be shown in the toast.
      */
    var message: js.UndefOr[String | IonicSafeString] = js.native
    
    /**
      * Returns a promise that resolves when the toast did dismiss.
      */
    def onDidDismiss[T](): js.Promise[OverlayEventDetail[T]] = js.native
    
    /**
      * Returns a promise that resolves when the toast will dismiss.
      */
    def onWillDismiss[T](): js.Promise[OverlayEventDetail[T]] = js.native
    
    /**
      * The position of the toast on the screen.
      */
    var position: top | bottom | middle = js.native
    
    def renderButtons(buttons: js.Array[ToastButton], side: start | end): Any = js.native
    
    @JSName("render")
    def render_MToast(): Any = js.native
    
    /**
      * If `true`, the toast will be translucent.
      * Only applies when the mode is `"ios"` and the device supports
      * [`backdrop-filter`](https://developer.mozilla.org/en-US/docs/Web/CSS/backdrop-filter#Browser_compatibility).
      */
    var translucent: Boolean = js.native
  }
}
