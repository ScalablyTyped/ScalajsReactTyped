package typingsJapgolly.ngGrid.ngGrid

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDomAccessProvider extends js.Object {
  var grid: IGridInstance
  var previousColumn: IColumn
  def changeUserSelect(
    elm: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.IAugmentedJQuery */ js.Any,
    value: String
  ): Unit
  def focusCellElement($scope: IGridScope, index: Double): Unit
  def selectionHandlers(
    $scope: IGridScope,
    elm: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.IAugmentedJQuery */ js.Any
  ): Unit
}

object IDomAccessProvider {
  @scala.inline
  def apply(
    changeUserSelect: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.IAugmentedJQuery */ js.Any, String) => Callback,
    focusCellElement: (IGridScope, Double) => Callback,
    grid: IGridInstance,
    previousColumn: IColumn,
    selectionHandlers: (IGridScope, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.IAugmentedJQuery */ js.Any) => Callback
  ): IDomAccessProvider = {
    val __obj = js.Dynamic.literal(grid = grid.asInstanceOf[js.Any], previousColumn = previousColumn.asInstanceOf[js.Any])
    __obj.updateDynamic("changeUserSelect")(js.Any.fromFunction2((t0: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.IAugmentedJQuery */ js.Any, t1: java.lang.String) => changeUserSelect(t0, t1).runNow()))
    __obj.updateDynamic("focusCellElement")(js.Any.fromFunction2((t0: typingsJapgolly.ngGrid.ngGrid.IGridScope, t1: scala.Double) => focusCellElement(t0, t1).runNow()))
    __obj.updateDynamic("selectionHandlers")(js.Any.fromFunction2((t0: typingsJapgolly.ngGrid.ngGrid.IGridScope, t1: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.IAugmentedJQuery */ js.Any) => selectionHandlers(t0, t1).runNow()))
    __obj.asInstanceOf[IDomAccessProvider]
  }
}

