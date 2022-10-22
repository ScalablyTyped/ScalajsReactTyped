package typingsJapgolly.babylonjs.global.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.AnimationEvent")
@js.native
open class AnimationEvent protected ()
  extends StObject
     with typingsJapgolly.babylonjs.BABYLON.AnimationEvent {
  /**
    * Initializes the animation event
    * @param frame The frame for which the event is triggered
    * @param action The event to perform when triggered
    * @param onlyOnce Specifies if the event should be triggered only once
    */
  def this(
    /** The frame for which the event is triggered **/
  frame: Double,
    /** The event to perform when triggered **/
  action: js.Function1[/* currentFrame */ Double, Unit]
  ) = this()
  def this(
    /** The frame for which the event is triggered **/
  frame: Double,
    /** The event to perform when triggered **/
  action: js.Function1[/* currentFrame */ Double, Unit],
    /** Specifies if the event should be triggered only once**/
  onlyOnce: Boolean
  ) = this()
  
  /** @internal */
  /* CompleteClass */
  override def _clone(): typingsJapgolly.babylonjs.BABYLON.AnimationEvent = js.native
  
  /** The event to perform when triggered **/
  /* CompleteClass */
  override def action(currentFrame: Double): Unit = js.native
  
  /** The frame for which the event is triggered **/
  /* CompleteClass */
  var frame: Double = js.native
  
  /**
    * Specifies if the animation event is done
    */
  /* CompleteClass */
  var isDone: Boolean = js.native
}
