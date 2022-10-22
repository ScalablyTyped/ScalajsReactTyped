package typingsJapgolly.activexExcel.global.Excel

import typingsJapgolly.activexExcel.Excel.LegendEntries
import typingsJapgolly.activexExcel.Excel.XlCreator
import typingsJapgolly.activexExcel.Excel.XlLegendPosition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Excel.Legend")
@js.native
/* private */ open class Legend ()
  extends StObject
     with typingsJapgolly.activexExcel.Excel.Legend {
  
  /* CompleteClass */
  override val Application: typingsJapgolly.activexExcel.Excel.Application = js.native
  
  /* CompleteClass */
  var AutoScaleFont: Any = js.native
  
  /* CompleteClass */
  override val Border: typingsJapgolly.activexExcel.Excel.Border = js.native
  
  /* CompleteClass */
  override def Clear(): Any = js.native
  
  /* CompleteClass */
  override val Creator: XlCreator = js.native
  
  /* CompleteClass */
  override def Delete(): Any = js.native
  
  /* private */ /* CompleteClass */
  @JSName("Excel.Legend_typekey")
  var ExcelDotLegend_typekey: typingsJapgolly.activexExcel.Excel.Legend = js.native
  
  /* CompleteClass */
  override val Fill: typingsJapgolly.activexExcel.Excel.ChartFillFormat = js.native
  
  /* CompleteClass */
  override val Font: typingsJapgolly.activexExcel.Excel.Font = js.native
  
  /* CompleteClass */
  override val Format: typingsJapgolly.activexExcel.Excel.ChartFormat = js.native
  
  /* CompleteClass */
  var Height: Double = js.native
  
  /* CompleteClass */
  var IncludeInLayout: Boolean = js.native
  
  /* CompleteClass */
  override val Interior: typingsJapgolly.activexExcel.Excel.Interior = js.native
  
  /* CompleteClass */
  var Left: Double = js.native
  
  /* CompleteClass */
  override def LegendEntries(Index: Double): typingsJapgolly.activexExcel.Excel.LegendEntry = js.native
  /* CompleteClass */
  @JSName("LegendEntries")
  var LegendEntries_Original: LegendEntries & (js.Function1[/* Index */ Double, typingsJapgolly.activexExcel.Excel.LegendEntry]) = js.native
  
  /* CompleteClass */
  override val Name: String = js.native
  
  /* CompleteClass */
  override val Parent: Any = js.native
  
  /* CompleteClass */
  var Position: XlLegendPosition = js.native
  
  /* CompleteClass */
  override def Select(): Any = js.native
  
  /* CompleteClass */
  var Shadow: Boolean = js.native
  
  /* CompleteClass */
  var Top: Double = js.native
  
  /* CompleteClass */
  var Width: Double = js.native
}
