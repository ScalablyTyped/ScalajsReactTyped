package typingsJapgolly.lodash.fpMod

import typingsJapgolly.lodash.lodashMod.List
import typingsJapgolly.lodash.lodashMod.Many
import typingsJapgolly.lodash.lodashMod.ValueIteratee
import typingsJapgolly.lodash.lodashMod.__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashSortBy extends js.Object {
  def apply[T](iteratees: Many[ValueIteratee[T]]): js.Array[T] = js.native
  def apply[T /* <: js.Object */](
    iteratees: Many[
      ValueIteratee[
        /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
      ]
    ],
    collection: T
  ): js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ] = js.native
  def apply[T](iteratees: Many[ValueIteratee[T]], collection: List[T]): js.Array[T] = js.native
  def apply[T](iteratees: __): LodashSortBy1x2[T] = js.native
  def apply[T /* <: js.Object */](iteratees: __, collection: T): LodashSortBy2x2[T] = js.native
  def apply[T](iteratees: __, collection: List[T]): LodashSortBy1x2[T] = js.native
}

