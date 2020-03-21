package typingsJapgolly.awsSdkClientLambdaNode.typesVpcConfigResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VpcConfigResponse extends js.Object {
  /**
    * <p>A list of VPC security groups IDs.</p>
    */
  var SecurityGroupIds: js.UndefOr[js.Array[String] | js.Iterable[String]] = js.undefined
  /**
    * <p>A list of VPC subnet IDs.</p>
    */
  var SubnetIds: js.UndefOr[js.Array[String] | js.Iterable[String]] = js.undefined
  /**
    * <p>The ID of the VPC.</p>
    */
  var VpcId: js.UndefOr[String] = js.undefined
}

object VpcConfigResponse {
  @scala.inline
  def apply(
    SecurityGroupIds: js.Array[String] | js.Iterable[String] = null,
    SubnetIds: js.Array[String] | js.Iterable[String] = null,
    VpcId: String = null
  ): VpcConfigResponse = {
    val __obj = js.Dynamic.literal()
    if (SecurityGroupIds != null) __obj.updateDynamic("SecurityGroupIds")(SecurityGroupIds.asInstanceOf[js.Any])
    if (SubnetIds != null) __obj.updateDynamic("SubnetIds")(SubnetIds.asInstanceOf[js.Any])
    if (VpcId != null) __obj.updateDynamic("VpcId")(VpcId.asInstanceOf[js.Any])
    __obj.asInstanceOf[VpcConfigResponse]
  }
}

