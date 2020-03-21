package typingsJapgolly.gapiClientDfareporting.gapi.client.dfareporting

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientDfareporting.AnonCountryDartIds
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CitiesResource extends js.Object {
  /** Retrieves a list of cities, possibly filtered. */
  def list(request: AnonCountryDartIds): Request_[CitiesListResponse]
}

object CitiesResource {
  @scala.inline
  def apply(list: AnonCountryDartIds => CallbackTo[Request_[CitiesListResponse]]): CitiesResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDfareporting.AnonCountryDartIds) => list(t0).runNow()))
    __obj.asInstanceOf[CitiesResource]
  }
}

