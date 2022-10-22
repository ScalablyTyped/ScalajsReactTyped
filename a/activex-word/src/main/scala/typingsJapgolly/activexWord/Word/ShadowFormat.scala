package typingsJapgolly.activexWord.Word

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexOffice.Office.MsoShadowStyle
import typingsJapgolly.activexOffice.Office.MsoShadowType
import typingsJapgolly.activexOffice.Office.MsoTriState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShadowFormat extends StObject {
  
  val Application: typingsJapgolly.activexWord.Word.Application
  
  var Blur: Double
  
  val Creator: Double
  
  val ForeColor: ColorFormat
  
  def IncrementOffsetX(Increment: Double): Unit
  
  def IncrementOffsetY(Increment: Double): Unit
  
  var Obscured: MsoTriState
  
  var OffsetX: Double
  
  var OffsetY: Double
  
  val Parent: Any
  
  var RotateWithShape: MsoTriState
  
  var Size: Double
  
  var Style: MsoShadowStyle
  
  var Transparency: Double
  
  var Type: MsoShadowType
  
  var Visible: MsoTriState
  
  /* private */ @JSName("Word.ShadowFormat_typekey")
  var WordDotShadowFormat_typekey: ShadowFormat
}
object ShadowFormat {
  
  inline def apply(
    Application: Application,
    Blur: Double,
    Creator: Double,
    ForeColor: ColorFormat,
    IncrementOffsetX: Double => Callback,
    IncrementOffsetY: Double => Callback,
    Obscured: MsoTriState,
    OffsetX: Double,
    OffsetY: Double,
    Parent: Any,
    RotateWithShape: MsoTriState,
    Size: Double,
    Style: MsoShadowStyle,
    Transparency: Double,
    Type: MsoShadowType,
    Visible: MsoTriState,
    WordDotShadowFormat_typekey: ShadowFormat
  ): ShadowFormat = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Blur = Blur.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], ForeColor = ForeColor.asInstanceOf[js.Any], IncrementOffsetX = js.Any.fromFunction1((t0: Double) => IncrementOffsetX(t0).runNow()), IncrementOffsetY = js.Any.fromFunction1((t0: Double) => IncrementOffsetY(t0).runNow()), Obscured = Obscured.asInstanceOf[js.Any], OffsetX = OffsetX.asInstanceOf[js.Any], OffsetY = OffsetY.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], RotateWithShape = RotateWithShape.asInstanceOf[js.Any], Size = Size.asInstanceOf[js.Any], Style = Style.asInstanceOf[js.Any], Transparency = Transparency.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], Visible = Visible.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.ShadowFormat_typekey")(WordDotShadowFormat_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShadowFormat]
  }
  
  extension [Self <: ShadowFormat](x: Self) {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setBlur(value: Double): Self = StObject.set(x, "Blur", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setForeColor(value: ColorFormat): Self = StObject.set(x, "ForeColor", value.asInstanceOf[js.Any])
    
    inline def setIncrementOffsetX(value: Double => Callback): Self = StObject.set(x, "IncrementOffsetX", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setIncrementOffsetY(value: Double => Callback): Self = StObject.set(x, "IncrementOffsetY", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setObscured(value: MsoTriState): Self = StObject.set(x, "Obscured", value.asInstanceOf[js.Any])
    
    inline def setOffsetX(value: Double): Self = StObject.set(x, "OffsetX", value.asInstanceOf[js.Any])
    
    inline def setOffsetY(value: Double): Self = StObject.set(x, "OffsetY", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setRotateWithShape(value: MsoTriState): Self = StObject.set(x, "RotateWithShape", value.asInstanceOf[js.Any])
    
    inline def setSize(value: Double): Self = StObject.set(x, "Size", value.asInstanceOf[js.Any])
    
    inline def setStyle(value: MsoShadowStyle): Self = StObject.set(x, "Style", value.asInstanceOf[js.Any])
    
    inline def setTransparency(value: Double): Self = StObject.set(x, "Transparency", value.asInstanceOf[js.Any])
    
    inline def setType(value: MsoShadowType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setVisible(value: MsoTriState): Self = StObject.set(x, "Visible", value.asInstanceOf[js.Any])
    
    inline def setWordDotShadowFormat_typekey(value: ShadowFormat): Self = StObject.set(x, "Word.ShadowFormat_typekey", value.asInstanceOf[js.Any])
  }
}
