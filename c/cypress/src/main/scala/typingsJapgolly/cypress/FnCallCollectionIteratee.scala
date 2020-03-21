package typingsJapgolly.cypress

import typingsJapgolly.cypress.lodashMod.ArrayIterator
import typingsJapgolly.cypress.lodashMod.List
import typingsJapgolly.cypress.lodashMod.ListIterator
import typingsJapgolly.cypress.lodashMod.ObjectIterator
import typingsJapgolly.cypress.lodashMod.StringIterator
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

