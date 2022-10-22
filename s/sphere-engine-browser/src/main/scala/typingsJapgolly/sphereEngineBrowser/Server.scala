package typingsJapgolly.sphereEngineBrowser

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a TCP server that listens for incoming TCP connections on a specific port.
  */
trait Server extends StObject {
  
  /**
    * Accept a pending incoming connection and create a new `Socket` for it.
    * @returns A `Socket` for the newly completed connection.
    * @throws A `RangeError` is thrown if there are no pending connections.
    */
  def accept(): Socket
  
  /**
    * Get a promise for the `Socket` of the next incoming connection, whenever one is available.
    * @returns A promise for the next connection's `Socket`.
    */
  def acceptNext(): js.Promise[Socket]
  
  /**
    * Shut down the server. Incoming connections that haven't yet been accepted will be dropped.
    */
  def close(): Unit
  
  /**
    * Boolean value specifying whether Nagle's algorithm (write coalescing) should be **disabled**
    * for sockets spawned by this server.
    * @default false
    */
  var noDelay: Boolean
  
  /**
    * Number of incoming connections still waiting to be accepted.
    */
  var numPending: Double
}
object Server {
  
  inline def apply(
    accept: CallbackTo[Socket],
    acceptNext: CallbackTo[js.Promise[Socket]],
    close: Callback,
    noDelay: Boolean,
    numPending: Double
  ): Server = {
    val __obj = js.Dynamic.literal(accept = accept.toJsFn, acceptNext = acceptNext.toJsFn, close = close.toJsFn, noDelay = noDelay.asInstanceOf[js.Any], numPending = numPending.asInstanceOf[js.Any])
    __obj.asInstanceOf[Server]
  }
  
  extension [Self <: Server](x: Self) {
    
    inline def setAccept(value: CallbackTo[Socket]): Self = StObject.set(x, "accept", value.toJsFn)
    
    inline def setAcceptNext(value: CallbackTo[js.Promise[Socket]]): Self = StObject.set(x, "acceptNext", value.toJsFn)
    
    inline def setClose(value: Callback): Self = StObject.set(x, "close", value.toJsFn)
    
    inline def setNoDelay(value: Boolean): Self = StObject.set(x, "noDelay", value.asInstanceOf[js.Any])
    
    inline def setNumPending(value: Double): Self = StObject.set(x, "numPending", value.asInstanceOf[js.Any])
  }
}
