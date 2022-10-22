package typingsJapgolly.ngGrid.ngGrid

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISelectionProvider extends StObject {
  
  def ChangeSelection(rowItem: Any, event: Any): Unit
  
  def getSelection(entity: Any): Double
  
  def getSelectionIndex(entity: Any): Double
  
  var ignoreSelectedItemChanges: Boolean
  
  var lastClickedRow: Any
  
  var multi: Boolean
  
  var pKeyParser: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.ICompiledExpression */ Any
  
  var selectedIndex: Double
  
  var selectedItems: js.Array[Any]
  
  def setSelection(rowItem: IRow, isSelected: Boolean): Unit
  
  def toggleSelectAll(checkAll: Boolean, bypass: Boolean, selectFiltered: Boolean): Unit
}
object ISelectionProvider {
  
  inline def apply(
    ChangeSelection: (Any, Any) => Callback,
    getSelection: Any => Double,
    getSelectionIndex: Any => Double,
    ignoreSelectedItemChanges: Boolean,
    lastClickedRow: Any,
    multi: Boolean,
    pKeyParser: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.ICompiledExpression */ Any,
    selectedIndex: Double,
    selectedItems: js.Array[Any],
    setSelection: (IRow, Boolean) => Callback,
    toggleSelectAll: (Boolean, Boolean, Boolean) => Callback
  ): ISelectionProvider = {
    val __obj = js.Dynamic.literal(ChangeSelection = js.Any.fromFunction2((t0: Any, t1: Any) => (ChangeSelection(t0, t1)).runNow()), getSelection = js.Any.fromFunction1(getSelection), getSelectionIndex = js.Any.fromFunction1(getSelectionIndex), ignoreSelectedItemChanges = ignoreSelectedItemChanges.asInstanceOf[js.Any], lastClickedRow = lastClickedRow.asInstanceOf[js.Any], multi = multi.asInstanceOf[js.Any], pKeyParser = pKeyParser.asInstanceOf[js.Any], selectedIndex = selectedIndex.asInstanceOf[js.Any], selectedItems = selectedItems.asInstanceOf[js.Any], setSelection = js.Any.fromFunction2((t0: IRow, t1: Boolean) => (setSelection(t0, t1)).runNow()), toggleSelectAll = js.Any.fromFunction3((t0: Boolean, t1: Boolean, t2: Boolean) => (toggleSelectAll(t0, t1, t2)).runNow()))
    __obj.asInstanceOf[ISelectionProvider]
  }
  
  extension [Self <: ISelectionProvider](x: Self) {
    
    inline def setChangeSelection(value: (Any, Any) => Callback): Self = StObject.set(x, "ChangeSelection", js.Any.fromFunction2((t0: Any, t1: Any) => (value(t0, t1)).runNow()))
    
    inline def setGetSelection(value: Any => Double): Self = StObject.set(x, "getSelection", js.Any.fromFunction1(value))
    
    inline def setGetSelectionIndex(value: Any => Double): Self = StObject.set(x, "getSelectionIndex", js.Any.fromFunction1(value))
    
    inline def setIgnoreSelectedItemChanges(value: Boolean): Self = StObject.set(x, "ignoreSelectedItemChanges", value.asInstanceOf[js.Any])
    
    inline def setLastClickedRow(value: Any): Self = StObject.set(x, "lastClickedRow", value.asInstanceOf[js.Any])
    
    inline def setMulti(value: Boolean): Self = StObject.set(x, "multi", value.asInstanceOf[js.Any])
    
    inline def setPKeyParser(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.ICompiledExpression */ Any
    ): Self = StObject.set(x, "pKeyParser", value.asInstanceOf[js.Any])
    
    inline def setSelectedIndex(value: Double): Self = StObject.set(x, "selectedIndex", value.asInstanceOf[js.Any])
    
    inline def setSelectedItems(value: js.Array[Any]): Self = StObject.set(x, "selectedItems", value.asInstanceOf[js.Any])
    
    inline def setSelectedItemsVarargs(value: Any*): Self = StObject.set(x, "selectedItems", js.Array(value*))
    
    inline def setSetSelection(value: (IRow, Boolean) => Callback): Self = StObject.set(x, "setSelection", js.Any.fromFunction2((t0: IRow, t1: Boolean) => (value(t0, t1)).runNow()))
    
    inline def setToggleSelectAll(value: (Boolean, Boolean, Boolean) => Callback): Self = StObject.set(x, "toggleSelectAll", js.Any.fromFunction3((t0: Boolean, t1: Boolean, t2: Boolean) => (value(t0, t1, t2)).runNow()))
  }
}
