package typingsJapgolly.cypress.fpMod

import typingsJapgolly.cypress.lodashMod.List
import typingsJapgolly.cypress.lodashMod.__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashFill1x5[T] extends js.Object {
  def apply(end: Double): LodashFill1x7[T] = js.native
  def apply[U](end: Double, array: js.Array[U]): js.Array[T | U] = js.native
  def apply[U](end: Double, array: List[U]): List[T | U] = js.native
  def apply[U](end: __): LodashFill2x13[T, U] = js.native
  def apply[U](end: __, array: js.Array[U]): LodashFill1x13[T, U] = js.native
  def apply[U](end: __, array: List[U]): LodashFill2x13[T, U] = js.native
}

