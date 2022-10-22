package typingsJapgolly.lodash.fpMod

import typingsJapgolly.lodash.mod.MemoIteratorCapped
import typingsJapgolly.lodash.mod.__
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LodashReduce1x4[T] extends StObject {
  
  def apply[TResult](callback: MemoIteratorCapped[T, TResult]): LodashReduce1x5[TResult] = js.native
  def apply[TResult](callback: MemoIteratorCapped[T, TResult], accumulator: TResult): TResult = js.native
  def apply[TResult](callback: __, accumulator: TResult): LodashReduce1x6[T, TResult] = js.native
}
