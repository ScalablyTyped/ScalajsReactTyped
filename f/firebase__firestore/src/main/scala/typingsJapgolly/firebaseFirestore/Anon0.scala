package typingsJapgolly.firebaseFirestore

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon0[R, S] extends js.Object {
  def forEach(cb: js.Function2[/* r */ R, /* s */ S, Unit]): Unit
}

object Anon0 {
  @scala.inline
  def apply[R, S](forEach: js.Function2[/* r */ R, /* s */ S, Unit] => Callback): Anon0[R, S] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("forEach")(js.Any.fromFunction1((t0: js.Function2[/* r */ R, /* s */ S, scala.Unit]) => forEach(t0).runNow()))
    __obj.asInstanceOf[Anon0[R, S]]
  }
}

