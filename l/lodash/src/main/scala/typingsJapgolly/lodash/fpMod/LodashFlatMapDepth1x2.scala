package typingsJapgolly.lodash.fpMod

import typingsJapgolly.lodash.mod.ListOfRecursiveArraysOrValues
import typingsJapgolly.lodash.mod.__
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LodashFlatMapDepth1x2 extends StObject {
  
  def apply(iteratee: String): LodashFlatMapDepth3x3 = js.native
  def apply(iteratee: String, collection: js.Object): js.Array[Any] = js.native
  def apply(iteratee: js.Object): js.Array[Boolean] = js.native
  def apply(iteratee: js.Object, collection: js.Object): js.Array[Boolean] = js.native
  def apply(iteratee: __): LodashFlatMapDepth3x6 = js.native
  def apply(iteratee: __, collection: js.Object): LodashFlatMapDepth3x6 = js.native
  def apply[T /* <: js.Object */](iteratee: __, collection: T): LodashFlatMapDepth2x6[T] = js.native
  def apply[T](iteratee: __, collection: typingsJapgolly.lodash.mod.List[T]): LodashFlatMapDepth1x6[T] = js.native
  def apply[T /* <: js.Object */, TResult](
    iteratee: js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ /* value */ js.Any, 
      ListOfRecursiveArraysOrValues[TResult] | TResult
    ]
  ): LodashFlatMapDepth2x3[T, TResult] = js.native
  def apply[T /* <: js.Object */, TResult](
    iteratee: js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ /* value */ js.Any, 
      ListOfRecursiveArraysOrValues[TResult] | TResult
    ],
    collection: T
  ): js.Array[TResult] = js.native
  def apply[T, TResult](
    iteratee: js.Function1[/* value */ T, ListOfRecursiveArraysOrValues[TResult] | TResult],
    collection: typingsJapgolly.lodash.mod.List[T]
  ): js.Array[TResult] = js.native
}
