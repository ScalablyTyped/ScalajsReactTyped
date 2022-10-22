package typingsJapgolly.babylonjs.BABYLON

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OctreeSceneComponent extends StObject {
  
  /* private */ var _tempRay: Any
  
  /**
    * Indicates if the meshes have been checked to make sure they are isEnabled()
    */
  val checksIsEnabled: /* true */ Boolean
  
  /**
    * Disposes the component and the associated resources.
    */
  def dispose(): Unit
  
  /**
    * Return the list of active meshes
    * @returns the list of active meshes
    */
  def getActiveMeshCandidates(): ISmartArrayLike[AbstractMesh]
  
  /**
    * Return the list of active sub meshes
    * @param mesh The mesh to get the candidates sub meshes from
    * @returns the list of active sub meshes
    */
  def getActiveSubMeshCandidates(mesh: AbstractMesh): ISmartArrayLike[SubMesh]
  
  /**
    * Return the list of sub meshes colliding with a collider
    * @param mesh defines the mesh to find the submesh for
    * @param collider defines the collider to evaluate the collision against
    * @returns the list of colliding sub meshes
    */
  def getCollidingSubMeshCandidates(mesh: AbstractMesh, collider: Collider): ISmartArrayLike[SubMesh]
  
  /**
    * Return the list of sub meshes intersecting with a given local ray
    * @param mesh defines the mesh to find the submesh for
    * @param localRay defines the ray in local space
    * @returns the list of intersecting sub meshes
    */
  def getIntersectingSubMeshCandidates(mesh: AbstractMesh, localRay: Ray): ISmartArrayLike[SubMesh]
  
  /**
    * The component name help to identify the component in the list of scene components.
    */
  val name: /* "Octree" */ String
  
  /**
    * Rebuilds the elements related to this component in case of
    * context lost for instance.
    */
  def rebuild(): Unit
  
  /**
    * Registers the component in a given scene
    */
  def register(): Unit
  
  /**
    * The scene the component belongs to.
    */
  var scene: Scene
}
object OctreeSceneComponent {
  
  inline def apply(
    _tempRay: Any,
    checksIsEnabled: /* true */ Boolean,
    dispose: Callback,
    getActiveMeshCandidates: CallbackTo[ISmartArrayLike[AbstractMesh]],
    getActiveSubMeshCandidates: AbstractMesh => ISmartArrayLike[SubMesh],
    getCollidingSubMeshCandidates: (AbstractMesh, Collider) => ISmartArrayLike[SubMesh],
    getIntersectingSubMeshCandidates: (AbstractMesh, Ray) => ISmartArrayLike[SubMesh],
    name: /* "Octree" */ String,
    rebuild: Callback,
    register: Callback,
    scene: Scene
  ): OctreeSceneComponent = {
    val __obj = js.Dynamic.literal(_tempRay = _tempRay.asInstanceOf[js.Any], checksIsEnabled = checksIsEnabled.asInstanceOf[js.Any], dispose = dispose.toJsFn, getActiveMeshCandidates = getActiveMeshCandidates.toJsFn, getActiveSubMeshCandidates = js.Any.fromFunction1(getActiveSubMeshCandidates), getCollidingSubMeshCandidates = js.Any.fromFunction2(getCollidingSubMeshCandidates), getIntersectingSubMeshCandidates = js.Any.fromFunction2(getIntersectingSubMeshCandidates), name = name.asInstanceOf[js.Any], rebuild = rebuild.toJsFn, register = register.toJsFn, scene = scene.asInstanceOf[js.Any])
    __obj.asInstanceOf[OctreeSceneComponent]
  }
  
  extension [Self <: OctreeSceneComponent](x: Self) {
    
    inline def setChecksIsEnabled(value: /* true */ Boolean): Self = StObject.set(x, "checksIsEnabled", value.asInstanceOf[js.Any])
    
    inline def setDispose(value: Callback): Self = StObject.set(x, "dispose", value.toJsFn)
    
    inline def setGetActiveMeshCandidates(value: CallbackTo[ISmartArrayLike[AbstractMesh]]): Self = StObject.set(x, "getActiveMeshCandidates", value.toJsFn)
    
    inline def setGetActiveSubMeshCandidates(value: AbstractMesh => ISmartArrayLike[SubMesh]): Self = StObject.set(x, "getActiveSubMeshCandidates", js.Any.fromFunction1(value))
    
    inline def setGetCollidingSubMeshCandidates(value: (AbstractMesh, Collider) => ISmartArrayLike[SubMesh]): Self = StObject.set(x, "getCollidingSubMeshCandidates", js.Any.fromFunction2(value))
    
    inline def setGetIntersectingSubMeshCandidates(value: (AbstractMesh, Ray) => ISmartArrayLike[SubMesh]): Self = StObject.set(x, "getIntersectingSubMeshCandidates", js.Any.fromFunction2(value))
    
    inline def setName(value: /* "Octree" */ String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setRebuild(value: Callback): Self = StObject.set(x, "rebuild", value.toJsFn)
    
    inline def setRegister(value: Callback): Self = StObject.set(x, "register", value.toJsFn)
    
    inline def setScene(value: Scene): Self = StObject.set(x, "scene", value.asInstanceOf[js.Any])
    
    inline def set_tempRay(value: Any): Self = StObject.set(x, "_tempRay", value.asInstanceOf[js.Any])
  }
}
