package typingsJapgolly.activexExcel.global.Excel

import typingsJapgolly.activexExcel.Excel.PivotItemList
import typingsJapgolly.activexExcel.Excel.Range
import typingsJapgolly.activexExcel.Excel.XlCellChangedState
import typingsJapgolly.activexExcel.Excel.XlConsolidationFunction
import typingsJapgolly.activexExcel.Excel.XlCreator
import typingsJapgolly.activexExcel.Excel.XlPivotCellType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Excel.PivotCell")
@js.native
/* private */ open class PivotCell ()
  extends StObject
     with typingsJapgolly.activexExcel.Excel.PivotCell {
  
  /* CompleteClass */
  override def AllocateChange(): Unit = js.native
  
  /* CompleteClass */
  override val Application: typingsJapgolly.activexExcel.Excel.Application = js.native
  
  /* CompleteClass */
  override val CellChanged: XlCellChangedState = js.native
  
  /* CompleteClass */
  override def ColumnItems(Field: String): typingsJapgolly.activexExcel.Excel.PivotItem = js.native
  /* CompleteClass */
  override def ColumnItems(Field: Double): typingsJapgolly.activexExcel.Excel.PivotItem = js.native
  /* CompleteClass */
  @JSName("ColumnItems")
  override val ColumnItems_Original: PivotItemList = js.native
  
  /* CompleteClass */
  override val Creator: XlCreator = js.native
  
  /* CompleteClass */
  override val CustomSubtotalFunction: XlConsolidationFunction = js.native
  
  /* CompleteClass */
  override val DataField: typingsJapgolly.activexExcel.Excel.PivotField = js.native
  
  /* CompleteClass */
  override val DataSourceValue: Any = js.native
  
  /* CompleteClass */
  override def DiscardChange(): Unit = js.native
  
  /* CompleteClass */
  override val Dummy18: String = js.native
  
  /* private */ /* CompleteClass */
  @JSName("Excel.PivotCell_typekey")
  var ExcelDotPivotCell_typekey: typingsJapgolly.activexExcel.Excel.PivotCell = js.native
  
  /* CompleteClass */
  override val MDX: String = js.native
  
  /* CompleteClass */
  override val Parent: Any = js.native
  
  /* CompleteClass */
  override val PivotCellType: XlPivotCellType = js.native
  
  /* CompleteClass */
  override val PivotColumnLine: typingsJapgolly.activexExcel.Excel.PivotLine = js.native
  
  /* CompleteClass */
  override val PivotField: typingsJapgolly.activexExcel.Excel.PivotField = js.native
  
  /* CompleteClass */
  override val PivotItem: typingsJapgolly.activexExcel.Excel.PivotItem = js.native
  
  /* CompleteClass */
  override val PivotRowLine: typingsJapgolly.activexExcel.Excel.PivotLine = js.native
  
  /* CompleteClass */
  override val PivotTable: typingsJapgolly.activexExcel.Excel.PivotTable = js.native
  
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
  override def RowItems(Field: String): typingsJapgolly.activexExcel.Excel.PivotItem = js.native
  /* CompleteClass */
  override def RowItems(Field: Double): typingsJapgolly.activexExcel.Excel.PivotItem = js.native
  /* CompleteClass */
  @JSName("RowItems")
  override val RowItems_Original: PivotItemList = js.native
}
