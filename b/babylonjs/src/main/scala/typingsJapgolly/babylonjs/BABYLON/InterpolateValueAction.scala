package typingsJapgolly.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InterpolateValueAction
  extends StObject
     with Action {
  
  /* private */ var _effectiveTarget: Any = js.native
  
  /* private */ var _property: Any = js.native
  
  /* private */ var _target: Any = js.native
  
  /**
    * Defines the time it will take for the property to interpolate to the value.
    */
  var duration: Double = js.native
  
  /**
    * Defines a callback raised once the interpolation animation has been done.
    */
  var onInterpolationDone: js.UndefOr[js.Function0[Unit]] = js.native
  
  /**
    * Observable triggered once the interpolation animation has been done.
    */
  var onInterpolationDoneObservable: Observable[InterpolateValueAction] = js.native
  
  /**
    * Defines the path of the property where the value should be interpolated
    */
  var propertyPath: String = js.native
  
  /**
    * Defines if the other scene animations should be stopped when the action has been triggered
    */
  var stopOtherAnimations: js.UndefOr[Boolean] = js.native
  
  /**
    * Defines the target value at the end of the interpolation.
    */
  var value: Any = js.native
}
