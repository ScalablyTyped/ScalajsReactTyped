package typingsJapgolly.knockoutKogrid.kg

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectionService[EntityType] extends js.Object {
  var lastClickedRow: Row[EntityType]
  var multi: Boolean
  def setSelection(row: Row[EntityType], selected: Boolean): Unit
}

object SelectionService {
  @scala.inline
  def apply[EntityType](
    lastClickedRow: Row[EntityType],
    multi: Boolean,
    setSelection: (Row[EntityType], Boolean) => Callback
  ): SelectionService[EntityType] = {
    val __obj = js.Dynamic.literal(lastClickedRow = lastClickedRow.asInstanceOf[js.Any], multi = multi.asInstanceOf[js.Any])
    __obj.updateDynamic("setSelection")(js.Any.fromFunction2((t0: typingsJapgolly.knockoutKogrid.kg.Row[EntityType], t1: scala.Boolean) => setSelection(t0, t1).runNow()))
    __obj.asInstanceOf[SelectionService[EntityType]]
  }
}

