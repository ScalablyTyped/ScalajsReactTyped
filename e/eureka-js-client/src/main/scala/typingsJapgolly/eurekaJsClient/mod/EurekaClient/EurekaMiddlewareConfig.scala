package typingsJapgolly.eurekaJsClient.mod.EurekaClient

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EurekaMiddlewareConfig extends js.Object {
  def requestMiddleware(requestOpts: js.Any, done: js.Function1[/* opts */ js.Any, Unit]): Unit
}

object EurekaMiddlewareConfig {
  @scala.inline
  def apply(requestMiddleware: (js.Any, js.Function1[/* opts */ js.Any, Unit]) => Callback): EurekaMiddlewareConfig = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("requestMiddleware")(js.Any.fromFunction2((t0: js.Any, t1: js.Function1[/* opts */ js.Any, scala.Unit]) => requestMiddleware(t0, t1).runNow()))
    __obj.asInstanceOf[EurekaMiddlewareConfig]
  }
}

