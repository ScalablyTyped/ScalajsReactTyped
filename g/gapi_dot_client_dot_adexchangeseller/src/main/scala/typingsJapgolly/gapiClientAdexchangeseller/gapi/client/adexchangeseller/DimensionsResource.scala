package typingsJapgolly.gapiClientAdexchangeseller.gapi.client.adexchangeseller

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientAdexchangeseller.AnonKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DimensionsResource extends js.Object {
  /** List the metadata for the dimensions available to this AdExchange account. */
  def list(request: AnonKey): Request_[Metadata]
}

object DimensionsResource {
  @scala.inline
  def apply(list: AnonKey => CallbackTo[Request_[Metadata]]): DimensionsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAdexchangeseller.AnonKey) => list(t0).runNow()))
    __obj.asInstanceOf[DimensionsResource]
  }
}

