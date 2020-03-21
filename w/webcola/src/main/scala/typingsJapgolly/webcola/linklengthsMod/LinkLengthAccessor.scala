package typingsJapgolly.webcola.linklengthsMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LinkLengthAccessor[Link] extends LinkAccessor[Link] {
  def setLength(l: Link, value: Double): Unit
}

object LinkLengthAccessor {
  @scala.inline
  def apply[Link](
    getSourceIndex: Link => CallbackTo[Double],
    getTargetIndex: Link => CallbackTo[Double],
    setLength: (Link, Double) => Callback
  ): LinkLengthAccessor[Link] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getSourceIndex")(js.Any.fromFunction1((t0: Link) => getSourceIndex(t0).runNow()))
    __obj.updateDynamic("getTargetIndex")(js.Any.fromFunction1((t0: Link) => getTargetIndex(t0).runNow()))
    __obj.updateDynamic("setLength")(js.Any.fromFunction2((t0: Link, t1: scala.Double) => setLength(t0, t1).runNow()))
    __obj.asInstanceOf[LinkLengthAccessor[Link]]
  }
}

