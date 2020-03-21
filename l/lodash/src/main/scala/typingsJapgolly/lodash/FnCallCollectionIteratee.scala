package typingsJapgolly.lodash

import typingsJapgolly.lodash.mod.ArrayIterator
import typingsJapgolly.lodash.mod.List
import typingsJapgolly.lodash.mod.ListIterator
import typingsJapgolly.lodash.mod.ObjectIterator
import typingsJapgolly.lodash.mod.StringIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnCallCollectionIteratee extends js.Object {
  def apply(collection: String): String = js.native
  def apply(collection: String, iteratee: StringIterator[_]): String = js.native
  def apply[T /* <: js.Object */](): js.UndefOr[T | Null] = js.native
  def apply[TString /* <: js.UndefOr[String | Null] */](collection: TString): TString = js.native
  def apply[TString /* <: js.UndefOr[String | Null] */](collection: TString, iteratee: StringIterator[_]): TString = js.native
  def apply[T /* <: js.Object */](collection: js.UndefOr[scala.Nothing], iteratee: ObjectIterator[T, _]): js.UndefOr[T | Null] = js.native
  def apply[T](collection: js.Array[T]): js.Array[T] = js.native
  def apply[T](collection: js.Array[T], iteratee: ArrayIterator[T, _]): js.Array[T] = js.native
  def apply[T /* <: js.Object */](collection: Null, iteratee: ObjectIterator[T, _]): js.UndefOr[T | Null] = js.native
  def apply[T](collection: List[T]): List[T] = js.native
  def apply[T](collection: List[T], iteratee: ListIterator[T, _]): List[T] = js.native
}

