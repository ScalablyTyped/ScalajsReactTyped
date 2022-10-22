package typingsJapgolly.blackEngine

import typingsJapgolly.blackEngine.driversRendererMod.Renderer
import typingsJapgolly.blackEngine.texturesTextureMod.Texture
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object driversBitmapTextRendererMod {
  
  @JSImport("black-engine/drivers/BitmapTextRenderer", "BitmapTextRenderer")
  @js.native
  open class BitmapTextRenderer () extends Renderer {
    
    /* private */ var mCanvas: Any = js.native
    
    /* private */ var mContext: Any = js.native
    
    def render(driver: Any, session: Any): Unit = js.native
    
    var texture: Texture | Null = js.native
  }
}
