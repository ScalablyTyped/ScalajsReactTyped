package typingsJapgolly.babylonjs.global.BABYLON

import typingsJapgolly.babylonjs.BABYLON.ISmartArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.OctreeSceneComponent")
@js.native
/**
  * Creates a new instance of the component for the given scene
  * @param scene Defines the scene to register the component in
  */
open class OctreeSceneComponent ()
  extends StObject
     with typingsJapgolly.babylonjs.BABYLON.OctreeSceneComponent {
  def this(scene: typingsJapgolly.babylonjs.BABYLON.Scene) = this()
  
  /* private */ /* CompleteClass */
  var _tempRay: Any = js.native
  
  /**
    * Indicates if the meshes have been checked to make sure they are isEnabled()
    */
  /* CompleteClass */
  override val checksIsEnabled: /* true */ Boolean = js.native
  
  /**
    * Disposes the component and the associated resources.
    */
  /* CompleteClass */
  override def dispose(): Unit = js.native
  
  /**
    * Return the list of active meshes
    * @returns the list of active meshes
    */
  /* CompleteClass */
  override def getActiveMeshCandidates(): ISmartArrayLike[typingsJapgolly.babylonjs.BABYLON.AbstractMesh] = js.native
  
  /**
    * Return the list of active sub meshes
    * @param mesh The mesh to get the candidates sub meshes from
    * @returns the list of active sub meshes
    */
  /* CompleteClass */
  override def getActiveSubMeshCandidates(mesh: typingsJapgolly.babylonjs.BABYLON.AbstractMesh): ISmartArrayLike[typingsJapgolly.babylonjs.BABYLON.SubMesh] = js.native
  
  /**
    * Return the list of sub meshes colliding with a collider
    * @param mesh defines the mesh to find the submesh for
    * @param collider defines the collider to evaluate the collision against
    * @returns the list of colliding sub meshes
    */
  /* CompleteClass */
  override def getCollidingSubMeshCandidates(
    mesh: typingsJapgolly.babylonjs.BABYLON.AbstractMesh,
    collider: typingsJapgolly.babylonjs.BABYLON.Collider
  ): ISmartArrayLike[typingsJapgolly.babylonjs.BABYLON.SubMesh] = js.native
  
  /**
    * Return the list of sub meshes intersecting with a given local ray
    * @param mesh defines the mesh to find the submesh for
    * @param localRay defines the ray in local space
    * @returns the list of intersecting sub meshes
    */
  /* CompleteClass */
  override def getIntersectingSubMeshCandidates(
    mesh: typingsJapgolly.babylonjs.BABYLON.AbstractMesh,
    localRay: typingsJapgolly.babylonjs.BABYLON.Ray
  ): ISmartArrayLike[typingsJapgolly.babylonjs.BABYLON.SubMesh] = js.native
  
  /**
    * The component name help to identify the component in the list of scene components.
    */
  /* CompleteClass */
  override val name: /* "Octree" */ String = js.native
  
  /**
    * Rebuilds the elements related to this component in case of
    * context lost for instance.
    */
  /* CompleteClass */
  override def rebuild(): Unit = js.native
  
  /**
    * Registers the component in a given scene
    */
  /* CompleteClass */
  override def register(): Unit = js.native
  
  /**
    * The scene the component belongs to.
    */
  /* CompleteClass */
  var scene: typingsJapgolly.babylonjs.BABYLON.Scene = js.native
}
