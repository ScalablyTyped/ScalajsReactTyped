package typingsJapgolly.lodash.fpMod

import typingsJapgolly.lodash.lodashMod.Dictionary
import typingsJapgolly.lodash.lodashMod.NumericDictionary
import typingsJapgolly.lodash.lodashMod.PartialObject
import typingsJapgolly.lodash.lodashMod.ValueKeyIteratee
import typingsJapgolly.lodash.lodashMod.ValueKeyIterateeTypeGuard
import typingsJapgolly.lodash.lodashMod.__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashPickBy extends js.Object {
  def apply[T /* <: js.Object */](
    predicate: ValueKeyIteratee[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
    ]
  ): PartialObject[T] = js.native
  def apply[T /* <: js.Object */](
    predicate: ValueKeyIteratee[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
    ],
    `object`: T
  ): PartialObject[T] = js.native
  def apply[T](predicate: ValueKeyIteratee[T], `object`: Dictionary[T]): Dictionary[T] = js.native
  def apply[T](predicate: ValueKeyIteratee[T], `object`: NumericDictionary[T]): NumericDictionary[T] = js.native
  def apply[T /* <: js.Object */](predicate: __): LodashPickBy5x2[T] = js.native
  def apply[T /* <: js.Object */](predicate: __, `object`: T): LodashPickBy5x2[T] = js.native
  def apply[T](predicate: __, `object`: Dictionary[T]): LodashPickBy1x2[T] = js.native
  def apply[T](predicate: __, `object`: NumericDictionary[T]): LodashPickBy2x2[T] = js.native
  def apply[T, S /* <: T */](predicate: ValueKeyIterateeTypeGuard[T, S]): Dictionary[S] = js.native
  def apply[T, S /* <: T */](predicate: ValueKeyIterateeTypeGuard[T, S], `object`: Dictionary[T]): Dictionary[S] = js.native
  def apply[T, S /* <: T */](predicate: ValueKeyIterateeTypeGuard[T, S], `object`: NumericDictionary[T]): NumericDictionary[S] = js.native
}

