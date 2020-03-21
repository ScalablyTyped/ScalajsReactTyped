package typingsJapgolly.cypress.fpMod

import typingsJapgolly.cypress.lodashMod.Dictionary
import typingsJapgolly.cypress.lodashMod.List
import typingsJapgolly.cypress.lodashMod.NumericDictionary
import typingsJapgolly.cypress.lodashMod.__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashSampleSize extends js.Object {
  def apply(n: Double): LodashSampleSize1x1 = js.native
  def apply[T /* <: js.Object */](n: Double, collection: T): js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ] = js.native
  def apply[T](n: Double, collection: Dictionary[T]): js.Array[T] = js.native
  def apply[T](n: Double, collection: List[T]): js.Array[T] = js.native
  def apply[T](n: Double, collection: NumericDictionary[T]): js.Array[T] = js.native
  def apply[T /* <: js.Object */](n: __): LodashSampleSize2x2[T] = js.native
  def apply[T /* <: js.Object */](n: __, collection: T): LodashSampleSize2x2[T] = js.native
  def apply[T](n: __, collection: Dictionary[T]): LodashSampleSize1x2[T] = js.native
  def apply[T](n: __, collection: List[T]): LodashSampleSize1x2[T] = js.native
  def apply[T](n: __, collection: NumericDictionary[T]): LodashSampleSize1x2[T] = js.native
}

