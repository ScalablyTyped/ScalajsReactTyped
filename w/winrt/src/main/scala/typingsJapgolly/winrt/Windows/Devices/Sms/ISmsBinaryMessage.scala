package typingsJapgolly.winrt.Windows.Devices.Sms

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISmsBinaryMessage extends ISmsMessage {
  var format: SmsDataFormat
  def getData(): scala.scalajs.js.typedarray.Uint8Array
  def setData(value: scala.scalajs.js.typedarray.Uint8Array): Unit
}

object ISmsBinaryMessage {
  @scala.inline
  def apply(
    format: SmsDataFormat,
    getData: CallbackTo[scala.scalajs.js.typedarray.Uint8Array],
    id: Double,
    messageClass: SmsMessageClass,
    setData: scala.scalajs.js.typedarray.Uint8Array => Callback
  ): ISmsBinaryMessage = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], messageClass = messageClass.asInstanceOf[js.Any])
    __obj.updateDynamic("getData")(getData.toJsFn)
    __obj.updateDynamic("setData")(js.Any.fromFunction1((t0: scala.scalajs.js.typedarray.Uint8Array) => setData(t0).runNow()))
    __obj.asInstanceOf[ISmsBinaryMessage]
  }
}

