package typingsJapgolly.winrt.Windows.Networking.Sockets

import typingsJapgolly.winrt.Windows.Networking.HostName
import typingsJapgolly.winrt.Windows.Storage.Streams.DataReader
import typingsJapgolly.winrt.Windows.Storage.Streams.IInputStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Networking.Sockets.DatagramSocketMessageReceivedEventArgs")
@js.native
class DatagramSocketMessageReceivedEventArgs () extends IDatagramSocketMessageReceivedEventArgs {
  /* CompleteClass */
  override var localAddress: HostName = js.native
  /* CompleteClass */
  override var remoteAddress: HostName = js.native
  /* CompleteClass */
  override var remotePort: String = js.native
  /* CompleteClass */
  override def getDataReader(): DataReader = js.native
  /* CompleteClass */
  override def getDataStream(): IInputStream = js.native
}

