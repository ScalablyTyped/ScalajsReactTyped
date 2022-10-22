package typingsJapgolly.igniteUi.Infragistics

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SortingExpressionsManager extends StObject {
  
  /**
    * Insert expr at the first position of the se (sorting expressions) if there are not any other expressions with flag group by
    *  otherwise if there are such expressions inserts after the last
    *
    * @param se
    * @param expr
    * @param feature
    */
  def addSortingExpression(se: js.Object, expr: js.Object, feature: js.Object): Unit
  
  def setFormattersForSortingExprs(exprs: js.Object, grid: js.Object): Unit
  
  def setGridInstance(grid: js.Object): Unit
}
object SortingExpressionsManager {
  
  inline def apply(
    addSortingExpression: (js.Object, js.Object, js.Object) => Callback,
    setFormattersForSortingExprs: (js.Object, js.Object) => Callback,
    setGridInstance: js.Object => Callback
  ): SortingExpressionsManager = {
    val __obj = js.Dynamic.literal(addSortingExpression = js.Any.fromFunction3((t0: js.Object, t1: js.Object, t2: js.Object) => (addSortingExpression(t0, t1, t2)).runNow()), setFormattersForSortingExprs = js.Any.fromFunction2((t0: js.Object, t1: js.Object) => (setFormattersForSortingExprs(t0, t1)).runNow()), setGridInstance = js.Any.fromFunction1((t0: js.Object) => setGridInstance(t0).runNow()))
    __obj.asInstanceOf[SortingExpressionsManager]
  }
  
  extension [Self <: SortingExpressionsManager](x: Self) {
    
    inline def setAddSortingExpression(value: (js.Object, js.Object, js.Object) => Callback): Self = StObject.set(x, "addSortingExpression", js.Any.fromFunction3((t0: js.Object, t1: js.Object, t2: js.Object) => (value(t0, t1, t2)).runNow()))
    
    inline def setSetFormattersForSortingExprs(value: (js.Object, js.Object) => Callback): Self = StObject.set(x, "setFormattersForSortingExprs", js.Any.fromFunction2((t0: js.Object, t1: js.Object) => (value(t0, t1)).runNow()))
    
    inline def setSetGridInstance(value: js.Object => Callback): Self = StObject.set(x, "setGridInstance", js.Any.fromFunction1((t0: js.Object) => value(t0).runNow()))
  }
}
