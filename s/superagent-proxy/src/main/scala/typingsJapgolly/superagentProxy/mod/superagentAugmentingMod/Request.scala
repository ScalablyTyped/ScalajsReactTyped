package typingsJapgolly.superagentProxy.mod.superagentAugmentingMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Request extends js.Object {
  def proxy(url: String): this.type
}

object Request {
  @scala.inline
  def apply(proxy: String => CallbackTo[Request]): Request = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("proxy")(js.Any.fromFunction1((t0: java.lang.String) => proxy(t0).runNow()))
    __obj.asInstanceOf[Request]
  }
}

