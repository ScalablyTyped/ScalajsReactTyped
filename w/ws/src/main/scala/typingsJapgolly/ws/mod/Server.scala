package typingsJapgolly.ws.mod

import typingsJapgolly.node.Buffer
import typingsJapgolly.node.eventsMod.EventEmitter
import typingsJapgolly.node.httpMod.IncomingMessage
import typingsJapgolly.node.netMod.Socket
import typingsJapgolly.std.Set
import typingsJapgolly.ws.wsStrings.close
import typingsJapgolly.ws.wsStrings.connection
import typingsJapgolly.ws.wsStrings.error
import typingsJapgolly.ws.wsStrings.headers
import typingsJapgolly.ws.wsStrings.listening
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// WebSocket Server
@JSImport("ws", "Server")
@js.native
class Server () extends EventEmitter {
  def this(options: ServerOptions) = this()
  def this(options: ServerOptions, callback: js.Function0[Unit]) = this()
  var clients: Set[WebSocket] = js.native
  var options: ServerOptions = js.native
  var path: String = js.native
  @JSName("addListener")
  def addListener_close(event: close, cb: js.Function0[Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_connection(event: connection, cb: js.Function1[/* client */ WebSocket, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_error(event: error, cb: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_headers(
    event: headers,
    cb: js.Function2[/* headers */ js.Array[String], /* request */ IncomingMessage, Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_listening(event: listening, cb: js.Function0[Unit]): this.type = js.native
  def address(): AddressInfo | String = js.native
  def close(): Unit = js.native
  def close(cb: js.Function1[/* err */ js.UndefOr[js.Error], Unit]): Unit = js.native
  def handleUpgrade(
    request: IncomingMessage,
    socket: Socket,
    upgradeHead: Buffer,
    callback: js.Function1[/* client */ WebSocket, Unit]
  ): Unit = js.native
  def on(event: String, listener: js.ThisFunction1[/* this */ this.type, /* repeated */ js.Any, Unit]): this.type = js.native
  def on(event: js.Symbol, listener: js.ThisFunction1[/* this */ this.type, /* repeated */ js.Any, Unit]): this.type = js.native
  @JSName("on")
  def on_close(event: close, cb: js.ThisFunction0[/* this */ this.type, Unit]): this.type = js.native
  // Events
  @JSName("on")
  def on_connection(
    event: connection,
    cb: js.ThisFunction2[/* this */ this.type, /* socket */ WebSocket, /* request */ IncomingMessage, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_error(event: error, cb: js.ThisFunction1[/* this */ this.type, /* error */ js.Error, Unit]): this.type = js.native
  @JSName("on")
  def on_headers(
    event: headers,
    cb: js.ThisFunction2[
      /* this */ this.type, 
      /* headers */ js.Array[String], 
      /* request */ IncomingMessage, 
      Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_listening(event: listening, cb: js.ThisFunction0[/* this */ this.type, Unit]): this.type = js.native
  def shouldHandle(request: IncomingMessage): Boolean = js.native
}

