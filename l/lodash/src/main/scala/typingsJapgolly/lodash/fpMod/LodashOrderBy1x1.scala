package typingsJapgolly.lodash.fpMod

import typingsJapgolly.lodash.lodashStrings.asc
import typingsJapgolly.lodash.lodashStrings.desc
import typingsJapgolly.lodash.mod.Many
import typingsJapgolly.lodash.mod.__
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LodashOrderBy1x1[T] extends StObject {
  
  def apply(orders: Many[Boolean | asc | desc]): js.Array[T] = js.native
  def apply(orders: Many[Boolean | asc | desc], collection: js.Object): js.Array[T] = js.native
  def apply(orders: Many[Boolean | asc | desc], collection: typingsJapgolly.lodash.mod.List[T]): js.Array[T] = js.native
  def apply(orders: __): LodashOrderBy1x5[T] = js.native
  def apply(orders: __, collection: typingsJapgolly.lodash.mod.List[T]): LodashOrderBy1x5[T] = js.native
  def apply[T1 /* <: js.Object */](orders: __, collection: T1): LodashOrderBy3x5[T] = js.native
}
