package typingsJapgolly.gapiClientAnalytics.gapi.client.analytics

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientAnalytics.AnonAltFields
import typingsJapgolly.gapiClientAnalytics.AnonPrettyPrint
import typingsJapgolly.gapiClientAnalytics.AnonQuotaUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebpropertyUserLinksResource extends js.Object {
  /** Removes a user from the given web property. */
  def delete(request: AnonAltFields): Request_[Unit]
  /** Adds a new user to the given web property. */
  def insert(request: AnonQuotaUser): Request_[EntityUserLink]
  /** Lists webProperty-user links for a given web property. */
  def list(request: AnonPrettyPrint): Request_[EntityUserLinks]
  /** Updates permissions for an existing user on the given web property. */
  def update(request: AnonAltFields): Request_[EntityUserLink]
}

object WebpropertyUserLinksResource {
  @scala.inline
  def apply(
    delete: AnonAltFields => CallbackTo[Request_[Unit]],
    insert: AnonQuotaUser => CallbackTo[Request_[EntityUserLink]],
    list: AnonPrettyPrint => CallbackTo[Request_[EntityUserLinks]],
    update: AnonAltFields => CallbackTo[Request_[EntityUserLink]]
  ): WebpropertyUserLinksResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAnalytics.AnonAltFields) => delete(t0).runNow()))
    __obj.updateDynamic("insert")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAnalytics.AnonQuotaUser) => insert(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAnalytics.AnonPrettyPrint) => list(t0).runNow()))
    __obj.updateDynamic("update")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAnalytics.AnonAltFields) => update(t0).runNow()))
    __obj.asInstanceOf[WebpropertyUserLinksResource]
  }
}

