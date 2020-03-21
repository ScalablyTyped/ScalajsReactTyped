package typingsJapgolly.gapiClientAnalytics.gapi.client.analytics

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientAnalytics.AnonLinkId
import typingsJapgolly.gapiClientAnalytics.AnonMaxresults
import typingsJapgolly.gapiClientAnalytics.AnonOauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountUserLinksResource extends js.Object {
  /** Removes a user from the given account. */
  def delete(request: AnonLinkId): Request_[Unit]
  /** Adds a new user to the given account. */
  def insert(request: AnonOauthtoken): Request_[EntityUserLink]
  /** Lists account-user links for a given account. */
  def list(request: AnonMaxresults): Request_[EntityUserLinks]
  /** Updates permissions for an existing user on the given account. */
  def update(request: AnonLinkId): Request_[EntityUserLink]
}

object AccountUserLinksResource {
  @scala.inline
  def apply(
    delete: AnonLinkId => CallbackTo[Request_[Unit]],
    insert: AnonOauthtoken => CallbackTo[Request_[EntityUserLink]],
    list: AnonMaxresults => CallbackTo[Request_[EntityUserLinks]],
    update: AnonLinkId => CallbackTo[Request_[EntityUserLink]]
  ): AccountUserLinksResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAnalytics.AnonLinkId) => delete(t0).runNow()))
    __obj.updateDynamic("insert")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAnalytics.AnonOauthtoken) => insert(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAnalytics.AnonMaxresults) => list(t0).runNow()))
    __obj.updateDynamic("update")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAnalytics.AnonLinkId) => update(t0).runNow()))
    __obj.asInstanceOf[AccountUserLinksResource]
  }
}

