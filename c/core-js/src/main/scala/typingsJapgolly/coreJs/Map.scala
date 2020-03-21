package typingsJapgolly.coreJs

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Map[K, V] extends js.Object {
  def toJSON(): js.Any
}

object Map {
  @scala.inline
  def apply[K, V](toJSON: CallbackTo[js.Any]): Map[K, V] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("toJSON")(toJSON.toJsFn)
    __obj.asInstanceOf[Map[K, V]]
  }
}

