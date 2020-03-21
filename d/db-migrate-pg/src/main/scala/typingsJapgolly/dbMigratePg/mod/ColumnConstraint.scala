package typingsJapgolly.dbMigratePg.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.dbMigrateBase.mod.CallbackFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnConstraint extends js.Object {
  var constraints: String
  def foreignKey(callback: CallbackFunction): Unit
}

object ColumnConstraint {
  @scala.inline
  def apply(constraints: String, foreignKey: CallbackFunction => Callback): ColumnConstraint = {
    val __obj = js.Dynamic.literal(constraints = constraints.asInstanceOf[js.Any])
    __obj.updateDynamic("foreignKey")(js.Any.fromFunction1((t0: typingsJapgolly.dbMigrateBase.mod.CallbackFunction) => foreignKey(t0).runNow()))
    __obj.asInstanceOf[ColumnConstraint]
  }
}

