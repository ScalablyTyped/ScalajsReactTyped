package typingsJapgolly.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CancelReservedInstancesListingRequest extends js.Object {
  /**
    * The ID of the Reserved Instance listing.
    */
  var ReservedInstancesListingId: typingsJapgolly.awsSdk.ec2Mod.ReservedInstancesListingId = js.native
}

object CancelReservedInstancesListingRequest {
  @scala.inline
  def apply(ReservedInstancesListingId: ReservedInstancesListingId): CancelReservedInstancesListingRequest = {
    val __obj = js.Dynamic.literal(ReservedInstancesListingId = ReservedInstancesListingId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CancelReservedInstancesListingRequest]
  }
}

