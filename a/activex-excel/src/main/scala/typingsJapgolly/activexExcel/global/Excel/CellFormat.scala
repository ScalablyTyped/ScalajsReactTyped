package typingsJapgolly.activexExcel.global.Excel

import typingsJapgolly.activexExcel.Excel.Borders
import typingsJapgolly.activexExcel.Excel.HorizontalAlignments
import typingsJapgolly.activexExcel.Excel.VerticalAlignments
import typingsJapgolly.activexExcel.Excel.XlBordersIndex
import typingsJapgolly.activexExcel.Excel.XlCreator
import typingsJapgolly.activexExcel.Excel.XlOrientation
import typingsJapgolly.activexExcel.activexExcelInts.`0`
import typingsJapgolly.activexExcel.activexExcelInts.`10`
import typingsJapgolly.activexExcel.activexExcelInts.`11`
import typingsJapgolly.activexExcel.activexExcelInts.`12`
import typingsJapgolly.activexExcel.activexExcelInts.`13`
import typingsJapgolly.activexExcel.activexExcelInts.`14`
import typingsJapgolly.activexExcel.activexExcelInts.`15`
import typingsJapgolly.activexExcel.activexExcelInts.`1`
import typingsJapgolly.activexExcel.activexExcelInts.`2`
import typingsJapgolly.activexExcel.activexExcelInts.`3`
import typingsJapgolly.activexExcel.activexExcelInts.`4`
import typingsJapgolly.activexExcel.activexExcelInts.`5`
import typingsJapgolly.activexExcel.activexExcelInts.`6`
import typingsJapgolly.activexExcel.activexExcelInts.`7`
import typingsJapgolly.activexExcel.activexExcelInts.`8`
import typingsJapgolly.activexExcel.activexExcelInts.`9`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Excel.CellFormat")
@js.native
/* private */ open class CellFormat ()
  extends StObject
     with typingsJapgolly.activexExcel.Excel.CellFormat {
  
  /* CompleteClass */
  var AddIndent: Boolean = js.native
  
  /* CompleteClass */
  override val Application: typingsJapgolly.activexExcel.Excel.Application = js.native
  
  /* CompleteClass */
  override def Borders(Index: XlBordersIndex): typingsJapgolly.activexExcel.Excel.Border = js.native
  /* CompleteClass */
  @JSName("Borders")
  var Borders_Original: Borders = js.native
  
  /* CompleteClass */
  override def Clear(): Unit = js.native
  
  /* CompleteClass */
  override val Creator: XlCreator = js.native
  
  /* private */ /* CompleteClass */
  @JSName("Excel.CellFormat_typekey")
  var ExcelDotCellFormat_typekey: typingsJapgolly.activexExcel.Excel.CellFormat = js.native
  
  /* CompleteClass */
  var Font: typingsJapgolly.activexExcel.Excel.Font = js.native
  
  /* CompleteClass */
  var FormulaHidden: Boolean | Null = js.native
  
  /* CompleteClass */
  var HorizontalAlignment: HorizontalAlignments = js.native
  
  /* CompleteClass */
  var IndentLevel: `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9` | `10` | `11` | `12` | `13` | `14` | `15` = js.native
  
  /* CompleteClass */
  var Interior: typingsJapgolly.activexExcel.Excel.Interior = js.native
  
  /* CompleteClass */
  var Locked: Boolean | Null = js.native
  
  /* CompleteClass */
  var MergeCells: Boolean = js.native
  
  /* CompleteClass */
  var NumberFormat: String | Null = js.native
  
  /* CompleteClass */
  var NumberFormatLocal: String | Null = js.native
  
  /* CompleteClass */
  var Orientation: Double | XlOrientation = js.native
  
  /* CompleteClass */
  override val Parent: Any = js.native
  
  /* CompleteClass */
  var ShrinkToFit: Boolean | Null = js.native
  
  /* CompleteClass */
  var VerticalAlignment: VerticalAlignments = js.native
  
  /* CompleteClass */
  var WrapText: Boolean | Null = js.native
}
