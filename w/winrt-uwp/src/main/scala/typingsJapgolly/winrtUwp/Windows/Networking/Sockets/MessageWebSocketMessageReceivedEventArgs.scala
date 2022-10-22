package typingsJapgolly.winrtUwp.Windows.Networking.Sockets

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrtUwp.Windows.Storage.Streams.DataReader
import typingsJapgolly.winrtUwp.Windows.Storage.Streams.IInputStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data for a message received event on a MessageWebSocket . */
trait MessageWebSocketMessageReceivedEventArgs extends StObject {
  
  /**
    * Gets a DataReader object to read incoming data received from the remote network destination on a MessageWebSocket .
    * @return A DataReader object to read incoming data received from the remote network destination on a MessageWebSocket .
    */
  def getDataReader(): DataReader
  
  /**
    * Gets an IInputStream object (a message represented as a sequential stream of bytes) from the remote network destination on a MessageWebSocket object.
    * @return A message represented as a sequential stream of bytes.
    */
  def getDataStream(): IInputStream
  
  /** Gets the type of the message received by a MessageWebSocket object. */
  var messageType: SocketMessageType
}
object MessageWebSocketMessageReceivedEventArgs {
  
  inline def apply(
    getDataReader: CallbackTo[DataReader],
    getDataStream: CallbackTo[IInputStream],
    messageType: SocketMessageType
  ): MessageWebSocketMessageReceivedEventArgs = {
    val __obj = js.Dynamic.literal(getDataReader = getDataReader.toJsFn, getDataStream = getDataStream.toJsFn, messageType = messageType.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageWebSocketMessageReceivedEventArgs]
  }
  
  extension [Self <: MessageWebSocketMessageReceivedEventArgs](x: Self) {
    
    inline def setGetDataReader(value: CallbackTo[DataReader]): Self = StObject.set(x, "getDataReader", value.toJsFn)
    
    inline def setGetDataStream(value: CallbackTo[IInputStream]): Self = StObject.set(x, "getDataStream", value.toJsFn)
    
    inline def setMessageType(value: SocketMessageType): Self = StObject.set(x, "messageType", value.asInstanceOf[js.Any])
  }
}
