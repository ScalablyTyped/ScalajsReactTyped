package typingsJapgolly.ionicCore

import org.scalajs.dom.HTMLElement
import typingsJapgolly.ionicCore.distTypesComponentsActionSheetActionSheetInterfaceMod.ActionSheetAttributes
import typingsJapgolly.ionicCore.distTypesComponentsActionSheetActionSheetInterfaceMod.ActionSheetButton
import typingsJapgolly.ionicCore.distTypesComponentsMod.global.HTMLIonActionSheetElement
import typingsJapgolly.ionicCore.distTypesStencilPublicRuntimeMod.ComponentInterface
import typingsJapgolly.ionicCore.distTypesUtilsOverlaysInterfaceMod.OverlayEventDetail
import typingsJapgolly.ionicCore.distTypesUtilsOverlaysInterfaceMod.OverlayInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesComponentsActionSheetActionSheetMod {
  
  @JSImport("@ionic/core/dist/types/components/action-sheet/action-sheet", "ActionSheet")
  @js.native
  open class ActionSheet ()
    extends StObject
       with ComponentInterface
       with OverlayInterface {
    
    var animation: js.UndefOr[Any] = js.native
    
    /**
      * If `true`, the action sheet will be dismissed when the backdrop is clicked.
      */
    var backdropDismiss: Boolean = js.native
    
    /* private */ var buttonClick: Any = js.native
    
    /**
      * An array of buttons for the action sheet.
      */
    var buttons: js.Array[ActionSheetButton[Any] | String] = js.native
    
    /* private */ var callButtonHandler: Any = js.native
    
    @JSName("componentDidLoad")
    def componentDidLoad_MActionSheet(): Unit = js.native
    
    @JSName("connectedCallback")
    def connectedCallback_MActionSheet(): Unit = js.native
    
    /**
      * Additional classes to apply for custom CSS. If multiple classes are
      * provided they should be separated by spaces.
      */
    var cssClass: js.UndefOr[String | js.Array[String]] = js.native
    
    @JSName("disconnectedCallback")
    def disconnectedCallback_MActionSheet(): Unit = js.native
    
    /* private */ var dispatchCancelHandler: Any = js.native
    
    @JSName("el")
    var el_ActionSheet: HTMLIonActionSheetElement = js.native
    
    /* private */ var gesture: Any = js.native
    
    /* private */ var getButtons: Any = js.native
    
    /* private */ var groupEl: Any = js.native
    
    /**
      * Title for the action sheet.
      */
    var header: js.UndefOr[String] = js.native
    
    /**
      * Additional attributes to pass to the action sheet.
      */
    var htmlAttributes: js.UndefOr[ActionSheetAttributes] = js.native
    
    var lastFocus: js.UndefOr[HTMLElement] = js.native
    
    /* private */ var onBackdropTap: Any = js.native
    
    /**
      * Returns a promise that resolves when the action sheet did dismiss.
      */
    def onDidDismiss[T](): js.Promise[OverlayEventDetail[T]] = js.native
    
    /**
      * Returns a promise that resolves when the action sheet will dismiss.
      *
      */
    def onWillDismiss[T](): js.Promise[OverlayEventDetail[T]] = js.native
    
    @JSName("render")
    def render_MActionSheet(): Any = js.native
    
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
    
    /* private */ var wrapperEl: Any = js.native
  }
}
