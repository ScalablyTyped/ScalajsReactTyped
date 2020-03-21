package typingsJapgolly.reactNative.mod.Animated

import japgolly.scalajs.react.raw.React.Component
import japgolly.scalajs.react.raw.React.ComponentClassP
import typingsJapgolly.react.mod.ComponentClass
import typingsJapgolly.react.mod.ComponentState
import typingsJapgolly.react.mod.FunctionComponent
import typingsJapgolly.std.InstanceType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native", "Animated.createAnimatedComponent")
@js.native
object createAnimatedComponent extends js.Object {
  def apply(component: ComponentClass[ComponentProps[_], ComponentState]): AnimatedComponent[
    (ComponentClassP[ComponentProps[_] with js.Object]) | (InstanceType[ComponentClassP[ComponentProps[_] with js.Object]])
  ] = js.native
  def apply(component: FunctionComponent[ComponentProps[_]]): AnimatedComponent[
    FunctionComponent[ComponentProps[_]] | InstanceType[FunctionComponent[ComponentProps[_]]]
  ] = js.native
  def apply[T /* <: Component[ComponentProps[T] with js.Object, js.Object] */](component: T): AnimatedComponent[T | InstanceType[T]] = js.native
}

