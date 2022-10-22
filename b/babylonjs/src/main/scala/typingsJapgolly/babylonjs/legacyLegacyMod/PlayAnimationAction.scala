package typingsJapgolly.babylonjs.legacyLegacyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Legacy/legacy", "PlayAnimationAction")
@js.native
open class PlayAnimationAction protected ()
  extends typingsJapgolly.babylonjs.indexMod.PlayAnimationAction {
  /**
    * Instantiate the action
    * @param triggerOptions defines the trigger options
    * @param target defines the target animation or animation name
    * @param from defines from where the animation should start (animation frame)
    * @param to defines where the animation should stop (animation frame)
    * @param loop defines if the animation should loop or stop after the first play
    * @param condition defines the trigger related conditions
    */
  def this(triggerOptions: Any, target: Any, from: Double, to: Double) = this()
  def this(triggerOptions: Any, target: Any, from: Double, to: Double, loop: Boolean) = this()
  def this(
    triggerOptions: Any,
    target: Any,
    from: Double,
    to: Double,
    loop: Boolean,
    condition: typingsJapgolly.babylonjs.actionsConditionMod.Condition
  ) = this()
  def this(
    triggerOptions: Any,
    target: Any,
    from: Double,
    to: Double,
    loop: Unit,
    condition: typingsJapgolly.babylonjs.actionsConditionMod.Condition
  ) = this()
}
