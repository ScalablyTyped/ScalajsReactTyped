package typingsJapgolly.awsSdk.clientsMqMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LogsSummary extends StObject {
  
  /**
    * Enables audit logging. Every user management action made using JMX or the ActiveMQ Web Console is logged.
    */
  var Audit: js.UndefOr[boolean] = js.undefined
  
  /**
    * The location of the CloudWatch Logs log group where audit logs are sent.
    */
  var AuditLogGroup: js.UndefOr[string] = js.undefined
  
  /**
    * Enables general logging.
    */
  var General: boolean
  
  /**
    * The location of the CloudWatch Logs log group where general logs are sent.
    */
  var GeneralLogGroup: string
  
  /**
    * The list of information about logs pending to be deployed for the specified broker.
    */
  var Pending: js.UndefOr[PendingLogs] = js.undefined
}
object LogsSummary {
  
  inline def apply(General: boolean, GeneralLogGroup: string): LogsSummary = {
    val __obj = js.Dynamic.literal(General = General.asInstanceOf[js.Any], GeneralLogGroup = GeneralLogGroup.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogsSummary]
  }
  
  extension [Self <: LogsSummary](x: Self) {
    
    inline def setAudit(value: boolean): Self = StObject.set(x, "Audit", value.asInstanceOf[js.Any])
    
    inline def setAuditLogGroup(value: string): Self = StObject.set(x, "AuditLogGroup", value.asInstanceOf[js.Any])
    
    inline def setAuditLogGroupUndefined: Self = StObject.set(x, "AuditLogGroup", js.undefined)
    
    inline def setAuditUndefined: Self = StObject.set(x, "Audit", js.undefined)
    
    inline def setGeneral(value: boolean): Self = StObject.set(x, "General", value.asInstanceOf[js.Any])
    
    inline def setGeneralLogGroup(value: string): Self = StObject.set(x, "GeneralLogGroup", value.asInstanceOf[js.Any])
    
    inline def setPending(value: PendingLogs): Self = StObject.set(x, "Pending", value.asInstanceOf[js.Any])
    
    inline def setPendingUndefined: Self = StObject.set(x, "Pending", js.undefined)
  }
}
