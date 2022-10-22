package typingsJapgolly.babylonjs.global.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.AssetsProgressEvent")
@js.native
open class AssetsProgressEvent protected ()
  extends StObject
     with typingsJapgolly.babylonjs.BABYLON.AssetsProgressEvent {
  /**
    * Creates a AssetsProgressEvent
    * @param remainingCount defines the number of remaining tasks to process
    * @param totalCount defines the total number of tasks
    * @param task defines the task that was just processed
    */
  def this(
    remainingCount: Double,
    totalCount: Double,
    task: typingsJapgolly.babylonjs.BABYLON.AbstractAssetTask
  ) = this()
  
  /**
    * Defines the number of remaining tasks to process
    */
  /* CompleteClass */
  var remainingCount: Double = js.native
  
  /**
    * Defines the task that was just processed
    */
  /* CompleteClass */
  var task: typingsJapgolly.babylonjs.BABYLON.AbstractAssetTask = js.native
  
  /**
    * Defines the total number of tasks
    */
  /* CompleteClass */
  var totalCount: Double = js.native
}
