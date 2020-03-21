package typingsJapgolly.googleAppsScript.GoogleAppsScript.Classroom.Collection

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Classroom.Collection.UserProfiles.GuardianInvitationsCollection
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Classroom.Collection.UserProfiles.GuardiansCollection
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Classroom.Schema.UserProfile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserProfilesCollection extends js.Object {
  var GuardianInvitations: js.UndefOr[GuardianInvitationsCollection] = js.undefined
  var Guardians: js.UndefOr[GuardiansCollection] = js.undefined
  // Returns a user profile.
  // This method returns the following error codes:
  // * `PERMISSION_DENIED` if the requesting user is not permitted to access
  // this user profile, if no profile exists with the requested ID, or for
  // access errors.
  def get(userId: String): UserProfile
}

object UserProfilesCollection {
  @scala.inline
  def apply(
    get: String => CallbackTo[UserProfile],
    GuardianInvitations: GuardianInvitationsCollection = null,
    Guardians: GuardiansCollection = null
  ): UserProfilesCollection = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: java.lang.String) => get(t0).runNow()))
    if (GuardianInvitations != null) __obj.updateDynamic("GuardianInvitations")(GuardianInvitations.asInstanceOf[js.Any])
    if (Guardians != null) __obj.updateDynamic("Guardians")(Guardians.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserProfilesCollection]
  }
}

