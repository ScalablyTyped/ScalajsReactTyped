package typingsJapgolly.lodash.fpMod

import typingsJapgolly.lodash.lodashMod.Dictionary
import typingsJapgolly.lodash.lodashMod.List
import typingsJapgolly.lodash.lodashMod.ValueIteratee
import typingsJapgolly.lodash.lodashMod.__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashMapKeys extends js.Object {
  def apply(iteratee: ValueIteratee[Double]): LodashMapKeys1x1 = js.native
  def apply[T /* <: js.Object */](iteratee: ValueIteratee[String], `object`: T): Dictionary[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ] = js.native
  def apply[T](iteratee: ValueIteratee[Double], `object`: List[T]): Dictionary[T] = js.native
  def apply[T /* <: js.Object */](iteratee: __): LodashMapKeys2x2[T] = js.native
  def apply[T /* <: js.Object */](iteratee: __, `object`: T): LodashMapKeys2x2[T] = js.native
  def apply[T](iteratee: __, `object`: List[T]): LodashMapKeys1x2[T] = js.native
}

