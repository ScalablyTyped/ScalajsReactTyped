package typingsJapgolly.cypress.fpMod

import typingsJapgolly.cypress.cypressStrings.asc
import typingsJapgolly.cypress.cypressStrings.desc
import typingsJapgolly.cypress.lodashMod.List
import typingsJapgolly.cypress.lodashMod.Many
import typingsJapgolly.cypress.lodashMod.NotVoid
import typingsJapgolly.cypress.lodashMod.ValueIteratee
import typingsJapgolly.cypress.lodashMod.__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashOrderBy extends js.Object {
  def apply(iteratees: __, orders: Many[Boolean | asc | desc]): LodashOrderBy1x2 = js.native
  def apply[T](iteratees: Many[ValueIteratee[T]]): LodashOrderBy2x1[T] = js.native
  def apply[T /* <: js.Object */](
    iteratees: Many[
      (js.Function1[
        /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ /* value */ js.Any, 
        NotVoid
      ]) | (ValueIteratee[
        /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
      ])
    ],
    orders: Many[Boolean | asc | desc]
  ): js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ] = js.native
  def apply[T /* <: js.Object */](
    iteratees: Many[
      (js.Function1[
        /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ /* value */ js.Any, 
        NotVoid
      ]) | (ValueIteratee[
        /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
      ])
    ],
    orders: Many[Boolean | asc | desc],
    collection: T
  ): js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ] = js.native
  def apply[T](
    iteratees: Many[(js.Function1[/* value */ T, NotVoid]) | ValueIteratee[T]],
    orders: Many[Boolean | asc | desc],
    collection: List[T]
  ): js.Array[T] = js.native
  def apply[T](iteratees: Many[js.Function1[/* value */ T, NotVoid]], orders: __): LodashOrderBy1x5[T] = js.native
  def apply[T /* <: js.Object */](
    iteratees: Many[
      js.Function1[
        /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ /* value */ js.Any, 
        NotVoid
      ]
    ],
    orders: __,
    collection: T
  ): LodashOrderBy3x5[T] = js.native
  def apply[T](iteratees: Many[js.Function1[/* value */ T, NotVoid]], orders: __, collection: List[T]): LodashOrderBy1x5[T] = js.native
  def apply[T /* <: js.Object */](iteratees: __, orders: Many[Boolean | asc | desc], collection: T): LodashOrderBy3x6[T] = js.native
  def apply[T](iteratees: __, orders: Many[Boolean | asc | desc], collection: List[T]): LodashOrderBy1x6[T] = js.native
  def apply[T](iteratees: __, orders: __): LodashOrderBy1x4[T] = js.native
  def apply[T /* <: js.Object */](iteratees: __, orders: __, collection: T): LodashOrderBy3x4[T] = js.native
  def apply[T](iteratees: __, orders: __, collection: List[T]): LodashOrderBy1x4[T] = js.native
}

