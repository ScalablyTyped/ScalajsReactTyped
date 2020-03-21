package typingsJapgolly.oracleOraclejet

import japgolly.scalajs.react.Callback
import typingsJapgolly.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDragLeave extends js.Object {
  var dataTypes: String | js.Array[String]
  var selector: String
  def dragEnter(param0: Event_, param1: js.Object): Unit
  def dragLeave(param0: Event_, param1: js.Object): Unit
  def dragOver(param0: Event_, param1: js.Object): Unit
  def drop(param0: Event_, param1: js.Object): Unit
}

object AnonDragLeave {
  @scala.inline
  def apply(
    dataTypes: String | js.Array[String],
    dragEnter: (Event_, js.Object) => Callback,
    dragLeave: (Event_, js.Object) => Callback,
    dragOver: (Event_, js.Object) => Callback,
    drop: (Event_, js.Object) => Callback,
    selector: String
  ): AnonDragLeave = {
    val __obj = js.Dynamic.literal(dataTypes = dataTypes.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any])
    __obj.updateDynamic("dragEnter")(js.Any.fromFunction2((t0: typingsJapgolly.std.Event_, t1: js.Object) => dragEnter(t0, t1).runNow()))
    __obj.updateDynamic("dragLeave")(js.Any.fromFunction2((t0: typingsJapgolly.std.Event_, t1: js.Object) => dragLeave(t0, t1).runNow()))
    __obj.updateDynamic("dragOver")(js.Any.fromFunction2((t0: typingsJapgolly.std.Event_, t1: js.Object) => dragOver(t0, t1).runNow()))
    __obj.updateDynamic("drop")(js.Any.fromFunction2((t0: typingsJapgolly.std.Event_, t1: js.Object) => drop(t0, t1).runNow()))
    __obj.asInstanceOf[AnonDragLeave]
  }
}

