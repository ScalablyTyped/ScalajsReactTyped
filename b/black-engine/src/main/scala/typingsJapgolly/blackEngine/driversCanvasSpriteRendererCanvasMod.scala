package typingsJapgolly.blackEngine

import org.scalajs.dom.CanvasPattern
import typingsJapgolly.blackEngine.driversRendererMod.Renderer
import typingsJapgolly.blackEngine.texturesCanvasRenderTextureMod.CanvasRenderTexture
import typingsJapgolly.blackEngine.texturesTextureMod.Texture
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object driversCanvasSpriteRendererCanvasMod {
  
  @JSImport("black-engine/drivers/canvas/SpriteRendererCanvas", "SpriteRendererCanvas")
  @js.native
  open class SpriteRendererCanvas () extends Renderer {
    
    var pattern: CanvasPattern | Null = js.native
    
    var patternTexture: Texture | Null = js.native
    
    def preRender(driver: Any, session: Any): Unit = js.native
    
    def render(driver: Any, session: Any): Unit = js.native
    
    def renderSlice9Grid(driver: Any, texture: Any, grid: Any): CanvasRenderTexture = js.native
    
    var sizeHeightCache: Double | Null = js.native
    
    var sizeWidthCache: Double | Null = js.native
    
    var sliceTextureCache: CanvasRenderTexture | Null = js.native
    
    var textureCache: Texture = js.native
  }
}
