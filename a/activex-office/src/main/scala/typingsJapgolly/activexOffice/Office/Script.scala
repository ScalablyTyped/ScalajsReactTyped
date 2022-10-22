package typingsJapgolly.activexOffice.Office

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Script extends StObject {
  
  val Application: Any
  
  val Creator: Double
  
  def Delete(): Unit
  
  var Extended: String
  
  var Id: String
  
  var Language: MsoScriptLanguage
  
  val Location: MsoScriptLocation
  
  /* private */ @JSName("Office.Script_typekey")
  var OfficeDotScript_typekey: Script
  
  val Parent: Any
  
  var ScriptText: String
  
  val Shape: Any
}
object Script {
  
  inline def apply(
    Application: Any,
    Creator: Double,
    Delete: Callback,
    Extended: String,
    Id: String,
    Language: MsoScriptLanguage,
    Location: MsoScriptLocation,
    OfficeDotScript_typekey: Script,
    Parent: Any,
    ScriptText: String,
    Shape: Any
  ): Script = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Delete = Delete.toJsFn, Extended = Extended.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], Language = Language.asInstanceOf[js.Any], Location = Location.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], ScriptText = ScriptText.asInstanceOf[js.Any], Shape = Shape.asInstanceOf[js.Any])
    __obj.updateDynamic("Office.Script_typekey")(OfficeDotScript_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Script]
  }
  
  extension [Self <: Script](x: Self) {
    
    inline def setApplication(value: Any): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setDelete(value: Callback): Self = StObject.set(x, "Delete", value.toJsFn)
    
    inline def setExtended(value: String): Self = StObject.set(x, "Extended", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setLanguage(value: MsoScriptLanguage): Self = StObject.set(x, "Language", value.asInstanceOf[js.Any])
    
    inline def setLocation(value: MsoScriptLocation): Self = StObject.set(x, "Location", value.asInstanceOf[js.Any])
    
    inline def setOfficeDotScript_typekey(value: Script): Self = StObject.set(x, "Office.Script_typekey", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setScriptText(value: String): Self = StObject.set(x, "ScriptText", value.asInstanceOf[js.Any])
    
    inline def setShape(value: Any): Self = StObject.set(x, "Shape", value.asInstanceOf[js.Any])
  }
}
