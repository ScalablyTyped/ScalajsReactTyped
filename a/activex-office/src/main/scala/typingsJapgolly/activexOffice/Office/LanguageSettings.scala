package typingsJapgolly.activexOffice.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LanguageSettings extends StObject {
  
  val Application: Any
  
  val Creator: Double
  
  def LanguageID(Id: MsoAppLanguageID): Double
  
  def LanguagePreferredForEditing(lid: MsoLanguageID): Boolean
  
  /* private */ @JSName("Office.LanguageSettings_typekey")
  var OfficeDotLanguageSettings_typekey: LanguageSettings
  
  val Parent: Any
}
object LanguageSettings {
  
  inline def apply(
    Application: Any,
    Creator: Double,
    LanguageID: MsoAppLanguageID => Double,
    LanguagePreferredForEditing: MsoLanguageID => Boolean,
    OfficeDotLanguageSettings_typekey: LanguageSettings,
    Parent: Any
  ): LanguageSettings = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], LanguageID = js.Any.fromFunction1(LanguageID), LanguagePreferredForEditing = js.Any.fromFunction1(LanguagePreferredForEditing), Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Office.LanguageSettings_typekey")(OfficeDotLanguageSettings_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[LanguageSettings]
  }
  
  extension [Self <: LanguageSettings](x: Self) {
    
    inline def setApplication(value: Any): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setLanguageID(value: MsoAppLanguageID => Double): Self = StObject.set(x, "LanguageID", js.Any.fromFunction1(value))
    
    inline def setLanguagePreferredForEditing(value: MsoLanguageID => Boolean): Self = StObject.set(x, "LanguagePreferredForEditing", js.Any.fromFunction1(value))
    
    inline def setOfficeDotLanguageSettings_typekey(value: LanguageSettings): Self = StObject.set(x, "Office.LanguageSettings_typekey", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
  }
}
