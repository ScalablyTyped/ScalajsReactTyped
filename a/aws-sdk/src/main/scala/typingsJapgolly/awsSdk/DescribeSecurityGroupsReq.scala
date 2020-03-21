package typingsJapgolly.awsSdk

import typingsJapgolly.awsSdk.ec2Mod.Boolean
import typingsJapgolly.awsSdk.ec2Mod.DescribeSecurityGroupsMaxResults
import typingsJapgolly.awsSdk.ec2Mod.FilterList
import typingsJapgolly.awsSdk.ec2Mod.GroupIdStringList
import typingsJapgolly.awsSdk.ec2Mod.GroupNameStringList
import typingsJapgolly.awsSdk.ec2Mod.String
import typingsJapgolly.awsSdk.serviceMod.WaiterConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined aws-sdk.aws-sdk/clients/ec2.DescribeSecurityGroupsRequest & {  $waiter ? :aws-sdk.aws-sdk/lib/service.WaiterConfiguration} */
@js.native
trait DescribeSecurityGroupsReq extends js.Object {
  @JSName("$waiter")
  var $waiter: js.UndefOr[WaiterConfiguration] = js.native
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * The filters. If using multiple filters for rules, the results include security groups for which any combination of rules - not necessarily a single rule - match all filters.    description - The description of the security group.    egress.ip-permission.cidr - An IPv4 CIDR block for an outbound security group rule.    egress.ip-permission.from-port - For an outbound rule, the start of port range for the TCP and UDP protocols, or an ICMP type number.    egress.ip-permission.group-id - The ID of a security group that has been referenced in an outbound security group rule.    egress.ip-permission.group-name - The name of a security group that has been referenced in an outbound security group rule.    egress.ip-permission.ipv6-cidr - An IPv6 CIDR block for an outbound security group rule.    egress.ip-permission.prefix-list-id - The ID (prefix) of the AWS service to which a security group rule allows outbound access.    egress.ip-permission.protocol - The IP protocol for an outbound security group rule (tcp | udp | icmp or a protocol number).    egress.ip-permission.to-port - For an outbound rule, the end of port range for the TCP and UDP protocols, or an ICMP code.    egress.ip-permission.user-id - The ID of an AWS account that has been referenced in an outbound security group rule.    group-id - The ID of the security group.     group-name - The name of the security group.    ip-permission.cidr - An IPv4 CIDR block for an inbound security group rule.    ip-permission.from-port - For an inbound rule, the start of port range for the TCP and UDP protocols, or an ICMP type number.    ip-permission.group-id - The ID of a security group that has been referenced in an inbound security group rule.    ip-permission.group-name - The name of a security group that has been referenced in an inbound security group rule.    ip-permission.ipv6-cidr - An IPv6 CIDR block for an inbound security group rule.    ip-permission.prefix-list-id - The ID (prefix) of the AWS service from which a security group rule allows inbound access.    ip-permission.protocol - The IP protocol for an inbound security group rule (tcp | udp | icmp or a protocol number).    ip-permission.to-port - For an inbound rule, the end of port range for the TCP and UDP protocols, or an ICMP code.    ip-permission.user-id - The ID of an AWS account that has been referenced in an inbound security group rule.    owner-id - The AWS account ID of the owner of the security group.    tag:&lt;key&gt; - The key/value combination of a tag assigned to the resource. Use the tag key in the filter name and the tag value as the filter value. For example, to find all resources that have a tag with the key Owner and the value TeamA, specify tag:Owner for the filter name and TeamA for the filter value.    tag-key - The key of a tag assigned to the resource. Use this filter to find all resources assigned a tag with a specific key, regardless of the tag value.    vpc-id - The ID of the VPC specified when the security group was created.  
    */
  var Filters: js.UndefOr[FilterList] = js.native
  /**
    * The IDs of the security groups. Required for security groups in a nondefault VPC. Default: Describes all your security groups.
    */
  var GroupIds: js.UndefOr[GroupIdStringList] = js.native
  /**
    * [EC2-Classic and default VPC only] The names of the security groups. You can specify either the security group name or the security group ID. For security groups in a nondefault VPC, use the group-name filter to describe security groups by name. Default: Describes all your security groups.
    */
  var GroupNames: js.UndefOr[GroupNameStringList] = js.native
  /**
    * The maximum number of results to return in a single call. To retrieve the remaining results, make another request with the returned NextToken value. This value can be between 5 and 1000. If this parameter is not specified, then all results are returned.
    */
  var MaxResults: js.UndefOr[DescribeSecurityGroupsMaxResults] = js.native
  /**
    * The token to request the next page of results.
    */
  var NextToken: js.UndefOr[String] = js.native
}

