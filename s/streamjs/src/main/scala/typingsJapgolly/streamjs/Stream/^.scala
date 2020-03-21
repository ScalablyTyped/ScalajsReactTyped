package typingsJapgolly.streamjs.Stream

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Stream")
@js.native
object ^ extends js.Object {
  def from(str: String): typingsJapgolly.streamjs.Stream[String] = js.native
  def from[T](elems: js.Array[T]): typingsJapgolly.streamjs.Stream[T] = js.native
  def generate[T](supplier: Supplier[T]): typingsJapgolly.streamjs.Stream[T] = js.native
  def iterate[T](seed: T, fn: Function[T, T]): typingsJapgolly.streamjs.Stream[T] = js.native
  def of[T](elems: T*): typingsJapgolly.streamjs.Stream[T] = js.native
  def range(startInclusive: Double, endExclusive: Double): typingsJapgolly.streamjs.Stream[Double] = js.native
  def rangeClosed(startInclusive: Double, endInclusive: Double): typingsJapgolly.streamjs.Stream[Double] = js.native
}

