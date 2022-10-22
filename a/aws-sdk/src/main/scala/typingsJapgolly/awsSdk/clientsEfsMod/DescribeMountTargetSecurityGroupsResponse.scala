package typingsJapgolly.awsSdk.clientsEfsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeMountTargetSecurityGroupsResponse extends StObject {
  
  /**
    * An array of security groups.
    */
  var SecurityGroups: typingsJapgolly.awsSdk.clientsEfsMod.SecurityGroups
}
object DescribeMountTargetSecurityGroupsResponse {
  
  inline def apply(SecurityGroups: SecurityGroups): DescribeMountTargetSecurityGroupsResponse = {
    val __obj = js.Dynamic.literal(SecurityGroups = SecurityGroups.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeMountTargetSecurityGroupsResponse]
  }
  
  extension [Self <: DescribeMountTargetSecurityGroupsResponse](x: Self) {
    
    inline def setSecurityGroups(value: SecurityGroups): Self = StObject.set(x, "SecurityGroups", value.asInstanceOf[js.Any])
    
    inline def setSecurityGroupsVarargs(value: SecurityGroup*): Self = StObject.set(x, "SecurityGroups", js.Array(value*))
  }
}
