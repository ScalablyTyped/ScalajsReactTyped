package typingsJapgolly.awsSdk.clientsFirehoseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VpcConfigurationDescription extends StObject {
  
  /**
    * The ARN of the IAM role that the delivery stream uses to create endpoints in the destination VPC. You can use your existing Kinesis Data Firehose delivery role or you can specify a new role. In either case, make sure that the role trusts the Kinesis Data Firehose service principal and that it grants the following permissions:    ec2:DescribeVpcs     ec2:DescribeVpcAttribute     ec2:DescribeSubnets     ec2:DescribeSecurityGroups     ec2:DescribeNetworkInterfaces     ec2:CreateNetworkInterface     ec2:CreateNetworkInterfacePermission     ec2:DeleteNetworkInterface    If you revoke these permissions after you create the delivery stream, Kinesis Data Firehose can't scale out by creating more ENIs when necessary. You might therefore see a degradation in performance.
    */
  var RoleARN: typingsJapgolly.awsSdk.clientsFirehoseMod.RoleARN
  
  /**
    * The IDs of the security groups that Kinesis Data Firehose uses when it creates ENIs in the VPC of the Amazon ES destination. You can use the same security group that the Amazon ES domain uses or different ones. If you specify different security groups, ensure that they allow outbound HTTPS traffic to the Amazon ES domain's security group. Also ensure that the Amazon ES domain's security group allows HTTPS traffic from the security groups specified here. If you use the same security group for both your delivery stream and the Amazon ES domain, make sure the security group inbound rule allows HTTPS traffic. For more information about security group rules, see Security group rules in the Amazon VPC documentation.
    */
  var SecurityGroupIds: SecurityGroupIdList
  
  /**
    * The IDs of the subnets that Kinesis Data Firehose uses to create ENIs in the VPC of the Amazon ES destination. Make sure that the routing tables and inbound and outbound rules allow traffic to flow from the subnets whose IDs are specified here to the subnets that have the destination Amazon ES endpoints. Kinesis Data Firehose creates at least one ENI in each of the subnets that are specified here. Do not delete or modify these ENIs. The number of ENIs that Kinesis Data Firehose creates in the subnets specified here scales up and down automatically based on throughput. To enable Kinesis Data Firehose to scale up the number of ENIs to match throughput, ensure that you have sufficient quota. To help you calculate the quota you need, assume that Kinesis Data Firehose can create up to three ENIs for this delivery stream for each of the subnets specified here. For more information about ENI quota, see Network Interfaces  in the Amazon VPC Quotas topic.
    */
  var SubnetIds: SubnetIdList
  
  /**
    * The ID of the Amazon ES destination's VPC.
    */
  var VpcId: NonEmptyStringWithoutWhitespace
}
object VpcConfigurationDescription {
  
  inline def apply(
    RoleARN: RoleARN,
    SecurityGroupIds: SecurityGroupIdList,
    SubnetIds: SubnetIdList,
    VpcId: NonEmptyStringWithoutWhitespace
  ): VpcConfigurationDescription = {
    val __obj = js.Dynamic.literal(RoleARN = RoleARN.asInstanceOf[js.Any], SecurityGroupIds = SecurityGroupIds.asInstanceOf[js.Any], SubnetIds = SubnetIds.asInstanceOf[js.Any], VpcId = VpcId.asInstanceOf[js.Any])
    __obj.asInstanceOf[VpcConfigurationDescription]
  }
  
  extension [Self <: VpcConfigurationDescription](x: Self) {
    
    inline def setRoleARN(value: RoleARN): Self = StObject.set(x, "RoleARN", value.asInstanceOf[js.Any])
    
    inline def setSecurityGroupIds(value: SecurityGroupIdList): Self = StObject.set(x, "SecurityGroupIds", value.asInstanceOf[js.Any])
    
    inline def setSecurityGroupIdsVarargs(value: NonEmptyStringWithoutWhitespace*): Self = StObject.set(x, "SecurityGroupIds", js.Array(value*))
    
    inline def setSubnetIds(value: SubnetIdList): Self = StObject.set(x, "SubnetIds", value.asInstanceOf[js.Any])
    
    inline def setSubnetIdsVarargs(value: NonEmptyStringWithoutWhitespace*): Self = StObject.set(x, "SubnetIds", js.Array(value*))
    
    inline def setVpcId(value: NonEmptyStringWithoutWhitespace): Self = StObject.set(x, "VpcId", value.asInstanceOf[js.Any])
  }
}
