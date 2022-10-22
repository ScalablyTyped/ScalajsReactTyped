package typingsJapgolly.babylonjs.BABYLON

import typingsJapgolly.babylonjs.XRReferenceSpace
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebXRAnchorSystem
  extends StObject
     with WebXRAbstractFeature {
  
  /* private */ var _createAnchorAtTransformation: Any = js.native
  
  /**
    * avoiding using Array.find for global support.
    * @param xrAnchor the plane to find in the array
    */
  /* private */ var _findIndexInAnchorArray: Any = js.native
  
  /* private */ var _futureAnchors: Any = js.native
  
  /* private */ var _lastFrameDetected: Any = js.native
  
  /* private */ var _options: Any = js.native
  
  /* private */ var _populateTmpTransformation: Any = js.native
  
  /* private */ var _referenceSpaceForFrameAnchors: Any = js.native
  
  /* private */ var _tmpQuaternion: Any = js.native
  
  /* private */ var _tmpVector: Any = js.native
  
  /* private */ var _trackedAnchors: Any = js.native
  
  /* private */ var _updateAnchorWithXRFrame: Any = js.native
  
  /**
    * Add a new anchor at a specific position and rotation
    * This function will add a new anchor per default in the next available frame. Unless forced, the createAnchor function
    * will be called in the next xrFrame loop to make sure that the anchor can be created correctly.
    * An anchor is tracked only after it is added to the trackerAnchors in xrFrame. The promise returned here does not yet guaranty that.
    * Use onAnchorAddedObservable to get newly added anchors if you require tracking guaranty.
    *
    * @param position the position in which to add an anchor
    * @param rotationQuaternion an optional rotation for the anchor transformation
    * @param forceCreateInCurrentFrame force the creation of this anchor in the current frame. Must be called inside xrFrame loop!
    * @returns A promise that fulfills when babylon has created the corresponding WebXRAnchor object and tracking has begun
    */
  def addAnchorAtPositionAndRotationAsync(position: Vector3): js.Promise[IWebXRAnchor] = js.native
  def addAnchorAtPositionAndRotationAsync(position: Vector3, rotationQuaternion: Unit, forceCreateInCurrentFrame: Boolean): js.Promise[IWebXRAnchor] = js.native
  def addAnchorAtPositionAndRotationAsync(position: Vector3, rotationQuaternion: Quaternion): js.Promise[IWebXRAnchor] = js.native
  def addAnchorAtPositionAndRotationAsync(position: Vector3, rotationQuaternion: Quaternion, forceCreateInCurrentFrame: Boolean): js.Promise[IWebXRAnchor] = js.native
  
  /**
    * Create a new anchor point using a hit test result at a specific point in the scene
    * An anchor is tracked only after it is added to the trackerAnchors in xrFrame. The promise returned here does not yet guaranty that.
    * Use onAnchorAddedObservable to get newly added anchors if you require tracking guaranty.
    *
    * @param hitTestResult The hit test result to use for this anchor creation
    * @param position an optional position offset for this anchor
    * @param rotationQuaternion an optional rotation offset for this anchor
    * @returns A promise that fulfills when babylon has created the corresponding WebXRAnchor object and tracking has begun
    */
  def addAnchorPointUsingHitTestResultAsync(hitTestResult: IWebXRHitResult): js.Promise[IWebXRAnchor] = js.native
  def addAnchorPointUsingHitTestResultAsync(hitTestResult: IWebXRHitResult, position: Unit, rotationQuaternion: Quaternion): js.Promise[IWebXRAnchor] = js.native
  def addAnchorPointUsingHitTestResultAsync(hitTestResult: IWebXRHitResult, position: Vector3): js.Promise[IWebXRAnchor] = js.native
  def addAnchorPointUsingHitTestResultAsync(hitTestResult: IWebXRHitResult, position: Vector3, rotationQuaternion: Quaternion): js.Promise[IWebXRAnchor] = js.native
  
  /**
    * Get the list of anchors currently being tracked by the system
    */
  def anchors: js.Array[IWebXRAnchor] = js.native
  
  /**
    * Observers registered here will be executed when a new anchor was added to the session
    */
  var onAnchorAddedObservable: Observable[IWebXRAnchor] = js.native
  
  /**
    * Observers registered here will be executed when an anchor was removed from the session
    */
  var onAnchorRemovedObservable: Observable[IWebXRAnchor] = js.native
  
  /**
    * Observers registered here will be executed when an existing anchor updates
    * This can execute N times every frame
    */
  var onAnchorUpdatedObservable: Observable[IWebXRAnchor] = js.native
  
  /**
    * Set the reference space to use for anchor creation, when not using a hit test.
    * Will default to the session's reference space if not defined
    */
  def referenceSpaceForFrameAnchors_=(referenceSpace: XRReferenceSpace): Unit = js.native
}
