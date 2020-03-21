package typingsJapgolly.swaggerNodeRunner.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.express.mod.NextFunction
import typingsJapgolly.expressServeStaticCore.mod._Global_.Express.Request
import typingsJapgolly.expressServeStaticCore.mod._Global_.Express.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SailsMiddleware extends Middleware {
  /** Express style middleware */
  def chain(): js.Function3[/* req */ Request, /* res */ Response, /* next */ NextFunction, Unit]
}

object SailsMiddleware {
  @scala.inline
  def apply(
    chain: CallbackTo[
      js.Function3[/* req */ Request, /* res */ Response, /* next */ NextFunction, Unit]
    ],
    runner: Runner
  ): SailsMiddleware = {
    val __obj = js.Dynamic.literal(runner = runner.asInstanceOf[js.Any])
    __obj.updateDynamic("chain")(chain.toJsFn)
    __obj.asInstanceOf[SailsMiddleware]
  }
}

