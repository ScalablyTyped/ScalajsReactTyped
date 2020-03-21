package typingsJapgolly.winrt.Windows.Devices.Sms

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISmsTextMessageStatics extends js.Object {
  def fromBinaryData(format: SmsDataFormat, value: scala.scalajs.js.typedarray.Uint8Array): SmsTextMessage
  def fromBinaryMessage(binaryMessage: SmsBinaryMessage): SmsTextMessage
}

object ISmsTextMessageStatics {
  @scala.inline
  def apply(
    fromBinaryData: (SmsDataFormat, scala.scalajs.js.typedarray.Uint8Array) => CallbackTo[SmsTextMessage],
    fromBinaryMessage: SmsBinaryMessage => CallbackTo[SmsTextMessage]
  ): ISmsTextMessageStatics = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("fromBinaryData")(js.Any.fromFunction2((t0: typingsJapgolly.winrt.Windows.Devices.Sms.SmsDataFormat, t1: scala.scalajs.js.typedarray.Uint8Array) => fromBinaryData(t0, t1).runNow()))
    __obj.updateDynamic("fromBinaryMessage")(js.Any.fromFunction1((t0: typingsJapgolly.winrt.Windows.Devices.Sms.SmsBinaryMessage) => fromBinaryMessage(t0).runNow()))
    __obj.asInstanceOf[ISmsTextMessageStatics]
  }
}

