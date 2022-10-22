package typingsJapgolly.cypress.typesLodashFpMod

import typingsJapgolly.cypress.cypressStrings.asc
import typingsJapgolly.cypress.cypressStrings.desc
import typingsJapgolly.cypress.typesLodashMod.Many
import typingsJapgolly.cypress.typesLodashMod.__
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LodashOrderBy2x1[T] extends StObject {
  
  def apply(orders: Many[Boolean | asc | desc]): js.Array[T] = js.native
  def apply(orders: Many[Boolean | asc | desc], collection: js.Object): js.Array[T] = js.native
  def apply(orders: Many[Boolean | asc | desc], collection: typingsJapgolly.cypress.typesLodashMod.List[T]): js.Array[T] = js.native
  def apply(orders: __): LodashOrderBy2x5[T] = js.native
  def apply(orders: __, collection: typingsJapgolly.cypress.typesLodashMod.List[T]): LodashOrderBy2x5[T] = js.native
  def apply[T1 /* <: js.Object */](orders: __, collection: T1): LodashOrderBy4x5[T] = js.native
}
