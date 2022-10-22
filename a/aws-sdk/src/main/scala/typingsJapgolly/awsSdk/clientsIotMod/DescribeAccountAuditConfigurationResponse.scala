package typingsJapgolly.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeAccountAuditConfigurationResponse extends StObject {
  
  /**
    * Which audit checks are enabled and disabled for this account.
    */
  var auditCheckConfigurations: js.UndefOr[AuditCheckConfigurations] = js.undefined
  
  /**
    * Information about the targets to which audit notifications are sent for this account.
    */
  var auditNotificationTargetConfigurations: js.UndefOr[AuditNotificationTargetConfigurations] = js.undefined
  
  /**
    * The ARN of the role that grants permission to IoT to access information about your devices, policies, certificates, and other items as required when performing an audit. On the first call to UpdateAccountAuditConfiguration, this parameter is required.
    */
  var roleArn: js.UndefOr[RoleArn] = js.undefined
}
object DescribeAccountAuditConfigurationResponse {
  
  inline def apply(): DescribeAccountAuditConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAccountAuditConfigurationResponse]
  }
  
  extension [Self <: DescribeAccountAuditConfigurationResponse](x: Self) {
    
    inline def setAuditCheckConfigurations(value: AuditCheckConfigurations): Self = StObject.set(x, "auditCheckConfigurations", value.asInstanceOf[js.Any])
    
    inline def setAuditCheckConfigurationsUndefined: Self = StObject.set(x, "auditCheckConfigurations", js.undefined)
    
    inline def setAuditNotificationTargetConfigurations(value: AuditNotificationTargetConfigurations): Self = StObject.set(x, "auditNotificationTargetConfigurations", value.asInstanceOf[js.Any])
    
    inline def setAuditNotificationTargetConfigurationsUndefined: Self = StObject.set(x, "auditNotificationTargetConfigurations", js.undefined)
    
    inline def setRoleArn(value: RoleArn): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
    
    inline def setRoleArnUndefined: Self = StObject.set(x, "roleArn", js.undefined)
  }
}
