package typingsJapgolly.activexExcel.global.Excel

import typingsJapgolly.activexExcel.Excel.Borders
import typingsJapgolly.activexExcel.Excel.XlBordersIndex
import typingsJapgolly.activexExcel.Excel.XlCreator
import typingsJapgolly.activexExcel.Excel.XlHAlign
import typingsJapgolly.activexExcel.Excel.XlOrientation
import typingsJapgolly.activexExcel.Excel.XlVAlign
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Excel.Style")
@js.native
/* private */ open class Style ()
  extends StObject
     with typingsJapgolly.activexExcel.Excel.Style {
  
  /* CompleteClass */
  var AddIndent: Boolean = js.native
  
  /* CompleteClass */
  override val Application: typingsJapgolly.activexExcel.Excel.Application = js.native
  
  /* CompleteClass */
  override def Borders(Index: XlBordersIndex): typingsJapgolly.activexExcel.Excel.Border = js.native
  /* CompleteClass */
  @JSName("Borders")
  override val Borders_Original: Borders = js.native
  
  /* CompleteClass */
  override val BuiltIn: Boolean = js.native
  
  /* CompleteClass */
  override val Creator: XlCreator = js.native
  
  /* CompleteClass */
  override def Delete(): Any = js.native
  
  /* private */ /* CompleteClass */
  @JSName("Excel.Style_typekey")
  var ExcelDotStyle_typekey: typingsJapgolly.activexExcel.Excel.Style = js.native
  
  /* CompleteClass */
  override val Font: typingsJapgolly.activexExcel.Excel.Font = js.native
  
  /* CompleteClass */
  var FormulaHidden: Boolean = js.native
  
  /* CompleteClass */
  var HorizontalAlignment: XlHAlign = js.native
  
  /* CompleteClass */
  var IncludeAlignment: Boolean = js.native
  
  /* CompleteClass */
  var IncludeBorder: Boolean = js.native
  
  /* CompleteClass */
  var IncludeFont: Boolean = js.native
  
  /* CompleteClass */
  var IncludeNumber: Boolean = js.native
  
  /* CompleteClass */
  var IncludePatterns: Boolean = js.native
  
  /* CompleteClass */
  var IncludeProtection: Boolean = js.native
  
  /* CompleteClass */
  var IndentLevel: Double = js.native
  
  /* CompleteClass */
  override val Interior: typingsJapgolly.activexExcel.Excel.Interior = js.native
  
  /* CompleteClass */
  var Locked: Boolean = js.native
  
  /* CompleteClass */
  var MergeCells: Boolean = js.native
  
  /* CompleteClass */
  override val Name: String = js.native
  
  /* CompleteClass */
  override val NameLocal: String = js.native
  
  /* CompleteClass */
  var NumberFormat: String = js.native
  
  /* CompleteClass */
  var NumberFormatLocal: String = js.native
  
  /* CompleteClass */
  var Orientation: XlOrientation = js.native
  
  /* CompleteClass */
  override val Parent: Any = js.native
  
  /* CompleteClass */
  var ReadingOrder: Double = js.native
  
  /* CompleteClass */
  var ShrinkToFit: Boolean = js.native
  
  /* CompleteClass */
  override val Value: String = js.native
  
  /* CompleteClass */
  var VerticalAlignment: XlVAlign = js.native
  
  /* CompleteClass */
  var WrapText: Boolean = js.native
  
  /* CompleteClass */
  override val _Default: String = js.native
}
