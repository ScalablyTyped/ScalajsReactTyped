package typingsJapgolly.gapiClientCloudmonitoring.gapi.client.cloudmonitoring

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientCloudmonitoring.AnonAlt
import typingsJapgolly.gapiClientCloudmonitoring.AnonCount
import typingsJapgolly.gapiClientCloudmonitoring.AnonFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MetricDescriptorsResource extends js.Object {
  /** Create a new metric. */
  def create(request: AnonAlt): Request_[MetricDescriptor]
  /** Delete an existing metric. */
  def delete(request: AnonFields): Request_[DeleteMetricDescriptorResponse]
  /**
    * List metric descriptors that match the query. If the query is not set, then all of the metric descriptors will be returned. Large responses will be
    * paginated, use the nextPageToken returned in the response to request subsequent pages of results by setting the pageToken query parameter to the value
    * of the nextPageToken.
    */
  def list(request: AnonCount): Request_[ListMetricDescriptorsResponse]
}

object MetricDescriptorsResource {
  @scala.inline
  def apply(
    create: AnonAlt => CallbackTo[Request_[MetricDescriptor]],
    delete: AnonFields => CallbackTo[Request_[DeleteMetricDescriptorResponse]],
    list: AnonCount => CallbackTo[Request_[ListMetricDescriptorsResponse]]
  ): MetricDescriptorsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("create")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCloudmonitoring.AnonAlt) => create(t0).runNow()))
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCloudmonitoring.AnonFields) => delete(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCloudmonitoring.AnonCount) => list(t0).runNow()))
    __obj.asInstanceOf[MetricDescriptorsResource]
  }
}

