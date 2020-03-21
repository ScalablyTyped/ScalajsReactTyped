package typingsJapgolly.oauthShim.mod

import typingsJapgolly.expressServeStaticCore.mod.NextFunction
import typingsJapgolly.expressServeStaticCore.mod.ParamsDictionary
import typingsJapgolly.expressServeStaticCore.mod.RequestHandler
import typingsJapgolly.expressServeStaticCore.mod.Response
import typingsJapgolly.oauthShim.AnonGet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Handler
  extends RequestHandler[ParamsDictionary, js.Any, js.Any] {
  var credentials: AnonGet = js.native
  @JSName("interpret")
  var interpret_Original: typingsJapgolly.express.mod.RequestHandler[ParamsDictionary] = js.native
  @JSName("proxy")
  var proxy_Original: typingsJapgolly.express.mod.RequestHandler[ParamsDictionary] = js.native
  @JSName("redirect")
  var redirect_Original: typingsJapgolly.express.mod.RequestHandler[ParamsDictionary] = js.native
  @JSName("unhandled")
  var unhandled_Original: typingsJapgolly.express.mod.RequestHandler[ParamsDictionary] = js.native
  def init(configs: js.Array[Config]): Unit = js.native
  def interpret(
    req: typingsJapgolly.expressServeStaticCore.mod.Request[ParamsDictionary, _, _],
    res: Response[_],
    next: NextFunction
  ): js.Any = js.native
  def proxy(
    req: typingsJapgolly.expressServeStaticCore.mod.Request[ParamsDictionary, _, _],
    res: Response[_],
    next: NextFunction
  ): js.Any = js.native
  def redirect(
    req: typingsJapgolly.expressServeStaticCore.mod.Request[ParamsDictionary, _, _],
    res: Response[_],
    next: NextFunction
  ): js.Any = js.native
  def unhandled(
    req: typingsJapgolly.expressServeStaticCore.mod.Request[ParamsDictionary, _, _],
    res: Response[_],
    next: NextFunction
  ): js.Any = js.native
}

