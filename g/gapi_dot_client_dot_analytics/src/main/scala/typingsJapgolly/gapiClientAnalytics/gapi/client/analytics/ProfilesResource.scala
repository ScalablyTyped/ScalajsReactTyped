package typingsJapgolly.gapiClientAnalytics.gapi.client.analytics

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientAnalytics.AnonPrettyPrint
import typingsJapgolly.gapiClientAnalytics.AnonProfileId
import typingsJapgolly.gapiClientAnalytics.AnonQuotaUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProfilesResource extends js.Object {
  /** Deletes a view (profile). */
  def delete(request: AnonProfileId): Request_[Unit]
  /** Gets a view (profile) to which the user has access. */
  def get(request: AnonProfileId): Request_[Profile]
  /** Create a new view (profile). */
  def insert(request: AnonQuotaUser): Request_[Profile]
  /** Lists views (profiles) to which the user has access. */
  def list(request: AnonPrettyPrint): Request_[Profiles]
  /** Updates an existing view (profile). This method supports patch semantics. */
  def patch(request: AnonProfileId): Request_[Profile]
  /** Updates an existing view (profile). */
  def update(request: AnonProfileId): Request_[Profile]
}

object ProfilesResource {
  @scala.inline
  def apply(
    delete: AnonProfileId => CallbackTo[Request_[Unit]],
    get: AnonProfileId => CallbackTo[Request_[Profile]],
    insert: AnonQuotaUser => CallbackTo[Request_[Profile]],
    list: AnonPrettyPrint => CallbackTo[Request_[Profiles]],
    patch: AnonProfileId => CallbackTo[Request_[Profile]],
    update: AnonProfileId => CallbackTo[Request_[Profile]]
  ): ProfilesResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAnalytics.AnonProfileId) => delete(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAnalytics.AnonProfileId) => get(t0).runNow()))
    __obj.updateDynamic("insert")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAnalytics.AnonQuotaUser) => insert(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAnalytics.AnonPrettyPrint) => list(t0).runNow()))
    __obj.updateDynamic("patch")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAnalytics.AnonProfileId) => patch(t0).runNow()))
    __obj.updateDynamic("update")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAnalytics.AnonProfileId) => update(t0).runNow()))
    __obj.asInstanceOf[ProfilesResource]
  }
}

