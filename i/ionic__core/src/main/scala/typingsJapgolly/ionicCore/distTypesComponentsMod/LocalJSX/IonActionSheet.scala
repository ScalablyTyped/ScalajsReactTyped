package typingsJapgolly.ionicCore.distTypesComponentsMod.LocalJSX

import japgolly.scalajs.react.Callback
import typingsJapgolly.ionicCore.distTypesComponentsActionSheetActionSheetInterfaceMod.ActionSheetAttributes
import typingsJapgolly.ionicCore.distTypesComponentsActionSheetActionSheetInterfaceMod.ActionSheetButton
import typingsJapgolly.ionicCore.distTypesComponentsMod.IonActionSheetCustomEvent
import typingsJapgolly.ionicCore.distTypesUtilsAnimationAnimationInterfaceMod.Animation
import typingsJapgolly.ionicCore.distTypesUtilsAnimationAnimationInterfaceMod.AnimationBuilder
import typingsJapgolly.ionicCore.distTypesUtilsOverlaysInterfaceMod.OverlayEventDetail
import typingsJapgolly.ionicCore.ionicCoreStrings.ios
import typingsJapgolly.ionicCore.ionicCoreStrings.md
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IonActionSheet extends StObject {
  
  /**
    * If `true`, the action sheet will animate.
    */
  var animated: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If `true`, the action sheet will be dismissed when the backdrop is clicked.
    */
  var backdropDismiss: js.UndefOr[Boolean] = js.undefined
  
  /**
    * An array of buttons for the action sheet.
    */
  var buttons: js.UndefOr[js.Array[ActionSheetButton[Any] | String]] = js.undefined
  
  /**
    * Additional classes to apply for custom CSS. If multiple classes are provided they should be separated by spaces.
    */
  var cssClass: js.UndefOr[String | js.Array[String]] = js.undefined
  
  /**
    * Animation to use when the action sheet is presented.
    */
  var enterAnimation: js.UndefOr[AnimationBuilder] = js.undefined
  
  /**
    * Title for the action sheet.
    */
  var header: js.UndefOr[String] = js.undefined
  
  /**
    * Additional attributes to pass to the action sheet.
    */
  var htmlAttributes: js.UndefOr[ActionSheetAttributes] = js.undefined
  
  /**
    * If `true`, the keyboard will be automatically dismissed when the overlay is presented.
    */
  var keyboardClose: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Animation to use when the action sheet is dismissed.
    */
  var leaveAnimation: js.UndefOr[AnimationBuilder] = js.undefined
  
  /**
    * The mode determines which platform styles to use.
    */
  var mode: js.UndefOr[ios | md] = js.undefined
  
  /**
    * Emitted after the alert has dismissed.
    */
  var onIonActionSheetDidDismiss: js.UndefOr[
    js.Function1[/* event */ IonActionSheetCustomEvent[OverlayEventDetail[Any]], Unit]
  ] = js.undefined
  
  /**
    * Emitted after the alert has presented.
    */
  var onIonActionSheetDidPresent: js.UndefOr[js.Function1[/* event */ IonActionSheetCustomEvent[Unit], Unit]] = js.undefined
  
  /**
    * Emitted before the alert has dismissed.
    */
  var onIonActionSheetWillDismiss: js.UndefOr[
    js.Function1[/* event */ IonActionSheetCustomEvent[OverlayEventDetail[Any]], Unit]
  ] = js.undefined
  
  /**
    * Emitted before the alert has presented.
    */
  var onIonActionSheetWillPresent: js.UndefOr[js.Function1[/* event */ IonActionSheetCustomEvent[Unit], Unit]] = js.undefined
  
  /**
    * Subtitle for the action sheet.
    */
  var subHeader: js.UndefOr[String] = js.undefined
  
  /**
    * If `true`, the action sheet will be translucent. Only applies when the mode is `"ios"` and the device supports [`backdrop-filter`](https://developer.mozilla.org/en-US/docs/Web/CSS/backdrop-filter#Browser_compatibility).
    */
  var translucent: js.UndefOr[Boolean] = js.undefined
}
object IonActionSheet {
  
  inline def apply(): IonActionSheet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IonActionSheet]
  }
  
  extension [Self <: IonActionSheet](x: Self) {
    
    inline def setAnimated(value: Boolean): Self = StObject.set(x, "animated", value.asInstanceOf[js.Any])
    
    inline def setAnimatedUndefined: Self = StObject.set(x, "animated", js.undefined)
    
    inline def setBackdropDismiss(value: Boolean): Self = StObject.set(x, "backdropDismiss", value.asInstanceOf[js.Any])
    
    inline def setBackdropDismissUndefined: Self = StObject.set(x, "backdropDismiss", js.undefined)
    
    inline def setButtons(value: js.Array[ActionSheetButton[Any] | String]): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
    
    inline def setButtonsUndefined: Self = StObject.set(x, "buttons", js.undefined)
    
    inline def setButtonsVarargs(value: (ActionSheetButton[Any] | String)*): Self = StObject.set(x, "buttons", js.Array(value*))
    
    inline def setCssClass(value: String | js.Array[String]): Self = StObject.set(x, "cssClass", value.asInstanceOf[js.Any])
    
    inline def setCssClassUndefined: Self = StObject.set(x, "cssClass", js.undefined)
    
    inline def setCssClassVarargs(value: String*): Self = StObject.set(x, "cssClass", js.Array(value*))
    
    inline def setEnterAnimation(value: (/* baseEl */ Any, /* opts */ js.UndefOr[Any]) => Animation): Self = StObject.set(x, "enterAnimation", js.Any.fromFunction2(value))
    
    inline def setEnterAnimationUndefined: Self = StObject.set(x, "enterAnimation", js.undefined)
    
    inline def setHeader(value: String): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
    
    inline def setHtmlAttributes(value: ActionSheetAttributes): Self = StObject.set(x, "htmlAttributes", value.asInstanceOf[js.Any])
    
    inline def setHtmlAttributesUndefined: Self = StObject.set(x, "htmlAttributes", js.undefined)
    
    inline def setKeyboardClose(value: Boolean): Self = StObject.set(x, "keyboardClose", value.asInstanceOf[js.Any])
    
    inline def setKeyboardCloseUndefined: Self = StObject.set(x, "keyboardClose", js.undefined)
    
    inline def setLeaveAnimation(value: (/* baseEl */ Any, /* opts */ js.UndefOr[Any]) => Animation): Self = StObject.set(x, "leaveAnimation", js.Any.fromFunction2(value))
    
    inline def setLeaveAnimationUndefined: Self = StObject.set(x, "leaveAnimation", js.undefined)
    
    inline def setMode(value: ios | md): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setOnIonActionSheetDidDismiss(value: /* event */ IonActionSheetCustomEvent[OverlayEventDetail[Any]] => Callback): Self = StObject.set(x, "onIonActionSheetDidDismiss", js.Any.fromFunction1((t0: /* event */ IonActionSheetCustomEvent[OverlayEventDetail[Any]]) => value(t0).runNow()))
    
    inline def setOnIonActionSheetDidDismissUndefined: Self = StObject.set(x, "onIonActionSheetDidDismiss", js.undefined)
    
    inline def setOnIonActionSheetDidPresent(value: /* event */ IonActionSheetCustomEvent[Unit] => Callback): Self = StObject.set(x, "onIonActionSheetDidPresent", js.Any.fromFunction1((t0: /* event */ IonActionSheetCustomEvent[Unit]) => value(t0).runNow()))
    
    inline def setOnIonActionSheetDidPresentUndefined: Self = StObject.set(x, "onIonActionSheetDidPresent", js.undefined)
    
    inline def setOnIonActionSheetWillDismiss(value: /* event */ IonActionSheetCustomEvent[OverlayEventDetail[Any]] => Callback): Self = StObject.set(x, "onIonActionSheetWillDismiss", js.Any.fromFunction1((t0: /* event */ IonActionSheetCustomEvent[OverlayEventDetail[Any]]) => value(t0).runNow()))
    
    inline def setOnIonActionSheetWillDismissUndefined: Self = StObject.set(x, "onIonActionSheetWillDismiss", js.undefined)
    
    inline def setOnIonActionSheetWillPresent(value: /* event */ IonActionSheetCustomEvent[Unit] => Callback): Self = StObject.set(x, "onIonActionSheetWillPresent", js.Any.fromFunction1((t0: /* event */ IonActionSheetCustomEvent[Unit]) => value(t0).runNow()))
    
    inline def setOnIonActionSheetWillPresentUndefined: Self = StObject.set(x, "onIonActionSheetWillPresent", js.undefined)
    
    inline def setSubHeader(value: String): Self = StObject.set(x, "subHeader", value.asInstanceOf[js.Any])
    
    inline def setSubHeaderUndefined: Self = StObject.set(x, "subHeader", js.undefined)
    
    inline def setTranslucent(value: Boolean): Self = StObject.set(x, "translucent", value.asInstanceOf[js.Any])
    
    inline def setTranslucentUndefined: Self = StObject.set(x, "translucent", js.undefined)
  }
}
