package typingsJapgolly.coreDashJs

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Set[T] extends js.Object {
  def toJSON(): js.Any
}

object Set {
  @scala.inline
  def apply[T](toJSON: CallbackTo[js.Any]): Set[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("toJSON")(toJSON.toJsFn)
    __obj.asInstanceOf[Set[T]]
  }
}

