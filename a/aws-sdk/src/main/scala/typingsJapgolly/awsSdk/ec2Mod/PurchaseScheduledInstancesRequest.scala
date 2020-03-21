package typingsJapgolly.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PurchaseScheduledInstancesRequest extends js.Object {
  /**
    * Unique, case-sensitive identifier that ensures the idempotency of the request. For more information, see Ensuring Idempotency.
    */
  var ClientToken: js.UndefOr[String] = js.native
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * The purchase requests.
    */
  var PurchaseRequests: PurchaseRequestSet = js.native
}

object PurchaseScheduledInstancesRequest {
  @scala.inline
  def apply(
    PurchaseRequests: PurchaseRequestSet,
    ClientToken: String = null,
    DryRun: js.UndefOr[scala.Boolean] = js.undefined
  ): PurchaseScheduledInstancesRequest = {
    val __obj = js.Dynamic.literal(PurchaseRequests = PurchaseRequests.asInstanceOf[js.Any])
    if (ClientToken != null) __obj.updateDynamic("ClientToken")(ClientToken.asInstanceOf[js.Any])
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun.asInstanceOf[js.Any])
    __obj.asInstanceOf[PurchaseScheduledInstancesRequest]
  }
}

