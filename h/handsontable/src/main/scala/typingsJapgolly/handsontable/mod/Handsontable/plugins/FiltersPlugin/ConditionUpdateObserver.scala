package typingsJapgolly.handsontable.mod.Handsontable.plugins.FiltersPlugin

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConditionUpdateObserver extends js.Object {
  var changes: js.Array[Double]
  var conditionCollection: ConditionCollection
  var grouping: Boolean
  var latestEditedColumnPosition: Double
  var latestOrderStack: js.Array[Double]
  def columnDataFactory(column: Double): js.Array[js.Object]
  def destroy(): Unit
  def flush(): Unit
  def groupChanges(): Unit
  def updateStatesAtColumn(column: Double, conditionArgsChange: js.Object): Unit
}

object ConditionUpdateObserver {
  @scala.inline
  def apply(
    changes: js.Array[Double],
    columnDataFactory: Double => CallbackTo[js.Array[js.Object]],
    conditionCollection: ConditionCollection,
    destroy: Callback,
    flush: Callback,
    groupChanges: Callback,
    grouping: Boolean,
    latestEditedColumnPosition: Double,
    latestOrderStack: js.Array[Double],
    updateStatesAtColumn: (Double, js.Object) => Callback
  ): ConditionUpdateObserver = {
    val __obj = js.Dynamic.literal(changes = changes.asInstanceOf[js.Any], conditionCollection = conditionCollection.asInstanceOf[js.Any], grouping = grouping.asInstanceOf[js.Any], latestEditedColumnPosition = latestEditedColumnPosition.asInstanceOf[js.Any], latestOrderStack = latestOrderStack.asInstanceOf[js.Any])
    __obj.updateDynamic("columnDataFactory")(js.Any.fromFunction1((t0: scala.Double) => columnDataFactory(t0).runNow()))
    __obj.updateDynamic("destroy")(destroy.toJsFn)
    __obj.updateDynamic("flush")(flush.toJsFn)
    __obj.updateDynamic("groupChanges")(groupChanges.toJsFn)
    __obj.updateDynamic("updateStatesAtColumn")(js.Any.fromFunction2((t0: scala.Double, t1: js.Object) => updateStatesAtColumn(t0, t1).runNow()))
    __obj.asInstanceOf[ConditionUpdateObserver]
  }
}

