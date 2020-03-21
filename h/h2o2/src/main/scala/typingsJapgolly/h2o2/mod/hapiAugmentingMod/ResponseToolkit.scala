package typingsJapgolly.h2o2.mod.hapiAugmentingMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.h2o2.mod.ProxyHandlerOptions
import typingsJapgolly.hapi.mod.ResponseObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResponseToolkit extends js.Object {
  /**
    * Proxies the request to an upstream endpoint. `async`, so you'll need to `await` the `ResponseObject` to work on it before returning it.
    */
  def proxy(options: ProxyHandlerOptions): js.Promise[ResponseObject]
}

object ResponseToolkit {
  @scala.inline
  def apply(proxy: ProxyHandlerOptions => CallbackTo[js.Promise[ResponseObject]]): ResponseToolkit = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("proxy")(js.Any.fromFunction1((t0: typingsJapgolly.h2o2.mod.ProxyHandlerOptions) => proxy(t0).runNow()))
    __obj.asInstanceOf[ResponseToolkit]
  }
}

