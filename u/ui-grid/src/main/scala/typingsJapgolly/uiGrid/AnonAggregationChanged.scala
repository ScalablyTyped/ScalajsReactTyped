package typingsJapgolly.uiGrid

import japgolly.scalajs.react.Callback
import typingsJapgolly.angular.mod.IScope
import typingsJapgolly.uiGrid.mod.grouping.aggregationChangedHandler
import typingsJapgolly.uiGrid.mod.grouping.groupingChangedHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAggregationChanged[TEntity] extends js.Object {
  /**
    * raised whenever aggregation is changed, added or removed from a column
    * @param {ng.IScope} scope Grid Scope
    * @param {aggregationChangedHandler} handler Callback method
    */
  def aggregationChanged(scope: IScope, handler: aggregationChangedHandler[TEntity]): Unit
  /**
    * raised whenever the grouped columns change
    * @param {ng.IScope} scope Grid Scope
    * @param {groupingChangedHandler} handler Callback method
    */
  def groupingChanged(scope: IScope, handler: groupingChangedHandler[TEntity]): Unit
}

object AnonAggregationChanged {
  @scala.inline
  def apply[TEntity](
    aggregationChanged: (IScope, aggregationChangedHandler[TEntity]) => Callback,
    groupingChanged: (IScope, groupingChangedHandler[TEntity]) => Callback
  ): AnonAggregationChanged[TEntity] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("aggregationChanged")(js.Any.fromFunction2((t0: typingsJapgolly.angular.mod.IScope, t1: typingsJapgolly.uiGrid.mod.grouping.aggregationChangedHandler[TEntity]) => aggregationChanged(t0, t1).runNow()))
    __obj.updateDynamic("groupingChanged")(js.Any.fromFunction2((t0: typingsJapgolly.angular.mod.IScope, t1: typingsJapgolly.uiGrid.mod.grouping.groupingChangedHandler[TEntity]) => groupingChanged(t0, t1).runNow()))
    __obj.asInstanceOf[AnonAggregationChanged[TEntity]]
  }
}

