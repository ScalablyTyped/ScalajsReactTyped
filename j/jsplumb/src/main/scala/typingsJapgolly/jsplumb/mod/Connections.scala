package typingsJapgolly.jsplumb.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Connections extends js.Object {
  var length: Double
  def detach(): Unit
  def each(e: js.Function1[/* c */ Connection, Unit]): Unit
}

object Connections {
  @scala.inline
  def apply(detach: Callback, each: js.Function1[/* c */ Connection, Unit] => Callback, length: Double): Connections = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any])
    __obj.updateDynamic("detach")(detach.toJsFn)
    __obj.updateDynamic("each")(js.Any.fromFunction1((t0: js.Function1[/* c */ typingsJapgolly.jsplumb.mod.Connection, scala.Unit]) => each(t0).runNow()))
    __obj.asInstanceOf[Connections]
  }
}

