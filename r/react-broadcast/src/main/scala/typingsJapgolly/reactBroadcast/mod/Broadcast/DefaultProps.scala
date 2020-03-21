package typingsJapgolly.reactBroadcast.mod.Broadcast

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefaultProps[T] extends js.Object {
  def compareValues(prevValue: T, nextValue: T): Boolean
}

object DefaultProps {
  @scala.inline
  def apply[T](compareValues: (T, T) => CallbackTo[Boolean]): DefaultProps[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("compareValues")(js.Any.fromFunction2((t0: T, t1: T) => compareValues(t0, t1).runNow()))
    __obj.asInstanceOf[DefaultProps[T]]
  }
}

