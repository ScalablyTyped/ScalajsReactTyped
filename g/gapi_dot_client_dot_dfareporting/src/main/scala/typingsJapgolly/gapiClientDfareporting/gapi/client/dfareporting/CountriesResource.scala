package typingsJapgolly.gapiClientDfareporting.gapi.client.dfareporting

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientDfareporting.AnonDartId
import typingsJapgolly.gapiClientDfareporting.AnonKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CountriesResource extends js.Object {
  /** Gets one country by ID. */
  def get(request: AnonDartId): Request_[Country]
  /** Retrieves a list of countries. */
  def list(request: AnonKey): Request_[CountriesListResponse]
}

object CountriesResource {
  @scala.inline
  def apply(
    get: AnonDartId => CallbackTo[Request_[Country]],
    list: AnonKey => CallbackTo[Request_[CountriesListResponse]]
  ): CountriesResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDfareporting.AnonDartId) => get(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDfareporting.AnonKey) => list(t0).runNow()))
    __obj.asInstanceOf[CountriesResource]
  }
}

