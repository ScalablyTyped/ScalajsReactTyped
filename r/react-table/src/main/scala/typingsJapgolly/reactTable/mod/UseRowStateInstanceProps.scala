package typingsJapgolly.reactTable.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UseRowStateInstanceProps[D /* <: js.Object */] extends js.Object {
  def setCellState(rowPath: js.Array[String], columnId: IdType[D], updater: UseRowUpdater[_]): Unit
  def setRowState(rowPath: js.Array[String], updater: UseRowUpdater[_]): Unit
}

object UseRowStateInstanceProps {
  @scala.inline
  def apply[D /* <: js.Object */](
    setCellState: (js.Array[String], IdType[D], UseRowUpdater[js.Any]) => Callback,
    setRowState: (js.Array[String], UseRowUpdater[js.Any]) => Callback
  ): UseRowStateInstanceProps[D] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("setCellState")(js.Any.fromFunction3((t0: js.Array[java.lang.String], t1: typingsJapgolly.reactTable.mod.IdType[D], t2: typingsJapgolly.reactTable.mod.UseRowUpdater[js.Any]) => setCellState(t0, t1, t2).runNow()))
    __obj.updateDynamic("setRowState")(js.Any.fromFunction2((t0: js.Array[java.lang.String], t1: typingsJapgolly.reactTable.mod.UseRowUpdater[js.Any]) => setRowState(t0, t1).runNow()))
    __obj.asInstanceOf[UseRowStateInstanceProps[D]]
  }
}

