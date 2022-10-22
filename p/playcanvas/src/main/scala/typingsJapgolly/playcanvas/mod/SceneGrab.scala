package typingsJapgolly.playcanvas.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Internal class abstracting the access to the depth and color texture of the scene.
  * color frame buffer is copied to a texture
  * For webgl 2 devices, the depth buffer is copied to a texture
  * for webgl 1 devices, the scene's depth is rendered to a separate RGBA texture
  *
  * TODO: implement mipmapped color buffer support for WebGL 1 as well, which requires
  * the texture to be a power of two, by first downscaling the captured framebuffer
  * texture to smaller power of 2 texture, and then generate mipmaps and use it for rendering
  * TODO: or even better, implement blur filter to have smoother lower levels
  *
  * @ignore
  */
trait SceneGrab extends StObject {
  
  def allocateRenderTarget(
    renderTarget: Any,
    sourceRenderTarget: Any,
    device: Any,
    format: Any,
    isDepth: Any,
    mipmaps: Any,
    isDepthUniforms: Any
  ): Any
  
  def allocateTexture(device: Any, source: Any, name: Any, format: Any, isDepth: Any, mipmaps: Any): Texture
  
  var application: Any
  
  var colorFormat: Double
  
  /** @type {GraphicsDevice} */
  var device: GraphicsDevice
  
  def initWebGl1(): Unit
  
  def initWebGl2(): Unit
  
  var layer: Layer
  
  def patch(layer: Any): Unit
  
  def releaseRenderTarget(rt: Any): Unit
  
  def resizeCondition(target: Any, source: Any, device: Any): Boolean
  
  def setupUniform(device: Any, depth: Any, buffer: Any): Unit
}
object SceneGrab {
  
  inline def apply(
    allocateRenderTarget: (Any, Any, Any, Any, Any, Any, Any) => Any,
    allocateTexture: (Any, Any, Any, Any, Any, Any) => Texture,
    application: Any,
    colorFormat: Double,
    device: GraphicsDevice,
    initWebGl1: Callback,
    initWebGl2: Callback,
    layer: Layer,
    patch: Any => Callback,
    releaseRenderTarget: Any => Callback,
    resizeCondition: (Any, Any, Any) => Boolean,
    setupUniform: (Any, Any, Any) => Callback
  ): SceneGrab = {
    val __obj = js.Dynamic.literal(allocateRenderTarget = js.Any.fromFunction7(allocateRenderTarget), allocateTexture = js.Any.fromFunction6(allocateTexture), application = application.asInstanceOf[js.Any], colorFormat = colorFormat.asInstanceOf[js.Any], device = device.asInstanceOf[js.Any], initWebGl1 = initWebGl1.toJsFn, initWebGl2 = initWebGl2.toJsFn, layer = layer.asInstanceOf[js.Any], patch = js.Any.fromFunction1((t0: Any) => patch(t0).runNow()), releaseRenderTarget = js.Any.fromFunction1((t0: Any) => releaseRenderTarget(t0).runNow()), resizeCondition = js.Any.fromFunction3(resizeCondition), setupUniform = js.Any.fromFunction3((t0: Any, t1: Any, t2: Any) => (setupUniform(t0, t1, t2)).runNow()))
    __obj.asInstanceOf[SceneGrab]
  }
  
  extension [Self <: SceneGrab](x: Self) {
    
    inline def setAllocateRenderTarget(value: (Any, Any, Any, Any, Any, Any, Any) => Any): Self = StObject.set(x, "allocateRenderTarget", js.Any.fromFunction7(value))
    
    inline def setAllocateTexture(value: (Any, Any, Any, Any, Any, Any) => Texture): Self = StObject.set(x, "allocateTexture", js.Any.fromFunction6(value))
    
    inline def setApplication(value: Any): Self = StObject.set(x, "application", value.asInstanceOf[js.Any])
    
    inline def setColorFormat(value: Double): Self = StObject.set(x, "colorFormat", value.asInstanceOf[js.Any])
    
    inline def setDevice(value: GraphicsDevice): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
    
    inline def setInitWebGl1(value: Callback): Self = StObject.set(x, "initWebGl1", value.toJsFn)
    
    inline def setInitWebGl2(value: Callback): Self = StObject.set(x, "initWebGl2", value.toJsFn)
    
    inline def setLayer(value: Layer): Self = StObject.set(x, "layer", value.asInstanceOf[js.Any])
    
    inline def setPatch(value: Any => Callback): Self = StObject.set(x, "patch", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def setReleaseRenderTarget(value: Any => Callback): Self = StObject.set(x, "releaseRenderTarget", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def setResizeCondition(value: (Any, Any, Any) => Boolean): Self = StObject.set(x, "resizeCondition", js.Any.fromFunction3(value))
    
    inline def setSetupUniform(value: (Any, Any, Any) => Callback): Self = StObject.set(x, "setupUniform", js.Any.fromFunction3((t0: Any, t1: Any, t2: Any) => (value(t0, t1, t2)).runNow()))
  }
}
