package typingsJapgolly.underscore.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChainSingle[T] extends js.Object {
  def value(): T
}

object ChainSingle {
  @scala.inline
  def apply[T](value: CallbackTo[T]): ChainSingle[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("value")(value.toJsFn)
    __obj.asInstanceOf[ChainSingle[T]]
  }
}

