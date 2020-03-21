package typingsJapgolly.winrt.Windows.Networking.Sockets

import typingsJapgolly.winrt.Windows.Foundation.Collections.IVectorView
import typingsJapgolly.winrt.Windows.Foundation.IAsyncOperation
import typingsJapgolly.winrt.Windows.Networking.EndpointPair
import typingsJapgolly.winrt.Windows.Networking.HostName
import typingsJapgolly.winrt.Windows.Networking.HostNameSortOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Networking.Sockets.DatagramSocket")
@js.native
class DatagramSocket () extends IDatagramSocket {
  /* CompleteClass */
  override def close(): Unit = js.native
  def dispose(): Unit = js.native
}

/* static members */
@JSGlobal("Windows.Networking.Sockets.DatagramSocket")
@js.native
object DatagramSocket extends js.Object {
  def getEndpointPairsAsync(remoteHostName: HostName, remoteServiceName: String): IAsyncOperation[IVectorView[EndpointPair]] = js.native
  def getEndpointPairsAsync(remoteHostName: HostName, remoteServiceName: String, sortOptions: HostNameSortOptions): IAsyncOperation[IVectorView[EndpointPair]] = js.native
}

