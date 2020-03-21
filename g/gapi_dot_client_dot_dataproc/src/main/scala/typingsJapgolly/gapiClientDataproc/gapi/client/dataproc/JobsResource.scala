package typingsJapgolly.gapiClientDataproc.gapi.client.dataproc

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientDataproc.AnonAccesstoken
import typingsJapgolly.gapiClientDataproc.AnonClusterName
import typingsJapgolly.gapiClientDataproc.AnonFields
import typingsJapgolly.gapiClientDataproc.AnonJobId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JobsResource extends js.Object {
  /** Starts a job cancellation request. To access the job resource after cancellation, call regions/{region}/jobs.list or regions/{region}/jobs.get. */
  def cancel(request: AnonFields): Request_[Job]
  /** Deletes the job from the project. If the job is active, the delete fails, and the response returns FAILED_PRECONDITION. */
  def delete(request: AnonFields): Request_[js.Object]
  /** Gets the resource representation for a job in a project. */
  def get(request: AnonFields): Request_[Job]
  /** Lists regions/{region}/jobs in a project. */
  def list(request: AnonClusterName): Request_[ListJobsResponse]
  /** Updates a job in a project. */
  def patch(request: AnonJobId): Request_[Job]
  /** Submits a job to a cluster. */
  def submit(request: AnonAccesstoken): Request_[Job]
}

object JobsResource {
  @scala.inline
  def apply(
    cancel: AnonFields => CallbackTo[Request_[Job]],
    delete: AnonFields => CallbackTo[Request_[js.Object]],
    get: AnonFields => CallbackTo[Request_[Job]],
    list: AnonClusterName => CallbackTo[Request_[ListJobsResponse]],
    patch: AnonJobId => CallbackTo[Request_[Job]],
    submit: AnonAccesstoken => CallbackTo[Request_[Job]]
  ): JobsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cancel")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDataproc.AnonFields) => cancel(t0).runNow()))
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDataproc.AnonFields) => delete(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDataproc.AnonFields) => get(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDataproc.AnonClusterName) => list(t0).runNow()))
    __obj.updateDynamic("patch")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDataproc.AnonJobId) => patch(t0).runNow()))
    __obj.updateDynamic("submit")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDataproc.AnonAccesstoken) => submit(t0).runNow()))
    __obj.asInstanceOf[JobsResource]
  }
}

