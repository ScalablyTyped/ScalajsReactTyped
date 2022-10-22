package typingsJapgolly.babylonjs.global.BABYLON

import typingsJapgolly.babylonjs.BABYLON.Behavior
import typingsJapgolly.babylonjs.BABYLON.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.TargetCamera")
@js.native
open class TargetCamera protected ()
  extends StObject
     with typingsJapgolly.babylonjs.BABYLON.TargetCamera {
  /**
    * Instantiates a target camera that takes a mesh or position as a target and continues to look at it while it moves.
    * This is the base of the follow, arc rotate cameras and Free camera
    * @see https://doc.babylonjs.com/features/cameras
    * @param name Defines the name of the camera in the scene
    * @param position Defines the start position of the camera in the scene
    * @param scene Defines the scene the camera belongs to
    * @param setActiveOnSceneIfNoneActive Defines whether the camera should be marked as active if not other active cameras have been defined
    */
  def this(name: String, position: typingsJapgolly.babylonjs.BABYLON.Vector3) = this()
  def this(
    name: String,
    position: typingsJapgolly.babylonjs.BABYLON.Vector3,
    scene: typingsJapgolly.babylonjs.BABYLON.Scene
  ) = this()
  def this(
    name: String,
    position: typingsJapgolly.babylonjs.BABYLON.Vector3,
    scene: Unit,
    setActiveOnSceneIfNoneActive: Boolean
  ) = this()
  def this(
    name: String,
    position: typingsJapgolly.babylonjs.BABYLON.Vector3,
    scene: typingsJapgolly.babylonjs.BABYLON.Scene,
    setActiveOnSceneIfNoneActive: Boolean
  ) = this()
  
  /**
    * Attach a behavior
    * @param behavior defines the behavior to attach
    * @returns the current host
    */
  /* CompleteClass */
  override def addBehavior(behavior: Behavior[typingsJapgolly.babylonjs.BABYLON.Node]): typingsJapgolly.babylonjs.BABYLON.Node = js.native
  
  /**
    * Gets a behavior using its name to search
    * @param name defines the name to search
    * @returns the behavior or null if not found
    */
  /* CompleteClass */
  override def getBehaviorByName(name: String): Nullable[Behavior[typingsJapgolly.babylonjs.BABYLON.Node]] = js.native
  
  /**
    * Remove a behavior from the current object
    * @param behavior defines the behavior to detach
    * @returns the current host
    */
  /* CompleteClass */
  override def removeBehavior(behavior: Behavior[typingsJapgolly.babylonjs.BABYLON.Node]): typingsJapgolly.babylonjs.BABYLON.Node = js.native
}
/* static members */
object TargetCamera {
  
  @JSGlobal("BABYLON.TargetCamera")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("BABYLON.TargetCamera._RigCamTransformMatrix")
  @js.native
  def _RigCamTransformMatrix: Any = js.native
  inline def _RigCamTransformMatrix_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_RigCamTransformMatrix")(x.asInstanceOf[js.Any])
  
  @JSGlobal("BABYLON.TargetCamera._TargetFocalPoint")
  @js.native
  def _TargetFocalPoint: Any = js.native
  inline def _TargetFocalPoint_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_TargetFocalPoint")(x.asInstanceOf[js.Any])
  
  @JSGlobal("BABYLON.TargetCamera._TargetTransformMatrix")
  @js.native
  def _TargetTransformMatrix: Any = js.native
  inline def _TargetTransformMatrix_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_TargetTransformMatrix")(x.asInstanceOf[js.Any])
}
