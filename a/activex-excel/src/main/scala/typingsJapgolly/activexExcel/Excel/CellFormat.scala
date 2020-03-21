package typingsJapgolly.activexExcel.Excel

import typingsJapgolly.activexExcel.activexExcelNumbers.`0`
import typingsJapgolly.activexExcel.activexExcelNumbers.`10`
import typingsJapgolly.activexExcel.activexExcelNumbers.`11`
import typingsJapgolly.activexExcel.activexExcelNumbers.`12`
import typingsJapgolly.activexExcel.activexExcelNumbers.`13`
import typingsJapgolly.activexExcel.activexExcelNumbers.`14`
import typingsJapgolly.activexExcel.activexExcelNumbers.`15`
import typingsJapgolly.activexExcel.activexExcelNumbers.`1`
import typingsJapgolly.activexExcel.activexExcelNumbers.`2`
import typingsJapgolly.activexExcel.activexExcelNumbers.`3`
import typingsJapgolly.activexExcel.activexExcelNumbers.`4`
import typingsJapgolly.activexExcel.activexExcelNumbers.`5`
import typingsJapgolly.activexExcel.activexExcelNumbers.`6`
import typingsJapgolly.activexExcel.activexExcelNumbers.`7`
import typingsJapgolly.activexExcel.activexExcelNumbers.`8`
import typingsJapgolly.activexExcel.activexExcelNumbers.`9`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Excel.CellFormat")
@js.native
class CellFormat protected () extends js.Object {
  var AddIndent: Boolean = js.native
  val Application: typingsJapgolly.activexExcel.Excel.Application = js.native
  @JSName("Borders")
  var Borders_Original: Borders = js.native
  val Creator: XlCreator = js.native
  @JSName("Excel.CellFormat_typekey")
  var ExcelDotCellFormat_typekey: CellFormat = js.native
  var Font: typingsJapgolly.activexExcel.Excel.Font = js.native
  var FormulaHidden: Boolean | Null = js.native
  var HorizontalAlignment: HorizontalAlignments = js.native
  var IndentLevel: `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9` | `10` | `11` | `12` | `13` | `14` | `15` = js.native
  var Interior: typingsJapgolly.activexExcel.Excel.Interior = js.native
  var Locked: Boolean | Null = js.native
  var MergeCells: Boolean = js.native
  var NumberFormat: String | Null = js.native
  var NumberFormatLocal: String | Null = js.native
  var Orientation: Double | XlOrientation = js.native
  val Parent: js.Any = js.native
  var ShrinkToFit: Boolean | Null = js.native
  var VerticalAlignment: VerticalAlignments = js.native
  var WrapText: Boolean | Null = js.native
  def Borders(Index: XlBordersIndex): Border = js.native
  def Clear(): Unit = js.native
}

