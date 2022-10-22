package typingsJapgolly.cypress.typesLodashFpMod

import typingsJapgolly.cypress.typesLodashMod.ValueIteratee
import typingsJapgolly.cypress.typesLodashMod.__
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LodashDifferenceBy extends StObject {
  
  def apply[T1](iteratee: __): LodashDifferenceBy1x2[T1] = js.native
  def apply[T1](iteratee: __, array: typingsJapgolly.cypress.typesLodashMod.List[T1]): LodashDifferenceBy1x2[T1] = js.native
  def apply[T2](iteratee: __, array: __, values: typingsJapgolly.cypress.typesLodashMod.List[T2]): LodashDifferenceBy1x4[T2] = js.native
  def apply[T1, T2](iteratee: ValueIteratee[T1 | T2]): LodashDifferenceBy1x1[T1, T2] = js.native
  def apply[T1, T2](
    iteratee: ValueIteratee[T1 | T2],
    array: Null,
    values: typingsJapgolly.cypress.typesLodashMod.List[T2]
  ): js.Array[T1] = js.native
  def apply[T1, T2](
    iteratee: ValueIteratee[T1 | T2],
    array: Unit,
    values: typingsJapgolly.cypress.typesLodashMod.List[T2]
  ): js.Array[T1] = js.native
  def apply[T1, T2](iteratee: ValueIteratee[T1 | T2], array: typingsJapgolly.cypress.typesLodashMod.List[T1]): LodashDifferenceBy1x3[T1, T2] = js.native
  def apply[T1, T2](
    iteratee: ValueIteratee[T1 | T2],
    array: typingsJapgolly.cypress.typesLodashMod.List[T1],
    values: typingsJapgolly.cypress.typesLodashMod.List[T2]
  ): js.Array[T1] = js.native
  def apply[T1, T2](
    iteratee: ValueIteratee[T1 | T2],
    array: __,
    values: typingsJapgolly.cypress.typesLodashMod.List[T2]
  ): LodashDifferenceBy1x5[T1] = js.native
  def apply[T1, T2](iteratee: __, array: Null, values: typingsJapgolly.cypress.typesLodashMod.List[T2]): LodashDifferenceBy1x6[T1, T2] = js.native
  def apply[T1, T2](iteratee: __, array: Unit, values: typingsJapgolly.cypress.typesLodashMod.List[T2]): LodashDifferenceBy1x6[T1, T2] = js.native
  def apply[T1, T2](
    iteratee: __,
    array: typingsJapgolly.cypress.typesLodashMod.List[T1],
    values: typingsJapgolly.cypress.typesLodashMod.List[T2]
  ): LodashDifferenceBy1x6[T1, T2] = js.native
}
