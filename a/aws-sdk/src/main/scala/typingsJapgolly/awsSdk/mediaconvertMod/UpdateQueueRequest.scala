package typingsJapgolly.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateQueueRequest extends js.Object {
  /**
    * The new description for the queue, if you are changing it.
    */
  var Description: js.UndefOr[string] = js.native
  /**
    * The name of the queue that you are modifying.
    */
  var Name: string = js.native
  /**
    * The new details of your pricing plan for your reserved queue. When you set up a new pricing plan to replace an expired one, you enter into another 12-month commitment. When you add capacity to your queue by increasing the number of RTS, you extend the term of your commitment to 12 months from when you add capacity. After you make these commitments, you can't cancel them.
    */
  var ReservationPlanSettings: js.UndefOr[typingsJapgolly.awsSdk.mediaconvertMod.ReservationPlanSettings] = js.native
  /**
    * Pause or activate a queue by changing its status between ACTIVE and PAUSED. If you pause a queue, jobs in that queue won't begin. Jobs that are running when you pause the queue continue to run until they finish or result in an error.
    */
  var Status: js.UndefOr[QueueStatus] = js.native
}

object UpdateQueueRequest {
  @scala.inline
  def apply(
    Name: string,
    Description: string = null,
    ReservationPlanSettings: ReservationPlanSettings = null,
    Status: QueueStatus = null
  ): UpdateQueueRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (ReservationPlanSettings != null) __obj.updateDynamic("ReservationPlanSettings")(ReservationPlanSettings.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateQueueRequest]
  }
}

