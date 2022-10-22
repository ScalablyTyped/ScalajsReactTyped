package typingsJapgolly.playcanvas.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LightsBuffer extends StObject {
  
  var _lightsTexture8Id: Any
  
  var _lightsTextureFloatId: Any
  
  var _lightsTextureInvSizeData: js.typedarray.Float32Array
  
  var _lightsTextureInvSizeId: Any
  
  def addLightAreaSizes(data8: Any, index: Any, light: Any): Unit
  
  def addLightAtlasViewport(data8: Any, index: Any, atlasViewport: Any): Unit
  
  def addLightData(light: Any, lightIndex: Any, gammaCorrection: Any): Unit
  
  def addLightDataColor(data8: Any, index: Any, light: Any, gammaCorrection: Any, isCookie: Any): Unit
  
  def addLightDataCookies(data8: Any, index: Any, light: Any): Unit
  
  def addLightDataFlags(data8: Any, index: Any, light: Any, isSpot: Any, castShadows: Any, shadowIntensity: Any): Unit
  
  def addLightDataLightProjMatrix(data8: Any, index: Any, lightProjectionMatrix: Any): Unit
  
  def addLightDataPositionRange(data8: Any, index: Any, light: Any, pos: Any): Unit
  
  def addLightDataShadowBias(data8: Any, index: Any, light: Any): Unit
  
  def addLightDataSpotAngles(data8: Any, index: Any, light: Any): Unit
  
  def addLightDataSpotDirection(data8: Any, index: Any, light: Any): Unit
  
  var areaLightsEnabled: Boolean
  
  var boundsDelta: Vec3
  
  var boundsMin: Vec3
  
  var cookiesEnabled: Boolean
  
  def destroy(): Unit
  
  var device: Any
  
  def getLightAreaSizes(light: Any): js.typedarray.Float32Array
  
  def getSpotDirection(direction: Any, spot: Any): Unit
  
  var invMaxAttenuation: Double
  
  var invMaxColorValue: Double
  
  var lights8: js.typedarray.Uint8ClampedArray
  
  var lightsFloat: js.typedarray.Float32Array
  
  var lightsTexture8: Texture
  
  var lightsTextureFloat: Texture
  
  var maxLights: Double
  
  def setBounds(min: Any, delta: Any): Unit
  
  def setCompressionRanges(maxAttenuation: Any, maxColorValue: Any): Unit
  
  var shadowsEnabled: Boolean
  
  def updateUniforms(): Unit
  
  def uploadTextures(): Unit
}
object LightsBuffer {
  
  inline def apply(
    _lightsTexture8Id: Any,
    _lightsTextureFloatId: Any,
    _lightsTextureInvSizeData: js.typedarray.Float32Array,
    _lightsTextureInvSizeId: Any,
    addLightAreaSizes: (Any, Any, Any) => Callback,
    addLightAtlasViewport: (Any, Any, Any) => Callback,
    addLightData: (Any, Any, Any) => Callback,
    addLightDataColor: (Any, Any, Any, Any, Any) => Callback,
    addLightDataCookies: (Any, Any, Any) => Callback,
    addLightDataFlags: (Any, Any, Any, Any, Any, Any) => Callback,
    addLightDataLightProjMatrix: (Any, Any, Any) => Callback,
    addLightDataPositionRange: (Any, Any, Any, Any) => Callback,
    addLightDataShadowBias: (Any, Any, Any) => Callback,
    addLightDataSpotAngles: (Any, Any, Any) => Callback,
    addLightDataSpotDirection: (Any, Any, Any) => Callback,
    areaLightsEnabled: Boolean,
    boundsDelta: Vec3,
    boundsMin: Vec3,
    cookiesEnabled: Boolean,
    destroy: Callback,
    device: Any,
    getLightAreaSizes: Any => js.typedarray.Float32Array,
    getSpotDirection: (Any, Any) => Callback,
    invMaxAttenuation: Double,
    invMaxColorValue: Double,
    lights8: js.typedarray.Uint8ClampedArray,
    lightsFloat: js.typedarray.Float32Array,
    lightsTexture8: Texture,
    lightsTextureFloat: Texture,
    maxLights: Double,
    setBounds: (Any, Any) => Callback,
    setCompressionRanges: (Any, Any) => Callback,
    shadowsEnabled: Boolean,
    updateUniforms: Callback,
    uploadTextures: Callback
  ): LightsBuffer = {
    val __obj = js.Dynamic.literal(_lightsTexture8Id = _lightsTexture8Id.asInstanceOf[js.Any], _lightsTextureFloatId = _lightsTextureFloatId.asInstanceOf[js.Any], _lightsTextureInvSizeData = _lightsTextureInvSizeData.asInstanceOf[js.Any], _lightsTextureInvSizeId = _lightsTextureInvSizeId.asInstanceOf[js.Any], addLightAreaSizes = js.Any.fromFunction3((t0: Any, t1: Any, t2: Any) => (addLightAreaSizes(t0, t1, t2)).runNow()), addLightAtlasViewport = js.Any.fromFunction3((t0: Any, t1: Any, t2: Any) => (addLightAtlasViewport(t0, t1, t2)).runNow()), addLightData = js.Any.fromFunction3((t0: Any, t1: Any, t2: Any) => (addLightData(t0, t1, t2)).runNow()), addLightDataColor = js.Any.fromFunction5((t0: Any, t1: Any, t2: Any, t3: Any, t4: Any) => (addLightDataColor(t0, t1, t2, t3, t4)).runNow()), addLightDataCookies = js.Any.fromFunction3((t0: Any, t1: Any, t2: Any) => (addLightDataCookies(t0, t1, t2)).runNow()), addLightDataFlags = js.Any.fromFunction6((t0: Any, t1: Any, t2: Any, t3: Any, t4: Any, t5: Any) => (addLightDataFlags(t0, t1, t2, t3, t4, t5)).runNow()), addLightDataLightProjMatrix = js.Any.fromFunction3((t0: Any, t1: Any, t2: Any) => (addLightDataLightProjMatrix(t0, t1, t2)).runNow()), addLightDataPositionRange = js.Any.fromFunction4((t0: Any, t1: Any, t2: Any, t3: Any) => (addLightDataPositionRange(t0, t1, t2, t3)).runNow()), addLightDataShadowBias = js.Any.fromFunction3((t0: Any, t1: Any, t2: Any) => (addLightDataShadowBias(t0, t1, t2)).runNow()), addLightDataSpotAngles = js.Any.fromFunction3((t0: Any, t1: Any, t2: Any) => (addLightDataSpotAngles(t0, t1, t2)).runNow()), addLightDataSpotDirection = js.Any.fromFunction3((t0: Any, t1: Any, t2: Any) => (addLightDataSpotDirection(t0, t1, t2)).runNow()), areaLightsEnabled = areaLightsEnabled.asInstanceOf[js.Any], boundsDelta = boundsDelta.asInstanceOf[js.Any], boundsMin = boundsMin.asInstanceOf[js.Any], cookiesEnabled = cookiesEnabled.asInstanceOf[js.Any], destroy = destroy.toJsFn, device = device.asInstanceOf[js.Any], getLightAreaSizes = js.Any.fromFunction1(getLightAreaSizes), getSpotDirection = js.Any.fromFunction2((t0: Any, t1: Any) => (getSpotDirection(t0, t1)).runNow()), invMaxAttenuation = invMaxAttenuation.asInstanceOf[js.Any], invMaxColorValue = invMaxColorValue.asInstanceOf[js.Any], lights8 = lights8.asInstanceOf[js.Any], lightsFloat = lightsFloat.asInstanceOf[js.Any], lightsTexture8 = lightsTexture8.asInstanceOf[js.Any], lightsTextureFloat = lightsTextureFloat.asInstanceOf[js.Any], maxLights = maxLights.asInstanceOf[js.Any], setBounds = js.Any.fromFunction2((t0: Any, t1: Any) => (setBounds(t0, t1)).runNow()), setCompressionRanges = js.Any.fromFunction2((t0: Any, t1: Any) => (setCompressionRanges(t0, t1)).runNow()), shadowsEnabled = shadowsEnabled.asInstanceOf[js.Any], updateUniforms = updateUniforms.toJsFn, uploadTextures = uploadTextures.toJsFn)
    __obj.asInstanceOf[LightsBuffer]
  }
  
  extension [Self <: LightsBuffer](x: Self) {
    
    inline def setAddLightAreaSizes(value: (Any, Any, Any) => Callback): Self = StObject.set(x, "addLightAreaSizes", js.Any.fromFunction3((t0: Any, t1: Any, t2: Any) => (value(t0, t1, t2)).runNow()))
    
    inline def setAddLightAtlasViewport(value: (Any, Any, Any) => Callback): Self = StObject.set(x, "addLightAtlasViewport", js.Any.fromFunction3((t0: Any, t1: Any, t2: Any) => (value(t0, t1, t2)).runNow()))
    
    inline def setAddLightData(value: (Any, Any, Any) => Callback): Self = StObject.set(x, "addLightData", js.Any.fromFunction3((t0: Any, t1: Any, t2: Any) => (value(t0, t1, t2)).runNow()))
    
    inline def setAddLightDataColor(value: (Any, Any, Any, Any, Any) => Callback): Self = StObject.set(x, "addLightDataColor", js.Any.fromFunction5((t0: Any, t1: Any, t2: Any, t3: Any, t4: Any) => (value(t0, t1, t2, t3, t4)).runNow()))
    
    inline def setAddLightDataCookies(value: (Any, Any, Any) => Callback): Self = StObject.set(x, "addLightDataCookies", js.Any.fromFunction3((t0: Any, t1: Any, t2: Any) => (value(t0, t1, t2)).runNow()))
    
    inline def setAddLightDataFlags(value: (Any, Any, Any, Any, Any, Any) => Callback): Self = StObject.set(x, "addLightDataFlags", js.Any.fromFunction6((t0: Any, t1: Any, t2: Any, t3: Any, t4: Any, t5: Any) => (value(t0, t1, t2, t3, t4, t5)).runNow()))
    
    inline def setAddLightDataLightProjMatrix(value: (Any, Any, Any) => Callback): Self = StObject.set(x, "addLightDataLightProjMatrix", js.Any.fromFunction3((t0: Any, t1: Any, t2: Any) => (value(t0, t1, t2)).runNow()))
    
    inline def setAddLightDataPositionRange(value: (Any, Any, Any, Any) => Callback): Self = StObject.set(x, "addLightDataPositionRange", js.Any.fromFunction4((t0: Any, t1: Any, t2: Any, t3: Any) => (value(t0, t1, t2, t3)).runNow()))
    
    inline def setAddLightDataShadowBias(value: (Any, Any, Any) => Callback): Self = StObject.set(x, "addLightDataShadowBias", js.Any.fromFunction3((t0: Any, t1: Any, t2: Any) => (value(t0, t1, t2)).runNow()))
    
    inline def setAddLightDataSpotAngles(value: (Any, Any, Any) => Callback): Self = StObject.set(x, "addLightDataSpotAngles", js.Any.fromFunction3((t0: Any, t1: Any, t2: Any) => (value(t0, t1, t2)).runNow()))
    
    inline def setAddLightDataSpotDirection(value: (Any, Any, Any) => Callback): Self = StObject.set(x, "addLightDataSpotDirection", js.Any.fromFunction3((t0: Any, t1: Any, t2: Any) => (value(t0, t1, t2)).runNow()))
    
    inline def setAreaLightsEnabled(value: Boolean): Self = StObject.set(x, "areaLightsEnabled", value.asInstanceOf[js.Any])
    
    inline def setBoundsDelta(value: Vec3): Self = StObject.set(x, "boundsDelta", value.asInstanceOf[js.Any])
    
    inline def setBoundsMin(value: Vec3): Self = StObject.set(x, "boundsMin", value.asInstanceOf[js.Any])
    
    inline def setCookiesEnabled(value: Boolean): Self = StObject.set(x, "cookiesEnabled", value.asInstanceOf[js.Any])
    
    inline def setDestroy(value: Callback): Self = StObject.set(x, "destroy", value.toJsFn)
    
    inline def setDevice(value: Any): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
    
    inline def setGetLightAreaSizes(value: Any => js.typedarray.Float32Array): Self = StObject.set(x, "getLightAreaSizes", js.Any.fromFunction1(value))
    
    inline def setGetSpotDirection(value: (Any, Any) => Callback): Self = StObject.set(x, "getSpotDirection", js.Any.fromFunction2((t0: Any, t1: Any) => (value(t0, t1)).runNow()))
    
    inline def setInvMaxAttenuation(value: Double): Self = StObject.set(x, "invMaxAttenuation", value.asInstanceOf[js.Any])
    
    inline def setInvMaxColorValue(value: Double): Self = StObject.set(x, "invMaxColorValue", value.asInstanceOf[js.Any])
    
    inline def setLights8(value: js.typedarray.Uint8ClampedArray): Self = StObject.set(x, "lights8", value.asInstanceOf[js.Any])
    
    inline def setLightsFloat(value: js.typedarray.Float32Array): Self = StObject.set(x, "lightsFloat", value.asInstanceOf[js.Any])
    
    inline def setLightsTexture8(value: Texture): Self = StObject.set(x, "lightsTexture8", value.asInstanceOf[js.Any])
    
    inline def setLightsTextureFloat(value: Texture): Self = StObject.set(x, "lightsTextureFloat", value.asInstanceOf[js.Any])
    
    inline def setMaxLights(value: Double): Self = StObject.set(x, "maxLights", value.asInstanceOf[js.Any])
    
    inline def setSetBounds(value: (Any, Any) => Callback): Self = StObject.set(x, "setBounds", js.Any.fromFunction2((t0: Any, t1: Any) => (value(t0, t1)).runNow()))
    
    inline def setSetCompressionRanges(value: (Any, Any) => Callback): Self = StObject.set(x, "setCompressionRanges", js.Any.fromFunction2((t0: Any, t1: Any) => (value(t0, t1)).runNow()))
    
    inline def setShadowsEnabled(value: Boolean): Self = StObject.set(x, "shadowsEnabled", value.asInstanceOf[js.Any])
    
    inline def setUpdateUniforms(value: Callback): Self = StObject.set(x, "updateUniforms", value.toJsFn)
    
    inline def setUploadTextures(value: Callback): Self = StObject.set(x, "uploadTextures", value.toJsFn)
    
    inline def set_lightsTexture8Id(value: Any): Self = StObject.set(x, "_lightsTexture8Id", value.asInstanceOf[js.Any])
    
    inline def set_lightsTextureFloatId(value: Any): Self = StObject.set(x, "_lightsTextureFloatId", value.asInstanceOf[js.Any])
    
    inline def set_lightsTextureInvSizeData(value: js.typedarray.Float32Array): Self = StObject.set(x, "_lightsTextureInvSizeData", value.asInstanceOf[js.Any])
    
    inline def set_lightsTextureInvSizeId(value: Any): Self = StObject.set(x, "_lightsTextureInvSizeId", value.asInstanceOf[js.Any])
  }
}
