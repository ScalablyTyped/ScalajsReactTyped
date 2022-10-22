package typingsJapgolly.igniteUi

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgGridCellMergingMethods extends StObject {
  
  def changeGlobalLanguage(): Unit
  
  def changeGlobalRegional(): Unit
  
  /**
    * Changes the all locales contained into a specified container to the language specified in [options.language](ui.igwidget#options:language)
    * Note that this method is for rare scenarios, use [language](ui.igwidget#options:language) or [locale](ui.igwidget#options:locale) option setter
    *
    * @param $container Optional parameter - if not set it would use the element of the widget as $container
    */
  def changeLocale($container: js.Object): Unit
  
  /**
    * Removes all igGridCellMerging UI changes and destroys the widget
    */
  def destroy(): Unit
  
  /**
    * Returns the merge state of a column.
    *
    * @param column The column index or column key to get the state for.
    */
  def isMerged(column: js.Object): Boolean
  
  /**
    * Merges the specified column unless it is already merged.
    *
    * @param column The column index or column key to merge.
    * @param raiseEvents Specifies if the operation should raise merging-related events.
    */
  def mergeColumn(column: js.Object, raiseEvents: Boolean): String
  
  def mergeRow(id: js.Object, fireEvents: js.Object): Unit
  
  /**
    * Restores the column to its unmerged state. Does nothing if the column is not merged.
    *
    * @param column The column index or column key to unmerge.
    */
  def unmergeColumn(column: js.Object): String
  
  def unmergeRow(id: js.Object, index: js.Object): Unit
}
object IgGridCellMergingMethods {
  
  inline def apply(
    changeGlobalLanguage: Callback,
    changeGlobalRegional: Callback,
    changeLocale: js.Object => Callback,
    destroy: Callback,
    isMerged: js.Object => Boolean,
    mergeColumn: (js.Object, Boolean) => String,
    mergeRow: (js.Object, js.Object) => Callback,
    unmergeColumn: js.Object => String,
    unmergeRow: (js.Object, js.Object) => Callback
  ): IgGridCellMergingMethods = {
    val __obj = js.Dynamic.literal(changeGlobalLanguage = changeGlobalLanguage.toJsFn, changeGlobalRegional = changeGlobalRegional.toJsFn, changeLocale = js.Any.fromFunction1((t0: js.Object) => changeLocale(t0).runNow()), destroy = destroy.toJsFn, isMerged = js.Any.fromFunction1(isMerged), mergeColumn = js.Any.fromFunction2(mergeColumn), mergeRow = js.Any.fromFunction2((t0: js.Object, t1: js.Object) => (mergeRow(t0, t1)).runNow()), unmergeColumn = js.Any.fromFunction1(unmergeColumn), unmergeRow = js.Any.fromFunction2((t0: js.Object, t1: js.Object) => (unmergeRow(t0, t1)).runNow()))
    __obj.asInstanceOf[IgGridCellMergingMethods]
  }
  
  extension [Self <: IgGridCellMergingMethods](x: Self) {
    
    inline def setChangeGlobalLanguage(value: Callback): Self = StObject.set(x, "changeGlobalLanguage", value.toJsFn)
    
    inline def setChangeGlobalRegional(value: Callback): Self = StObject.set(x, "changeGlobalRegional", value.toJsFn)
    
    inline def setChangeLocale(value: js.Object => Callback): Self = StObject.set(x, "changeLocale", js.Any.fromFunction1((t0: js.Object) => value(t0).runNow()))
    
    inline def setDestroy(value: Callback): Self = StObject.set(x, "destroy", value.toJsFn)
    
    inline def setIsMerged(value: js.Object => Boolean): Self = StObject.set(x, "isMerged", js.Any.fromFunction1(value))
    
    inline def setMergeColumn(value: (js.Object, Boolean) => String): Self = StObject.set(x, "mergeColumn", js.Any.fromFunction2(value))
    
    inline def setMergeRow(value: (js.Object, js.Object) => Callback): Self = StObject.set(x, "mergeRow", js.Any.fromFunction2((t0: js.Object, t1: js.Object) => (value(t0, t1)).runNow()))
    
    inline def setUnmergeColumn(value: js.Object => String): Self = StObject.set(x, "unmergeColumn", js.Any.fromFunction1(value))
    
    inline def setUnmergeRow(value: (js.Object, js.Object) => Callback): Self = StObject.set(x, "unmergeRow", js.Any.fromFunction2((t0: js.Object, t1: js.Object) => (value(t0, t1)).runNow()))
  }
}
