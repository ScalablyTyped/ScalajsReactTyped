package typingsJapgolly.openui5.sap.ui.core

import typingsJapgolly.openui5.TypeofReadyState
import typingsJapgolly.openui5.sap.ui.base.EventProvider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.ui.core.ws")
@js.native
object ws extends js.Object {
  @js.native
  class SapPcpWebSocket protected () extends WebSocket {
    /**
      * Creates a new WebSocket connection and uses the pcp-protocol for communication.
      * @param sUrl relative or absolute URL for WebSocket connection.
      * @param aProtocols array of protocols as strings, a single protocol as a string.Protocol(s) should be
      * selected from {@link sap.ui.core.ws.SapPcpWebSocket.SUPPORTED_PROTOCOLS}.
      */
    def this(sUrl: String) = this()
    def this(sUrl: String, aProtocols: js.Array[_]) = this()
    def send(message: String, oPcpFields: js.Any): SapPcpWebSocket = js.native
    def send(message: js.Any): SapPcpWebSocket = js.native
    def send(message: js.Any, oPcpFields: js.Any): SapPcpWebSocket = js.native
    def send(message: js.Array[_]): SapPcpWebSocket = js.native
    def send(message: js.Array[_], oPcpFields: js.Any): SapPcpWebSocket = js.native
  }
  
  @js.native
  class WebSocket protected () extends EventProvider {
    /**
      * Creates a new WebSocket connection.
      * @param sUrl relative or absolute URL for WebSocket connection.
      * @param aProtocols array of protocols as strings, a single protocol as a string
      */
    def this(sUrl: String) = this()
    def this(sUrl: String, aProtocols: js.Array[_]) = this()
    /**
      * Attach event-handler <code>fnFunction</code> to the 'close' event of this
      * <code>sap.ui.core.ws.WebSocket</code>.<br>
      * @param oData The object, that should be passed along with the event-object when firing the event.
      * @param fnFunction The function to call, when the event occurs. This function will be called on the  
      *         oListener-instance (if present) or in a 'static way'.
      * @param oListener Object on which to call the given function. If empty, this WebSocket is used.
      * @returns <code>this</code> to allow method chaining
      */
    def attachClose(oData: js.Any, fnFunction: js.Any): WebSocket = js.native
    def attachClose(oData: js.Any, fnFunction: js.Any, oListener: js.Any): WebSocket = js.native
    /**
      * Attach event-handler <code>fnFunction</code> to the 'error' event of this
      * <code>sap.ui.core.ws.WebSocket</code>.<br>
      * @param oData The object, that should be passed along with the event-object when firing the event.
      * @param fnFunction The function to call, when the event occurs. This function will be called on the  
      *         oListener-instance (if present) or in a 'static way'.
      * @param oListener Object on which to call the given function. If empty, this WebSocket is used.
      * @returns <code>this</code> to allow method chaining
      */
    def attachError(oData: js.Any, fnFunction: js.Any): WebSocket = js.native
    def attachError(oData: js.Any, fnFunction: js.Any, oListener: js.Any): WebSocket = js.native
    /**
      * Attach event-handler <code>fnFunction</code> to the 'message' event of this
      * <code>sap.ui.core.ws.WebSocket</code>.<br>
      * @param oData The object, that should be passed along with the event-object when firing the event.
      * @param fnFunction The function to call, when the event occurs. This function will be called on the  
      *         oListener-instance (if present) or in a 'static way'.
      * @param oListener Object on which to call the given function. If empty, this WebSocket is used.
      * @returns <code>this</code> to allow method chaining
      */
    def attachMessage(oData: js.Any, fnFunction: js.Any): WebSocket = js.native
    def attachMessage(oData: js.Any, fnFunction: js.Any, oListener: js.Any): WebSocket = js.native
    /**
      * Attach event-handler <code>fnFunction</code> to the 'open' event of this
      * <code>sap.ui.core.ws.WebSocket</code>.<br>
      * @param oData The object, that should be passed along with the event-object when firing the event.
      * @param fnFunction The function to call, when the event occurs. This function will be called on the  
      *         oListener-instance (if present) or in a 'static way'.
      * @param oListener Object on which to call the given function. If empty, this WebSocket is used.
      * @returns <code>this</code> to allow method chaining
      */
    def attachOpen(oData: js.Any, fnFunction: js.Any): WebSocket = js.native
    def attachOpen(oData: js.Any, fnFunction: js.Any, oListener: js.Any): WebSocket = js.native
    /**
      * Closes the connection.
      * @param iCode Status code that explains why the connection is closed. Must be either 1000, or between
      * 3000 and 4999 (default 1000)
      * @param sReason Closing reason as a string
      * @returns <code>this</code> to allow method chaining
      */
    def close(iCode: Double): WebSocket = js.native
    def close(iCode: Double, sReason: String): WebSocket = js.native
    /**
      * Detach event-handler <code>fnFunction</code> from the 'close' event of this
      * <code>sap.ui.core.ws.WebSocket</code>.<br>The passed function and listener object must match the
      * ones previously used for event registration.
      * @param fnFunction The function to call, when the event occurs.
      * @param oListener Object on which the given function had to be called.
      * @returns <code>this</code> to allow method chaining
      */
    def detachClose(fnFunction: js.Any, oListener: js.Any): WebSocket = js.native
    /**
      * Detach event-handler <code>fnFunction</code> from the 'error' event of this
      * <code>sap.ui.core.ws.WebSocket</code>.<br>The passed function and listener object must match the
      * ones previously used for event registration.
      * @param fnFunction The function to call, when the event occurs.
      * @param oListener Object on which the given function had to be called.
      * @returns <code>this</code> to allow method chaining
      */
    def detachError(fnFunction: js.Any, oListener: js.Any): WebSocket = js.native
    /**
      * Detach event-handler <code>fnFunction</code> from the 'message' event of this
      * <code>sap.ui.core.ws.WebSocket</code>.<br>The passed function and listener object must match the
      * ones previously used for event registration.
      * @param fnFunction The function to call, when the event occurs.
      * @param oListener Object on which the given function had to be called.
      * @returns <code>this</code> to allow method chaining
      */
    def detachMessage(fnFunction: js.Any, oListener: js.Any): WebSocket = js.native
    /**
      * Detach event-handler <code>fnFunction</code> from the 'open' event of this
      * <code>sap.ui.core.ws.WebSocket</code>.<br>The passed function and listener object must match the
      * ones previously used for event registration.
      * @param fnFunction The function to call, when the event occurs.
      * @param oListener Object on which the given function had to be called.
      * @returns <code>this</code> to allow method chaining
      */
    def detachOpen(fnFunction: js.Any, oListener: js.Any): WebSocket = js.native
    /**
      * Fire event 'close' to attached listeners.
      * @param mArguments the arguments to pass along with the event.
      * @returns <code>this</code> to allow method chaining
      */
    def fireClose(mArguments: js.Any): WebSocket = js.native
    /**
      * Fire event 'error' to attached listeners.
      * @param mArguments the arguments to pass along with the event.
      * @returns <code>this</code> to allow method chaining
      */
    def fireError(mArguments: js.Any): WebSocket = js.native
    /**
      * Fire event 'message' to attached listeners.
      * @param mArguments the arguments to pass along with the event.
      * @returns <code>this</code> to allow method chaining
      */
    def fireMessage(mArguments: js.Any): WebSocket = js.native
    /**
      * Fire event 'open' to attached listeners.
      * @param mArguments the arguments to pass along with the event.
      * @returns <code>this</code> to allow method chaining
      */
    def fireOpen(mArguments: js.Any): WebSocket = js.native
    /**
      * Getter for the protocol selected by the server once the connection is open.
      * @returns protocol
      */
    def getProtocol(): String = js.native
    /**
      * Getter for WebSocket readyState.
      * @returns readyState
      */
    def getReadyState(): TypeofReadyState = js.native
    /**
      * Sends a message.<br><br>If the connection is not yet opened, the message will be queued and sentwhen
      * the connection is established.
      * @param sMessage Message to send
      * @returns <code>this</code> to allow method chaining
      */
    def send(sMessage: String): WebSocket = js.native
  }
  
  @js.native
  object ReadyState extends js.Object {
    /**
      * The connection has been closed or could not be opened.
      */
    var CLOSED: js.Any = js.native
    /**
      * The connection is going through the closing handshake.
      */
    var CLOSING: js.Any = js.native
    /**
      * The connection has not yet been established.
      */
    var CONNECTING: js.Any = js.native
    /**
      * The WebSocket connection is established and communication is possible.
      */
    var OPEN: js.Any = js.native
  }
  
  @js.native
  object SapPcpWebSocket extends js.Object {
    @js.native
    object SUPPORTED_PROTOCOLS extends js.Object {
      /**
        * Protocol v10.pcp.sap.com
        */
      var v10: js.Any = js.native
    }
    
  }
  
}

