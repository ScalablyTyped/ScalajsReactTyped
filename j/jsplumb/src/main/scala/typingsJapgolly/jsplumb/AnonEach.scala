package typingsJapgolly.jsplumb

import japgolly.scalajs.react.Callback
import typingsJapgolly.jsplumb.mod.Connection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEach extends js.Object {
  def each(fn: js.Function1[/* conn */ Connection, Unit]): Unit
}

object AnonEach {
  @scala.inline
  def apply(each: js.Function1[/* conn */ Connection, Unit] => Callback): AnonEach = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("each")(js.Any.fromFunction1((t0: js.Function1[/* conn */ typingsJapgolly.jsplumb.mod.Connection, scala.Unit]) => each(t0).runNow()))
    __obj.asInstanceOf[AnonEach]
  }
}

