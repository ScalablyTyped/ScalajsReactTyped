package typingsJapgolly.knockoutKogrid.kg

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Plugin[EntityType] extends js.Object {
  def onGridInit(grid: Grid[EntityType]): Unit
}

object Plugin {
  @scala.inline
  def apply[EntityType](onGridInit: Grid[EntityType] => Callback): Plugin[EntityType] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("onGridInit")(js.Any.fromFunction1((t0: typingsJapgolly.knockoutKogrid.kg.Grid[EntityType]) => onGridInit(t0).runNow()))
    __obj.asInstanceOf[Plugin[EntityType]]
  }
}

