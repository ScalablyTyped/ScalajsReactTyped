package typingsJapgolly.canvaskitWasm.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebGPUCanvasContext extends StObject {
  
  /**
    * A convenient way to draw multiple frames over the swapchain texture sequence associated with
    * a canvas element. Each call internally constructs a new Surface that targets the current
    * GPUTexture in swapchain.
    *
    * This requires an environment where a global function called requestAnimationFrame is
    * available (e.g. on the web, not on Node). The internally created surface is flushed and
    * destroyed automatically by this wrapper once the `drawFrame` callback returns.
    *
    * Users can call canvasContext.requestAnimationFrame in the callback function to
    * draw multiple frames, e.g. of an animation.
    */
  def requestAnimationFrame(drawFrame: js.Function1[/* _ */ Canvas, Unit]): Unit
}
object WebGPUCanvasContext {
  
  inline def apply(requestAnimationFrame: js.Function1[/* _ */ Canvas, Unit] => Callback): WebGPUCanvasContext = {
    val __obj = js.Dynamic.literal(requestAnimationFrame = js.Any.fromFunction1((t0: js.Function1[/* _ */ Canvas, Unit]) => requestAnimationFrame(t0).runNow()))
    __obj.asInstanceOf[WebGPUCanvasContext]
  }
  
  extension [Self <: WebGPUCanvasContext](x: Self) {
    
    inline def setRequestAnimationFrame(value: js.Function1[/* _ */ Canvas, Unit] => Callback): Self = StObject.set(x, "requestAnimationFrame", js.Any.fromFunction1((t0: js.Function1[/* _ */ Canvas, Unit]) => value(t0).runNow()))
  }
}
