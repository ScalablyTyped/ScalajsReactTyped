package typingsJapgolly.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RevokeSecurityGroupEgressRequest extends StObject {
  
  /**
    * Not supported. Use a set of IP permissions to specify the CIDR.
    */
  var CidrIp: js.UndefOr[String] = js.undefined
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Not supported. Use a set of IP permissions to specify the port.
    */
  var FromPort: js.UndefOr[Integer] = js.undefined
  
  /**
    * The ID of the security group.
    */
  var GroupId: SecurityGroupId
  
  /**
    * The sets of IP permissions. You can't specify a destination security group and a CIDR IP address range in the same set of permissions.
    */
  var IpPermissions: js.UndefOr[IpPermissionList] = js.undefined
  
  /**
    * Not supported. Use a set of IP permissions to specify the protocol name or number.
    */
  var IpProtocol: js.UndefOr[String] = js.undefined
  
  /**
    * The IDs of the security group rules.
    */
  var SecurityGroupRuleIds: js.UndefOr[SecurityGroupRuleIdList] = js.undefined
  
  /**
    * Not supported. Use a set of IP permissions to specify a destination security group.
    */
  var SourceSecurityGroupName: js.UndefOr[String] = js.undefined
  
  /**
    * Not supported. Use a set of IP permissions to specify a destination security group.
    */
  var SourceSecurityGroupOwnerId: js.UndefOr[String] = js.undefined
  
  /**
    * Not supported. Use a set of IP permissions to specify the port.
    */
  var ToPort: js.UndefOr[Integer] = js.undefined
}
object RevokeSecurityGroupEgressRequest {
  
  inline def apply(GroupId: SecurityGroupId): RevokeSecurityGroupEgressRequest = {
    val __obj = js.Dynamic.literal(GroupId = GroupId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RevokeSecurityGroupEgressRequest]
  }
  
  extension [Self <: RevokeSecurityGroupEgressRequest](x: Self) {
    
    inline def setCidrIp(value: String): Self = StObject.set(x, "CidrIp", value.asInstanceOf[js.Any])
    
    inline def setCidrIpUndefined: Self = StObject.set(x, "CidrIp", js.undefined)
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setFromPort(value: Integer): Self = StObject.set(x, "FromPort", value.asInstanceOf[js.Any])
    
    inline def setFromPortUndefined: Self = StObject.set(x, "FromPort", js.undefined)
    
    inline def setGroupId(value: SecurityGroupId): Self = StObject.set(x, "GroupId", value.asInstanceOf[js.Any])
    
    inline def setIpPermissions(value: IpPermissionList): Self = StObject.set(x, "IpPermissions", value.asInstanceOf[js.Any])
    
    inline def setIpPermissionsUndefined: Self = StObject.set(x, "IpPermissions", js.undefined)
    
    inline def setIpPermissionsVarargs(value: IpPermission*): Self = StObject.set(x, "IpPermissions", js.Array(value*))
    
    inline def setIpProtocol(value: String): Self = StObject.set(x, "IpProtocol", value.asInstanceOf[js.Any])
    
    inline def setIpProtocolUndefined: Self = StObject.set(x, "IpProtocol", js.undefined)
    
    inline def setSecurityGroupRuleIds(value: SecurityGroupRuleIdList): Self = StObject.set(x, "SecurityGroupRuleIds", value.asInstanceOf[js.Any])
    
    inline def setSecurityGroupRuleIdsUndefined: Self = StObject.set(x, "SecurityGroupRuleIds", js.undefined)
    
    inline def setSecurityGroupRuleIdsVarargs(value: String*): Self = StObject.set(x, "SecurityGroupRuleIds", js.Array(value*))
    
    inline def setSourceSecurityGroupName(value: String): Self = StObject.set(x, "SourceSecurityGroupName", value.asInstanceOf[js.Any])
    
    inline def setSourceSecurityGroupNameUndefined: Self = StObject.set(x, "SourceSecurityGroupName", js.undefined)
    
    inline def setSourceSecurityGroupOwnerId(value: String): Self = StObject.set(x, "SourceSecurityGroupOwnerId", value.asInstanceOf[js.Any])
    
    inline def setSourceSecurityGroupOwnerIdUndefined: Self = StObject.set(x, "SourceSecurityGroupOwnerId", js.undefined)
    
    inline def setToPort(value: Integer): Self = StObject.set(x, "ToPort", value.asInstanceOf[js.Any])
    
    inline def setToPortUndefined: Self = StObject.set(x, "ToPort", js.undefined)
  }
}
