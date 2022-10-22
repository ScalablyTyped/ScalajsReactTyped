package typingsJapgolly.ionicCore.distTypesComponentsMod.LocalJSX

import japgolly.scalajs.react.Callback
import typingsJapgolly.ionicCore.distTypesComponentsMod.IonToggleCustomEvent
import typingsJapgolly.ionicCore.distTypesComponentsToggleToggleInterfaceMod.ToggleChangeEventDetail
import typingsJapgolly.ionicCore.ionicCoreStrings.ios
import typingsJapgolly.ionicCore.ionicCoreStrings.md
import typingsJapgolly.ionicCore.mod.Color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IonToggle extends StObject {
  
  /**
    * If `true`, the toggle is selected.
    */
  var checked: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The color to use from your application's color palette. Default options are: `"primary"`, `"secondary"`, `"tertiary"`, `"success"`, `"warning"`, `"danger"`, `"light"`, `"medium"`, and `"dark"`. For more information on colors, see [theming](/docs/theming/basics).
    */
  var color: js.UndefOr[Color] = js.undefined
  
  /**
    * If `true`, the user cannot interact with the toggle.
    */
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Enables the on/off accessibility switch labels within the toggle.
    */
  var enableOnOffLabels: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The mode determines which platform styles to use.
    */
  var mode: js.UndefOr[ios | md] = js.undefined
  
  /**
    * The name of the control, which is submitted with the form data.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Emitted when the toggle loses focus.
    */
  var onIonBlur: js.UndefOr[js.Function1[/* event */ IonToggleCustomEvent[Unit], Unit]] = js.undefined
  
  /**
    * Emitted when the value property has changed.
    */
  var onIonChange: js.UndefOr[
    js.Function1[/* event */ IonToggleCustomEvent[ToggleChangeEventDetail[Any]], Unit]
  ] = js.undefined
  
  /**
    * Emitted when the toggle has focus.
    */
  var onIonFocus: js.UndefOr[js.Function1[/* event */ IonToggleCustomEvent[Unit], Unit]] = js.undefined
  
  /**
    * The value of the toggle does not mean if it's checked or not, use the `checked` property for that.  The value of a toggle is analogous to the value of a `<input type="checkbox">`, it's only used when the toggle participates in a native `<form>`.
    */
  var value: js.UndefOr[String | Null] = js.undefined
}
object IonToggle {
  
  inline def apply(): IonToggle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IonToggle]
  }
  
  extension [Self <: IonToggle](x: Self) {
    
    inline def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
    
    inline def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
    
    inline def setColor(value: Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setEnableOnOffLabels(value: Boolean): Self = StObject.set(x, "enableOnOffLabels", value.asInstanceOf[js.Any])
    
    inline def setEnableOnOffLabelsUndefined: Self = StObject.set(x, "enableOnOffLabels", js.undefined)
    
    inline def setMode(value: ios | md): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOnIonBlur(value: /* event */ IonToggleCustomEvent[Unit] => Callback): Self = StObject.set(x, "onIonBlur", js.Any.fromFunction1((t0: /* event */ IonToggleCustomEvent[Unit]) => value(t0).runNow()))
    
    inline def setOnIonBlurUndefined: Self = StObject.set(x, "onIonBlur", js.undefined)
    
    inline def setOnIonChange(value: /* event */ IonToggleCustomEvent[ToggleChangeEventDetail[Any]] => Callback): Self = StObject.set(x, "onIonChange", js.Any.fromFunction1((t0: /* event */ IonToggleCustomEvent[ToggleChangeEventDetail[Any]]) => value(t0).runNow()))
    
    inline def setOnIonChangeUndefined: Self = StObject.set(x, "onIonChange", js.undefined)
    
    inline def setOnIonFocus(value: /* event */ IonToggleCustomEvent[Unit] => Callback): Self = StObject.set(x, "onIonFocus", js.Any.fromFunction1((t0: /* event */ IonToggleCustomEvent[Unit]) => value(t0).runNow()))
    
    inline def setOnIonFocusUndefined: Self = StObject.set(x, "onIonFocus", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueNull: Self = StObject.set(x, "value", null)
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
