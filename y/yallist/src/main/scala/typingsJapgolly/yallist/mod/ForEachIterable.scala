package typingsJapgolly.yallist.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ForEachIterable[T] extends js.Object {
  def forEach(callbackFn: js.Function1[/* item */ T, Unit]): Unit
}

object ForEachIterable {
  @scala.inline
  def apply[T](forEach: js.Function1[/* item */ T, Unit] => Callback): ForEachIterable[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("forEach")(js.Any.fromFunction1((t0: js.Function1[/* item */ T, scala.Unit]) => forEach(t0).runNow()))
    __obj.asInstanceOf[ForEachIterable[T]]
  }
}

