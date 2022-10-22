package typingsJapgolly.activexExcel.global.Excel

import typingsJapgolly.activexExcel.Excel.Range
import typingsJapgolly.activexExcel.Excel.XlCreator
import typingsJapgolly.activexExcel.Excel.XlTotalsCalculation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Excel.ListColumn")
@js.native
/* private */ open class ListColumn ()
  extends StObject
     with typingsJapgolly.activexExcel.Excel.ListColumn {
  
  /* CompleteClass */
  override val Application: typingsJapgolly.activexExcel.Excel.Application = js.native
  
  /* CompleteClass */
  override val Creator: XlCreator = js.native
  
  /* CompleteClass */
  override def DataBodyRange(Address: String): Range = js.native
  /* CompleteClass */
  override def DataBodyRange(RowIndex: Double): Range = js.native
  /* CompleteClass */
  override def DataBodyRange(RowIndex: Double, ColumnIndex: Double): Range = js.native
  /* CompleteClass */
  @JSName("DataBodyRange")
  override val DataBodyRange_Original: Range = js.native
  
  /* CompleteClass */
  override def Delete(): Unit = js.native
  
  /* private */ /* CompleteClass */
  @JSName("Excel.ListColumn_typekey")
  var ExcelDotListColumn_typekey: typingsJapgolly.activexExcel.Excel.ListColumn = js.native
  
  /* CompleteClass */
  override val Index: Double = js.native
  
  /* CompleteClass */
  override val ListDataFormat: typingsJapgolly.activexExcel.Excel.ListDataFormat = js.native
  
  /* CompleteClass */
  var Name: String = js.native
  
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
  override val SharePointFormula: String = js.native
  
  /* CompleteClass */
  override def Total(Address: String): Range = js.native
  /* CompleteClass */
  override def Total(RowIndex: Double): Range = js.native
  /* CompleteClass */
  override def Total(RowIndex: Double, ColumnIndex: Double): Range = js.native
  /* CompleteClass */
  @JSName("Total")
  override val Total_Original: Range = js.native
  
  /* CompleteClass */
  var TotalsCalculation: XlTotalsCalculation = js.native
  
  /* CompleteClass */
  override val XPath: typingsJapgolly.activexExcel.Excel.XPath = js.native
  
  /* CompleteClass */
  override val _Default: String = js.native
}
