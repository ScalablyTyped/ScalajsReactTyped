package typingsJapgolly.playcanvas.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LightmapFilters extends StObject {
  
  var bZnorm: Any
  
  var constantKernel: Any
  
  var constantPixelOffset: Any
  
  var constantSigmas: Any
  
  var constantTexSource: Any
  
  var device: Any
  
  def evaluateDenoiseUniforms(filterRange: Any, filterSmoothness: Any): Unit
  
  var kernel: Any
  
  var pixelOffset: js.typedarray.Float32Array
  
  def prepare(textureWidth: Any, textureHeight: Any): Unit
  
  def prepareDenoise(filterRange: Any, filterSmoothness: Any): Unit
  
  def setSourceTexture(texture: Any): Unit
  
  var shaderDenoise: Shader
  
  var shaderDilate: Shader
  
  var sigmas: js.typedarray.Float32Array
}
object LightmapFilters {
  
  inline def apply(
    bZnorm: Any,
    constantKernel: Any,
    constantPixelOffset: Any,
    constantSigmas: Any,
    constantTexSource: Any,
    device: Any,
    evaluateDenoiseUniforms: (Any, Any) => Callback,
    kernel: Any,
    pixelOffset: js.typedarray.Float32Array,
    prepare: (Any, Any) => Callback,
    prepareDenoise: (Any, Any) => Callback,
    setSourceTexture: Any => Callback,
    shaderDenoise: Shader,
    shaderDilate: Shader,
    sigmas: js.typedarray.Float32Array
  ): LightmapFilters = {
    val __obj = js.Dynamic.literal(bZnorm = bZnorm.asInstanceOf[js.Any], constantKernel = constantKernel.asInstanceOf[js.Any], constantPixelOffset = constantPixelOffset.asInstanceOf[js.Any], constantSigmas = constantSigmas.asInstanceOf[js.Any], constantTexSource = constantTexSource.asInstanceOf[js.Any], device = device.asInstanceOf[js.Any], evaluateDenoiseUniforms = js.Any.fromFunction2((t0: Any, t1: Any) => (evaluateDenoiseUniforms(t0, t1)).runNow()), kernel = kernel.asInstanceOf[js.Any], pixelOffset = pixelOffset.asInstanceOf[js.Any], prepare = js.Any.fromFunction2((t0: Any, t1: Any) => (prepare(t0, t1)).runNow()), prepareDenoise = js.Any.fromFunction2((t0: Any, t1: Any) => (prepareDenoise(t0, t1)).runNow()), setSourceTexture = js.Any.fromFunction1((t0: Any) => setSourceTexture(t0).runNow()), shaderDenoise = shaderDenoise.asInstanceOf[js.Any], shaderDilate = shaderDilate.asInstanceOf[js.Any], sigmas = sigmas.asInstanceOf[js.Any])
    __obj.asInstanceOf[LightmapFilters]
  }
  
  extension [Self <: LightmapFilters](x: Self) {
    
    inline def setBZnorm(value: Any): Self = StObject.set(x, "bZnorm", value.asInstanceOf[js.Any])
    
    inline def setConstantKernel(value: Any): Self = StObject.set(x, "constantKernel", value.asInstanceOf[js.Any])
    
    inline def setConstantPixelOffset(value: Any): Self = StObject.set(x, "constantPixelOffset", value.asInstanceOf[js.Any])
    
    inline def setConstantSigmas(value: Any): Self = StObject.set(x, "constantSigmas", value.asInstanceOf[js.Any])
    
    inline def setConstantTexSource(value: Any): Self = StObject.set(x, "constantTexSource", value.asInstanceOf[js.Any])
    
    inline def setDevice(value: Any): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
    
    inline def setEvaluateDenoiseUniforms(value: (Any, Any) => Callback): Self = StObject.set(x, "evaluateDenoiseUniforms", js.Any.fromFunction2((t0: Any, t1: Any) => (value(t0, t1)).runNow()))
    
    inline def setKernel(value: Any): Self = StObject.set(x, "kernel", value.asInstanceOf[js.Any])
    
    inline def setPixelOffset(value: js.typedarray.Float32Array): Self = StObject.set(x, "pixelOffset", value.asInstanceOf[js.Any])
    
    inline def setPrepare(value: (Any, Any) => Callback): Self = StObject.set(x, "prepare", js.Any.fromFunction2((t0: Any, t1: Any) => (value(t0, t1)).runNow()))
    
    inline def setPrepareDenoise(value: (Any, Any) => Callback): Self = StObject.set(x, "prepareDenoise", js.Any.fromFunction2((t0: Any, t1: Any) => (value(t0, t1)).runNow()))
    
    inline def setSetSourceTexture(value: Any => Callback): Self = StObject.set(x, "setSourceTexture", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def setShaderDenoise(value: Shader): Self = StObject.set(x, "shaderDenoise", value.asInstanceOf[js.Any])
    
    inline def setShaderDilate(value: Shader): Self = StObject.set(x, "shaderDilate", value.asInstanceOf[js.Any])
    
    inline def setSigmas(value: js.typedarray.Float32Array): Self = StObject.set(x, "sigmas", value.asInstanceOf[js.Any])
  }
}
