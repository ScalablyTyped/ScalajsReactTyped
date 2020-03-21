package typingsJapgolly.oauthShim

import japgolly.scalajs.react.Callback
import typingsJapgolly.oauthShim.oauthShimBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonGet extends js.Object {
  @JSName("get")
  def get_false(query: js.Any, cb: js.Function1[/* success */ `false` | js.Object, Unit]): Unit
}

object AnonGet {
  @scala.inline
  def apply(get: (js.Any, js.Function1[/* success */ `false` | js.Object, Unit]) => Callback): AnonGet = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(js.Any.fromFunction2((t0: js.Any, t1: js.Function1[
  /* success */ typingsJapgolly.oauthShim.oauthShimBooleans.`false` | js.Object, 
  scala.Unit]) => get(t0, t1).runNow()))
    __obj.asInstanceOf[AnonGet]
  }
}

