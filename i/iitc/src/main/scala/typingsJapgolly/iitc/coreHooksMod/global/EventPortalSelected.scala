package typingsJapgolly.iitc.coreHooksMod.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventPortalSelected extends StObject {
  
  var selectedPortalGuid: String
  
  var unselectedPortalGuid: String
}
object EventPortalSelected {
  
  inline def apply(selectedPortalGuid: String, unselectedPortalGuid: String): EventPortalSelected = {
    val __obj = js.Dynamic.literal(selectedPortalGuid = selectedPortalGuid.asInstanceOf[js.Any], unselectedPortalGuid = unselectedPortalGuid.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventPortalSelected]
  }
  
  extension [Self <: EventPortalSelected](x: Self) {
    
    inline def setSelectedPortalGuid(value: String): Self = StObject.set(x, "selectedPortalGuid", value.asInstanceOf[js.Any])
    
    inline def setUnselectedPortalGuid(value: String): Self = StObject.set(x, "unselectedPortalGuid", value.asInstanceOf[js.Any])
  }
}
