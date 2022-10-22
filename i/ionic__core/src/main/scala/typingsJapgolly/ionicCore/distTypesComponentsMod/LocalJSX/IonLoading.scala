package typingsJapgolly.ionicCore.distTypesComponentsMod.LocalJSX

import japgolly.scalajs.react.Callback
import typingsJapgolly.ionicCore.distTypesComponentsLoadingLoadingInterfaceMod.LoadingAttributes
import typingsJapgolly.ionicCore.distTypesComponentsMod.IonLoadingCustomEvent
import typingsJapgolly.ionicCore.distTypesComponentsSpinnerSpinnerConfigsMod.SpinnerTypes
import typingsJapgolly.ionicCore.distTypesUtilsAnimationAnimationInterfaceMod.Animation
import typingsJapgolly.ionicCore.distTypesUtilsAnimationAnimationInterfaceMod.AnimationBuilder
import typingsJapgolly.ionicCore.distTypesUtilsOverlaysInterfaceMod.OverlayEventDetail
import typingsJapgolly.ionicCore.distTypesUtilsSanitizationMod.IonicSafeString
import typingsJapgolly.ionicCore.ionicCoreStrings.ios
import typingsJapgolly.ionicCore.ionicCoreStrings.md
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IonLoading extends StObject {
  
  /**
    * If `true`, the loading indicator will animate.
    */
  var animated: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If `true`, the loading indicator will be dismissed when the backdrop is clicked.
    */
  var backdropDismiss: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Additional classes to apply for custom CSS. If multiple classes are provided they should be separated by spaces.
    */
  var cssClass: js.UndefOr[String | js.Array[String]] = js.undefined
  
  /**
    * Number of milliseconds to wait before dismissing the loading indicator.
    */
  var duration: js.UndefOr[Double] = js.undefined
  
  /**
    * Animation to use when the loading indicator is presented.
    */
  var enterAnimation: js.UndefOr[AnimationBuilder] = js.undefined
  
  /**
    * Additional attributes to pass to the loader.
    */
  var htmlAttributes: js.UndefOr[LoadingAttributes] = js.undefined
  
  /**
    * If `true`, the keyboard will be automatically dismissed when the overlay is presented.
    */
  var keyboardClose: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Animation to use when the loading indicator is dismissed.
    */
  var leaveAnimation: js.UndefOr[AnimationBuilder] = js.undefined
  
  /**
    * Optional text content to display in the loading indicator.
    */
  var message: js.UndefOr[String | IonicSafeString] = js.undefined
  
  /**
    * The mode determines which platform styles to use.
    */
  var mode: js.UndefOr[ios | md] = js.undefined
  
  /**
    * Emitted after the loading has dismissed.
    */
  var onIonLoadingDidDismiss: js.UndefOr[js.Function1[/* event */ IonLoadingCustomEvent[OverlayEventDetail[Any]], Unit]] = js.undefined
  
  /**
    * Emitted after the loading has presented.
    */
  var onIonLoadingDidPresent: js.UndefOr[js.Function1[/* event */ IonLoadingCustomEvent[Unit], Unit]] = js.undefined
  
  /**
    * Emitted before the loading has dismissed.
    */
  var onIonLoadingWillDismiss: js.UndefOr[js.Function1[/* event */ IonLoadingCustomEvent[OverlayEventDetail[Any]], Unit]] = js.undefined
  
  /**
    * Emitted before the loading has presented.
    */
  var onIonLoadingWillPresent: js.UndefOr[js.Function1[/* event */ IonLoadingCustomEvent[Unit], Unit]] = js.undefined
  
  /**
    * If `true`, a backdrop will be displayed behind the loading indicator.
    */
  var showBackdrop: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The name of the spinner to display.
    */
  var spinner: js.UndefOr[SpinnerTypes | Null] = js.undefined
  
  /**
    * If `true`, the loading indicator will be translucent. Only applies when the mode is `"ios"` and the device supports [`backdrop-filter`](https://developer.mozilla.org/en-US/docs/Web/CSS/backdrop-filter#Browser_compatibility).
    */
  var translucent: js.UndefOr[Boolean] = js.undefined
}
object IonLoading {
  
  inline def apply(): IonLoading = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IonLoading]
  }
  
  extension [Self <: IonLoading](x: Self) {
    
    inline def setAnimated(value: Boolean): Self = StObject.set(x, "animated", value.asInstanceOf[js.Any])
    
    inline def setAnimatedUndefined: Self = StObject.set(x, "animated", js.undefined)
    
    inline def setBackdropDismiss(value: Boolean): Self = StObject.set(x, "backdropDismiss", value.asInstanceOf[js.Any])
    
    inline def setBackdropDismissUndefined: Self = StObject.set(x, "backdropDismiss", js.undefined)
    
    inline def setCssClass(value: String | js.Array[String]): Self = StObject.set(x, "cssClass", value.asInstanceOf[js.Any])
    
    inline def setCssClassUndefined: Self = StObject.set(x, "cssClass", js.undefined)
    
    inline def setCssClassVarargs(value: String*): Self = StObject.set(x, "cssClass", js.Array(value*))
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setEnterAnimation(value: (/* baseEl */ Any, /* opts */ js.UndefOr[Any]) => Animation): Self = StObject.set(x, "enterAnimation", js.Any.fromFunction2(value))
    
    inline def setEnterAnimationUndefined: Self = StObject.set(x, "enterAnimation", js.undefined)
    
    inline def setHtmlAttributes(value: LoadingAttributes): Self = StObject.set(x, "htmlAttributes", value.asInstanceOf[js.Any])
    
    inline def setHtmlAttributesUndefined: Self = StObject.set(x, "htmlAttributes", js.undefined)
    
    inline def setKeyboardClose(value: Boolean): Self = StObject.set(x, "keyboardClose", value.asInstanceOf[js.Any])
    
    inline def setKeyboardCloseUndefined: Self = StObject.set(x, "keyboardClose", js.undefined)
    
    inline def setLeaveAnimation(value: (/* baseEl */ Any, /* opts */ js.UndefOr[Any]) => Animation): Self = StObject.set(x, "leaveAnimation", js.Any.fromFunction2(value))
    
    inline def setLeaveAnimationUndefined: Self = StObject.set(x, "leaveAnimation", js.undefined)
    
    inline def setMessage(value: String | IonicSafeString): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setMode(value: ios | md): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setOnIonLoadingDidDismiss(value: /* event */ IonLoadingCustomEvent[OverlayEventDetail[Any]] => Callback): Self = StObject.set(x, "onIonLoadingDidDismiss", js.Any.fromFunction1((t0: /* event */ IonLoadingCustomEvent[OverlayEventDetail[Any]]) => value(t0).runNow()))
    
    inline def setOnIonLoadingDidDismissUndefined: Self = StObject.set(x, "onIonLoadingDidDismiss", js.undefined)
    
    inline def setOnIonLoadingDidPresent(value: /* event */ IonLoadingCustomEvent[Unit] => Callback): Self = StObject.set(x, "onIonLoadingDidPresent", js.Any.fromFunction1((t0: /* event */ IonLoadingCustomEvent[Unit]) => value(t0).runNow()))
    
    inline def setOnIonLoadingDidPresentUndefined: Self = StObject.set(x, "onIonLoadingDidPresent", js.undefined)
    
    inline def setOnIonLoadingWillDismiss(value: /* event */ IonLoadingCustomEvent[OverlayEventDetail[Any]] => Callback): Self = StObject.set(x, "onIonLoadingWillDismiss", js.Any.fromFunction1((t0: /* event */ IonLoadingCustomEvent[OverlayEventDetail[Any]]) => value(t0).runNow()))
    
    inline def setOnIonLoadingWillDismissUndefined: Self = StObject.set(x, "onIonLoadingWillDismiss", js.undefined)
    
    inline def setOnIonLoadingWillPresent(value: /* event */ IonLoadingCustomEvent[Unit] => Callback): Self = StObject.set(x, "onIonLoadingWillPresent", js.Any.fromFunction1((t0: /* event */ IonLoadingCustomEvent[Unit]) => value(t0).runNow()))
    
    inline def setOnIonLoadingWillPresentUndefined: Self = StObject.set(x, "onIonLoadingWillPresent", js.undefined)
    
    inline def setShowBackdrop(value: Boolean): Self = StObject.set(x, "showBackdrop", value.asInstanceOf[js.Any])
    
    inline def setShowBackdropUndefined: Self = StObject.set(x, "showBackdrop", js.undefined)
    
    inline def setSpinner(value: SpinnerTypes): Self = StObject.set(x, "spinner", value.asInstanceOf[js.Any])
    
    inline def setSpinnerNull: Self = StObject.set(x, "spinner", null)
    
    inline def setSpinnerUndefined: Self = StObject.set(x, "spinner", js.undefined)
    
    inline def setTranslucent(value: Boolean): Self = StObject.set(x, "translucent", value.asInstanceOf[js.Any])
    
    inline def setTranslucentUndefined: Self = StObject.set(x, "translucent", js.undefined)
  }
}
