package typingsJapgolly.gapiClientPlaymoviespartner.gapi.client.playmoviespartner

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientPlaymoviespartner.AnonAlt
import typingsJapgolly.gapiClientPlaymoviespartner.AnonBearertoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrdersResource extends js.Object {
  /**
    * Get an Order given its id.
    *
    * See _Authentication and Authorization rules_ and
    * _Get methods rules_ for more information about this method.
    */
  def get(request: AnonAlt): Request_[Order]
  /**
    * List Orders owned or managed by the partner.
    *
    * See _Authentication and Authorization rules_ and
    * _List methods rules_ for more information about this method.
    */
  def list(request: AnonBearertoken): Request_[ListOrdersResponse]
}

object OrdersResource {
  @scala.inline
  def apply(
    get: AnonAlt => CallbackTo[Request_[Order]],
    list: AnonBearertoken => CallbackTo[Request_[ListOrdersResponse]]
  ): OrdersResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientPlaymoviespartner.AnonAlt) => get(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientPlaymoviespartner.AnonBearertoken) => list(t0).runNow()))
    __obj.asInstanceOf[OrdersResource]
  }
}

