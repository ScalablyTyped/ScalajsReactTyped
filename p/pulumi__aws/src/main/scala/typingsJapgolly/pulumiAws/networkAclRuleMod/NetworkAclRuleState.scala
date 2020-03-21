package typingsJapgolly.pulumiAws.networkAclRuleMod

import typingsJapgolly.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NetworkAclRuleState extends js.Object {
  /**
    * The network range to allow or deny, in CIDR notation (for example 172.16.0.0/24 ).
    */
  val cidrBlock: js.UndefOr[Input[String]] = js.native
  /**
    * Indicates whether this is an egress rule (rule is applied to traffic leaving the subnet). Default `false`.
    */
  val egress: js.UndefOr[Input[Boolean]] = js.native
  /**
    * The from port to match.
    */
  val fromPort: js.UndefOr[Input[Double]] = js.native
  /**
    * ICMP protocol: The ICMP code. Required if specifying ICMP for the protocol. e.g. -1
    */
  val icmpCode: js.UndefOr[Input[String]] = js.native
  /**
    * ICMP protocol: The ICMP type. Required if specifying ICMP for the protocol. e.g. -1
    */
  val icmpType: js.UndefOr[Input[String]] = js.native
  /**
    * The IPv6 CIDR block to allow or deny.
    */
  val ipv6CidrBlock: js.UndefOr[Input[String]] = js.native
  /**
    * The ID of the network ACL.
    */
  val networkAclId: js.UndefOr[Input[String]] = js.native
  /**
    * The protocol. A value of -1 means all protocols.
    */
  val protocol: js.UndefOr[Input[String]] = js.native
  /**
    * Indicates whether to allow or deny the traffic that matches the rule. Accepted values: `allow` | `deny`
    */
  val ruleAction: js.UndefOr[Input[String]] = js.native
  /**
    * The rule number for the entry (for example, 100). ACL entries are processed in ascending order by rule number.
    */
  val ruleNumber: js.UndefOr[Input[Double]] = js.native
  /**
    * The to port to match.
    */
  val toPort: js.UndefOr[Input[Double]] = js.native
}

object NetworkAclRuleState {
  @scala.inline
  def apply(
    cidrBlock: Input[String] = null,
    egress: Input[Boolean] = null,
    fromPort: Input[Double] = null,
    icmpCode: Input[String] = null,
    icmpType: Input[String] = null,
    ipv6CidrBlock: Input[String] = null,
    networkAclId: Input[String] = null,
    protocol: Input[String] = null,
    ruleAction: Input[String] = null,
    ruleNumber: Input[Double] = null,
    toPort: Input[Double] = null
  ): NetworkAclRuleState = {
    val __obj = js.Dynamic.literal()
    if (cidrBlock != null) __obj.updateDynamic("cidrBlock")(cidrBlock.asInstanceOf[js.Any])
    if (egress != null) __obj.updateDynamic("egress")(egress.asInstanceOf[js.Any])
    if (fromPort != null) __obj.updateDynamic("fromPort")(fromPort.asInstanceOf[js.Any])
    if (icmpCode != null) __obj.updateDynamic("icmpCode")(icmpCode.asInstanceOf[js.Any])
    if (icmpType != null) __obj.updateDynamic("icmpType")(icmpType.asInstanceOf[js.Any])
    if (ipv6CidrBlock != null) __obj.updateDynamic("ipv6CidrBlock")(ipv6CidrBlock.asInstanceOf[js.Any])
    if (networkAclId != null) __obj.updateDynamic("networkAclId")(networkAclId.asInstanceOf[js.Any])
    if (protocol != null) __obj.updateDynamic("protocol")(protocol.asInstanceOf[js.Any])
    if (ruleAction != null) __obj.updateDynamic("ruleAction")(ruleAction.asInstanceOf[js.Any])
    if (ruleNumber != null) __obj.updateDynamic("ruleNumber")(ruleNumber.asInstanceOf[js.Any])
    if (toPort != null) __obj.updateDynamic("toPort")(toPort.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetworkAclRuleState]
  }
}

