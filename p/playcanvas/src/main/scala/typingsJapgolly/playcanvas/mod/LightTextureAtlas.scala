package typingsJapgolly.playcanvas.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LightTextureAtlas extends StObject {
  
  var _cookieAtlasTextureId: Any
  
  var _shadowAtlasParams: js.typedarray.Float32Array
  
  var _shadowAtlasParamsId: Any
  
  var _shadowAtlasTextureId: Any
  
  def allocateCookieAtlas(resolution: Any): Unit
  
  def allocateShadowAtlas(resolution: Any): Unit
  
  def allocateUniforms(): Unit
  
  def assignSlot(light: Any, slotIndex: Any, slotReassigned: Any): Unit
  
  var atlasSplit: js.Array[Any]
  
  def collectLights(spotLights: Any, omniLights: Any, lightingParams: Any): js.Array[Any]
  
  var cookieAtlas: Texture
  
  var cookieAtlasResolution: Double
  
  var cookieRenderTarget: RenderTarget
  
  var cubeSlotsOffsets: js.Array[Vec2]
  
  def destroy(): Unit
  
  def destroyCookieAtlas(): Unit
  
  def destroyShadowAtlas(): Unit
  
  var device: Any
  
  var scissorVec: Vec4
  
  def setupSlot(light: Any, rect: Any): Unit
  
  var shadowAtlas: ShadowMap
  
  var shadowAtlasResolution: Double
  
  var shadowEdgePixels: Double
  
  var slots: js.Array[Any]
  
  def subdivide(numLights: Any, lightingParams: Any): Unit
  
  def update(spotLights: Any, omniLights: Any, lightingParams: Any): Unit
  
  def updateUniforms(): Unit
  
  var version: Double
}
object LightTextureAtlas {
  
  inline def apply(
    _cookieAtlasTextureId: Any,
    _shadowAtlasParams: js.typedarray.Float32Array,
    _shadowAtlasParamsId: Any,
    _shadowAtlasTextureId: Any,
    allocateCookieAtlas: Any => Callback,
    allocateShadowAtlas: Any => Callback,
    allocateUniforms: Callback,
    assignSlot: (Any, Any, Any) => Callback,
    atlasSplit: js.Array[Any],
    collectLights: (Any, Any, Any) => js.Array[Any],
    cookieAtlas: Texture,
    cookieAtlasResolution: Double,
    cookieRenderTarget: RenderTarget,
    cubeSlotsOffsets: js.Array[Vec2],
    destroy: Callback,
    destroyCookieAtlas: Callback,
    destroyShadowAtlas: Callback,
    device: Any,
    scissorVec: Vec4,
    setupSlot: (Any, Any) => Callback,
    shadowAtlas: ShadowMap,
    shadowAtlasResolution: Double,
    shadowEdgePixels: Double,
    slots: js.Array[Any],
    subdivide: (Any, Any) => Callback,
    update: (Any, Any, Any) => Callback,
    updateUniforms: Callback,
    version: Double
  ): LightTextureAtlas = {
    val __obj = js.Dynamic.literal(_cookieAtlasTextureId = _cookieAtlasTextureId.asInstanceOf[js.Any], _shadowAtlasParams = _shadowAtlasParams.asInstanceOf[js.Any], _shadowAtlasParamsId = _shadowAtlasParamsId.asInstanceOf[js.Any], _shadowAtlasTextureId = _shadowAtlasTextureId.asInstanceOf[js.Any], allocateCookieAtlas = js.Any.fromFunction1((t0: Any) => allocateCookieAtlas(t0).runNow()), allocateShadowAtlas = js.Any.fromFunction1((t0: Any) => allocateShadowAtlas(t0).runNow()), allocateUniforms = allocateUniforms.toJsFn, assignSlot = js.Any.fromFunction3((t0: Any, t1: Any, t2: Any) => (assignSlot(t0, t1, t2)).runNow()), atlasSplit = atlasSplit.asInstanceOf[js.Any], collectLights = js.Any.fromFunction3(collectLights), cookieAtlas = cookieAtlas.asInstanceOf[js.Any], cookieAtlasResolution = cookieAtlasResolution.asInstanceOf[js.Any], cookieRenderTarget = cookieRenderTarget.asInstanceOf[js.Any], cubeSlotsOffsets = cubeSlotsOffsets.asInstanceOf[js.Any], destroy = destroy.toJsFn, destroyCookieAtlas = destroyCookieAtlas.toJsFn, destroyShadowAtlas = destroyShadowAtlas.toJsFn, device = device.asInstanceOf[js.Any], scissorVec = scissorVec.asInstanceOf[js.Any], setupSlot = js.Any.fromFunction2((t0: Any, t1: Any) => (setupSlot(t0, t1)).runNow()), shadowAtlas = shadowAtlas.asInstanceOf[js.Any], shadowAtlasResolution = shadowAtlasResolution.asInstanceOf[js.Any], shadowEdgePixels = shadowEdgePixels.asInstanceOf[js.Any], slots = slots.asInstanceOf[js.Any], subdivide = js.Any.fromFunction2((t0: Any, t1: Any) => (subdivide(t0, t1)).runNow()), update = js.Any.fromFunction3((t0: Any, t1: Any, t2: Any) => (update(t0, t1, t2)).runNow()), updateUniforms = updateUniforms.toJsFn, version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[LightTextureAtlas]
  }
  
  extension [Self <: LightTextureAtlas](x: Self) {
    
    inline def setAllocateCookieAtlas(value: Any => Callback): Self = StObject.set(x, "allocateCookieAtlas", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def setAllocateShadowAtlas(value: Any => Callback): Self = StObject.set(x, "allocateShadowAtlas", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def setAllocateUniforms(value: Callback): Self = StObject.set(x, "allocateUniforms", value.toJsFn)
    
    inline def setAssignSlot(value: (Any, Any, Any) => Callback): Self = StObject.set(x, "assignSlot", js.Any.fromFunction3((t0: Any, t1: Any, t2: Any) => (value(t0, t1, t2)).runNow()))
    
    inline def setAtlasSplit(value: js.Array[Any]): Self = StObject.set(x, "atlasSplit", value.asInstanceOf[js.Any])
    
    inline def setAtlasSplitVarargs(value: Any*): Self = StObject.set(x, "atlasSplit", js.Array(value*))
    
    inline def setCollectLights(value: (Any, Any, Any) => js.Array[Any]): Self = StObject.set(x, "collectLights", js.Any.fromFunction3(value))
    
    inline def setCookieAtlas(value: Texture): Self = StObject.set(x, "cookieAtlas", value.asInstanceOf[js.Any])
    
    inline def setCookieAtlasResolution(value: Double): Self = StObject.set(x, "cookieAtlasResolution", value.asInstanceOf[js.Any])
    
    inline def setCookieRenderTarget(value: RenderTarget): Self = StObject.set(x, "cookieRenderTarget", value.asInstanceOf[js.Any])
    
    inline def setCubeSlotsOffsets(value: js.Array[Vec2]): Self = StObject.set(x, "cubeSlotsOffsets", value.asInstanceOf[js.Any])
    
    inline def setCubeSlotsOffsetsVarargs(value: Vec2*): Self = StObject.set(x, "cubeSlotsOffsets", js.Array(value*))
    
    inline def setDestroy(value: Callback): Self = StObject.set(x, "destroy", value.toJsFn)
    
    inline def setDestroyCookieAtlas(value: Callback): Self = StObject.set(x, "destroyCookieAtlas", value.toJsFn)
    
    inline def setDestroyShadowAtlas(value: Callback): Self = StObject.set(x, "destroyShadowAtlas", value.toJsFn)
    
    inline def setDevice(value: Any): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
    
    inline def setScissorVec(value: Vec4): Self = StObject.set(x, "scissorVec", value.asInstanceOf[js.Any])
    
    inline def setSetupSlot(value: (Any, Any) => Callback): Self = StObject.set(x, "setupSlot", js.Any.fromFunction2((t0: Any, t1: Any) => (value(t0, t1)).runNow()))
    
    inline def setShadowAtlas(value: ShadowMap): Self = StObject.set(x, "shadowAtlas", value.asInstanceOf[js.Any])
    
    inline def setShadowAtlasResolution(value: Double): Self = StObject.set(x, "shadowAtlasResolution", value.asInstanceOf[js.Any])
    
    inline def setShadowEdgePixels(value: Double): Self = StObject.set(x, "shadowEdgePixels", value.asInstanceOf[js.Any])
    
    inline def setSlots(value: js.Array[Any]): Self = StObject.set(x, "slots", value.asInstanceOf[js.Any])
    
    inline def setSlotsVarargs(value: Any*): Self = StObject.set(x, "slots", js.Array(value*))
    
    inline def setSubdivide(value: (Any, Any) => Callback): Self = StObject.set(x, "subdivide", js.Any.fromFunction2((t0: Any, t1: Any) => (value(t0, t1)).runNow()))
    
    inline def setUpdate(value: (Any, Any, Any) => Callback): Self = StObject.set(x, "update", js.Any.fromFunction3((t0: Any, t1: Any, t2: Any) => (value(t0, t1, t2)).runNow()))
    
    inline def setUpdateUniforms(value: Callback): Self = StObject.set(x, "updateUniforms", value.toJsFn)
    
    inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def set_cookieAtlasTextureId(value: Any): Self = StObject.set(x, "_cookieAtlasTextureId", value.asInstanceOf[js.Any])
    
    inline def set_shadowAtlasParams(value: js.typedarray.Float32Array): Self = StObject.set(x, "_shadowAtlasParams", value.asInstanceOf[js.Any])
    
    inline def set_shadowAtlasParamsId(value: Any): Self = StObject.set(x, "_shadowAtlasParamsId", value.asInstanceOf[js.Any])
    
    inline def set_shadowAtlasTextureId(value: Any): Self = StObject.set(x, "_shadowAtlasTextureId", value.asInstanceOf[js.Any])
  }
}
