package typingsJapgolly.lodash.fpMod

import typingsJapgolly.lodash.lodashMod.List
import typingsJapgolly.lodash.lodashMod.Many
import typingsJapgolly.lodash.lodashMod.NotVoid
import typingsJapgolly.lodash.lodashMod.ValueIteratee
import typingsJapgolly.lodash.lodashMod.__
import typingsJapgolly.lodash.lodashStrings.asc
import typingsJapgolly.lodash.lodashStrings.desc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashOrderBy extends js.Object {
  def apply(iteratees: __, orders: Many[Boolean | asc | desc]): LodashOrderBy1x2 = js.native
  def apply[T](iteratees: Many[ValueIteratee[T]]): LodashOrderBy2x1[T] = js.native
  def apply[T](
    iteratees: Many[(js.Function1[/* value */ T, NotVoid]) | ValueIteratee[T]],
    orders: Many[Boolean | asc | desc]
  ): js.Array[T] = js.native
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
  def apply[T](iteratees: Many[ValueIteratee[T]], orders: __): LodashOrderBy2x5[T] = js.native
  def apply[T /* <: js.Object */](
    iteratees: Many[
      ValueIteratee[
        /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
      ]
    ],
    orders: __,
    collection: T
  ): LodashOrderBy4x5[T] = js.native
  def apply[T](iteratees: Many[ValueIteratee[T]], orders: __, collection: List[T]): LodashOrderBy2x5[T] = js.native
  def apply[T /* <: js.Object */](iteratees: __, orders: Many[Boolean | asc | desc], collection: T): LodashOrderBy3x6[T] = js.native
  def apply[T](iteratees: __, orders: Many[Boolean | asc | desc], collection: List[T]): LodashOrderBy1x6[T] = js.native
  def apply[T /* <: js.Object */](iteratees: __, orders: __): LodashOrderBy3x4[T] = js.native
  def apply[T /* <: js.Object */](iteratees: __, orders: __, collection: T): LodashOrderBy3x4[T] = js.native
  def apply[T](iteratees: __, orders: __, collection: List[T]): LodashOrderBy1x4[T] = js.native
}

