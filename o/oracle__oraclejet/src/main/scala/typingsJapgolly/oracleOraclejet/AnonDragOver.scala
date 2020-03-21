package typingsJapgolly.oracleOraclejet

import japgolly.scalajs.react.Callback
import typingsJapgolly.oracleOraclejet.ojlistviewMod.ojListView.ItemsDropContext
import typingsJapgolly.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDragOver extends js.Object {
  var dataTypes: js.UndefOr[String | js.Array[String]] = js.undefined
  var dragEnter: js.UndefOr[js.Function2[/* param0 */ Event_, /* param1 */ AnonItem, Unit]] = js.undefined
  var dragLeave: js.UndefOr[js.Function2[/* param0 */ Event_, /* param1 */ AnonItem, Unit]] = js.undefined
  var dragOver: js.UndefOr[js.Function2[/* param0 */ Event_, /* param1 */ AnonItem, Unit]] = js.undefined
  var drop: js.UndefOr[js.Function2[/* param0 */ Event_, /* param1 */ ItemsDropContext, Unit]] = js.undefined
}

object AnonDragOver {
  @scala.inline
  def apply(
    dataTypes: String | js.Array[String] = null,
    dragEnter: (/* param0 */ Event_, /* param1 */ AnonItem) => Callback = null,
    dragLeave: (/* param0 */ Event_, /* param1 */ AnonItem) => Callback = null,
    dragOver: (/* param0 */ Event_, /* param1 */ AnonItem) => Callback = null,
    drop: (/* param0 */ Event_, /* param1 */ ItemsDropContext) => Callback = null
  ): AnonDragOver = {
    val __obj = js.Dynamic.literal()
    if (dataTypes != null) __obj.updateDynamic("dataTypes")(dataTypes.asInstanceOf[js.Any])
    if (dragEnter != null) __obj.updateDynamic("dragEnter")(js.Any.fromFunction2((t0: /* param0 */ typingsJapgolly.std.Event_, t1: /* param1 */ typingsJapgolly.oracleOraclejet.AnonItem) => dragEnter(t0, t1).runNow()))
    if (dragLeave != null) __obj.updateDynamic("dragLeave")(js.Any.fromFunction2((t0: /* param0 */ typingsJapgolly.std.Event_, t1: /* param1 */ typingsJapgolly.oracleOraclejet.AnonItem) => dragLeave(t0, t1).runNow()))
    if (dragOver != null) __obj.updateDynamic("dragOver")(js.Any.fromFunction2((t0: /* param0 */ typingsJapgolly.std.Event_, t1: /* param1 */ typingsJapgolly.oracleOraclejet.AnonItem) => dragOver(t0, t1).runNow()))
    if (drop != null) __obj.updateDynamic("drop")(js.Any.fromFunction2((t0: /* param0 */ typingsJapgolly.std.Event_, t1: /* param1 */ typingsJapgolly.oracleOraclejet.ojlistviewMod.ojListView.ItemsDropContext) => drop(t0, t1).runNow()))
    __obj.asInstanceOf[AnonDragOver]
  }
}

