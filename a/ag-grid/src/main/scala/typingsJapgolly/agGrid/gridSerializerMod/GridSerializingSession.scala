package typingsJapgolly.agGrid.gridSerializerMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.agGrid.columnMod.Column
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridSerializingSession[T] extends js.Object {
  def addCustomFooter(customFooter: T): Unit
  /**
    * ROW METHODS
    */
  def addCustomHeader(customHeader: T): Unit
  def onNewBodyRow(): RowAccumulator
  def onNewHeaderGroupingRow(): RowSpanningAccumulator
  def onNewHeaderRow(): RowAccumulator
  /**
    * FINAL RESULT
    */
  def parse(): String
  /**
    * INITIAL METHOD
    */
  def prepare(columnsToExport: js.Array[Column]): Unit
}

object GridSerializingSession {
  @scala.inline
  def apply[T](
    addCustomFooter: T => Callback,
    addCustomHeader: T => Callback,
    onNewBodyRow: CallbackTo[RowAccumulator],
    onNewHeaderGroupingRow: CallbackTo[RowSpanningAccumulator],
    onNewHeaderRow: CallbackTo[RowAccumulator],
    parse: CallbackTo[String],
    prepare: js.Array[Column] => Callback
  ): GridSerializingSession[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addCustomFooter")(js.Any.fromFunction1((t0: T) => addCustomFooter(t0).runNow()))
    __obj.updateDynamic("addCustomHeader")(js.Any.fromFunction1((t0: T) => addCustomHeader(t0).runNow()))
    __obj.updateDynamic("onNewBodyRow")(onNewBodyRow.toJsFn)
    __obj.updateDynamic("onNewHeaderGroupingRow")(onNewHeaderGroupingRow.toJsFn)
    __obj.updateDynamic("onNewHeaderRow")(onNewHeaderRow.toJsFn)
    __obj.updateDynamic("parse")(parse.toJsFn)
    __obj.updateDynamic("prepare")(js.Any.fromFunction1((t0: js.Array[typingsJapgolly.agGrid.columnMod.Column]) => prepare(t0).runNow()))
    __obj.asInstanceOf[GridSerializingSession[T]]
  }
}

