package typingsJapgolly.webgpuTypes

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GPUCanvasContext extends StObject {
  
  /**
    * Nominal type branding.
    * https://github.com/microsoft/TypeScript/pull/33038
    * @internal
    */
  val __brand: typingsJapgolly.webgpuTypes.webgpuTypesStrings.GPUCanvasContext
  
  /**
    * The canvas this context was created from.
    */
  val canvas: HTMLCanvasElement | OffscreenCanvas
  
  /**
    * Configures the context for this canvas.
    * This clears the drawing buffer to transparent black (in [$Replace the drawing buffer$]).
    * @param configuration - Desired configuration for the context.
    */
  def configure(configuration: GPUCanvasConfiguration): Unit
  
  /**
    * Get the {@link GPUTexture} that will be composited to the document by the {@link GPUCanvasContext}
    * next.
    * Note: The same {@link GPUTexture} object will be returned by every
    * call to {@link GPUCanvasContext#getCurrentTexture} made within the same frame (i.e. between
    * invocations of "[$update the rendering of the WebGPU canvas$]"), even if that {@link GPUTexture}
    * is destroyed, failed validation, or failed to allocate, **unless** the current texture has
    * been removed (in [$Replace the drawing buffer$]).
    */
  def getCurrentTexture(): GPUTexture
  
  /** @deprecated Use {@link GPU#getPreferredCanvasFormat} instead. */
  def getPreferredFormat(adapter: GPUAdapter): GPUTextureFormat
  
  /**
    * Removes the context configuration. Destroys any textures produced while configured.
    */
  def unconfigure(): Unit
}
object GPUCanvasContext {
  
  inline def apply(
    canvas: HTMLCanvasElement | OffscreenCanvas,
    configure: GPUCanvasConfiguration => Callback,
    getCurrentTexture: CallbackTo[GPUTexture],
    getPreferredFormat: GPUAdapter => GPUTextureFormat,
    unconfigure: Callback
  ): GPUCanvasContext = {
    val __obj = js.Dynamic.literal(__brand = "GPUCanvasContext", canvas = canvas.asInstanceOf[js.Any], configure = js.Any.fromFunction1((t0: GPUCanvasConfiguration) => configure(t0).runNow()), getCurrentTexture = getCurrentTexture.toJsFn, getPreferredFormat = js.Any.fromFunction1(getPreferredFormat), unconfigure = unconfigure.toJsFn)
    __obj.asInstanceOf[GPUCanvasContext]
  }
  
  extension [Self <: GPUCanvasContext](x: Self) {
    
    inline def setCanvas(value: HTMLCanvasElement | OffscreenCanvas): Self = StObject.set(x, "canvas", value.asInstanceOf[js.Any])
    
    inline def setConfigure(value: GPUCanvasConfiguration => Callback): Self = StObject.set(x, "configure", js.Any.fromFunction1((t0: GPUCanvasConfiguration) => value(t0).runNow()))
    
    inline def setGetCurrentTexture(value: CallbackTo[GPUTexture]): Self = StObject.set(x, "getCurrentTexture", value.toJsFn)
    
    inline def setGetPreferredFormat(value: GPUAdapter => GPUTextureFormat): Self = StObject.set(x, "getPreferredFormat", js.Any.fromFunction1(value))
    
    inline def setUnconfigure(value: Callback): Self = StObject.set(x, "unconfigure", value.toJsFn)
    
    inline def set__brand(value: typingsJapgolly.webgpuTypes.webgpuTypesStrings.GPUCanvasContext): Self = StObject.set(x, "__brand", value.asInstanceOf[js.Any])
  }
}
