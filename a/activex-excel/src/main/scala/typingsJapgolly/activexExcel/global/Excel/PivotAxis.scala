package typingsJapgolly.activexExcel.global.Excel

import typingsJapgolly.activexExcel.Excel.PivotLines
import typingsJapgolly.activexExcel.Excel.XlCreator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Excel.PivotAxis")
@js.native
/* private */ open class PivotAxis ()
  extends StObject
     with typingsJapgolly.activexExcel.Excel.PivotAxis {
  
  /* CompleteClass */
  override val Application: typingsJapgolly.activexExcel.Excel.Application = js.native
  
  /* CompleteClass */
  override val Creator: XlCreator = js.native
  
  /* private */ /* CompleteClass */
  @JSName("Excel.PivotAxis_typekey")
  var ExcelDotPivotAxis_typekey: typingsJapgolly.activexExcel.Excel.PivotAxis = js.native
  
  /* CompleteClass */
  override val Parent: Any = js.native
  
  /* CompleteClass */
  override def PivotLines(Index: Double): typingsJapgolly.activexExcel.Excel.PivotLine = js.native
  /* CompleteClass */
  @JSName("PivotLines")
  override val PivotLines_Original: PivotLines = js.native
}
