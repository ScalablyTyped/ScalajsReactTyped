package typingsJapgolly.ionicCore.distTypesComponentsMod.LocalJSX

import japgolly.scalajs.react.Callback
import typingsJapgolly.ionicCore.distTypesComponentsMod.IonPickerCustomEvent
import typingsJapgolly.ionicCore.distTypesComponentsPickerPickerInterfaceMod.PickerAttributes
import typingsJapgolly.ionicCore.distTypesComponentsPickerPickerInterfaceMod.PickerButton
import typingsJapgolly.ionicCore.distTypesComponentsPickerPickerInterfaceMod.PickerColumn
import typingsJapgolly.ionicCore.distTypesUtilsAnimationAnimationInterfaceMod.Animation
import typingsJapgolly.ionicCore.distTypesUtilsAnimationAnimationInterfaceMod.AnimationBuilder
import typingsJapgolly.ionicCore.distTypesUtilsOverlaysInterfaceMod.OverlayEventDetail
import typingsJapgolly.ionicCore.ionicCoreStrings.ios
import typingsJapgolly.ionicCore.ionicCoreStrings.md
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IonPicker extends StObject {
  
  /**
    * If `true`, the picker will animate.
    */
  var animated: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If `true`, the picker will be dismissed when the backdrop is clicked.
    */
  var backdropDismiss: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Array of buttons to be displayed at the top of the picker.
    */
  var buttons: js.UndefOr[js.Array[PickerButton]] = js.undefined
  
  /**
    * Array of columns to be displayed in the picker.
    */
  var columns: js.UndefOr[js.Array[PickerColumn]] = js.undefined
  
  /**
    * Additional classes to apply for custom CSS. If multiple classes are provided they should be separated by spaces.
    */
  var cssClass: js.UndefOr[String | js.Array[String]] = js.undefined
  
  /**
    * Number of milliseconds to wait before dismissing the picker.
    */
  var duration: js.UndefOr[Double] = js.undefined
  
  /**
    * Animation to use when the picker is presented.
    */
  var enterAnimation: js.UndefOr[AnimationBuilder] = js.undefined
  
  /**
    * Additional attributes to pass to the picker.
    */
  var htmlAttributes: js.UndefOr[PickerAttributes] = js.undefined
  
  /**
    * If `true`, the keyboard will be automatically dismissed when the overlay is presented.
    */
  var keyboardClose: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Animation to use when the picker is dismissed.
    */
  var leaveAnimation: js.UndefOr[AnimationBuilder] = js.undefined
  
  /**
    * The mode determines which platform styles to use.
    */
  var mode: js.UndefOr[ios | md] = js.undefined
  
  /**
    * Emitted after the picker has dismissed.
    */
  var onIonPickerDidDismiss: js.UndefOr[js.Function1[/* event */ IonPickerCustomEvent[OverlayEventDetail[Any]], Unit]] = js.undefined
  
  /**
    * Emitted after the picker has presented.
    */
  var onIonPickerDidPresent: js.UndefOr[js.Function1[/* event */ IonPickerCustomEvent[Unit], Unit]] = js.undefined
  
  /**
    * Emitted before the picker has dismissed.
    */
  var onIonPickerWillDismiss: js.UndefOr[js.Function1[/* event */ IonPickerCustomEvent[OverlayEventDetail[Any]], Unit]] = js.undefined
  
  /**
    * Emitted before the picker has presented.
    */
  var onIonPickerWillPresent: js.UndefOr[js.Function1[/* event */ IonPickerCustomEvent[Unit], Unit]] = js.undefined
  
  /**
    * If `true`, a backdrop will be displayed behind the picker.
    */
  var showBackdrop: js.UndefOr[Boolean] = js.undefined
}
object IonPicker {
  
  inline def apply(): IonPicker = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IonPicker]
  }
  
  extension [Self <: IonPicker](x: Self) {
    
    inline def setAnimated(value: Boolean): Self = StObject.set(x, "animated", value.asInstanceOf[js.Any])
    
    inline def setAnimatedUndefined: Self = StObject.set(x, "animated", js.undefined)
    
    inline def setBackdropDismiss(value: Boolean): Self = StObject.set(x, "backdropDismiss", value.asInstanceOf[js.Any])
    
    inline def setBackdropDismissUndefined: Self = StObject.set(x, "backdropDismiss", js.undefined)
    
    inline def setButtons(value: js.Array[PickerButton]): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
    
    inline def setButtonsUndefined: Self = StObject.set(x, "buttons", js.undefined)
    
    inline def setButtonsVarargs(value: PickerButton*): Self = StObject.set(x, "buttons", js.Array(value*))
    
    inline def setColumns(value: js.Array[PickerColumn]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    inline def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
    
    inline def setColumnsVarargs(value: PickerColumn*): Self = StObject.set(x, "columns", js.Array(value*))
    
    inline def setCssClass(value: String | js.Array[String]): Self = StObject.set(x, "cssClass", value.asInstanceOf[js.Any])
    
    inline def setCssClassUndefined: Self = StObject.set(x, "cssClass", js.undefined)
    
    inline def setCssClassVarargs(value: String*): Self = StObject.set(x, "cssClass", js.Array(value*))
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setEnterAnimation(value: (/* baseEl */ Any, /* opts */ js.UndefOr[Any]) => Animation): Self = StObject.set(x, "enterAnimation", js.Any.fromFunction2(value))
    
    inline def setEnterAnimationUndefined: Self = StObject.set(x, "enterAnimation", js.undefined)
    
    inline def setHtmlAttributes(value: PickerAttributes): Self = StObject.set(x, "htmlAttributes", value.asInstanceOf[js.Any])
    
    inline def setHtmlAttributesUndefined: Self = StObject.set(x, "htmlAttributes", js.undefined)
    
    inline def setKeyboardClose(value: Boolean): Self = StObject.set(x, "keyboardClose", value.asInstanceOf[js.Any])
    
    inline def setKeyboardCloseUndefined: Self = StObject.set(x, "keyboardClose", js.undefined)
    
    inline def setLeaveAnimation(value: (/* baseEl */ Any, /* opts */ js.UndefOr[Any]) => Animation): Self = StObject.set(x, "leaveAnimation", js.Any.fromFunction2(value))
    
    inline def setLeaveAnimationUndefined: Self = StObject.set(x, "leaveAnimation", js.undefined)
    
    inline def setMode(value: ios | md): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setOnIonPickerDidDismiss(value: /* event */ IonPickerCustomEvent[OverlayEventDetail[Any]] => Callback): Self = StObject.set(x, "onIonPickerDidDismiss", js.Any.fromFunction1((t0: /* event */ IonPickerCustomEvent[OverlayEventDetail[Any]]) => value(t0).runNow()))
    
    inline def setOnIonPickerDidDismissUndefined: Self = StObject.set(x, "onIonPickerDidDismiss", js.undefined)
    
    inline def setOnIonPickerDidPresent(value: /* event */ IonPickerCustomEvent[Unit] => Callback): Self = StObject.set(x, "onIonPickerDidPresent", js.Any.fromFunction1((t0: /* event */ IonPickerCustomEvent[Unit]) => value(t0).runNow()))
    
    inline def setOnIonPickerDidPresentUndefined: Self = StObject.set(x, "onIonPickerDidPresent", js.undefined)
    
    inline def setOnIonPickerWillDismiss(value: /* event */ IonPickerCustomEvent[OverlayEventDetail[Any]] => Callback): Self = StObject.set(x, "onIonPickerWillDismiss", js.Any.fromFunction1((t0: /* event */ IonPickerCustomEvent[OverlayEventDetail[Any]]) => value(t0).runNow()))
    
    inline def setOnIonPickerWillDismissUndefined: Self = StObject.set(x, "onIonPickerWillDismiss", js.undefined)
    
    inline def setOnIonPickerWillPresent(value: /* event */ IonPickerCustomEvent[Unit] => Callback): Self = StObject.set(x, "onIonPickerWillPresent", js.Any.fromFunction1((t0: /* event */ IonPickerCustomEvent[Unit]) => value(t0).runNow()))
    
    inline def setOnIonPickerWillPresentUndefined: Self = StObject.set(x, "onIonPickerWillPresent", js.undefined)
    
    inline def setShowBackdrop(value: Boolean): Self = StObject.set(x, "showBackdrop", value.asInstanceOf[js.Any])
    
    inline def setShowBackdropUndefined: Self = StObject.set(x, "showBackdrop", js.undefined)
  }
}
