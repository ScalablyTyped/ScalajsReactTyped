package typingsJapgolly.activexOffice.Office

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ThemeFontScheme extends StObject {
  
  val Application: Any
  
  val Creator: Double
  
  def Load(FileName: String): Unit
  
  def MajorFont(Index: MsoFontLanguageIndex): ThemeFont
  @JSName("MajorFont")
  val MajorFont_Original: ThemeFonts
  
  def MinorFont(Index: MsoFontLanguageIndex): ThemeFont
  @JSName("MinorFont")
  val MinorFont_Original: ThemeFonts
  
  /* private */ @JSName("Office.ThemeFontScheme_typekey")
  var OfficeDotThemeFontScheme_typekey: ThemeFontScheme
  
  val Parent: Any
  
  def Save(FileName: String): Unit
}
object ThemeFontScheme {
  
  inline def apply(
    Application: Any,
    Creator: Double,
    Load: String => Callback,
    MajorFont: ThemeFonts,
    MinorFont: ThemeFonts,
    OfficeDotThemeFontScheme_typekey: ThemeFontScheme,
    Parent: Any,
    Save: String => Callback
  ): ThemeFontScheme = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Load = js.Any.fromFunction1((t0: String) => Load(t0).runNow()), MajorFont = MajorFont.asInstanceOf[js.Any], MinorFont = MinorFont.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Save = js.Any.fromFunction1((t0: String) => Save(t0).runNow()))
    __obj.updateDynamic("Office.ThemeFontScheme_typekey")(OfficeDotThemeFontScheme_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThemeFontScheme]
  }
  
  extension [Self <: ThemeFontScheme](x: Self) {
    
    inline def setApplication(value: Any): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setLoad(value: String => Callback): Self = StObject.set(x, "Load", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setMajorFont(value: ThemeFonts): Self = StObject.set(x, "MajorFont", value.asInstanceOf[js.Any])
    
    inline def setMinorFont(value: ThemeFonts): Self = StObject.set(x, "MinorFont", value.asInstanceOf[js.Any])
    
    inline def setOfficeDotThemeFontScheme_typekey(value: ThemeFontScheme): Self = StObject.set(x, "Office.ThemeFontScheme_typekey", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setSave(value: String => Callback): Self = StObject.set(x, "Save", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
  }
}
