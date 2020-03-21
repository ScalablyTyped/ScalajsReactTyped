package typingsJapgolly.gapiClientDfareporting.gapi.client.dfareporting

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientDfareporting.AnonAltFields
import typingsJapgolly.gapiClientDfareporting.AnonFields
import typingsJapgolly.gapiClientDfareporting.AnonKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FloodlightConfigurationsResource extends js.Object {
  /** Gets one floodlight configuration by ID. */
  def get(request: AnonFields): Request_[FloodlightConfiguration]
  /** Retrieves a list of floodlight configurations, possibly filtered. */
  def list(request: AnonAltFields): Request_[FloodlightConfigurationsListResponse]
  /** Updates an existing floodlight configuration. This method supports patch semantics. */
  def patch(request: AnonFields): Request_[FloodlightConfiguration]
  /** Updates an existing floodlight configuration. */
  def update(request: AnonKey): Request_[FloodlightConfiguration]
}

object FloodlightConfigurationsResource {
  @scala.inline
  def apply(
    get: AnonFields => CallbackTo[Request_[FloodlightConfiguration]],
    list: AnonAltFields => CallbackTo[Request_[FloodlightConfigurationsListResponse]],
    patch: AnonFields => CallbackTo[Request_[FloodlightConfiguration]],
    update: AnonKey => CallbackTo[Request_[FloodlightConfiguration]]
  ): FloodlightConfigurationsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDfareporting.AnonFields) => get(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDfareporting.AnonAltFields) => list(t0).runNow()))
    __obj.updateDynamic("patch")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDfareporting.AnonFields) => patch(t0).runNow()))
    __obj.updateDynamic("update")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDfareporting.AnonKey) => update(t0).runNow()))
    __obj.asInstanceOf[FloodlightConfigurationsResource]
  }
}

