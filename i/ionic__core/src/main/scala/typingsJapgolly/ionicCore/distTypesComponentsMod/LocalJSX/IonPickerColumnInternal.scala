package typingsJapgolly.ionicCore.distTypesComponentsMod.LocalJSX

import japgolly.scalajs.react.Callback
import typingsJapgolly.ionicCore.distTypesComponentsMod.IonPickerColumnInternalCustomEvent
import typingsJapgolly.ionicCore.distTypesComponentsPickerColumnInternalPickerColumnInternalInterfacesMod.PickerColumnItem
import typingsJapgolly.ionicCore.ionicCoreStrings.ios
import typingsJapgolly.ionicCore.ionicCoreStrings.md
import typingsJapgolly.ionicCore.mod.Color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IonPickerColumnInternal extends StObject {
  
  /**
    * The color to use from your application's color palette. Default options are: `"primary"`, `"secondary"`, `"tertiary"`, `"success"`, `"warning"`, `"danger"`, `"light"`, `"medium"`, and `"dark"`. For more information on colors, see [theming](/docs/theming/basics).
    */
  var color: js.UndefOr[Color] = js.undefined
  
  /**
    * A list of options to be displayed in the picker
    */
  var items: js.UndefOr[js.Array[PickerColumnItem]] = js.undefined
  
  /**
    * The mode determines which platform styles to use.
    */
  var mode: js.UndefOr[ios | md] = js.undefined
  
  /**
    * Emitted when the value has changed.
    */
  var onIonChange: js.UndefOr[
    js.Function1[/* event */ IonPickerColumnInternalCustomEvent[PickerColumnItem], Unit]
  ] = js.undefined
  
  /**
    * The selected option in the picker.
    */
  var value: js.UndefOr[String | Double] = js.undefined
}
object IonPickerColumnInternal {
  
  inline def apply(): IonPickerColumnInternal = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IonPickerColumnInternal]
  }
  
  extension [Self <: IonPickerColumnInternal](x: Self) {
    
    inline def setColor(value: Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setItems(value: js.Array[PickerColumnItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: PickerColumnItem*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setMode(value: ios | md): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setOnIonChange(value: /* event */ IonPickerColumnInternalCustomEvent[PickerColumnItem] => Callback): Self = StObject.set(x, "onIonChange", js.Any.fromFunction1((t0: /* event */ IonPickerColumnInternalCustomEvent[PickerColumnItem]) => value(t0).runNow()))
    
    inline def setOnIonChangeUndefined: Self = StObject.set(x, "onIonChange", js.undefined)
    
    inline def setValue(value: String | Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
