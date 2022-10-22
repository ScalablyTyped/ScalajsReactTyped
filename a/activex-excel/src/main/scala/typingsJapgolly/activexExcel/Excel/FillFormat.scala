package typingsJapgolly.activexExcel.Excel

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexOffice.Office.GradientStop
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
import typingsJapgolly.activexOffice.Office.PictureEffect
import typingsJapgolly.activexOffice.Office.PictureEffects
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FillFormat extends StObject {
  
  val Application: Any
  
  var BackColor: ColorFormat
  
  def Background(): Unit
  
  val Creator: Double
  
  /* private */ @JSName("Excel.FillFormat_typekey")
  var ExcelDotFillFormat_typekey: FillFormat
  
  var ForeColor: ColorFormat
  
  var GradientAngle: Double
  
  val GradientColorType: MsoGradientColorType
  
  val GradientDegree: Double
  
  def GradientStops(Index: Double): GradientStop
  @JSName("GradientStops")
  val GradientStops_Original: GradientStops
  
  val GradientStyle: MsoGradientStyle
  
  val GradientVariant: Double
  
  def OneColorGradient(Style: MsoGradientStyle, Variant: Double, Degree: Double): Unit
  
  val Parent: Any
  
  val Pattern: MsoPatternType
  
  def Patterned(Pattern: MsoPatternType): Unit
  
  def PictureEffects(Index: Double): PictureEffect
  @JSName("PictureEffects")
  val PictureEffects_Original: PictureEffects
  
  def PresetGradient(Style: MsoGradientStyle, Variant: Double, PresetGradientType: MsoPresetGradientType): Unit
  
  val PresetGradientType: MsoPresetGradientType
  
  val PresetTexture: MsoPresetTexture
  
  def PresetTextured(PresetTexture: MsoPresetTexture): Unit
  
  var RotateWithObject: MsoTriState
  
  def Solid(): Unit
  
  var TextureAlignment: MsoTextureAlignment
  
  var TextureHorizontalScale: Double
  
  val TextureName: String
  
  var TextureOffsetX: Double
  
  var TextureOffsetY: Double
  
  var TextureTile: MsoTriState
  
  val TextureType: MsoTextureType
  
  var TextureVerticalScale: Double
  
  var Transparency: Double
  
  def TwoColorGradient(Style: MsoGradientStyle, Variant: Double): Unit
  
  val Type: MsoFillType
  
  def UserPicture(PictureFile: String): Unit
  
  def UserTextured(TextureFile: String): Unit
  
  var Visible: MsoTriState
}
object FillFormat {
  
  inline def apply(
    Application: Any,
    BackColor: ColorFormat,
    Background: Callback,
    Creator: Double,
    ExcelDotFillFormat_typekey: FillFormat,
    ForeColor: ColorFormat,
    GradientAngle: Double,
    GradientColorType: MsoGradientColorType,
    GradientDegree: Double,
    GradientStops: GradientStops,
    GradientStyle: MsoGradientStyle,
    GradientVariant: Double,
    OneColorGradient: (MsoGradientStyle, Double, Double) => Callback,
    Parent: Any,
    Pattern: MsoPatternType,
    Patterned: MsoPatternType => Callback,
    PictureEffects: PictureEffects,
    PresetGradient: (MsoGradientStyle, Double, MsoPresetGradientType) => Callback,
    PresetGradientType: MsoPresetGradientType,
    PresetTexture: MsoPresetTexture,
    PresetTextured: MsoPresetTexture => Callback,
    RotateWithObject: MsoTriState,
    Solid: Callback,
    TextureAlignment: MsoTextureAlignment,
    TextureHorizontalScale: Double,
    TextureName: String,
    TextureOffsetX: Double,
    TextureOffsetY: Double,
    TextureTile: MsoTriState,
    TextureType: MsoTextureType,
    TextureVerticalScale: Double,
    Transparency: Double,
    TwoColorGradient: (MsoGradientStyle, Double) => Callback,
    Type: MsoFillType,
    UserPicture: String => Callback,
    UserTextured: String => Callback,
    Visible: MsoTriState
  ): FillFormat = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], BackColor = BackColor.asInstanceOf[js.Any], Background = Background.toJsFn, Creator = Creator.asInstanceOf[js.Any], ForeColor = ForeColor.asInstanceOf[js.Any], GradientAngle = GradientAngle.asInstanceOf[js.Any], GradientColorType = GradientColorType.asInstanceOf[js.Any], GradientDegree = GradientDegree.asInstanceOf[js.Any], GradientStops = GradientStops.asInstanceOf[js.Any], GradientStyle = GradientStyle.asInstanceOf[js.Any], GradientVariant = GradientVariant.asInstanceOf[js.Any], OneColorGradient = js.Any.fromFunction3((t0: MsoGradientStyle, t1: Double, t2: Double) => (OneColorGradient(t0, t1, t2)).runNow()), Parent = Parent.asInstanceOf[js.Any], Pattern = Pattern.asInstanceOf[js.Any], Patterned = js.Any.fromFunction1((t0: MsoPatternType) => Patterned(t0).runNow()), PictureEffects = PictureEffects.asInstanceOf[js.Any], PresetGradient = js.Any.fromFunction3((t0: MsoGradientStyle, t1: Double, t2: MsoPresetGradientType) => (PresetGradient(t0, t1, t2)).runNow()), PresetGradientType = PresetGradientType.asInstanceOf[js.Any], PresetTexture = PresetTexture.asInstanceOf[js.Any], PresetTextured = js.Any.fromFunction1((t0: MsoPresetTexture) => PresetTextured(t0).runNow()), RotateWithObject = RotateWithObject.asInstanceOf[js.Any], Solid = Solid.toJsFn, TextureAlignment = TextureAlignment.asInstanceOf[js.Any], TextureHorizontalScale = TextureHorizontalScale.asInstanceOf[js.Any], TextureName = TextureName.asInstanceOf[js.Any], TextureOffsetX = TextureOffsetX.asInstanceOf[js.Any], TextureOffsetY = TextureOffsetY.asInstanceOf[js.Any], TextureTile = TextureTile.asInstanceOf[js.Any], TextureType = TextureType.asInstanceOf[js.Any], TextureVerticalScale = TextureVerticalScale.asInstanceOf[js.Any], Transparency = Transparency.asInstanceOf[js.Any], TwoColorGradient = js.Any.fromFunction2((t0: MsoGradientStyle, t1: Double) => (TwoColorGradient(t0, t1)).runNow()), Type = Type.asInstanceOf[js.Any], UserPicture = js.Any.fromFunction1((t0: String) => UserPicture(t0).runNow()), UserTextured = js.Any.fromFunction1((t0: String) => UserTextured(t0).runNow()), Visible = Visible.asInstanceOf[js.Any])
    __obj.updateDynamic("Excel.FillFormat_typekey")(ExcelDotFillFormat_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[FillFormat]
  }
  
  extension [Self <: FillFormat](x: Self) {
    
    inline def setApplication(value: Any): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setBackColor(value: ColorFormat): Self = StObject.set(x, "BackColor", value.asInstanceOf[js.Any])
    
    inline def setBackground(value: Callback): Self = StObject.set(x, "Background", value.toJsFn)
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setExcelDotFillFormat_typekey(value: FillFormat): Self = StObject.set(x, "Excel.FillFormat_typekey", value.asInstanceOf[js.Any])
    
    inline def setForeColor(value: ColorFormat): Self = StObject.set(x, "ForeColor", value.asInstanceOf[js.Any])
    
    inline def setGradientAngle(value: Double): Self = StObject.set(x, "GradientAngle", value.asInstanceOf[js.Any])
    
    inline def setGradientColorType(value: MsoGradientColorType): Self = StObject.set(x, "GradientColorType", value.asInstanceOf[js.Any])
    
    inline def setGradientDegree(value: Double): Self = StObject.set(x, "GradientDegree", value.asInstanceOf[js.Any])
    
    inline def setGradientStops(value: GradientStops): Self = StObject.set(x, "GradientStops", value.asInstanceOf[js.Any])
    
    inline def setGradientStyle(value: MsoGradientStyle): Self = StObject.set(x, "GradientStyle", value.asInstanceOf[js.Any])
    
    inline def setGradientVariant(value: Double): Self = StObject.set(x, "GradientVariant", value.asInstanceOf[js.Any])
    
    inline def setOneColorGradient(value: (MsoGradientStyle, Double, Double) => Callback): Self = StObject.set(x, "OneColorGradient", js.Any.fromFunction3((t0: MsoGradientStyle, t1: Double, t2: Double) => (value(t0, t1, t2)).runNow()))
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setPattern(value: MsoPatternType): Self = StObject.set(x, "Pattern", value.asInstanceOf[js.Any])
    
    inline def setPatterned(value: MsoPatternType => Callback): Self = StObject.set(x, "Patterned", js.Any.fromFunction1((t0: MsoPatternType) => value(t0).runNow()))
    
    inline def setPictureEffects(value: PictureEffects): Self = StObject.set(x, "PictureEffects", value.asInstanceOf[js.Any])
    
    inline def setPresetGradient(value: (MsoGradientStyle, Double, MsoPresetGradientType) => Callback): Self = StObject.set(x, "PresetGradient", js.Any.fromFunction3((t0: MsoGradientStyle, t1: Double, t2: MsoPresetGradientType) => (value(t0, t1, t2)).runNow()))
    
    inline def setPresetGradientType(value: MsoPresetGradientType): Self = StObject.set(x, "PresetGradientType", value.asInstanceOf[js.Any])
    
    inline def setPresetTexture(value: MsoPresetTexture): Self = StObject.set(x, "PresetTexture", value.asInstanceOf[js.Any])
    
    inline def setPresetTextured(value: MsoPresetTexture => Callback): Self = StObject.set(x, "PresetTextured", js.Any.fromFunction1((t0: MsoPresetTexture) => value(t0).runNow()))
    
    inline def setRotateWithObject(value: MsoTriState): Self = StObject.set(x, "RotateWithObject", value.asInstanceOf[js.Any])
    
    inline def setSolid(value: Callback): Self = StObject.set(x, "Solid", value.toJsFn)
    
    inline def setTextureAlignment(value: MsoTextureAlignment): Self = StObject.set(x, "TextureAlignment", value.asInstanceOf[js.Any])
    
    inline def setTextureHorizontalScale(value: Double): Self = StObject.set(x, "TextureHorizontalScale", value.asInstanceOf[js.Any])
    
    inline def setTextureName(value: String): Self = StObject.set(x, "TextureName", value.asInstanceOf[js.Any])
    
    inline def setTextureOffsetX(value: Double): Self = StObject.set(x, "TextureOffsetX", value.asInstanceOf[js.Any])
    
    inline def setTextureOffsetY(value: Double): Self = StObject.set(x, "TextureOffsetY", value.asInstanceOf[js.Any])
    
    inline def setTextureTile(value: MsoTriState): Self = StObject.set(x, "TextureTile", value.asInstanceOf[js.Any])
    
    inline def setTextureType(value: MsoTextureType): Self = StObject.set(x, "TextureType", value.asInstanceOf[js.Any])
    
    inline def setTextureVerticalScale(value: Double): Self = StObject.set(x, "TextureVerticalScale", value.asInstanceOf[js.Any])
    
    inline def setTransparency(value: Double): Self = StObject.set(x, "Transparency", value.asInstanceOf[js.Any])
    
    inline def setTwoColorGradient(value: (MsoGradientStyle, Double) => Callback): Self = StObject.set(x, "TwoColorGradient", js.Any.fromFunction2((t0: MsoGradientStyle, t1: Double) => (value(t0, t1)).runNow()))
    
    inline def setType(value: MsoFillType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setUserPicture(value: String => Callback): Self = StObject.set(x, "UserPicture", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setUserTextured(value: String => Callback): Self = StObject.set(x, "UserTextured", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setVisible(value: MsoTriState): Self = StObject.set(x, "Visible", value.asInstanceOf[js.Any])
  }
}
