package typingsJapgolly.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CombineAction
  extends StObject
     with Action {
  
  /**
    * The list of aggregated animations to run.
    */
  var children: js.Array[Action] = js.native
  
  /**
    * defines if the children actions conditions should be check before execution
    */
  var enableChildrenConditions: Boolean = js.native
}
