package typingsJapgolly.googleapis.v14Mod.adexchangebuyerV14

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaEditAllOrderDealsRequest extends js.Object {
  /**
    * List of deals to edit. Service may perform 3 different operations based
    * on comparison of deals in this list vs deals already persisted in
    * database: 1. Add new deal to proposal If a deal in this list does not
    * exist in the proposal, the service will create a new deal and add it to
    * the proposal. Validation will follow AddOrderDealsRequest. 2. Update
    * existing deal in the proposal If a deal in this list already exist in the
    * proposal, the service will update that existing deal to this new deal in
    * the request. Validation will follow UpdateOrderDealsRequest. 3. Delete
    * deals from the proposal (just need the id) If a existing deal in the
    * proposal is not present in this list, the service will delete that deal
    * from the proposal. Validation will follow DeleteOrderDealsRequest.
    */
  var deals: js.UndefOr[js.Array[SchemaMarketplaceDeal]] = js.native
  /**
    * If specified, also updates the proposal in the batch transaction. This is
    * useful when the proposal and the deals need to be updated in one
    * transaction.
    */
  var proposal: js.UndefOr[SchemaProposal] = js.native
  /**
    * The last known revision number for the proposal.
    */
  var proposalRevisionNumber: js.UndefOr[String] = js.native
  /**
    * Indicates an optional action to take on the proposal
    */
  var updateAction: js.UndefOr[String] = js.native
}

object SchemaEditAllOrderDealsRequest {
  @scala.inline
  def apply(
    deals: js.Array[SchemaMarketplaceDeal] = null,
    proposal: SchemaProposal = null,
    proposalRevisionNumber: String = null,
    updateAction: String = null
  ): SchemaEditAllOrderDealsRequest = {
    val __obj = js.Dynamic.literal()
    if (deals != null) __obj.updateDynamic("deals")(deals.asInstanceOf[js.Any])
    if (proposal != null) __obj.updateDynamic("proposal")(proposal.asInstanceOf[js.Any])
    if (proposalRevisionNumber != null) __obj.updateDynamic("proposalRevisionNumber")(proposalRevisionNumber.asInstanceOf[js.Any])
    if (updateAction != null) __obj.updateDynamic("updateAction")(updateAction.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaEditAllOrderDealsRequest]
  }
}

