package typingsJapgolly.colord

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.colord.extendMod.Plugin
import typingsJapgolly.colord.typesMod.XyzaColor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pluginsXyzMod extends Shortcut {
  
  /**
    * A plugin adding support for CIE XYZ colorspace.
    * Wikipedia: https://en.wikipedia.org/wiki/CIE_1931_color_space
    * Helpful article: https://www.sttmedia.com/colormodel-xyz
    */
  @JSImport("colord/plugins/xyz", JSImport.Default)
  @js.native
  val default: Plugin = js.native
  
  type _To = Plugin
  
  /* This means you don't have to write `default`, but can instead just say `pluginsXyzMod.foo` */
  override def _to: Plugin = default
  
  /* augmented module */
  object colordColordAugmentingMod {
    
    trait Colord extends StObject {
      
      def toXyz(): XyzaColor
    }
    object Colord {
      
      inline def apply(toXyz: CallbackTo[XyzaColor]): Colord = {
        val __obj = js.Dynamic.literal(toXyz = toXyz.toJsFn)
        __obj.asInstanceOf[Colord]
      }
      
      extension [Self <: Colord](x: Self) {
        
        inline def setToXyz(value: CallbackTo[XyzaColor]): Self = StObject.set(x, "toXyz", value.toJsFn)
      }
    }
  }
}
