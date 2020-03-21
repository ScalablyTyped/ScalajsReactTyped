package typingsJapgolly.es6Shim

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IterableShim[T] extends js.Object {
  /**
    * Shim for an ES6 iterable. Not intended for direct use by user code.
    */
  def `_es6-shim iterator_`(): Iterator[T]
}

object IterableShim {
  @scala.inline
  def apply[T](`_es6-shim iterator_`: CallbackTo[Iterator[T]]): IterableShim[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("_es6-shim iterator_")(`_es6-shim iterator_`.toJsFn)
    __obj.asInstanceOf[IterableShim[T]]
  }
}

