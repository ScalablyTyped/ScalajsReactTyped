package typingsJapgolly.cypress.fpMod

import typingsJapgolly.cypress.lodashMod.__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashForIn extends js.Object {
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
  def apply[T](iteratee: __): LodashForIn2x2[T] = js.native
  def apply[T](iteratee: __, `object`: T): LodashForIn1x2[T] = js.native
}

