package typingsJapgolly.ol

import typingsJapgolly.ol.colorMod.Color
import typingsJapgolly.ol.colorlikeMod.ColorLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object styleFillMod {
  
  @JSImport("ol/style/Fill", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with Fill {
    def this(opt_options: Options) = this()
  }
  
  @js.native
  trait Fill extends StObject {
    
    /**
      * Get the fill color.
      */
    def getColor(): Color | ColorLike = js.native
    
    /**
      * Set the color.
      */
    def setColor(color: Color): Unit = js.native
    def setColor(color: ColorLike): Unit = js.native
  }
  
  trait Options extends StObject {
    
    var color: js.UndefOr[Color | ColorLike] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setColor(value: Color | ColorLike): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setColorVarargs(value: Double*): Self = StObject.set(x, "color", js.Array(value*))
    }
  }
}
