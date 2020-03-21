package typingsJapgolly.shuffleArray.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ShuffleArray extends js.Object {
  /**
    * Randomizes the order of the elements in a given array.
    *
    * arr - The given array.
    * options - Optional configuration options.
    */
  def apply[T](arr: js.Array[T]): js.Array[T] = js.native
  def apply[T](arr: js.Array[T], options: ShuffleOption): js.Array[T] = js.native
  /**
    * Pick one or more random elements from the given array.
    *
    * arr - The given array.
    * options - Optional configuration options.
    */
  def pick[T](arr: js.Array[T]): js.Array[T] = js.native
  def pick[T](arr: js.Array[T], options: js.Object): js.Array[T] = js.native
}

