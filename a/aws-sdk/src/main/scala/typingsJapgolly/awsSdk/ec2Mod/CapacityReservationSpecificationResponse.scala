package typingsJapgolly.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CapacityReservationSpecificationResponse extends js.Object {
  /**
    * Describes the instance's Capacity Reservation preferences. Possible preferences include:    open - The instance can run in any open Capacity Reservation that has matching attributes (instance type, platform, Availability Zone).    none - The instance avoids running in a Capacity Reservation even if one is available. The instance runs in On-Demand capacity.  
    */
  var CapacityReservationPreference: js.UndefOr[typingsJapgolly.awsSdk.ec2Mod.CapacityReservationPreference] = js.native
  /**
    * Information about the targeted Capacity Reservation.
    */
  var CapacityReservationTarget: js.UndefOr[CapacityReservationTargetResponse] = js.native
}

object CapacityReservationSpecificationResponse {
  @scala.inline
  def apply(
    CapacityReservationPreference: CapacityReservationPreference = null,
    CapacityReservationTarget: CapacityReservationTargetResponse = null
  ): CapacityReservationSpecificationResponse = {
    val __obj = js.Dynamic.literal()
    if (CapacityReservationPreference != null) __obj.updateDynamic("CapacityReservationPreference")(CapacityReservationPreference.asInstanceOf[js.Any])
    if (CapacityReservationTarget != null) __obj.updateDynamic("CapacityReservationTarget")(CapacityReservationTarget.asInstanceOf[js.Any])
    __obj.asInstanceOf[CapacityReservationSpecificationResponse]
  }
}

