package typingsJapgolly.canvaskitWasm.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SkObject[T /* <: SkObject[T] */] extends js.Object {
  def delete(): Unit
  def deleteAfter(): Unit
  def isAliasOf(other: js.Any): Boolean
  def isDeleted(): Boolean
}

object SkObject {
  @scala.inline
  def apply[T /* <: SkObject[T] */](
    delete: Callback,
    deleteAfter: Callback,
    isAliasOf: js.Any => CallbackTo[Boolean],
    isDeleted: CallbackTo[Boolean]
  ): SkObject[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("delete")(delete.toJsFn)
    __obj.updateDynamic("deleteAfter")(deleteAfter.toJsFn)
    __obj.updateDynamic("isAliasOf")(js.Any.fromFunction1((t0: js.Any) => isAliasOf(t0).runNow()))
    __obj.updateDynamic("isDeleted")(isDeleted.toJsFn)
    __obj.asInstanceOf[SkObject[T]]
  }
}

