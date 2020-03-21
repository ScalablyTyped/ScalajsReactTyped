package typingsJapgolly.xlsx.mod

import typingsJapgolly.xlsx.xlsxStrings.array
import typingsJapgolly.xlsx.xlsxStrings.base64
import typingsJapgolly.xlsx.xlsxStrings.binary
import typingsJapgolly.xlsx.xlsxStrings.buffer
import typingsJapgolly.xlsx.xlsxStrings.file
import typingsJapgolly.xlsx.xlsxStrings.string
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParsingOptions extends CommonOptions {
  /**
    * If true, parse calculation chains
    * @default false
    */
  var bookDeps: js.UndefOr[Boolean] = js.undefined
  /**
    * If true, add raw files to book object
    * @default false
    */
  var bookFiles: js.UndefOr[Boolean] = js.undefined
  /**
    * If true, only parse enough to get book metadata
    * @default false
    */
  var bookProps: js.UndefOr[Boolean] = js.undefined
  /**
    * If true, only parse enough to get the sheet names
    * @default false
    */
  var bookSheets: js.UndefOr[Boolean] = js.undefined
  /**
    * Save formulae to the .f field
    * @default true
    */
  var cellFormula: js.UndefOr[Boolean] = js.undefined
  /**
    * Parse rich text and save HTML to the .h field
    * @default true
    */
  var cellHTML: js.UndefOr[Boolean] = js.undefined
  /**
    * Save number format string to the .z field
    * @default false
    */
  var cellNF: js.UndefOr[Boolean] = js.undefined
  /**
    * Generate formatted text to the .w field
    * @default true
    */
  var cellText: js.UndefOr[Boolean] = js.undefined
  /** Default codepage */
  var codepage: js.UndefOr[Double] = js.undefined
  /** Override default date format (code 14) */
  var dateNF: js.UndefOr[String] = js.undefined
  var dense: js.UndefOr[Boolean] = js.undefined
  /* If true, plaintext parsing will not parse values */
  var raw: js.UndefOr[Boolean] = js.undefined
  /**
    * If >0, read the first sheetRows rows
    * @default 0
    */
  var sheetRows: js.UndefOr[Double] = js.undefined
  /** If specified, only parse the specified sheets or sheet names */
  var sheets: js.UndefOr[Double | String | (js.Array[Double | String])] = js.undefined
  /** Input data encoding */
  var `type`: js.UndefOr[base64 | binary | buffer | file | array | string] = js.undefined
}

object ParsingOptions {
  @scala.inline
  def apply(
    WTF: js.UndefOr[Boolean] = js.undefined,
    bookDeps: js.UndefOr[Boolean] = js.undefined,
    bookFiles: js.UndefOr[Boolean] = js.undefined,
    bookProps: js.UndefOr[Boolean] = js.undefined,
    bookSheets: js.UndefOr[Boolean] = js.undefined,
    bookVBA: js.UndefOr[Boolean] = js.undefined,
    cellDates: js.UndefOr[Boolean] = js.undefined,
    cellFormula: js.UndefOr[Boolean] = js.undefined,
    cellHTML: js.UndefOr[Boolean] = js.undefined,
    cellNF: js.UndefOr[Boolean] = js.undefined,
    cellStyles: js.UndefOr[Boolean] = js.undefined,
    cellText: js.UndefOr[Boolean] = js.undefined,
    codepage: Int | Double = null,
    dateNF: String = null,
    dense: js.UndefOr[Boolean] = js.undefined,
    password: String = null,
    raw: js.UndefOr[Boolean] = js.undefined,
    sheetRows: Int | Double = null,
    sheetStubs: js.UndefOr[Boolean] = js.undefined,
    sheets: Double | String | (js.Array[Double | String]) = null,
    `type`: base64 | binary | buffer | file | array | string = null
  ): ParsingOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(WTF)) __obj.updateDynamic("WTF")(WTF.asInstanceOf[js.Any])
    if (!js.isUndefined(bookDeps)) __obj.updateDynamic("bookDeps")(bookDeps.asInstanceOf[js.Any])
    if (!js.isUndefined(bookFiles)) __obj.updateDynamic("bookFiles")(bookFiles.asInstanceOf[js.Any])
    if (!js.isUndefined(bookProps)) __obj.updateDynamic("bookProps")(bookProps.asInstanceOf[js.Any])
    if (!js.isUndefined(bookSheets)) __obj.updateDynamic("bookSheets")(bookSheets.asInstanceOf[js.Any])
    if (!js.isUndefined(bookVBA)) __obj.updateDynamic("bookVBA")(bookVBA.asInstanceOf[js.Any])
    if (!js.isUndefined(cellDates)) __obj.updateDynamic("cellDates")(cellDates.asInstanceOf[js.Any])
    if (!js.isUndefined(cellFormula)) __obj.updateDynamic("cellFormula")(cellFormula.asInstanceOf[js.Any])
    if (!js.isUndefined(cellHTML)) __obj.updateDynamic("cellHTML")(cellHTML.asInstanceOf[js.Any])
    if (!js.isUndefined(cellNF)) __obj.updateDynamic("cellNF")(cellNF.asInstanceOf[js.Any])
    if (!js.isUndefined(cellStyles)) __obj.updateDynamic("cellStyles")(cellStyles.asInstanceOf[js.Any])
    if (!js.isUndefined(cellText)) __obj.updateDynamic("cellText")(cellText.asInstanceOf[js.Any])
    if (codepage != null) __obj.updateDynamic("codepage")(codepage.asInstanceOf[js.Any])
    if (dateNF != null) __obj.updateDynamic("dateNF")(dateNF.asInstanceOf[js.Any])
    if (!js.isUndefined(dense)) __obj.updateDynamic("dense")(dense.asInstanceOf[js.Any])
    if (password != null) __obj.updateDynamic("password")(password.asInstanceOf[js.Any])
    if (!js.isUndefined(raw)) __obj.updateDynamic("raw")(raw.asInstanceOf[js.Any])
    if (sheetRows != null) __obj.updateDynamic("sheetRows")(sheetRows.asInstanceOf[js.Any])
    if (!js.isUndefined(sheetStubs)) __obj.updateDynamic("sheetStubs")(sheetStubs.asInstanceOf[js.Any])
    if (sheets != null) __obj.updateDynamic("sheets")(sheets.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParsingOptions]
  }
}

