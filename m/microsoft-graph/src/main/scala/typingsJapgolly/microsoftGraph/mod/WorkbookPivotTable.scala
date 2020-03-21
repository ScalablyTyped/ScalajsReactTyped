package typingsJapgolly.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkbookPivotTable extends Entity {
  // Name of the PivotTable.
  var name: js.UndefOr[String] = js.undefined
  // The worksheet containing the current PivotTable. Read-only.
  var worksheet: js.UndefOr[WorkbookWorksheet] = js.undefined
}

object WorkbookPivotTable {
  @scala.inline
  def apply(id: String = null, name: String = null, worksheet: WorkbookWorksheet = null): WorkbookPivotTable = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (worksheet != null) __obj.updateDynamic("worksheet")(worksheet.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkbookPivotTable]
  }
}

