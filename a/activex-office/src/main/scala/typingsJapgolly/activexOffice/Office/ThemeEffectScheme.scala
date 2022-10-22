package typingsJapgolly.activexOffice.Office

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ThemeEffectScheme extends StObject {
  
  val Application: Any
  
  val Creator: Double
  
  def Load(FileName: String): Unit
  
  /* private */ @JSName("Office.ThemeEffectScheme_typekey")
  var OfficeDotThemeEffectScheme_typekey: ThemeEffectScheme
  
  val Parent: Any
}
object ThemeEffectScheme {
  
  inline def apply(
    Application: Any,
    Creator: Double,
    Load: String => Callback,
    OfficeDotThemeEffectScheme_typekey: ThemeEffectScheme,
    Parent: Any
  ): ThemeEffectScheme = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Load = js.Any.fromFunction1((t0: String) => Load(t0).runNow()), Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Office.ThemeEffectScheme_typekey")(OfficeDotThemeEffectScheme_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThemeEffectScheme]
  }
  
  extension [Self <: ThemeEffectScheme](x: Self) {
    
    inline def setApplication(value: Any): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setLoad(value: String => Callback): Self = StObject.set(x, "Load", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setOfficeDotThemeEffectScheme_typekey(value: ThemeEffectScheme): Self = StObject.set(x, "Office.ThemeEffectScheme_typekey", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
  }
}
