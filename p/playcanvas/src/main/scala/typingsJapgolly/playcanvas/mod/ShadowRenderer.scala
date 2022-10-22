package typingsJapgolly.playcanvas.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @ignore
  */
trait ShadowRenderer extends StObject {
  
  def applyVsmBlur(light: Any, camera: Any): Unit
  
  var blurPackedVsmShader: js.Array[js.Object]
  
  var blurPackedVsmShaderCode: js.Array[String]
  
  var blurVsmShader: js.Array[js.Object]
  
  var blurVsmShaderCode: js.Array[Any]
  
  def cullDirectional(light: Any, drawCalls: Any, camera: Any): Unit
  
  def cullLocal(light: Any, drawCalls: Any): Unit
  
  def cullShadowCasters(meshInstances: Any, visible: Any, camera: Any): Unit
  
  def destroy(): Unit
  
  var device: GraphicsDevice
  
  def dispatchUniforms(light: Any, shadowCam: Any, lightRenderData: Any, face: Any): Unit
  
  /** @type {ForwardRenderer} */
  var forwardRenderer: ForwardRenderer
  
  def generateSplitDistances(light: Any, nearDist: Any, farDist: Any): Unit
  
  def getVsmBlurShader(isVsm8: Any, blurMode: Any, filterSize: Any): Any
  
  /** @type {LightTextureAtlas} */
  var lightTextureAtlas: LightTextureAtlas
  
  var pixelOffsetId: ScopeId
  
  var polygonOffset: js.typedarray.Float32Array
  
  var polygonOffsetId: ScopeId
  
  def render(light: Any, camera: Any): Unit
  
  def restoreRenderState(device: Any): Unit
  
  def setupRenderState(device: Any, light: Any): Unit
  
  var shadowMapCache: ShadowMapCache
  
  var shadowMapLightRadiusId: ScopeId
  
  var sourceId: ScopeId
  
  /**
    * @param {MeshInstance[]} visibleCasters - Visible mesh instances.
    * @param {Light} light - The light.
    */
  def submitCasters(visibleCasters: js.Array[MeshInstance], light: Light): Unit
  
  var weightId: ScopeId
}
object ShadowRenderer {
  
  inline def apply(
    applyVsmBlur: (Any, Any) => Callback,
    blurPackedVsmShader: js.Array[js.Object],
    blurPackedVsmShaderCode: js.Array[String],
    blurVsmShader: js.Array[js.Object],
    blurVsmShaderCode: js.Array[Any],
    cullDirectional: (Any, Any, Any) => Callback,
    cullLocal: (Any, Any) => Callback,
    cullShadowCasters: (Any, Any, Any) => Callback,
    destroy: Callback,
    device: GraphicsDevice,
    dispatchUniforms: (Any, Any, Any, Any) => Callback,
    forwardRenderer: ForwardRenderer,
    generateSplitDistances: (Any, Any, Any) => Callback,
    getVsmBlurShader: (Any, Any, Any) => Any,
    lightTextureAtlas: LightTextureAtlas,
    pixelOffsetId: ScopeId,
    polygonOffset: js.typedarray.Float32Array,
    polygonOffsetId: ScopeId,
    render: (Any, Any) => Callback,
    restoreRenderState: Any => Callback,
    setupRenderState: (Any, Any) => Callback,
    shadowMapCache: ShadowMapCache,
    shadowMapLightRadiusId: ScopeId,
    sourceId: ScopeId,
    submitCasters: (js.Array[MeshInstance], Light) => Callback,
    weightId: ScopeId
  ): ShadowRenderer = {
    val __obj = js.Dynamic.literal(applyVsmBlur = js.Any.fromFunction2((t0: Any, t1: Any) => (applyVsmBlur(t0, t1)).runNow()), blurPackedVsmShader = blurPackedVsmShader.asInstanceOf[js.Any], blurPackedVsmShaderCode = blurPackedVsmShaderCode.asInstanceOf[js.Any], blurVsmShader = blurVsmShader.asInstanceOf[js.Any], blurVsmShaderCode = blurVsmShaderCode.asInstanceOf[js.Any], cullDirectional = js.Any.fromFunction3((t0: Any, t1: Any, t2: Any) => (cullDirectional(t0, t1, t2)).runNow()), cullLocal = js.Any.fromFunction2((t0: Any, t1: Any) => (cullLocal(t0, t1)).runNow()), cullShadowCasters = js.Any.fromFunction3((t0: Any, t1: Any, t2: Any) => (cullShadowCasters(t0, t1, t2)).runNow()), destroy = destroy.toJsFn, device = device.asInstanceOf[js.Any], dispatchUniforms = js.Any.fromFunction4((t0: Any, t1: Any, t2: Any, t3: Any) => (dispatchUniforms(t0, t1, t2, t3)).runNow()), forwardRenderer = forwardRenderer.asInstanceOf[js.Any], generateSplitDistances = js.Any.fromFunction3((t0: Any, t1: Any, t2: Any) => (generateSplitDistances(t0, t1, t2)).runNow()), getVsmBlurShader = js.Any.fromFunction3(getVsmBlurShader), lightTextureAtlas = lightTextureAtlas.asInstanceOf[js.Any], pixelOffsetId = pixelOffsetId.asInstanceOf[js.Any], polygonOffset = polygonOffset.asInstanceOf[js.Any], polygonOffsetId = polygonOffsetId.asInstanceOf[js.Any], render = js.Any.fromFunction2((t0: Any, t1: Any) => (render(t0, t1)).runNow()), restoreRenderState = js.Any.fromFunction1((t0: Any) => restoreRenderState(t0).runNow()), setupRenderState = js.Any.fromFunction2((t0: Any, t1: Any) => (setupRenderState(t0, t1)).runNow()), shadowMapCache = shadowMapCache.asInstanceOf[js.Any], shadowMapLightRadiusId = shadowMapLightRadiusId.asInstanceOf[js.Any], sourceId = sourceId.asInstanceOf[js.Any], submitCasters = js.Any.fromFunction2((t0: js.Array[MeshInstance], t1: Light) => (submitCasters(t0, t1)).runNow()), weightId = weightId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShadowRenderer]
  }
  
  extension [Self <: ShadowRenderer](x: Self) {
    
    inline def setApplyVsmBlur(value: (Any, Any) => Callback): Self = StObject.set(x, "applyVsmBlur", js.Any.fromFunction2((t0: Any, t1: Any) => (value(t0, t1)).runNow()))
    
    inline def setBlurPackedVsmShader(value: js.Array[js.Object]): Self = StObject.set(x, "blurPackedVsmShader", value.asInstanceOf[js.Any])
    
    inline def setBlurPackedVsmShaderCode(value: js.Array[String]): Self = StObject.set(x, "blurPackedVsmShaderCode", value.asInstanceOf[js.Any])
    
    inline def setBlurPackedVsmShaderCodeVarargs(value: String*): Self = StObject.set(x, "blurPackedVsmShaderCode", js.Array(value*))
    
    inline def setBlurPackedVsmShaderVarargs(value: js.Object*): Self = StObject.set(x, "blurPackedVsmShader", js.Array(value*))
    
    inline def setBlurVsmShader(value: js.Array[js.Object]): Self = StObject.set(x, "blurVsmShader", value.asInstanceOf[js.Any])
    
    inline def setBlurVsmShaderCode(value: js.Array[Any]): Self = StObject.set(x, "blurVsmShaderCode", value.asInstanceOf[js.Any])
    
    inline def setBlurVsmShaderCodeVarargs(value: Any*): Self = StObject.set(x, "blurVsmShaderCode", js.Array(value*))
    
    inline def setBlurVsmShaderVarargs(value: js.Object*): Self = StObject.set(x, "blurVsmShader", js.Array(value*))
    
    inline def setCullDirectional(value: (Any, Any, Any) => Callback): Self = StObject.set(x, "cullDirectional", js.Any.fromFunction3((t0: Any, t1: Any, t2: Any) => (value(t0, t1, t2)).runNow()))
    
    inline def setCullLocal(value: (Any, Any) => Callback): Self = StObject.set(x, "cullLocal", js.Any.fromFunction2((t0: Any, t1: Any) => (value(t0, t1)).runNow()))
    
    inline def setCullShadowCasters(value: (Any, Any, Any) => Callback): Self = StObject.set(x, "cullShadowCasters", js.Any.fromFunction3((t0: Any, t1: Any, t2: Any) => (value(t0, t1, t2)).runNow()))
    
    inline def setDestroy(value: Callback): Self = StObject.set(x, "destroy", value.toJsFn)
    
    inline def setDevice(value: GraphicsDevice): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
    
    inline def setDispatchUniforms(value: (Any, Any, Any, Any) => Callback): Self = StObject.set(x, "dispatchUniforms", js.Any.fromFunction4((t0: Any, t1: Any, t2: Any, t3: Any) => (value(t0, t1, t2, t3)).runNow()))
    
    inline def setForwardRenderer(value: ForwardRenderer): Self = StObject.set(x, "forwardRenderer", value.asInstanceOf[js.Any])
    
    inline def setGenerateSplitDistances(value: (Any, Any, Any) => Callback): Self = StObject.set(x, "generateSplitDistances", js.Any.fromFunction3((t0: Any, t1: Any, t2: Any) => (value(t0, t1, t2)).runNow()))
    
    inline def setGetVsmBlurShader(value: (Any, Any, Any) => Any): Self = StObject.set(x, "getVsmBlurShader", js.Any.fromFunction3(value))
    
    inline def setLightTextureAtlas(value: LightTextureAtlas): Self = StObject.set(x, "lightTextureAtlas", value.asInstanceOf[js.Any])
    
    inline def setPixelOffsetId(value: ScopeId): Self = StObject.set(x, "pixelOffsetId", value.asInstanceOf[js.Any])
    
    inline def setPolygonOffset(value: js.typedarray.Float32Array): Self = StObject.set(x, "polygonOffset", value.asInstanceOf[js.Any])
    
    inline def setPolygonOffsetId(value: ScopeId): Self = StObject.set(x, "polygonOffsetId", value.asInstanceOf[js.Any])
    
    inline def setRender(value: (Any, Any) => Callback): Self = StObject.set(x, "render", js.Any.fromFunction2((t0: Any, t1: Any) => (value(t0, t1)).runNow()))
    
    inline def setRestoreRenderState(value: Any => Callback): Self = StObject.set(x, "restoreRenderState", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def setSetupRenderState(value: (Any, Any) => Callback): Self = StObject.set(x, "setupRenderState", js.Any.fromFunction2((t0: Any, t1: Any) => (value(t0, t1)).runNow()))
    
    inline def setShadowMapCache(value: ShadowMapCache): Self = StObject.set(x, "shadowMapCache", value.asInstanceOf[js.Any])
    
    inline def setShadowMapLightRadiusId(value: ScopeId): Self = StObject.set(x, "shadowMapLightRadiusId", value.asInstanceOf[js.Any])
    
    inline def setSourceId(value: ScopeId): Self = StObject.set(x, "sourceId", value.asInstanceOf[js.Any])
    
    inline def setSubmitCasters(value: (js.Array[MeshInstance], Light) => Callback): Self = StObject.set(x, "submitCasters", js.Any.fromFunction2((t0: js.Array[MeshInstance], t1: Light) => (value(t0, t1)).runNow()))
    
    inline def setWeightId(value: ScopeId): Self = StObject.set(x, "weightId", value.asInstanceOf[js.Any])
  }
}
