package typingsJapgolly.squareConnect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "ListAdditionalRecipientReceivablesResponse")
@js.native
class ListAdditionalRecipientReceivablesResponse () extends js.Object {
  /**
    * A pagination cursor for retrieving the next set of results, if any remain. Provide this value as the `cursor`
    * parameter in a subsequent request to this endpoint.
    * See [Pagination](/basics/api101/pagination) for more information.
    */
  var cursor: js.UndefOr[String] = js.native
  /**
    * Any errors that occurred during the request.
    */
  var errors: js.UndefOr[js.Array[js.Error]] = js.native
  /**
    * An array of AdditionalRecipientReceivables that match your query.
    */
  var receivables: js.UndefOr[js.Array[AdditionalRecipientReceivable]] = js.native
}

