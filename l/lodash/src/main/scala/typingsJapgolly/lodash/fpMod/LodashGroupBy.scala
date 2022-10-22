package typingsJapgolly.lodash.fpMod

import typingsJapgolly.lodash.mod.Dictionary
import typingsJapgolly.lodash.mod.ValueIteratee
import typingsJapgolly.lodash.mod.__
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LodashGroupBy extends StObject {
  
  def apply[T](iteratee: ValueIteratee[T]): LodashGroupBy1x1[T] = js.native
  def apply[T /* <: js.Object */](
    iteratee: ValueIteratee[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
    ],
    collection: T
  ): Dictionary[
    js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
    ]
  ] = js.native
  def apply[T](iteratee: ValueIteratee[T], collection: typingsJapgolly.lodash.mod.List[T]): Dictionary[js.Array[T]] = js.native
  def apply[T](iteratee: __): LodashGroupBy1x2[T] = js.native
  def apply[T /* <: js.Object */](iteratee: __, collection: T): LodashGroupBy2x2[T] = js.native
  def apply[T](iteratee: __, collection: typingsJapgolly.lodash.mod.List[T]): LodashGroupBy1x2[T] = js.native
}
