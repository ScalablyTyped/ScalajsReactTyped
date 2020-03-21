package typingsJapgolly.crossfilter

import typingsJapgolly.crossfilter.CrossFilter.Selector
import typingsJapgolly.crossfilter.CrossFilter.Sort
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCallArrayLoHi extends js.Object {
  def apply[T](array: js.Array[T], lo: Double, hi: Double): js.Array[T] = js.native
  def by[T](value: Selector[T]): Sort[T] = js.native
}

