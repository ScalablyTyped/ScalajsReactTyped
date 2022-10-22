package typingsJapgolly.detox.mod.global.Detox

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LanguageAndLocale extends StObject {
  
  var language: js.UndefOr[String] = js.undefined
  
  var locale: js.UndefOr[String] = js.undefined
}
object LanguageAndLocale {
  
  inline def apply(): LanguageAndLocale = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LanguageAndLocale]
  }
  
  extension [Self <: LanguageAndLocale](x: Self) {
    
    inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
  }
}
