package typingsJapgolly.winrt.Windows.Devices.Sms

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISmsMessage extends js.Object {
  var id: Double
  var messageClass: SmsMessageClass
}

object ISmsMessage {
  @scala.inline
  def apply(id: Double, messageClass: SmsMessageClass): ISmsMessage = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], messageClass = messageClass.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ISmsMessage]
  }
}

