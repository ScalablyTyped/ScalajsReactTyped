package typingsJapgolly.activexExcel.Excel

import typingsJapgolly.activexExcel.activexExcelInts.`0`
import typingsJapgolly.activexExcel.activexExcelInts.`1`
import typingsJapgolly.activexOffice.Office.MsoSegmentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FreeformBuilder extends StObject {
  
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
  
  val Application: typingsJapgolly.activexExcel.Excel.Application = js.native
  
  def ConvertToShape(): Shape = js.native
  
  val Creator: XlCreator = js.native
  
  /* private */ @JSName("Excel.FreeformBuilder_typekey")
  var ExcelDotFreeformBuilder_typekey: FreeformBuilder = js.native
  
  val Parent: Any = js.native
}
