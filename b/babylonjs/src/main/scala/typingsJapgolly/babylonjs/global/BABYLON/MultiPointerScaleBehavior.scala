package typingsJapgolly.babylonjs.global.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.MultiPointerScaleBehavior")
@js.native
/**
  * Instantiate a new behavior that when attached to a mesh will allow the mesh to be scaled
  */
open class MultiPointerScaleBehavior ()
  extends StObject
     with typingsJapgolly.babylonjs.BABYLON.MultiPointerScaleBehavior {
  
  /**
    * Called when the behavior is attached to a target
    * @param target defines the target where the behavior is attached to
    */
  /* CompleteClass */
  override def attach(target: typingsJapgolly.babylonjs.BABYLON.Mesh): Unit = js.native
  
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
