package typingsJapgolly.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ILanguage extends StObject {
  
  val ID: Double
  
  var LanguageCode: String
  
  var Name: String
}
object ILanguage {
  
  inline def apply(ID: Double, LanguageCode: String, Name: String): ILanguage = {
    val __obj = js.Dynamic.literal(ID = ID.asInstanceOf[js.Any], LanguageCode = LanguageCode.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILanguage]
  }
  
  extension [Self <: ILanguage](x: Self) {
    
    inline def setID(value: Double): Self = StObject.set(x, "ID", value.asInstanceOf[js.Any])
    
    inline def setLanguageCode(value: String): Self = StObject.set(x, "LanguageCode", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
