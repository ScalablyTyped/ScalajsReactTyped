package typingsJapgolly.activexExcel.Excel

import typingsJapgolly.activexOffice.Office.MsoFillType
import typingsJapgolly.activexOffice.Office.MsoGradientColorType
import typingsJapgolly.activexOffice.Office.MsoGradientStyle
import typingsJapgolly.activexOffice.Office.MsoPatternType
import typingsJapgolly.activexOffice.Office.MsoPresetGradientType
import typingsJapgolly.activexOffice.Office.MsoPresetTexture
import typingsJapgolly.activexOffice.Office.MsoTextureType
import typingsJapgolly.activexOffice.Office.MsoTriState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Excel.ChartFillFormat")
@js.native
class ChartFillFormat protected () extends js.Object {
  val Application: typingsJapgolly.activexExcel.Excel.Application = js.native
  val BackColor: ChartColorFormat = js.native
  val Creator: XlCreator = js.native
  @JSName("Excel.ChartFillFormat_typekey")
  var ExcelDotChartFillFormat_typekey: ChartFillFormat = js.native
  val ForeColor: ChartColorFormat = js.native
  val GradientColorType: MsoGradientColorType = js.native
  val GradientDegree: Double = js.native
  val GradientStyle: MsoGradientStyle = js.native
  val GradientVariant: Double = js.native
  val Parent: js.Any = js.native
  val Pattern: MsoPatternType = js.native
  val PresetGradientType: MsoPresetGradientType = js.native
  val PresetTexture: MsoPresetTexture = js.native
  val TextureName: String = js.native
  val TextureType: MsoTextureType = js.native
  val Type: MsoFillType = js.native
  var Visible: MsoTriState = js.native
  def OneColorGradient(Style: MsoGradientStyle, Variant: Double, Degree: Double): Unit = js.native
  def Patterned(Pattern: MsoPatternType): Unit = js.native
  def PresetGradient(Style: MsoGradientStyle, Variant: Double, PresetGradientType: MsoPresetGradientType): Unit = js.native
  def PresetTextured(PresetTexture: MsoPresetTexture): Unit = js.native
  def Solid(): Unit = js.native
  def TwoColorGradient(Style: MsoGradientStyle, Variant: Double): Unit = js.native
  def UserPicture(): Unit = js.native
  def UserPicture(PictureFile: js.Any): Unit = js.native
  def UserPicture(PictureFile: js.Any, PictureFormat: js.Any): Unit = js.native
  def UserPicture(PictureFile: js.Any, PictureFormat: js.Any, PictureStackUnit: js.Any): Unit = js.native
  def UserPicture(PictureFile: js.Any, PictureFormat: js.Any, PictureStackUnit: js.Any, PicturePlacement: js.Any): Unit = js.native
  def UserTextured(TextureFile: String): Unit = js.native
}

