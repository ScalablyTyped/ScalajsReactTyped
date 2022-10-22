package typingsJapgolly.samchon

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.samchon.protocolCommunicatorIcommunicatorMod.ICommunicator
import typingsJapgolly.samchon.protocolInvokeInvokeMod.Invoke
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object protocolCommunicatorIserverconnectorMod {
  
  trait IServerConnector
    extends StObject
       with ICommunicator {
    
    /**
      * Connect to a server.
      *
      * Connects to a server with specified *host* address and *port* number. After the connection has
      * succeeded, callback function {@link onConnect} is called. Listening data from the connected server also begins.
      * Replied messages from the connected server will be converted to {@link Invoke} classes and will be shifted to
      * the {@link WebCommunicator.listener listener}'s {@link IProtocol.replyData replyData()} method.
      *
      * If the connection fails immediately, either an event is dispatched or an exception is thrown: an error
      * event is dispatched if a host was specified, and an exception is thrown if no host was specified. Otherwise,
      * the status of the connection is reported by an event. If the socket is already connected, the existing
      * connection is closed first.
      *
      * @param ip The name or IP address of the host to connect to.
      *			 If no host is specified, the host that is contacted is the host where the calling file resides.
      *			 If you do not specify a host, use an event listener to determine whether the connection was
      *			 successful.
      * @param port The port number to connect to.
      */
    def connect(ip: String, port: Double): Unit
    
    /**
      * Callback function for connection completed.
      *
      * When you call {@link connect connect()} and the connection has completed, then this call back function
      * {@link onConnect} will be called. Note that, if the listener of this {@link onConnect} is a member method of
      * some class, then you've use the ```bind```.
      */
    var onConnect: js.Function
  }
  object IServerConnector {
    
    inline def apply(
      close: Callback,
      connect: (String, Double) => Callback,
      isConnected: CallbackTo[Boolean],
      onClose: js.Function,
      onConnect: js.Function,
      replyData: Invoke => Callback,
      sendData: Invoke => Callback
    ): IServerConnector = {
      val __obj = js.Dynamic.literal(close = close.toJsFn, connect = js.Any.fromFunction2((t0: String, t1: Double) => (connect(t0, t1)).runNow()), isConnected = isConnected.toJsFn, onClose = onClose.asInstanceOf[js.Any], onConnect = onConnect.asInstanceOf[js.Any], replyData = js.Any.fromFunction1((t0: Invoke) => replyData(t0).runNow()), sendData = js.Any.fromFunction1((t0: Invoke) => sendData(t0).runNow()))
      __obj.asInstanceOf[IServerConnector]
    }
    
    extension [Self <: IServerConnector](x: Self) {
      
      inline def setConnect(value: (String, Double) => Callback): Self = StObject.set(x, "connect", js.Any.fromFunction2((t0: String, t1: Double) => (value(t0, t1)).runNow()))
      
      inline def setOnConnect(value: js.Function): Self = StObject.set(x, "onConnect", value.asInstanceOf[js.Any])
    }
  }
}
