package typingsJapgolly.typescriptServices.TypeScript

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Iterator[T] extends js.Object {
  def current(): T
  def moveNext(): Boolean
}

object Iterator {
  @scala.inline
  def apply[T](current: CallbackTo[T], moveNext: CallbackTo[Boolean]): Iterator[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("current")(current.toJsFn)
    __obj.updateDynamic("moveNext")(moveNext.toJsFn)
    __obj.asInstanceOf[Iterator[T]]
  }
}

