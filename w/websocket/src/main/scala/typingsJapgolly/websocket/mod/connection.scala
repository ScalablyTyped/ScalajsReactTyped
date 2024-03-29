package typingsJapgolly.websocket.mod

import org.scalablytyped.runtime.NumberDictionary
import typingsJapgolly.node.bufferMod.global.Buffer
import typingsJapgolly.node.eventsMod.EventEmitter
import typingsJapgolly.node.netMod.Socket
import typingsJapgolly.websocket.websocketStrings.close
import typingsJapgolly.websocket.websocketStrings.drain
import typingsJapgolly.websocket.websocketStrings.error
import typingsJapgolly.websocket.websocketStrings.message
import typingsJapgolly.websocket.websocketStrings.pause
import typingsJapgolly.websocket.websocketStrings.ping
import typingsJapgolly.websocket.websocketStrings.pong
import typingsJapgolly.websocket.websocketStrings.resume
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("websocket", "connection")
@js.native
open class connection protected () extends EventEmitter {
  def this(
    socket: Socket,
    extensions: js.Array[IExtension],
    protocol: String,
    maskOutgoingPackets: Boolean,
    config: IConfig
  ) = this()
  
  def _addSocketEventListeners(): Unit = js.native
  
  var _pingListenerCount: Double = js.native
  
  def addListener(event: drain | pause | resume, cb: js.Function0[Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_close(event: close, cb: js.Function2[/* code */ Double, /* desc */ String, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_error(event: error, cb: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_frame(event: typingsJapgolly.websocket.websocketStrings.frame, cb: js.Function1[/* frame */ frame, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_message(event: message, cb: js.Function1[/* data */ Message, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_ping(event: ping, cb: js.Function2[/* cancel */ js.Function0[Unit], /* binaryPayload */ Buffer, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_pong(event: pong, cb: js.Function1[/* binaryPayload */ Buffer, Unit]): this.type = js.native
  
  var assembleFragments: Double = js.native
  
  var bufferList: IBufferList = js.native
  
  var bytesWaitingToFlush: Double = js.native
  
  def clearCloseTimer(): Unit = js.native
  
  def clearGracePeriodTimer(): Unit = js.native
  
  def clearKeepaliveTimer(): Unit = js.native
  
  /**
    * Close the connection. A close frame will be sent to the remote peer indicating
    * that we wish to close the connection, and we will then wait for up to
    * `config.closeTimeout` milliseconds for an acknowledgment from the remote peer
    * before terminating the underlying socket connection.
    */
  def close(): Unit = js.native
  def close(reasonCode: Double): Unit = js.native
  def close(reasonCode: Double, description: String): Unit = js.native
  def close(reasonCode: Unit, description: String): Unit = js.native
  
  /**
    * After the connection is closed, contains a textual description of the reason for
    * the connection closure, or `null` if the connection is still open.
    */
  var closeDescription: String = js.native
  
  /**
    * After the connection is closed, contains the numeric close reason status code,
    * or `-1` if the connection is still open.
    */
  var closeReasonCode: Double = js.native
  
  var closeTimeout: Double = js.native
  
  var config: IConfig = js.native
  
  /** Whether or not the connection is still connected. Read-only */
  var connected: Boolean = js.native
  
  var currentFrame: frame = js.native
  
  /**
    * Send a close frame to the remote peer and immediately close the socket without
    * waiting for a response. This should generally be used only in error conditions.
    */
  def drop(): Unit = js.native
  def drop(reasonCode: Double): Unit = js.native
  def drop(reasonCode: Double, description: String): Unit = js.native
  def drop(reasonCode: Double, description: String, skipCloseFrame: Boolean): Unit = js.native
  def drop(reasonCode: Double, description: Unit, skipCloseFrame: Boolean): Unit = js.native
  def drop(reasonCode: Unit, description: String): Unit = js.native
  def drop(reasonCode: Unit, description: String, skipCloseFrame: Boolean): Unit = js.native
  def drop(reasonCode: Unit, description: Unit, skipCloseFrame: Boolean): Unit = js.native
  
  /** An array of extensions that were negotiated for this connection */
  var extensions: js.Array[IExtension] = js.native
  
  def fragmentAndSend(frame: frame): Unit = js.native
  def fragmentAndSend(frame: frame, cb: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
  
  var fragmentationSize: Double = js.native
  
  var frameHeader: Buffer = js.native
  
  var frameQueue: js.Array[frame] = js.native
  
  def handleCloseTimer(): Unit = js.native
  
  def handleGracePeriodTimer(): Unit = js.native
  
  def handleKeepaliveTimer(): Unit = js.native
  
  def handleSocketClose(hadError: Boolean): Unit = js.native
  
  def handleSocketData(data: Buffer): Unit = js.native
  
  def handleSocketDrain(): Unit = js.native
  
  def handleSocketEnd(): Unit = js.native
  
  def handleSocketError(error: js.Error): Unit = js.native
  
  def handleSocketPause(): Unit = js.native
  
  def handleSocketResume(): Unit = js.native
  
  var inputPaused: Boolean = js.native
  
  var maskBytes: Buffer = js.native
  
  var maskOutgoingPackets: Boolean = js.native
  
  var maxReceivedMessageSize: Double = js.native
  
  def on(event: drain | pause | resume, cb: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_close(event: close, cb: js.Function2[/* code */ Double, /* desc */ String, Unit]): this.type = js.native
  @JSName("on")
  def on_error(event: error, cb: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
  @JSName("on")
  def on_frame(event: typingsJapgolly.websocket.websocketStrings.frame, cb: js.Function1[/* frame */ frame, Unit]): this.type = js.native
  // Events
  @JSName("on")
  def on_message(event: message, cb: js.Function1[/* data */ Message, Unit]): this.type = js.native
  @JSName("on")
  def on_ping(event: ping, cb: js.Function2[/* cancel */ js.Function0[Unit], /* binaryPayload */ Buffer, Unit]): this.type = js.native
  @JSName("on")
  def on_pong(event: pong, cb: js.Function1[/* binaryPayload */ Buffer, Unit]): this.type = js.native
  
  var outputBufferFull: Boolean = js.native
  
  def pause(): Unit = js.native
  
  /** Sends a ping frame. Ping frames must not exceed 125 bytes in length. */
  def ping(data: Buffer): Unit = js.native
  def ping(data: IStringified): Unit = js.native
  
  /**
    * Sends a pong frame. Pong frames may be sent unsolicited and such pong frames will
    * trigger no action on the receiving peer. Pong frames sent in response to a ping
    * frame must mirror the payload data of the ping frame exactly.
    * The `connection` object handles this internally for you, so there should
    * be no need to use this method to respond to pings.
    * Pong frames must not exceed 125 bytes in length.
    */
  def pong(buffer: Buffer): Unit = js.native
  
  def processFrame(frame: frame): Unit = js.native
  
  def processReceivedData(): Unit = js.native
  
  /**
    * The subprotocol that was chosen to be spoken on this connection. This field
    * will have been converted to lower case.
    */
  var protocol: String = js.native
  
  var receivedEnd: Boolean = js.native
  
  /**
    * The IP address of the remote peer as a string. In the case of a server,
    * the `X-Forwarded-For` header will be respected and preferred for the purposes
    * of populating this field. If you need to get to the actual remote IP address,
    * `socket.remoteAddress` will provide it.
    */
  var remoteAddress: String = js.native
  
  def resume(): Unit = js.native
  
  /** Auto-detect the data type and send UTF-8 or Binary message */
  def send(data: Buffer): Unit = js.native
  def send(data: Buffer, cb: js.Function1[/* err */ js.UndefOr[js.Error], Unit]): Unit = js.native
  def send(data: IStringified): Unit = js.native
  def send(data: IStringified, cb: js.Function1[/* err */ js.UndefOr[js.Error], Unit]): Unit = js.native
  
  /**
    * Immediately sends the specified Node Buffer object as a Binary WebSocket message
    * to the remote peer. If config.fragmentOutgoingMessages is true the message may be
    * sent as multiple fragments if it exceeds config.fragmentationThreshold bytes.
    */
  def sendBytes(buffer: Buffer): Unit = js.native
  def sendBytes(buffer: Buffer, cb: js.Function1[/* err */ js.UndefOr[js.Error], Unit]): Unit = js.native
  
  def sendCloseFrame(): Unit = js.native
  def sendCloseFrame(reasonCode: Double): Unit = js.native
  def sendCloseFrame(reasonCode: Double, reasonText: String): Unit = js.native
  def sendCloseFrame(reasonCode: Double, reasonText: String, cb: js.Function1[/* err */ js.UndefOr[js.Error], Unit]): Unit = js.native
  def sendCloseFrame(reasonCode: Double, reasonText: Unit, cb: js.Function1[/* err */ js.UndefOr[js.Error], Unit]): Unit = js.native
  def sendCloseFrame(reasonCode: Unit, reasonText: String): Unit = js.native
  def sendCloseFrame(reasonCode: Unit, reasonText: String, cb: js.Function1[/* err */ js.UndefOr[js.Error], Unit]): Unit = js.native
  def sendCloseFrame(reasonCode: Unit, reasonText: Unit, cb: js.Function1[/* err */ js.UndefOr[js.Error], Unit]): Unit = js.native
  
  /**
    * Serializes a `frame` object into binary data and immediately sends it to
    * the remote peer. This is an advanced function, requiring you to manually compose
    * your own `frame`. You should probably use sendUTF or sendBytes instead.
    */
  def sendFrame(frame: frame): Unit = js.native
  def sendFrame(frame: frame, cb: js.Function1[/* err */ js.UndefOr[js.Error], Unit]): Unit = js.native
  
  /**
    * Immediately sends the specified string as a UTF-8 WebSocket message to the remote
    * peer. If `config.fragmentOutgoingMessages` is true the message may be sent as
    * multiple fragments if it exceeds `config.fragmentationThreshold` bytes.
    */
  def sendUTF(data: IStringified): Unit = js.native
  def sendUTF(data: IStringified, cb: js.Function1[/* err */ js.UndefOr[js.Error], Unit]): Unit = js.native
  
  def setCloseTimer(): Unit = js.native
  
  def setGracePeriodTimer(): Unit = js.native
  
  /** Set or reset the `keepalive` timer when data is received */
  def setKeepaliveTimer(): Unit = js.native
  
  var socket: Socket = js.native
  
  var socketHadError: Boolean = js.native
  
  var state: String = js.native
  
  var waitingForCloseResponse: Boolean = js.native
  
  /** The version of the WebSocket protocol requested by the client */
  var webSocketVersion: Double = js.native
}
/* static members */
object connection {
  
  @JSImport("websocket", "connection")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("websocket", "connection.CLOSE_DESCRIPTIONS")
  @js.native
  def CLOSE_DESCRIPTIONS: NumberDictionary[String] = js.native
  inline def CLOSE_DESCRIPTIONS_=(x: NumberDictionary[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLOSE_DESCRIPTIONS")(x.asInstanceOf[js.Any])
  
  @JSImport("websocket", "connection.CLOSE_REASON_ABNORMAL")
  @js.native
  def CLOSE_REASON_ABNORMAL: Double = js.native
  inline def CLOSE_REASON_ABNORMAL_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLOSE_REASON_ABNORMAL")(x.asInstanceOf[js.Any])
  
  @JSImport("websocket", "connection.CLOSE_REASON_EXTENSION_REQUIRED")
  @js.native
  def CLOSE_REASON_EXTENSION_REQUIRED: Double = js.native
  inline def CLOSE_REASON_EXTENSION_REQUIRED_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLOSE_REASON_EXTENSION_REQUIRED")(x.asInstanceOf[js.Any])
  
  @JSImport("websocket", "connection.CLOSE_REASON_GOING_AWAY")
  @js.native
  def CLOSE_REASON_GOING_AWAY: Double = js.native
  inline def CLOSE_REASON_GOING_AWAY_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLOSE_REASON_GOING_AWAY")(x.asInstanceOf[js.Any])
  
  @JSImport("websocket", "connection.CLOSE_REASON_INVALID_DATA")
  @js.native
  def CLOSE_REASON_INVALID_DATA: Double = js.native
  inline def CLOSE_REASON_INVALID_DATA_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLOSE_REASON_INVALID_DATA")(x.asInstanceOf[js.Any])
  
  @JSImport("websocket", "connection.CLOSE_REASON_MESSAGE_TOO_BIG")
  @js.native
  def CLOSE_REASON_MESSAGE_TOO_BIG: Double = js.native
  inline def CLOSE_REASON_MESSAGE_TOO_BIG_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLOSE_REASON_MESSAGE_TOO_BIG")(x.asInstanceOf[js.Any])
  
  @JSImport("websocket", "connection.CLOSE_REASON_NORMAL")
  @js.native
  def CLOSE_REASON_NORMAL: Double = js.native
  inline def CLOSE_REASON_NORMAL_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLOSE_REASON_NORMAL")(x.asInstanceOf[js.Any])
  
  @JSImport("websocket", "connection.CLOSE_REASON_NOT_PROVIDED")
  @js.native
  def CLOSE_REASON_NOT_PROVIDED: Double = js.native
  inline def CLOSE_REASON_NOT_PROVIDED_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLOSE_REASON_NOT_PROVIDED")(x.asInstanceOf[js.Any])
  
  @JSImport("websocket", "connection.CLOSE_REASON_POLICY_VIOLATION")
  @js.native
  def CLOSE_REASON_POLICY_VIOLATION: Double = js.native
  inline def CLOSE_REASON_POLICY_VIOLATION_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLOSE_REASON_POLICY_VIOLATION")(x.asInstanceOf[js.Any])
  
  @JSImport("websocket", "connection.CLOSE_REASON_PROTOCOL_ERROR")
  @js.native
  def CLOSE_REASON_PROTOCOL_ERROR: Double = js.native
  inline def CLOSE_REASON_PROTOCOL_ERROR_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLOSE_REASON_PROTOCOL_ERROR")(x.asInstanceOf[js.Any])
  
  @JSImport("websocket", "connection.CLOSE_REASON_RESERVED")
  @js.native
  def CLOSE_REASON_RESERVED: Double = js.native
  inline def CLOSE_REASON_RESERVED_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLOSE_REASON_RESERVED")(x.asInstanceOf[js.Any])
  
  @JSImport("websocket", "connection.CLOSE_REASON_UNPROCESSABLE_INPUT")
  @js.native
  def CLOSE_REASON_UNPROCESSABLE_INPUT: Double = js.native
  inline def CLOSE_REASON_UNPROCESSABLE_INPUT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLOSE_REASON_UNPROCESSABLE_INPUT")(x.asInstanceOf[js.Any])
}
