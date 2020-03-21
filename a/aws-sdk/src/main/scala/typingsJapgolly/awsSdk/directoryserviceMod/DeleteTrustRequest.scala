package typingsJapgolly.awsSdk.directoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteTrustRequest extends js.Object {
  /**
    * Delete a conditional forwarder as part of a DeleteTrustRequest.
    */
  var DeleteAssociatedConditionalForwarder: js.UndefOr[typingsJapgolly.awsSdk.directoryserviceMod.DeleteAssociatedConditionalForwarder] = js.native
  /**
    * The Trust ID of the trust relationship to be deleted.
    */
  var TrustId: typingsJapgolly.awsSdk.directoryserviceMod.TrustId = js.native
}

object DeleteTrustRequest {
  @scala.inline
  def apply(TrustId: TrustId, DeleteAssociatedConditionalForwarder: js.UndefOr[Boolean] = js.undefined): DeleteTrustRequest = {
    val __obj = js.Dynamic.literal(TrustId = TrustId.asInstanceOf[js.Any])
    if (!js.isUndefined(DeleteAssociatedConditionalForwarder)) __obj.updateDynamic("DeleteAssociatedConditionalForwarder")(DeleteAssociatedConditionalForwarder.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteTrustRequest]
  }
}

