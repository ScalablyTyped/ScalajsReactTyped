package typingsJapgolly.winrt.Windows.Networking.Sockets

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrt.Windows.Storage.Streams.DataReader
import typingsJapgolly.winrt.Windows.Storage.Streams.IInputStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IMessageWebSocketMessageReceivedEventArgs extends StObject {
  
  def getDataReader(): DataReader
  
  def getDataStream(): IInputStream
  
  var messageType: SocketMessageType
}
object IMessageWebSocketMessageReceivedEventArgs {
  
  inline def apply(
    getDataReader: CallbackTo[DataReader],
    getDataStream: CallbackTo[IInputStream],
    messageType: SocketMessageType
  ): IMessageWebSocketMessageReceivedEventArgs = {
    val __obj = js.Dynamic.literal(getDataReader = getDataReader.toJsFn, getDataStream = getDataStream.toJsFn, messageType = messageType.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMessageWebSocketMessageReceivedEventArgs]
  }
  
  extension [Self <: IMessageWebSocketMessageReceivedEventArgs](x: Self) {
    
    inline def setGetDataReader(value: CallbackTo[DataReader]): Self = StObject.set(x, "getDataReader", value.toJsFn)
    
    inline def setGetDataStream(value: CallbackTo[IInputStream]): Self = StObject.set(x, "getDataStream", value.toJsFn)
    
    inline def setMessageType(value: SocketMessageType): Self = StObject.set(x, "messageType", value.asInstanceOf[js.Any])
  }
}
