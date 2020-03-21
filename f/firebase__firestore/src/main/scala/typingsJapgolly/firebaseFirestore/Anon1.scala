package typingsJapgolly.firebaseFirestore

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon1[R] extends js.Object {
  def forEach(cb: js.Function1[/* r */ R, Unit]): Unit
}

object Anon1 {
  @scala.inline
  def apply[R](forEach: js.Function1[/* r */ R, Unit] => Callback): Anon1[R] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("forEach")(js.Any.fromFunction1((t0: js.Function1[/* r */ R, scala.Unit]) => forEach(t0).runNow()))
    __obj.asInstanceOf[Anon1[R]]
  }
}

