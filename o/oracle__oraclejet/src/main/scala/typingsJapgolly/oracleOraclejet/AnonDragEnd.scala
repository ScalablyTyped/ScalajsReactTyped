package typingsJapgolly.oracleOraclejet

import japgolly.scalajs.react.Callback
import typingsJapgolly.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDragEnd extends js.Object {
  var dataTypes: String | js.Array[String]
  var selector: String
  def drag(param0: Event_): Unit
  def dragEnd(param0: Event_): Unit
  def dragStart(param0: Event_, param1: js.Object): Unit
  def linkStyle(param0: js.Object): Unit
}

object AnonDragEnd {
  @scala.inline
  def apply(
    dataTypes: String | js.Array[String],
    drag: Event_ => Callback,
    dragEnd: Event_ => Callback,
    dragStart: (Event_, js.Object) => Callback,
    linkStyle: js.Object => Callback,
    selector: String
  ): AnonDragEnd = {
    val __obj = js.Dynamic.literal(dataTypes = dataTypes.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any])
    __obj.updateDynamic("drag")(js.Any.fromFunction1((t0: typingsJapgolly.std.Event_) => drag(t0).runNow()))
    __obj.updateDynamic("dragEnd")(js.Any.fromFunction1((t0: typingsJapgolly.std.Event_) => dragEnd(t0).runNow()))
    __obj.updateDynamic("dragStart")(js.Any.fromFunction2((t0: typingsJapgolly.std.Event_, t1: js.Object) => dragStart(t0, t1).runNow()))
    __obj.updateDynamic("linkStyle")(js.Any.fromFunction1((t0: js.Object) => linkStyle(t0).runNow()))
    __obj.asInstanceOf[AnonDragEnd]
  }
}

