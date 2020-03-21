package typingsJapgolly.agGrid.exportParamsMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.agGrid.columnMod.Column
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseExportParams extends js.Object {
  var allColumns: js.UndefOr[Boolean] = js.undefined
  var columnGroups: js.UndefOr[Boolean] = js.undefined
  var columnKeys: js.UndefOr[js.Array[String | Column]] = js.undefined
  var fileName: js.UndefOr[String] = js.undefined
  var onlySelected: js.UndefOr[Boolean] = js.undefined
  var onlySelectedAllPages: js.UndefOr[Boolean] = js.undefined
  var processCellCallback: js.UndefOr[js.Function1[/* params */ ProcessCellForExportParams, String]] = js.undefined
  var processHeaderCallback: js.UndefOr[js.Function1[/* params */ ProcessHeaderForExportParams, String]] = js.undefined
  var shouldRowBeSkipped: js.UndefOr[js.Function1[/* params */ ShouldRowBeSkippedParams, Boolean]] = js.undefined
  var skipFooters: js.UndefOr[Boolean] = js.undefined
  var skipGroups: js.UndefOr[Boolean] = js.undefined
  var skipHeader: js.UndefOr[Boolean] = js.undefined
  var skipPinnedBottom: js.UndefOr[Boolean] = js.undefined
  var skipPinnedTop: js.UndefOr[Boolean] = js.undefined
  var suppressQuotes: js.UndefOr[Boolean] = js.undefined
}

object BaseExportParams {
  @scala.inline
  def apply(
    allColumns: js.UndefOr[Boolean] = js.undefined,
    columnGroups: js.UndefOr[Boolean] = js.undefined,
    columnKeys: js.Array[String | Column] = null,
    fileName: String = null,
    onlySelected: js.UndefOr[Boolean] = js.undefined,
    onlySelectedAllPages: js.UndefOr[Boolean] = js.undefined,
    processCellCallback: /* params */ ProcessCellForExportParams => CallbackTo[String] = null,
    processHeaderCallback: /* params */ ProcessHeaderForExportParams => CallbackTo[String] = null,
    shouldRowBeSkipped: /* params */ ShouldRowBeSkippedParams => CallbackTo[Boolean] = null,
    skipFooters: js.UndefOr[Boolean] = js.undefined,
    skipGroups: js.UndefOr[Boolean] = js.undefined,
    skipHeader: js.UndefOr[Boolean] = js.undefined,
    skipPinnedBottom: js.UndefOr[Boolean] = js.undefined,
    skipPinnedTop: js.UndefOr[Boolean] = js.undefined,
    suppressQuotes: js.UndefOr[Boolean] = js.undefined
  ): BaseExportParams = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allColumns)) __obj.updateDynamic("allColumns")(allColumns.asInstanceOf[js.Any])
    if (!js.isUndefined(columnGroups)) __obj.updateDynamic("columnGroups")(columnGroups.asInstanceOf[js.Any])
    if (columnKeys != null) __obj.updateDynamic("columnKeys")(columnKeys.asInstanceOf[js.Any])
    if (fileName != null) __obj.updateDynamic("fileName")(fileName.asInstanceOf[js.Any])
    if (!js.isUndefined(onlySelected)) __obj.updateDynamic("onlySelected")(onlySelected.asInstanceOf[js.Any])
    if (!js.isUndefined(onlySelectedAllPages)) __obj.updateDynamic("onlySelectedAllPages")(onlySelectedAllPages.asInstanceOf[js.Any])
    if (processCellCallback != null) __obj.updateDynamic("processCellCallback")(js.Any.fromFunction1((t0: /* params */ typingsJapgolly.agGrid.exportParamsMod.ProcessCellForExportParams) => processCellCallback(t0).runNow()))
    if (processHeaderCallback != null) __obj.updateDynamic("processHeaderCallback")(js.Any.fromFunction1((t0: /* params */ typingsJapgolly.agGrid.exportParamsMod.ProcessHeaderForExportParams) => processHeaderCallback(t0).runNow()))
    if (shouldRowBeSkipped != null) __obj.updateDynamic("shouldRowBeSkipped")(js.Any.fromFunction1((t0: /* params */ typingsJapgolly.agGrid.exportParamsMod.ShouldRowBeSkippedParams) => shouldRowBeSkipped(t0).runNow()))
    if (!js.isUndefined(skipFooters)) __obj.updateDynamic("skipFooters")(skipFooters.asInstanceOf[js.Any])
    if (!js.isUndefined(skipGroups)) __obj.updateDynamic("skipGroups")(skipGroups.asInstanceOf[js.Any])
    if (!js.isUndefined(skipHeader)) __obj.updateDynamic("skipHeader")(skipHeader.asInstanceOf[js.Any])
    if (!js.isUndefined(skipPinnedBottom)) __obj.updateDynamic("skipPinnedBottom")(skipPinnedBottom.asInstanceOf[js.Any])
    if (!js.isUndefined(skipPinnedTop)) __obj.updateDynamic("skipPinnedTop")(skipPinnedTop.asInstanceOf[js.Any])
    if (!js.isUndefined(suppressQuotes)) __obj.updateDynamic("suppressQuotes")(suppressQuotes.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseExportParams]
  }
}

