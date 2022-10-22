package typingsJapgolly.antdMobileRn.anon

import typingsJapgolly.propTypes.mod.Requireable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Locale extends StObject {
  
  var locale: Requireable[js.Object]
}
object Locale {
  
  inline def apply(locale: Requireable[js.Object]): Locale = {
    val __obj = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any])
    __obj.asInstanceOf[Locale]
  }
  
  extension [Self <: Locale](x: Self) {
    
    inline def setLocale(value: Requireable[js.Object]): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
  }
}
