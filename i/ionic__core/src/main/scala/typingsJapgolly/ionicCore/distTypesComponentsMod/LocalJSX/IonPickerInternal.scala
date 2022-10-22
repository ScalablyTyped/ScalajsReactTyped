package typingsJapgolly.ionicCore.distTypesComponentsMod.LocalJSX

import japgolly.scalajs.react.Callback
import typingsJapgolly.ionicCore.distTypesComponentsMod.IonPickerInternalCustomEvent
import typingsJapgolly.ionicCore.distTypesComponentsPickerInternalPickerInternalInterfacesMod.PickerInternalChangeEventDetail
import typingsJapgolly.ionicCore.ionicCoreStrings.ios
import typingsJapgolly.ionicCore.ionicCoreStrings.md
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IonPickerInternal extends StObject {
  
  /**
    * The mode determines which platform styles to use.
    */
  var mode: js.UndefOr[ios | md] = js.undefined
  
  var onIonInputModeChange: js.UndefOr[
    js.Function1[/* event */ IonPickerInternalCustomEvent[PickerInternalChangeEventDetail], Unit]
  ] = js.undefined
}
object IonPickerInternal {
  
  inline def apply(): IonPickerInternal = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IonPickerInternal]
  }
  
  extension [Self <: IonPickerInternal](x: Self) {
    
    inline def setMode(value: ios | md): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setOnIonInputModeChange(value: /* event */ IonPickerInternalCustomEvent[PickerInternalChangeEventDetail] => Callback): Self = StObject.set(x, "onIonInputModeChange", js.Any.fromFunction1((t0: /* event */ IonPickerInternalCustomEvent[PickerInternalChangeEventDetail]) => value(t0).runNow()))
    
    inline def setOnIonInputModeChangeUndefined: Self = StObject.set(x, "onIonInputModeChange", js.undefined)
  }
}
