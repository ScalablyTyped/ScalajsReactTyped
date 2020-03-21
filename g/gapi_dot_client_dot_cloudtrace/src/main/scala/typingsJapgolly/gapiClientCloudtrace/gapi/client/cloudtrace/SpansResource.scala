package typingsJapgolly.gapiClientCloudtrace.gapi.client.cloudtrace

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientCloudtrace.AnonAccesstoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpansResource extends js.Object {
  /** Creates a new Span. */
  def create(request: AnonAccesstoken): Request_[Span]
}

object SpansResource {
  @scala.inline
  def apply(create: AnonAccesstoken => CallbackTo[Request_[Span]]): SpansResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("create")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCloudtrace.AnonAccesstoken) => create(t0).runNow()))
    __obj.asInstanceOf[SpansResource]
  }
}

