package typingsJapgolly.pulumiAws.resolverEndpointMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.pulumiAws.inputMod.route53.ResolverEndpointIpAddress
import typingsJapgolly.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResolverEndpointState extends js.Object {
  /**
    * The ARN of the Route 53 Resolver endpoint.
    */
  val arn: js.UndefOr[Input[String]] = js.native
  /**
    * The direction of DNS queries to or from the Route 53 Resolver endpoint.
    * Valid values are `INBOUND` (resolver forwards DNS queries to the DNS service for a VPC from your network or another VPC)
    * or `OUTBOUND` (resolver forwards DNS queries from the DNS service for a VPC to your network or another VPC).
    */
  val direction: js.UndefOr[Input[String]] = js.native
  /**
    * The ID of the VPC that you want to create the resolver endpoint in.
    */
  val hostVpcId: js.UndefOr[Input[String]] = js.native
  /**
    * The subnets and IP addresses in your VPC that you want DNS queries to pass through on the way from your VPCs
    * to your network (for outbound endpoints) or on the way from your network to your VPCs (for inbound endpoints). Described below.
    */
  val ipAddresses: js.UndefOr[Input[js.Array[Input[ResolverEndpointIpAddress]]]] = js.native
  /**
    * The friendly name of the Route 53 Resolver endpoint.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * The ID of one or more security groups that you want to use to control access to this VPC.
    */
  val securityGroupIds: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
}

object ResolverEndpointState {
  @scala.inline
  def apply(
    arn: Input[String] = null,
    direction: Input[String] = null,
    hostVpcId: Input[String] = null,
    ipAddresses: Input[js.Array[Input[ResolverEndpointIpAddress]]] = null,
    name: Input[String] = null,
    securityGroupIds: Input[js.Array[Input[String]]] = null,
    tags: Input[StringDictionary[_]] = null
  ): ResolverEndpointState = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (hostVpcId != null) __obj.updateDynamic("hostVpcId")(hostVpcId.asInstanceOf[js.Any])
    if (ipAddresses != null) __obj.updateDynamic("ipAddresses")(ipAddresses.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (securityGroupIds != null) __obj.updateDynamic("securityGroupIds")(securityGroupIds.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolverEndpointState]
  }
}

