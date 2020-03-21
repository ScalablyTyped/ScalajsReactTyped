package typingsJapgolly.sequester.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Lock extends js.Object {
  var count: Double
  def dispose(): Unit
  def downgrade(): Unit
  def exclude(cb: Callback): Unit
  def share(cb: Callback): Unit
  def unlock(): Unit
}

object Lock {
  @scala.inline
  def apply(
    count: Double,
    dispose: japgolly.scalajs.react.Callback,
    downgrade: japgolly.scalajs.react.Callback,
    exclude: Callback => japgolly.scalajs.react.Callback,
    share: Callback => japgolly.scalajs.react.Callback,
    unlock: japgolly.scalajs.react.Callback
  ): Lock = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any])
    __obj.updateDynamic("dispose")(dispose.toJsFn)
    __obj.updateDynamic("downgrade")(downgrade.toJsFn)
    __obj.updateDynamic("exclude")(js.Any.fromFunction1((t0: typingsJapgolly.sequester.mod.Callback) => exclude(t0).runNow()))
    __obj.updateDynamic("share")(js.Any.fromFunction1((t0: typingsJapgolly.sequester.mod.Callback) => share(t0).runNow()))
    __obj.updateDynamic("unlock")(unlock.toJsFn)
    __obj.asInstanceOf[Lock]
  }
}

