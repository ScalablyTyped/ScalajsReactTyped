package typingsJapgolly.expressValidator.srcOptionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsNumericOptions extends StObject {
  
  var locale: js.UndefOr[AlphanumericLocale] = js.undefined
  
  var no_symbols: Boolean
}
object IsNumericOptions {
  
  inline def apply(no_symbols: Boolean): IsNumericOptions = {
    val __obj = js.Dynamic.literal(no_symbols = no_symbols.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsNumericOptions]
  }
  
  extension [Self <: IsNumericOptions](x: Self) {
    
    inline def setLocale(value: AlphanumericLocale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    inline def setNo_symbols(value: Boolean): Self = StObject.set(x, "no_symbols", value.asInstanceOf[js.Any])
  }
}
