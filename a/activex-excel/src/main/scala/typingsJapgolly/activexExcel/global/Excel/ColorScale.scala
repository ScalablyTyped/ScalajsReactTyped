package typingsJapgolly.activexExcel.global.Excel

import typingsJapgolly.activexExcel.Excel.ColorScaleCriteria
import typingsJapgolly.activexExcel.Excel.Range
import typingsJapgolly.activexExcel.Excel.XlCreator
import typingsJapgolly.activexExcel.Excel.XlPivotConditionScope
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Excel.ColorScale")
@js.native
/* private */ open class ColorScale ()
  extends StObject
     with typingsJapgolly.activexExcel.Excel.ColorScale {
  
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
  override def ColorScaleCriteria(Index: Double): typingsJapgolly.activexExcel.Excel.ColorScaleCriterion = js.native
  /* CompleteClass */
  @JSName("ColorScaleCriteria")
  override val ColorScaleCriteria_Original: ColorScaleCriteria = js.native
  
  /* CompleteClass */
  override val Creator: XlCreator = js.native
  
  /* CompleteClass */
  override def Delete(): Unit = js.native
  
  /* private */ /* CompleteClass */
  @JSName("Excel.ColorScale_typekey")
  var ExcelDotColorScale_typekey: typingsJapgolly.activexExcel.Excel.ColorScale = js.native
  
  /* CompleteClass */
  var Formula: String = js.native
  
  /* CompleteClass */
  override def ModifyAppliesToRange(Range: Range): Unit = js.native
  
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
  override val StopIfTrue: Boolean = js.native
  
  /* CompleteClass */
  override val Type: Double = js.native
}
