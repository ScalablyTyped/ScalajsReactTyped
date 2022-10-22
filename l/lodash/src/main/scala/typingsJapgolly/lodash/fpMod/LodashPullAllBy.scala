package typingsJapgolly.lodash.fpMod

import typingsJapgolly.lodash.mod.ValueIteratee
import typingsJapgolly.lodash.mod.__
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LodashPullAllBy extends StObject {
  
  def apply[T](iteratee: ValueIteratee[T]): LodashPullAllBy1x1[T] = js.native
  def apply[T](iteratee: ValueIteratee[T], values: typingsJapgolly.lodash.mod.List[T]): LodashPullAllBy1x3[T] = js.native
  def apply[T](iteratee: ValueIteratee[T], values: typingsJapgolly.lodash.mod.List[T], array: js.Array[T]): js.Array[T] = js.native
  def apply[T](
    iteratee: ValueIteratee[T],
    values: typingsJapgolly.lodash.mod.List[T],
    array: typingsJapgolly.lodash.mod.List[T]
  ): typingsJapgolly.lodash.mod.List[T] = js.native
  def apply[T](iteratee: ValueIteratee[T], values: __, array: js.Array[T]): LodashPullAllBy1x5[T] = js.native
  def apply[T](iteratee: ValueIteratee[T], values: __, array: typingsJapgolly.lodash.mod.List[T]): LodashPullAllBy2x5[T] = js.native
  def apply[T2](iteratee: __, values: typingsJapgolly.lodash.mod.List[T2]): LodashPullAllBy3x2[T2] = js.native
  def apply[T](iteratee: __, values: typingsJapgolly.lodash.mod.List[T], array: js.Array[T]): LodashPullAllBy1x6[T] = js.native
  def apply[T](
    iteratee: __,
    values: typingsJapgolly.lodash.mod.List[T],
    array: typingsJapgolly.lodash.mod.List[T]
  ): LodashPullAllBy2x6[T] = js.native
  def apply[T1](iteratee: __, values: __, array: js.Array[T1]): LodashPullAllBy3x4[T1] = js.native
  def apply[T1](iteratee: __, values: __, array: typingsJapgolly.lodash.mod.List[T1]): LodashPullAllBy4x4[T1] = js.native
}
