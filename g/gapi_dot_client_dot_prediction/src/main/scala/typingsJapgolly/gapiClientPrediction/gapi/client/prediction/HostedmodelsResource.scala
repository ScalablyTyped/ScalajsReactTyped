package typingsJapgolly.gapiClientPrediction.gapi.client.prediction

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientPrediction.AnonAlt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HostedmodelsResource extends js.Object {
  /** Submit input and request an output against a hosted model. */
  def predict(request: AnonAlt): Request_[Output]
}

object HostedmodelsResource {
  @scala.inline
  def apply(predict: AnonAlt => CallbackTo[Request_[Output]]): HostedmodelsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("predict")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientPrediction.AnonAlt) => predict(t0).runNow()))
    __obj.asInstanceOf[HostedmodelsResource]
  }
}

