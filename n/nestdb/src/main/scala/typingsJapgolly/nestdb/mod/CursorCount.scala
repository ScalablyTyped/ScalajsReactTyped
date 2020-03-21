package typingsJapgolly.nestdb.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CursorCount extends js.Object {
  def exec(callback: js.Function2[/* err */ js.Error, /* count */ Double, Unit]): Unit
}

object CursorCount {
  @scala.inline
  def apply(exec: js.Function2[/* err */ js.Error, /* count */ Double, Unit] => Callback): CursorCount = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("exec")(js.Any.fromFunction1((t0: js.Function2[/* err */ js.Error, /* count */ scala.Double, scala.Unit]) => exec(t0).runNow()))
    __obj.asInstanceOf[CursorCount]
  }
}

