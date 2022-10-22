package typingsJapgolly.awsSdk.clientsSsoadminMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateInstanceAccessControlAttributeConfigurationRequest extends StObject {
  
  /**
    * Updates the attributes for your ABAC configuration.
    */
  var InstanceAccessControlAttributeConfiguration: typingsJapgolly.awsSdk.clientsSsoadminMod.InstanceAccessControlAttributeConfiguration
  
  /**
    * The ARN of the IAM Identity Center instance under which the operation will be executed.
    */
  var InstanceArn: typingsJapgolly.awsSdk.clientsSsoadminMod.InstanceArn
}
object UpdateInstanceAccessControlAttributeConfigurationRequest {
  
  inline def apply(
    InstanceAccessControlAttributeConfiguration: InstanceAccessControlAttributeConfiguration,
    InstanceArn: InstanceArn
  ): UpdateInstanceAccessControlAttributeConfigurationRequest = {
    val __obj = js.Dynamic.literal(InstanceAccessControlAttributeConfiguration = InstanceAccessControlAttributeConfiguration.asInstanceOf[js.Any], InstanceArn = InstanceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateInstanceAccessControlAttributeConfigurationRequest]
  }
  
  extension [Self <: UpdateInstanceAccessControlAttributeConfigurationRequest](x: Self) {
    
    inline def setInstanceAccessControlAttributeConfiguration(value: InstanceAccessControlAttributeConfiguration): Self = StObject.set(x, "InstanceAccessControlAttributeConfiguration", value.asInstanceOf[js.Any])
    
    inline def setInstanceArn(value: InstanceArn): Self = StObject.set(x, "InstanceArn", value.asInstanceOf[js.Any])
  }
}
