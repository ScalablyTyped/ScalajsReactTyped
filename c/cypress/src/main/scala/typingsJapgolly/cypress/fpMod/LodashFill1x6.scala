package typingsJapgolly.cypress.fpMod

import typingsJapgolly.cypress.lodashMod.List
import typingsJapgolly.cypress.lodashMod.__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashFill1x6[T] extends js.Object {
  def apply(start: Double): LodashFill1x7[T] = js.native
  def apply[U](start: Double, array: js.Array[U]): js.Array[T | U] = js.native
  def apply[U](start: Double, array: List[U]): List[T | U] = js.native
  def apply[U](start: __): LodashFill1x14[T, U] = js.native
  def apply[U](start: __, array: js.Array[U]): LodashFill1x14[T, U] = js.native
  def apply[U](start: __, array: List[U]): LodashFill2x14[T, U] = js.native
}

