package typingsJapgolly.dbJs.DbJs

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyableQuery[T] extends js.Object {
  def keys(): KeysQuery[T]
}

object KeyableQuery {
  @scala.inline
  def apply[T](keys: CallbackTo[KeysQuery[T]]): KeyableQuery[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("keys")(keys.toJsFn)
    __obj.asInstanceOf[KeyableQuery[T]]
  }
}

