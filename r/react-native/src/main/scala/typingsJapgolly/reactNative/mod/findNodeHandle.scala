package typingsJapgolly.reactNative.mod

import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.ComponentClass
import typingsJapgolly.react.mod.ComponentState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native", "findNodeHandle")
@js.native
object findNodeHandle extends js.Object {
  def apply(): Null | Double = js.native
  def apply(componentOrHandle: Double): Null | Double = js.native
  def apply(componentOrHandle: Component[_, _, _]): Null | Double = js.native
  def apply(componentOrHandle: ComponentClass[_, ComponentState]): Null | Double = js.native
}

