package typingsJapgolly.gapiClientContent.gapi.client.content

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientContent.AnonFieldsIncludeAttributes
import typingsJapgolly.gapiClientContent.AnonIncludeAttributes
import typingsJapgolly.gapiClientContent.AnonPageToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProductstatusesResource extends js.Object {
  /** Gets the statuses of multiple products in a single request. This method can only be called for non-multi-client accounts. */
  def custombatch(request: AnonIncludeAttributes): Request_[ProductstatusesCustomBatchResponse]
  /** Gets the status of a product from your Merchant Center account. This method can only be called for non-multi-client accounts. */
  def get(request: AnonFieldsIncludeAttributes): Request_[ProductStatus]
  /** Lists the statuses of the products in your Merchant Center account. This method can only be called for non-multi-client accounts. */
  def list(request: AnonPageToken): Request_[ProductstatusesListResponse]
}

object ProductstatusesResource {
  @scala.inline
  def apply(
    custombatch: AnonIncludeAttributes => CallbackTo[Request_[ProductstatusesCustomBatchResponse]],
    get: AnonFieldsIncludeAttributes => CallbackTo[Request_[ProductStatus]],
    list: AnonPageToken => CallbackTo[Request_[ProductstatusesListResponse]]
  ): ProductstatusesResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("custombatch")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientContent.AnonIncludeAttributes) => custombatch(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientContent.AnonFieldsIncludeAttributes) => get(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientContent.AnonPageToken) => list(t0).runNow()))
    __obj.asInstanceOf[ProductstatusesResource]
  }
}

