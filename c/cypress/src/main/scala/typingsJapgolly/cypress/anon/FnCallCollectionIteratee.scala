package typingsJapgolly.cypress.anon

import typingsJapgolly.cypress.typesLodashMod.ArrayIterator
import typingsJapgolly.cypress.typesLodashMod.ListIterator
import typingsJapgolly.cypress.typesLodashMod.ObjectIterator
import typingsJapgolly.cypress.typesLodashMod.StringIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FnCallCollectionIteratee extends StObject {
  
  def apply(collection: String): String = js.native
  def apply(collection: String, iteratee: StringIterator[Any]): String = js.native
  def apply[T /* <: js.Object */](): js.UndefOr[T | Null] = js.native
  def apply[T /* <: js.Object */](collection: T): js.UndefOr[T | Null] = js.native
  def apply[T /* <: js.Object */](collection: T, iteratee: ObjectIterator[T, Any]): js.UndefOr[T | Null] = js.native
  def apply[T](collection: js.Array[T]): js.Array[T] = js.native
  def apply[T](collection: js.Array[T], iteratee: ArrayIterator[T, Any]): js.Array[T] = js.native
  def apply[T /* <: js.Object */](collection: Null, iteratee: ObjectIterator[T, Any]): js.UndefOr[T | Null] = js.native
  def apply[T /* <: js.Object */](collection: Unit, iteratee: ObjectIterator[T, Any]): js.UndefOr[T | Null] = js.native
  def apply[T](collection: typingsJapgolly.cypress.typesLodashMod.List[T]): typingsJapgolly.cypress.typesLodashMod.List[T] = js.native
  def apply[T](collection: typingsJapgolly.cypress.typesLodashMod.List[T], iteratee: ListIterator[T, Any]): typingsJapgolly.cypress.typesLodashMod.List[T] = js.native
  def apply[T, TArray /* <: js.UndefOr[js.Array[T] | Null] */](collection: Unit & TArray): TArray = js.native
  def apply[T, TArray /* <: js.UndefOr[js.Array[T] | Null] */](collection: Null & TArray): TArray = js.native
}
