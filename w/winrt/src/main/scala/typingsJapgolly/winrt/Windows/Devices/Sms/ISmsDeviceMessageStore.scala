package typingsJapgolly.winrt.Windows.Devices.Sms

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrt.Windows.Foundation.Collections.IVectorView
import typingsJapgolly.winrt.Windows.Foundation.IAsyncAction
import typingsJapgolly.winrt.Windows.Foundation.IAsyncOperation
import typingsJapgolly.winrt.Windows.Foundation.IAsyncOperationWithProgress
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISmsDeviceMessageStore extends js.Object {
  var maxMessages: Double
  def deleteMessageAsync(messageId: Double): IAsyncAction
  def deleteMessagesAsync(messageFilter: SmsMessageFilter): IAsyncAction
  def getMessageAsync(messageId: Double): IAsyncOperation[ISmsMessage]
  def getMessagesAsync(messageFilter: SmsMessageFilter): IAsyncOperationWithProgress[IVectorView[ISmsMessage], Double]
}

object ISmsDeviceMessageStore {
  @scala.inline
  def apply(
    deleteMessageAsync: Double => CallbackTo[IAsyncAction],
    deleteMessagesAsync: SmsMessageFilter => CallbackTo[IAsyncAction],
    getMessageAsync: Double => CallbackTo[IAsyncOperation[ISmsMessage]],
    getMessagesAsync: SmsMessageFilter => CallbackTo[IAsyncOperationWithProgress[IVectorView[ISmsMessage], Double]],
    maxMessages: Double
  ): ISmsDeviceMessageStore = {
    val __obj = js.Dynamic.literal(maxMessages = maxMessages.asInstanceOf[js.Any])
    __obj.updateDynamic("deleteMessageAsync")(js.Any.fromFunction1((t0: scala.Double) => deleteMessageAsync(t0).runNow()))
    __obj.updateDynamic("deleteMessagesAsync")(js.Any.fromFunction1((t0: typingsJapgolly.winrt.Windows.Devices.Sms.SmsMessageFilter) => deleteMessagesAsync(t0).runNow()))
    __obj.updateDynamic("getMessageAsync")(js.Any.fromFunction1((t0: scala.Double) => getMessageAsync(t0).runNow()))
    __obj.updateDynamic("getMessagesAsync")(js.Any.fromFunction1((t0: typingsJapgolly.winrt.Windows.Devices.Sms.SmsMessageFilter) => getMessagesAsync(t0).runNow()))
    __obj.asInstanceOf[ISmsDeviceMessageStore]
  }
}

