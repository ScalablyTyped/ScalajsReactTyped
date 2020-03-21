package typingsJapgolly.reactNativeAnimatable.mod

import typingsJapgolly.react.mod.ClassicComponentClass
import typingsJapgolly.react.mod.ComponentClass
import typingsJapgolly.react.mod.ComponentState
import typingsJapgolly.react.mod.StatelessComponent
import typingsJapgolly.reactNativeAnimatable.AnonStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-animatable", "createAnimatableComponent")
@js.native
object createAnimatableComponent extends js.Object {
  def apply[P /* <: AnonStyle */, S](Component: ClassicComponentClass[P]): AnimatableComponent[P, S] = js.native
  def apply[P /* <: AnonStyle */, S](Component: ComponentClass[P, ComponentState]): AnimatableComponent[P, S] = js.native
  def apply[P /* <: AnonStyle */, S](Component: StatelessComponent[P]): AnimatableComponent[P, S] = js.native
}

