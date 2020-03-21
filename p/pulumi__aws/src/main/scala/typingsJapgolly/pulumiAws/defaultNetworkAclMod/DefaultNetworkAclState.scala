package typingsJapgolly.pulumiAws.defaultNetworkAclMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.pulumiAws.inputMod.ec2.DefaultNetworkAclEgress
import typingsJapgolly.pulumiAws.inputMod.ec2.DefaultNetworkAclIngress
import typingsJapgolly.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DefaultNetworkAclState extends js.Object {
  /**
    * The Network ACL ID to manage. This
    * attribute is exported from `aws.ec2.Vpc`, or manually found via the AWS Console.
    */
  val defaultNetworkAclId: js.UndefOr[Input[String]] = js.native
  /**
    * Specifies an egress rule. Parameters defined below.
    */
  val egress: js.UndefOr[Input[js.Array[Input[DefaultNetworkAclEgress]]]] = js.native
  /**
    * Specifies an ingress rule. Parameters defined below.
    */
  val ingress: js.UndefOr[Input[js.Array[Input[DefaultNetworkAclIngress]]]] = js.native
  /**
    * The ID of the AWS account that owns the Default Network ACL
    */
  val ownerId: js.UndefOr[Input[String]] = js.native
  /**
    * A list of Subnet IDs to apply the ACL to. See the
    * notes below on managing Subnets in the Default Network ACL
    */
  val subnetIds: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
  /**
    * The ID of the associated VPC
    */
  val vpcId: js.UndefOr[Input[String]] = js.native
}

object DefaultNetworkAclState {
  @scala.inline
  def apply(
    defaultNetworkAclId: Input[String] = null,
    egress: Input[js.Array[Input[DefaultNetworkAclEgress]]] = null,
    ingress: Input[js.Array[Input[DefaultNetworkAclIngress]]] = null,
    ownerId: Input[String] = null,
    subnetIds: Input[js.Array[Input[String]]] = null,
    tags: Input[StringDictionary[_]] = null,
    vpcId: Input[String] = null
  ): DefaultNetworkAclState = {
    val __obj = js.Dynamic.literal()
    if (defaultNetworkAclId != null) __obj.updateDynamic("defaultNetworkAclId")(defaultNetworkAclId.asInstanceOf[js.Any])
    if (egress != null) __obj.updateDynamic("egress")(egress.asInstanceOf[js.Any])
    if (ingress != null) __obj.updateDynamic("ingress")(ingress.asInstanceOf[js.Any])
    if (ownerId != null) __obj.updateDynamic("ownerId")(ownerId.asInstanceOf[js.Any])
    if (subnetIds != null) __obj.updateDynamic("subnetIds")(subnetIds.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (vpcId != null) __obj.updateDynamic("vpcId")(vpcId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultNetworkAclState]
  }
}

