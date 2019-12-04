package typingsJapgolly.reactDashNavigationDashStack

import typingsJapgolly.reactDashNative.reactDashNativeMod.Animated.CompositeAnimation
import typingsJapgolly.reactDashNative.reactDashNativeMod.Animated.TimingAnimationConfig
import typingsJapgolly.reactDashNative.reactDashNativeMod.Animated.Value
import typingsJapgolly.reactDashNative.reactDashNativeMod.Animated.ValueXY
import typingsJapgolly.reactDashNative.reactDashNativeMod.EasingFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_ConfigDuration extends js.Object {
  var duration: Double = js.native
  var easing: EasingFunction = js.native
  def timing(value: ValueXY, config: TimingAnimationConfig): CompositeAnimation = js.native
  def timing(value: Value, config: TimingAnimationConfig): CompositeAnimation = js.native
}

