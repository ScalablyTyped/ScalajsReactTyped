package typingsJapgolly.wixUiCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExternalBaseUrl extends StObject {
  
  var externalBaseUrl: js.UndefOr[String] = js.undefined
  
  var instance: String
  
  var lang: String
  
  var locale: js.UndefOr[String] = js.undefined
}
object ExternalBaseUrl {
  
  inline def apply(instance: String, lang: String): ExternalBaseUrl = {
    val __obj = js.Dynamic.literal(instance = instance.asInstanceOf[js.Any], lang = lang.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExternalBaseUrl]
  }
  
  extension [Self <: ExternalBaseUrl](x: Self) {
    
    inline def setExternalBaseUrl(value: String): Self = StObject.set(x, "externalBaseUrl", value.asInstanceOf[js.Any])
    
    inline def setExternalBaseUrlUndefined: Self = StObject.set(x, "externalBaseUrl", js.undefined)
    
    inline def setInstance(value: String): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
    
    inline def setLang(value: String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
    
    inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
  }
}
