package typingsJapgolly.yog2Kernel.mod

import typingsJapgolly.express.mod.NextFunction
import typingsJapgolly.express.mod.RequestHandler
import typingsJapgolly.expressServeStaticCore.mod.IRouter
import typingsJapgolly.expressServeStaticCore.mod.ParamsDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Router extends IRouter {
  def action(actionName: String): RequestHandler[ParamsDictionary] | ActionObject = js.native
  def wrapAsync(fn: js.Function3[/* req */ Request, /* resp */ Response, /* next */ NextFunction, _]): RequestHandler[ParamsDictionary] = js.native
}

