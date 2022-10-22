package typingsJapgolly.babylonjs.anon

import typingsJapgolly.babylonjs.BABYLON.IWebXRMotionControllerAxesValue
import typingsJapgolly.babylonjs.BABYLON.MotionControllerComponentType
import typingsJapgolly.babylonjs.BABYLON.Nullable
import typingsJapgolly.babylonjs.BABYLON.WebXRControllerComponent
import typingsJapgolly.babylonjs.BABYLON.WebXRControllerMovementFeatureContext
import typingsJapgolly.babylonjs.BABYLON.WebXRControllerMovementRegistrationConfiguration
import typingsJapgolly.babylonjs.BABYLON.WebXRControllerMovementState
import typingsJapgolly.babylonjs.BABYLON.WebXRInput
import typingsJapgolly.babylonjs.BABYLON.WebXRInputSource
import typingsJapgolly.babylonjs.XRHandedness
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {axisChangedHandler (axes : babylonjs.BABYLON.IWebXRMotionControllerAxesValue, movementState : babylonjs.BABYLON.WebXRControllerMovementState, featureContext : babylonjs.BABYLON.WebXRControllerMovementFeatureContext, xrInput : babylonjs.BABYLON.WebXRInput): void} & {  allowedComponentTypes :std.Array<babylonjs.BABYLON.MotionControllerComponentType> | undefined,   forceHandedness :babylonjs.XRHandedness | undefined,   mainComponentOnly :boolean | undefined,   componentSelectionPredicate :(xrController : babylonjs.BABYLON.WebXRInputSource): babylonjs.BABYLON.Nullable<babylonjs.BABYLON.WebXRControllerComponent> | undefined} */
trait axisChangedHandleraxesIWeAllowedComponentTypes
  extends StObject
     with WebXRControllerMovementRegistrationConfiguration {
  
  /**
    * handlers are filtered to these types only
    */
  var allowedComponentTypes: js.UndefOr[js.Array[MotionControllerComponentType]] = js.undefined
  
  /**
    * Called when axis changes occur.
    */
  def axisChangedHandler(
    axes: IWebXRMotionControllerAxesValue,
    movementState: WebXRControllerMovementState,
    featureContext: WebXRControllerMovementFeatureContext,
    xrInput: WebXRInput
  ): Unit
  
  /**
    * Additional predicate to apply to controllers to restrict a handler being added.
    */
  var componentSelectionPredicate: js.UndefOr[
    js.Function1[/* xrController */ WebXRInputSource, Nullable[WebXRControllerComponent]]
  ] = js.undefined
  
  /**
    * For registering movement to specific hand only.  Useful if your app has a "main hand" and "off hand" for determining the functionality of a controller.
    */
  var forceHandedness: js.UndefOr[XRHandedness] = js.undefined
  
  /**
    * For main component only (useful for buttons and may not trigger axis changes).
    */
  var mainComponentOnly: js.UndefOr[Boolean] = js.undefined
}
object axisChangedHandleraxesIWeAllowedComponentTypes {
  
  inline def apply(
    axisChangedHandler: (IWebXRMotionControllerAxesValue, WebXRControllerMovementState, WebXRControllerMovementFeatureContext, WebXRInput) => japgolly.scalajs.react.Callback
  ): axisChangedHandleraxesIWeAllowedComponentTypes = {
    val __obj = js.Dynamic.literal(axisChangedHandler = js.Any.fromFunction4((t0: IWebXRMotionControllerAxesValue, t1: WebXRControllerMovementState, t2: WebXRControllerMovementFeatureContext, t3: WebXRInput) => (axisChangedHandler(t0, t1, t2, t3)).runNow()))
    __obj.asInstanceOf[axisChangedHandleraxesIWeAllowedComponentTypes]
  }
  
  extension [Self <: axisChangedHandleraxesIWeAllowedComponentTypes](x: Self) {
    
    inline def setAllowedComponentTypes(value: js.Array[MotionControllerComponentType]): Self = StObject.set(x, "allowedComponentTypes", value.asInstanceOf[js.Any])
    
    inline def setAllowedComponentTypesUndefined: Self = StObject.set(x, "allowedComponentTypes", js.undefined)
    
    inline def setAllowedComponentTypesVarargs(value: MotionControllerComponentType*): Self = StObject.set(x, "allowedComponentTypes", js.Array(value*))
    
    inline def setAxisChangedHandler(
      value: (IWebXRMotionControllerAxesValue, WebXRControllerMovementState, WebXRControllerMovementFeatureContext, WebXRInput) => japgolly.scalajs.react.Callback
    ): Self = StObject.set(x, "axisChangedHandler", js.Any.fromFunction4((t0: IWebXRMotionControllerAxesValue, t1: WebXRControllerMovementState, t2: WebXRControllerMovementFeatureContext, t3: WebXRInput) => (value(t0, t1, t2, t3)).runNow()))
    
    inline def setComponentSelectionPredicate(value: /* xrController */ WebXRInputSource => Nullable[WebXRControllerComponent]): Self = StObject.set(x, "componentSelectionPredicate", js.Any.fromFunction1(value))
    
    inline def setComponentSelectionPredicateUndefined: Self = StObject.set(x, "componentSelectionPredicate", js.undefined)
    
    inline def setForceHandedness(value: XRHandedness): Self = StObject.set(x, "forceHandedness", value.asInstanceOf[js.Any])
    
    inline def setForceHandednessUndefined: Self = StObject.set(x, "forceHandedness", js.undefined)
    
    inline def setMainComponentOnly(value: Boolean): Self = StObject.set(x, "mainComponentOnly", value.asInstanceOf[js.Any])
    
    inline def setMainComponentOnlyUndefined: Self = StObject.set(x, "mainComponentOnly", js.undefined)
  }
}
