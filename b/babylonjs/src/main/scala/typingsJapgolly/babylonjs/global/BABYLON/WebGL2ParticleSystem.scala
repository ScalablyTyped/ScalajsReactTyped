package typingsJapgolly.babylonjs.global.BABYLON

import typingsJapgolly.babylonjs.BABYLON.DataArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.WebGL2ParticleSystem")
@js.native
open class WebGL2ParticleSystem protected ()
  extends StObject
     with typingsJapgolly.babylonjs.BABYLON.WebGL2ParticleSystem {
  def this(
    parent: typingsJapgolly.babylonjs.BABYLON.GPUParticleSystem,
    engine: typingsJapgolly.babylonjs.BABYLON.ThinEngine
  ) = this()
  
  /* private */ /* CompleteClass */
  var _createUpdateVAO: Any = js.native
  
  /* private */ /* CompleteClass */
  var _engine: Any = js.native
  
  /* private */ /* CompleteClass */
  var _parent: Any = js.native
  
  /* private */ /* CompleteClass */
  var _renderVAO: Any = js.native
  
  /* private */ /* CompleteClass */
  var _updateEffect: Any = js.native
  
  /* private */ /* CompleteClass */
  var _updateEffectOptions: Any = js.native
  
  /* private */ /* CompleteClass */
  var _updateVAO: Any = js.native
  
  /* CompleteClass */
  var alignDataInBuffer: Boolean = js.native
  
  /* CompleteClass */
  override def bindDrawBuffers(index: Double): Unit = js.native
  /* CompleteClass */
  override def bindDrawBuffers(index: Double, effect: typingsJapgolly.babylonjs.BABYLON.Effect): Unit = js.native
  
  /* CompleteClass */
  override def createParticleBuffer(data: js.Array[Double]): DataArray | typingsJapgolly.babylonjs.BABYLON.DataBuffer = js.native
  
  /* CompleteClass */
  override def createUpdateBuffer(defines: String): typingsJapgolly.babylonjs.BABYLON.UniformBufferEffectCommonAccessor = js.native
  
  /* CompleteClass */
  override def createVertexBuffers(
    updateBuffer: typingsJapgolly.babylonjs.BABYLON.Buffer,
    renderVertexBuffers: org.scalablytyped.runtime.StringDictionary[typingsJapgolly.babylonjs.BABYLON.VertexBuffer]
  ): Unit = js.native
  
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
  override def updateParticleBuffer(index: Double, targetBuffer: typingsJapgolly.babylonjs.BABYLON.Buffer, currentActiveCount: Double): Unit = js.native
}
