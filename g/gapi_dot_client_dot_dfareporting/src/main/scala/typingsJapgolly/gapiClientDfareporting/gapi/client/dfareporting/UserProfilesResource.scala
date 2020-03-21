package typingsJapgolly.gapiClientDfareporting.gapi.client.dfareporting

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientDfareporting.AnonKey
import typingsJapgolly.gapiClientDfareporting.AnonKeyOauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserProfilesResource extends js.Object {
  /** Gets one user profile by ID. */
  def get(request: AnonKey): Request_[UserProfile]
  /** Retrieves list of user profiles for a user. */
  def list(request: AnonKeyOauthtoken): Request_[UserProfileList]
}

object UserProfilesResource {
  @scala.inline
  def apply(
    get: AnonKey => CallbackTo[Request_[UserProfile]],
    list: AnonKeyOauthtoken => CallbackTo[Request_[UserProfileList]]
  ): UserProfilesResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDfareporting.AnonKey) => get(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDfareporting.AnonKeyOauthtoken) => list(t0).runNow()))
    __obj.asInstanceOf[UserProfilesResource]
  }
}

