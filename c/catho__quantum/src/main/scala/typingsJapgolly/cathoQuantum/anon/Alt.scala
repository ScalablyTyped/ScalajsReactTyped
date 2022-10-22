package typingsJapgolly.cathoQuantum.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Alt extends StObject {
  
  var alt: String
  
  var rounded: js.UndefOr[Boolean] = js.undefined
  
  var src: String
  
  var theme: js.UndefOr[`8`] = js.undefined
}
object Alt {
  
  inline def apply(alt: String, src: String): Alt = {
    val __obj = js.Dynamic.literal(alt = alt.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any])
    __obj.asInstanceOf[Alt]
  }
  
  extension [Self <: Alt](x: Self) {
    
    inline def setAlt(value: String): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
    
    inline def setRounded(value: Boolean): Self = StObject.set(x, "rounded", value.asInstanceOf[js.Any])
    
    inline def setRoundedUndefined: Self = StObject.set(x, "rounded", js.undefined)
    
    inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    
    inline def setTheme(value: `8`): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
  }
}
