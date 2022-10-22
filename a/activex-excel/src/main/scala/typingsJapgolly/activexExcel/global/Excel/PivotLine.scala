package typingsJapgolly.activexExcel.global.Excel

import typingsJapgolly.activexExcel.Excel.PivotLineCells
import typingsJapgolly.activexExcel.Excel.XlCreator
import typingsJapgolly.activexExcel.Excel.XlPivotLineType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Excel.PivotLine")
@js.native
/* private */ open class PivotLine ()
  extends StObject
     with typingsJapgolly.activexExcel.Excel.PivotLine {
  
  /* CompleteClass */
  override val Application: typingsJapgolly.activexExcel.Excel.Application = js.native
  
  /* CompleteClass */
  override val Creator: XlCreator = js.native
  
  /* private */ /* CompleteClass */
  @JSName("Excel.PivotLine_typekey")
  var ExcelDotPivotLine_typekey: typingsJapgolly.activexExcel.Excel.PivotLine = js.native
  
  /* CompleteClass */
  override val LineType: XlPivotLineType = js.native
  
  /* CompleteClass */
  override val Parent: Any = js.native
  
  /* CompleteClass */
  override def PivotLineCells(Index: Double): typingsJapgolly.activexExcel.Excel.PivotCell = js.native
  /* CompleteClass */
  @JSName("PivotLineCells")
  override val PivotLineCells_Original: PivotLineCells = js.native
  
  /* CompleteClass */
  override val Position: Double = js.native
}
