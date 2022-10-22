package typingsJapgolly.activexExcel.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataLabels extends StObject {
  
  def apply(Index: Double): DataLabel = js.native
  
  val Application: typingsJapgolly.activexExcel.Excel.Application = js.native
  
  var AutoScaleFont: Any = js.native
  
  var AutoText: Boolean = js.native
  
  val Border: typingsJapgolly.activexExcel.Excel.Border = js.native
  
  val Count: Double = js.native
  
  val Creator: XlCreator = js.native
  
  def Delete(): Any = js.native
  
  val Fill: ChartFillFormat = js.native
  
  val Font: typingsJapgolly.activexExcel.Excel.Font = js.native
  
  val Format: ChartFormat = js.native
  
  var HorizontalAlignment: HorizontalAlignments = js.native
  
  val Interior: typingsJapgolly.activexExcel.Excel.Interior = js.native
  
  def Item(Index: Double): DataLabel = js.native
  
  val Name: String = js.native
  
  var NumberFormat: String = js.native
  
  var NumberFormatLinked: Boolean = js.native
  
  var NumberFormatLocal: String = js.native
  
  var Orientation: XlOrientation = js.native
  
  val Parent: Any = js.native
  
  var Position: XlDataLabelPosition = js.native
  
  var ReadingOrder: Double = js.native
  
  def Select(): Any = js.native
  
  var Separator: String | XlDataLabelSeparator = js.native
  
  var Shadow: Boolean = js.native
  
  var ShowBubbleSize: Boolean = js.native
  
  var ShowCategoryName: Boolean = js.native
  
  var ShowLegendKey: Boolean = js.native
  
  var ShowPercentage: Boolean = js.native
  
  var ShowSeriesName: Boolean = js.native
  
  var ShowValue: Boolean = js.native
  
  var Type: Any = js.native
  
  var VerticalAlignment: VerticalAlignments = js.native
  
  def _Default(Index: Any): DataLabel = js.native
}
