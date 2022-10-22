package typingsJapgolly.activexExcel.global.Excel

import typingsJapgolly.activexExcel.Excel.Pages
import typingsJapgolly.activexExcel.Excel.XlCreator
import typingsJapgolly.activexExcel.Excel.XlObjectSize
import typingsJapgolly.activexExcel.Excel.XlOrder
import typingsJapgolly.activexExcel.Excel.XlPageOrientation
import typingsJapgolly.activexExcel.Excel.XlPaperSize
import typingsJapgolly.activexExcel.Excel.XlPrintErrors
import typingsJapgolly.activexExcel.Excel.XlPrintLocation
import typingsJapgolly.activexExcel.activexExcelBooleans.`false`
import typingsJapgolly.activexExcel.activexExcelInts.`1`
import typingsJapgolly.activexExcel.activexExcelInts.`2`
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Excel.PageSetup")
@js.native
/* private */ open class PageSetup ()
  extends StObject
     with typingsJapgolly.activexExcel.Excel.PageSetup {
  
  /* CompleteClass */
  var AlignMarginsHeaderFooter: Boolean = js.native
  
  /* CompleteClass */
  override val Application: typingsJapgolly.activexExcel.Excel.Application = js.native
  
  /* CompleteClass */
  var BlackAndWhite: Boolean = js.native
  
  /* CompleteClass */
  var BottomMargin: Double = js.native
  
  /* CompleteClass */
  var CenterFooter: String = js.native
  
  /* CompleteClass */
  override val CenterFooterPicture: typingsJapgolly.activexExcel.Excel.Graphic = js.native
  
  /* CompleteClass */
  var CenterHeader: String = js.native
  
  /* CompleteClass */
  override val CenterHeaderPicture: typingsJapgolly.activexExcel.Excel.Graphic = js.native
  
  /* CompleteClass */
  var CenterHorizontally: Boolean = js.native
  
  /* CompleteClass */
  var CenterVertically: Boolean = js.native
  
  /* CompleteClass */
  var ChartSize: XlObjectSize = js.native
  
  /* CompleteClass */
  override val Creator: XlCreator = js.native
  
  /* CompleteClass */
  var DifferentFirstPageHeaderFooter: Boolean = js.native
  
  /* CompleteClass */
  var Draft: Boolean = js.native
  
  /* CompleteClass */
  override val EvenPage: typingsJapgolly.activexExcel.Excel.Page = js.native
  
  /* private */ /* CompleteClass */
  @JSName("Excel.PageSetup_typekey")
  var ExcelDotPageSetup_typekey: typingsJapgolly.activexExcel.Excel.PageSetup = js.native
  
  /* CompleteClass */
  override val FirstPage: typingsJapgolly.activexExcel.Excel.Page = js.native
  
  /* CompleteClass */
  var FirstPageNumber: Double = js.native
  
  /* CompleteClass */
  var FitToPagesTall: Double | `false` = js.native
  
  /* CompleteClass */
  var FitToPagesWide: Double | `false` = js.native
  
  /* CompleteClass */
  var FooterMargin: Double = js.native
  
  /* CompleteClass */
  var HeaderMargin: Double = js.native
  
  /* CompleteClass */
  var LeftFooter: String = js.native
  
  /* CompleteClass */
  override val LeftFooterPicture: typingsJapgolly.activexExcel.Excel.Graphic = js.native
  
  /* CompleteClass */
  var LeftHeader: String = js.native
  
  /* CompleteClass */
  override val LeftHeaderPicture: typingsJapgolly.activexExcel.Excel.Graphic = js.native
  
  /* CompleteClass */
  var LeftMargin: Double = js.native
  
  /* CompleteClass */
  var OddAndEvenPagesHeaderFooter: Boolean = js.native
  
  /* CompleteClass */
  var Order: XlOrder = js.native
  
  /* CompleteClass */
  var Orientation: XlPageOrientation = js.native
  
  /* CompleteClass */
  override def Pages(Index: Double): typingsJapgolly.activexExcel.Excel.Page = js.native
  /* CompleteClass */
  @JSName("Pages")
  override val Pages_Original: Pages = js.native
  
  /* CompleteClass */
  var PaperSize: XlPaperSize = js.native
  
  /* CompleteClass */
  override val Parent: Any = js.native
  
  /* CompleteClass */
  var PrintArea: String = js.native
  
  /* CompleteClass */
  var PrintComments: XlPrintLocation = js.native
  
  /* CompleteClass */
  var PrintErrors: XlPrintErrors = js.native
  
  /* CompleteClass */
  var PrintGridlines: Boolean = js.native
  
  /* CompleteClass */
  var PrintHeadings: Boolean = js.native
  
  /* CompleteClass */
  var PrintNotes: Boolean = js.native
  
  /* CompleteClass */
  override def PrintQuality(Index: `1` | `2`): Double = js.native
  /* CompleteClass */
  @JSName("PrintQuality")
  var PrintQuality_Original: SafeArray[Double] & (js.Function1[/* Index */ `1` | `2`, Double]) = js.native
  
  /* CompleteClass */
  var PrintTitleColumns: String = js.native
  
  /* CompleteClass */
  var PrintTitleRows: String = js.native
  
  /* CompleteClass */
  var RightFooter: String = js.native
  
  /* CompleteClass */
  override val RightFooterPicture: typingsJapgolly.activexExcel.Excel.Graphic = js.native
  
  /* CompleteClass */
  var RightHeader: String = js.native
  
  /* CompleteClass */
  override val RightHeaderPicture: typingsJapgolly.activexExcel.Excel.Graphic = js.native
  
  /* CompleteClass */
  var RightMargin: Double = js.native
  
  /* CompleteClass */
  var ScaleWithDocHeaderFooter: Boolean = js.native
  
  /* CompleteClass */
  var TopMargin: Double = js.native
  
  /** Represents a percentage between 10 and 400 */
  /* CompleteClass */
  var Zoom: Double = js.native
}
