package typingsJapgolly.ngGrid.ngGrid

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IDomAccessProvider extends StObject {
  
  def changeUserSelect(
    elm: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.IAugmentedJQuery */ Any,
    value: String
  ): Unit
  
  def focusCellElement($scope: IGridScope, index: Double): Unit
  
  var grid: IGridInstance
  
  var previousColumn: IColumn
  
  def selectionHandlers(
    $scope: IGridScope,
    elm: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.IAugmentedJQuery */ Any
  ): Unit
}
object IDomAccessProvider {
  
  inline def apply(
    changeUserSelect: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.IAugmentedJQuery */ Any, String) => Callback,
    focusCellElement: (IGridScope, Double) => Callback,
    grid: IGridInstance,
    previousColumn: IColumn,
    selectionHandlers: (IGridScope, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.IAugmentedJQuery */ Any) => Callback
  ): IDomAccessProvider = {
    val __obj = js.Dynamic.literal(changeUserSelect = js.Any.fromFunction2((t0: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.IAugmentedJQuery */ Any, t1: String) => (changeUserSelect(t0, t1)).runNow()), focusCellElement = js.Any.fromFunction2((t0: IGridScope, t1: Double) => (focusCellElement(t0, t1)).runNow()), grid = grid.asInstanceOf[js.Any], previousColumn = previousColumn.asInstanceOf[js.Any], selectionHandlers = js.Any.fromFunction2((t0: IGridScope, t1: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.IAugmentedJQuery */ Any) => (selectionHandlers(t0, t1)).runNow()))
    __obj.asInstanceOf[IDomAccessProvider]
  }
  
  extension [Self <: IDomAccessProvider](x: Self) {
    
    inline def setChangeUserSelect(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.IAugmentedJQuery */ Any, String) => Callback
    ): Self = StObject.set(x, "changeUserSelect", js.Any.fromFunction2((t0: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.IAugmentedJQuery */ Any, t1: String) => (value(t0, t1)).runNow()))
    
    inline def setFocusCellElement(value: (IGridScope, Double) => Callback): Self = StObject.set(x, "focusCellElement", js.Any.fromFunction2((t0: IGridScope, t1: Double) => (value(t0, t1)).runNow()))
    
    inline def setGrid(value: IGridInstance): Self = StObject.set(x, "grid", value.asInstanceOf[js.Any])
    
    inline def setPreviousColumn(value: IColumn): Self = StObject.set(x, "previousColumn", value.asInstanceOf[js.Any])
    
    inline def setSelectionHandlers(
      value: (IGridScope, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.IAugmentedJQuery */ Any) => Callback
    ): Self = StObject.set(x, "selectionHandlers", js.Any.fromFunction2((t0: IGridScope, t1: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.IAugmentedJQuery */ Any) => (value(t0, t1)).runNow()))
  }
}
