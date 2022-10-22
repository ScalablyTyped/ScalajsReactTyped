package typingsJapgolly.awsSdk.clientsDmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplyPendingMaintenanceActionResponse extends StObject {
  
  /**
    * The DMS resource that the pending maintenance action will be applied to.
    */
  var ResourcePendingMaintenanceActions: js.UndefOr[typingsJapgolly.awsSdk.clientsDmsMod.ResourcePendingMaintenanceActions] = js.undefined
}
object ApplyPendingMaintenanceActionResponse {
  
  inline def apply(): ApplyPendingMaintenanceActionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApplyPendingMaintenanceActionResponse]
  }
  
  extension [Self <: ApplyPendingMaintenanceActionResponse](x: Self) {
    
    inline def setResourcePendingMaintenanceActions(value: ResourcePendingMaintenanceActions): Self = StObject.set(x, "ResourcePendingMaintenanceActions", value.asInstanceOf[js.Any])
    
    inline def setResourcePendingMaintenanceActionsUndefined: Self = StObject.set(x, "ResourcePendingMaintenanceActions", js.undefined)
  }
}
