package typingsJapgolly.foundationSites.FoundationSites

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Motion extends js.Object {
  def animateIn(element: js.Object, animation: js.Any, cb: js.Function): Unit
  def animateOut(element: js.Object, animation: js.Any, cb: js.Function): Unit
}

object Motion {
  @scala.inline
  def apply(
    animateIn: (js.Object, js.Any, js.Function) => Callback,
    animateOut: (js.Object, js.Any, js.Function) => Callback
  ): Motion = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("animateIn")(js.Any.fromFunction3((t0: js.Object, t1: js.Any, t2: js.Function) => animateIn(t0, t1, t2).runNow()))
    __obj.updateDynamic("animateOut")(js.Any.fromFunction3((t0: js.Object, t1: js.Any, t2: js.Function) => animateOut(t0, t1, t2).runNow()))
    __obj.asInstanceOf[Motion]
  }
}

