package typingsJapgolly.hexRgb

import typingsJapgolly.hexRgb.hexRgbStrings.`object`
import typingsJapgolly.hexRgb.hexRgbStrings.array
import typingsJapgolly.hexRgb.hexRgbStrings.css
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined hex-rgb.hex-rgb.Options & {  format :'css'} */
  trait Optionsformatcss extends StObject {
    
    /**
    	Set the alpha of the color.
    	This overrides any existing alpha component in the Hex color string. For example, the `99` in `#22222299`.
    	The number must be in the range 0 to 1.
    	*/
    val alpha: js.UndefOr[Double] = js.undefined
    
    /**
    	The RGB output format.
    	Note that when using the `css` format, the value of the alpha channel is rounded to two decimal places.
    	@default 'object'
    	*/
    val format: (js.UndefOr[`object` | array | css]) & css
  }
  object Optionsformatcss {
    
    inline def apply(format: (js.UndefOr[`object` | array | css]) & css): Optionsformatcss = {
      val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any])
      __obj.asInstanceOf[Optionsformatcss]
    }
    
    extension [Self <: Optionsformatcss](x: Self) {
      
      inline def setAlpha(value: Double): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
      
      inline def setAlphaUndefined: Self = StObject.set(x, "alpha", js.undefined)
      
      inline def setFormat(value: (js.UndefOr[`object` | array | css]) & css): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    }
  }
}
