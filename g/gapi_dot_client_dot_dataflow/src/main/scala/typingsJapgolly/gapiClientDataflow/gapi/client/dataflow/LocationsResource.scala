package typingsJapgolly.gapiClientDataflow.gapi.client.dataflow

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientDataflow.AnonQuotaUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocationsResource extends js.Object {
  var jobs: JobsResource
  var templates: TemplatesResource
  /** Send a worker_message to the service. */
  def workerMessages(request: AnonQuotaUser): Request_[SendWorkerMessagesResponse]
}

object LocationsResource {
  @scala.inline
  def apply(
    jobs: JobsResource,
    templates: TemplatesResource,
    workerMessages: AnonQuotaUser => CallbackTo[Request_[SendWorkerMessagesResponse]]
  ): LocationsResource = {
    val __obj = js.Dynamic.literal(jobs = jobs.asInstanceOf[js.Any], templates = templates.asInstanceOf[js.Any])
    __obj.updateDynamic("workerMessages")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDataflow.AnonQuotaUser) => workerMessages(t0).runNow()))
    __obj.asInstanceOf[LocationsResource]
  }
}

