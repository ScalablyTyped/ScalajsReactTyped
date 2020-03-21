package typingsJapgolly.tabulatorTables.Tabulator

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.tabulatorTables.tabulatorTablesBooleans.`true`
import typingsJapgolly.tabulatorTables.tabulatorTablesStrings.editor
import typingsJapgolly.tabulatorTables.tabulatorTablesStrings.hybrid
import typingsJapgolly.tabulatorTables.tabulatorTablesStrings.table
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutoCompleteParams
  extends SharedEditorParams
     with SharedSelectAutoCompleteEditorParams
     with _EditorParams {
  var allowEmpty: js.UndefOr[Boolean] = js.undefined
  var freetext: js.UndefOr[Boolean] = js.undefined
  var listItemFormatter: js.UndefOr[js.Function2[/* value */ String, /* text */ String, String]] = js.undefined
  var searchFunc: js.UndefOr[js.Function2[/* term */ String, /* values */ js.Array[String], js.Array[String]]] = js.undefined
  var showListOnEmpty: js.UndefOr[Boolean] = js.undefined
  var values: `true` | js.Array[String] | JSONRecord | String
  var verticalNavigation: js.UndefOr[editor | table | hybrid] = js.undefined
}

object AutoCompleteParams {
  @scala.inline
  def apply(
    values: `true` | js.Array[String] | JSONRecord | String,
    allowEmpty: js.UndefOr[Boolean] = js.undefined,
    defaultValue: String = null,
    elementAttributes: JSONRecord = null,
    freetext: js.UndefOr[Boolean] = js.undefined,
    listItemFormatter: (/* value */ String, /* text */ String) => CallbackTo[String] = null,
    searchFunc: (/* term */ String, /* values */ js.Array[String]) => CallbackTo[js.Array[String]] = null,
    showListOnEmpty: js.UndefOr[Boolean] = js.undefined,
    verticalNavigation: editor | table | hybrid = null
  ): AutoCompleteParams = {
    val __obj = js.Dynamic.literal(values = values.asInstanceOf[js.Any])
    if (!js.isUndefined(allowEmpty)) __obj.updateDynamic("allowEmpty")(allowEmpty.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (elementAttributes != null) __obj.updateDynamic("elementAttributes")(elementAttributes.asInstanceOf[js.Any])
    if (!js.isUndefined(freetext)) __obj.updateDynamic("freetext")(freetext.asInstanceOf[js.Any])
    if (listItemFormatter != null) __obj.updateDynamic("listItemFormatter")(js.Any.fromFunction2((t0: /* value */ java.lang.String, t1: /* text */ java.lang.String) => listItemFormatter(t0, t1).runNow()))
    if (searchFunc != null) __obj.updateDynamic("searchFunc")(js.Any.fromFunction2((t0: /* term */ java.lang.String, t1: /* values */ js.Array[java.lang.String]) => searchFunc(t0, t1).runNow()))
    if (!js.isUndefined(showListOnEmpty)) __obj.updateDynamic("showListOnEmpty")(showListOnEmpty.asInstanceOf[js.Any])
    if (verticalNavigation != null) __obj.updateDynamic("verticalNavigation")(verticalNavigation.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoCompleteParams]
  }
}

