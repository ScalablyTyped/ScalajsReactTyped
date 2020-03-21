package typingsJapgolly.cypress.fpMod

import typingsJapgolly.cypress.lodashMod.List
import typingsJapgolly.cypress.lodashMod.ValueIterateeCustom
import typingsJapgolly.cypress.lodashMod.ValueIteratorTypeGuard
import typingsJapgolly.cypress.lodashMod.__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashFindLast extends js.Object {
  def apply[T](predicate: ValueIterateeCustom[T, Boolean]): LodashFindLast2x1[T] = js.native
  def apply[T /* <: js.Object */](
    predicate: ValueIterateeCustom[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any, 
      Boolean
    ],
    collection: T
  ): js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ] = js.native
  def apply[T](predicate: ValueIterateeCustom[T, Boolean], collection: List[T]): js.UndefOr[T] = js.native
  def apply[T](predicate: __): LodashFindLast1x2[T] = js.native
  def apply[T /* <: js.Object */](predicate: __, collection: T): LodashFindLast3x2[T] = js.native
  def apply[T](predicate: __, collection: List[T]): LodashFindLast1x2[T] = js.native
  def apply[T, S /* <: T */](predicate: ValueIteratorTypeGuard[T, S]): LodashFindLast1x1[T, S] = js.native
  def apply[T /* <: js.Object */, S /* <: /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any */](
    predicate: ValueIteratorTypeGuard[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any, 
      S
    ],
    collection: T
  ): js.UndefOr[S] = js.native
  def apply[T, S /* <: T */](predicate: ValueIteratorTypeGuard[T, S], collection: List[T]): js.UndefOr[S] = js.native
}

