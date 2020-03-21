package typingsJapgolly.useSidecar.typesMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SidePush[T] extends js.Object {
  var length: js.UndefOr[Double] = js.undefined
  def filter(cb: js.Function1[/* x */ T, Boolean]): SidePush[T]
  def push(data: T): Unit
}

object SidePush {
  @scala.inline
  def apply[T](
    filter: js.Function1[/* x */ T, Boolean] => CallbackTo[SidePush[T]],
    push: T => Callback,
    length: Int | Double = null
  ): SidePush[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("filter")(js.Any.fromFunction1((t0: js.Function1[/* x */ T, scala.Boolean]) => filter(t0).runNow()))
    __obj.updateDynamic("push")(js.Any.fromFunction1((t0: T) => push(t0).runNow()))
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    __obj.asInstanceOf[SidePush[T]]
  }
}

