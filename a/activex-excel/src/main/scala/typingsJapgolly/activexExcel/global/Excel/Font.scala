package typingsJapgolly.activexExcel.global.Excel

import typingsJapgolly.activexExcel.Excel.XlBackground
import typingsJapgolly.activexExcel.Excel.XlColorIndex
import typingsJapgolly.activexExcel.Excel.XlCreator
import typingsJapgolly.activexExcel.Excel.XlRgbColor
import typingsJapgolly.activexExcel.Excel.XlThemeColor
import typingsJapgolly.activexExcel.Excel.XlThemeFont
import typingsJapgolly.activexExcel.Excel.XlUnderlineStyle
import typingsJapgolly.activexExcel.activexExcelStrings.Bold
import typingsJapgolly.activexExcel.activexExcelStrings.Italic
import typingsJapgolly.activexExcel.activexExcelStrings.Regular
import typingsJapgolly.activexExcel.activexExcelStrings.`Bold Italic`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Excel.Font")
@js.native
/* private */ open class Font ()
  extends StObject
     with typingsJapgolly.activexExcel.Excel.Font {
  
  /* CompleteClass */
  override val Application: typingsJapgolly.activexExcel.Excel.Application = js.native
  
  /* CompleteClass */
  var Background: XlBackground = js.native
  
  /* CompleteClass */
  var Bold: Boolean = js.native
  
  /* CompleteClass */
  var Color: XlRgbColor | Double = js.native
  
  /* CompleteClass */
  var ColorIndex: Double | XlColorIndex = js.native
  
  /* CompleteClass */
  override val Creator: XlCreator = js.native
  
  /* private */ /* CompleteClass */
  @JSName("Excel.Font_typekey")
  var ExcelDotFont_typekey: typingsJapgolly.activexExcel.Excel.Font = js.native
  
  /* CompleteClass */
  var FontStyle: Regular | Italic | Bold | (`Bold Italic`) = js.native
  
  /* CompleteClass */
  var Italic: Boolean = js.native
  
  /* CompleteClass */
  var Name: String = js.native
  
  /* CompleteClass */
  var OutlineFont: Any = js.native
  
  /* CompleteClass */
  override val Parent: Any = js.native
  
  /* CompleteClass */
  var Shadow: Any = js.native
  
  /* CompleteClass */
  var Size: Double = js.native
  
  /* CompleteClass */
  var Strikethrough: Boolean = js.native
  
  /* CompleteClass */
  var Subscript: Boolean = js.native
  
  /* CompleteClass */
  var Superscript: Boolean = js.native
  
  /* CompleteClass */
  var ThemeColor: XlThemeColor = js.native
  
  /* CompleteClass */
  var ThemeFont: XlThemeFont = js.native
  
  /* CompleteClass */
  var TintAndShade: Double = js.native
  
  /* CompleteClass */
  var Underline: XlUnderlineStyle = js.native
}
