package typingsJapgolly.namedRoutes.mod

import typingsJapgolly.express.mod.Express
import typingsJapgolly.express.mod.NextFunction
import typingsJapgolly.express.mod.RequestHandler
import typingsJapgolly.express.mod.Request_
import typingsJapgolly.express.mod.Response_
import typingsJapgolly.express.mod.Router
import typingsJapgolly.expressServeStaticCore.mod.ParamsDictionary
import typingsJapgolly.namedRoutes.PartialRouteOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NamedRouter extends js.Object {
  def add(method: String, path: String, callbacks: js.Array[RequestHandler[ParamsDictionary]]): Unit = js.native
  def add(
    method: String,
    path: String,
    callbacks: js.Array[RequestHandler[ParamsDictionary]],
    options: PartialRouteOptions
  ): Unit = js.native
  def add(method: String, path: String, callbacks: RequestHandler[ParamsDictionary]): Unit = js.native
  def add(
    method: String,
    path: String,
    callbacks: RequestHandler[ParamsDictionary],
    options: PartialRouteOptions
  ): Unit = js.native
  def build(name: String): String = js.native
  def build(name: String, params: RouteParams): String = js.native
  def build(name: String, params: RouteParams, method: String): String = js.native
  def dispatch(req: Request_[ParamsDictionary]): Unit = js.native
  def dispatch(req: Request_[ParamsDictionary], res: Response_): Unit = js.native
  def dispatch(req: Request_[ParamsDictionary], res: Response_, next: NextFunction): Unit = js.native
  def extendExpress(app: Express): NamedRouter = js.native
  def extendExpress(app: Router): NamedRouter = js.native
  def `match`(req: Request_[ParamsDictionary]): Boolean | js.Object = js.native
  def param(callback: RequestHandler[ParamsDictionary]): NamedRouter = js.native
  def param(name: String, callback: RequestHandler[ParamsDictionary]): NamedRouter = js.native
  def registerAppHelpers(app: Express): NamedRouter = js.native
}

