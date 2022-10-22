package typingsJapgolly.lodash.fpMod

import typingsJapgolly.lodash.mod.Dictionary
import typingsJapgolly.lodash.mod.NumericDictionary
import typingsJapgolly.lodash.mod.PartialObject
import typingsJapgolly.lodash.mod.ValueKeyIteratee
import typingsJapgolly.lodash.mod.__
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LodashOmitBy extends StObject {
  
  def apply[T](predicate: ValueKeyIteratee[T]): LodashOmitBy1x1[T] = js.native
  def apply[T /* <: js.Object */](
    predicate: ValueKeyIteratee[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
    ],
    `object`: T
  ): PartialObject[T] = js.native
  def apply[T](predicate: ValueKeyIteratee[T], `object`: Dictionary[T]): Dictionary[T] = js.native
  def apply[T](predicate: ValueKeyIteratee[T], `object`: NumericDictionary[T]): NumericDictionary[T] = js.native
  def apply[T](predicate: __): LodashOmitBy2x2[T] = js.native
  def apply[T /* <: js.Object */](predicate: __, `object`: T): LodashOmitBy3x2[T] = js.native
  def apply[T](predicate: __, `object`: Dictionary[T]): LodashOmitBy1x2[T] = js.native
  def apply[T](predicate: __, `object`: NumericDictionary[T]): LodashOmitBy2x2[T] = js.native
}
