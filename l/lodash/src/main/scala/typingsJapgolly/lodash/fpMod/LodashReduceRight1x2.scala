package typingsJapgolly.lodash.fpMod

import typingsJapgolly.lodash.mod.MemoIteratorCappedRight
import typingsJapgolly.lodash.mod.__
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LodashReduceRight1x2[TResult] extends StObject {
  
  def apply[T](callback: MemoIteratorCappedRight[T, TResult]): LodashReduceRight1x3[T, TResult] = js.native
  def apply[T /* <: js.Object */](
    callback: MemoIteratorCappedRight[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any, 
      TResult
    ],
    collection: T
  ): TResult = js.native
  def apply[T](callback: MemoIteratorCappedRight[T, TResult], collection: js.Array[T]): TResult = js.native
  def apply[T](callback: MemoIteratorCappedRight[T, TResult], collection: typingsJapgolly.lodash.mod.List[T]): TResult = js.native
  def apply[T](callback: __): LodashReduceRight1x6[T, TResult] = js.native
  def apply[T /* <: js.Object */](callback: __, collection: T): LodashReduceRight3x6[T, TResult] = js.native
  def apply[T](callback: __, collection: js.Array[T]): LodashReduceRight1x6[T, TResult] = js.native
  def apply[T](callback: __, collection: typingsJapgolly.lodash.mod.List[T]): LodashReduceRight2x6[T, TResult] = js.native
}
