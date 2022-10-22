package typingsJapgolly.activexOffice.Office

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChartFillFormat extends StObject {
  
  val Application: Any
  
  val BackColor: ChartColorFormat
  
  val Creator: Double
  
  val ForeColor: ChartColorFormat
  
  val GradientColorType: Double
  
  val GradientDegree: Double
  
  val GradientStyle: Double
  
  val GradientVariant: Double
  
  /* private */ @JSName("Office.ChartFillFormat_typekey")
  var OfficeDotChartFillFormat_typekey: ChartFillFormat
  
  def OneColorGradient(Style: Double, Variant: Double, Degree: Double): Unit
  
  val Parent: Any
  
  val Pattern: Double
  
  def Patterned(Pattern: Double): Unit
  
  def PresetGradient(Style: Double, Variant: Double, PresetGradientType: Double): Unit
  
  val PresetGradientType: Double
  
  val PresetTexture: Double
  
  def PresetTextured(PresetTexture: Double): Unit
  
  def Solid(): Unit
  
  val TextureName: String
  
  val TextureType: Double
  
  def TwoColorGradient(Style: Double, Variant: Double): Unit
  
  val Type: Double
  
  def UserPicture(PictureFile: String, PictureFormat: Any, PictureStackUnit: Any, PicturePlacement: Any): Unit
  
  def UserTextured(TextureFile: String): Unit
  
  var Visible: Double
}
object ChartFillFormat {
  
  inline def apply(
    Application: Any,
    BackColor: ChartColorFormat,
    Creator: Double,
    ForeColor: ChartColorFormat,
    GradientColorType: Double,
    GradientDegree: Double,
    GradientStyle: Double,
    GradientVariant: Double,
    OfficeDotChartFillFormat_typekey: ChartFillFormat,
    OneColorGradient: (Double, Double, Double) => Callback,
    Parent: Any,
    Pattern: Double,
    Patterned: Double => Callback,
    PresetGradient: (Double, Double, Double) => Callback,
    PresetGradientType: Double,
    PresetTexture: Double,
    PresetTextured: Double => Callback,
    Solid: Callback,
    TextureName: String,
    TextureType: Double,
    TwoColorGradient: (Double, Double) => Callback,
    Type: Double,
    UserPicture: (String, Any, Any, Any) => Callback,
    UserTextured: String => Callback,
    Visible: Double
  ): ChartFillFormat = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], BackColor = BackColor.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], ForeColor = ForeColor.asInstanceOf[js.Any], GradientColorType = GradientColorType.asInstanceOf[js.Any], GradientDegree = GradientDegree.asInstanceOf[js.Any], GradientStyle = GradientStyle.asInstanceOf[js.Any], GradientVariant = GradientVariant.asInstanceOf[js.Any], OneColorGradient = js.Any.fromFunction3((t0: Double, t1: Double, t2: Double) => (OneColorGradient(t0, t1, t2)).runNow()), Parent = Parent.asInstanceOf[js.Any], Pattern = Pattern.asInstanceOf[js.Any], Patterned = js.Any.fromFunction1((t0: Double) => Patterned(t0).runNow()), PresetGradient = js.Any.fromFunction3((t0: Double, t1: Double, t2: Double) => (PresetGradient(t0, t1, t2)).runNow()), PresetGradientType = PresetGradientType.asInstanceOf[js.Any], PresetTexture = PresetTexture.asInstanceOf[js.Any], PresetTextured = js.Any.fromFunction1((t0: Double) => PresetTextured(t0).runNow()), Solid = Solid.toJsFn, TextureName = TextureName.asInstanceOf[js.Any], TextureType = TextureType.asInstanceOf[js.Any], TwoColorGradient = js.Any.fromFunction2((t0: Double, t1: Double) => (TwoColorGradient(t0, t1)).runNow()), Type = Type.asInstanceOf[js.Any], UserPicture = js.Any.fromFunction4((t0: String, t1: Any, t2: Any, t3: Any) => (UserPicture(t0, t1, t2, t3)).runNow()), UserTextured = js.Any.fromFunction1((t0: String) => UserTextured(t0).runNow()), Visible = Visible.asInstanceOf[js.Any])
    __obj.updateDynamic("Office.ChartFillFormat_typekey")(OfficeDotChartFillFormat_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartFillFormat]
  }
  
  extension [Self <: ChartFillFormat](x: Self) {
    
    inline def setApplication(value: Any): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setBackColor(value: ChartColorFormat): Self = StObject.set(x, "BackColor", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setForeColor(value: ChartColorFormat): Self = StObject.set(x, "ForeColor", value.asInstanceOf[js.Any])
    
    inline def setGradientColorType(value: Double): Self = StObject.set(x, "GradientColorType", value.asInstanceOf[js.Any])
    
    inline def setGradientDegree(value: Double): Self = StObject.set(x, "GradientDegree", value.asInstanceOf[js.Any])
    
    inline def setGradientStyle(value: Double): Self = StObject.set(x, "GradientStyle", value.asInstanceOf[js.Any])
    
    inline def setGradientVariant(value: Double): Self = StObject.set(x, "GradientVariant", value.asInstanceOf[js.Any])
    
    inline def setOfficeDotChartFillFormat_typekey(value: ChartFillFormat): Self = StObject.set(x, "Office.ChartFillFormat_typekey", value.asInstanceOf[js.Any])
    
    inline def setOneColorGradient(value: (Double, Double, Double) => Callback): Self = StObject.set(x, "OneColorGradient", js.Any.fromFunction3((t0: Double, t1: Double, t2: Double) => (value(t0, t1, t2)).runNow()))
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setPattern(value: Double): Self = StObject.set(x, "Pattern", value.asInstanceOf[js.Any])
    
    inline def setPatterned(value: Double => Callback): Self = StObject.set(x, "Patterned", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setPresetGradient(value: (Double, Double, Double) => Callback): Self = StObject.set(x, "PresetGradient", js.Any.fromFunction3((t0: Double, t1: Double, t2: Double) => (value(t0, t1, t2)).runNow()))
    
    inline def setPresetGradientType(value: Double): Self = StObject.set(x, "PresetGradientType", value.asInstanceOf[js.Any])
    
    inline def setPresetTexture(value: Double): Self = StObject.set(x, "PresetTexture", value.asInstanceOf[js.Any])
    
    inline def setPresetTextured(value: Double => Callback): Self = StObject.set(x, "PresetTextured", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSolid(value: Callback): Self = StObject.set(x, "Solid", value.toJsFn)
    
    inline def setTextureName(value: String): Self = StObject.set(x, "TextureName", value.asInstanceOf[js.Any])
    
    inline def setTextureType(value: Double): Self = StObject.set(x, "TextureType", value.asInstanceOf[js.Any])
    
    inline def setTwoColorGradient(value: (Double, Double) => Callback): Self = StObject.set(x, "TwoColorGradient", js.Any.fromFunction2((t0: Double, t1: Double) => (value(t0, t1)).runNow()))
    
    inline def setType(value: Double): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setUserPicture(value: (String, Any, Any, Any) => Callback): Self = StObject.set(x, "UserPicture", js.Any.fromFunction4((t0: String, t1: Any, t2: Any, t3: Any) => (value(t0, t1, t2, t3)).runNow()))
    
    inline def setUserTextured(value: String => Callback): Self = StObject.set(x, "UserTextured", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setVisible(value: Double): Self = StObject.set(x, "Visible", value.asInstanceOf[js.Any])
  }
}
