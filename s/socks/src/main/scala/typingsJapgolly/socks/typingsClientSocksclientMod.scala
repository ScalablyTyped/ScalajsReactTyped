package typingsJapgolly.socks

import typingsJapgolly.node.eventsMod.EventEmitter
import typingsJapgolly.node.streamMod.Duplex
import typingsJapgolly.socks.socksStrings.bound
import typingsJapgolly.socks.socksStrings.error
import typingsJapgolly.socks.socksStrings.established
import typingsJapgolly.socks.typingsCommonConstantsMod.SocksClientBoundEvent
import typingsJapgolly.socks.typingsCommonConstantsMod.SocksClientChainOptions
import typingsJapgolly.socks.typingsCommonConstantsMod.SocksClientEstablishedEvent
import typingsJapgolly.socks.typingsCommonConstantsMod.SocksClientOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typingsClientSocksclientMod {
  
  /**
    * Error wrapper for SocksClient
    */
  @JSImport("socks/typings/client/socksclient", "SocksClientError")
  @js.native
  open class SocksClientError protected ()
    extends typingsJapgolly.socks.typingsCommonUtilMod.SocksClientError {
    def this(message: String, options: SocksClientChainOptions) = this()
    def this(message: String, options: SocksClientOptions) = this()
  }
  
  @js.native
  trait SocksClient extends EventEmitter {
    
    /**
      * Closes and destroys the underlying Socket. Emits an error event.
      * @param err { String } An error string to include in error event.
      */
    /* private */ var closeSocket: Any = js.native
    
    /**
      * Starts the connection establishment to the proxy and destination.
      * @param existingSocket Connected socket to use instead of creating a new one (internal use).
      */
    def connect(): Unit = js.native
    def connect(existingSocket: Duplex): Unit = js.native
    
    @JSName("emit")
    def emit_bound(event: bound, info: SocksClientBoundEvent): Boolean = js.native
    @JSName("emit")
    def emit_error(event: error, err: typingsJapgolly.socks.typingsCommonUtilMod.SocksClientError): Boolean = js.native
    @JSName("emit")
    def emit_established(event: established, info: SocksClientEstablishedEvent): Boolean = js.native
    
    /* private */ var getSocketOptions: Any = js.native
    
    /**
      * Handles Socks v5 auth handshake response.
      * @param data
      */
    /* private */ var handleInitialSocks5AuthenticationHandshakeResponse: Any = js.native
    
    /**
      * Handles initial Socks v5 handshake response.
      * @param data
      */
    /* private */ var handleInitialSocks5HandshakeResponse: Any = js.native
    
    /**
      * Handles Socks v4 handshake response.
      * @param data
      */
    /* private */ var handleSocks4FinalHandshakeResponse: Any = js.native
    
    /**
      * Handles Socks v4 incoming connection request (BIND)
      * @param data
      */
    /* private */ var handleSocks4IncomingConnectionResponse: Any = js.native
    
    /* private */ var handleSocks5AuthenticationNoAuthHandshakeResponse: Any = js.native
    
    /* private */ var handleSocks5AuthenticationUserPassHandshakeResponse: Any = js.native
    
    /* private */ var handleSocks5CustomAuthHandshakeResponse: Any = js.native
    
    /**
      * Handles Socks v5 final handshake response.
      * @param data
      */
    /* private */ var handleSocks5FinalHandshakeResponse: Any = js.native
    
    /**
      * Handles Socks v5 incoming connection request (BIND).
      */
    /* private */ var handleSocks5IncomingConnectionResponse: Any = js.native
    
    /* private */ var nextRequiredPacketBufferSize: Any = js.native
    
    /* private */ var onClose: Any = js.native
    
    /**
      * Handles Socket close event.
      * @param had_error
      */
    /* private */ var onCloseHandler: Any = js.native
    
    /* private */ var onConnect: Any = js.native
    
    /**
      * Handles Socket connect event.
      */
    /* private */ var onConnectHandler: Any = js.native
    
    /* private */ var onDataReceived: Any = js.native
    
    /**
      * Handles Socket data event.
      * @param data
      */
    /* private */ var onDataReceivedHandler: Any = js.native
    
    /* private */ var onError: Any = js.native
    
    /**
      * Handles Socket error event.
      * @param err
      */
    /* private */ var onErrorHandler: Any = js.native
    
    /**
      * Handles internal Socks timeout callback.
      * Note: If the Socks client is not BoundWaitingForConnection or Established, the connection will be closed.
      */
    /* private */ var onEstablishedTimeout: Any = js.native
    
    @JSName("on")
    def on_bound(event: bound, listener: js.Function1[/* info */ SocksClientBoundEvent, Unit]): this.type = js.native
    @JSName("on")
    def on_error(
      event: error,
      listener: js.Function1[/* err */ typingsJapgolly.socks.typingsCommonUtilMod.SocksClientError, Unit]
    ): this.type = js.native
    @JSName("on")
    def on_established(event: established, listener: js.Function1[/* info */ SocksClientEstablishedEvent, Unit]): this.type = js.native
    
    @JSName("once")
    def once_bound(event: bound, listener: js.Function1[/* info */ SocksClientBoundEvent, Unit]): this.type = js.native
    @JSName("once")
    def once_error(
      event: error,
      listener: js.Function1[/* err */ typingsJapgolly.socks.typingsCommonUtilMod.SocksClientError, Unit]
    ): this.type = js.native
    @JSName("once")
    def once_established(event: established, listener: js.Function1[/* info */ SocksClientEstablishedEvent, Unit]): this.type = js.native
    
    /* private */ var options: Any = js.native
    
    /**
      * Handles processing of the data we have received.
      */
    /* private */ var processData: Any = js.native
    
    /* private */ var receiveBuffer: Any = js.native
    
    /**
      * Removes internal event listeners on the underlying Socket.
      */
    /* private */ var removeInternalSocketHandlers: Any = js.native
    
    /**
      * Sends initial Socks v4 handshake request.
      */
    /* private */ var sendSocks4InitialHandshake: Any = js.native
    
    /**
      * Sends Socks v5 final handshake request.
      */
    /* private */ var sendSocks5CommandRequest: Any = js.native
    
    /* private */ var sendSocks5CustomAuthentication: Any = js.native
    
    /**
      * Sends initial Socks v5 handshake request.
      */
    /* private */ var sendSocks5InitialHandshake: Any = js.native
    
    /**
      * Sends Socks v5 user & password auth handshake.
      *
      * Note: No auth and user/pass are currently supported.
      */
    /* private */ var sendSocks5UserPassAuthentication: Any = js.native
    
    /**
      * Internal state setter. If the SocksClient is in an error state, it cannot be changed to a non error state.
      */
    /* private */ var setState: Any = js.native
    
    /* private */ var socket: Any = js.native
    
    /* private */ var socks5ChosenAuthType: Any = js.native
    
    def socksClientOptions: SocksClientOptions = js.native
    
    /* private */ var state: Any = js.native
  }
}
