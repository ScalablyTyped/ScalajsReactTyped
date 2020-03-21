package typingsJapgolly.gapiClientAnalytics.gapi.client.analytics

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientAnalytics.AnonProfileId
import typingsJapgolly.gapiClientAnalytics.AnonStartindex
import typingsJapgolly.gapiClientAnalytics.AnonWebPropertyId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProfileFilterLinksResource extends js.Object {
  /** Delete a profile filter link. */
  def delete(request: AnonWebPropertyId): Request_[Unit]
  /** Returns a single profile filter link. */
  def get(request: AnonWebPropertyId): Request_[ProfileFilterLink]
  /** Create a new profile filter link. */
  def insert(request: AnonProfileId): Request_[ProfileFilterLink]
  /** Lists all profile filter links for a profile. */
  def list(request: AnonStartindex): Request_[ProfileFilterLinks]
  /** Update an existing profile filter link. This method supports patch semantics. */
  def patch(request: AnonWebPropertyId): Request_[ProfileFilterLink]
  /** Update an existing profile filter link. */
  def update(request: AnonWebPropertyId): Request_[ProfileFilterLink]
}

object ProfileFilterLinksResource {
  @scala.inline
  def apply(
    delete: AnonWebPropertyId => CallbackTo[Request_[Unit]],
    get: AnonWebPropertyId => CallbackTo[Request_[ProfileFilterLink]],
    insert: AnonProfileId => CallbackTo[Request_[ProfileFilterLink]],
    list: AnonStartindex => CallbackTo[Request_[ProfileFilterLinks]],
    patch: AnonWebPropertyId => CallbackTo[Request_[ProfileFilterLink]],
    update: AnonWebPropertyId => CallbackTo[Request_[ProfileFilterLink]]
  ): ProfileFilterLinksResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAnalytics.AnonWebPropertyId) => delete(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAnalytics.AnonWebPropertyId) => get(t0).runNow()))
    __obj.updateDynamic("insert")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAnalytics.AnonProfileId) => insert(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAnalytics.AnonStartindex) => list(t0).runNow()))
    __obj.updateDynamic("patch")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAnalytics.AnonWebPropertyId) => patch(t0).runNow()))
    __obj.updateDynamic("update")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAnalytics.AnonWebPropertyId) => update(t0).runNow()))
    __obj.asInstanceOf[ProfileFilterLinksResource]
  }
}

