package typingsJapgolly.coreJs

import typingsJapgolly.std.ArrayLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("core-js/fn/array/includes", JSImport.Namespace)
@js.native
object includesMod extends js.Object {
  def apply[T](array: ArrayLike[T], value: T): Boolean = js.native
  def apply[T](array: ArrayLike[T], value: T, fromIndex: Double): Boolean = js.native
}

