package typingsJapgolly.ionicCore.distTypesComponentsMod.LocalJSX

import japgolly.scalajs.react.Callback
import typingsJapgolly.ionicCore.distTypesComponentsMod.IonToastCustomEvent
import typingsJapgolly.ionicCore.distTypesComponentsToastToastInterfaceMod.ToastAttributes
import typingsJapgolly.ionicCore.distTypesComponentsToastToastInterfaceMod.ToastButton
import typingsJapgolly.ionicCore.distTypesUtilsAnimationAnimationInterfaceMod.Animation
import typingsJapgolly.ionicCore.distTypesUtilsAnimationAnimationInterfaceMod.AnimationBuilder
import typingsJapgolly.ionicCore.distTypesUtilsOverlaysInterfaceMod.OverlayEventDetail
import typingsJapgolly.ionicCore.distTypesUtilsSanitizationMod.IonicSafeString
import typingsJapgolly.ionicCore.ionicCoreStrings.bottom
import typingsJapgolly.ionicCore.ionicCoreStrings.ios
import typingsJapgolly.ionicCore.ionicCoreStrings.md
import typingsJapgolly.ionicCore.ionicCoreStrings.middle
import typingsJapgolly.ionicCore.ionicCoreStrings.top
import typingsJapgolly.ionicCore.mod.Color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IonToast extends StObject {
  
  /**
    * If `true`, the toast will animate.
    */
  var animated: js.UndefOr[Boolean] = js.undefined
  
  /**
    * An array of buttons for the toast.
    */
  var buttons: js.UndefOr[js.Array[ToastButton | String]] = js.undefined
  
  /**
    * The color to use from your application's color palette. Default options are: `"primary"`, `"secondary"`, `"tertiary"`, `"success"`, `"warning"`, `"danger"`, `"light"`, `"medium"`, and `"dark"`. For more information on colors, see [theming](/docs/theming/basics).
    */
  var color: js.UndefOr[Color] = js.undefined
  
  /**
    * Additional classes to apply for custom CSS. If multiple classes are provided they should be separated by spaces.
    */
  var cssClass: js.UndefOr[String | js.Array[String]] = js.undefined
  
  /**
    * How many milliseconds to wait before hiding the toast. By default, it will show until `dismiss()` is called.
    */
  var duration: js.UndefOr[Double] = js.undefined
  
  /**
    * Animation to use when the toast is presented.
    */
  var enterAnimation: js.UndefOr[AnimationBuilder] = js.undefined
  
  /**
    * Header to be shown in the toast.
    */
  var header: js.UndefOr[String] = js.undefined
  
  /**
    * Additional attributes to pass to the toast.
    */
  var htmlAttributes: js.UndefOr[ToastAttributes] = js.undefined
  
  /**
    * The name of the icon to display, or the path to a valid SVG file. See `ion-icon`. https://ionic.io/ionicons
    */
  var icon: js.UndefOr[String] = js.undefined
  
  /**
    * If `true`, the keyboard will be automatically dismissed when the overlay is presented.
    */
  var keyboardClose: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Animation to use when the toast is dismissed.
    */
  var leaveAnimation: js.UndefOr[AnimationBuilder] = js.undefined
  
  /**
    * Message to be shown in the toast.
    */
  var message: js.UndefOr[String | IonicSafeString] = js.undefined
  
  /**
    * The mode determines which platform styles to use.
    */
  var mode: js.UndefOr[ios | md] = js.undefined
  
  /**
    * Emitted after the toast has dismissed.
    */
  var onIonToastDidDismiss: js.UndefOr[js.Function1[/* event */ IonToastCustomEvent[OverlayEventDetail[Any]], Unit]] = js.undefined
  
  /**
    * Emitted after the toast has presented.
    */
  var onIonToastDidPresent: js.UndefOr[js.Function1[/* event */ IonToastCustomEvent[Unit], Unit]] = js.undefined
  
  /**
    * Emitted before the toast has dismissed.
    */
  var onIonToastWillDismiss: js.UndefOr[js.Function1[/* event */ IonToastCustomEvent[OverlayEventDetail[Any]], Unit]] = js.undefined
  
  /**
    * Emitted before the toast has presented.
    */
  var onIonToastWillPresent: js.UndefOr[js.Function1[/* event */ IonToastCustomEvent[Unit], Unit]] = js.undefined
  
  /**
    * The position of the toast on the screen.
    */
  var position: js.UndefOr[top | bottom | middle] = js.undefined
  
  /**
    * If `true`, the toast will be translucent. Only applies when the mode is `"ios"` and the device supports [`backdrop-filter`](https://developer.mozilla.org/en-US/docs/Web/CSS/backdrop-filter#Browser_compatibility).
    */
  var translucent: js.UndefOr[Boolean] = js.undefined
}
object IonToast {
  
  inline def apply(): IonToast = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IonToast]
  }
  
  extension [Self <: IonToast](x: Self) {
    
    inline def setAnimated(value: Boolean): Self = StObject.set(x, "animated", value.asInstanceOf[js.Any])
    
    inline def setAnimatedUndefined: Self = StObject.set(x, "animated", js.undefined)
    
    inline def setButtons(value: js.Array[ToastButton | String]): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
    
    inline def setButtonsUndefined: Self = StObject.set(x, "buttons", js.undefined)
    
    inline def setButtonsVarargs(value: (ToastButton | String)*): Self = StObject.set(x, "buttons", js.Array(value*))
    
    inline def setColor(value: Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setCssClass(value: String | js.Array[String]): Self = StObject.set(x, "cssClass", value.asInstanceOf[js.Any])
    
    inline def setCssClassUndefined: Self = StObject.set(x, "cssClass", js.undefined)
    
    inline def setCssClassVarargs(value: String*): Self = StObject.set(x, "cssClass", js.Array(value*))
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setEnterAnimation(value: (/* baseEl */ Any, /* opts */ js.UndefOr[Any]) => Animation): Self = StObject.set(x, "enterAnimation", js.Any.fromFunction2(value))
    
    inline def setEnterAnimationUndefined: Self = StObject.set(x, "enterAnimation", js.undefined)
    
    inline def setHeader(value: String): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
    
    inline def setHtmlAttributes(value: ToastAttributes): Self = StObject.set(x, "htmlAttributes", value.asInstanceOf[js.Any])
    
    inline def setHtmlAttributesUndefined: Self = StObject.set(x, "htmlAttributes", js.undefined)
    
    inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    inline def setKeyboardClose(value: Boolean): Self = StObject.set(x, "keyboardClose", value.asInstanceOf[js.Any])
    
    inline def setKeyboardCloseUndefined: Self = StObject.set(x, "keyboardClose", js.undefined)
    
    inline def setLeaveAnimation(value: (/* baseEl */ Any, /* opts */ js.UndefOr[Any]) => Animation): Self = StObject.set(x, "leaveAnimation", js.Any.fromFunction2(value))
    
    inline def setLeaveAnimationUndefined: Self = StObject.set(x, "leaveAnimation", js.undefined)
    
    inline def setMessage(value: String | IonicSafeString): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setMode(value: ios | md): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setOnIonToastDidDismiss(value: /* event */ IonToastCustomEvent[OverlayEventDetail[Any]] => Callback): Self = StObject.set(x, "onIonToastDidDismiss", js.Any.fromFunction1((t0: /* event */ IonToastCustomEvent[OverlayEventDetail[Any]]) => value(t0).runNow()))
    
    inline def setOnIonToastDidDismissUndefined: Self = StObject.set(x, "onIonToastDidDismiss", js.undefined)
    
    inline def setOnIonToastDidPresent(value: /* event */ IonToastCustomEvent[Unit] => Callback): Self = StObject.set(x, "onIonToastDidPresent", js.Any.fromFunction1((t0: /* event */ IonToastCustomEvent[Unit]) => value(t0).runNow()))
    
    inline def setOnIonToastDidPresentUndefined: Self = StObject.set(x, "onIonToastDidPresent", js.undefined)
    
    inline def setOnIonToastWillDismiss(value: /* event */ IonToastCustomEvent[OverlayEventDetail[Any]] => Callback): Self = StObject.set(x, "onIonToastWillDismiss", js.Any.fromFunction1((t0: /* event */ IonToastCustomEvent[OverlayEventDetail[Any]]) => value(t0).runNow()))
    
    inline def setOnIonToastWillDismissUndefined: Self = StObject.set(x, "onIonToastWillDismiss", js.undefined)
    
    inline def setOnIonToastWillPresent(value: /* event */ IonToastCustomEvent[Unit] => Callback): Self = StObject.set(x, "onIonToastWillPresent", js.Any.fromFunction1((t0: /* event */ IonToastCustomEvent[Unit]) => value(t0).runNow()))
    
    inline def setOnIonToastWillPresentUndefined: Self = StObject.set(x, "onIonToastWillPresent", js.undefined)
    
    inline def setPosition(value: top | bottom | middle): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setTranslucent(value: Boolean): Self = StObject.set(x, "translucent", value.asInstanceOf[js.Any])
    
    inline def setTranslucentUndefined: Self = StObject.set(x, "translucent", js.undefined)
  }
}
