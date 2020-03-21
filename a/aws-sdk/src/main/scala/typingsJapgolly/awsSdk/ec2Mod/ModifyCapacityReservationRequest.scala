package typingsJapgolly.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifyCapacityReservationRequest extends js.Object {
  /**
    * The ID of the Capacity Reservation.
    */
  var CapacityReservationId: typingsJapgolly.awsSdk.ec2Mod.CapacityReservationId = js.native
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * The date and time at which the Capacity Reservation expires. When a Capacity Reservation expires, the reserved capacity is released and you can no longer launch instances into it. The Capacity Reservation's state changes to expired when it reaches its end date and time. The Capacity Reservation is cancelled within an hour from the specified time. For example, if you specify 5/31/2019, 13:30:55, the Capacity Reservation is guaranteed to end between 13:30:55 and 14:30:55 on 5/31/2019. You must provide an EndDate value if EndDateType is limited. Omit EndDate if EndDateType is unlimited.
    */
  var EndDate: js.UndefOr[js.Date] = js.native
  /**
    * Indicates the way in which the Capacity Reservation ends. A Capacity Reservation can have one of the following end types:    unlimited - The Capacity Reservation remains active until you explicitly cancel it. Do not provide an EndDate value if EndDateType is unlimited.    limited - The Capacity Reservation expires automatically at a specified date and time. You must provide an EndDate value if EndDateType is limited.  
    */
  var EndDateType: js.UndefOr[typingsJapgolly.awsSdk.ec2Mod.EndDateType] = js.native
  /**
    * The number of instances for which to reserve capacity.
    */
  var InstanceCount: js.UndefOr[Integer] = js.native
}

object ModifyCapacityReservationRequest {
  @scala.inline
  def apply(
    CapacityReservationId: CapacityReservationId,
    DryRun: js.UndefOr[scala.Boolean] = js.undefined,
    EndDate: js.Date = null,
    EndDateType: EndDateType = null,
    InstanceCount: Int | scala.Double = null
  ): ModifyCapacityReservationRequest = {
    val __obj = js.Dynamic.literal(CapacityReservationId = CapacityReservationId.asInstanceOf[js.Any])
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun.asInstanceOf[js.Any])
    if (EndDate != null) __obj.updateDynamic("EndDate")(EndDate.asInstanceOf[js.Any])
    if (EndDateType != null) __obj.updateDynamic("EndDateType")(EndDateType.asInstanceOf[js.Any])
    if (InstanceCount != null) __obj.updateDynamic("InstanceCount")(InstanceCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyCapacityReservationRequest]
  }
}

