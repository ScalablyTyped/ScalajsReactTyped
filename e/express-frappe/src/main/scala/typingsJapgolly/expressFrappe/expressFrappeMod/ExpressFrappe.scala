package typingsJapgolly.expressFrappe.expressFrappeMod

import typingsJapgolly.expressServeStaticCore.mod.Express
import typingsJapgolly.expressServeStaticCore.mod.ParamsDictionary
import typingsJapgolly.expressServeStaticCore.mod.Request
import typingsJapgolly.expressServeStaticCore.mod.Response
import typingsJapgolly.node.httpMod.IncomingMessage
import typingsJapgolly.node.httpMod.Server
import typingsJapgolly.node.httpMod.ServerResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("express-frappe/dist/express-frappe", "ExpressFrappe")
@js.native
class ExpressFrappe protected () extends js.Object {
  def this(config: ExpressFrappeConfig) = this()
  @JSName("app")
  var app_Original: Express = js.native
  var server: Server = js.native
  /**
    * Express instance itself is a request handler, which could be invoked without
    * third argument.
    */
  def app(req: Request[ParamsDictionary, _, _], res: Response[_]): js.Any = js.native
  def app(req: Request[ParamsDictionary, _, _], res: ServerResponse): js.Any = js.native
  def app(req: IncomingMessage, res: Response[_]): js.Any = js.native
  def app(req: IncomingMessage, res: ServerResponse): js.Any = js.native
}

