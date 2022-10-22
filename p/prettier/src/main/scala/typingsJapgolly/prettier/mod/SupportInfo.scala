package typingsJapgolly.prettier.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SupportInfo extends StObject {
  
  var languages: js.Array[SupportLanguage]
  
  var options: js.Array[SupportOption]
}
object SupportInfo {
  
  inline def apply(languages: js.Array[SupportLanguage], options: js.Array[SupportOption]): SupportInfo = {
    val __obj = js.Dynamic.literal(languages = languages.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[SupportInfo]
  }
  
  extension [Self <: SupportInfo](x: Self) {
    
    inline def setLanguages(value: js.Array[SupportLanguage]): Self = StObject.set(x, "languages", value.asInstanceOf[js.Any])
    
    inline def setLanguagesVarargs(value: SupportLanguage*): Self = StObject.set(x, "languages", js.Array(value*))
    
    inline def setOptions(value: js.Array[SupportOption]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsVarargs(value: SupportOption*): Self = StObject.set(x, "options", js.Array(value*))
  }
}
