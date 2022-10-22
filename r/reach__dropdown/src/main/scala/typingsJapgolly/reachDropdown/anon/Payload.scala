package typingsJapgolly.reachDropdown.anon

import typingsJapgolly.reachDropdown.mod.DropdownAction
import typingsJapgolly.reachDropdown.reachDropdownStrings.OPEN_MENU_AT_INDEX
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Payload
  extends StObject
     with DropdownAction {
  
  var payload: Index
  
  var `type`: OPEN_MENU_AT_INDEX
}
object Payload {
  
  inline def apply(payload: Index): Payload = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("OPEN_MENU_AT_INDEX")
    __obj.asInstanceOf[Payload]
  }
  
  extension [Self <: Payload](x: Self) {
    
    inline def setPayload(value: Index): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    inline def setType(value: OPEN_MENU_AT_INDEX): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
