package typingsJapgolly.griddleReact.mod.utils

import japgolly.scalajs.react.Callback
import typingsJapgolly.griddleReact.mod.GriddleSortKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SortProperties extends js.Object {
  var columnId: String
  var sortProperty: GriddleSortKey
  def setSortColumn(sortProperties: js.Function1[/* key */ GriddleSortKey, Unit]): Unit
}

object SortProperties {
  @scala.inline
  def apply(
    columnId: String,
    setSortColumn: js.Function1[/* key */ GriddleSortKey, Unit] => Callback,
    sortProperty: GriddleSortKey
  ): SortProperties = {
    val __obj = js.Dynamic.literal(columnId = columnId.asInstanceOf[js.Any], sortProperty = sortProperty.asInstanceOf[js.Any])
    __obj.updateDynamic("setSortColumn")(js.Any.fromFunction1((t0: js.Function1[/* key */ typingsJapgolly.griddleReact.mod.GriddleSortKey, scala.Unit]) => setSortColumn(t0).runNow()))
    __obj.asInstanceOf[SortProperties]
  }
}

