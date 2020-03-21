package typingsJapgolly.winrt.Windows.Networking.Sockets

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrt.Windows.Storage.Streams.DataReader
import typingsJapgolly.winrt.Windows.Storage.Streams.IInputStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMessageWebSocketMessageReceivedEventArgs extends js.Object {
  var messageType: SocketMessageType
  def getDataReader(): DataReader
  def getDataStream(): IInputStream
}

object IMessageWebSocketMessageReceivedEventArgs {
  @scala.inline
  def apply(
    getDataReader: CallbackTo[DataReader],
    getDataStream: CallbackTo[IInputStream],
    messageType: SocketMessageType
  ): IMessageWebSocketMessageReceivedEventArgs = {
    val __obj = js.Dynamic.literal(messageType = messageType.asInstanceOf[js.Any])
    __obj.updateDynamic("getDataReader")(getDataReader.toJsFn)
    __obj.updateDynamic("getDataStream")(getDataStream.toJsFn)
    __obj.asInstanceOf[IMessageWebSocketMessageReceivedEventArgs]
  }
}

