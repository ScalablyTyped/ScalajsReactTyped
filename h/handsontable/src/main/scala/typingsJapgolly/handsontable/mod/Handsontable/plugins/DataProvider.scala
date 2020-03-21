package typingsJapgolly.handsontable.mod.Handsontable.plugins

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.handsontable.mod._Handsontable.Core
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataProvider extends js.Object {
  var changes: js.Object
  var hot: Core
  var t: RecordTranslator
  def clearChanges(): Unit
  def collectChanges(row: Double, column: Double, value: js.Any): Unit
  def destroy(): Unit
  def getDataAtCell(row: Double, column: Double): js.Any
  def getDataByRange(row1: Double, column1: Double, row2: Double, column2: Double): js.Array[_]
  def getRawDataAtCell(row: Double, column: Double): js.Any
  def getRawDataByRange(row1: Double, column1: Double, row2: Double, column2: Double): js.Array[_]
  def getSourceDataAtCell(row: Double, column: Double): js.Any
  def getSourceDataByRange(row1: Double, column1: Double, row2: Double, column2: Double): js.Array[_]
  def isInDataRange(row: Double, column: Double): Boolean
  def updateSourceData(row: Double, column: Double, value: js.Any): Unit
}

object DataProvider {
  @scala.inline
  def apply(
    changes: js.Object,
    clearChanges: Callback,
    collectChanges: (Double, Double, js.Any) => Callback,
    destroy: Callback,
    getDataAtCell: (Double, Double) => CallbackTo[js.Any],
    getDataByRange: (Double, Double, Double, Double) => CallbackTo[js.Array[js.Any]],
    getRawDataAtCell: (Double, Double) => CallbackTo[js.Any],
    getRawDataByRange: (Double, Double, Double, Double) => CallbackTo[js.Array[js.Any]],
    getSourceDataAtCell: (Double, Double) => CallbackTo[js.Any],
    getSourceDataByRange: (Double, Double, Double, Double) => CallbackTo[js.Array[js.Any]],
    hot: Core,
    isInDataRange: (Double, Double) => CallbackTo[Boolean],
    t: RecordTranslator,
    updateSourceData: (Double, Double, js.Any) => Callback
  ): DataProvider = {
    val __obj = js.Dynamic.literal(changes = changes.asInstanceOf[js.Any], hot = hot.asInstanceOf[js.Any], t = t.asInstanceOf[js.Any])
    __obj.updateDynamic("clearChanges")(clearChanges.toJsFn)
    __obj.updateDynamic("collectChanges")(js.Any.fromFunction3((t0: scala.Double, t1: scala.Double, t2: js.Any) => collectChanges(t0, t1, t2).runNow()))
    __obj.updateDynamic("destroy")(destroy.toJsFn)
    __obj.updateDynamic("getDataAtCell")(js.Any.fromFunction2((t0: scala.Double, t1: scala.Double) => getDataAtCell(t0, t1).runNow()))
    __obj.updateDynamic("getDataByRange")(js.Any.fromFunction4((t0: scala.Double, t1: scala.Double, t2: scala.Double, t3: scala.Double) => getDataByRange(t0, t1, t2, t3).runNow()))
    __obj.updateDynamic("getRawDataAtCell")(js.Any.fromFunction2((t0: scala.Double, t1: scala.Double) => getRawDataAtCell(t0, t1).runNow()))
    __obj.updateDynamic("getRawDataByRange")(js.Any.fromFunction4((t0: scala.Double, t1: scala.Double, t2: scala.Double, t3: scala.Double) => getRawDataByRange(t0, t1, t2, t3).runNow()))
    __obj.updateDynamic("getSourceDataAtCell")(js.Any.fromFunction2((t0: scala.Double, t1: scala.Double) => getSourceDataAtCell(t0, t1).runNow()))
    __obj.updateDynamic("getSourceDataByRange")(js.Any.fromFunction4((t0: scala.Double, t1: scala.Double, t2: scala.Double, t3: scala.Double) => getSourceDataByRange(t0, t1, t2, t3).runNow()))
    __obj.updateDynamic("isInDataRange")(js.Any.fromFunction2((t0: scala.Double, t1: scala.Double) => isInDataRange(t0, t1).runNow()))
    __obj.updateDynamic("updateSourceData")(js.Any.fromFunction3((t0: scala.Double, t1: scala.Double, t2: js.Any) => updateSourceData(t0, t1, t2).runNow()))
    __obj.asInstanceOf[DataProvider]
  }
}

