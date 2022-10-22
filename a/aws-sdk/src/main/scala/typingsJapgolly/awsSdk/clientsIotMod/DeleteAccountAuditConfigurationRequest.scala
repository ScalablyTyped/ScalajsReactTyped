package typingsJapgolly.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteAccountAuditConfigurationRequest extends StObject {
  
  /**
    * If true, all scheduled audits are deleted.
    */
  var deleteScheduledAudits: js.UndefOr[DeleteScheduledAudits] = js.undefined
}
object DeleteAccountAuditConfigurationRequest {
  
  inline def apply(): DeleteAccountAuditConfigurationRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteAccountAuditConfigurationRequest]
  }
  
  extension [Self <: DeleteAccountAuditConfigurationRequest](x: Self) {
    
    inline def setDeleteScheduledAudits(value: DeleteScheduledAudits): Self = StObject.set(x, "deleteScheduledAudits", value.asInstanceOf[js.Any])
    
    inline def setDeleteScheduledAuditsUndefined: Self = StObject.set(x, "deleteScheduledAudits", js.undefined)
  }
}
