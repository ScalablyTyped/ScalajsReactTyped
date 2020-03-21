package typingsJapgolly.flight.Flight_

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComposeStatic extends js.Object {
  def mixin(base: js.Object, mixins: js.Array[js.Function]): Unit
}

object ComposeStatic {
  @scala.inline
  def apply(mixin: (js.Object, js.Array[js.Function]) => Callback): ComposeStatic = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("mixin")(js.Any.fromFunction2((t0: js.Object, t1: js.Array[js.Function]) => mixin(t0, t1).runNow()))
    __obj.asInstanceOf[ComposeStatic]
  }
}

