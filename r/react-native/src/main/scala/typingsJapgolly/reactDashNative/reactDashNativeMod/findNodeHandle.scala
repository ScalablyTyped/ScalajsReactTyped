package typingsJapgolly.reactDashNative.reactDashNativeMod

import typingsJapgolly.react.reactMod.Component
import typingsJapgolly.react.reactMod.ComponentClass
import typingsJapgolly.react.reactMod.ComponentState
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

