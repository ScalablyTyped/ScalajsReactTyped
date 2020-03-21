package typingsJapgolly.gapiClientDataflow.gapi.client.dataflow

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientDataflow.AnonUploadprotocol
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectsResource extends js.Object {
  var jobs: JobsResource
  var locations: LocationsResource
  var templates: TemplatesResource
  /** Send a worker_message to the service. */
  def workerMessages(request: AnonUploadprotocol): Request_[SendWorkerMessagesResponse]
}

object ProjectsResource {
  @scala.inline
  def apply(
    jobs: JobsResource,
    locations: LocationsResource,
    templates: TemplatesResource,
    workerMessages: AnonUploadprotocol => CallbackTo[Request_[SendWorkerMessagesResponse]]
  ): ProjectsResource = {
    val __obj = js.Dynamic.literal(jobs = jobs.asInstanceOf[js.Any], locations = locations.asInstanceOf[js.Any], templates = templates.asInstanceOf[js.Any])
    __obj.updateDynamic("workerMessages")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDataflow.AnonUploadprotocol) => workerMessages(t0).runNow()))
    __obj.asInstanceOf[ProjectsResource]
  }
}

