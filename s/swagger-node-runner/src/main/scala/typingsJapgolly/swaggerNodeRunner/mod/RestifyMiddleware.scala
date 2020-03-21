package typingsJapgolly.swaggerNodeRunner.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.restify.mod.Server
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RestifyMiddleware extends Middleware {
  /** Register this Middleware with `app`  */
  def register(app: Server): Unit
}

object RestifyMiddleware {
  @scala.inline
  def apply(register: Server => Callback, runner: Runner): RestifyMiddleware = {
    val __obj = js.Dynamic.literal(runner = runner.asInstanceOf[js.Any])
    __obj.updateDynamic("register")(js.Any.fromFunction1((t0: typingsJapgolly.restify.mod.Server) => register(t0).runNow()))
    __obj.asInstanceOf[RestifyMiddleware]
  }
}

