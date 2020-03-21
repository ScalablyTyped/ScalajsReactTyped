package typingsJapgolly.gapiClientCloudtrace.gapi.client.cloudtrace

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientCloudtrace.AnonAccesstoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TracesResource extends js.Object {
  var spans: SpansResource
  /**
    * Sends new spans to Stackdriver Trace or updates existing traces. If the
    * name of a trace that you send matches that of an existing trace, new spans
    * are added to the existing trace. Attempt to update existing spans results
    * undefined behavior. If the name does not match, a new trace is created
    * with given set of spans.
    */
  def batchWrite(request: AnonAccesstoken): Request_[js.Object]
}

object TracesResource {
  @scala.inline
  def apply(batchWrite: AnonAccesstoken => CallbackTo[Request_[js.Object]], spans: SpansResource): TracesResource = {
    val __obj = js.Dynamic.literal(spans = spans.asInstanceOf[js.Any])
    __obj.updateDynamic("batchWrite")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCloudtrace.AnonAccesstoken) => batchWrite(t0).runNow()))
    __obj.asInstanceOf[TracesResource]
  }
}

