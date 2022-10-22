package typingsJapgolly.cypress.typesLodashFpMod

import typingsJapgolly.cypress.cypressStrings.asc
import typingsJapgolly.cypress.cypressStrings.desc
import typingsJapgolly.cypress.typesLodashMod.Many
import typingsJapgolly.cypress.typesLodashMod.NotVoid
import typingsJapgolly.cypress.typesLodashMod.ValueIteratee
import typingsJapgolly.cypress.typesLodashMod.__
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LodashOrderBy1x4[T] extends StObject {
  
  def apply(iteratees: Many[ValueIteratee[T]]): LodashOrderBy2x5[T] = js.native
  def apply(iteratees: Many[js.Function1[/* value */ T, NotVoid]]): LodashOrderBy1x5[T] = js.native
  def apply(iteratees: Many[js.Function1[/* value */ T, NotVoid]], orders: Many[Boolean | asc | desc]): js.Array[T] = js.native
  def apply(iteratees: Many[ValueIteratee[T]], orders: Many[Boolean | asc | desc]): js.Array[T] = js.native
  def apply(iteratees: __, orders: Many[Boolean | asc | desc]): LodashOrderBy1x6[T] = js.native
}
