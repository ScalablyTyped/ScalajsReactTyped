package typingsJapgolly.antvGLite

import org.scalajs.dom.CanvasRenderingContext2D
import typingsJapgolly.antvGLite.distTypesMod.CanvasLike
import typingsJapgolly.offscreencanvas.OffscreenCanvasRenderingContext2D
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distServicesOffscreenCanvasCreatorMod {
  
  @JSImport("@antv/g-lite/dist/services/OffscreenCanvasCreator", "OffscreenCanvasCreator")
  @js.native
  open class OffscreenCanvasCreator () extends StObject {
    
    /* private */ var canvas: Any = js.native
    
    /* private */ var context: Any = js.native
    
    def getOrCreateCanvas(offscreenCanvas: CanvasLike): CanvasLike = js.native
    
    def getOrCreateContext(offscreenCanvas: CanvasLike): CanvasRenderingContext2D | OffscreenCanvasRenderingContext2D = js.native
  }
}
