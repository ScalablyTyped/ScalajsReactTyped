package typingsJapgolly.gapiClientAnalytics.gapi.client.analytics

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientAnalytics.AnonFilterId
import typingsJapgolly.gapiClientAnalytics.AnonMaxresults
import typingsJapgolly.gapiClientAnalytics.AnonOauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FiltersResource extends js.Object {
  /** Delete a filter. */
  def delete(request: AnonFilterId): Request_[Filter]
  /** Returns a filters to which the user has access. */
  def get(request: AnonFilterId): Request_[Filter]
  /** Create a new filter. */
  def insert(request: AnonOauthtoken): Request_[Filter]
  /** Lists all filters for an account */
  def list(request: AnonMaxresults): Request_[Filters]
  /** Updates an existing filter. This method supports patch semantics. */
  def patch(request: AnonFilterId): Request_[Filter]
  /** Updates an existing filter. */
  def update(request: AnonFilterId): Request_[Filter]
}

object FiltersResource {
  @scala.inline
  def apply(
    delete: AnonFilterId => CallbackTo[Request_[Filter]],
    get: AnonFilterId => CallbackTo[Request_[Filter]],
    insert: AnonOauthtoken => CallbackTo[Request_[Filter]],
    list: AnonMaxresults => CallbackTo[Request_[Filters]],
    patch: AnonFilterId => CallbackTo[Request_[Filter]],
    update: AnonFilterId => CallbackTo[Request_[Filter]]
  ): FiltersResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAnalytics.AnonFilterId) => delete(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAnalytics.AnonFilterId) => get(t0).runNow()))
    __obj.updateDynamic("insert")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAnalytics.AnonOauthtoken) => insert(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAnalytics.AnonMaxresults) => list(t0).runNow()))
    __obj.updateDynamic("patch")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAnalytics.AnonFilterId) => patch(t0).runNow()))
    __obj.updateDynamic("update")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAnalytics.AnonFilterId) => update(t0).runNow()))
    __obj.asInstanceOf[FiltersResource]
  }
}

