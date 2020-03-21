package typingsJapgolly.googleAppsScript.GoogleAppsScript.Dfareporting.Collection

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Dfareporting.Schema.UserProfile
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Dfareporting.Schema.UserProfileList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserProfilesCollection extends js.Object {
  // Gets one user profile by ID.
  def get(profileId: String): UserProfile
  // Retrieves list of user profiles for a user.
  def list(): UserProfileList
}

object UserProfilesCollection {
  @scala.inline
  def apply(get: String => CallbackTo[UserProfile], list: CallbackTo[UserProfileList]): UserProfilesCollection = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: java.lang.String) => get(t0).runNow()))
    __obj.updateDynamic("list")(list.toJsFn)
    __obj.asInstanceOf[UserProfilesCollection]
  }
}

