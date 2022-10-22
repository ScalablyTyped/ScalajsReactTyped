package typingsJapgolly.babylonjs.BABYLON

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComputeShaderParticleSystem
  extends StObject
     with IGPUParticleSystemPlatform {
  
  /* private */ var _bufferComputeShader: Any
  
  /* private */ var _engine: Any
  
  /* private */ var _parent: Any
  
  /* private */ var _renderVertexBuffers: Any
  
  /* private */ var _simParamsComputeShader: Any
  
  /* private */ var _updateComputeShader: Any
}
object ComputeShaderParticleSystem {
  
  inline def apply(
    _bufferComputeShader: Any,
    _engine: Any,
    _parent: Any,
    _renderVertexBuffers: Any,
    _simParamsComputeShader: Any,
    _updateComputeShader: Any,
    alignDataInBuffer: Boolean,
    bindDrawBuffers: (Double, Effect) => Callback,
    createParticleBuffer: js.Array[Double] => DataArray | DataBuffer,
    createUpdateBuffer: String => UniformBufferEffectCommonAccessor,
    createVertexBuffers: (Buffer, org.scalablytyped.runtime.StringDictionary[VertexBuffer]) => Callback,
    isUpdateBufferCreated: CallbackTo[Boolean],
    isUpdateBufferReady: CallbackTo[Boolean],
    preUpdateParticleBuffer: Callback,
    releaseBuffers: Callback,
    releaseVertexBuffers: Callback,
    updateParticleBuffer: (Double, Buffer, Double) => Callback
  ): ComputeShaderParticleSystem = {
    val __obj = js.Dynamic.literal(_bufferComputeShader = _bufferComputeShader.asInstanceOf[js.Any], _engine = _engine.asInstanceOf[js.Any], _parent = _parent.asInstanceOf[js.Any], _renderVertexBuffers = _renderVertexBuffers.asInstanceOf[js.Any], _simParamsComputeShader = _simParamsComputeShader.asInstanceOf[js.Any], _updateComputeShader = _updateComputeShader.asInstanceOf[js.Any], alignDataInBuffer = alignDataInBuffer.asInstanceOf[js.Any], bindDrawBuffers = js.Any.fromFunction2((t0: Double, t1: Effect) => (bindDrawBuffers(t0, t1)).runNow()), createParticleBuffer = js.Any.fromFunction1(createParticleBuffer), createUpdateBuffer = js.Any.fromFunction1(createUpdateBuffer), createVertexBuffers = js.Any.fromFunction2((t0: Buffer, t1: org.scalablytyped.runtime.StringDictionary[VertexBuffer]) => (createVertexBuffers(t0, t1)).runNow()), isUpdateBufferCreated = isUpdateBufferCreated.toJsFn, isUpdateBufferReady = isUpdateBufferReady.toJsFn, preUpdateParticleBuffer = preUpdateParticleBuffer.toJsFn, releaseBuffers = releaseBuffers.toJsFn, releaseVertexBuffers = releaseVertexBuffers.toJsFn, updateParticleBuffer = js.Any.fromFunction3((t0: Double, t1: Buffer, t2: Double) => (updateParticleBuffer(t0, t1, t2)).runNow()))
    __obj.asInstanceOf[ComputeShaderParticleSystem]
  }
  
  extension [Self <: ComputeShaderParticleSystem](x: Self) {
    
    inline def set_bufferComputeShader(value: Any): Self = StObject.set(x, "_bufferComputeShader", value.asInstanceOf[js.Any])
    
    inline def set_engine(value: Any): Self = StObject.set(x, "_engine", value.asInstanceOf[js.Any])
    
    inline def set_parent(value: Any): Self = StObject.set(x, "_parent", value.asInstanceOf[js.Any])
    
    inline def set_renderVertexBuffers(value: Any): Self = StObject.set(x, "_renderVertexBuffers", value.asInstanceOf[js.Any])
    
    inline def set_simParamsComputeShader(value: Any): Self = StObject.set(x, "_simParamsComputeShader", value.asInstanceOf[js.Any])
    
    inline def set_updateComputeShader(value: Any): Self = StObject.set(x, "_updateComputeShader", value.asInstanceOf[js.Any])
  }
}
