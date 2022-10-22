package typingsJapgolly.maximMazurokGapiClientTranslate.gapi.client.translate

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SupportedLanguages extends StObject {
  
  /** A list of supported language responses. This list contains an entry for each language the Translation API supports. */
  var languages: js.UndefOr[js.Array[SupportedLanguage]] = js.undefined
}
object SupportedLanguages {
  
  inline def apply(): SupportedLanguages = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SupportedLanguages]
  }
  
  extension [Self <: SupportedLanguages](x: Self) {
    
    inline def setLanguages(value: js.Array[SupportedLanguage]): Self = StObject.set(x, "languages", value.asInstanceOf[js.Any])
    
    inline def setLanguagesUndefined: Self = StObject.set(x, "languages", js.undefined)
    
    inline def setLanguagesVarargs(value: SupportedLanguage*): Self = StObject.set(x, "languages", js.Array(value*))
  }
}
