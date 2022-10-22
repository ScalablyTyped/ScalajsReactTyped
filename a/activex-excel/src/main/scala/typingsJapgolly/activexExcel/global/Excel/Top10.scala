package typingsJapgolly.activexExcel.global.Excel

import typingsJapgolly.activexExcel.Excel.Borders
import typingsJapgolly.activexExcel.Excel.Range
import typingsJapgolly.activexExcel.Excel.XlBordersIndex
import typingsJapgolly.activexExcel.Excel.XlCalcFor
import typingsJapgolly.activexExcel.Excel.XlCreator
import typingsJapgolly.activexExcel.Excel.XlPivotConditionScope
import typingsJapgolly.activexExcel.Excel.XlTopBottom
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Excel.Top10")
@js.native
/* private */ open class Top10 ()
  extends StObject
     with typingsJapgolly.activexExcel.Excel.Top10 {
  
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
  var CalcFor: XlCalcFor = js.native
  
  /* CompleteClass */
  override val Creator: XlCreator = js.native
  
  /* CompleteClass */
  override def Delete(): Unit = js.native
  
  /* private */ /* CompleteClass */
  @JSName("Excel.Top10_typekey")
  var ExcelDotTop10_typekey: typingsJapgolly.activexExcel.Excel.Top10 = js.native
  
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
  var Percent: Boolean = js.native
  
  /* CompleteClass */
  var Priority: Double = js.native
  
  /* CompleteClass */
  var Rank: Double = js.native
  
  /* CompleteClass */
  var ScopeType: XlPivotConditionScope = js.native
  
  /* CompleteClass */
  override def SetFirstPriority(): Unit = js.native
  
  /* CompleteClass */
  override def SetLastPriority(): Unit = js.native
  
  /* CompleteClass */
  var StopIfTrue: Boolean = js.native
  
  /* CompleteClass */
  var TopBottom: XlTopBottom = js.native
  
  /* CompleteClass */
  override val Type: Double = js.native
}
