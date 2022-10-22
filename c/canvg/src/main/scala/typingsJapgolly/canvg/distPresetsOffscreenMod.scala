package typingsJapgolly.canvg

import typingsJapgolly.canvg.anon.CreateImage
import typingsJapgolly.canvg.distPresetsTypesMod.DOMParser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distPresetsOffscreenMod {
  
  @JSImport("canvg/dist/presets/offscreen", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def offscreen(): CreateImage = ^.asInstanceOf[js.Dynamic].applyDynamic("offscreen")().asInstanceOf[CreateImage]
  inline def offscreen(hasDOMParserFallback: IConfig): CreateImage = ^.asInstanceOf[js.Dynamic].applyDynamic("offscreen")(hasDOMParserFallback.asInstanceOf[js.Any]).asInstanceOf[CreateImage]
  
  trait IConfig extends StObject {
    
    /**
      * XML/HTML parser from string into DOM Document.
      */
    var DOMParser: js.UndefOr[typingsJapgolly.canvg.distPresetsTypesMod.DOMParser] = js.undefined
  }
  object IConfig {
    
    inline def apply(): IConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IConfig]
    }
    
    extension [Self <: IConfig](x: Self) {
      
      inline def setDOMParser(value: DOMParser): Self = StObject.set(x, "DOMParser", value.asInstanceOf[js.Any])
      
      inline def setDOMParserUndefined: Self = StObject.set(x, "DOMParser", js.undefined)
    }
  }
}
