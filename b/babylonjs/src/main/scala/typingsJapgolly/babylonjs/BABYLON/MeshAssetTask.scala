package typingsJapgolly.babylonjs.BABYLON

import org.scalajs.dom.File
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MeshAssetTask
  extends StObject
     with AbstractAssetTask {
  
  /**
    * Defines the extension to use to load the scene (if not defined, ".babylon" will be used)
    */
  var `extension`: js.UndefOr[String] = js.native
  
  /**
    * Gets the list of loaded animation groups
    */
  var loadedAnimationGroups: js.Array[AnimationGroup] = js.native
  
  /**
    * Gets the list of loaded meshes
    */
  var loadedMeshes: js.Array[AbstractMesh] = js.native
  
  /**
    * Gets the list of loaded particle systems
    */
  var loadedParticleSystems: js.Array[IParticleSystem] = js.native
  
  /**
    * Gets the list of loaded skeletons
    */
  var loadedSkeletons: js.Array[Skeleton] = js.native
  
  /**
    * Gets the list of loaded transforms
    */
  var loadedTransformNodes: js.Array[TransformNode] = js.native
  
  /**
    * Defines the list of mesh's names you want to load
    */
  var meshesNames: Any = js.native
  
  /**
    * Callback called when the task is successful
    */
  def onError(task: MeshAssetTask): Unit = js.native
  def onError(task: MeshAssetTask, message: String): Unit = js.native
  def onError(task: MeshAssetTask, message: String, exception: Any): Unit = js.native
  def onError(task: MeshAssetTask, message: Unit, exception: Any): Unit = js.native
  
  /**
    * Callback called when the task is successful
    */
  def onSuccess(task: MeshAssetTask): Unit = js.native
  
  /**
    * Defines the root url to use as a base to load your meshes and associated resources
    */
  var rootUrl: String = js.native
  
  /**
    * Defines the filename or File of the scene to load from
    */
  var sceneFilename: String | File = js.native
}
