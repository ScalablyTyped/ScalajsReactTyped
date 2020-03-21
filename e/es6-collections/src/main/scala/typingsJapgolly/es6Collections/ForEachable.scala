package typingsJapgolly.es6Collections

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ForEachable[T] extends js.Object {
  def forEach(callbackfn: js.Function1[/* value */ T, Unit]): Unit
}

object ForEachable {
  @scala.inline
  def apply[T](forEach: js.Function1[/* value */ T, Unit] => Callback): ForEachable[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("forEach")(js.Any.fromFunction1((t0: js.Function1[/* value */ T, scala.Unit]) => forEach(t0).runNow()))
    __obj.asInstanceOf[ForEachable[T]]
  }
}

