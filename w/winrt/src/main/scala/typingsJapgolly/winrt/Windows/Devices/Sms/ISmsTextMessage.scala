package typingsJapgolly.winrt.Windows.Devices.Sms

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrt.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISmsTextMessage extends ISmsMessage {
  var body: String
  var encoding: SmsEncoding
  var from: String
  var partCount: Double
  var partNumber: Double
  var partReferenceId: Double
  var timestamp: js.Date
  var to: String
  def toBinaryMessages(format: SmsDataFormat): IVectorView[ISmsBinaryMessage]
}

object ISmsTextMessage {
  @scala.inline
  def apply(
    body: String,
    encoding: SmsEncoding,
    from: String,
    id: Double,
    messageClass: SmsMessageClass,
    partCount: Double,
    partNumber: Double,
    partReferenceId: Double,
    timestamp: js.Date,
    to: String,
    toBinaryMessages: SmsDataFormat => CallbackTo[IVectorView[ISmsBinaryMessage]]
  ): ISmsTextMessage = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], encoding = encoding.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], messageClass = messageClass.asInstanceOf[js.Any], partCount = partCount.asInstanceOf[js.Any], partNumber = partNumber.asInstanceOf[js.Any], partReferenceId = partReferenceId.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    __obj.updateDynamic("toBinaryMessages")(js.Any.fromFunction1((t0: typingsJapgolly.winrt.Windows.Devices.Sms.SmsDataFormat) => toBinaryMessages(t0).runNow()))
    __obj.asInstanceOf[ISmsTextMessage]
  }
}

