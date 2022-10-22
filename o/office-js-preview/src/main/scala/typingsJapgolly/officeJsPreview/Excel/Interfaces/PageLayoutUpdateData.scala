package typingsJapgolly.officeJsPreview.Excel.Interfaces

import typingsJapgolly.officeJsPreview.Excel.PageLayoutZoomOptions
import typingsJapgolly.officeJsPreview.Excel.PageOrientation
import typingsJapgolly.officeJsPreview.Excel.PaperType
import typingsJapgolly.officeJsPreview.Excel.PrintComments
import typingsJapgolly.officeJsPreview.Excel.PrintErrorType
import typingsJapgolly.officeJsPreview.Excel.PrintOrder
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.A3
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.A4
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.A4Small
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.A5
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.AsDisplayed
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.B4
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.B5
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Blank
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Csheet
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Dash
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.DownThenOver
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Dsheet
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.EndSheet
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Envelope10
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Envelope11
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Envelope12
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Envelope14
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Envelope9
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.EnvelopeB4
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.EnvelopeB5
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.EnvelopeB6
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.EnvelopeC3
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.EnvelopeC4
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.EnvelopeC5
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.EnvelopeC6
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.EnvelopeC65
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.EnvelopeDL
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.EnvelopeItaly
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.EnvelopeMonarch
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.EnvelopePersonal
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Esheet
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Executive
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.FanfoldLegalGerman
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.FanfoldStdGerman
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.FanfoldUS
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Folio
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.InPlace
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Landscape
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Ledger
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Legal
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Letter
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.LetterSmall
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.NoComments
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.NotAvailable
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Note
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.OverThenDown
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Paper10x14
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Paper11x17
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Portrait
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Quatro
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Statement
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Tabloid
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings._empty
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the PageLayout object, for use in `pageLayout.set({ ... })`. */
trait PageLayoutUpdateData extends StObject {
  
  /**
    * The worksheet's black and white print option.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var blackAndWhite: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The worksheet's bottom page margin to use for printing in points.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var bottomMargin: js.UndefOr[Double] = js.undefined
  
  /**
    * The worksheet's center horizontally flag. This flag determines whether the worksheet will be centered horizontally when it's printed.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var centerHorizontally: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The worksheet's center vertically flag. This flag determines whether the worksheet will be centered vertically when it's printed.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var centerVertically: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The worksheet's draft mode option. If `true`, the sheet will be printed without graphics.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var draftMode: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The worksheet's first page number to print. A `null` value represents "auto" page numbering.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var firstPageNumber: js.UndefOr[Double | _empty] = js.undefined
  
  /**
    * The worksheet's footer margin, in points, for use when printing.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var footerMargin: js.UndefOr[Double] = js.undefined
  
  /**
    * The worksheet's header margin, in points, for use when printing.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var headerMargin: js.UndefOr[Double] = js.undefined
  
  /**
    * Header and footer configuration for the worksheet.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var headersFooters: js.UndefOr[HeaderFooterGroupUpdateData] = js.undefined
  
  /**
    * The worksheet's left margin, in points, for use when printing.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var leftMargin: js.UndefOr[Double] = js.undefined
  
  /**
    * The worksheet's orientation of the page.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var orientation: js.UndefOr[PageOrientation | Portrait | Landscape] = js.undefined
  
  /**
    * The worksheet's paper size of the page.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var paperSize: js.UndefOr[
    PaperType | Letter | LetterSmall | Tabloid | Ledger | Legal | Statement | Executive | A3 | A4 | A4Small | A5 | B4 | B5 | Folio | Quatro | Paper10x14 | Paper11x17 | Note | Envelope9 | Envelope10 | Envelope11 | Envelope12 | Envelope14 | Csheet | Dsheet | Esheet | EnvelopeDL | EnvelopeC5 | EnvelopeC3 | EnvelopeC4 | EnvelopeC6 | EnvelopeC65 | EnvelopeB4 | EnvelopeB5 | EnvelopeB6 | EnvelopeItaly | EnvelopeMonarch | EnvelopePersonal | FanfoldUS | FanfoldStdGerman | FanfoldLegalGerman
  ] = js.undefined
  
  /**
    * Specifies if the worksheet's comments should be displayed when printing.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var printComments: js.UndefOr[PrintComments | NoComments | EndSheet | InPlace] = js.undefined
  
  /**
    * The worksheet's print errors option.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var printErrors: js.UndefOr[PrintErrorType | AsDisplayed | Blank | Dash | NotAvailable] = js.undefined
  
  /**
    * Specifies if the worksheet's gridlines will be printed.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var printGridlines: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies if the worksheet's headings will be printed.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var printHeadings: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The worksheet's page print order option. This specifies the order to use for processing the page number printed.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var printOrder: js.UndefOr[PrintOrder | DownThenOver | OverThenDown] = js.undefined
  
  /**
    * The worksheet's right margin, in points, for use when printing.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var rightMargin: js.UndefOr[Double] = js.undefined
  
  /**
    * The worksheet's top margin, in points, for use when printing.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var topMargin: js.UndefOr[Double] = js.undefined
  
  /**
    * The worksheet's print zoom options.
    The `PageLayoutZoomOptions` object must be set as a JSON object (use `x.zoom = {...}` instead of `x.zoom.scale = ...`).
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var zoom: js.UndefOr[PageLayoutZoomOptions] = js.undefined
}
object PageLayoutUpdateData {
  
  inline def apply(): PageLayoutUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PageLayoutUpdateData]
  }
  
  extension [Self <: PageLayoutUpdateData](x: Self) {
    
    inline def setBlackAndWhite(value: Boolean): Self = StObject.set(x, "blackAndWhite", value.asInstanceOf[js.Any])
    
    inline def setBlackAndWhiteUndefined: Self = StObject.set(x, "blackAndWhite", js.undefined)
    
    inline def setBottomMargin(value: Double): Self = StObject.set(x, "bottomMargin", value.asInstanceOf[js.Any])
    
    inline def setBottomMarginUndefined: Self = StObject.set(x, "bottomMargin", js.undefined)
    
    inline def setCenterHorizontally(value: Boolean): Self = StObject.set(x, "centerHorizontally", value.asInstanceOf[js.Any])
    
    inline def setCenterHorizontallyUndefined: Self = StObject.set(x, "centerHorizontally", js.undefined)
    
    inline def setCenterVertically(value: Boolean): Self = StObject.set(x, "centerVertically", value.asInstanceOf[js.Any])
    
    inline def setCenterVerticallyUndefined: Self = StObject.set(x, "centerVertically", js.undefined)
    
    inline def setDraftMode(value: Boolean): Self = StObject.set(x, "draftMode", value.asInstanceOf[js.Any])
    
    inline def setDraftModeUndefined: Self = StObject.set(x, "draftMode", js.undefined)
    
    inline def setFirstPageNumber(value: Double | _empty): Self = StObject.set(x, "firstPageNumber", value.asInstanceOf[js.Any])
    
    inline def setFirstPageNumberUndefined: Self = StObject.set(x, "firstPageNumber", js.undefined)
    
    inline def setFooterMargin(value: Double): Self = StObject.set(x, "footerMargin", value.asInstanceOf[js.Any])
    
    inline def setFooterMarginUndefined: Self = StObject.set(x, "footerMargin", js.undefined)
    
    inline def setHeaderMargin(value: Double): Self = StObject.set(x, "headerMargin", value.asInstanceOf[js.Any])
    
    inline def setHeaderMarginUndefined: Self = StObject.set(x, "headerMargin", js.undefined)
    
    inline def setHeadersFooters(value: HeaderFooterGroupUpdateData): Self = StObject.set(x, "headersFooters", value.asInstanceOf[js.Any])
    
    inline def setHeadersFootersUndefined: Self = StObject.set(x, "headersFooters", js.undefined)
    
    inline def setLeftMargin(value: Double): Self = StObject.set(x, "leftMargin", value.asInstanceOf[js.Any])
    
    inline def setLeftMarginUndefined: Self = StObject.set(x, "leftMargin", js.undefined)
    
    inline def setOrientation(value: PageOrientation | Portrait | Landscape): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
    
    inline def setPaperSize(
      value: PaperType | Letter | LetterSmall | Tabloid | Ledger | Legal | Statement | Executive | A3 | A4 | A4Small | A5 | B4 | B5 | Folio | Quatro | Paper10x14 | Paper11x17 | Note | Envelope9 | Envelope10 | Envelope11 | Envelope12 | Envelope14 | Csheet | Dsheet | Esheet | EnvelopeDL | EnvelopeC5 | EnvelopeC3 | EnvelopeC4 | EnvelopeC6 | EnvelopeC65 | EnvelopeB4 | EnvelopeB5 | EnvelopeB6 | EnvelopeItaly | EnvelopeMonarch | EnvelopePersonal | FanfoldUS | FanfoldStdGerman | FanfoldLegalGerman
    ): Self = StObject.set(x, "paperSize", value.asInstanceOf[js.Any])
    
    inline def setPaperSizeUndefined: Self = StObject.set(x, "paperSize", js.undefined)
    
    inline def setPrintComments(value: PrintComments | NoComments | EndSheet | InPlace): Self = StObject.set(x, "printComments", value.asInstanceOf[js.Any])
    
    inline def setPrintCommentsUndefined: Self = StObject.set(x, "printComments", js.undefined)
    
    inline def setPrintErrors(value: PrintErrorType | AsDisplayed | Blank | Dash | NotAvailable): Self = StObject.set(x, "printErrors", value.asInstanceOf[js.Any])
    
    inline def setPrintErrorsUndefined: Self = StObject.set(x, "printErrors", js.undefined)
    
    inline def setPrintGridlines(value: Boolean): Self = StObject.set(x, "printGridlines", value.asInstanceOf[js.Any])
    
    inline def setPrintGridlinesUndefined: Self = StObject.set(x, "printGridlines", js.undefined)
    
    inline def setPrintHeadings(value: Boolean): Self = StObject.set(x, "printHeadings", value.asInstanceOf[js.Any])
    
    inline def setPrintHeadingsUndefined: Self = StObject.set(x, "printHeadings", js.undefined)
    
    inline def setPrintOrder(value: PrintOrder | DownThenOver | OverThenDown): Self = StObject.set(x, "printOrder", value.asInstanceOf[js.Any])
    
    inline def setPrintOrderUndefined: Self = StObject.set(x, "printOrder", js.undefined)
    
    inline def setRightMargin(value: Double): Self = StObject.set(x, "rightMargin", value.asInstanceOf[js.Any])
    
    inline def setRightMarginUndefined: Self = StObject.set(x, "rightMargin", js.undefined)
    
    inline def setTopMargin(value: Double): Self = StObject.set(x, "topMargin", value.asInstanceOf[js.Any])
    
    inline def setTopMarginUndefined: Self = StObject.set(x, "topMargin", js.undefined)
    
    inline def setZoom(value: PageLayoutZoomOptions): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
    
    inline def setZoomUndefined: Self = StObject.set(x, "zoom", js.undefined)
  }
}
