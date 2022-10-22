package typingsJapgolly.activexExcel.global.Excel

import typingsJapgolly.activexExcel.Excel.Filters
import typingsJapgolly.activexExcel.Excel.Range
import typingsJapgolly.activexExcel.Excel.XlCreator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Excel.AutoFilter")
@js.native
/* private */ open class AutoFilter ()
  extends StObject
     with typingsJapgolly.activexExcel.Excel.AutoFilter {
  
  /* CompleteClass */
  override val Application: typingsJapgolly.activexExcel.Excel.Application = js.native
  
  /* CompleteClass */
  override def ApplyFilter(): Unit = js.native
  
  /* CompleteClass */
  override val Creator: XlCreator = js.native
  
  /* private */ /* CompleteClass */
  @JSName("Excel.AutoFilter_typekey")
  var ExcelDotAutoFilter_typekey: typingsJapgolly.activexExcel.Excel.AutoFilter = js.native
  
  /* CompleteClass */
  override val FilterMode: Boolean = js.native
  
  /* CompleteClass */
  override def Filters(Index: Double): typingsJapgolly.activexExcel.Excel.Filter = js.native
  /* CompleteClass */
  @JSName("Filters")
  override val Filters_Original: Filters = js.native
  
  /* CompleteClass */
  override val Parent: Any = js.native
  
  /* CompleteClass */
  override def Range(Address: String): typingsJapgolly.activexExcel.Excel.Range = js.native
  /* CompleteClass */
  override def Range(RowIndex: Double): typingsJapgolly.activexExcel.Excel.Range = js.native
  /* CompleteClass */
  override def Range(RowIndex: Double, ColumnIndex: Double): typingsJapgolly.activexExcel.Excel.Range = js.native
  /* CompleteClass */
  @JSName("Range")
  override val Range_Original: Range = js.native
  
  /* CompleteClass */
  override def ShowAllData(): Unit = js.native
  
  /* CompleteClass */
  override val Sort: typingsJapgolly.activexExcel.Excel.Sort = js.native
}
