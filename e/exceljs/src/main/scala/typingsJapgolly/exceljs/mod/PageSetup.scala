package typingsJapgolly.exceljs.mod

import typingsJapgolly.exceljs.exceljsStrings.NA
import typingsJapgolly.exceljs.exceljsStrings.None
import typingsJapgolly.exceljs.exceljsStrings.asDisplayed
import typingsJapgolly.exceljs.exceljsStrings.atEnd
import typingsJapgolly.exceljs.exceljsStrings.blank
import typingsJapgolly.exceljs.exceljsStrings.dash
import typingsJapgolly.exceljs.exceljsStrings.displayed
import typingsJapgolly.exceljs.exceljsStrings.downThenOver
import typingsJapgolly.exceljs.exceljsStrings.landscape
import typingsJapgolly.exceljs.exceljsStrings.overThenDown
import typingsJapgolly.exceljs.exceljsStrings.portrait
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PageSetup extends js.Object {
  /**
  	 * Print without colour
  	 *
  	 * false by default
  	 */
  var blackAndWhite: Boolean
  /**
  	 * Where to place comments
  	 *
  	 * Default is `None`
  	 */
  var cellComments: atEnd | asDisplayed | None
  /**
  	 * Print with less quality (and ink)
  	 *
  	 * false by default
  	 */
  var draft: Boolean
  /**
  	 * Where to show errors
  	 *
  	 * Default is `displayed`
  	 */
  var errors: dash | blank | NA | displayed
  /**
  	 * Which number to use for the first page
  	 */
  var firstPageNumber: Double
  /**
  	 * How many pages high the sheet should print on to. Active when fitToPage is true
  	 *
  	 * Default is 1
  	 */
  var fitToHeight: Double
  /**
  	 * Whether to use fitToWidth and fitToHeight or scale settings.
  	 *
  	 * Default is based on presence of these settings in the pageSetup object - if both are present,
  	 * scale wins (i.e. default will be false)
  	 */
  var fitToPage: Boolean
  /**
  	 * How many pages wide the sheet should print on to. Active when fitToPage is true
  	 *
  	 * Default is 1
  	 */
  var fitToWidth: Double
  /**
  	 * 	Whether to center the sheet data horizontally, `false` by default
  	 */
  var horizontalCentered: Boolean
  /**
  	 * Horizontal Dots per Inch. Default value is 4294967295
  	 */
  var horizontalDpi: Double
  /**
  	 * Whitespace on the borders of the page. Units are inches.
  	 */
  var margins: Margins
  /**
  	 * Orientation of the page - i.e. taller (`'portrait'`) or wider (`'landscape'`).
  	 *
  	 * `'portrait'` by default
  	 */
  var orientation: portrait | landscape
  /**
  	 * Which order to print the pages.
  	 *
  	 * Default is `downThenOver`
  	 */
  var pageOrder: downThenOver | overThenDown
  /**
  	 * 	What paper size to use (see below)
  	 *
  	 * | Name                          | Value       |
  	 * | ----------------------------- | ---------   |
  	 * | Letter                        | `undefined` |
  	 * | Legal                         |  `5`        |
  	 * | Executive                     |  `7`        |
  	 * | A4                            |  `9`        |
  	 * | A5                            |  `11`       |
  	 * | B5 (JIS)                      |  `13`       |
  	 * | Envelope #10                  |  `20`       |
  	 * | Envelope DL                   |  `27`       |
  	 * | Envelope C5                   |  `28`       |
  	 * | Envelope B5                   |  `34`       |
  	 * | Envelope Monarch              |  `37`       |
  	 * | Double Japan Postcard Rotated |  `82`       |
  	 * | 16K 197x273 mm                |  `119`      |
  	 */
  var paperSize: PaperSize
  /**
  	 * Set Print Area for a sheet, e.g. `'A1:G20'`
  	 */
  var printArea: String
  /**
  	 * Repeat specific columns on every printed page, e.g. `'A:C'`
  	 */
  var printTitlesColumn: String
  /**
  	 * Repeat specific rows on every printed page, e.g. `'1:3'`
  	 */
  var printTitlesRow: String
  /**
  	 * Percentage value to increase or reduce the size of the print. Active when fitToPage is false
  	 *
  	 * Default is 100
  	 */
  var scale: Double
  /**
  	 * Whether to show grid lines, `false` by default
  	 */
  var showGridLines: Boolean
  /**
  	 * Whether to show the row numbers and column letters, `false` by default
  	 */
  var showRowColHeaders: Boolean
  /**
  	 * 	Whether to center the sheet data vertically, `false` by default
  	 */
  var verticalCentered: Boolean
  /**
  	 * Vertical Dots per Inch. Default value is 4294967295
  	 */
  var verticalDpi: Double
}

object PageSetup {
  @scala.inline
  def apply(
    blackAndWhite: Boolean,
    cellComments: atEnd | asDisplayed | None,
    draft: Boolean,
    errors: dash | blank | NA | displayed,
    firstPageNumber: Double,
    fitToHeight: Double,
    fitToPage: Boolean,
    fitToWidth: Double,
    horizontalCentered: Boolean,
    horizontalDpi: Double,
    margins: Margins,
    orientation: portrait | landscape,
    pageOrder: downThenOver | overThenDown,
    paperSize: PaperSize,
    printArea: String,
    printTitlesColumn: String,
    printTitlesRow: String,
    scale: Double,
    showGridLines: Boolean,
    showRowColHeaders: Boolean,
    verticalCentered: Boolean,
    verticalDpi: Double
  ): PageSetup = {
    val __obj = js.Dynamic.literal(blackAndWhite = blackAndWhite.asInstanceOf[js.Any], cellComments = cellComments.asInstanceOf[js.Any], draft = draft.asInstanceOf[js.Any], errors = errors.asInstanceOf[js.Any], firstPageNumber = firstPageNumber.asInstanceOf[js.Any], fitToHeight = fitToHeight.asInstanceOf[js.Any], fitToPage = fitToPage.asInstanceOf[js.Any], fitToWidth = fitToWidth.asInstanceOf[js.Any], horizontalCentered = horizontalCentered.asInstanceOf[js.Any], horizontalDpi = horizontalDpi.asInstanceOf[js.Any], margins = margins.asInstanceOf[js.Any], orientation = orientation.asInstanceOf[js.Any], pageOrder = pageOrder.asInstanceOf[js.Any], paperSize = paperSize.asInstanceOf[js.Any], printArea = printArea.asInstanceOf[js.Any], printTitlesColumn = printTitlesColumn.asInstanceOf[js.Any], printTitlesRow = printTitlesRow.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any], showGridLines = showGridLines.asInstanceOf[js.Any], showRowColHeaders = showRowColHeaders.asInstanceOf[js.Any], verticalCentered = verticalCentered.asInstanceOf[js.Any], verticalDpi = verticalDpi.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PageSetup]
  }
}

