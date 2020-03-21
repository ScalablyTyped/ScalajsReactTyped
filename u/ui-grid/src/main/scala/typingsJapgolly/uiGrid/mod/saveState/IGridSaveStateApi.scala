package typingsJapgolly.uiGrid.mod.saveState

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.angular.mod.IScope
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGridSaveStateApi extends js.Object {
  // Methods
  /**
    * Restores the provided state into the grid
    * @param {ng.IScope} $scope A scope we can broadcast on
    * @param {IGridSavedState} state The state that should ve restored into the grid
    */
  def restore($scope: IScope, state: IGridSavedState): Unit
  /**
    * Packages the current state of the grid into an object, and provides it to the user for saving
    * @returns {IGridSavedState} Current grid state as a POJO
    */
  def save(): IGridSavedState
}

object IGridSaveStateApi {
  @scala.inline
  def apply(restore: (IScope, IGridSavedState) => Callback, save: CallbackTo[IGridSavedState]): IGridSaveStateApi = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("restore")(js.Any.fromFunction2((t0: typingsJapgolly.angular.mod.IScope, t1: typingsJapgolly.uiGrid.mod.saveState.IGridSavedState) => restore(t0, t1).runNow()))
    __obj.updateDynamic("save")(save.toJsFn)
    __obj.asInstanceOf[IGridSaveStateApi]
  }
}

