package typingsJapgolly.cypress.typesLodashFpMod

import typingsJapgolly.cypress.typesLodashMod.MemoIteratorCapped
import typingsJapgolly.cypress.typesLodashMod.__
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LodashReduce extends StObject {
  
  def apply[TResult](callback: __, accumulator: TResult): LodashReduce1x2[TResult] = js.native
  def apply[T /* <: js.Object */](callback: __, accumulator: __): LodashReduce3x4[T] = js.native
  def apply[T /* <: js.Object */](callback: __, accumulator: __, collection: T): LodashReduce3x4[T] = js.native
  def apply[T](callback: __, accumulator: __, collection: js.Array[T]): LodashReduce1x4[T] = js.native
  def apply[T](callback: __, accumulator: __, collection: typingsJapgolly.cypress.typesLodashMod.List[T]): LodashReduce2x4[T] = js.native
  def apply[T, TResult](callback: MemoIteratorCapped[T, TResult]): LodashReduce1x1[T, TResult] = js.native
  def apply[T, TResult](
    callback: MemoIteratorCapped[
      (/* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any) | T, 
      TResult
    ],
    accumulator: TResult
  ): TResult = js.native
  def apply[T /* <: js.Object */, TResult](
    callback: MemoIteratorCapped[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any, 
      TResult
    ],
    accumulator: TResult,
    collection: T
  ): TResult = js.native
  def apply[T, TResult](callback: MemoIteratorCapped[T, TResult], accumulator: TResult, collection: js.Array[T]): TResult = js.native
  def apply[T, TResult](
    callback: MemoIteratorCapped[T, TResult],
    accumulator: TResult,
    collection: typingsJapgolly.cypress.typesLodashMod.List[T]
  ): TResult = js.native
  def apply[T, TResult](callback: MemoIteratorCapped[T, TResult], accumulator: __): LodashReduce1x5[TResult] = js.native
  def apply[T /* <: js.Object */, TResult](
    callback: MemoIteratorCapped[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any, 
      TResult
    ],
    accumulator: __,
    collection: T
  ): LodashReduce3x5[TResult] = js.native
  def apply[T, TResult](callback: MemoIteratorCapped[T, TResult], accumulator: __, collection: js.Array[T]): LodashReduce1x5[TResult] = js.native
  def apply[T, TResult](
    callback: MemoIteratorCapped[T, TResult],
    accumulator: __,
    collection: typingsJapgolly.cypress.typesLodashMod.List[T]
  ): LodashReduce2x5[TResult] = js.native
  def apply[T /* <: js.Object */, TResult](callback: __, accumulator: TResult, collection: T): LodashReduce3x6[T, TResult] = js.native
  def apply[T, TResult](callback: __, accumulator: TResult, collection: js.Array[T]): LodashReduce1x6[T, TResult] = js.native
  def apply[T, TResult](callback: __, accumulator: TResult, collection: typingsJapgolly.cypress.typesLodashMod.List[T]): LodashReduce2x6[T, TResult] = js.native
}
