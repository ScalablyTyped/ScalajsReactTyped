package typingsJapgolly.gapiClientClassroom.gapi.client.classroom

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientClassroom.AnonQuotaUserUploadType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserProfilesResource extends js.Object {
  var guardianInvitations: GuardianInvitationsResource
  var guardians: GuardiansResource
  /**
    * Returns a user profile.
    *
    * This method returns the following error codes:
    *
    * &#42; `PERMISSION_DENIED` if the requesting user is not permitted to access
    * this user profile, if no profile exists with the requested ID, or for
    * access errors.
    */
  def get(request: AnonQuotaUserUploadType): Request_[UserProfile]
}

object UserProfilesResource {
  @scala.inline
  def apply(
    get: AnonQuotaUserUploadType => CallbackTo[Request_[UserProfile]],
    guardianInvitations: GuardianInvitationsResource,
    guardians: GuardiansResource
  ): UserProfilesResource = {
    val __obj = js.Dynamic.literal(guardianInvitations = guardianInvitations.asInstanceOf[js.Any], guardians = guardians.asInstanceOf[js.Any])
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientClassroom.AnonQuotaUserUploadType) => get(t0).runNow()))
    __obj.asInstanceOf[UserProfilesResource]
  }
}

