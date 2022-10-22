package typingsJapgolly.cypress.typesLodashFpMod

import typingsJapgolly.cypress.typesLodashMod.NumericDictionary
import typingsJapgolly.cypress.typesLodashMod.ValueKeyIteratee
import typingsJapgolly.cypress.typesLodashMod.ValueKeyIterateeTypeGuard
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LodashPickBy2x2[T] extends StObject {
  
  def apply(predicate: ValueKeyIteratee[T]): NumericDictionary[T] = js.native
  def apply[S /* <: T */](predicate: ValueKeyIterateeTypeGuard[T, S]): NumericDictionary[S] = js.native
}
