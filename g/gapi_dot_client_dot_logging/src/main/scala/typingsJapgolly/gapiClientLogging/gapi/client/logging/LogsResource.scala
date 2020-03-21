package typingsJapgolly.gapiClientLogging.gapi.client.logging

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientLogging.AnonBearertoken
import typingsJapgolly.gapiClientLogging.AnonFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LogsResource extends js.Object {
  /**
    * Deletes all the log entries in a log. The log reappears if it receives new entries. Log entries written shortly before the delete operation might not
    * be deleted.
    */
  def delete(request: AnonFields): Request_[js.Object]
  /** Lists the logs in projects, organizations, folders, or billing accounts. Only logs that have entries are listed. */
  def list(request: AnonBearertoken): Request_[ListLogsResponse]
}

object LogsResource {
  @scala.inline
  def apply(
    delete: AnonFields => CallbackTo[Request_[js.Object]],
    list: AnonBearertoken => CallbackTo[Request_[ListLogsResponse]]
  ): LogsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientLogging.AnonFields) => delete(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientLogging.AnonBearertoken) => list(t0).runNow()))
    __obj.asInstanceOf[LogsResource]
  }
}

