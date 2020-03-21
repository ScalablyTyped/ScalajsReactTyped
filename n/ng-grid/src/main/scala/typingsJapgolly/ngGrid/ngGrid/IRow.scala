package typingsJapgolly.ngGrid.ngGrid

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRow extends js.Object {
  var config: IRowConfig
  var cursor: String
  var entity: js.Any
  var offsetTop: Double
  var rowDisplayIndex: Double
  var rowIndex: Double
  var selected: Boolean
  var selectionProvider: ISelectionProvider
  var utils: js.Any
  def afterSelectionChange(): Unit
  def alternatingRowClass(): Unit
  def beforeSelectionChange(): Unit
  def continueSelection(event: js.Any): Unit
  def copy(): IRow
  def ensureEntity(expected: js.Any): Unit
  def getProperty(path: String): js.Any
  def setSelection(isSelected: Boolean): Unit
  def setVars(fromRow: IRow): Unit
  def toggleSelected(event: js.Any): Boolean
}

object IRow {
  @scala.inline
  def apply(
    afterSelectionChange: Callback,
    alternatingRowClass: Callback,
    beforeSelectionChange: Callback,
    config: IRowConfig,
    continueSelection: js.Any => Callback,
    copy: CallbackTo[IRow],
    cursor: String,
    ensureEntity: js.Any => Callback,
    entity: js.Any,
    getProperty: String => CallbackTo[js.Any],
    offsetTop: Double,
    rowDisplayIndex: Double,
    rowIndex: Double,
    selected: Boolean,
    selectionProvider: ISelectionProvider,
    setSelection: Boolean => Callback,
    setVars: IRow => Callback,
    toggleSelected: js.Any => CallbackTo[Boolean],
    utils: js.Any
  ): IRow = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], cursor = cursor.asInstanceOf[js.Any], entity = entity.asInstanceOf[js.Any], offsetTop = offsetTop.asInstanceOf[js.Any], rowDisplayIndex = rowDisplayIndex.asInstanceOf[js.Any], rowIndex = rowIndex.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any], selectionProvider = selectionProvider.asInstanceOf[js.Any], utils = utils.asInstanceOf[js.Any])
    __obj.updateDynamic("afterSelectionChange")(afterSelectionChange.toJsFn)
    __obj.updateDynamic("alternatingRowClass")(alternatingRowClass.toJsFn)
    __obj.updateDynamic("beforeSelectionChange")(beforeSelectionChange.toJsFn)
    __obj.updateDynamic("continueSelection")(js.Any.fromFunction1((t0: js.Any) => continueSelection(t0).runNow()))
    __obj.updateDynamic("copy")(copy.toJsFn)
    __obj.updateDynamic("ensureEntity")(js.Any.fromFunction1((t0: js.Any) => ensureEntity(t0).runNow()))
    __obj.updateDynamic("getProperty")(js.Any.fromFunction1((t0: java.lang.String) => getProperty(t0).runNow()))
    __obj.updateDynamic("setSelection")(js.Any.fromFunction1((t0: scala.Boolean) => setSelection(t0).runNow()))
    __obj.updateDynamic("setVars")(js.Any.fromFunction1((t0: typingsJapgolly.ngGrid.ngGrid.IRow) => setVars(t0).runNow()))
    __obj.updateDynamic("toggleSelected")(js.Any.fromFunction1((t0: js.Any) => toggleSelected(t0).runNow()))
    __obj.asInstanceOf[IRow]
  }
}

