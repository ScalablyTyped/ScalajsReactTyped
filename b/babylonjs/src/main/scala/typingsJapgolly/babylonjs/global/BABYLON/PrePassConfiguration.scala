package typingsJapgolly.babylonjs.global.BABYLON

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.PrePassConfiguration")
@js.native
open class PrePassConfiguration ()
  extends StObject
     with typingsJapgolly.babylonjs.BABYLON.PrePassConfiguration {
  
  /* private */ /* CompleteClass */
  var _lastUpdateFrameId: Any = js.native
  
  /**
    * Binds the material data.
    * @param effect defines the effect to update
    * @param scene defines the scene the material belongs to.
    * @param mesh The mesh
    * @param world World matrix of this mesh
    * @param isFrozen Is the material frozen
    */
  /* CompleteClass */
  override def bindForSubMesh(
    effect: typingsJapgolly.babylonjs.BABYLON.Effect,
    scene: typingsJapgolly.babylonjs.BABYLON.Scene,
    mesh: typingsJapgolly.babylonjs.BABYLON.Mesh,
    world: typingsJapgolly.babylonjs.BABYLON.Matrix,
    isFrozen: Boolean
  ): Unit = js.native
  
  /**
    * Current view projection matrix
    * Used for computing velocity
    */
  /* CompleteClass */
  var currentViewProjection: typingsJapgolly.babylonjs.BABYLON.Matrix = js.native
  
  /**
    * Previous bones of meshes carrying this material
    * Used for computing velocity
    */
  /* CompleteClass */
  var previousBones: NumberDictionary[js.typedarray.Float32Array] = js.native
  
  /**
    * Previous view project matrix
    * Used for computing velocity
    */
  /* CompleteClass */
  var previousViewProjection: typingsJapgolly.babylonjs.BABYLON.Matrix = js.native
  
  /**
    * Previous world matrices of meshes carrying this material
    * Used for computing velocity
    */
  /* CompleteClass */
  var previousWorldMatrices: NumberDictionary[typingsJapgolly.babylonjs.BABYLON.Matrix] = js.native
}
/* static members */
object PrePassConfiguration {
  
  @JSGlobal("BABYLON.PrePassConfiguration")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Add the required samplers to the current list.
    * @param samplers defines the current sampler list.
    */
  inline def AddSamplers(samplers: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("AddSamplers")(samplers.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Add the required uniforms to the current list.
    * @param uniforms defines the current uniform list.
    */
  inline def AddUniforms(uniforms: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("AddUniforms")(uniforms.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
