package typingsJapgolly.gapiClientCivicinfo.gapi.client.civicinfo

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientCivicinfo.AnonAlt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DivisionsResource extends js.Object {
  /** Searches for political divisions by their natural name or OCD ID. */
  def search(request: AnonAlt): Request_[DivisionSearchResponse]
}

object DivisionsResource {
  @scala.inline
  def apply(search: AnonAlt => CallbackTo[Request_[DivisionSearchResponse]]): DivisionsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("search")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCivicinfo.AnonAlt) => search(t0).runNow()))
    __obj.asInstanceOf[DivisionsResource]
  }
}

