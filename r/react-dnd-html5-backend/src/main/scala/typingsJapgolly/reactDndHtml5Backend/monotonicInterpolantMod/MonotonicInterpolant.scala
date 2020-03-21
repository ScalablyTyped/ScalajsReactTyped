package typingsJapgolly.reactDndHtml5Backend.monotonicInterpolantMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MonotonicInterpolant extends js.Object {
  var c1s: js.Any
  var c2s: js.Any
  var c3s: js.Any
  var xs: js.Any
  var ys: js.Any
  def interpolate(x: Double): js.Any
}

object MonotonicInterpolant {
  @scala.inline
  def apply(
    c1s: js.Any,
    c2s: js.Any,
    c3s: js.Any,
    interpolate: Double => CallbackTo[js.Any],
    xs: js.Any,
    ys: js.Any
  ): MonotonicInterpolant = {
    val __obj = js.Dynamic.literal(c1s = c1s.asInstanceOf[js.Any], c2s = c2s.asInstanceOf[js.Any], c3s = c3s.asInstanceOf[js.Any], xs = xs.asInstanceOf[js.Any], ys = ys.asInstanceOf[js.Any])
    __obj.updateDynamic("interpolate")(js.Any.fromFunction1((t0: scala.Double) => interpolate(t0).runNow()))
    __obj.asInstanceOf[MonotonicInterpolant]
  }
}

