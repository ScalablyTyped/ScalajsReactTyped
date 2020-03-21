package typingsJapgolly.awsSdk.managedblockchainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApprovalThresholdPolicy extends js.Object {
  /**
    * The duration from the time that a proposal is created until it expires. If members cast neither the required number of YES votes to approve the proposal nor the number of NO votes required to reject it before the duration expires, the proposal is EXPIRED and ProposalActions are not carried out.
    */
  var ProposalDurationInHours: js.UndefOr[ProposalDurationInt] = js.native
  /**
    * Determines whether the vote percentage must be greater than the ThresholdPercentage or must be greater than or equal to the ThreholdPercentage to be approved.
    */
  var ThresholdComparator: js.UndefOr[typingsJapgolly.awsSdk.managedblockchainMod.ThresholdComparator] = js.native
  /**
    * The percentage of votes among all members that must be YES for a proposal to be approved. For example, a ThresholdPercentage value of 50 indicates 50%. The ThresholdComparator determines the precise comparison. If a ThresholdPercentage value of 50 is specified on a network with 10 members, along with a ThresholdComparator value of GREATER_THAN, this indicates that 6 YES votes are required for the proposal to be approved.
    */
  var ThresholdPercentage: js.UndefOr[ThresholdPercentageInt] = js.native
}

object ApprovalThresholdPolicy {
  @scala.inline
  def apply(
    ProposalDurationInHours: Int | Double = null,
    ThresholdComparator: ThresholdComparator = null,
    ThresholdPercentage: Int | Double = null
  ): ApprovalThresholdPolicy = {
    val __obj = js.Dynamic.literal()
    if (ProposalDurationInHours != null) __obj.updateDynamic("ProposalDurationInHours")(ProposalDurationInHours.asInstanceOf[js.Any])
    if (ThresholdComparator != null) __obj.updateDynamic("ThresholdComparator")(ThresholdComparator.asInstanceOf[js.Any])
    if (ThresholdPercentage != null) __obj.updateDynamic("ThresholdPercentage")(ThresholdPercentage.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApprovalThresholdPolicy]
  }
}

