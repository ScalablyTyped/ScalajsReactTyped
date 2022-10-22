package typingsJapgolly.awsSdk.clientsSsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegisterTaskWithMaintenanceWindowResult extends StObject {
  
  /**
    * The ID of the task in the maintenance window.
    */
  var WindowTaskId: js.UndefOr[MaintenanceWindowTaskId] = js.undefined
}
object RegisterTaskWithMaintenanceWindowResult {
  
  inline def apply(): RegisterTaskWithMaintenanceWindowResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegisterTaskWithMaintenanceWindowResult]
  }
  
  extension [Self <: RegisterTaskWithMaintenanceWindowResult](x: Self) {
    
    inline def setWindowTaskId(value: MaintenanceWindowTaskId): Self = StObject.set(x, "WindowTaskId", value.asInstanceOf[js.Any])
    
    inline def setWindowTaskIdUndefined: Self = StObject.set(x, "WindowTaskId", js.undefined)
  }
}
