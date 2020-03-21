package typingsJapgolly.winrt.Windows.Networking.NetworkOperators

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IUssdMessage extends js.Object {
  var dataCodingScheme: Double
  var payloadAsText: String
  def getPayload(): scala.scalajs.js.typedarray.Uint8Array
  def setPayload(value: scala.scalajs.js.typedarray.Uint8Array): Unit
}

object IUssdMessage {
  @scala.inline
  def apply(
    dataCodingScheme: Double,
    getPayload: CallbackTo[scala.scalajs.js.typedarray.Uint8Array],
    payloadAsText: String,
    setPayload: scala.scalajs.js.typedarray.Uint8Array => Callback
  ): IUssdMessage = {
    val __obj = js.Dynamic.literal(dataCodingScheme = dataCodingScheme.asInstanceOf[js.Any], payloadAsText = payloadAsText.asInstanceOf[js.Any])
    __obj.updateDynamic("getPayload")(getPayload.toJsFn)
    __obj.updateDynamic("setPayload")(js.Any.fromFunction1((t0: scala.scalajs.js.typedarray.Uint8Array) => setPayload(t0).runNow()))
    __obj.asInstanceOf[IUssdMessage]
  }
}

