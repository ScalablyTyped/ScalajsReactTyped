package typingsJapgolly.gapiClientDfareporting.gapi.client.dfareporting

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientDfareporting.AnonFields
import typingsJapgolly.gapiClientDfareporting.AnonIds
import typingsJapgolly.gapiClientDfareporting.AnonKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountUserProfilesResource extends js.Object {
  /** Gets one account user profile by ID. */
  def get(request: AnonFields): Request_[AccountUserProfile]
  /** Inserts a new account user profile. */
  def insert(request: AnonKey): Request_[AccountUserProfile]
  /** Retrieves a list of account user profiles, possibly filtered. This method supports paging. */
  def list(request: AnonIds): Request_[AccountUserProfilesListResponse]
  /** Updates an existing account user profile. This method supports patch semantics. */
  def patch(request: AnonFields): Request_[AccountUserProfile]
  /** Updates an existing account user profile. */
  def update(request: AnonKey): Request_[AccountUserProfile]
}

object AccountUserProfilesResource {
  @scala.inline
  def apply(
    get: AnonFields => CallbackTo[Request_[AccountUserProfile]],
    insert: AnonKey => CallbackTo[Request_[AccountUserProfile]],
    list: AnonIds => CallbackTo[Request_[AccountUserProfilesListResponse]],
    patch: AnonFields => CallbackTo[Request_[AccountUserProfile]],
    update: AnonKey => CallbackTo[Request_[AccountUserProfile]]
  ): AccountUserProfilesResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDfareporting.AnonFields) => get(t0).runNow()))
    __obj.updateDynamic("insert")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDfareporting.AnonKey) => insert(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDfareporting.AnonIds) => list(t0).runNow()))
    __obj.updateDynamic("patch")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDfareporting.AnonFields) => patch(t0).runNow()))
    __obj.updateDynamic("update")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDfareporting.AnonKey) => update(t0).runNow()))
    __obj.asInstanceOf[AccountUserProfilesResource]
  }
}

