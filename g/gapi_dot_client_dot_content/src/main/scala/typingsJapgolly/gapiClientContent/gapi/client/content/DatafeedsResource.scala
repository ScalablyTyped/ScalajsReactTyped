package typingsJapgolly.gapiClientContent.gapi.client.content

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientContent.AnonDatafeedId
import typingsJapgolly.gapiClientContent.AnonDryRun
import typingsJapgolly.gapiClientContent.AnonMaxResults
import typingsJapgolly.gapiClientContent.AnonMerchantId
import typingsJapgolly.gapiClientContent.AnonPrettyPrint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatafeedsResource extends js.Object {
  def custombatch(request: AnonDryRun): Request_[DatafeedsCustomBatchResponse]
  /** Deletes a datafeed configuration from your Merchant Center account. This method can only be called for non-multi-client accounts. */
  def delete(request: AnonDatafeedId): Request_[Unit]
  /** Retrieves a datafeed configuration from your Merchant Center account. This method can only be called for non-multi-client accounts. */
  def get(request: AnonPrettyPrint): Request_[Datafeed]
  /** Registers a datafeed configuration with your Merchant Center account. This method can only be called for non-multi-client accounts. */
  def insert(request: AnonMerchantId): Request_[Datafeed]
  /** Lists the datafeeds in your Merchant Center account. This method can only be called for non-multi-client accounts. */
  def list(request: AnonMaxResults): Request_[DatafeedsListResponse]
  /**
    * Updates a datafeed configuration of your Merchant Center account. This method can only be called for non-multi-client accounts. This method supports
    * patch semantics.
    */
  def patch(request: AnonDatafeedId): Request_[Datafeed]
  /** Updates a datafeed configuration of your Merchant Center account. This method can only be called for non-multi-client accounts. */
  def update(request: AnonDatafeedId): Request_[Datafeed]
}

object DatafeedsResource {
  @scala.inline
  def apply(
    custombatch: AnonDryRun => CallbackTo[Request_[DatafeedsCustomBatchResponse]],
    delete: AnonDatafeedId => CallbackTo[Request_[Unit]],
    get: AnonPrettyPrint => CallbackTo[Request_[Datafeed]],
    insert: AnonMerchantId => CallbackTo[Request_[Datafeed]],
    list: AnonMaxResults => CallbackTo[Request_[DatafeedsListResponse]],
    patch: AnonDatafeedId => CallbackTo[Request_[Datafeed]],
    update: AnonDatafeedId => CallbackTo[Request_[Datafeed]]
  ): DatafeedsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("custombatch")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientContent.AnonDryRun) => custombatch(t0).runNow()))
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientContent.AnonDatafeedId) => delete(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientContent.AnonPrettyPrint) => get(t0).runNow()))
    __obj.updateDynamic("insert")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientContent.AnonMerchantId) => insert(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientContent.AnonMaxResults) => list(t0).runNow()))
    __obj.updateDynamic("patch")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientContent.AnonDatafeedId) => patch(t0).runNow()))
    __obj.updateDynamic("update")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientContent.AnonDatafeedId) => update(t0).runNow()))
    __obj.asInstanceOf[DatafeedsResource]
  }
}

