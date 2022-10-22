package typingsJapgolly.gestalt.anon

import typingsJapgolly.gestalt.mod.DropdownOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ItemDropdownOption extends StObject {
  
  var item: DropdownOption
}
object ItemDropdownOption {
  
  inline def apply(item: DropdownOption): ItemDropdownOption = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemDropdownOption]
  }
  
  extension [Self <: ItemDropdownOption](x: Self) {
    
    inline def setItem(value: DropdownOption): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
  }
}
