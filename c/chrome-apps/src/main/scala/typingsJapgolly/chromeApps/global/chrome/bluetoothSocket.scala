package typingsJapgolly.chromeApps.global.chrome

import typingsJapgolly.chromeApps.chrome.bluetoothSocket.CreateInfo
import typingsJapgolly.chromeApps.chrome.bluetoothSocket.ListenOptions
import typingsJapgolly.chromeApps.chrome.bluetoothSocket.OnAcceptErrorEvent
import typingsJapgolly.chromeApps.chrome.bluetoothSocket.OnAcceptEvent
import typingsJapgolly.chromeApps.chrome.bluetoothSocket.OnReceiveErrorEvent
import typingsJapgolly.chromeApps.chrome.bluetoothSocket.OnReceiveEvent
import typingsJapgolly.chromeApps.chrome.bluetoothSocket.SocketInfo
import typingsJapgolly.chromeApps.chrome.bluetoothSocket.SocketProperties
import typingsJapgolly.chromeApps.chrome.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @since Chrome 37
  * @requires Manifest: 'bluetooth': {...}
  * @requires Important: This API works only on OS X, Windows and Chrome OS.
  * Use the chrome.bluetoothSocket API to send and receive data to Bluetooth devices using RFCOMM and L2CAP connections.
  */
object bluetoothSocket {
  
  @JSGlobal("chrome.bluetoothSocket")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Disconnects and destroys the socket.
    * Each socket created should be closed after use.
    * The socket id is no longer valid as soon at the
    * function is called. However, the socket is guaranteed
    * to be closed only when the callback is invoked.
    *
    * @param socketId The socket identifier.
    * @param callback Called when the `close` operation completes
    */
  inline def close(socketId: integer, callback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("close")(socketId.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Connects the socket to a remote Bluetooth device.
    * When the connect operation completes successfully,
    * onReceive events are raised when data is received
    * from the peer. If a network error occur while the
    * runtime is receiving packets, a onReceiveError
    * event is raised, at which point no more onReceive
    * event will be raised for this socket until the
    * setPaused(false) method is called.
    *
    * @param socketId The socket identifier.
    * @param address The address of the Bluetooth device.
    * @param uuid The UUID of the service to connect to.
    * @param callback Called when the connect attempt is complete.
    */
  inline def connect(socketId: integer, address: String, uuid: String, callback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("connect")(socketId.asInstanceOf[js.Any], address.asInstanceOf[js.Any], uuid.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Creates a Bluetooth socket.
    * @param callback Called when the socket has been created
    * */
  inline def create(callback: js.Function1[/* createInfo */ CreateInfo, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  /**
    * Creates a Bluetooth socket.
    * @param properties The socket properties (optional)
    * @param callback Called when the socket has been created
    */
  inline def create(properties: SocketProperties, callback: js.Function1[/* createInfo */ CreateInfo, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Disconnects the socket. The socket identifier remains valid.
    * @param socketId The socket identifier.
    * @param [callback] Called when the disconnect attempt is complete.
    */
  inline def disconnect(socketId: integer): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("disconnect")(socketId.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def disconnect(socketId: integer, callback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("disconnect")(socketId.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Retrieves the state of the given socket.
    * @param socketId The socket identifier.
    * @param callback Called when the socket state is available.
    *                 Callback returning object containing the socket information.
    */
  inline def getInfo(socketId: integer, callback: js.Function1[/* socketInfo */ SocketInfo, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getInfo")(socketId.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Retrieves the list of currently opened sockets owned by the application.
    * @param callback Called when the list of sockets is available.
    *                 Returns an array of socket info.
    */
  inline def getSockets(callback: js.Function1[/* sockets */ js.Array[SocketInfo], Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getSockets")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Listen for connections using the L2CAP protocol.
    *
    * @param socketId The socket identifier.
    * @param uuid Service UUID to listen on.
    * @param callback Called when listen operation completes.
    */
  inline def listenUsingL2cap(socketId: integer, uuid: String, callback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("listenUsingL2cap")(socketId.asInstanceOf[js.Any], uuid.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  /**
    * Listen for connections using the L2CAP protocol.
    *
    * @param socketId The socket identifier.
    * @param uuid Service UUID to listen on.
    * @param options Optional additional options for the service.
    * @param callback Called when listen operation completes.
    */
  inline def listenUsingL2cap(socketId: integer, uuid: String, options: ListenOptions, callback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("listenUsingL2cap")(socketId.asInstanceOf[js.Any], uuid.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Listen for connections using the RFCOMM protocol.
    *
    * @param socketId The socket identifier.
    * @param uuid Service UUID to listen on.
    * @param callback Called when listen operation completes.
    */
  inline def listenUsingRfcomm(socketId: integer, uuid: String, callback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("listenUsingRfcomm")(socketId.asInstanceOf[js.Any], uuid.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  /**
    * Listen for connections using the RFCOMM protocol.
    *
    * @param socketId The socket identifier.
    * @param uuid Service UUID to listen on.
    * @param options Optional additional options for the service.
    * @param callback Called when listen operation completes.
    */
  inline def listenUsingRfcomm(socketId: integer, uuid: String, options: ListenOptions, callback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("listenUsingRfcomm")(socketId.asInstanceOf[js.Any], uuid.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Event raised when a connection has been established
    * for a given socket.
    */
  @JSGlobal("chrome.bluetoothSocket.onAccept")
  @js.native
  val onAccept: OnAcceptEvent = js.native
  
  /**
    * Event raised when a network error occurred while the
    * runtime was waiting for new connections on the given
    * socket. Once this event is raised, the socket is set
    * to paused and no more onAccept events are raised for
    * this socket.
    */
  @JSGlobal("chrome.bluetoothSocket.onAcceptError")
  @js.native
  val onAcceptError: OnAcceptErrorEvent = js.native
  
  /**
    * Event raised when data has been received for a given socket.
    */
  @JSGlobal("chrome.bluetoothSocket.onReceive")
  @js.native
  val onReceive: OnReceiveEvent = js.native
  
  /**
    * Event raised when a network error occured while the runtime
    * was waiting for data on the socket. Once this event is raised,
    * the socket is set to paused and no more onReceive events are
    * raised for this socket.
    */
  @JSGlobal("chrome.bluetoothSocket.onReceiveError")
  @js.native
  val onReceiveError: OnReceiveErrorEvent = js.native
  
  /**
    * Sends data on the given Bluetooth socket.
    * @param socketId The socket identifier.
    * @param data The data to send.
    * @param [callback] Called with the number of bytes sent.
    */
  inline def send(socketId: integer, data: js.typedarray.ArrayBuffer): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("send")(socketId.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def send(
    socketId: integer,
    data: js.typedarray.ArrayBuffer,
    callback: js.Function1[/* bytesSent */ integer, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("send")(socketId.asInstanceOf[js.Any], data.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Enables or disables a connected socket from
    * receiving messages from its peer, or a listening
    * socket from accepting new connections. The default
    * value is 'false'. Pausing a connected socket is
    * typically used by an application to throttle data
    * sent by its peer. When a connected socket is paused,
    * no onReceiveevent is raised. When a socket is connected
    * and un-paused, onReceive events are raised again when
    * messages are received. When a listening socket is paused,
    * new connections are accepted until its backlog is full
    * then additional connection requests are refused.
    * onAccept events are raised only when the socket is un-paused.
    *
    * @param socketId The socket identifier.
    * @param paused Flag indicating whether a connected socket
    * blocks its peer from sending more data, or
    * whether connection requests on a listening
    * socket are dispatched through the onAccept
    * event or queued up in the listen queue backlog.
    * See setPaused. The default value is 'false'.
    * @param [callback] Callback from the setPaused method.
    */
  inline def setPaused(socketId: integer, paused: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setPaused")(socketId.asInstanceOf[js.Any], paused.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def setPaused(socketId: integer, paused: Boolean, callback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setPaused")(socketId.asInstanceOf[js.Any], paused.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Updates the socket properties.
    * @param socketId The socket identifier.
    * @param properties  The properties to update.
    * @param [callback] Called when the properties are updated.
    */
  inline def update(socketId: integer, properties: SocketProperties): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("update")(socketId.asInstanceOf[js.Any], properties.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def update(socketId: integer, properties: SocketProperties, callback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("update")(socketId.asInstanceOf[js.Any], properties.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
