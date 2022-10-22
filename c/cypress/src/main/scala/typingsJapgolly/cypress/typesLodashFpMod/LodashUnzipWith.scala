package typingsJapgolly.cypress.typesLodashFpMod

import typingsJapgolly.cypress.typesLodashMod.__
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LodashUnzipWith extends StObject {
  
  def apply[T](iteratee: __): LodashUnzipWith1x2[T] = js.native
  def apply[T](
    iteratee: __,
    array: typingsJapgolly.cypress.typesLodashMod.List[typingsJapgolly.cypress.typesLodashMod.List[T]]
  ): LodashUnzipWith1x2[T] = js.native
  def apply[T, TResult](iteratee: js.Function1[/* repeated */ T, TResult]): LodashUnzipWith1x1[T, TResult] = js.native
  def apply[T, TResult](
    iteratee: js.Function1[/* repeated */ T, TResult],
    array: typingsJapgolly.cypress.typesLodashMod.List[typingsJapgolly.cypress.typesLodashMod.List[T]]
  ): js.Array[TResult] = js.native
}
