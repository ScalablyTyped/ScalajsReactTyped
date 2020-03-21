package typingsJapgolly.gapiClientCloudbilling.gapi.client.cloudbilling

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientCloudbilling.AnonCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SkusResource extends js.Object {
  /** Lists all publicly available SKUs for a given cloud service. */
  def list(request: AnonCallback): Request_[ListSkusResponse]
}

object SkusResource {
  @scala.inline
  def apply(list: AnonCallback => CallbackTo[Request_[ListSkusResponse]]): SkusResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCloudbilling.AnonCallback) => list(t0).runNow()))
    __obj.asInstanceOf[SkusResource]
  }
}

