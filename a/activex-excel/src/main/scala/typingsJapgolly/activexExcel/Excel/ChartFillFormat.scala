package typingsJapgolly.activexExcel.Excel

import typingsJapgolly.activexOffice.Office.MsoFillType
import typingsJapgolly.activexOffice.Office.MsoGradientColorType
import typingsJapgolly.activexOffice.Office.MsoGradientStyle
import typingsJapgolly.activexOffice.Office.MsoPatternType
import typingsJapgolly.activexOffice.Office.MsoPresetGradientType
import typingsJapgolly.activexOffice.Office.MsoPresetTexture
import typingsJapgolly.activexOffice.Office.MsoTextureType
import typingsJapgolly.activexOffice.Office.MsoTriState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChartFillFormat extends StObject {
  
  val Application: typingsJapgolly.activexExcel.Excel.Application = js.native
  
  val BackColor: ChartColorFormat = js.native
  
  val Creator: XlCreator = js.native
  
  /* private */ @JSName("Excel.ChartFillFormat_typekey")
  var ExcelDotChartFillFormat_typekey: ChartFillFormat = js.native
  
  val ForeColor: ChartColorFormat = js.native
  
  val GradientColorType: MsoGradientColorType = js.native
  
  val GradientDegree: Double = js.native
  
  val GradientStyle: MsoGradientStyle = js.native
  
  val GradientVariant: Double = js.native
  
  def OneColorGradient(Style: MsoGradientStyle, Variant: Double, Degree: Double): Unit = js.native
  
  val Parent: Any = js.native
  
  val Pattern: MsoPatternType = js.native
  
  def Patterned(Pattern: MsoPatternType): Unit = js.native
  
  def PresetGradient(Style: MsoGradientStyle, Variant: Double, PresetGradientType: MsoPresetGradientType): Unit = js.native
  
  val PresetGradientType: MsoPresetGradientType = js.native
  
  val PresetTexture: MsoPresetTexture = js.native
  
  def PresetTextured(PresetTexture: MsoPresetTexture): Unit = js.native
  
  def Solid(): Unit = js.native
  
  val TextureName: String = js.native
  
  val TextureType: MsoTextureType = js.native
  
  def TwoColorGradient(Style: MsoGradientStyle, Variant: Double): Unit = js.native
  
  val Type: MsoFillType = js.native
  
  def UserPicture(): Unit = js.native
  def UserPicture(PictureFile: Any): Unit = js.native
  def UserPicture(PictureFile: Any, PictureFormat: Any): Unit = js.native
  def UserPicture(PictureFile: Any, PictureFormat: Any, PictureStackUnit: Any): Unit = js.native
  def UserPicture(PictureFile: Any, PictureFormat: Any, PictureStackUnit: Any, PicturePlacement: Any): Unit = js.native
  def UserPicture(PictureFile: Any, PictureFormat: Any, PictureStackUnit: Unit, PicturePlacement: Any): Unit = js.native
  def UserPicture(PictureFile: Any, PictureFormat: Unit, PictureStackUnit: Any): Unit = js.native
  def UserPicture(PictureFile: Any, PictureFormat: Unit, PictureStackUnit: Any, PicturePlacement: Any): Unit = js.native
  def UserPicture(PictureFile: Any, PictureFormat: Unit, PictureStackUnit: Unit, PicturePlacement: Any): Unit = js.native
  def UserPicture(PictureFile: Unit, PictureFormat: Any): Unit = js.native
  def UserPicture(PictureFile: Unit, PictureFormat: Any, PictureStackUnit: Any): Unit = js.native
  def UserPicture(PictureFile: Unit, PictureFormat: Any, PictureStackUnit: Any, PicturePlacement: Any): Unit = js.native
  def UserPicture(PictureFile: Unit, PictureFormat: Any, PictureStackUnit: Unit, PicturePlacement: Any): Unit = js.native
  def UserPicture(PictureFile: Unit, PictureFormat: Unit, PictureStackUnit: Any): Unit = js.native
  def UserPicture(PictureFile: Unit, PictureFormat: Unit, PictureStackUnit: Any, PicturePlacement: Any): Unit = js.native
  def UserPicture(PictureFile: Unit, PictureFormat: Unit, PictureStackUnit: Unit, PicturePlacement: Any): Unit = js.native
  
  def UserTextured(TextureFile: String): Unit = js.native
  
  var Visible: MsoTriState = js.native
}
