package typingsJapgolly.cypress.fpMod

import typingsJapgolly.cypress.cypressStrings.asc
import typingsJapgolly.cypress.cypressStrings.desc
import typingsJapgolly.cypress.lodashMod.List
import typingsJapgolly.cypress.lodashMod.Many
import typingsJapgolly.cypress.lodashMod.__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashOrderBy2x1[T] extends js.Object {
  def apply(orders: Many[Boolean | asc | desc]): LodashOrderBy2x3[T] = js.native
  def apply(orders: Many[Boolean | asc | desc], collection: js.Object): js.Array[T] = js.native
  def apply(orders: Many[Boolean | asc | desc], collection: List[T]): js.Array[T] = js.native
  def apply(orders: __): LodashOrderBy2x5[T] = js.native
  def apply(orders: __, collection: List[T]): LodashOrderBy2x5[T] = js.native
  def apply[T1 /* <: js.Object */](orders: __, collection: T1): LodashOrderBy4x5[T] = js.native
}

