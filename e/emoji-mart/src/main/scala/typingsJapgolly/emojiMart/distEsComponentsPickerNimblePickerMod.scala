package typingsJapgolly.emojiMart

import typingsJapgolly.emojiMart.distEsUtilsDataMod.Data
import typingsJapgolly.emojiMart.distEsUtilsSharedPropsMod.PickerProps
import typingsJapgolly.react.mod.PureComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsComponentsPickerNimblePickerMod {
  
  @JSImport("emoji-mart/dist-es/components/picker/nimble-picker", JSImport.Default)
  @js.native
  open class default ()
    extends PureComponent[NimblePickerProps, js.Object, Any]
  
  type NimblePicker = PureComponent[NimblePickerProps, js.Object, Any]
  
  trait NimblePickerProps
    extends StObject
       with PickerProps {
    
    var data: Data
  }
  object NimblePickerProps {
    
    inline def apply(data: Data): NimblePickerProps = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[NimblePickerProps]
    }
    
    extension [Self <: NimblePickerProps](x: Self) {
      
      inline def setData(value: Data): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    }
  }
}
