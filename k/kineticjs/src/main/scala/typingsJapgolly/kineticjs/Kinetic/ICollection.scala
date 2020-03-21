package typingsJapgolly.kineticjs.Kinetic

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICollection extends js.Object {
  @JSName("apply")
  def apply(method: js.Function, `val`: js.Any): js.Any
  def each(func: js.Function0[_]): js.Any
}

object ICollection {
  @scala.inline
  def apply(
    apply: (js.Function, js.Any) => CallbackTo[js.Any],
    each: js.Function0[js.Any] => CallbackTo[js.Any]
  ): ICollection = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("apply")(js.Any.fromFunction2((t0: js.Function, t1: js.Any) => apply(t0, t1).runNow()))
    __obj.updateDynamic("each")(js.Any.fromFunction1((t0: js.Function0[js.Any]) => each(t0).runNow()))
    __obj.asInstanceOf[ICollection]
  }
}

