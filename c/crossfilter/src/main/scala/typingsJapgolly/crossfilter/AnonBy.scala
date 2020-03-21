package typingsJapgolly.crossfilter

import typingsJapgolly.crossfilter.CrossFilter.Heap
import typingsJapgolly.crossfilter.CrossFilter.Selector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonBy extends js.Object {
  def apply[T](array: js.Array[T], lo: Double, hi: Double): js.Array[T] = js.native
  def by[T](value: Selector[T]): Heap[T] = js.native
}

