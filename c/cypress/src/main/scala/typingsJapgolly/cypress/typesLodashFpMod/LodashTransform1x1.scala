package typingsJapgolly.cypress.typesLodashFpMod

import typingsJapgolly.cypress.typesLodashMod.Dictionary
import typingsJapgolly.cypress.typesLodashMod.__
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LodashTransform1x1[T, TResult] extends StObject {
  
  def apply(accumulator: TResult): LodashTransform1x3[T, TResult] = js.native
  def apply(accumulator: TResult, `object`: js.Array[T]): TResult = js.native
  def apply(accumulator: TResult, `object`: Dictionary[T]): TResult = js.native
  def apply(accumulator: __, `object`: js.Array[T]): LodashTransform1x5[TResult] = js.native
  def apply(accumulator: __, `object`: Dictionary[T]): LodashTransform2x5[TResult] = js.native
}
