package typingsJapgolly.reactNavigationStack

import typingsJapgolly.reactNative.mod.Animated.AnimatedValue
import typingsJapgolly.reactNative.mod.Animated.AnimatedValueXY
import typingsJapgolly.reactNative.mod.Animated.CompositeAnimation
import typingsJapgolly.reactNative.mod.Animated.SpringAnimationConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnCallValueConfig extends js.Object {
  def apply(value: AnimatedValueXY, config: SpringAnimationConfig): CompositeAnimation = js.native
  def apply(value: AnimatedValue, config: SpringAnimationConfig): CompositeAnimation = js.native
}

