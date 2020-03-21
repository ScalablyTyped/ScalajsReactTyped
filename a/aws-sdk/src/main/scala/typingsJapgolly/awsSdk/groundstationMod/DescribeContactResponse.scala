package typingsJapgolly.awsSdk.groundstationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeContactResponse extends js.Object {
  /**
    * UUID of a contact.
    */
  var contactId: js.UndefOr[String] = js.native
  /**
    * Status of a contact.
    */
  var contactStatus: js.UndefOr[ContactStatus] = js.native
  /**
    * End time of a contact.
    */
  var endTime: js.UndefOr[js.Date] = js.native
  /**
    * Error message for a contact.
    */
  var errorMessage: js.UndefOr[String] = js.native
  /**
    * Ground station for a contact.
    */
  var groundStation: js.UndefOr[String] = js.native
  /**
    * Maximum elevation angle of a contact.
    */
  var maximumElevation: js.UndefOr[Elevation] = js.native
  /**
    * ARN of a mission profile.
    */
  var missionProfileArn: js.UndefOr[MissionProfileArn] = js.native
  /**
    * Amount of time after a contact ends that you’d like to receive a CloudWatch event indicating the pass has finished.
    */
  var postPassEndTime: js.UndefOr[js.Date] = js.native
  /**
    * Amount of time prior to contact start you’d like to receive a CloudWatch event indicating an upcoming pass.
    */
  var prePassStartTime: js.UndefOr[js.Date] = js.native
  /**
    * Region of a contact.
    */
  var region: js.UndefOr[String] = js.native
  /**
    * ARN of a satellite.
    */
  var satelliteArn: js.UndefOr[typingsJapgolly.awsSdk.groundstationMod.satelliteArn] = js.native
  /**
    * Start time of a contact.
    */
  var startTime: js.UndefOr[js.Date] = js.native
  /**
    * Tags assigned to a contact.
    */
  var tags: js.UndefOr[TagsMap] = js.native
}

object DescribeContactResponse {
  @scala.inline
  def apply(
    contactId: String = null,
    contactStatus: ContactStatus = null,
    endTime: js.Date = null,
    errorMessage: String = null,
    groundStation: String = null,
    maximumElevation: Elevation = null,
    missionProfileArn: MissionProfileArn = null,
    postPassEndTime: js.Date = null,
    prePassStartTime: js.Date = null,
    region: String = null,
    satelliteArn: satelliteArn = null,
    startTime: js.Date = null,
    tags: TagsMap = null
  ): DescribeContactResponse = {
    val __obj = js.Dynamic.literal()
    if (contactId != null) __obj.updateDynamic("contactId")(contactId.asInstanceOf[js.Any])
    if (contactStatus != null) __obj.updateDynamic("contactStatus")(contactStatus.asInstanceOf[js.Any])
    if (endTime != null) __obj.updateDynamic("endTime")(endTime.asInstanceOf[js.Any])
    if (errorMessage != null) __obj.updateDynamic("errorMessage")(errorMessage.asInstanceOf[js.Any])
    if (groundStation != null) __obj.updateDynamic("groundStation")(groundStation.asInstanceOf[js.Any])
    if (maximumElevation != null) __obj.updateDynamic("maximumElevation")(maximumElevation.asInstanceOf[js.Any])
    if (missionProfileArn != null) __obj.updateDynamic("missionProfileArn")(missionProfileArn.asInstanceOf[js.Any])
    if (postPassEndTime != null) __obj.updateDynamic("postPassEndTime")(postPassEndTime.asInstanceOf[js.Any])
    if (prePassStartTime != null) __obj.updateDynamic("prePassStartTime")(prePassStartTime.asInstanceOf[js.Any])
    if (region != null) __obj.updateDynamic("region")(region.asInstanceOf[js.Any])
    if (satelliteArn != null) __obj.updateDynamic("satelliteArn")(satelliteArn.asInstanceOf[js.Any])
    if (startTime != null) __obj.updateDynamic("startTime")(startTime.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeContactResponse]
  }
}

