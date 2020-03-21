package typingsJapgolly.googleAppsScript.GoogleAppsScript.Docs.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SuggestedTableCellStyle extends js.Object {
  var tableCellStyle: js.UndefOr[TableCellStyle] = js.undefined
  var tableCellStyleSuggestionState: js.UndefOr[TableCellStyleSuggestionState] = js.undefined
}

object SuggestedTableCellStyle {
  @scala.inline
  def apply(
    tableCellStyle: TableCellStyle = null,
    tableCellStyleSuggestionState: TableCellStyleSuggestionState = null
  ): SuggestedTableCellStyle = {
    val __obj = js.Dynamic.literal()
    if (tableCellStyle != null) __obj.updateDynamic("tableCellStyle")(tableCellStyle.asInstanceOf[js.Any])
    if (tableCellStyleSuggestionState != null) __obj.updateDynamic("tableCellStyleSuggestionState")(tableCellStyleSuggestionState.asInstanceOf[js.Any])
    __obj.asInstanceOf[SuggestedTableCellStyle]
  }
}

