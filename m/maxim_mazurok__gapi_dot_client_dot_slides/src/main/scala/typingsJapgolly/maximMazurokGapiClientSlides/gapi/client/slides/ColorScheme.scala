package typingsJapgolly.maximMazurokGapiClientSlides.gapi.client.slides

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColorScheme extends StObject {
  
  /** The ThemeColorType and corresponding concrete color pairs. */
  var colors: js.UndefOr[js.Array[ThemeColorPair]] = js.undefined
}
object ColorScheme {
  
  inline def apply(): ColorScheme = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColorScheme]
  }
  
  extension [Self <: ColorScheme](x: Self) {
    
    inline def setColors(value: js.Array[ThemeColorPair]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
    
    inline def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
    
    inline def setColorsVarargs(value: ThemeColorPair*): Self = StObject.set(x, "colors", js.Array(value*))
  }
}
