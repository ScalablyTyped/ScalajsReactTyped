package typingsJapgolly.antvGCanvas

import org.scalajs.dom.CanvasRenderingContext2D
import org.scalajs.dom.DOMRect
import typingsJapgolly.antvGCanvas.anon.PartialDataURLOptions
import typingsJapgolly.antvGLite.distServicesContextServiceMod.ContextService
import typingsJapgolly.antvGLite.distTypesMod.CanvasConfig
import typingsJapgolly.antvGLite.distTypesMod.CanvasLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCanvas2DContextServiceMod {
  
  @JSImport("@antv/g-canvas/dist/Canvas2DContextService", "Canvas2DContextService")
  @js.native
  open class Canvas2DContextService protected ()
    extends StObject
       with ContextService[CanvasRenderingContext2D] {
    def this(canvasConfig: CanvasConfig) = this()
    
    /* private */ @JSName("$canvas")
    var $canvas: Any = js.native
    
    /* private */ @JSName("$container")
    var $container: Any = js.native
    
    /* CompleteClass */
    override def applyCursorStyle(cursor: String): Unit = js.native
    
    /* private */ var canvasConfig: Any = js.native
    
    /* private */ var context: Any = js.native
    
    /* CompleteClass */
    override def destroy(): Unit = js.native
    
    /* private */ var dpr: Any = js.native
    
    /* CompleteClass */
    override def getBoundingClientRect(): js.UndefOr[DOMRect] = js.native
    
    /* CompleteClass */
    override def getContext(): CanvasRenderingContext2D | Null = js.native
    
    /* CompleteClass */
    override def getDPR(): Double = js.native
    
    /* CompleteClass */
    override def getDomElement(): CanvasLike | Null = js.native
    
    /* CompleteClass */
    override def init(): js.Promise[Unit] = js.native
    
    /* CompleteClass */
    override def resize(width: Double, height: Double): Unit = js.native
    
    def toDataURL(): js.Promise[String] = js.native
    def toDataURL(options: PartialDataURLOptions): js.Promise[String] = js.native
    /* CompleteClass */
    override def toDataURL(options: typingsJapgolly.antvGLite.anon.PartialDataURLOptions): js.Promise[String] = js.native
  }
}
