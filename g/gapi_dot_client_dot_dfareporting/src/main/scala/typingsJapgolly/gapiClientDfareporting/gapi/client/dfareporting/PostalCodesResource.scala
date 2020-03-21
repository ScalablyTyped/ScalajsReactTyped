package typingsJapgolly.gapiClientDfareporting.gapi.client.dfareporting

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientDfareporting.AnonCode
import typingsJapgolly.gapiClientDfareporting.AnonKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PostalCodesResource extends js.Object {
  /** Gets one postal code by ID. */
  def get(request: AnonCode): Request_[PostalCode]
  /** Retrieves a list of postal codes. */
  def list(request: AnonKey): Request_[PostalCodesListResponse]
}

object PostalCodesResource {
  @scala.inline
  def apply(
    get: AnonCode => CallbackTo[Request_[PostalCode]],
    list: AnonKey => CallbackTo[Request_[PostalCodesListResponse]]
  ): PostalCodesResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDfareporting.AnonCode) => get(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDfareporting.AnonKey) => list(t0).runNow()))
    __obj.asInstanceOf[PostalCodesResource]
  }
}

