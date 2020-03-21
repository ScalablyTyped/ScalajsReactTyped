package typingsJapgolly.uiGrid

import japgolly.scalajs.react.Callback
import typingsJapgolly.angular.mod.IScope
import typingsJapgolly.uiGrid.mod.rowEdit.saveRowHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSaveRow[TEntity] extends js.Object {
  /**
    * Raised when a row is ready for saving.
    * Once your row has saved you may need to use angular.extend to update the data entity
    * with any changed data from your save.
    * i.e. lock version information, or last update time/user information
    *
    * Your method should call setSavePromise somewhere in the body before returning control.
    * The feature will then wait, with the gridRow greyed out whilst this promise is being resolved.
    * @param {ng.IScope} scope The grid scope
    * @param {saveRowHandler} handler Callback
    */
  def saveRow(scope: IScope, handler: saveRowHandler[TEntity]): Unit
}

object AnonSaveRow {
  @scala.inline
  def apply[TEntity](saveRow: (IScope, saveRowHandler[TEntity]) => Callback): AnonSaveRow[TEntity] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("saveRow")(js.Any.fromFunction2((t0: typingsJapgolly.angular.mod.IScope, t1: typingsJapgolly.uiGrid.mod.rowEdit.saveRowHandler[TEntity]) => saveRow(t0, t1).runNow()))
    __obj.asInstanceOf[AnonSaveRow[TEntity]]
  }
}

