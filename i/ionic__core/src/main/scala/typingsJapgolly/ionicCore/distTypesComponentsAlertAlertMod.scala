package typingsJapgolly.ionicCore

import org.scalajs.dom.HTMLElement
import typingsJapgolly.ionicCore.distTypesComponentsAlertAlertInterfaceMod.AlertAttributes
import typingsJapgolly.ionicCore.distTypesComponentsAlertAlertInterfaceMod.AlertButton
import typingsJapgolly.ionicCore.distTypesComponentsAlertAlertInterfaceMod.AlertInput
import typingsJapgolly.ionicCore.distTypesComponentsMod.global.HTMLIonAlertElement
import typingsJapgolly.ionicCore.distTypesStencilPublicRuntimeMod.ComponentInterface
import typingsJapgolly.ionicCore.distTypesUtilsOverlaysInterfaceMod.OverlayEventDetail
import typingsJapgolly.ionicCore.distTypesUtilsOverlaysInterfaceMod.OverlayInterface
import typingsJapgolly.ionicCore.distTypesUtilsSanitizationMod.IonicSafeString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesComponentsAlertAlertMod {
  
  @JSImport("@ionic/core/dist/types/components/alert/alert", "Alert")
  @js.native
  open class Alert ()
    extends StObject
       with ComponentInterface
       with OverlayInterface {
    
    /* private */ var activeId: Any = js.native
    
    /**
      * If `true`, the alert will be dismissed when the backdrop is clicked.
      */
    var backdropDismiss: Boolean = js.native
    
    /* private */ var buttonClick: Any = js.native
    
    /**
      * Array of buttons to be added to the alert.
      */
    var buttons: js.Array[AlertButton | String] = js.native
    
    def buttonsChanged(): Unit = js.native
    
    /* private */ var callButtonHandler: Any = js.native
    
    /* private */ var cbClick: Any = js.native
    
    @JSName("componentDidLoad")
    def componentDidLoad_MAlert(): Unit = js.native
    
    @JSName("componentWillLoad")
    def componentWillLoad_MAlert(): Unit = js.native
    
    @JSName("connectedCallback")
    def connectedCallback_MAlert(): Unit = js.native
    
    /**
      * Additional classes to apply for custom CSS. If multiple classes are
      * provided they should be separated by spaces.
      */
    var cssClass: js.UndefOr[String | js.Array[String]] = js.native
    
    @JSName("disconnectedCallback")
    def disconnectedCallback_MAlert(): Unit = js.native
    
    /* private */ var dispatchCancelHandler: Any = js.native
    
    @JSName("el")
    var el_Alert: HTMLIonAlertElement = js.native
    
    /* private */ var gesture: Any = js.native
    
    /* private */ var getValues: Any = js.native
    
    /**
      * The main title in the heading of the alert.
      */
    var header: js.UndefOr[String] = js.native
    
    /**
      * Additional attributes to pass to the alert.
      */
    var htmlAttributes: js.UndefOr[AlertAttributes] = js.native
    
    /* private */ var inputType: Any = js.native
    
    /**
      * Array of input to show in the alert.
      */
    var inputs: js.Array[AlertInput] = js.native
    
    def inputsChanged(): Unit = js.native
    
    var lastFocus: js.UndefOr[HTMLElement] = js.native
    
    /**
      * The main message to be displayed in the alert.
      * `message` can accept either plaintext or HTML as a string.
      * To display characters normally reserved for HTML, they
      * must be escaped. For example `<Ionic>` would become
      * `&lt;Ionic&gt;`
      *
      * For more information: [Security Documentation](https://ionicframework.com/docs/faq/security)
      */
    var message: js.UndefOr[String | IonicSafeString] = js.native
    
    /* private */ var onBackdropTap: Any = js.native
    
    /**
      * Returns a promise that resolves when the alert did dismiss.
      */
    def onDidDismiss[T](): js.Promise[OverlayEventDetail[T]] = js.native
    
    def onKeydown(ev: Any): Unit = js.native
    
    /**
      * Returns a promise that resolves when the alert will dismiss.
      */
    def onWillDismiss[T](): js.Promise[OverlayEventDetail[T]] = js.native
    
    /* private */ var processedButtons: Any = js.native
    
    /* private */ var processedInputs: Any = js.native
    
    /* private */ var rbClick: Any = js.native
    
    /* private */ var renderAlertButtons: Any = js.native
    
    /* private */ var renderAlertInputs: Any = js.native
    
    /* private */ var renderCheckbox: Any = js.native
    
    /* private */ var renderInput: Any = js.native
    
    /* private */ var renderRadio: Any = js.native
    
    @JSName("render")
    def render_MAlert(): Any = js.native
    
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
    
    /* private */ var wrapperEl: Any = js.native
  }
}
