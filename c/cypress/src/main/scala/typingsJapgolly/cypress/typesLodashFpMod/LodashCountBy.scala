package typingsJapgolly.cypress.typesLodashFpMod

import typingsJapgolly.cypress.typesLodashMod.Dictionary
import typingsJapgolly.cypress.typesLodashMod.ValueIteratee
import typingsJapgolly.cypress.typesLodashMod.__
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LodashCountBy extends StObject {
  
  def apply[T](
    iteratee: ValueIteratee[
      (/* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any) | T
    ]
  ): Dictionary[Double] = js.native
  def apply[T /* <: js.Object */](
    iteratee: ValueIteratee[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
    ],
    collection: T
  ): Dictionary[Double] = js.native
  def apply[T](iteratee: ValueIteratee[T], collection: typingsJapgolly.cypress.typesLodashMod.List[T]): Dictionary[Double] = js.native
  def apply[T](iteratee: __): LodashCountBy1x2[T] = js.native
  def apply[T /* <: js.Object */](iteratee: __, collection: T): LodashCountBy2x2[T] = js.native
  def apply[T](iteratee: __, collection: typingsJapgolly.cypress.typesLodashMod.List[T]): LodashCountBy1x2[T] = js.native
}
