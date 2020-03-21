package typingsJapgolly.cypress.fpMod

import typingsJapgolly.cypress.lodashMod.List
import typingsJapgolly.cypress.lodashMod.ValueIteratee
import typingsJapgolly.cypress.lodashMod.__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashUniqBy extends js.Object {
  def apply[T](iteratee: ValueIteratee[T]): js.Array[T] = js.native
  def apply[T](iteratee: ValueIteratee[T], array: List[T]): js.Array[T] = js.native
  def apply[T](iteratee: __): LodashUniqBy1x2[T] = js.native
  def apply[T](iteratee: __, array: List[T]): LodashUniqBy1x2[T] = js.native
}

