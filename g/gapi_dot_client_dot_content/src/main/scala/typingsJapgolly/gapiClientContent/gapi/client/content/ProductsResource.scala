package typingsJapgolly.gapiClientContent.gapi.client.content

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientContent.AnonAltFields
import typingsJapgolly.gapiClientContent.AnonDryRun
import typingsJapgolly.gapiClientContent.AnonIncludeInvalidInsertedItems
import typingsJapgolly.gapiClientContent.AnonMerchantId
import typingsJapgolly.gapiClientContent.AnonUserIp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProductsResource extends js.Object {
  /** Retrieves, inserts, and deletes multiple products in a single request. This method can only be called for non-multi-client accounts. */
  def custombatch(request: AnonDryRun): Request_[ProductsCustomBatchResponse]
  /** Deletes a product from your Merchant Center account. This method can only be called for non-multi-client accounts. */
  def delete(request: AnonUserIp): Request_[Unit]
  /** Retrieves a product from your Merchant Center account. This method can only be called for non-multi-client accounts. */
  def get(request: AnonAltFields): Request_[Product]
  /**
    * Uploads a product to your Merchant Center account. If an item with the same channel, contentLanguage, offerId, and targetCountry already exists, this
    * method updates that entry. This method can only be called for non-multi-client accounts.
    */
  def insert(request: AnonMerchantId): Request_[Product]
  /** Lists the products in your Merchant Center account. This method can only be called for non-multi-client accounts. */
  def list(request: AnonIncludeInvalidInsertedItems): Request_[ProductsListResponse]
}

object ProductsResource {
  @scala.inline
  def apply(
    custombatch: AnonDryRun => CallbackTo[Request_[ProductsCustomBatchResponse]],
    delete: AnonUserIp => CallbackTo[Request_[Unit]],
    get: AnonAltFields => CallbackTo[Request_[Product]],
    insert: AnonMerchantId => CallbackTo[Request_[Product]],
    list: AnonIncludeInvalidInsertedItems => CallbackTo[Request_[ProductsListResponse]]
  ): ProductsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("custombatch")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientContent.AnonDryRun) => custombatch(t0).runNow()))
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientContent.AnonUserIp) => delete(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientContent.AnonAltFields) => get(t0).runNow()))
    __obj.updateDynamic("insert")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientContent.AnonMerchantId) => insert(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientContent.AnonIncludeInvalidInsertedItems) => list(t0).runNow()))
    __obj.asInstanceOf[ProductsResource]
  }
}

