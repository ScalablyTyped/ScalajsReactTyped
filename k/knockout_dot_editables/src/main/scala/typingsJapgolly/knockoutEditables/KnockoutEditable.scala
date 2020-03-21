package typingsJapgolly.knockoutEditables

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// bestowed by ko.editable(target)
trait KnockoutEditable extends js.Object {
  def addEditable(target: js.Any): js.Any
  def beginEdit(): Unit
  def commit(): Unit
  def hasChanges(): Boolean
  def rollback(): Unit
}

object KnockoutEditable {
  @scala.inline
  def apply(
    addEditable: js.Any => CallbackTo[js.Any],
    beginEdit: Callback,
    commit: Callback,
    hasChanges: CallbackTo[Boolean],
    rollback: Callback
  ): KnockoutEditable = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addEditable")(js.Any.fromFunction1((t0: js.Any) => addEditable(t0).runNow()))
    __obj.updateDynamic("beginEdit")(beginEdit.toJsFn)
    __obj.updateDynamic("commit")(commit.toJsFn)
    __obj.updateDynamic("hasChanges")(hasChanges.toJsFn)
    __obj.updateDynamic("rollback")(rollback.toJsFn)
    __obj.asInstanceOf[KnockoutEditable]
  }
}

