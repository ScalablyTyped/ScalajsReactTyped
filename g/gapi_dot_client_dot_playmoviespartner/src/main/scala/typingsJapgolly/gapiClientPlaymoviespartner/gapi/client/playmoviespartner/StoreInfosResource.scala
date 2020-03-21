package typingsJapgolly.gapiClientPlaymoviespartner.gapi.client.playmoviespartner

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientPlaymoviespartner.AnonCountries
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StoreInfosResource extends js.Object {
  var country: CountryResource
  /**
    * List StoreInfos owned or managed by the partner.
    *
    * See _Authentication and Authorization rules_ and
    * _List methods rules_ for more information about this method.
    */
  def list(request: AnonCountries): Request_[ListStoreInfosResponse]
}

object StoreInfosResource {
  @scala.inline
  def apply(country: CountryResource, list: AnonCountries => CallbackTo[Request_[ListStoreInfosResponse]]): StoreInfosResource = {
    val __obj = js.Dynamic.literal(country = country.asInstanceOf[js.Any])
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientPlaymoviespartner.AnonCountries) => list(t0).runNow()))
    __obj.asInstanceOf[StoreInfosResource]
  }
}

