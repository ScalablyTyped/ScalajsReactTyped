package typingsJapgolly.gapiClientClouderrorreporting.gapi.client.clouderrorreporting

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientClouderrorreporting.AnonAccesstoken
import typingsJapgolly.gapiClientClouderrorreporting.AnonAlt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventsResource extends js.Object {
  /** Lists the specified events. */
  def list(request: AnonAccesstoken): Request_[ListEventsResponse]
  /**
    * Report an individual error event.
    *
    * This endpoint accepts <strong>either</strong> an OAuth token,
    * <strong>or</strong> an
    * <a href="https://support.google.com/cloud/answer/6158862">API key</a>
    * for authentication. To use an API key, append it to the URL as the value of
    * a `key` parameter. For example:
    * <pre>POST https://clouderrorreporting.googleapis.com/v1beta1/projects/example-project/events:report?key=123ABC456</pre>
    */
  def report(request: AnonAlt): Request_[js.Object]
}

object EventsResource {
  @scala.inline
  def apply(
    list: AnonAccesstoken => CallbackTo[Request_[ListEventsResponse]],
    report: AnonAlt => CallbackTo[Request_[js.Object]]
  ): EventsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientClouderrorreporting.AnonAccesstoken) => list(t0).runNow()))
    __obj.updateDynamic("report")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientClouderrorreporting.AnonAlt) => report(t0).runNow()))
    __obj.asInstanceOf[EventsResource]
  }
}

