package typingsJapgolly.awsSdk.clientsNetworkfirewallMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeResourcePolicyRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the rule group or firewall policy whose resource policy you want to retrieve. 
    */
  var ResourceArn: typingsJapgolly.awsSdk.clientsNetworkfirewallMod.ResourceArn
}
object DescribeResourcePolicyRequest {
  
  inline def apply(ResourceArn: ResourceArn): DescribeResourcePolicyRequest = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeResourcePolicyRequest]
  }
  
  extension [Self <: DescribeResourcePolicyRequest](x: Self) {
    
    inline def setResourceArn(value: ResourceArn): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
  }
}
