package typingsJapgolly.activexPowerpoint.PowerPoint

import typingsJapgolly.activexOffice.Office.MsoColorType
import typingsJapgolly.activexOffice.Office.MsoRGBType
import typingsJapgolly.activexOffice.Office.MsoThemeColorIndex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PowerPoint.ColorFormat")
@js.native
class ColorFormat protected () extends js.Object {
  val Application: js.Any = js.native
  var Brightness: Double = js.native
  val Creator: Double = js.native
  var ObjectThemeColor: MsoThemeColorIndex = js.native
  val Parent: js.Any = js.native
  @JSName("PowerPoint.ColorFormat_typekey")
  var PowerPointDotColorFormat_typekey: ColorFormat = js.native
  var RGB: MsoRGBType = js.native
  var SchemeColor: PpColorSchemeIndex = js.native
  var TintAndShade: Double = js.native
  val Type: MsoColorType = js.native
}

