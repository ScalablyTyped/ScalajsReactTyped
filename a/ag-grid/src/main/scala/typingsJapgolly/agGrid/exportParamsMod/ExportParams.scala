package typingsJapgolly.agGrid.exportParamsMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.agGrid.columnMod.Column
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExportParams[T] extends BaseExportParams {
  var customFooter: js.UndefOr[T] = js.undefined
  var customHeader: js.UndefOr[T] = js.undefined
}

object ExportParams {
  @scala.inline
  def apply[T](
    allColumns: js.UndefOr[Boolean] = js.undefined,
    columnGroups: js.UndefOr[Boolean] = js.undefined,
    columnKeys: js.Array[String | Column] = null,
    customFooter: T = null,
    customHeader: T = null,
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
  ): ExportParams[T] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allColumns)) __obj.updateDynamic("allColumns")(allColumns.asInstanceOf[js.Any])
    if (!js.isUndefined(columnGroups)) __obj.updateDynamic("columnGroups")(columnGroups.asInstanceOf[js.Any])
    if (columnKeys != null) __obj.updateDynamic("columnKeys")(columnKeys.asInstanceOf[js.Any])
    if (customFooter != null) __obj.updateDynamic("customFooter")(customFooter.asInstanceOf[js.Any])
    if (customHeader != null) __obj.updateDynamic("customHeader")(customHeader.asInstanceOf[js.Any])
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
    __obj.asInstanceOf[ExportParams[T]]
  }
}

