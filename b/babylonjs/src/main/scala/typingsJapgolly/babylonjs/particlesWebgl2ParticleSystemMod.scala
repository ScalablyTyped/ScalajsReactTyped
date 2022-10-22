package typingsJapgolly.babylonjs

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.babylonjs.buffersBufferMod.Buffer
import typingsJapgolly.babylonjs.buffersBufferMod.VertexBuffer
import typingsJapgolly.babylonjs.buffersDataBufferMod.DataBuffer
import typingsJapgolly.babylonjs.enginesThinEngineMod.ThinEngine
import typingsJapgolly.babylonjs.materialsEffectMod.Effect
import typingsJapgolly.babylonjs.materialsUniformBufferEffectCommonAccessorMod.UniformBufferEffectCommonAccessor
import typingsJapgolly.babylonjs.particlesGpuParticleSystemMod.GPUParticleSystem
import typingsJapgolly.babylonjs.particlesIgpuparticlesystemplatformMod.IGPUParticleSystemPlatform
import typingsJapgolly.babylonjs.typesMod.DataArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object particlesWebgl2ParticleSystemMod {
  
  @JSImport("babylonjs/Particles/webgl2ParticleSystem", "WebGL2ParticleSystem")
  @js.native
  open class WebGL2ParticleSystem protected ()
    extends StObject
       with IGPUParticleSystemPlatform {
    def this(parent: GPUParticleSystem, engine: ThinEngine) = this()
    
    /* private */ var _createUpdateVAO: Any = js.native
    
    /* private */ var _engine: Any = js.native
    
    /* private */ var _parent: Any = js.native
    
    /* private */ var _renderVAO: Any = js.native
    
    /* private */ var _updateEffect: Any = js.native
    
    /* private */ var _updateEffectOptions: Any = js.native
    
    /* private */ var _updateVAO: Any = js.native
    
    /* CompleteClass */
    var alignDataInBuffer: Boolean = js.native
    
    def bindDrawBuffers(index: Double): Unit = js.native
    /* CompleteClass */
    override def bindDrawBuffers(index: Double, effect: Effect): Unit = js.native
    
    /* CompleteClass */
    override def createParticleBuffer(data: js.Array[Double]): DataArray | DataBuffer = js.native
    
    /* CompleteClass */
    override def createUpdateBuffer(defines: String): UniformBufferEffectCommonAccessor = js.native
    
    /* CompleteClass */
    override def createVertexBuffers(updateBuffer: Buffer, renderVertexBuffers: StringDictionary[VertexBuffer]): Unit = js.native
    
    /* CompleteClass */
    override def isUpdateBufferCreated(): Boolean = js.native
    
    /* CompleteClass */
    override def isUpdateBufferReady(): Boolean = js.native
    
    /* CompleteClass */
    override def preUpdateParticleBuffer(): Unit = js.native
    
    /* CompleteClass */
    override def releaseBuffers(): Unit = js.native
    
    /* CompleteClass */
    override def releaseVertexBuffers(): Unit = js.native
    
    /* CompleteClass */
    override def updateParticleBuffer(index: Double, targetBuffer: Buffer, currentActiveCount: Double): Unit = js.native
  }
}
