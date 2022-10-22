package typingsJapgolly.winrtUwp.Windows.Networking.Sockets

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrtUwp.Windows.Networking.HostName
import typingsJapgolly.winrtUwp.Windows.Storage.Streams.DataReader
import typingsJapgolly.winrtUwp.Windows.Storage.Streams.IInputStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data for a MessageReceived event on a DatagramSocket . */
trait DatagramSocketMessageReceivedEventArgs extends StObject {
  
  /**
    * Gets a DataReader object to read incoming data received from the remote network destination on a DatagramSocket object.
    * @return A DataReader object to read incoming data received from the remote network destination on a DatagramSocket object.
    */
  def getDataReader(): DataReader
  
  /**
    * Gets an IInputStream object that represents a sequential stream of bytes to be read as a message from the remote network destination on a DatagramSocket object.
    * @return An IInputStream object that represents a sequential stream of bytes to be read as a message.
    */
  def getDataStream(): IInputStream
  
  /** Gets the local IP address associated with a DatagramSocket when a message was received. */
  var localAddress: HostName
  
  /** Gets the IP address of the remote sender of the datagram on the DatagramSocket when a message is received. */
  var remoteAddress: HostName
  
  /** Gets the UDP port number of the remote sender of the datagram received on the DatagramSocket . */
  var remotePort: String
}
object DatagramSocketMessageReceivedEventArgs {
  
  inline def apply(
    getDataReader: CallbackTo[DataReader],
    getDataStream: CallbackTo[IInputStream],
    localAddress: HostName,
    remoteAddress: HostName,
    remotePort: String
  ): DatagramSocketMessageReceivedEventArgs = {
    val __obj = js.Dynamic.literal(getDataReader = getDataReader.toJsFn, getDataStream = getDataStream.toJsFn, localAddress = localAddress.asInstanceOf[js.Any], remoteAddress = remoteAddress.asInstanceOf[js.Any], remotePort = remotePort.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatagramSocketMessageReceivedEventArgs]
  }
  
  extension [Self <: DatagramSocketMessageReceivedEventArgs](x: Self) {
    
    inline def setGetDataReader(value: CallbackTo[DataReader]): Self = StObject.set(x, "getDataReader", value.toJsFn)
    
    inline def setGetDataStream(value: CallbackTo[IInputStream]): Self = StObject.set(x, "getDataStream", value.toJsFn)
    
    inline def setLocalAddress(value: HostName): Self = StObject.set(x, "localAddress", value.asInstanceOf[js.Any])
    
    inline def setRemoteAddress(value: HostName): Self = StObject.set(x, "remoteAddress", value.asInstanceOf[js.Any])
    
    inline def setRemotePort(value: String): Self = StObject.set(x, "remotePort", value.asInstanceOf[js.Any])
  }
}
