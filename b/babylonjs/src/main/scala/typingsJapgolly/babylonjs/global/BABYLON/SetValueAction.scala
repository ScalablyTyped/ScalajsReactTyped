package typingsJapgolly.babylonjs.global.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.SetValueAction")
@js.native
open class SetValueAction protected ()
  extends StObject
     with typingsJapgolly.babylonjs.BABYLON.SetValueAction {
  /**
    * Instantiate the action
    * @param triggerOptions defines the trigger options
    * @param target defines the object containing the property
    * @param propertyPath defines the path of the property to set in the target
    * @param value defines the value to set in the property
    * @param condition defines the trigger related conditions
    */
  def this(triggerOptions: Any, target: Any, propertyPath: String, value: Any) = this()
  def this(
    triggerOptions: Any,
    target: Any,
    propertyPath: String,
    value: Any,
    condition: typingsJapgolly.babylonjs.BABYLON.Condition
  ) = this()
}
