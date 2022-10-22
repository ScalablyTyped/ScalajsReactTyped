package typingsJapgolly.babylonjs.BABYLON

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.babylonjs.anon.axisChangedHandleraxesIWeAllowedComponentTypes
  - typingsJapgolly.babylonjs.anon.buttonChangedhandlerpressAllowedComponentTypes
*/
trait WebXRControllerMovementRegistrationConfiguration extends StObject
object WebXRControllerMovementRegistrationConfiguration {
  
  inline def axisChangedHandleraxesIWeAllowedComponentTypes(
    axisChangedHandler: (IWebXRMotionControllerAxesValue, WebXRControllerMovementState, WebXRControllerMovementFeatureContext, WebXRInput) => Callback
  ): typingsJapgolly.babylonjs.anon.axisChangedHandleraxesIWeAllowedComponentTypes = {
    val __obj = js.Dynamic.literal(axisChangedHandler = js.Any.fromFunction4((t0: IWebXRMotionControllerAxesValue, t1: WebXRControllerMovementState, t2: WebXRControllerMovementFeatureContext, t3: WebXRInput) => (axisChangedHandler(t0, t1, t2, t3)).runNow()))
    __obj.asInstanceOf[typingsJapgolly.babylonjs.anon.axisChangedHandleraxesIWeAllowedComponentTypes]
  }
  
  inline def buttonChangedhandlerpressAllowedComponentTypes(
    buttonChangedhandler: (IWebXRMotionControllerComponentChangesValues[Boolean], WebXRControllerMovementState, WebXRControllerMovementFeatureContext, WebXRInput) => Callback
  ): typingsJapgolly.babylonjs.anon.buttonChangedhandlerpressAllowedComponentTypes = {
    val __obj = js.Dynamic.literal(buttonChangedhandler = js.Any.fromFunction4((t0: IWebXRMotionControllerComponentChangesValues[Boolean], t1: WebXRControllerMovementState, t2: WebXRControllerMovementFeatureContext, t3: WebXRInput) => (buttonChangedhandler(t0, t1, t2, t3)).runNow()))
    __obj.asInstanceOf[typingsJapgolly.babylonjs.anon.buttonChangedhandlerpressAllowedComponentTypes]
  }
}
