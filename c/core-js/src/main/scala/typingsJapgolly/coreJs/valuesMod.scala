package typingsJapgolly.coreJs

import typingsJapgolly.std.ArrayLike
import typingsJapgolly.std.IterableIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("core-js/fn/array/values", JSImport.Namespace)
@js.native
object valuesMod extends js.Object {
  def apply[T](array: ArrayLike[T]): IterableIterator[T] = js.native
}

