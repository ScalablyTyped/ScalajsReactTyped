package typingsJapgolly.officeJsPreview.Excel.Interfaces

import typingsJapgolly.officeJsPreview.Excel.HeaderFooterState
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Default
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.FirstAndDefault
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.FirstOddAndEven
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.OddAndEven
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the HeaderFooterGroup object, for use in `headerFooterGroup.set({ ... })`. */
trait HeaderFooterGroupUpdateData extends js.Object {
  /**
    *
    * The general header/footer, used for all pages unless even/odd or first page is specified.
    *
    * [Api set: ExcelApi 1.9]
    */
  var defaultForAllPages: js.UndefOr[HeaderFooterUpdateData] = js.undefined
  /**
    *
    * The header/footer to use for even pages, odd header/footer needs to be specified for odd pages.
    *
    * [Api set: ExcelApi 1.9]
    */
  var evenPages: js.UndefOr[HeaderFooterUpdateData] = js.undefined
  /**
    *
    * The first page header/footer, for all other pages general or even/odd is used.
    *
    * [Api set: ExcelApi 1.9]
    */
  var firstPage: js.UndefOr[HeaderFooterUpdateData] = js.undefined
  /**
    *
    * The header/footer to use for odd pages, even header/footer needs to be specified for even pages.
    *
    * [Api set: ExcelApi 1.9]
    */
  var oddPages: js.UndefOr[HeaderFooterUpdateData] = js.undefined
  /**
    *
    * Gets or sets the state of which headers/footers are set. See Excel.HeaderFooterState for details.
    *
    * [Api set: ExcelApi 1.9]
    */
  var state: js.UndefOr[HeaderFooterState | Default | FirstAndDefault | OddAndEven | FirstOddAndEven] = js.undefined
  /**
    *
    * Gets or sets a flag indicating if headers/footers are aligned with the page margins set in the page layout options for the worksheet.
    *
    * [Api set: ExcelApi 1.9]
    */
  var useSheetMargins: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Gets or sets a flag indicating if headers/footers should be scaled by the page percentage scale set in the page layout options for the worksheet.
    *
    * [Api set: ExcelApi 1.9]
    */
  var useSheetScale: js.UndefOr[Boolean] = js.undefined
}

object HeaderFooterGroupUpdateData {
  @scala.inline
  def apply(
    defaultForAllPages: HeaderFooterUpdateData = null,
    evenPages: HeaderFooterUpdateData = null,
    firstPage: HeaderFooterUpdateData = null,
    oddPages: HeaderFooterUpdateData = null,
    state: HeaderFooterState | Default | FirstAndDefault | OddAndEven | FirstOddAndEven = null,
    useSheetMargins: js.UndefOr[Boolean] = js.undefined,
    useSheetScale: js.UndefOr[Boolean] = js.undefined
  ): HeaderFooterGroupUpdateData = {
    val __obj = js.Dynamic.literal()
    if (defaultForAllPages != null) __obj.updateDynamic("defaultForAllPages")(defaultForAllPages.asInstanceOf[js.Any])
    if (evenPages != null) __obj.updateDynamic("evenPages")(evenPages.asInstanceOf[js.Any])
    if (firstPage != null) __obj.updateDynamic("firstPage")(firstPage.asInstanceOf[js.Any])
    if (oddPages != null) __obj.updateDynamic("oddPages")(oddPages.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    if (!js.isUndefined(useSheetMargins)) __obj.updateDynamic("useSheetMargins")(useSheetMargins.asInstanceOf[js.Any])
    if (!js.isUndefined(useSheetScale)) __obj.updateDynamic("useSheetScale")(useSheetScale.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeaderFooterGroupUpdateData]
  }
}

