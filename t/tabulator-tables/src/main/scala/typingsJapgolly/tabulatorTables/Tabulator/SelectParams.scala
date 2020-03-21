package typingsJapgolly.tabulatorTables.Tabulator

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.tabulatorTables.tabulatorTablesBooleans.`true`
import typingsJapgolly.tabulatorTables.tabulatorTablesStrings.editor
import typingsJapgolly.tabulatorTables.tabulatorTablesStrings.hybrid
import typingsJapgolly.tabulatorTables.tabulatorTablesStrings.table
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectParams
  extends SharedEditorParams
     with SharedSelectAutoCompleteEditorParams
     with _EditorParams {
  var listItemFormatter: js.UndefOr[js.Function2[/* value */ String, /* text */ String, String]] = js.undefined
  var values: `true` | (js.Array[SelectParamsGroup | String]) | JSONRecord | String
  var verticalNavigation: js.UndefOr[editor | table | hybrid] = js.undefined
}

object SelectParams {
  @scala.inline
  def apply(
    values: `true` | (js.Array[SelectParamsGroup | String]) | JSONRecord | String,
    defaultValue: String = null,
    elementAttributes: JSONRecord = null,
    listItemFormatter: (/* value */ String, /* text */ String) => CallbackTo[String] = null,
    verticalNavigation: editor | table | hybrid = null
  ): SelectParams = {
    val __obj = js.Dynamic.literal(values = values.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (elementAttributes != null) __obj.updateDynamic("elementAttributes")(elementAttributes.asInstanceOf[js.Any])
    if (listItemFormatter != null) __obj.updateDynamic("listItemFormatter")(js.Any.fromFunction2((t0: /* value */ java.lang.String, t1: /* text */ java.lang.String) => listItemFormatter(t0, t1).runNow()))
    if (verticalNavigation != null) __obj.updateDynamic("verticalNavigation")(verticalNavigation.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectParams]
  }
}

