package typingsJapgolly.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UtilityLayerRenderer
  extends StObject
     with IDisposable {
  
  /* private */ var _afterRenderObserver: Any = js.native
  
  /**
    * @internal
    * Light which used by gizmos to get light shading
    */
  def _getSharedGizmoLight(): HemisphericLight = js.native
  
  /* private */ var _lastPointerEvents: Any = js.native
  
  /* private */ var _notifyObservers: Any = js.native
  
  /* private */ var _originalPointerObserver: Any = js.native
  
  /* private */ var _pointerCaptures: Any = js.native
  
  /* private */ var _renderCamera: Any = js.native
  
  /* private */ var _sceneDisposeObserver: Any = js.native
  
  /* private */ var _sharedGizmoLight: Any = js.native
  
  /* private */ var _updateCamera: Any = js.native
  
  /**
    * Gets the camera that is used to render the utility layer (when not set, this will be the last active camera)
    * @param getRigParentIfPossible if the current active camera is a rig camera, should its parent camera be returned
    * @returns the camera that is used when rendering the utility layer
    */
  def getRenderCamera(): Camera = js.native
  def getRenderCamera(getRigParentIfPossible: Boolean): Camera = js.native
  
  /** Gets or sets a predicate that will be used to indicate utility meshes present in the main scene */
  def mainSceneTrackerPredicate(mesh: Nullable[AbstractMesh]): Boolean = js.native
  
  /**
    * Observable raised when the pointer moves from the utility layer scene to the main scene
    */
  var onPointerOutObservable: Observable[Double] = js.native
  
  /**
    * If set to true, only pointer down onPointerObservable events will be blocked when picking is occluded by original scene
    */
  var onlyCheckPointerDownEvents: Boolean = js.native
  
  /** the original scene that will be rendered on top of */
  var originalScene: Scene = js.native
  
  /**
    * If the picking should be done on the utility layer prior to the actual scene (Default: true)
    */
  var pickUtilitySceneFirst: Boolean = js.native
  
  /**
    * Set to false to disable picking
    */
  var pickingEnabled: Boolean = js.native
  
  /**
    * If set to false, only pointerUp, pointerDown and pointerMove will be sent to the utilityLayerScene (false by default)
    */
  var processAllEvents: Boolean = js.native
  
  /**
    * Renders the utility layers scene on top of the original scene
    */
  def render(): Unit = js.native
  
  /**
    * Sets the camera that should be used when rendering the utility layer (If set to null the last active camera will be used)
    * @param cam the camera that should be used when rendering the utility layer
    */
  def setRenderCamera(cam: Nullable[Camera]): Unit = js.native
  
  /**
    *  If the utility layer should automatically be rendered on top of existing scene
    */
  var shouldRender: Boolean = js.native
  
  /**
    * The scene that is rendered on top of the original scene
    */
  var utilityLayerScene: Scene = js.native
}
