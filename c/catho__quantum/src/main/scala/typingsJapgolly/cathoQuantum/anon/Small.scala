package typingsJapgolly.cathoQuantum.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Small extends StObject {
  
  var small: js.UndefOr[Boolean] = js.undefined
  
  var theme: js.UndefOr[BaseFontSizeSpacing] = js.undefined
}
object Small {
  
  inline def apply(): Small = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Small]
  }
  
  extension [Self <: Small](x: Self) {
    
    inline def setSmall(value: Boolean): Self = StObject.set(x, "small", value.asInstanceOf[js.Any])
    
    inline def setSmallUndefined: Self = StObject.set(x, "small", js.undefined)
    
    inline def setTheme(value: BaseFontSizeSpacing): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
  }
}
