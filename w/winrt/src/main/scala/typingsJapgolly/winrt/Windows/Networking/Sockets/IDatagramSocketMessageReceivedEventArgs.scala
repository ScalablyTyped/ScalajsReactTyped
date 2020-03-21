package typingsJapgolly.winrt.Windows.Networking.Sockets

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrt.Windows.Networking.HostName
import typingsJapgolly.winrt.Windows.Storage.Streams.DataReader
import typingsJapgolly.winrt.Windows.Storage.Streams.IInputStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDatagramSocketMessageReceivedEventArgs extends js.Object {
  var localAddress: HostName
  var remoteAddress: HostName
  var remotePort: String
  def getDataReader(): DataReader
  def getDataStream(): IInputStream
}

object IDatagramSocketMessageReceivedEventArgs {
  @scala.inline
  def apply(
    getDataReader: CallbackTo[DataReader],
    getDataStream: CallbackTo[IInputStream],
    localAddress: HostName,
    remoteAddress: HostName,
    remotePort: String
  ): IDatagramSocketMessageReceivedEventArgs = {
    val __obj = js.Dynamic.literal(localAddress = localAddress.asInstanceOf[js.Any], remoteAddress = remoteAddress.asInstanceOf[js.Any], remotePort = remotePort.asInstanceOf[js.Any])
    __obj.updateDynamic("getDataReader")(getDataReader.toJsFn)
    __obj.updateDynamic("getDataStream")(getDataStream.toJsFn)
    __obj.asInstanceOf[IDatagramSocketMessageReceivedEventArgs]
  }
}

