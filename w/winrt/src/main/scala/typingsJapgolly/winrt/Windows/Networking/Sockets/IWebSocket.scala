package typingsJapgolly.winrt.Windows.Networking.Sockets

import typingsJapgolly.winrt.Windows.Foundation.IAsyncAction
import typingsJapgolly.winrt.Windows.Foundation.IClosable
import typingsJapgolly.winrt.Windows.Foundation.Uri
import typingsJapgolly.winrt.Windows.Storage.Streams.IOutputStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IWebSocket extends IClosable {
  var onclosed: js.Any = js.native
  var outputStream: IOutputStream = js.native
  def close(code: Double, reason: String): Unit = js.native
  def connectAsync(uri: Uri): IAsyncAction = js.native
  def setRequestHeader(headerName: String, headerValue: String): Unit = js.native
}

