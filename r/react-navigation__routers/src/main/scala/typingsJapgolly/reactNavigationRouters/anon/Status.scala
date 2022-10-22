package typingsJapgolly.reactNavigationRouters.anon

import typingsJapgolly.reactNavigationRouters.libTypescriptSrcDrawerRouterMod.DrawerStatus
import typingsJapgolly.reactNavigationRouters.reactNavigationRoutersStrings.drawer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Status extends StObject {
  
  var status: DrawerStatus
  
  var `type`: drawer
}
object Status {
  
  inline def apply(status: DrawerStatus): Status = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("drawer")
    __obj.asInstanceOf[Status]
  }
  
  extension [Self <: Status](x: Self) {
    
    inline def setStatus(value: DrawerStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setType(value: drawer): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
