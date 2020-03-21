package typingsJapgolly.activexExcel.Excel

import typingsJapgolly.activexOffice.Office.MsoColorType
import typingsJapgolly.activexOffice.Office.MsoRGBType
import typingsJapgolly.activexOffice.Office.MsoThemeColorIndex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Excel.ColorFormat")
@js.native
class ColorFormat protected () extends js.Object {
  val Application: js.Any = js.native
  var Brightness: Double = js.native
  val Creator: Double = js.native
  @JSName("Excel.ColorFormat_typekey")
  var ExcelDotColorFormat_typekey: ColorFormat = js.native
  var ObjectThemeColor: MsoThemeColorIndex = js.native
  val Parent: js.Any = js.native
  var RGB: MsoRGBType = js.native
  var SchemeColor: Double = js.native
  var TintAndShade: Double = js.native
  val Type: MsoColorType = js.native
}

