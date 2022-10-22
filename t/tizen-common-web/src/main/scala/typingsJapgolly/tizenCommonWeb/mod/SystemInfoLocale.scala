package typingsJapgolly.tizenCommonWeb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SystemInfoLocale
  extends StObject
     with SystemInfoProperty {
  
  /**
    * Indicates the current country setting in the (LANGUAGE)\_(REGION) syntax.
    *
    * The language setting is in the ISO 639-2 format and the region setting is in the ISO 3166-1 alpha-2 format.
    * The country setting is case-sensitive.
    */
  val country: String
  
  /**
    * Indicates the current language setting in the (LANGUAGE)\_(REGION) syntax.
    *
    * The language setting is in the ISO 639-2 format and the region setting is in the ISO 3166-1 alpha-2 format.
    * The language setting is case-sensitive.
    */
  val language: String
}
object SystemInfoLocale {
  
  inline def apply(country: String, language: String): SystemInfoLocale = {
    val __obj = js.Dynamic.literal(country = country.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any])
    __obj.asInstanceOf[SystemInfoLocale]
  }
  
  extension [Self <: SystemInfoLocale](x: Self) {
    
    inline def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
    
    inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
  }
}
