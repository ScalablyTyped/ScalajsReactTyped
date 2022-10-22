package typingsJapgolly.blackEngine

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.HTMLCanvasElement
import org.scalajs.dom.HTMLElement
import typingsJapgolly.blackEngine.coreGameObjectMod.GameObject
import typingsJapgolly.blackEngine.driversBlendModeMod.BlendMode
import typingsJapgolly.blackEngine.driversRenderSessionMod.RenderSession
import typingsJapgolly.blackEngine.driversRendererMod.Renderer
import typingsJapgolly.blackEngine.geomMatrixMod.Matrix
import typingsJapgolly.blackEngine.geomRectangleMod.Rectangle
import typingsJapgolly.blackEngine.messagesMessageMod.Message
import typingsJapgolly.blackEngine.texturesCanvasRenderTextureMod.CanvasRenderTexture
import typingsJapgolly.blackEngine.texturesTextureMod.Texture
import typingsJapgolly.blackEngine.utilsObjectPoolMod.ObjectPool
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object driversVideoNullDriverMod {
  
  @JSImport("black-engine/drivers/VideoNullDriver", "VideoNullDriver")
  @js.native
  open class VideoNullDriver protected () extends StObject {
    def this(containerElement: HTMLElement, width: Double, height: Double) = this()
    
    /* protected */ def __collectParentRenderables(session: RenderSession, gameObject: GameObject, parentRenderer: Renderer): Unit = js.native
    
    /* protected */ def __onResize(msg: Message, rect: Rectangle): Unit = js.native
    
    /* private */ var __restoreSession: Any = js.native
    
    /* private */ var __saveSession: Any = js.native
    
    /* protected */ def beginClip(clipRect: Rectangle, px: Double, py: Double): Unit = js.native
    
    /* protected */ def beginFrame(): Unit = js.native
    
    /* protected */ def clear(): Unit = js.native
    
    def context: Any = js.native
    
    def dispose(): Unit = js.native
    
    def drawTexture(texture: Texture): Unit = js.native
    
    def drawTextureWithOffset(texture: Texture, ox: Double, oy: Double): Unit = js.native
    
    /* protected */ def endClip(): Unit = js.native
    
    /* protected */ def endFrame(): Unit = js.native
    
    /* protected */ def getGlobalAlpha(): Double = js.native
    
    def getGlobalBlendMode(): BlendMode | Null = js.native
    
    def getRenderer(`type`: String, owner: GameObject): Renderer = js.native
    
    def getTextureFromCanvas(canvas: HTMLCanvasElement): Texture = js.native
    
    /* protected */ var mActiveSession: RenderSession = js.native
    
    /* protected */ var mClientHeight: Double = js.native
    
    /* protected */ var mClientWidth: Double = js.native
    
    /* protected */ var mContainerElement: HTMLElement = js.native
    
    /* protected */ var mDevicePixelRatio: Double = js.native
    
    /* protected */ var mGlobalAlpha: Double = js.native
    
    /* protected */ var mGlobalBlendMode: BlendMode | Null = js.native
    
    /* protected */ var mIdentityMatrix: Matrix = js.native
    
    /* protected */ var mLastRenderTexture: Any = js.native
    
    /* protected */ var mRendererMap: StringDictionary[Instantiable0[Renderer]] = js.native
    
    /* protected */ var mSessions: js.Array[RenderSession] = js.native
    
    /* protected */ var mSnapToPixels: Boolean = js.native
    
    /* protected */ var mStageRenderer: Renderer = js.native
    
    /* protected */ var mTransform: Matrix = js.native
    
    def render(gameObject: GameObject): Unit = js.native
    def render(gameObject: GameObject, renderTexture: Unit, customTransform: Matrix): Unit = js.native
    def render(gameObject: GameObject, renderTexture: CanvasRenderTexture): Unit = js.native
    def render(gameObject: GameObject, renderTexture: CanvasRenderTexture, customTransform: Matrix): Unit = js.native
    
    def renderScaleFactor: Double = js.native
    
    def setGlobalAlpha(value: Double): Unit = js.native
    
    def setGlobalBlendMode(): Unit = js.native
    def setGlobalBlendMode(value: BlendMode): Unit = js.native
    
    def setSnapToPixels(value: Boolean): Unit = js.native
    
    def setTransform(m: Matrix): Unit = js.native
    
    /* protected */ def start(): Unit = js.native
  }
  object VideoNullDriver {
    
    @JSImport("black-engine/drivers/VideoNullDriver", "VideoNullDriver.sessionPool")
    @js.native
    val sessionPool: ObjectPool = js.native
  }
}
