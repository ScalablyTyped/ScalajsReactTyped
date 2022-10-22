package typingsJapgolly.activexExcel.global.Excel

import typingsJapgolly.activexExcel.Excel.Range
import typingsJapgolly.activexExcel.Excel.XlCreator
import typingsJapgolly.activexExcel.Excel.XlSortDataOption
import typingsJapgolly.activexExcel.Excel.XlSortOn
import typingsJapgolly.activexExcel.Excel.XlSortOrder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Excel.SortField")
@js.native
/* private */ open class SortField ()
  extends StObject
     with typingsJapgolly.activexExcel.Excel.SortField {
  
  /* CompleteClass */
  override val Application: typingsJapgolly.activexExcel.Excel.Application = js.native
  
  /* CompleteClass */
  override val Creator: XlCreator = js.native
  
  /* CompleteClass */
  var CustomOrder: Any = js.native
  
  /* CompleteClass */
  var DataOption: XlSortDataOption = js.native
  
  /* CompleteClass */
  override def Delete(): Unit = js.native
  
  /* private */ /* CompleteClass */
  @JSName("Excel.SortField_typekey")
  var ExcelDotSortField_typekey: typingsJapgolly.activexExcel.Excel.SortField = js.native
  
  /* CompleteClass */
  override def Key(Address: String): Range = js.native
  /* CompleteClass */
  override def Key(RowIndex: Double): Range = js.native
  /* CompleteClass */
  override def Key(RowIndex: Double, ColumnIndex: Double): Range = js.native
  /* CompleteClass */
  @JSName("Key")
  override val Key_Original: Range = js.native
  
  /* CompleteClass */
  override def ModifyKey(Key: Range): Unit = js.native
  
  /* CompleteClass */
  var Order: XlSortOrder = js.native
  
  /* CompleteClass */
  override val Parent: Any = js.native
  
  /* CompleteClass */
  var Priority: Double = js.native
  
  /* CompleteClass */
  override def SetIcon(Icon: typingsJapgolly.activexExcel.Excel.Icon): Unit = js.native
  
  /* CompleteClass */
  var SortOn: XlSortOn = js.native
  
  /* CompleteClass */
  override val SortOnValue: Any = js.native
}
