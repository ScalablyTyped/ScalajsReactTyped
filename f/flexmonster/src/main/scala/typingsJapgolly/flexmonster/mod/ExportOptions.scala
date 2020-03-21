package typingsJapgolly.flexmonster.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExportOptions extends js.Object {
  var destinationType: js.UndefOr[String] = js.undefined
  var excelExportAll: js.UndefOr[Boolean] = js.undefined
  var excelSheetName: js.UndefOr[String] = js.undefined
  var filename: js.UndefOr[String] = js.undefined
  var fontUrl: js.UndefOr[String] = js.undefined
  var footer: js.UndefOr[String] = js.undefined
  var header: js.UndefOr[String] = js.undefined
  var pageOrientation: js.UndefOr[String] = js.undefined
  var requestHeaders: js.UndefOr[js.Object] = js.undefined
  var showFilters: js.UndefOr[Boolean] = js.undefined
  var url: js.UndefOr[String] = js.undefined
  var useCustomizeCellForData: js.UndefOr[Boolean] = js.undefined
  var useOlapFormattingInExcel: js.UndefOr[Boolean] = js.undefined
}

object ExportOptions {
  @scala.inline
  def apply(
    destinationType: String = null,
    excelExportAll: js.UndefOr[Boolean] = js.undefined,
    excelSheetName: String = null,
    filename: String = null,
    fontUrl: String = null,
    footer: String = null,
    header: String = null,
    pageOrientation: String = null,
    requestHeaders: js.Object = null,
    showFilters: js.UndefOr[Boolean] = js.undefined,
    url: String = null,
    useCustomizeCellForData: js.UndefOr[Boolean] = js.undefined,
    useOlapFormattingInExcel: js.UndefOr[Boolean] = js.undefined
  ): ExportOptions = {
    val __obj = js.Dynamic.literal()
    if (destinationType != null) __obj.updateDynamic("destinationType")(destinationType.asInstanceOf[js.Any])
    if (!js.isUndefined(excelExportAll)) __obj.updateDynamic("excelExportAll")(excelExportAll.asInstanceOf[js.Any])
    if (excelSheetName != null) __obj.updateDynamic("excelSheetName")(excelSheetName.asInstanceOf[js.Any])
    if (filename != null) __obj.updateDynamic("filename")(filename.asInstanceOf[js.Any])
    if (fontUrl != null) __obj.updateDynamic("fontUrl")(fontUrl.asInstanceOf[js.Any])
    if (footer != null) __obj.updateDynamic("footer")(footer.asInstanceOf[js.Any])
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (pageOrientation != null) __obj.updateDynamic("pageOrientation")(pageOrientation.asInstanceOf[js.Any])
    if (requestHeaders != null) __obj.updateDynamic("requestHeaders")(requestHeaders.asInstanceOf[js.Any])
    if (!js.isUndefined(showFilters)) __obj.updateDynamic("showFilters")(showFilters.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (!js.isUndefined(useCustomizeCellForData)) __obj.updateDynamic("useCustomizeCellForData")(useCustomizeCellForData.asInstanceOf[js.Any])
    if (!js.isUndefined(useOlapFormattingInExcel)) __obj.updateDynamic("useOlapFormattingInExcel")(useOlapFormattingInExcel.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportOptions]
  }
}

