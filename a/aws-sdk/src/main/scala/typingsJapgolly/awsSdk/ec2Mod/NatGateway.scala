package typingsJapgolly.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NatGateway extends js.Object {
  /**
    * The date and time the NAT gateway was created.
    */
  var CreateTime: js.UndefOr[js.Date] = js.native
  /**
    * The date and time the NAT gateway was deleted, if applicable.
    */
  var DeleteTime: js.UndefOr[js.Date] = js.native
  /**
    * If the NAT gateway could not be created, specifies the error code for the failure. (InsufficientFreeAddressesInSubnet | Gateway.NotAttached | InvalidAllocationID.NotFound | Resource.AlreadyAssociated | InternalError | InvalidSubnetID.NotFound)
    */
  var FailureCode: js.UndefOr[String] = js.native
  /**
    * If the NAT gateway could not be created, specifies the error message for the failure, that corresponds to the error code.   For InsufficientFreeAddressesInSubnet: "Subnet has insufficient free addresses to create this NAT gateway"   For Gateway.NotAttached: "Network vpc-xxxxxxxx has no Internet gateway attached"   For InvalidAllocationID.NotFound: "Elastic IP address eipalloc-xxxxxxxx could not be associated with this NAT gateway"   For Resource.AlreadyAssociated: "Elastic IP address eipalloc-xxxxxxxx is already associated"   For InternalError: "Network interface eni-xxxxxxxx, created and used internally by this NAT gateway is in an invalid state. Please try again."   For InvalidSubnetID.NotFound: "The specified subnet subnet-xxxxxxxx does not exist or could not be found."  
    */
  var FailureMessage: js.UndefOr[String] = js.native
  /**
    * Information about the IP addresses and network interface associated with the NAT gateway.
    */
  var NatGatewayAddresses: js.UndefOr[NatGatewayAddressList] = js.native
  /**
    * The ID of the NAT gateway.
    */
  var NatGatewayId: js.UndefOr[String] = js.native
  /**
    * Reserved. If you need to sustain traffic greater than the documented limits, contact us through the Support Center.
    */
  var ProvisionedBandwidth: js.UndefOr[typingsJapgolly.awsSdk.ec2Mod.ProvisionedBandwidth] = js.native
  /**
    * The state of the NAT gateway.    pending: The NAT gateway is being created and is not ready to process traffic.    failed: The NAT gateway could not be created. Check the failureCode and failureMessage fields for the reason.    available: The NAT gateway is able to process traffic. This status remains until you delete the NAT gateway, and does not indicate the health of the NAT gateway.    deleting: The NAT gateway is in the process of being terminated and may still be processing traffic.    deleted: The NAT gateway has been terminated and is no longer processing traffic.  
    */
  var State: js.UndefOr[NatGatewayState] = js.native
  /**
    * The ID of the subnet in which the NAT gateway is located.
    */
  var SubnetId: js.UndefOr[String] = js.native
  /**
    * The tags for the NAT gateway.
    */
  var Tags: js.UndefOr[TagList] = js.native
  /**
    * The ID of the VPC in which the NAT gateway is located.
    */
  var VpcId: js.UndefOr[String] = js.native
}

object NatGateway {
  @scala.inline
  def apply(
    CreateTime: js.Date = null,
    DeleteTime: js.Date = null,
    FailureCode: String = null,
    FailureMessage: String = null,
    NatGatewayAddresses: NatGatewayAddressList = null,
    NatGatewayId: String = null,
    ProvisionedBandwidth: ProvisionedBandwidth = null,
    State: NatGatewayState = null,
    SubnetId: String = null,
    Tags: TagList = null,
    VpcId: String = null
  ): NatGateway = {
    val __obj = js.Dynamic.literal()
    if (CreateTime != null) __obj.updateDynamic("CreateTime")(CreateTime.asInstanceOf[js.Any])
    if (DeleteTime != null) __obj.updateDynamic("DeleteTime")(DeleteTime.asInstanceOf[js.Any])
    if (FailureCode != null) __obj.updateDynamic("FailureCode")(FailureCode.asInstanceOf[js.Any])
    if (FailureMessage != null) __obj.updateDynamic("FailureMessage")(FailureMessage.asInstanceOf[js.Any])
    if (NatGatewayAddresses != null) __obj.updateDynamic("NatGatewayAddresses")(NatGatewayAddresses.asInstanceOf[js.Any])
    if (NatGatewayId != null) __obj.updateDynamic("NatGatewayId")(NatGatewayId.asInstanceOf[js.Any])
    if (ProvisionedBandwidth != null) __obj.updateDynamic("ProvisionedBandwidth")(ProvisionedBandwidth.asInstanceOf[js.Any])
    if (State != null) __obj.updateDynamic("State")(State.asInstanceOf[js.Any])
    if (SubnetId != null) __obj.updateDynamic("SubnetId")(SubnetId.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    if (VpcId != null) __obj.updateDynamic("VpcId")(VpcId.asInstanceOf[js.Any])
    __obj.asInstanceOf[NatGateway]
  }
}

