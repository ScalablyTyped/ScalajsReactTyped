package typingsJapgolly.babylonjs.global.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.CombineAction")
@js.native
open class CombineAction protected ()
  extends StObject
     with typingsJapgolly.babylonjs.BABYLON.CombineAction {
  /**
    * Instantiate the action
    * @param triggerOptions defines the trigger options
    * @param children defines the list of aggregated animations to run
    * @param condition defines the trigger related conditions
    * @param enableChildrenConditions defines if the children actions conditions should be check before execution
    */
  def this(triggerOptions: Any, children: js.Array[typingsJapgolly.babylonjs.BABYLON.Action]) = this()
  def this(
    triggerOptions: Any,
    children: js.Array[typingsJapgolly.babylonjs.BABYLON.Action],
    condition: typingsJapgolly.babylonjs.BABYLON.Condition
  ) = this()
  def this(
    triggerOptions: Any,
    children: js.Array[typingsJapgolly.babylonjs.BABYLON.Action],
    condition: Unit,
    enableChildrenConditions: Boolean
  ) = this()
  def this(
    triggerOptions: Any,
    children: js.Array[typingsJapgolly.babylonjs.BABYLON.Action],
    condition: typingsJapgolly.babylonjs.BABYLON.Condition,
    enableChildrenConditions: Boolean
  ) = this()
}
