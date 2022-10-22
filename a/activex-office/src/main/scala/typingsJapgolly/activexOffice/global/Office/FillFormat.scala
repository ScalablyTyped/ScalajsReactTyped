package typingsJapgolly.activexOffice.global.Office

import typingsJapgolly.activexOffice.Office.GradientStops
import typingsJapgolly.activexOffice.Office.MsoFillType
import typingsJapgolly.activexOffice.Office.MsoGradientColorType
import typingsJapgolly.activexOffice.Office.MsoGradientStyle
import typingsJapgolly.activexOffice.Office.MsoPatternType
import typingsJapgolly.activexOffice.Office.MsoPresetGradientType
import typingsJapgolly.activexOffice.Office.MsoPresetTexture
import typingsJapgolly.activexOffice.Office.MsoTextureAlignment
import typingsJapgolly.activexOffice.Office.MsoTextureType
import typingsJapgolly.activexOffice.Office.MsoTriState
import typingsJapgolly.activexOffice.Office.PictureEffects
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Office.FillFormat")
@js.native
/* private */ open class FillFormat ()
  extends StObject
     with typingsJapgolly.activexOffice.Office.FillFormat {
  
  /* CompleteClass */
  override val Application: Any = js.native
  
  /* CompleteClass */
  var BackColor: typingsJapgolly.activexOffice.Office.ColorFormat = js.native
  
  /* CompleteClass */
  override def Background(): Unit = js.native
  
  /* CompleteClass */
  override val Creator: Double = js.native
  
  /* CompleteClass */
  var ForeColor: typingsJapgolly.activexOffice.Office.ColorFormat = js.native
  
  /* CompleteClass */
  var GradientAngle: Double = js.native
  
  /* CompleteClass */
  override val GradientColorType: MsoGradientColorType = js.native
  
  /* CompleteClass */
  override val GradientDegree: Double = js.native
  
  /* CompleteClass */
  override def GradientStops(Index: Double): typingsJapgolly.activexOffice.Office.GradientStop = js.native
  /* CompleteClass */
  @JSName("GradientStops")
  override val GradientStops_Original: GradientStops = js.native
  
  /* CompleteClass */
  override val GradientStyle: MsoGradientStyle = js.native
  
  /* CompleteClass */
  override val GradientVariant: Double = js.native
  
  /* private */ /* CompleteClass */
  @JSName("Office.FillFormat_typekey")
  var OfficeDotFillFormat_typekey: typingsJapgolly.activexOffice.Office.FillFormat = js.native
  
  /* CompleteClass */
  override def OneColorGradient(Style: MsoGradientStyle, Variant: Double, Degree: Double): Unit = js.native
  
  /* CompleteClass */
  override val Parent: Any = js.native
  
  /* CompleteClass */
  override val Pattern: MsoPatternType = js.native
  
  /* CompleteClass */
  override def Patterned(Pattern: MsoPatternType): Unit = js.native
  
  /* CompleteClass */
  override def PictureEffects(Index: Double): typingsJapgolly.activexOffice.Office.PictureEffect = js.native
  /* CompleteClass */
  @JSName("PictureEffects")
  override val PictureEffects_Original: PictureEffects = js.native
  
  /* CompleteClass */
  override def PresetGradient(Style: MsoGradientStyle, Variant: Double, PresetGradientType: MsoPresetGradientType): Unit = js.native
  
  /* CompleteClass */
  override val PresetGradientType: MsoPresetGradientType = js.native
  
  /* CompleteClass */
  override val PresetTexture: MsoPresetTexture = js.native
  
  /* CompleteClass */
  override def PresetTextured(PresetTexture: MsoPresetTexture): Unit = js.native
  
  /* CompleteClass */
  var RotateWithObject: MsoTriState = js.native
  
  /* CompleteClass */
  override def Solid(): Unit = js.native
  
  /* CompleteClass */
  var TextureAlignment: MsoTextureAlignment = js.native
  
  /* CompleteClass */
  var TextureHorizontalScale: Double = js.native
  
  /* CompleteClass */
  override val TextureName: String = js.native
  
  /* CompleteClass */
  var TextureOffsetX: Double = js.native
  
  /* CompleteClass */
  var TextureOffsetY: Double = js.native
  
  /* CompleteClass */
  var TextureTile: MsoTriState = js.native
  
  /* CompleteClass */
  override val TextureType: MsoTextureType = js.native
  
  /* CompleteClass */
  var TextureVerticalScale: Double = js.native
  
  /* CompleteClass */
  var Transparency: Double = js.native
  
  /* CompleteClass */
  override def TwoColorGradient(Style: MsoGradientStyle, Variant: Double): Unit = js.native
  
  /* CompleteClass */
  override val Type: MsoFillType = js.native
  
  /* CompleteClass */
  override def UserPicture(PictureFile: String): Unit = js.native
  
  /* CompleteClass */
  override def UserTextured(TextureFile: String): Unit = js.native
  
  /* CompleteClass */
  var Visible: MsoTriState = js.native
}
