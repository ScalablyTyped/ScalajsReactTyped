package typingsJapgolly.babylonjs.legacyLegacyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Legacy/legacy", "CombineAction")
@js.native
open class CombineAction protected ()
  extends typingsJapgolly.babylonjs.indexMod.CombineAction {
  /**
    * Instantiate the action
    * @param triggerOptions defines the trigger options
    * @param children defines the list of aggregated animations to run
    * @param condition defines the trigger related conditions
    * @param enableChildrenConditions defines if the children actions conditions should be check before execution
    */
  def this(triggerOptions: Any, children: js.Array[typingsJapgolly.babylonjs.actionsActionMod.Action]) = this()
  def this(
    triggerOptions: Any,
    children: js.Array[typingsJapgolly.babylonjs.actionsActionMod.Action],
    condition: typingsJapgolly.babylonjs.actionsConditionMod.Condition
  ) = this()
  def this(
    triggerOptions: Any,
    children: js.Array[typingsJapgolly.babylonjs.actionsActionMod.Action],
    condition: Unit,
    enableChildrenConditions: Boolean
  ) = this()
  def this(
    triggerOptions: Any,
    children: js.Array[typingsJapgolly.babylonjs.actionsActionMod.Action],
    condition: typingsJapgolly.babylonjs.actionsConditionMod.Condition,
    enableChildrenConditions: Boolean
  ) = this()
}
