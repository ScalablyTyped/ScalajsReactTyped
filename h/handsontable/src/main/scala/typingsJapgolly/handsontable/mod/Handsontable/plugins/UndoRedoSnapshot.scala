package typingsJapgolly.handsontable.mod.Handsontable.plugins

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UndoRedoSnapshot extends js.Object {
  var sheet: Sheet
  var stack: Stack
  def destroy(): Unit
  def restore(): Unit
  def save(axis: String, index: Double, amount: Double): Unit
}

object UndoRedoSnapshot {
  @scala.inline
  def apply(
    destroy: Callback,
    restore: Callback,
    save: (String, Double, Double) => Callback,
    sheet: Sheet,
    stack: Stack
  ): UndoRedoSnapshot = {
    val __obj = js.Dynamic.literal(sheet = sheet.asInstanceOf[js.Any], stack = stack.asInstanceOf[js.Any])
    __obj.updateDynamic("destroy")(destroy.toJsFn)
    __obj.updateDynamic("restore")(restore.toJsFn)
    __obj.updateDynamic("save")(js.Any.fromFunction3((t0: java.lang.String, t1: scala.Double, t2: scala.Double) => save(t0, t1, t2).runNow()))
    __obj.asInstanceOf[UndoRedoSnapshot]
  }
}

