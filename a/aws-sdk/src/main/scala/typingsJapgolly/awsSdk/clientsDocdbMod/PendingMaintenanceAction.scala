package typingsJapgolly.awsSdk.clientsDocdbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PendingMaintenanceAction extends StObject {
  
  /**
    * The type of pending maintenance action that is available for the resource.
    */
  var Action: js.UndefOr[String] = js.undefined
  
  /**
    * The date of the maintenance window when the action is applied. The maintenance action is applied to the resource during its first maintenance window after this date. If this date is specified, any next-maintenance opt-in requests are ignored.
    */
  var AutoAppliedAfterDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The effective date when the pending maintenance action is applied to the resource.
    */
  var CurrentApplyDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * A description providing more detail about the maintenance action.
    */
  var Description: js.UndefOr[String] = js.undefined
  
  /**
    * The date when the maintenance action is automatically applied. The maintenance action is applied to the resource on this date regardless of the maintenance window for the resource. If this date is specified, any immediate opt-in requests are ignored.
    */
  var ForcedApplyDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Indicates the type of opt-in request that has been received for the resource.
    */
  var OptInStatus: js.UndefOr[String] = js.undefined
}
object PendingMaintenanceAction {
  
  inline def apply(): PendingMaintenanceAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PendingMaintenanceAction]
  }
  
  extension [Self <: PendingMaintenanceAction](x: Self) {
    
    inline def setAction(value: String): Self = StObject.set(x, "Action", value.asInstanceOf[js.Any])
    
    inline def setActionUndefined: Self = StObject.set(x, "Action", js.undefined)
    
    inline def setAutoAppliedAfterDate(value: js.Date): Self = StObject.set(x, "AutoAppliedAfterDate", value.asInstanceOf[js.Any])
    
    inline def setAutoAppliedAfterDateUndefined: Self = StObject.set(x, "AutoAppliedAfterDate", js.undefined)
    
    inline def setCurrentApplyDate(value: js.Date): Self = StObject.set(x, "CurrentApplyDate", value.asInstanceOf[js.Any])
    
    inline def setCurrentApplyDateUndefined: Self = StObject.set(x, "CurrentApplyDate", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setForcedApplyDate(value: js.Date): Self = StObject.set(x, "ForcedApplyDate", value.asInstanceOf[js.Any])
    
    inline def setForcedApplyDateUndefined: Self = StObject.set(x, "ForcedApplyDate", js.undefined)
    
    inline def setOptInStatus(value: String): Self = StObject.set(x, "OptInStatus", value.asInstanceOf[js.Any])
    
    inline def setOptInStatusUndefined: Self = StObject.set(x, "OptInStatus", js.undefined)
  }
}
