package typingsJapgolly.activexExcel.global.Excel

import typingsJapgolly.activexExcel.Excel.PivotItemsResult
import typingsJapgolly.activexExcel.Excel.Range
import typingsJapgolly.activexExcel.Excel.XlCreator
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Excel.PivotItem")
@js.native
/* private */ open class PivotItem ()
  extends StObject
     with typingsJapgolly.activexExcel.Excel.PivotItem {
  
  /* CompleteClass */
  override val Application: typingsJapgolly.activexExcel.Excel.Application = js.native
  
  /* CompleteClass */
  var Caption: String = js.native
  
  /* CompleteClass */
  override def ChildItems(Indexes: SafeArray[Double | String]): typingsJapgolly.activexExcel.Excel.PivotItems = js.native
  /* CompleteClass */
  override def ChildItems(Index: String): typingsJapgolly.activexExcel.Excel.PivotItem = js.native
  /* CompleteClass */
  override def ChildItems(Index: Double): typingsJapgolly.activexExcel.Excel.PivotItem = js.native
  /* CompleteClass */
  @JSName("ChildItems")
  var ChildItems_Original: PivotItemsResult = js.native
  
  /* CompleteClass */
  override val Creator: XlCreator = js.native
  
  /* CompleteClass */
  override def DataRange(Address: String): Range = js.native
  /* CompleteClass */
  override def DataRange(RowIndex: Double): Range = js.native
  /* CompleteClass */
  override def DataRange(RowIndex: Double, ColumnIndex: Double): Range = js.native
  /* CompleteClass */
  @JSName("DataRange")
  override val DataRange_Original: Range = js.native
  
  /* CompleteClass */
  override def Delete(): Unit = js.native
  
  /* CompleteClass */
  override def DrillTo(Field: String): Unit = js.native
  
  /* CompleteClass */
  var DrilledDown: Boolean = js.native
  
  /* private */ /* CompleteClass */
  @JSName("Excel.PivotItem_typekey")
  var ExcelDotPivotItem_typekey: typingsJapgolly.activexExcel.Excel.PivotItem = js.native
  
  /* CompleteClass */
  var Formula: String = js.native
  
  /* CompleteClass */
  override val IsCalculated: Boolean = js.native
  
  /* CompleteClass */
  override def LabelRange(Address: String): Range = js.native
  /* CompleteClass */
  override def LabelRange(RowIndex: Double): Range = js.native
  /* CompleteClass */
  override def LabelRange(RowIndex: Double, ColumnIndex: Double): Range = js.native
  /* CompleteClass */
  @JSName("LabelRange")
  override val LabelRange_Original: Range = js.native
  
  /* CompleteClass */
  var Name: String = js.native
  
  /* CompleteClass */
  override val Parent: typingsJapgolly.activexExcel.Excel.PivotField = js.native
  
  /* CompleteClass */
  override val ParentItem: typingsJapgolly.activexExcel.Excel.PivotItem = js.native
  
  /* CompleteClass */
  override val ParentShowDetail: Boolean = js.native
  
  /* CompleteClass */
  var Position: Double = js.native
  
  /* CompleteClass */
  override val RecordCount: Double = js.native
  
  /* CompleteClass */
  var ShowDetail: Boolean = js.native
  
  /* CompleteClass */
  override val SourceName: Any = js.native
  
  /* CompleteClass */
  override val SourceNameStandard: String = js.native
  
  /* CompleteClass */
  var StandardFormula: String = js.native
  
  /* CompleteClass */
  var Value: String = js.native
  
  /* CompleteClass */
  var Visible: Boolean = js.native
  
  /* CompleteClass */
  var _Default: String = js.native
}
