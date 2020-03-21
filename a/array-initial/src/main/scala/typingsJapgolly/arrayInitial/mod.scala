package typingsJapgolly.arrayInitial

import typingsJapgolly.std.ArrayLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("array-initial", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def apply[T](array: ArrayLike[T]): js.Array[T] = js.native
  def apply[T](array: ArrayLike[T], drop: Double): js.Array[T] = js.native
}

