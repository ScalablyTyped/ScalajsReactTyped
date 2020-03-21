package typingsJapgolly.oracleOraclejet

import japgolly.scalajs.react.Callback
import org.scalajs.dom.raw.DragEvent
import typingsJapgolly.oracleOraclejet.ojtableMod.ojTable.DropRowContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDragEnterDragLeave extends js.Object {
  var dataTypes: String | js.Array[String]
  var dragEnter: js.UndefOr[js.Function2[/* param0 */ DragEvent, /* param1 */ DropRowContext, Unit]] = js.undefined
  var dragLeave: js.UndefOr[js.Function2[/* param0 */ DragEvent, /* param1 */ DropRowContext, Unit]] = js.undefined
  var dragOver: js.UndefOr[js.Function2[/* param0 */ DragEvent, /* param1 */ DropRowContext, Unit]] = js.undefined
  def drop(param0: DragEvent, param1: DropRowContext): Unit
}

object AnonDragEnterDragLeave {
  @scala.inline
  def apply(
    dataTypes: String | js.Array[String],
    drop: (DragEvent, DropRowContext) => Callback,
    dragEnter: (/* param0 */ DragEvent, /* param1 */ DropRowContext) => Callback = null,
    dragLeave: (/* param0 */ DragEvent, /* param1 */ DropRowContext) => Callback = null,
    dragOver: (/* param0 */ DragEvent, /* param1 */ DropRowContext) => Callback = null
  ): AnonDragEnterDragLeave = {
    val __obj = js.Dynamic.literal(dataTypes = dataTypes.asInstanceOf[js.Any])
    __obj.updateDynamic("drop")(js.Any.fromFunction2((t0: org.scalajs.dom.raw.DragEvent, t1: typingsJapgolly.oracleOraclejet.ojtableMod.ojTable.DropRowContext) => drop(t0, t1).runNow()))
    if (dragEnter != null) __obj.updateDynamic("dragEnter")(js.Any.fromFunction2((t0: /* param0 */ org.scalajs.dom.raw.DragEvent, t1: /* param1 */ typingsJapgolly.oracleOraclejet.ojtableMod.ojTable.DropRowContext) => dragEnter(t0, t1).runNow()))
    if (dragLeave != null) __obj.updateDynamic("dragLeave")(js.Any.fromFunction2((t0: /* param0 */ org.scalajs.dom.raw.DragEvent, t1: /* param1 */ typingsJapgolly.oracleOraclejet.ojtableMod.ojTable.DropRowContext) => dragLeave(t0, t1).runNow()))
    if (dragOver != null) __obj.updateDynamic("dragOver")(js.Any.fromFunction2((t0: /* param0 */ org.scalajs.dom.raw.DragEvent, t1: /* param1 */ typingsJapgolly.oracleOraclejet.ojtableMod.ojTable.DropRowContext) => dragOver(t0, t1).runNow()))
    __obj.asInstanceOf[AnonDragEnterDragLeave]
  }
}

