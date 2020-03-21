package typingsJapgolly.oracleOraclejet

import japgolly.scalajs.react.Callback
import typingsJapgolly.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDataTypes extends js.Object {
  var dataTypes: String | js.Array[String]
  def drag(param0: Event_): Unit
  def dragEnd(param0: Event_): Unit
  def dragStart(param0: Event_, param1: js.Object): Unit
}

object AnonDataTypes {
  @scala.inline
  def apply(
    dataTypes: String | js.Array[String],
    drag: Event_ => Callback,
    dragEnd: Event_ => Callback,
    dragStart: (Event_, js.Object) => Callback
  ): AnonDataTypes = {
    val __obj = js.Dynamic.literal(dataTypes = dataTypes.asInstanceOf[js.Any])
    __obj.updateDynamic("drag")(js.Any.fromFunction1((t0: typingsJapgolly.std.Event_) => drag(t0).runNow()))
    __obj.updateDynamic("dragEnd")(js.Any.fromFunction1((t0: typingsJapgolly.std.Event_) => dragEnd(t0).runNow()))
    __obj.updateDynamic("dragStart")(js.Any.fromFunction2((t0: typingsJapgolly.std.Event_, t1: js.Object) => dragStart(t0, t1).runNow()))
    __obj.asInstanceOf[AnonDataTypes]
  }
}

