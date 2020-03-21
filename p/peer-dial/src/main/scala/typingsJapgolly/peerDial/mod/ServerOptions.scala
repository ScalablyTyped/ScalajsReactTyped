package typingsJapgolly.peerDial.mod

import typingsJapgolly.express.mod.Express
import typingsJapgolly.expressServeStaticCore.mod.ParamsDictionary
import typingsJapgolly.expressServeStaticCore.mod.Request
import typingsJapgolly.expressServeStaticCore.mod.Response
import typingsJapgolly.node.httpMod.IncomingMessage
import typingsJapgolly.node.httpMod.ServerResponse
import typingsJapgolly.nodeUuid.mod.UUIDOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServerOptions extends js.Object {
  var corsAllowOrigins: String | Boolean = js.native
  var delegate: Delegate = js.native
  @JSName("expressApp")
  var expressApp_Original: Express = js.native
  var extraHeaders: js.UndefOr[js.Object] = js.native
  var friendlyName: js.UndefOr[String] = js.native
  var host: js.UndefOr[String] = js.native
  var manufacturer: String = js.native
  var maxContentLength: js.UndefOr[Double] = js.native
  var modelName: String = js.native
  var port: Double = js.native
  var prefix: String = js.native
  var uuid: js.UndefOr[UUIDOptions] = js.native
  /**
    * Express instance itself is a request handler, which could be invoked without
    * third argument.
    */
  def expressApp(req: Request[ParamsDictionary, _, _], res: Response[_]): js.Any = js.native
  def expressApp(req: Request[ParamsDictionary, _, _], res: ServerResponse): js.Any = js.native
  def expressApp(req: IncomingMessage, res: Response[_]): js.Any = js.native
  def expressApp(req: IncomingMessage, res: ServerResponse): js.Any = js.native
}

