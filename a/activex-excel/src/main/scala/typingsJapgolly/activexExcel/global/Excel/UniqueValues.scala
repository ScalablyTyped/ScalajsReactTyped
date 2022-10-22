package typingsJapgolly.activexExcel.global.Excel

import typingsJapgolly.activexExcel.Excel.Borders
import typingsJapgolly.activexExcel.Excel.Range
import typingsJapgolly.activexExcel.Excel.XlBordersIndex
import typingsJapgolly.activexExcel.Excel.XlCreator
import typingsJapgolly.activexExcel.Excel.XlDupeUnique
import typingsJapgolly.activexExcel.Excel.XlPivotConditionScope
import typingsJapgolly.activexExcel.activexExcelInts.`8`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Excel.UniqueValues")
@js.native
/* private */ open class UniqueValues ()
  extends StObject
     with typingsJapgolly.activexExcel.Excel.UniqueValues {
  
  /* CompleteClass */
  override val Application: typingsJapgolly.activexExcel.Excel.Application = js.native
  
  /* CompleteClass */
  override def AppliesTo(Address: String): Range = js.native
  /* CompleteClass */
  override def AppliesTo(RowIndex: Double): Range = js.native
  /* CompleteClass */
  override def AppliesTo(RowIndex: Double, ColumnIndex: Double): Range = js.native
  /* CompleteClass */
  @JSName("AppliesTo")
  override val AppliesTo_Original: Range = js.native
  
  /* CompleteClass */
  override def Borders(Index: XlBordersIndex): typingsJapgolly.activexExcel.Excel.Border = js.native
  /* CompleteClass */
  @JSName("Borders")
  override val Borders_Original: Borders = js.native
  
  /* CompleteClass */
  override val Creator: XlCreator = js.native
  
  /* CompleteClass */
  override def Delete(): Unit = js.native
  
  /* CompleteClass */
  var DupeUnique: XlDupeUnique = js.native
  
  /* private */ /* CompleteClass */
  @JSName("Excel.UniqueValues_typekey")
  var ExcelDotUniqueValues_typekey: typingsJapgolly.activexExcel.Excel.UniqueValues = js.native
  
  /* CompleteClass */
  override val Font: typingsJapgolly.activexExcel.Excel.Font = js.native
  
  /* CompleteClass */
  override val Interior: typingsJapgolly.activexExcel.Excel.Interior = js.native
  
  /* CompleteClass */
  override def ModifyAppliesToRange(Range: Range): Unit = js.native
  
  /* CompleteClass */
  var NumberFormat: String = js.native
  
  /* CompleteClass */
  override val PTCondition: Boolean = js.native
  
  /* CompleteClass */
  override val Parent: Any = js.native
  
  /* CompleteClass */
  var Priority: Double = js.native
  
  /* CompleteClass */
  var ScopeType: XlPivotConditionScope = js.native
  
  /* CompleteClass */
  override def SetFirstPriority(): Unit = js.native
  
  /* CompleteClass */
  override def SetLastPriority(): Unit = js.native
  
  /* CompleteClass */
  var StopIfTrue: Boolean = js.native
  
  /* CompleteClass */
  override val Type: `8` = js.native
}
