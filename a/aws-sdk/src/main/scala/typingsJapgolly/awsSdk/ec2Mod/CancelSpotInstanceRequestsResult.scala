package typingsJapgolly.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CancelSpotInstanceRequestsResult extends js.Object {
  /**
    * One or more Spot Instance requests.
    */
  var CancelledSpotInstanceRequests: js.UndefOr[CancelledSpotInstanceRequestList] = js.native
}

object CancelSpotInstanceRequestsResult {
  @scala.inline
  def apply(CancelledSpotInstanceRequests: CancelledSpotInstanceRequestList = null): CancelSpotInstanceRequestsResult = {
    val __obj = js.Dynamic.literal()
    if (CancelledSpotInstanceRequests != null) __obj.updateDynamic("CancelledSpotInstanceRequests")(CancelledSpotInstanceRequests.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelSpotInstanceRequestsResult]
  }
}

