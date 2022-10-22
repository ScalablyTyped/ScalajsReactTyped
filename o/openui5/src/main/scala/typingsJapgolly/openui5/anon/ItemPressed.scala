package typingsJapgolly.openui5.anon

import typingsJapgolly.openui5.sapFProductSwitchItemMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ItemPressed extends StObject {
  
  /**
    * Reference to the new item that has been selected.
    */
  var itemPressed: js.UndefOr[default] = js.undefined
}
object ItemPressed {
  
  inline def apply(): ItemPressed = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ItemPressed]
  }
  
  extension [Self <: ItemPressed](x: Self) {
    
    inline def setItemPressed(value: default): Self = StObject.set(x, "itemPressed", value.asInstanceOf[js.Any])
    
    inline def setItemPressedUndefined: Self = StObject.set(x, "itemPressed", js.undefined)
  }
}
