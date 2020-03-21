package typingsJapgolly.gapiClientSqladmin.gapi.client.sqladmin

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientSqladmin.AnonKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TiersResource extends js.Object {
  /** Lists all available service tiers for Google Cloud SQL, for example D1, D2. For related information, see Pricing. */
  def list(request: AnonKey): Request_[TiersListResponse]
}

object TiersResource {
  @scala.inline
  def apply(list: AnonKey => CallbackTo[Request_[TiersListResponse]]): TiersResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientSqladmin.AnonKey) => list(t0).runNow()))
    __obj.asInstanceOf[TiersResource]
  }
}

