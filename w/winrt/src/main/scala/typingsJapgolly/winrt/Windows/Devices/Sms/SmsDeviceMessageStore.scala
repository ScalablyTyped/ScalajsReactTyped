package typingsJapgolly.winrt.Windows.Devices.Sms

import typingsJapgolly.winrt.Windows.Foundation.Collections.IVectorView
import typingsJapgolly.winrt.Windows.Foundation.IAsyncAction
import typingsJapgolly.winrt.Windows.Foundation.IAsyncOperation
import typingsJapgolly.winrt.Windows.Foundation.IAsyncOperationWithProgress
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Devices.Sms.SmsDeviceMessageStore")
@js.native
class SmsDeviceMessageStore () extends ISmsDeviceMessageStore {
  /* CompleteClass */
  override var maxMessages: Double = js.native
  /* CompleteClass */
  override def deleteMessageAsync(messageId: Double): IAsyncAction = js.native
  /* CompleteClass */
  override def deleteMessagesAsync(messageFilter: SmsMessageFilter): IAsyncAction = js.native
  /* CompleteClass */
  override def getMessageAsync(messageId: Double): IAsyncOperation[ISmsMessage] = js.native
  /* CompleteClass */
  override def getMessagesAsync(messageFilter: SmsMessageFilter): IAsyncOperationWithProgress[IVectorView[ISmsMessage], Double] = js.native
}

