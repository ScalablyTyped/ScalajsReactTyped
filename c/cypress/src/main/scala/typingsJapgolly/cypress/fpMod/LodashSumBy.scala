package typingsJapgolly.cypress.fpMod

import typingsJapgolly.cypress.lodashMod.List
import typingsJapgolly.cypress.lodashMod.__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashSumBy extends js.Object {
  def apply[T](iteratee: String): Double = js.native
  def apply[T](iteratee: String, collection: List[T]): Double = js.native
  def apply[T](iteratee: js.Function1[/* value */ T, Double]): Double = js.native
  def apply[T](iteratee: js.Function1[/* value */ T, Double], collection: List[T]): Double = js.native
  def apply[T](iteratee: __): LodashSumBy1x2[T] = js.native
  def apply[T](iteratee: __, collection: List[T]): LodashSumBy1x2[T] = js.native
}

