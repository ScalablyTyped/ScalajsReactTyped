package typingsJapgolly.pubsubJs.PubSubJS

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Subscribe extends js.Object {
  def subscribe(message: js.Any, func: js.Function): js.Any
}

object Subscribe {
  @scala.inline
  def apply(subscribe: (js.Any, js.Function) => CallbackTo[js.Any]): Subscribe = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("subscribe")(js.Any.fromFunction2((t0: js.Any, t1: js.Function) => subscribe(t0, t1).runNow()))
    __obj.asInstanceOf[Subscribe]
  }
}

