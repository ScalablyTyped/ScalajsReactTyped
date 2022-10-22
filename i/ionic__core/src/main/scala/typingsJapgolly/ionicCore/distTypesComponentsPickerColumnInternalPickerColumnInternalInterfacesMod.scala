package typingsJapgolly.ionicCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesComponentsPickerColumnInternalPickerColumnInternalInterfacesMod {
  
  trait PickerColumnItem extends StObject {
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var text: String
    
    var value: String | Double
  }
  object PickerColumnItem {
    
    inline def apply(text: String, value: String | Double): PickerColumnItem = {
      val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[PickerColumnItem]
    }
    
    extension [Self <: PickerColumnItem](x: Self) {
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String | Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
