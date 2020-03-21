package typingsJapgolly.gapiClientAnalytics.gapi.client.analytics

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientAnalytics.AnonProfileId
import typingsJapgolly.gapiClientAnalytics.AnonStartindex
import typingsJapgolly.gapiClientAnalytics.AnonWebPropertyId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProfileUserLinksResource extends js.Object {
  /** Removes a user from the given view (profile). */
  def delete(request: AnonWebPropertyId): Request_[Unit]
  /** Adds a new user to the given view (profile). */
  def insert(request: AnonProfileId): Request_[EntityUserLink]
  /** Lists profile-user links for a given view (profile). */
  def list(request: AnonStartindex): Request_[EntityUserLinks]
  /** Updates permissions for an existing user on the given view (profile). */
  def update(request: AnonWebPropertyId): Request_[EntityUserLink]
}

object ProfileUserLinksResource {
  @scala.inline
  def apply(
    delete: AnonWebPropertyId => CallbackTo[Request_[Unit]],
    insert: AnonProfileId => CallbackTo[Request_[EntityUserLink]],
    list: AnonStartindex => CallbackTo[Request_[EntityUserLinks]],
    update: AnonWebPropertyId => CallbackTo[Request_[EntityUserLink]]
  ): ProfileUserLinksResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAnalytics.AnonWebPropertyId) => delete(t0).runNow()))
    __obj.updateDynamic("insert")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAnalytics.AnonProfileId) => insert(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAnalytics.AnonStartindex) => list(t0).runNow()))
    __obj.updateDynamic("update")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAnalytics.AnonWebPropertyId) => update(t0).runNow()))
    __obj.asInstanceOf[ProfileUserLinksResource]
  }
}

