package typingsJapgolly.blackEngine

import org.scalajs.dom.HTMLElement
import typingsJapgolly.blackEngine.coreGameObjectMod.GameObject
import typingsJapgolly.blackEngine.driversRenderSessionMod.RenderSession
import typingsJapgolly.blackEngine.driversRendererMod.Renderer
import typingsJapgolly.blackEngine.driversVideoNullDriverMod.VideoNullDriver
import typingsJapgolly.blackEngine.texturesTextureMod.Texture
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object driversCanvasCanvasDriverMod {
  
  @JSImport("black-engine/drivers/canvas/CanvasDriver", "CanvasDriver")
  @js.native
  open class CanvasDriver protected () extends VideoNullDriver {
    def this(containerElement: HTMLElement, width: Double, height: Double) = this()
    
    /* private */ var __createCanvas: Any = js.native
    
    def beginClip(clipRect: Any, px: Any, py: Any): Unit = js.native
    
    def drawTexture(texture: Any): Unit = js.native
    
    def drawTextureWithOffset(texture: Any, ox: Any, oy: Any): Unit = js.native
    
    def getRenderer(`type`: Any, owner: Any): Any = js.native
    
    def getTextureFromCanvas(canvas: Any): Texture = js.native
    
    /* private */ var mCtx: Any = js.native
    
    def render(gameObject: Any): Unit = js.native
    def render(gameObject: Any, renderTexture: Any): Unit = js.native
    def render(gameObject: Any, renderTexture: Any, customTransform: Any): Unit = js.native
    def render(gameObject: Any, renderTexture: Unit, customTransform: Any): Unit = js.native
    
    def renderObject(child: GameObject, session: RenderSession, parentRenderer: Renderer): Unit = js.native
    
    def setGlobalAlpha(value: Any): Unit = js.native
    
    def setGlobalBlendMode(blendMode: Any): Unit = js.native
    
    def setTransform(transform: Any): Unit = js.native
  }
}
