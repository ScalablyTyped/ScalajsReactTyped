package typingsJapgolly.babylonjs.BABYLON

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebGL2ParticleSystem
  extends StObject
     with IGPUParticleSystemPlatform {
  
  /* private */ var _createUpdateVAO: Any
  
  /* private */ var _engine: Any
  
  /* private */ var _parent: Any
  
  /* private */ var _renderVAO: Any
  
  /* private */ var _updateEffect: Any
  
  /* private */ var _updateEffectOptions: Any
  
  /* private */ var _updateVAO: Any
  
  def bindDrawBuffers(index: Double): Unit
}
object WebGL2ParticleSystem {
  
  inline def apply(
    _createUpdateVAO: Any,
    _engine: Any,
    _parent: Any,
    _renderVAO: Any,
    _updateEffect: Any,
    _updateEffectOptions: Any,
    _updateVAO: Any,
    alignDataInBuffer: Boolean,
    bindDrawBuffers: Double => Callback,
    createParticleBuffer: js.Array[Double] => DataArray | DataBuffer,
    createUpdateBuffer: String => UniformBufferEffectCommonAccessor,
    createVertexBuffers: (Buffer, org.scalablytyped.runtime.StringDictionary[VertexBuffer]) => Callback,
    isUpdateBufferCreated: CallbackTo[Boolean],
    isUpdateBufferReady: CallbackTo[Boolean],
    preUpdateParticleBuffer: Callback,
    releaseBuffers: Callback,
    releaseVertexBuffers: Callback,
    updateParticleBuffer: (Double, Buffer, Double) => Callback
  ): WebGL2ParticleSystem = {
    val __obj = js.Dynamic.literal(_createUpdateVAO = _createUpdateVAO.asInstanceOf[js.Any], _engine = _engine.asInstanceOf[js.Any], _parent = _parent.asInstanceOf[js.Any], _renderVAO = _renderVAO.asInstanceOf[js.Any], _updateEffect = _updateEffect.asInstanceOf[js.Any], _updateEffectOptions = _updateEffectOptions.asInstanceOf[js.Any], _updateVAO = _updateVAO.asInstanceOf[js.Any], alignDataInBuffer = alignDataInBuffer.asInstanceOf[js.Any], bindDrawBuffers = js.Any.fromFunction1((t0: Double) => bindDrawBuffers(t0).runNow()), createParticleBuffer = js.Any.fromFunction1(createParticleBuffer), createUpdateBuffer = js.Any.fromFunction1(createUpdateBuffer), createVertexBuffers = js.Any.fromFunction2((t0: Buffer, t1: org.scalablytyped.runtime.StringDictionary[VertexBuffer]) => (createVertexBuffers(t0, t1)).runNow()), isUpdateBufferCreated = isUpdateBufferCreated.toJsFn, isUpdateBufferReady = isUpdateBufferReady.toJsFn, preUpdateParticleBuffer = preUpdateParticleBuffer.toJsFn, releaseBuffers = releaseBuffers.toJsFn, releaseVertexBuffers = releaseVertexBuffers.toJsFn, updateParticleBuffer = js.Any.fromFunction3((t0: Double, t1: Buffer, t2: Double) => (updateParticleBuffer(t0, t1, t2)).runNow()))
    __obj.asInstanceOf[WebGL2ParticleSystem]
  }
  
  extension [Self <: WebGL2ParticleSystem](x: Self) {
    
    inline def setBindDrawBuffers(value: Double => Callback): Self = StObject.set(x, "bindDrawBuffers", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def set_createUpdateVAO(value: Any): Self = StObject.set(x, "_createUpdateVAO", value.asInstanceOf[js.Any])
    
    inline def set_engine(value: Any): Self = StObject.set(x, "_engine", value.asInstanceOf[js.Any])
    
    inline def set_parent(value: Any): Self = StObject.set(x, "_parent", value.asInstanceOf[js.Any])
    
    inline def set_renderVAO(value: Any): Self = StObject.set(x, "_renderVAO", value.asInstanceOf[js.Any])
    
    inline def set_updateEffect(value: Any): Self = StObject.set(x, "_updateEffect", value.asInstanceOf[js.Any])
    
    inline def set_updateEffectOptions(value: Any): Self = StObject.set(x, "_updateEffectOptions", value.asInstanceOf[js.Any])
    
    inline def set_updateVAO(value: Any): Self = StObject.set(x, "_updateVAO", value.asInstanceOf[js.Any])
  }
}
