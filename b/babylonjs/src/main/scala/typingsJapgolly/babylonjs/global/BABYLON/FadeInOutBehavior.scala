package typingsJapgolly.babylonjs.global.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.FadeInOutBehavior")
@js.native
/**
  * Instantiates the FadeInOutBehavior
  */
open class FadeInOutBehavior ()
  extends StObject
     with typingsJapgolly.babylonjs.BABYLON.FadeInOutBehavior {
  
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
