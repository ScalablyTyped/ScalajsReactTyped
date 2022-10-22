package typingsJapgolly.babylonjs

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.babylonjs.buffersBufferMod.Buffer
import typingsJapgolly.babylonjs.buffersBufferMod.VertexBuffer
import typingsJapgolly.babylonjs.buffersDataBufferMod.DataBuffer
import typingsJapgolly.babylonjs.materialsEffectMod.Effect
import typingsJapgolly.babylonjs.materialsUniformBufferEffectCommonAccessorMod.UniformBufferEffectCommonAccessor
import typingsJapgolly.babylonjs.typesMod.DataArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object particlesIgpuparticlesystemplatformMod {
  
  trait IGPUParticleSystemPlatform extends StObject {
    
    var alignDataInBuffer: Boolean
    
    def bindDrawBuffers(index: Double, effect: Effect): Unit
    
    def createParticleBuffer(data: js.Array[Double]): DataArray | DataBuffer
    
    def createUpdateBuffer(defines: String): UniformBufferEffectCommonAccessor
    
    def createVertexBuffers(updateBuffer: Buffer, renderVertexBuffers: StringDictionary[VertexBuffer]): Unit
    
    def isUpdateBufferCreated(): Boolean
    
    def isUpdateBufferReady(): Boolean
    
    def preUpdateParticleBuffer(): Unit
    
    def releaseBuffers(): Unit
    
    def releaseVertexBuffers(): Unit
    
    def updateParticleBuffer(index: Double, targetBuffer: Buffer, currentActiveCount: Double): Unit
  }
  object IGPUParticleSystemPlatform {
    
    inline def apply(
      alignDataInBuffer: Boolean,
      bindDrawBuffers: (Double, Effect) => Callback,
      createParticleBuffer: js.Array[Double] => DataArray | DataBuffer,
      createUpdateBuffer: String => UniformBufferEffectCommonAccessor,
      createVertexBuffers: (Buffer, StringDictionary[VertexBuffer]) => Callback,
      isUpdateBufferCreated: CallbackTo[Boolean],
      isUpdateBufferReady: CallbackTo[Boolean],
      preUpdateParticleBuffer: Callback,
      releaseBuffers: Callback,
      releaseVertexBuffers: Callback,
      updateParticleBuffer: (Double, Buffer, Double) => Callback
    ): IGPUParticleSystemPlatform = {
      val __obj = js.Dynamic.literal(alignDataInBuffer = alignDataInBuffer.asInstanceOf[js.Any], bindDrawBuffers = js.Any.fromFunction2((t0: Double, t1: Effect) => (bindDrawBuffers(t0, t1)).runNow()), createParticleBuffer = js.Any.fromFunction1(createParticleBuffer), createUpdateBuffer = js.Any.fromFunction1(createUpdateBuffer), createVertexBuffers = js.Any.fromFunction2((t0: Buffer, t1: StringDictionary[VertexBuffer]) => (createVertexBuffers(t0, t1)).runNow()), isUpdateBufferCreated = isUpdateBufferCreated.toJsFn, isUpdateBufferReady = isUpdateBufferReady.toJsFn, preUpdateParticleBuffer = preUpdateParticleBuffer.toJsFn, releaseBuffers = releaseBuffers.toJsFn, releaseVertexBuffers = releaseVertexBuffers.toJsFn, updateParticleBuffer = js.Any.fromFunction3((t0: Double, t1: Buffer, t2: Double) => (updateParticleBuffer(t0, t1, t2)).runNow()))
      __obj.asInstanceOf[IGPUParticleSystemPlatform]
    }
    
    extension [Self <: IGPUParticleSystemPlatform](x: Self) {
      
      inline def setAlignDataInBuffer(value: Boolean): Self = StObject.set(x, "alignDataInBuffer", value.asInstanceOf[js.Any])
      
      inline def setBindDrawBuffers(value: (Double, Effect) => Callback): Self = StObject.set(x, "bindDrawBuffers", js.Any.fromFunction2((t0: Double, t1: Effect) => (value(t0, t1)).runNow()))
      
      inline def setCreateParticleBuffer(value: js.Array[Double] => DataArray | DataBuffer): Self = StObject.set(x, "createParticleBuffer", js.Any.fromFunction1(value))
      
      inline def setCreateUpdateBuffer(value: String => UniformBufferEffectCommonAccessor): Self = StObject.set(x, "createUpdateBuffer", js.Any.fromFunction1(value))
      
      inline def setCreateVertexBuffers(value: (Buffer, StringDictionary[VertexBuffer]) => Callback): Self = StObject.set(x, "createVertexBuffers", js.Any.fromFunction2((t0: Buffer, t1: StringDictionary[VertexBuffer]) => (value(t0, t1)).runNow()))
      
      inline def setIsUpdateBufferCreated(value: CallbackTo[Boolean]): Self = StObject.set(x, "isUpdateBufferCreated", value.toJsFn)
      
      inline def setIsUpdateBufferReady(value: CallbackTo[Boolean]): Self = StObject.set(x, "isUpdateBufferReady", value.toJsFn)
      
      inline def setPreUpdateParticleBuffer(value: Callback): Self = StObject.set(x, "preUpdateParticleBuffer", value.toJsFn)
      
      inline def setReleaseBuffers(value: Callback): Self = StObject.set(x, "releaseBuffers", value.toJsFn)
      
      inline def setReleaseVertexBuffers(value: Callback): Self = StObject.set(x, "releaseVertexBuffers", value.toJsFn)
      
      inline def setUpdateParticleBuffer(value: (Double, Buffer, Double) => Callback): Self = StObject.set(x, "updateParticleBuffer", js.Any.fromFunction3((t0: Double, t1: Buffer, t2: Double) => (value(t0, t1, t2)).runNow()))
    }
  }
}
