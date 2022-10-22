package typingsJapgolly.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuditNotificationTarget extends StObject {
  
  /**
    * True if notifications to the target are enabled.
    */
  var enabled: js.UndefOr[Enabled] = js.undefined
  
  /**
    * The ARN of the role that grants permission to send notifications to the target.
    */
  var roleArn: js.UndefOr[RoleArn] = js.undefined
  
  /**
    * The ARN of the target (SNS topic) to which audit notifications are sent.
    */
  var targetArn: js.UndefOr[TargetArn] = js.undefined
}
object AuditNotificationTarget {
  
  inline def apply(): AuditNotificationTarget = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuditNotificationTarget]
  }
  
  extension [Self <: AuditNotificationTarget](x: Self) {
    
    inline def setEnabled(value: Enabled): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setRoleArn(value: RoleArn): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
    
    inline def setRoleArnUndefined: Self = StObject.set(x, "roleArn", js.undefined)
    
    inline def setTargetArn(value: TargetArn): Self = StObject.set(x, "targetArn", value.asInstanceOf[js.Any])
    
    inline def setTargetArnUndefined: Self = StObject.set(x, "targetArn", js.undefined)
  }
}
