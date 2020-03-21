package typingsJapgolly.winrt.Windows.Devices.Sms

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISmsDevice extends js.Object {
  var accountPhoneNumber: String
  var cellularClass: CellularClass
  var deviceStatus: SmsDeviceStatus
  var messageStore: SmsDeviceMessageStore
  var onsmsdevicestatuschanged: js.Any
  var onsmsmessagereceived: js.Any
  def calculateLength(message: SmsTextMessage): SmsEncodedLength
  def sendMessageAsync(message: ISmsMessage): SendSmsMessageOperation
}

object ISmsDevice {
  @scala.inline
  def apply(
    accountPhoneNumber: String,
    calculateLength: SmsTextMessage => CallbackTo[SmsEncodedLength],
    cellularClass: CellularClass,
    deviceStatus: SmsDeviceStatus,
    messageStore: SmsDeviceMessageStore,
    onsmsdevicestatuschanged: js.Any,
    onsmsmessagereceived: js.Any,
    sendMessageAsync: ISmsMessage => CallbackTo[SendSmsMessageOperation]
  ): ISmsDevice = {
    val __obj = js.Dynamic.literal(accountPhoneNumber = accountPhoneNumber.asInstanceOf[js.Any], cellularClass = cellularClass.asInstanceOf[js.Any], deviceStatus = deviceStatus.asInstanceOf[js.Any], messageStore = messageStore.asInstanceOf[js.Any], onsmsdevicestatuschanged = onsmsdevicestatuschanged.asInstanceOf[js.Any], onsmsmessagereceived = onsmsmessagereceived.asInstanceOf[js.Any])
    __obj.updateDynamic("calculateLength")(js.Any.fromFunction1((t0: typingsJapgolly.winrt.Windows.Devices.Sms.SmsTextMessage) => calculateLength(t0).runNow()))
    __obj.updateDynamic("sendMessageAsync")(js.Any.fromFunction1((t0: typingsJapgolly.winrt.Windows.Devices.Sms.ISmsMessage) => sendMessageAsync(t0).runNow()))
    __obj.asInstanceOf[ISmsDevice]
  }
}

