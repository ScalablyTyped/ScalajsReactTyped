package typingsJapgolly.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CapacityReservationTarget extends js.Object {
  /**
    * The ID of the Capacity Reservation.
    */
  var CapacityReservationId: js.UndefOr[String] = js.native
}

object CapacityReservationTarget {
  @scala.inline
  def apply(CapacityReservationId: String = null): CapacityReservationTarget = {
    val __obj = js.Dynamic.literal()
    if (CapacityReservationId != null) __obj.updateDynamic("CapacityReservationId")(CapacityReservationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CapacityReservationTarget]
  }
}

