package typingsJapgolly.officeJs.Excel

import typingsJapgolly.officeJs.AnonExpand
import typingsJapgolly.officeJs.Excel.Interfaces.PageLayoutData
import typingsJapgolly.officeJs.Excel.Interfaces.PageLayoutLoadOptions
import typingsJapgolly.officeJs.Excel.Interfaces.PageLayoutUpdateData
import typingsJapgolly.officeJs.OfficeExtension.ClientObject
import typingsJapgolly.officeJs.OfficeExtension.UpdateOptions
import typingsJapgolly.officeJs.officeJsStrings.A3
import typingsJapgolly.officeJs.officeJsStrings.A4
import typingsJapgolly.officeJs.officeJsStrings.A4Small
import typingsJapgolly.officeJs.officeJsStrings.A5
import typingsJapgolly.officeJs.officeJsStrings.AsDisplayed
import typingsJapgolly.officeJs.officeJsStrings.B4
import typingsJapgolly.officeJs.officeJsStrings.B5
import typingsJapgolly.officeJs.officeJsStrings.Blank
import typingsJapgolly.officeJs.officeJsStrings.Centimeters
import typingsJapgolly.officeJs.officeJsStrings.Csheet
import typingsJapgolly.officeJs.officeJsStrings.Dash
import typingsJapgolly.officeJs.officeJsStrings.DownThenOver
import typingsJapgolly.officeJs.officeJsStrings.Dsheet
import typingsJapgolly.officeJs.officeJsStrings.EndSheet
import typingsJapgolly.officeJs.officeJsStrings.Envelope10
import typingsJapgolly.officeJs.officeJsStrings.Envelope11
import typingsJapgolly.officeJs.officeJsStrings.Envelope12
import typingsJapgolly.officeJs.officeJsStrings.Envelope14
import typingsJapgolly.officeJs.officeJsStrings.Envelope9
import typingsJapgolly.officeJs.officeJsStrings.EnvelopeB4
import typingsJapgolly.officeJs.officeJsStrings.EnvelopeB5
import typingsJapgolly.officeJs.officeJsStrings.EnvelopeB6
import typingsJapgolly.officeJs.officeJsStrings.EnvelopeC3
import typingsJapgolly.officeJs.officeJsStrings.EnvelopeC4
import typingsJapgolly.officeJs.officeJsStrings.EnvelopeC5
import typingsJapgolly.officeJs.officeJsStrings.EnvelopeC6
import typingsJapgolly.officeJs.officeJsStrings.EnvelopeC65
import typingsJapgolly.officeJs.officeJsStrings.EnvelopeDL
import typingsJapgolly.officeJs.officeJsStrings.EnvelopeItaly
import typingsJapgolly.officeJs.officeJsStrings.EnvelopeMonarch
import typingsJapgolly.officeJs.officeJsStrings.EnvelopePersonal
import typingsJapgolly.officeJs.officeJsStrings.Esheet
import typingsJapgolly.officeJs.officeJsStrings.Executive
import typingsJapgolly.officeJs.officeJsStrings.FanfoldLegalGerman
import typingsJapgolly.officeJs.officeJsStrings.FanfoldStdGerman
import typingsJapgolly.officeJs.officeJsStrings.FanfoldUS
import typingsJapgolly.officeJs.officeJsStrings.Folio
import typingsJapgolly.officeJs.officeJsStrings.InPlace
import typingsJapgolly.officeJs.officeJsStrings.Inches
import typingsJapgolly.officeJs.officeJsStrings.Landscape
import typingsJapgolly.officeJs.officeJsStrings.Ledger
import typingsJapgolly.officeJs.officeJsStrings.Legal
import typingsJapgolly.officeJs.officeJsStrings.Letter
import typingsJapgolly.officeJs.officeJsStrings.LetterSmall
import typingsJapgolly.officeJs.officeJsStrings.NoComments
import typingsJapgolly.officeJs.officeJsStrings.NotAvailable
import typingsJapgolly.officeJs.officeJsStrings.Note
import typingsJapgolly.officeJs.officeJsStrings.OverThenDown
import typingsJapgolly.officeJs.officeJsStrings.Paper10x14
import typingsJapgolly.officeJs.officeJsStrings.Paper11x17
import typingsJapgolly.officeJs.officeJsStrings.Points
import typingsJapgolly.officeJs.officeJsStrings.Portrait
import typingsJapgolly.officeJs.officeJsStrings.Quatro
import typingsJapgolly.officeJs.officeJsStrings.Statement
import typingsJapgolly.officeJs.officeJsStrings.Tabloid
import typingsJapgolly.officeJs.officeJsStrings._empty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents layout and print settings that are not dependent any printer-specific implementation. These settings include margins, orientation, page numbering, title rows, and print area.
  *
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.PageLayout")
@js.native
class PageLayout () extends ClientObject {
  /**
    *
    * Gets or sets the worksheet's black and white print option.
    *
    * [Api set: ExcelApi 1.9]
    */
  var blackAndWhite: Boolean = js.native
  /**
    *
    * Gets or sets the worksheet's bottom page margin to use for printing in points.
    *
    * [Api set: ExcelApi 1.9]
    */
  var bottomMargin: Double = js.native
  /**
    *
    * Gets or sets the worksheet's center horizontally flag. This flag determines whether the worksheet will be centered horizontally when it's printed.
    *
    * [Api set: ExcelApi 1.9]
    */
  var centerHorizontally: Boolean = js.native
  /**
    *
    * Gets or sets the worksheet's center vertically flag. This flag determines whether the worksheet will be centered vertically when it's printed.
    *
    * [Api set: ExcelApi 1.9]
    */
  var centerVertically: Boolean = js.native
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_PageLayout: RequestContext = js.native
  /**
    *
    * Gets or sets the worksheet's draft mode option. If true the sheet will be printed without graphics.
    *
    * [Api set: ExcelApi 1.9]
    */
  var draftMode: Boolean = js.native
  /**
    *
    * Gets or sets the worksheet's first page number to print. Null value represents "auto" page numbering.
    *
    * [Api set: ExcelApi 1.9]
    */
  var firstPageNumber: Double | _empty = js.native
  /**
    *
    * Gets or sets the worksheet's footer margin, in points, for use when printing.
    *
    * [Api set: ExcelApi 1.9]
    */
  var footerMargin: Double = js.native
  /**
    *
    * Gets or sets the worksheet's header margin, in points, for use when printing.
    *
    * [Api set: ExcelApi 1.9]
    */
  var headerMargin: Double = js.native
  /**
    *
    * Header and footer configuration for the worksheet.
    *
    * [Api set: ExcelApi 1.9]
    */
  val headersFooters: HeaderFooterGroup = js.native
  /**
    *
    * Gets or sets the worksheet's left margin, in points, for use when printing.
    *
    * [Api set: ExcelApi 1.9]
    */
  var leftMargin: Double = js.native
  /**
    *
    * Gets or sets the worksheet's orientation of the page.
    *
    * [Api set: ExcelApi 1.9]
    */
  var orientation: PageOrientation | Portrait | Landscape = js.native
  /**
    *
    * Gets or sets the worksheet's paper size of the page.
    *
    * [Api set: ExcelApi 1.9]
    */
  var paperSize: PaperType | Letter | LetterSmall | Tabloid | Ledger | Legal | Statement | Executive | A3 | A4 | A4Small | A5 | B4 | B5 | Folio | Quatro | Paper10x14 | Paper11x17 | Note | Envelope9 | Envelope10 | Envelope11 | Envelope12 | Envelope14 | Csheet | Dsheet | Esheet | EnvelopeDL | EnvelopeC5 | EnvelopeC3 | EnvelopeC4 | EnvelopeC6 | EnvelopeC65 | EnvelopeB4 | EnvelopeB5 | EnvelopeB6 | EnvelopeItaly | EnvelopeMonarch | EnvelopePersonal | FanfoldUS | FanfoldStdGerman | FanfoldLegalGerman = js.native
  /**
    *
    * Gets or sets whether the worksheet's comments should be displayed when printing.
    *
    * [Api set: ExcelApi 1.9]
    */
  var printComments: PrintComments | NoComments | EndSheet | InPlace = js.native
  /**
    *
    * Gets or sets the worksheet's print errors option.
    *
    * [Api set: ExcelApi 1.9]
    */
  var printErrors: PrintErrorType | AsDisplayed | Blank | Dash | NotAvailable = js.native
  /**
    *
    * Gets or sets the worksheet's print gridlines flag. This flag determines whether gridlines will be printed or not.
    *
    * [Api set: ExcelApi 1.9]
    */
  var printGridlines: Boolean = js.native
  /**
    *
    * Gets or sets the worksheet's print headings flag. This flag determines whether headings will be printed or not.
    *
    * [Api set: ExcelApi 1.9]
    */
  var printHeadings: Boolean = js.native
  /**
    *
    * Gets or sets the worksheet's page print order option. This specifies the order to use for processing the page number printed.
    *
    * [Api set: ExcelApi 1.9]
    */
  var printOrder: PrintOrder | DownThenOver | OverThenDown = js.native
  /**
    *
    * Gets or sets the worksheet's right margin, in points, for use when printing.
    *
    * [Api set: ExcelApi 1.9]
    */
  var rightMargin: Double = js.native
  /**
    *
    * Gets or sets the worksheet's top margin, in points, for use when printing.
    *
    * [Api set: ExcelApi 1.9]
    */
  var topMargin: Double = js.native
  /**
    *
    * Gets or sets the worksheet's print zoom options.
    The `PageLayoutZoomOptions` object must be set as a JSON object (use `x.zoom = {...}` instead of `x.zoom.scale = ...`).
    *
    * [Api set: ExcelApi 1.9]
    */
  var zoom: PageLayoutZoomOptions = js.native
  /**
    *
    * Gets the RangeAreas object, comprising one or more rectangular ranges, that represents the print area for the worksheet. If there is no print area, an ItemNotFound error will be thrown.
    *
    * [Api set: ExcelApi 1.9]
    */
  def getPrintArea(): RangeAreas = js.native
  /**
    *
    * Gets the RangeAreas object, comprising one or more rectangular ranges, that represents the print area for the worksheet. If there is no print area, a null object will be returned.
    *
    * [Api set: ExcelApi 1.9]
    */
  def getPrintAreaOrNullObject(): RangeAreas = js.native
  /**
    *
    * Gets the range object representing the title columns.
    *
    * [Api set: ExcelApi 1.9]
    */
  def getPrintTitleColumns(): Range = js.native
  /**
    *
    * Gets the range object representing the title columns. If not set, this will return a null object.
    *
    * [Api set: ExcelApi 1.9]
    */
  def getPrintTitleColumnsOrNullObject(): Range = js.native
  /**
    *
    * Gets the range object representing the title rows.
    *
    * [Api set: ExcelApi 1.9]
    */
  def getPrintTitleRows(): Range = js.native
  /**
    *
    * Gets the range object representing the title rows. If not set, this will return a null object.
    *
    * [Api set: ExcelApi 1.9]
    */
  def getPrintTitleRowsOrNullObject(): Range = js.native
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): PageLayout = js.native
  def load(options: PageLayoutLoadOptions): PageLayout = js.native
  def load(propertyNamesAndPaths: AnonExpand): PageLayout = js.native
  def load(propertyNames: String): PageLayout = js.native
  def load(propertyNames: js.Array[String]): PageLayout = js.native
  /** Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
    *
    * @remarks
    *
    * This method has the following additional signature:
    *
    * `set(properties: Excel.PageLayout): void`
    *
    * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
    * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
    */
  def set(properties: PageLayoutUpdateData): Unit = js.native
  def set(properties: PageLayoutUpdateData, options: UpdateOptions): Unit = js.native
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: PageLayout): Unit = js.native
  def setPrintArea(printArea: String): Unit = js.native
  /**
    *
    * Sets the worksheet's print area.
    *
    * [Api set: ExcelApi 1.9]
    *
    * @param printArea The range, or RangeAreas of the content to print.
    */
  def setPrintArea(printArea: Range): Unit = js.native
  def setPrintArea(printArea: RangeAreas): Unit = js.native
  /**
    *
    * Sets the worksheet's page margins with units.
    *
    * [Api set: ExcelApi 1.9]
    *
    * @param unit Measurement unit for the margins provided.
    * @param marginOptions Margin values to set, margins not provided will remain unchanged.
    */
  def setPrintMargins(unit: PrintMarginUnit, marginOptions: PageLayoutMarginOptions): Unit = js.native
  @JSName("setPrintMargins")
  def setPrintMargins_Centimeters(unit: Centimeters, marginOptions: PageLayoutMarginOptions): Unit = js.native
  @JSName("setPrintMargins")
  def setPrintMargins_Inches(unit: Inches, marginOptions: PageLayoutMarginOptions): Unit = js.native
  /**
    *
    * Sets the worksheet's page margins with units.
    *
    * [Api set: ExcelApi 1.9]
    *
    * @param unit Measurement unit for the margins provided.
    * @param marginOptions Margin values to set, margins not provided will remain unchanged.
    */
  @JSName("setPrintMargins")
  def setPrintMargins_Points(unit: Points, marginOptions: PageLayoutMarginOptions): Unit = js.native
  def setPrintTitleColumns(printTitleColumns: String): Unit = js.native
  /**
    *
    * Sets the columns that contain the cells to be repeated at the left of each page of the worksheet for printing.
    *
    * [Api set: ExcelApi 1.9]
    *
    * @param printTitleColumns The columns to be repeated to the left of each page, range must span the entire column to be valid.
    */
  def setPrintTitleColumns(printTitleColumns: Range): Unit = js.native
  def setPrintTitleRows(printTitleRows: String): Unit = js.native
  /**
    *
    * Sets the rows that contain the cells to be repeated at the top of each page of the worksheet for printing.
    *
    * [Api set: ExcelApi 1.9]
    *
    * @param printTitleRows The rows to be repeated at the top of each page, range must span the entire row to be valid.
    */
  def setPrintTitleRows(printTitleRows: Range): Unit = js.native
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Excel.PageLayout object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.PageLayoutData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): PageLayoutData = js.native
}

