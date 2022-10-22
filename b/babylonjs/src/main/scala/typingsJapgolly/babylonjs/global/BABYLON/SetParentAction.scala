package typingsJapgolly.babylonjs.global.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.SetParentAction")
@js.native
open class SetParentAction protected ()
  extends StObject
     with typingsJapgolly.babylonjs.BABYLON.SetParentAction {
  /**
    * Instantiate the action
    * @param triggerOptions defines the trigger options
    * @param target defines the target containing the parent property
    * @param parent defines from where the animation should start (animation frame)
    * @param condition defines the trigger related conditions
    */
  def this(triggerOptions: Any, target: Any, parent: Any) = this()
  def this(
    triggerOptions: Any,
    target: Any,
    parent: Any,
    condition: typingsJapgolly.babylonjs.BABYLON.Condition
  ) = this()
}
