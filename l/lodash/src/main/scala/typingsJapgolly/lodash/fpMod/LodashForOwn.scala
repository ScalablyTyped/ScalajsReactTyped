package typingsJapgolly.lodash.fpMod

import typingsJapgolly.lodash.lodashMod.__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashForOwn extends js.Object {
  def apply[T](
    iteratee: js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ /* value */ js.Any, 
      _
    ]
  ): js.UndefOr[T | Null] = js.native
  def apply[T](
    iteratee: js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ /* value */ js.Any, 
      _
    ],
    `object`: T
  ): js.UndefOr[T | Null] = js.native
  def apply[T](iteratee: __): LodashForOwn2x2[T] = js.native
  def apply[T](iteratee: __, `object`: T): LodashForOwn2x2[T] = js.native
}

