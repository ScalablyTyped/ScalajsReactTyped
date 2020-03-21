package typingsJapgolly.gapiClientLogging.gapi.client.logging

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientLogging.AnonPrettyPrint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EntriesResource extends js.Object {
  /** Lists log entries. Use this method to retrieve log entries from Stackdriver Logging. For ways to export log entries, see Exporting Logs. */
  def list(request: AnonPrettyPrint): Request_[ListLogEntriesResponse]
  /**
    * Log entry resourcesWrites log entries to Stackdriver Logging. This API method is the only way to send log entries to Stackdriver Logging. This method
    * is used, directly or indirectly, by the Stackdriver Logging agent (fluentd) and all logging libraries configured to use Stackdriver Logging.
    */
  def write(request: AnonPrettyPrint): Request_[js.Object]
}

object EntriesResource {
  @scala.inline
  def apply(
    list: AnonPrettyPrint => CallbackTo[Request_[ListLogEntriesResponse]],
    write: AnonPrettyPrint => CallbackTo[Request_[js.Object]]
  ): EntriesResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientLogging.AnonPrettyPrint) => list(t0).runNow()))
    __obj.updateDynamic("write")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientLogging.AnonPrettyPrint) => write(t0).runNow()))
    __obj.asInstanceOf[EntriesResource]
  }
}

