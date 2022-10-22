package typingsJapgolly.uiGrid.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.angular.mod.IScope
import typingsJapgolly.uiGrid.mod.grouping.aggregationChangedHandler
import typingsJapgolly.uiGrid.mod.grouping.groupingChangedHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregationChanged[TEntity] extends StObject {
  
  /**
    * raised whenever aggregation is changed, added or removed from a column
    * @param scope Grid Scope
    * @param handler Callback method
    */
  def aggregationChanged(scope: IScope, handler: aggregationChangedHandler[TEntity]): Unit
  
  /**
    * raised whenever the grouped columns change
    * @param scope Grid Scope
    * @param handler Callback method
    */
  def groupingChanged(scope: IScope, handler: groupingChangedHandler[TEntity]): Unit
}
object AggregationChanged {
  
  inline def apply[TEntity](
    aggregationChanged: (IScope, aggregationChangedHandler[TEntity]) => Callback,
    groupingChanged: (IScope, groupingChangedHandler[TEntity]) => Callback
  ): AggregationChanged[TEntity] = {
    val __obj = js.Dynamic.literal(aggregationChanged = js.Any.fromFunction2((t0: IScope, t1: aggregationChangedHandler[TEntity]) => (aggregationChanged(t0, t1)).runNow()), groupingChanged = js.Any.fromFunction2((t0: IScope, t1: groupingChangedHandler[TEntity]) => (groupingChanged(t0, t1)).runNow()))
    __obj.asInstanceOf[AggregationChanged[TEntity]]
  }
  
  extension [Self <: AggregationChanged[?], TEntity](x: Self & AggregationChanged[TEntity]) {
    
    inline def setAggregationChanged(value: (IScope, aggregationChangedHandler[TEntity]) => Callback): Self = StObject.set(x, "aggregationChanged", js.Any.fromFunction2((t0: IScope, t1: aggregationChangedHandler[TEntity]) => (value(t0, t1)).runNow()))
    
    inline def setGroupingChanged(value: (IScope, groupingChangedHandler[TEntity]) => Callback): Self = StObject.set(x, "groupingChanged", js.Any.fromFunction2((t0: IScope, t1: groupingChangedHandler[TEntity]) => (value(t0, t1)).runNow()))
  }
}
