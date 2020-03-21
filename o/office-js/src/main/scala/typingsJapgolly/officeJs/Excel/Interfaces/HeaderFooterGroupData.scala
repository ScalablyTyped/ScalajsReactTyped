package typingsJapgolly.officeJs.Excel.Interfaces

import typingsJapgolly.officeJs.Excel.HeaderFooterState
import typingsJapgolly.officeJs.officeJsStrings.Default
import typingsJapgolly.officeJs.officeJsStrings.FirstAndDefault
import typingsJapgolly.officeJs.officeJsStrings.FirstOddAndEven
import typingsJapgolly.officeJs.officeJsStrings.OddAndEven
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling `headerFooterGroup.toJSON()`. */
trait HeaderFooterGroupData extends js.Object {
  /**
    *
    * The general header/footer, used for all pages unless even/odd or first page is specified.
    *
    * [Api set: ExcelApi 1.9]
    */
  var defaultForAllPages: js.UndefOr[HeaderFooterData] = js.undefined
  /**
    *
    * The header/footer to use for even pages, odd header/footer needs to be specified for odd pages.
    *
    * [Api set: ExcelApi 1.9]
    */
  var evenPages: js.UndefOr[HeaderFooterData] = js.undefined
  /**
    *
    * The first page header/footer, for all other pages general or even/odd is used.
    *
    * [Api set: ExcelApi 1.9]
    */
  var firstPage: js.UndefOr[HeaderFooterData] = js.undefined
  /**
    *
    * The header/footer to use for odd pages, even header/footer needs to be specified for even pages.
    *
    * [Api set: ExcelApi 1.9]
    */
  var oddPages: js.UndefOr[HeaderFooterData] = js.undefined
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

object HeaderFooterGroupData {
  @scala.inline
  def apply(
    defaultForAllPages: HeaderFooterData = null,
    evenPages: HeaderFooterData = null,
    firstPage: HeaderFooterData = null,
    oddPages: HeaderFooterData = null,
    state: HeaderFooterState | Default | FirstAndDefault | OddAndEven | FirstOddAndEven = null,
    useSheetMargins: js.UndefOr[Boolean] = js.undefined,
    useSheetScale: js.UndefOr[Boolean] = js.undefined
  ): HeaderFooterGroupData = {
    val __obj = js.Dynamic.literal()
    if (defaultForAllPages != null) __obj.updateDynamic("defaultForAllPages")(defaultForAllPages.asInstanceOf[js.Any])
    if (evenPages != null) __obj.updateDynamic("evenPages")(evenPages.asInstanceOf[js.Any])
    if (firstPage != null) __obj.updateDynamic("firstPage")(firstPage.asInstanceOf[js.Any])
    if (oddPages != null) __obj.updateDynamic("oddPages")(oddPages.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    if (!js.isUndefined(useSheetMargins)) __obj.updateDynamic("useSheetMargins")(useSheetMargins.asInstanceOf[js.Any])
    if (!js.isUndefined(useSheetScale)) __obj.updateDynamic("useSheetScale")(useSheetScale.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeaderFooterGroupData]
  }
}

