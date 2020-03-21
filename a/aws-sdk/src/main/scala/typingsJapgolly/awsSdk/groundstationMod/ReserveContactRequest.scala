package typingsJapgolly.awsSdk.groundstationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReserveContactRequest extends js.Object {
  /**
    * End time of a contact.
    */
  var endTime: js.Date = js.native
  /**
    * Name of a ground station.
    */
  var groundStation: String = js.native
  /**
    * ARN of a mission profile.
    */
  var missionProfileArn: MissionProfileArn = js.native
  /**
    * ARN of a satellite
    */
  var satelliteArn: typingsJapgolly.awsSdk.groundstationMod.satelliteArn = js.native
  /**
    * Start time of a contact.
    */
  var startTime: js.Date = js.native
  /**
    * Tags assigned to a contact.
    */
  var tags: js.UndefOr[TagsMap] = js.native
}

object ReserveContactRequest {
  @scala.inline
  def apply(
    endTime: js.Date,
    groundStation: String,
    missionProfileArn: MissionProfileArn,
    satelliteArn: satelliteArn,
    startTime: js.Date,
    tags: TagsMap = null
  ): ReserveContactRequest = {
    val __obj = js.Dynamic.literal(endTime = endTime.asInstanceOf[js.Any], groundStation = groundStation.asInstanceOf[js.Any], missionProfileArn = missionProfileArn.asInstanceOf[js.Any], satelliteArn = satelliteArn.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReserveContactRequest]
  }
}

