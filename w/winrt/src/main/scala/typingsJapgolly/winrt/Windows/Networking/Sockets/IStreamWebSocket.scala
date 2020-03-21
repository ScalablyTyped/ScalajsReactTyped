package typingsJapgolly.winrt.Windows.Networking.Sockets

import typingsJapgolly.winrt.Windows.Storage.Streams.IInputStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IStreamWebSocket extends IWebSocket {
  var control: StreamWebSocketControl = js.native
  var information: StreamWebSocketInformation = js.native
  var inputStream: IInputStream = js.native
}

