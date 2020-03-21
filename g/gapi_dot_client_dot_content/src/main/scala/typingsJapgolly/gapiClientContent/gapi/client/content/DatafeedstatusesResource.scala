package typingsJapgolly.gapiClientContent.gapi.client.content

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientContent.AnonAlt
import typingsJapgolly.gapiClientContent.AnonCountry
import typingsJapgolly.gapiClientContent.AnonMaxResults
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatafeedstatusesResource extends js.Object {
  def custombatch(request: AnonAlt): Request_[DatafeedstatusesCustomBatchResponse]
  /** Retrieves the status of a datafeed from your Merchant Center account. This method can only be called for non-multi-client accounts. */
  def get(request: AnonCountry): Request_[DatafeedStatus]
  /** Lists the statuses of the datafeeds in your Merchant Center account. This method can only be called for non-multi-client accounts. */
  def list(request: AnonMaxResults): Request_[DatafeedstatusesListResponse]
}

object DatafeedstatusesResource {
  @scala.inline
  def apply(
    custombatch: AnonAlt => CallbackTo[Request_[DatafeedstatusesCustomBatchResponse]],
    get: AnonCountry => CallbackTo[Request_[DatafeedStatus]],
    list: AnonMaxResults => CallbackTo[Request_[DatafeedstatusesListResponse]]
  ): DatafeedstatusesResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("custombatch")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientContent.AnonAlt) => custombatch(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientContent.AnonCountry) => get(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientContent.AnonMaxResults) => list(t0).runNow()))
    __obj.asInstanceOf[DatafeedstatusesResource]
  }
}

