package typingsJapgolly.activexExcel.Excel

import typingsJapgolly.activexExcel.activexExcelNumbers.`0`
import typingsJapgolly.activexExcel.activexExcelNumbers.`1`
import typingsJapgolly.activexOffice.Office.MsoSegmentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Excel.FreeformBuilder")
@js.native
class FreeformBuilder protected () extends js.Object {
  val Application: typingsJapgolly.activexExcel.Excel.Application = js.native
  val Creator: XlCreator = js.native
  @JSName("Excel.FreeformBuilder_typekey")
  var ExcelDotFreeformBuilder_typekey: FreeformBuilder = js.native
  val Parent: js.Any = js.native
  @JSName("AddNodes")
  def AddNodes_0(SegmentType: MsoSegmentType, EditingType: `0`, X1: Double, Y1: Double): Unit = js.native
  @JSName("AddNodes")
  def AddNodes_1(
    SegmentType: `1`,
    EditingType: `1`,
    X1: Double,
    Y1: Double,
    X2: Double,
    Y2: Double,
    X3: Double,
    Y3: Double
  ): Unit = js.native
  def ConvertToShape(): Shape = js.native
}

