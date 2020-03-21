package typingsJapgolly.gapiClientYoutubereporting.gapi.client.youtubereporting

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientYoutubereporting.AnonBearertoken
import typingsJapgolly.gapiClientYoutubereporting.AnonCallback
import typingsJapgolly.gapiClientYoutubereporting.AnonFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JobsResource extends js.Object {
  var reports: ReportsResource
  /** Creates a job and returns it. */
  def create(request: AnonBearertoken): Request_[Job]
  /** Deletes a job. */
  def delete(request: AnonCallback): Request_[js.Object]
  /** Gets a job. */
  def get(request: AnonCallback): Request_[Job]
  /** Lists jobs. */
  def list(request: AnonFields): Request_[ListJobsResponse]
}

object JobsResource {
  @scala.inline
  def apply(
    create: AnonBearertoken => CallbackTo[Request_[Job]],
    delete: AnonCallback => CallbackTo[Request_[js.Object]],
    get: AnonCallback => CallbackTo[Request_[Job]],
    list: AnonFields => CallbackTo[Request_[ListJobsResponse]],
    reports: ReportsResource
  ): JobsResource = {
    val __obj = js.Dynamic.literal(reports = reports.asInstanceOf[js.Any])
    __obj.updateDynamic("create")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientYoutubereporting.AnonBearertoken) => create(t0).runNow()))
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientYoutubereporting.AnonCallback) => delete(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientYoutubereporting.AnonCallback) => get(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientYoutubereporting.AnonFields) => list(t0).runNow()))
    __obj.asInstanceOf[JobsResource]
  }
}

