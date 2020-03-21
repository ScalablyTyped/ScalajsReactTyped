package typingsJapgolly.swaggerNodeRunner.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.express.mod.NextFunction
import typingsJapgolly.expressServeStaticCore.mod._Global_.Express.Application
import typingsJapgolly.expressServeStaticCore.mod._Global_.Express.Request
import typingsJapgolly.expressServeStaticCore.mod._Global_.Express.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectMiddleware extends Middleware {
  def middleware(): js.Function3[/* req */ Request, /* res */ Response, /* next */ NextFunction, Unit]
  /** Register this Middleware with `app`  */
  def register(app: Application): Unit
}

object ConnectMiddleware {
  @scala.inline
  def apply(
    middleware: CallbackTo[
      js.Function3[/* req */ Request, /* res */ Response, /* next */ NextFunction, Unit]
    ],
    register: Application => Callback,
    runner: Runner
  ): ConnectMiddleware = {
    val __obj = js.Dynamic.literal(runner = runner.asInstanceOf[js.Any])
    __obj.updateDynamic("middleware")(middleware.toJsFn)
    __obj.updateDynamic("register")(js.Any.fromFunction1((t0: typingsJapgolly.expressServeStaticCore.mod._Global_.Express.Application) => register(t0).runNow()))
    __obj.asInstanceOf[ConnectMiddleware]
  }
}

