package typingsJapgolly.twilsock.twilsockMod

import typingsJapgolly.node.eventsMod.EventEmitter
import typingsJapgolly.twilsock.configurationMod.Configuration
import typingsJapgolly.twilsock.packetinterfaceMod.PacketInterface
import typingsJapgolly.twilsock.twilsockMod.TwilsockChannel.State
import typingsJapgolly.twilsock.websocketchannelMod.WebSocketChannel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Twilsock channel level protocol implementation
  */
@JSImport("twilsock/lib/twilsock", "TwilsockChannel")
@js.native
class TwilsockChannel_ protected () extends EventEmitter {
  def this(websocket: WebSocketChannel, transport: PacketInterface, config: Configuration) = this()
  var cancelDisconnectTimer: js.Any = js.native
  var cancelInit: js.Any = js.native
  var cancelUpdate: js.Any = js.native
  var changeState: js.Any = js.native
  /**
    * Shutdown connection
    */
  var closeSocket: js.Any = js.native
  val config: js.Any = js.native
  /**
    * Should be called for each message to confirm it received
    */
  var confirmReceiving: js.Any = js.native
  var disconnectedPromiseResolve: js.Any = js.native
  var disconnectingTimer: js.Any = js.native
  var emitReplyConnectionError: js.Any = js.native
  var finalizeSocket: js.Any = js.native
  val fsm: js.Any = js.native
  var initRetry: js.Any = js.native
  val isConnected: Boolean = js.native
  val isTerminalState: Boolean = js.native
  var lastEmittedState: js.Any = js.native
  var modifyBackoff: js.Any = js.native
  var onCloseReceived: js.Any = js.native
  var onConnected: js.Any = js.native
  var onIncomingMessage: js.Any = js.native
  var resetBackoff: js.Any = js.native
  var retrier: js.Any = js.native
  var retry: js.Any = js.native
  var sendInit: js.Any = js.native
  var sendUpdate: js.Any = js.native
  var setupSocket: js.Any = js.native
  var startDisconnectTimer: js.Any = js.native
  val state: State = js.native
  val terminalStates: js.Any = js.native
  val tokenExpiredSasCode: js.Any = js.native
  var transport: js.Any = js.native
  var transportReady: js.Any = js.native
  var websocket: js.Any = js.native
  /**
    * Initiate the twilsock connection
    * If already connected, it does nothing
    */
  def connect(): Unit = js.native
  /**
    * Close twilsock connection
    * If already disconnected, it does nothing
    */
  def disconnect(): js.Promise[Unit] = js.native
  /**
    * Update fpa token for twilsock connection
    */
  def updateToken(token: String): js.Promise[Unit] = js.native
}

