package typingsJapgolly.awsSdk.clientsEventbridgeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NetworkConfiguration extends StObject {
  
  /**
    * Use this structure to specify the VPC subnets and security groups for the task, and whether a public IP address is to be used. This structure is relevant only for ECS tasks that use the awsvpc network mode.
    */
  var awsvpcConfiguration: js.UndefOr[AwsVpcConfiguration] = js.undefined
}
object NetworkConfiguration {
  
  inline def apply(): NetworkConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworkConfiguration]
  }
  
  extension [Self <: NetworkConfiguration](x: Self) {
    
    inline def setAwsvpcConfiguration(value: AwsVpcConfiguration): Self = StObject.set(x, "awsvpcConfiguration", value.asInstanceOf[js.Any])
    
    inline def setAwsvpcConfigurationUndefined: Self = StObject.set(x, "awsvpcConfiguration", js.undefined)
  }
}
