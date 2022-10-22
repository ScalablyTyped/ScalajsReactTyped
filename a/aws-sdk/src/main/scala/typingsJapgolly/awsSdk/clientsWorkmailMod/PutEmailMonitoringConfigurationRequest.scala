package typingsJapgolly.awsSdk.clientsWorkmailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutEmailMonitoringConfigurationRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the CloudWatch Log group associated with the email monitoring configuration.
    */
  var LogGroupArn: typingsJapgolly.awsSdk.clientsWorkmailMod.LogGroupArn
  
  /**
    * The ID of the organization for which the email monitoring configuration is set.
    */
  var OrganizationId: typingsJapgolly.awsSdk.clientsWorkmailMod.OrganizationId
  
  /**
    * The Amazon Resource Name (ARN) of the IAM Role associated with the email monitoring configuration.
    */
  var RoleArn: typingsJapgolly.awsSdk.clientsWorkmailMod.RoleArn
}
object PutEmailMonitoringConfigurationRequest {
  
  inline def apply(LogGroupArn: LogGroupArn, OrganizationId: OrganizationId, RoleArn: RoleArn): PutEmailMonitoringConfigurationRequest = {
    val __obj = js.Dynamic.literal(LogGroupArn = LogGroupArn.asInstanceOf[js.Any], OrganizationId = OrganizationId.asInstanceOf[js.Any], RoleArn = RoleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutEmailMonitoringConfigurationRequest]
  }
  
  extension [Self <: PutEmailMonitoringConfigurationRequest](x: Self) {
    
    inline def setLogGroupArn(value: LogGroupArn): Self = StObject.set(x, "LogGroupArn", value.asInstanceOf[js.Any])
    
    inline def setOrganizationId(value: OrganizationId): Self = StObject.set(x, "OrganizationId", value.asInstanceOf[js.Any])
    
    inline def setRoleArn(value: RoleArn): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
  }
}
