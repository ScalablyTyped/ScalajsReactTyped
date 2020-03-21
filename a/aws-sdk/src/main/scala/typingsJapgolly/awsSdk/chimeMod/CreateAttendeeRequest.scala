package typingsJapgolly.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateAttendeeRequest extends js.Object {
  /**
    * The Amazon Chime SDK external user ID. Links the attendee to an identity managed by a builder application.
    */
  var ExternalUserId: ExternalUserIdType = js.native
  /**
    * The Amazon Chime SDK meeting ID.
    */
  var MeetingId: GuidString = js.native
}

object CreateAttendeeRequest {
  @scala.inline
  def apply(ExternalUserId: ExternalUserIdType, MeetingId: GuidString): CreateAttendeeRequest = {
    val __obj = js.Dynamic.literal(ExternalUserId = ExternalUserId.asInstanceOf[js.Any], MeetingId = MeetingId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CreateAttendeeRequest]
  }
}

