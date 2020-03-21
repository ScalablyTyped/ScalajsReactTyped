package typingsJapgolly.gapiClientDfareporting.gapi.client.dfareporting

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientDfareporting.AnonApproved
import typingsJapgolly.gapiClientDfareporting.AnonId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrderDocumentsResource extends js.Object {
  /** Gets one order document by ID. */
  def get(request: AnonId): Request_[OrderDocument]
  /** Retrieves a list of order documents, possibly filtered. This method supports paging. */
  def list(request: AnonApproved): Request_[OrderDocumentsListResponse]
}

object OrderDocumentsResource {
  @scala.inline
  def apply(
    get: AnonId => CallbackTo[Request_[OrderDocument]],
    list: AnonApproved => CallbackTo[Request_[OrderDocumentsListResponse]]
  ): OrderDocumentsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDfareporting.AnonId) => get(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDfareporting.AnonApproved) => list(t0).runNow()))
    __obj.asInstanceOf[OrderDocumentsResource]
  }
}

