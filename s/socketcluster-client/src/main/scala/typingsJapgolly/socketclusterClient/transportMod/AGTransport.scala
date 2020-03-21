package typingsJapgolly.socketclusterClient.transportMod

import typingsJapgolly.socketclusterClient.authMod.AGAuthEngine
import typingsJapgolly.socketclusterClient.clientsocketMod.CallIdGenerator
import typingsJapgolly.socketclusterClient.clientsocketMod.ClientOptions
import typingsJapgolly.socketclusterClient.clientsocketMod.ProtocolVersions
import typingsJapgolly.socketclusterClient.clientsocketMod.States
import typingsJapgolly.socketclusterClient.socketclusterClientStrings.closed
import typingsJapgolly.socketclusterClient.socketclusterClientStrings.connecting
import typingsJapgolly.socketclusterClient.socketclusterClientStrings.open
import typingsJapgolly.socketclusterServer.serverMod.CodecEngine
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AGTransport extends js.Object {
  val CLOSED: closed = js.native
  val CONNECTING: connecting = js.native
  val OPEN: open = js.native
  var auth: AGAuthEngine = js.native
  var authTokenName: String = js.native
  @JSName("callIdGenerator")
  var callIdGenerator_Original: CallIdGenerator = js.native
  var codec: CodecEngine = js.native
  var connectTimeout: Double = js.native
  var isBufferingBatch: Boolean = js.native
  var options: ClientOptions = js.native
  var pingTimeout: Double = js.native
  var pingTimeoutDisabled: Boolean = js.native
  var protocolVersion: ProtocolVersions = js.native
  var socket: typingsJapgolly.ws.mod.^ = js.native
  var state: States = js.native
  var wsOptions: js.UndefOr[typingsJapgolly.ws.mod.ClientOptions] = js.native
  def callIdGenerator(): Double = js.native
  def cancelBatch(): Unit = js.native
  def cancelPendingResponse(cid: Double): Unit = js.native
  def clearAllListeners(): Unit = js.native
  def close(): Unit = js.native
  def close(code: Double): Unit = js.native
  def close(code: Double, reason: String): Unit = js.native
  def decode(message: js.Any): js.Any = js.native
  def encode(`object`: js.Any): js.Any = js.native
  def flushBatch(): Unit = js.native
  def invoke[T](event: String, data: T, options: InvokeOptions): js.Promise[T] = js.native
  def invokeRaw(event: String, data: js.Any, options: InvokeOptions): Double | Null = js.native
  def invokeRaw(event: String, data: js.Any, options: InvokeOptions, callback: EventObjectCallback): Double | Null = js.native
  def send(data: js.Any): Unit = js.native
  def sendObject(`object`: js.Any): Unit = js.native
  def serializeObject(`object`: js.Any): js.Any = js.native
  def startBatch(): Unit = js.native
  def transmit(event: String, data: js.Any, options: TransmitOptions): js.Promise[Unit] = js.native
  def transmitObject(eventObject: EventObject): Double | Null = js.native
  def uri(): String = js.native
}

