package typingsJapgolly.winrt

import typingsJapgolly.winrt.Windows.Devices.Sms.ISmsMessage
import typingsJapgolly.winrt.Windows.Foundation.AsyncOperationCompletedHandler
import typingsJapgolly.winrt.Windows.Foundation.AsyncStatus
import typingsJapgolly.winrt.Windows.Foundation.IAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCompletedAsyncOperationCompletedHandler extends js.Object {
  @JSName("completed")
  var completed_Original: AsyncOperationCompletedHandler[ISmsMessage] = js.native
  def completed(asyncInfo: IAsyncOperation[ISmsMessage], asyncStatus: AsyncStatus): Unit = js.native
  def getResults(): ISmsMessage = js.native
}

