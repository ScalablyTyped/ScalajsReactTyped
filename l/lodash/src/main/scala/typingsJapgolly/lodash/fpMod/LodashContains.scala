package typingsJapgolly.lodash.fpMod

import typingsJapgolly.lodash.lodashMod.Dictionary
import typingsJapgolly.lodash.lodashMod.List
import typingsJapgolly.lodash.lodashMod.NumericDictionary
import typingsJapgolly.lodash.lodashMod.__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashContains extends js.Object {
  def apply[T](target: T): Boolean = js.native
  def apply[T](target: T, collection: Dictionary[T]): Boolean = js.native
  def apply[T](target: T, collection: List[T]): Boolean = js.native
  def apply[T](target: T, collection: NumericDictionary[T]): Boolean = js.native
  def apply[T](target: __): LodashContains1x2[T] = js.native
  def apply[T](target: __, collection: Dictionary[T]): LodashContains1x2[T] = js.native
  def apply[T](target: __, collection: List[T]): LodashContains1x2[T] = js.native
  def apply[T](target: __, collection: NumericDictionary[T]): LodashContains1x2[T] = js.native
}

