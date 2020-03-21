package typingsJapgolly.pollyjsNodeServer.mod

import typingsJapgolly.express.mod.Express
import typingsJapgolly.expressServeStaticCore.mod.ParamsDictionary
import typingsJapgolly.expressServeStaticCore.mod.Request
import typingsJapgolly.expressServeStaticCore.mod.Response
import typingsJapgolly.node.httpMod.IncomingMessage
import typingsJapgolly.node.httpMod.ServerResponse
import typingsJapgolly.pollyjsNodeServer.PartialConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pollyjs/node-server", "Server")
@js.native
class Server () extends js.Object {
  def this(options: PartialConfig) = this()
  @JSName("app")
  var app_Original: Express = js.native
  var config: Config = js.native
  var server: js.UndefOr[typingsJapgolly.node.httpMod.Server] = js.native
  /**
    * Express instance itself is a request handler, which could be invoked without
    * third argument.
    */
  def app(req: Request[ParamsDictionary, _, _], res: Response[_]): js.Any = js.native
  def app(req: Request[ParamsDictionary, _, _], res: ServerResponse): js.Any = js.native
  def app(req: IncomingMessage, res: Response[_]): js.Any = js.native
  def app(req: IncomingMessage, res: ServerResponse): js.Any = js.native
  def listen(): typingsJapgolly.node.httpMod.Server = js.native
  def listen(port: Double): typingsJapgolly.node.httpMod.Server = js.native
  def listen(port: Double, host: String): typingsJapgolly.node.httpMod.Server = js.native
}

