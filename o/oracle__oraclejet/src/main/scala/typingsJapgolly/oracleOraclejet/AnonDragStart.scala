package typingsJapgolly.oracleOraclejet

import japgolly.scalajs.react.Callback
import typingsJapgolly.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDragStart extends js.Object {
  var dataTypes: js.UndefOr[String | js.Array[String]] = js.undefined
  var drag: js.UndefOr[js.Function1[/* param0 */ Event_, Unit]] = js.undefined
  var dragEnd: js.UndefOr[js.Function1[/* param0 */ Event_, Unit]] = js.undefined
  var dragStart: js.UndefOr[js.Function2[/* param0 */ Event_, /* param1 */ AnonItemsArray, Unit]] = js.undefined
}

object AnonDragStart {
  @scala.inline
  def apply(
    dataTypes: String | js.Array[String] = null,
    drag: /* param0 */ Event_ => Callback = null,
    dragEnd: /* param0 */ Event_ => Callback = null,
    dragStart: (/* param0 */ Event_, /* param1 */ AnonItemsArray) => Callback = null
  ): AnonDragStart = {
    val __obj = js.Dynamic.literal()
    if (dataTypes != null) __obj.updateDynamic("dataTypes")(dataTypes.asInstanceOf[js.Any])
    if (drag != null) __obj.updateDynamic("drag")(js.Any.fromFunction1((t0: /* param0 */ typingsJapgolly.std.Event_) => drag(t0).runNow()))
    if (dragEnd != null) __obj.updateDynamic("dragEnd")(js.Any.fromFunction1((t0: /* param0 */ typingsJapgolly.std.Event_) => dragEnd(t0).runNow()))
    if (dragStart != null) __obj.updateDynamic("dragStart")(js.Any.fromFunction2((t0: /* param0 */ typingsJapgolly.std.Event_, t1: /* param1 */ typingsJapgolly.oracleOraclejet.AnonItemsArray) => dragStart(t0, t1).runNow()))
    __obj.asInstanceOf[AnonDragStart]
  }
}

