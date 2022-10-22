package typingsJapgolly.babylonjs.global.BABYLON

import typingsJapgolly.babylonjs.anon.DragAxisDragPlaneNormal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.PointerDragBehavior")
@js.native
/**
  * Creates a pointer drag behavior that can be attached to a mesh
  * @param options The drag axis or normal of the plane that will be dragged across. If no options are specified the drag plane will always face the ray's origin (eg. camera)
  * @param options.dragAxis
  * @param options.dragPlaneNormal
  */
open class PointerDragBehavior ()
  extends StObject
     with typingsJapgolly.babylonjs.BABYLON.PointerDragBehavior {
  def this(options: DragAxisDragPlaneNormal) = this()
  
  /**
    * Called when the behavior is attached to a target
    * @param target defines the target where the behavior is attached to
    */
  /* CompleteClass */
  override def attach(target: typingsJapgolly.babylonjs.BABYLON.AbstractMesh): Unit = js.native
  
  /**
    * Called when the behavior is detached from its target
    */
  /* CompleteClass */
  override def detach(): Unit = js.native
  
  /**
    * Function called when the behavior needs to be initialized (after attaching it to a target)
    */
  /* CompleteClass */
  override def init(): Unit = js.native
  
  /** gets or sets behavior's name */
  /* CompleteClass */
  var name: String = js.native
}
/* static members */
object PointerDragBehavior {
  
  @JSGlobal("BABYLON.PointerDragBehavior")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("BABYLON.PointerDragBehavior._AnyMouseId")
  @js.native
  def _AnyMouseId: Any = js.native
  inline def _AnyMouseId_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_AnyMouseId")(x.asInstanceOf[js.Any])
  
  @JSGlobal("BABYLON.PointerDragBehavior._PlaneScene")
  @js.native
  def _PlaneScene: Any = js.native
  inline def _PlaneScene_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_PlaneScene")(x.asInstanceOf[js.Any])
}
