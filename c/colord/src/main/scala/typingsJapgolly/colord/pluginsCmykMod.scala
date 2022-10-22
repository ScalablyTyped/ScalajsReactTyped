package typingsJapgolly.colord

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.colord.extendMod.Plugin
import typingsJapgolly.colord.typesMod.CmykaColor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pluginsCmykMod extends Shortcut {
  
  /**
    * A plugin adding support for CMYK color space.
    * https://lea.verou.me/2009/03/cmyk-colors-in-css-useful-or-useless/
    * https://en.wikipedia.org/wiki/CMYK_color_model
    */
  @JSImport("colord/plugins/cmyk", JSImport.Default)
  @js.native
  val default: Plugin = js.native
  
  type _To = Plugin
  
  /* This means you don't have to write `default`, but can instead just say `pluginsCmykMod.foo` */
  override def _to: Plugin = default
  
  /* augmented module */
  object colordColordAugmentingMod {
    
    trait Colord extends StObject {
      
      /**
        * Converts a color to CMYK color space and returns an object.
        * https://drafts.csswg.org/css-color/#cmyk-colors
        * https://lea.verou.me/2009/03/cmyk-colors-in-css-useful-or-useless/
        */
      def toCmyk(): CmykaColor
      
      /**
        * Converts a color to CMYK color space and returns a string.
        * https://developer.mozilla.org/en-US/docs/Web/CSS/color_value/device-cmyk()
        */
      def toCmykString(): String
    }
    object Colord {
      
      inline def apply(toCmyk: CallbackTo[CmykaColor], toCmykString: CallbackTo[String]): Colord = {
        val __obj = js.Dynamic.literal(toCmyk = toCmyk.toJsFn, toCmykString = toCmykString.toJsFn)
        __obj.asInstanceOf[Colord]
      }
      
      extension [Self <: Colord](x: Self) {
        
        inline def setToCmyk(value: CallbackTo[CmykaColor]): Self = StObject.set(x, "toCmyk", value.toJsFn)
        
        inline def setToCmykString(value: CallbackTo[String]): Self = StObject.set(x, "toCmykString", value.toJsFn)
      }
    }
  }
}
