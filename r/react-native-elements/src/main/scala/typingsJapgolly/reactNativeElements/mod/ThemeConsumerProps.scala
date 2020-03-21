package typingsJapgolly.reactNativeElements.mod

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThemeConsumerProps[T] extends js.Object {
  def children(props: ThemeProps[T]): Node
}

object ThemeConsumerProps {
  @scala.inline
  def apply[T](children: ThemeProps[T] => CallbackTo[Node]): ThemeConsumerProps[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("children")(js.Any.fromFunction1((t0: typingsJapgolly.reactNativeElements.mod.ThemeProps[T]) => children(t0).runNow()))
    __obj.asInstanceOf[ThemeConsumerProps[T]]
  }
}

