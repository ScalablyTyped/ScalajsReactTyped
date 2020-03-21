package typingsJapgolly.gapiClientPlaymoviespartner.gapi.client.playmoviespartner

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientPlaymoviespartner.AnonCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CountryResource extends js.Object {
  /**
    * Get a StoreInfo given its video id and country.
    *
    * See _Authentication and Authorization rules_ and
    * _Get methods rules_ for more information about this method.
    */
  def get(request: AnonCallback): Request_[StoreInfo]
}

object CountryResource {
  @scala.inline
  def apply(get: AnonCallback => CallbackTo[Request_[StoreInfo]]): CountryResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientPlaymoviespartner.AnonCallback) => get(t0).runNow()))
    __obj.asInstanceOf[CountryResource]
  }
}

