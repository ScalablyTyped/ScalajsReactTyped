package typingsJapgolly.awsSdk.clientsLambdaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VpcConfigResponse extends StObject {
  
  /**
    * A list of VPC security groups IDs.
    */
  var SecurityGroupIds: js.UndefOr[typingsJapgolly.awsSdk.clientsLambdaMod.SecurityGroupIds] = js.undefined
  
  /**
    * A list of VPC subnet IDs.
    */
  var SubnetIds: js.UndefOr[typingsJapgolly.awsSdk.clientsLambdaMod.SubnetIds] = js.undefined
  
  /**
    * The ID of the VPC.
    */
  var VpcId: js.UndefOr[typingsJapgolly.awsSdk.clientsLambdaMod.VpcId] = js.undefined
}
object VpcConfigResponse {
  
  inline def apply(): VpcConfigResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VpcConfigResponse]
  }
  
  extension [Self <: VpcConfigResponse](x: Self) {
    
    inline def setSecurityGroupIds(value: SecurityGroupIds): Self = StObject.set(x, "SecurityGroupIds", value.asInstanceOf[js.Any])
    
    inline def setSecurityGroupIdsUndefined: Self = StObject.set(x, "SecurityGroupIds", js.undefined)
    
    inline def setSecurityGroupIdsVarargs(value: SecurityGroupId*): Self = StObject.set(x, "SecurityGroupIds", js.Array(value*))
    
    inline def setSubnetIds(value: SubnetIds): Self = StObject.set(x, "SubnetIds", value.asInstanceOf[js.Any])
    
    inline def setSubnetIdsUndefined: Self = StObject.set(x, "SubnetIds", js.undefined)
    
    inline def setSubnetIdsVarargs(value: SubnetId*): Self = StObject.set(x, "SubnetIds", js.Array(value*))
    
    inline def setVpcId(value: VpcId): Self = StObject.set(x, "VpcId", value.asInstanceOf[js.Any])
    
    inline def setVpcIdUndefined: Self = StObject.set(x, "VpcId", js.undefined)
  }
}
