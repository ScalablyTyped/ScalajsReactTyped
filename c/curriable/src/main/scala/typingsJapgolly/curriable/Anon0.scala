package typingsJapgolly.curriable

import typingsJapgolly.curriable.mod.Head
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon0[T /* <: js.Array[_] */] extends js.Object {
  var `0`: /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias curriable.curriable.Last<curriable.curriable.Tail<T>> */ js.Object
  var `1`: Head[T]
}

object Anon0 {
  @scala.inline
  def apply[T /* <: js.Array[_] */](
    `0`: /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias curriable.curriable.Last<curriable.curriable.Tail<T>> */ js.Object,
    `1`: Head[T]
  ): Anon0[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("0")(`0`.asInstanceOf[js.Any])
    __obj.updateDynamic("1")(`1`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon0[T]]
  }
}

