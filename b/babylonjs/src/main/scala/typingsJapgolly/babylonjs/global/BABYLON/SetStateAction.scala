package typingsJapgolly.babylonjs.global.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.SetStateAction")
@js.native
open class SetStateAction protected ()
  extends StObject
     with typingsJapgolly.babylonjs.BABYLON.SetStateAction {
  /**
    * Instantiate the action
    * @param triggerOptions defines the trigger options
    * @param target defines the object containing the state property
    * @param value defines the value to store in the state field
    * @param condition defines the trigger related conditions
    */
  def this(triggerOptions: Any, target: Any, value: String) = this()
  def this(
    triggerOptions: Any,
    target: Any,
    value: String,
    condition: typingsJapgolly.babylonjs.BABYLON.Condition
  ) = this()
}
