package typingsJapgolly.cypress.typesLodashFpMod

import typingsJapgolly.cypress.typesLodashMod.__
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LodashForEachRight extends StObject {
  
  def apply[T](iteratee: js.Function1[/* value */ T, Any]): LodashForEachRight1x1[T] = js.native
  def apply[T /* <: js.Object */](
    iteratee: js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ /* value */ js.Any, 
      Any
    ],
    collection: T
  ): js.UndefOr[T | Null] = js.native
  def apply[T](iteratee: js.Function1[/* value */ T, Any], collection: js.Array[T]): js.Array[T] = js.native
  def apply[T](
    iteratee: js.Function1[/* value */ T, Any],
    collection: typingsJapgolly.cypress.typesLodashMod.List[T]
  ): typingsJapgolly.cypress.typesLodashMod.List[T] = js.native
  def apply[T /* <: js.Object */](iteratee: __): LodashForEachRight6x2[T] = js.native
  def apply[T /* <: js.Object */](iteratee: __, collection: T): LodashForEachRight6x2[T] = js.native
  def apply[T](iteratee: __, collection: js.Array[T]): LodashForEachRight1x2[T] = js.native
  def apply[T](iteratee: __, collection: typingsJapgolly.cypress.typesLodashMod.List[T]): LodashForEachRight2x2[T] = js.native
  def apply[T, TArray /* <: js.UndefOr[js.Array[T] | Null] */](iteratee: js.Function1[/* value */ T, Any], collection: Null & TArray): TArray = js.native
  def apply[T, TArray /* <: js.UndefOr[js.Array[T] | Null] */](iteratee: js.Function1[/* value */ T, Any], collection: Unit & TArray): TArray = js.native
  def apply[T, TList /* <: js.UndefOr[typingsJapgolly.cypress.typesLodashMod.List[T] | Null] */](iteratee: __, collection: Unit & TList): LodashForEachRight5x2[T, TList] = js.native
  def apply[T, TList /* <: js.UndefOr[typingsJapgolly.cypress.typesLodashMod.List[T] | Null] */](iteratee: __, collection: Null & TList): LodashForEachRight5x2[T, TList] = js.native
}
