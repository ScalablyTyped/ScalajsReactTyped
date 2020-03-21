package typingsJapgolly.activexExcel.Excel

import typingsJapgolly.activexExcel.activexExcelStrings.Bold
import typingsJapgolly.activexExcel.activexExcelStrings.Italic
import typingsJapgolly.activexExcel.activexExcelStrings.Regular
import typingsJapgolly.activexExcel.activexExcelStrings.`Bold Italic`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Excel.Font")
@js.native
class Font protected () extends js.Object {
  val Application: typingsJapgolly.activexExcel.Excel.Application = js.native
  var Background: XlBackground = js.native
  var Bold: Boolean = js.native
  var Color: XlRgbColor | Double = js.native
  var ColorIndex: Double | XlColorIndex = js.native
  val Creator: XlCreator = js.native
  @JSName("Excel.Font_typekey")
  var ExcelDotFont_typekey: Font = js.native
  var FontStyle: Regular | Italic | Bold | (`Bold Italic`) = js.native
  var Italic: Boolean = js.native
  var Name: String = js.native
  var OutlineFont: js.Any = js.native
  val Parent: js.Any = js.native
  var Shadow: js.Any = js.native
  var Size: Double = js.native
  var Strikethrough: Boolean = js.native
  var Subscript: Boolean = js.native
  var Superscript: Boolean = js.native
  var ThemeColor: XlThemeColor = js.native
  var ThemeFont: XlThemeFont = js.native
  var TintAndShade: Double = js.native
  var Underline: XlUnderlineStyle = js.native
}

