package typingsJapgolly.reachDropdown.anon

import typingsJapgolly.reachDropdown.mod.DropdownAction
import typingsJapgolly.reachDropdown.reachDropdownStrings.CLEAR_SELECTION_INDEX
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `3`
  extends StObject
     with DropdownAction {
  
  var `type`: CLEAR_SELECTION_INDEX
}
object `3` {
  
  inline def apply(): `3` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("CLEAR_SELECTION_INDEX")
    __obj.asInstanceOf[`3`]
  }
  
  extension [Self <: `3`](x: Self) {
    
    inline def setType(value: CLEAR_SELECTION_INDEX): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
