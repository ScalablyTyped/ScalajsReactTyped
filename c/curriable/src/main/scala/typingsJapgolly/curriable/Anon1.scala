package typingsJapgolly.curriable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon1[T /* <: js.Array[_] */] extends js.Object {
  var `0`: /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias curriable.curriable.Drop<N, curriable.curriable.Tail<T>, curriable.curriable.Prepend<any, I>> */ js.Object
  var `1`: T
}

object Anon1 {
  @scala.inline
  def apply[T /* <: js.Array[_] */](
    `0`: /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias curriable.curriable.Drop<N, curriable.curriable.Tail<T>, curriable.curriable.Prepend<any, I>> */ js.Object,
    `1`: T
  ): Anon1[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("0")(`0`.asInstanceOf[js.Any])
    __obj.updateDynamic("1")(`1`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon1[T]]
  }
}

