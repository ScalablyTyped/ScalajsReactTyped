package typingsJapgolly.cypress.typesLodashFpMod

import typingsJapgolly.cypress.typesLodashMod.Dictionary
import typingsJapgolly.cypress.typesLodashMod.PropertyName
import typingsJapgolly.cypress.typesLodashMod.ValueIterateeCustom
import typingsJapgolly.cypress.typesLodashMod.__
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LodashKeyBy extends StObject {
  
  def apply[T](
    iteratee: ValueIterateeCustom[
      (/* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any) | T, 
      PropertyName
    ]
  ): Dictionary[T] = js.native
  def apply[T /* <: js.Object */](
    iteratee: ValueIterateeCustom[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any, 
      PropertyName
    ],
    collection: T
  ): Dictionary[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ] = js.native
  def apply[T](
    iteratee: ValueIterateeCustom[T, PropertyName],
    collection: typingsJapgolly.cypress.typesLodashMod.List[T]
  ): Dictionary[T] = js.native
  def apply[T /* <: js.Object */](iteratee: __): LodashKeyBy2x2[T] = js.native
  def apply[T /* <: js.Object */](iteratee: __, collection: T): LodashKeyBy2x2[T] = js.native
  def apply[T](iteratee: __, collection: typingsJapgolly.cypress.typesLodashMod.List[T]): LodashKeyBy1x2[T] = js.native
}
