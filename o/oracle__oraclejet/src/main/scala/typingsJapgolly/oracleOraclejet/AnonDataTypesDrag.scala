package typingsJapgolly.oracleOraclejet

import japgolly.scalajs.react.Callback
import org.scalajs.dom.raw.DragEvent
import typingsJapgolly.oracleOraclejet.ojtableMod.ojTable.DragRowContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDataTypesDrag[K, D] extends js.Object {
  var dataTypes: js.UndefOr[String | js.Array[String]] = js.undefined
  var drag: js.UndefOr[js.Function1[/* param0 */ DragEvent, Unit]] = js.undefined
  var dragEnd: js.UndefOr[js.Function1[/* param0 */ DragEvent, Unit]] = js.undefined
  var dragStart: js.UndefOr[js.Function2[/* param0 */ DragEvent, /* param1 */ DragRowContext[K, D], Unit]] = js.undefined
}

object AnonDataTypesDrag {
  @scala.inline
  def apply[K, D](
    dataTypes: String | js.Array[String] = null,
    drag: /* param0 */ DragEvent => Callback = null,
    dragEnd: /* param0 */ DragEvent => Callback = null,
    dragStart: (/* param0 */ DragEvent, /* param1 */ DragRowContext[K, D]) => Callback = null
  ): AnonDataTypesDrag[K, D] = {
    val __obj = js.Dynamic.literal()
    if (dataTypes != null) __obj.updateDynamic("dataTypes")(dataTypes.asInstanceOf[js.Any])
    if (drag != null) __obj.updateDynamic("drag")(js.Any.fromFunction1((t0: /* param0 */ org.scalajs.dom.raw.DragEvent) => drag(t0).runNow()))
    if (dragEnd != null) __obj.updateDynamic("dragEnd")(js.Any.fromFunction1((t0: /* param0 */ org.scalajs.dom.raw.DragEvent) => dragEnd(t0).runNow()))
    if (dragStart != null) __obj.updateDynamic("dragStart")(js.Any.fromFunction2((t0: /* param0 */ org.scalajs.dom.raw.DragEvent, t1: /* param1 */ typingsJapgolly.oracleOraclejet.ojtableMod.ojTable.DragRowContext[K, D]) => dragStart(t0, t1).runNow()))
    __obj.asInstanceOf[AnonDataTypesDrag[K, D]]
  }
}

