package typingsJapgolly.knockoutKogrid.kg

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DomUtilityService extends js.Object {
  def BuildStyles(grid: Grid[_]): Unit
  def UpdateGridLayout(grid: Grid[_]): Unit
}

object DomUtilityService {
  @scala.inline
  def apply(BuildStyles: Grid[js.Any] => Callback, UpdateGridLayout: Grid[js.Any] => Callback): DomUtilityService = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("BuildStyles")(js.Any.fromFunction1((t0: typingsJapgolly.knockoutKogrid.kg.Grid[js.Any]) => BuildStyles(t0).runNow()))
    __obj.updateDynamic("UpdateGridLayout")(js.Any.fromFunction1((t0: typingsJapgolly.knockoutKogrid.kg.Grid[js.Any]) => UpdateGridLayout(t0).runNow()))
    __obj.asInstanceOf[DomUtilityService]
  }
}

