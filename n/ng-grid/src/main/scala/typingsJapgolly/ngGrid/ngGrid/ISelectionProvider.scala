package typingsJapgolly.ngGrid.ngGrid

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISelectionProvider extends js.Object {
  var ignoreSelectedItemChanges: Boolean
  var lastClickedRow: js.Any
  var multi: Boolean
  var pKeyParser: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.ICompiledExpression */ js.Any
  var selectedIndex: Double
  var selectedItems: js.Array[_]
  def ChangeSelection(rowItem: js.Any, event: js.Any): Unit
  def getSelection(entity: js.Any): Double
  def getSelectionIndex(entity: js.Any): Double
  def setSelection(rowItem: IRow, isSelected: Boolean): Unit
  def toggleSelectAll(checkAll: Boolean, bypass: Boolean, selectFiltered: Boolean): Unit
}

object ISelectionProvider {
  @scala.inline
  def apply(
    ChangeSelection: (js.Any, js.Any) => Callback,
    getSelection: js.Any => CallbackTo[Double],
    getSelectionIndex: js.Any => CallbackTo[Double],
    ignoreSelectedItemChanges: Boolean,
    lastClickedRow: js.Any,
    multi: Boolean,
    pKeyParser: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.ICompiledExpression */ js.Any,
    selectedIndex: Double,
    selectedItems: js.Array[_],
    setSelection: (IRow, Boolean) => Callback,
    toggleSelectAll: (Boolean, Boolean, Boolean) => Callback
  ): ISelectionProvider = {
    val __obj = js.Dynamic.literal(ignoreSelectedItemChanges = ignoreSelectedItemChanges.asInstanceOf[js.Any], lastClickedRow = lastClickedRow.asInstanceOf[js.Any], multi = multi.asInstanceOf[js.Any], pKeyParser = pKeyParser.asInstanceOf[js.Any], selectedIndex = selectedIndex.asInstanceOf[js.Any], selectedItems = selectedItems.asInstanceOf[js.Any])
    __obj.updateDynamic("ChangeSelection")(js.Any.fromFunction2((t0: js.Any, t1: js.Any) => ChangeSelection(t0, t1).runNow()))
    __obj.updateDynamic("getSelection")(js.Any.fromFunction1((t0: js.Any) => getSelection(t0).runNow()))
    __obj.updateDynamic("getSelectionIndex")(js.Any.fromFunction1((t0: js.Any) => getSelectionIndex(t0).runNow()))
    __obj.updateDynamic("setSelection")(js.Any.fromFunction2((t0: typingsJapgolly.ngGrid.ngGrid.IRow, t1: scala.Boolean) => setSelection(t0, t1).runNow()))
    __obj.updateDynamic("toggleSelectAll")(js.Any.fromFunction3((t0: scala.Boolean, t1: scala.Boolean, t2: scala.Boolean) => toggleSelectAll(t0, t1, t2).runNow()))
    __obj.asInstanceOf[ISelectionProvider]
  }
}

