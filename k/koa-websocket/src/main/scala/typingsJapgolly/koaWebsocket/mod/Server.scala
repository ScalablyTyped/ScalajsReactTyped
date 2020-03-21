package typingsJapgolly.koaWebsocket.mod

import typingsJapgolly.node.httpMod.IncomingMessage
import typingsJapgolly.ws.mod.ServerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("koa-websocket", "Server")
@js.native
class Server[StateT, CustomT] protected () extends js.Object {
  def this(app: typingsJapgolly.koa.mod.^[StateT, CustomT]) = this()
  var app: App[StateT, CustomT] = js.native
  var middleware: js.Array[Middleware[StateT, CustomT]] = js.native
  var server: js.UndefOr[typingsJapgolly.ws.mod.Server] = js.native
  def listen(options: ServerOptions): typingsJapgolly.ws.mod.Server = js.native
  def onConnection(socket: typingsJapgolly.ws.mod.^, request: IncomingMessage): Unit = js.native
  def use(middleware: Middleware[StateT, CustomT]): this.type = js.native
}

