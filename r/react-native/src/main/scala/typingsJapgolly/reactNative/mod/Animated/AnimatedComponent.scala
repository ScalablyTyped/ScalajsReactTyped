package typingsJapgolly.reactNative.mod.Animated

import japgolly.scalajs.react.raw.React.Component
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.react.mod.FunctionComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnimatedComponent[T /* <: ComponentType[ComponentProps[T]] | (Component[ComponentProps[T] with js.Object, js.Object]) */] extends FunctionComponent[AnimatedProps[ComponentProps[T]]] {
  def getNode(): T = js.native
}

