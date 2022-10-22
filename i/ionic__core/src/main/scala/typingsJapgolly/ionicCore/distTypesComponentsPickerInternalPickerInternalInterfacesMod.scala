package typingsJapgolly.ionicCore

import typingsJapgolly.ionicCore.distTypesComponentsMod.global.HTMLIonPickerColumnInternalElement
import typingsJapgolly.ionicCore.distTypesComponentsMod.global.HTMLIonPickerInternalElement
import typingsJapgolly.std.CustomEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesComponentsPickerInternalPickerInternalInterfacesMod {
  
  trait PickerInternalChangeEventDetail extends StObject {
    
    var inputModeColumn: js.UndefOr[HTMLIonPickerColumnInternalElement] = js.undefined
    
    var useInputMode: Boolean
  }
  object PickerInternalChangeEventDetail {
    
    inline def apply(useInputMode: Boolean): PickerInternalChangeEventDetail = {
      val __obj = js.Dynamic.literal(useInputMode = useInputMode.asInstanceOf[js.Any])
      __obj.asInstanceOf[PickerInternalChangeEventDetail]
    }
    
    extension [Self <: PickerInternalChangeEventDetail](x: Self) {
      
      inline def setInputModeColumn(value: HTMLIonPickerColumnInternalElement): Self = StObject.set(x, "inputModeColumn", value.asInstanceOf[js.Any])
      
      inline def setInputModeColumnUndefined: Self = StObject.set(x, "inputModeColumn", js.undefined)
      
      inline def setUseInputMode(value: Boolean): Self = StObject.set(x, "useInputMode", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait PickerInternalCustomEvent
    extends StObject
       with CustomEvent[Any] {
    
    @JSName("detail")
    var detail_PickerInternalCustomEvent: PickerInternalChangeEventDetail = js.native
    
    @JSName("target")
    var target_PickerInternalCustomEvent: HTMLIonPickerInternalElement = js.native
  }
}
