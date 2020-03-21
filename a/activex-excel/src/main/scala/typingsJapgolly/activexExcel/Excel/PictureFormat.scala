package typingsJapgolly.activexExcel.Excel

import typingsJapgolly.activexOffice.Office.MsoPictureColorType
import typingsJapgolly.activexOffice.Office.MsoRGBType
import typingsJapgolly.activexOffice.Office.MsoTriState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Excel.PictureFormat")
@js.native
class PictureFormat protected () extends js.Object {
  val Application: js.Any = js.native
  var Brightness: Double = js.native
  var ColorType: MsoPictureColorType = js.native
  var Contrast: Double = js.native
  val Creator: Double = js.native
  val Crop: typingsJapgolly.activexOffice.Office.Crop = js.native
  var CropBottom: Double = js.native
  var CropLeft: Double = js.native
  var CropRight: Double = js.native
  var CropTop: Double = js.native
  @JSName("Excel.PictureFormat_typekey")
  var ExcelDotPictureFormat_typekey: PictureFormat = js.native
  val Parent: js.Any = js.native
  var TransparencyColor: MsoRGBType = js.native
  var TransparentBackground: MsoTriState = js.native
  def IncrementBrightness(Increment: Double): Unit = js.native
  def IncrementContrast(Increment: Double): Unit = js.native
}

