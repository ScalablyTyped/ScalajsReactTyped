package typingsJapgolly.reactNative.mod.Animated

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-native", "Animated.Value")
@js.native
open class Value protected () extends AnimatedWithChildren {
  def this(value: Double) = this()
  def this(value: Double, config: AnimatedConfig) = this()
  
  /**
    * Sets the offset value to the base value, and resets the base value to zero.
    * The final output of the value is unchanged.
    */
  def extractOffset(): Unit = js.native
  
  /**
    * Merges the offset value into the base value and resets the offset to zero.
    * The final output of the value is unchanged.
    */
  def flattenOffset(): Unit = js.native
  
  /**
    * Interpolates the value before updating the property, e.g. mapping 0-1 to
    * 0-10.
    */
  def interpolate[OutputT /* <: Double | String */](config: InterpolationConfigType): AnimatedInterpolation[OutputT] = js.native
  
  /**
    * Sets an offset that is applied on top of whatever value is set, whether via
    * `setValue`, an animation, or `Animated.event`.  Useful for compensating
    * things like the start of a pan gesture.
    */
  def setOffset(offset: Double): Unit = js.native
  
  /**
    * Directly set the value.  This will stop any animations running on the value
    * and update all the bound properties.
    */
  def setValue(value: Double): Unit = js.native
  
  /**
    * Stops any running animation or tracking.  `callback` is invoked with the
    * final value after stopping the animation, which is useful for updating
    * state to match the animation position with layout.
    */
  def stopAnimation(): Unit = js.native
  def stopAnimation(callback: js.Function1[/* value */ Double, Unit]): Unit = js.native
}
