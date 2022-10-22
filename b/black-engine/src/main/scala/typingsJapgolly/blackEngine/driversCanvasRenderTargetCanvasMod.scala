package typingsJapgolly.blackEngine

import org.scalajs.dom.CanvasRenderingContext2D
import org.scalajs.dom.HTMLCanvasElement
import typingsJapgolly.blackEngine.driversRenderTargetMod.RenderTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object driversCanvasRenderTargetCanvasMod {
  
  @JSImport("black-engine/drivers/canvas/RenderTargetCanvas", "RenderTargetCanvas")
  @js.native
  open class RenderTargetCanvas protected () extends RenderTarget {
    def this(width: Double, height: Double) = this()
    
    def context: CanvasRenderingContext2D = js.native
    
    /* private */ var mCanvas: Any = js.native
    
    /* private */ var mCtx: Any = js.native
    
    def native: HTMLCanvasElement = js.native
    
    def resize(width: Any, height: Any): Unit = js.native
  }
}
