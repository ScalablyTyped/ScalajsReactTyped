package typingsJapgolly.winrt.Windows.Networking.Sockets

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrt.Windows.Storage.Streams.DataReader
import typingsJapgolly.winrt.Windows.Storage.Streams.IInputStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MessageWebSocketMessageReceivedEventArgs
  extends StObject
     with IMessageWebSocketMessageReceivedEventArgs
object MessageWebSocketMessageReceivedEventArgs {
  
  inline def apply(
    getDataReader: CallbackTo[DataReader],
    getDataStream: CallbackTo[IInputStream],
    messageType: SocketMessageType
  ): MessageWebSocketMessageReceivedEventArgs = {
    val __obj = js.Dynamic.literal(getDataReader = getDataReader.toJsFn, getDataStream = getDataStream.toJsFn, messageType = messageType.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageWebSocketMessageReceivedEventArgs]
  }
}
