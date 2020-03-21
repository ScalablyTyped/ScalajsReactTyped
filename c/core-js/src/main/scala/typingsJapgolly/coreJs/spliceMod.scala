package typingsJapgolly.coreJs

import typingsJapgolly.std.ArrayLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("core-js/fn/array/splice", JSImport.Namespace)
@js.native
object spliceMod extends js.Object {
  def apply[T](array: ArrayLike[T], start: Double): Array[T] = js.native
  def apply[T](array: ArrayLike[T], start: Double, deleteCount: Double, items: T*): Array[T] = js.native
}

