package typingsJapgolly.engineIo.mod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.engineIo.engineIoStrings.connection
import typingsJapgolly.engineIo.engineIoStrings.drain
import typingsJapgolly.engineIo.engineIoStrings.flush
import typingsJapgolly.node.Buffer
import typingsJapgolly.node.eventsMod.EventEmitter
import typingsJapgolly.node.httpMod.IncomingMessage
import typingsJapgolly.node.httpMod.ServerResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * The main server/manager. Inherits from EventEmitter.
	 */
@JSImport("engine.io", "Server")
@js.native
/**
		 * Initializes the server
		 */
class Server () extends EventEmitter {
  def this(opts: ServerOptions) = this()
  /**
  		 * hash of connected clients by id.
  		 */
  var clients: StringDictionary[Socket] = js.native
  /**
  		 * number of connected clients.
  		 */
  var clientsCount: Double = js.native
  val httpServer: js.UndefOr[typingsJapgolly.node.httpMod.Server] = js.native
  /**
  		 * Attach this Server instance to an http.Server
  		 * Captures upgrade requests for a http.Server. In other words, makes a regular http.Server WebSocket-compatible.
  		 */
  def attach(http: typingsJapgolly.node.httpMod.Server): this.type = js.native
  def attach(http: typingsJapgolly.node.httpMod.Server, opts: AttachOptions): this.type = js.native
  /**
  		 * Closes all clients
  		 */
  def close(): this.type = js.native
  /**
  		 * Generate a socket id.
  		 * Overwrite this method to generate your custom socket id.
  		 */
  def generateId(req: IncomingMessage): String = js.native
  /**
  		 * Called internally when a Engine request is intercepted.
  		 */
  def handleRequest(req: IncomingMessage, res: ServerResponse): this.type = js.native
  /**
  		 * Called internally when a Engine ws upgrade is intercepted.
  		 */
  def handleUpgrade(req: IncomingMessage, socket: typingsJapgolly.node.netMod.Socket, head: Buffer): this.type = js.native
  /**
  		 * Fired when a new connection is established.
  		 */
  @JSName("on")
  def on_connection(ev: connection, fn: js.Function1[/* socket */ Socket, Unit]): this.type = js.native
  @JSName("on")
  def on_drain(ev: drain, fn: js.Function1[/* socket */ Socket, Unit]): this.type = js.native
  @JSName("on")
  def on_flush(ev: flush, fn: js.Function2[/* socket */ Socket, /* buffer */ js.Array[Packet], Unit]): this.type = js.native
}

