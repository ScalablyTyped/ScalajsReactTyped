package typingsJapgolly.babylonjs.global.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.EasingFunction")
@js.native
open class EasingFunction ()
  extends StObject
     with typingsJapgolly.babylonjs.BABYLON.EasingFunction {
  
  /* private */ /* CompleteClass */
  var _easingMode: Any = js.native
  
  /**
    * Given an input gradient between 0 and 1, this returns the corresponding value
    * of the easing function.
    * The link below provides some of the most common examples of easing functions.
    * @see https://easings.net/
    * @param gradient Defines the value between 0 and 1 we want the easing value for
    * @returns the corresponding value on the curve defined by the easing function
    */
  /* CompleteClass */
  override def ease(gradient: Double): Double = js.native
  
  /**
    * @internal
    */
  /* CompleteClass */
  override def easeInCore(gradient: Double): Double = js.native
  
  /**
    * Gets the current easing mode.
    * @returns the easing mode
    */
  /* CompleteClass */
  override def getEasingMode(): Double = js.native
  
  /**
    * Sets the easing mode of the current function.
    * @param easingMode Defines the willing mode (EASINGMODE_EASEIN, EASINGMODE_EASEOUT or EASINGMODE_EASEINOUT)
    */
  /* CompleteClass */
  override def setEasingMode(easingMode: Double): Unit = js.native
}
/* static members */
object EasingFunction {
  
  /**
    * Interpolation follows the mathematical formula associated with the easing function.
    */
  @JSGlobal("BABYLON.EasingFunction.EASINGMODE_EASEIN")
  @js.native
  val EASINGMODE_EASEIN: /* 0 */ Double = js.native
  
  /**
    * Interpolation uses EaseIn for the first half of the animation and EaseOut for the second half.
    */
  @JSGlobal("BABYLON.EasingFunction.EASINGMODE_EASEINOUT")
  @js.native
  val EASINGMODE_EASEINOUT: /* 2 */ Double = js.native
  
  /**
    * Interpolation follows 100% interpolation minus the output of the formula associated with the easing function.
    */
  @JSGlobal("BABYLON.EasingFunction.EASINGMODE_EASEOUT")
  @js.native
  val EASINGMODE_EASEOUT: /* 1 */ Double = js.native
}
