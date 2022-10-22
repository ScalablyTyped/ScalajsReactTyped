package typingsJapgolly.activexExcel.global.Excel

import typingsJapgolly.activexExcel.Excel.Range
import typingsJapgolly.activexExcel.Excel.XlCreator
import typingsJapgolly.activexExcel.Excel.XlDirection
import typingsJapgolly.activexExcel.Excel.XlPageBreak
import typingsJapgolly.activexExcel.Excel.XlPageBreakExtent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Excel.HPageBreak")
@js.native
/* private */ open class HPageBreak ()
  extends StObject
     with typingsJapgolly.activexExcel.Excel.HPageBreak {
  
  /* CompleteClass */
  override val Application: typingsJapgolly.activexExcel.Excel.Application = js.native
  
  /* CompleteClass */
  override val Creator: XlCreator = js.native
  
  /* CompleteClass */
  override def Delete(): Unit = js.native
  
  /* CompleteClass */
  override def DragOff(Direction: XlDirection, RegionIndex: Double): Unit = js.native
  
  /* private */ /* CompleteClass */
  @JSName("Excel.HPageBreak_typekey")
  var ExcelDotHPageBreak_typekey: typingsJapgolly.activexExcel.Excel.HPageBreak = js.native
  
  /* CompleteClass */
  override val Extent: XlPageBreakExtent = js.native
  
  /* CompleteClass */
  override def Location(Address: String): Range = js.native
  /* CompleteClass */
  override def Location(RowIndex: Double): Range = js.native
  /* CompleteClass */
  override def Location(RowIndex: Double, ColumnIndex: Double): Range = js.native
  /* CompleteClass */
  @JSName("Location")
  var Location_Original: Range = js.native
  
  /* CompleteClass */
  override val Parent: typingsJapgolly.activexExcel.Excel.Worksheet = js.native
  
  /* CompleteClass */
  var Type: XlPageBreak = js.native
}
