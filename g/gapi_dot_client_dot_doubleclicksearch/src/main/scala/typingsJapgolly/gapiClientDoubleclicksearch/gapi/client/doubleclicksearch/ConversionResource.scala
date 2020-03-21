package typingsJapgolly.gapiClientDoubleclicksearch.gapi.client.doubleclicksearch

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientDoubleclicksearch.AnonAdId
import typingsJapgolly.gapiClientDoubleclicksearch.AnonAdvertiserId
import typingsJapgolly.gapiClientDoubleclicksearch.AnonAlt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConversionResource extends js.Object {
  /** Retrieves a list of conversions from a DoubleClick Search engine account. */
  def get(request: AnonAdId): Request_[ConversionList]
  /** Inserts a batch of new conversions into DoubleClick Search. */
  def insert(request: AnonAlt): Request_[ConversionList]
  /** Updates a batch of conversions in DoubleClick Search. This method supports patch semantics. */
  def patch(request: AnonAdvertiserId): Request_[ConversionList]
  /** Updates a batch of conversions in DoubleClick Search. */
  def update(request: AnonAlt): Request_[ConversionList]
  /** Updates the availabilities of a batch of floodlight activities in DoubleClick Search. */
  def updateAvailability(request: AnonAlt): Request_[UpdateAvailabilityResponse]
}

object ConversionResource {
  @scala.inline
  def apply(
    get: AnonAdId => CallbackTo[Request_[ConversionList]],
    insert: AnonAlt => CallbackTo[Request_[ConversionList]],
    patch: AnonAdvertiserId => CallbackTo[Request_[ConversionList]],
    update: AnonAlt => CallbackTo[Request_[ConversionList]],
    updateAvailability: AnonAlt => CallbackTo[Request_[UpdateAvailabilityResponse]]
  ): ConversionResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDoubleclicksearch.AnonAdId) => get(t0).runNow()))
    __obj.updateDynamic("insert")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDoubleclicksearch.AnonAlt) => insert(t0).runNow()))
    __obj.updateDynamic("patch")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDoubleclicksearch.AnonAdvertiserId) => patch(t0).runNow()))
    __obj.updateDynamic("update")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDoubleclicksearch.AnonAlt) => update(t0).runNow()))
    __obj.updateDynamic("updateAvailability")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDoubleclicksearch.AnonAlt) => updateAvailability(t0).runNow()))
    __obj.asInstanceOf[ConversionResource]
  }
}

