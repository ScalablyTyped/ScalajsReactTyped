package typingsJapgolly.normalizr.mod.schema

import japgolly.scalajs.react.Callback
import typingsJapgolly.normalizr.mod.Schema_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Object[T] extends Schema_[T] {
  def define(definition: Schema_[_]): Unit
}

object Object {
  @scala.inline
  def apply[T](define: Schema_[js.Any] => Callback): Object[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("define")(js.Any.fromFunction1((t0: typingsJapgolly.normalizr.mod.Schema_[js.Any]) => define(t0).runNow()))
    __obj.asInstanceOf[Object[T]]
  }
}

