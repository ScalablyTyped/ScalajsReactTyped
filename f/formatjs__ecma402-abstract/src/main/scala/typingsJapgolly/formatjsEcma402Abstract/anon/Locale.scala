package typingsJapgolly.formatjsEcma402Abstract.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Locale extends StObject {
  
  var locale: String
}
object Locale {
  
  inline def apply(locale: String): Locale = {
    val __obj = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any])
    __obj.asInstanceOf[Locale]
  }
  
  extension [Self <: Locale](x: Self) {
    
    inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
  }
}
