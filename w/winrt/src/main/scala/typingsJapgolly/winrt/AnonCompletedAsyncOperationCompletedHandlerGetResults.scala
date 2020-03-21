package typingsJapgolly.winrt

import typingsJapgolly.winrt.Windows.Devices.Sms.SmsDevice
import typingsJapgolly.winrt.Windows.Foundation.AsyncOperationCompletedHandler
import typingsJapgolly.winrt.Windows.Foundation.AsyncStatus
import typingsJapgolly.winrt.Windows.Foundation.IAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCompletedAsyncOperationCompletedHandlerGetResults extends js.Object {
  @JSName("completed")
  var completed_Original: AsyncOperationCompletedHandler[SmsDevice] = js.native
  def completed(asyncInfo: IAsyncOperation[SmsDevice], asyncStatus: AsyncStatus): Unit = js.native
  def getResults(): SmsDevice = js.native
}

