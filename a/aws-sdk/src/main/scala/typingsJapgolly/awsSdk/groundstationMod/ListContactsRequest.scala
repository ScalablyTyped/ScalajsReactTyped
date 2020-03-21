package typingsJapgolly.awsSdk.groundstationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListContactsRequest extends js.Object {
  /**
    * End time of a contact.
    */
  var endTime: js.Date = js.native
  /**
    * Name of a ground station.
    */
  var groundStation: js.UndefOr[String] = js.native
  /**
    * Maximum number of contacts returned.
    */
  var maxResults: js.UndefOr[Integer] = js.native
  /**
    * ARN of a mission profile.
    */
  var missionProfileArn: js.UndefOr[MissionProfileArn] = js.native
  /**
    * Next token returned in the request of a previous ListContacts call. Used to get the next page of results.
    */
  var nextToken: js.UndefOr[String] = js.native
  /**
    * ARN of a satellite.
    */
  var satelliteArn: js.UndefOr[typingsJapgolly.awsSdk.groundstationMod.satelliteArn] = js.native
  /**
    * Start time of a contact.
    */
  var startTime: js.Date = js.native
  /**
    * Status of a contact reservation.
    */
  var statusList: StatusList = js.native
}

object ListContactsRequest {
  @scala.inline
  def apply(
    endTime: js.Date,
    startTime: js.Date,
    statusList: StatusList,
    groundStation: String = null,
    maxResults: Int | scala.Double = null,
    missionProfileArn: MissionProfileArn = null,
    nextToken: String = null,
    satelliteArn: satelliteArn = null
  ): ListContactsRequest = {
    val __obj = js.Dynamic.literal(endTime = endTime.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any], statusList = statusList.asInstanceOf[js.Any])
    if (groundStation != null) __obj.updateDynamic("groundStation")(groundStation.asInstanceOf[js.Any])
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (missionProfileArn != null) __obj.updateDynamic("missionProfileArn")(missionProfileArn.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    if (satelliteArn != null) __obj.updateDynamic("satelliteArn")(satelliteArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListContactsRequest]
  }
}

