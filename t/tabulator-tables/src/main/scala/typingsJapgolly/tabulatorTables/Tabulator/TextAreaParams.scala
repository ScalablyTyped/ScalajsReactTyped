package typingsJapgolly.tabulatorTables.Tabulator

import typingsJapgolly.tabulatorTables.tabulatorTablesStrings.editor
import typingsJapgolly.tabulatorTables.tabulatorTablesStrings.hybrid
import typingsJapgolly.tabulatorTables.tabulatorTablesStrings.table
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextAreaParams
  extends SharedEditorParams
     with _EditorParams {
  var verticalNavigation: js.UndefOr[editor | table | hybrid] = js.undefined
}

object TextAreaParams {
  @scala.inline
  def apply(elementAttributes: JSONRecord = null, verticalNavigation: editor | table | hybrid = null): TextAreaParams = {
    val __obj = js.Dynamic.literal()
    if (elementAttributes != null) __obj.updateDynamic("elementAttributes")(elementAttributes.asInstanceOf[js.Any])
    if (verticalNavigation != null) __obj.updateDynamic("verticalNavigation")(verticalNavigation.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextAreaParams]
  }
}

