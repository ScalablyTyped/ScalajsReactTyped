package typingsJapgolly.cypress.typesLodashFpMod

import typingsJapgolly.cypress.typesLodashMod.ValueIteratee
import typingsJapgolly.cypress.typesLodashMod.ValueIteratorTypeGuard
import typingsJapgolly.std.Exclude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LodashPartition1x2[T] extends StObject {
  
  def apply(callback: ValueIteratee[T]): js.Tuple2[js.Array[T], js.Array[T]] = js.native
  def apply[U /* <: T */](callback: ValueIteratorTypeGuard[T, U]): js.Tuple2[js.Array[U], js.Array[Exclude[T, U]]] = js.native
}
