package typingsJapgolly.googleAppsScript.GoogleAppsScript.Docs.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SheetsChartReferenceSuggestionState extends js.Object {
  var chartIdSuggested: js.UndefOr[Boolean] = js.undefined
  var spreadsheetIdSuggested: js.UndefOr[Boolean] = js.undefined
}

object SheetsChartReferenceSuggestionState {
  @scala.inline
  def apply(
    chartIdSuggested: js.UndefOr[Boolean] = js.undefined,
    spreadsheetIdSuggested: js.UndefOr[Boolean] = js.undefined
  ): SheetsChartReferenceSuggestionState = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(chartIdSuggested)) __obj.updateDynamic("chartIdSuggested")(chartIdSuggested.asInstanceOf[js.Any])
    if (!js.isUndefined(spreadsheetIdSuggested)) __obj.updateDynamic("spreadsheetIdSuggested")(spreadsheetIdSuggested.asInstanceOf[js.Any])
    __obj.asInstanceOf[SheetsChartReferenceSuggestionState]
  }
}

