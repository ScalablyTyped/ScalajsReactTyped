package typingsJapgolly.cypress.typesLodashFpMod

import typingsJapgolly.cypress.typesLodashMod.Dictionary
import typingsJapgolly.cypress.typesLodashMod.NumericDictionary
import typingsJapgolly.cypress.typesLodashMod.__
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LodashMapValues extends StObject {
  
  def apply(iteratee: String): LodashMapValues6x1 = js.native
  def apply(iteratee: js.Object): LodashMapValues3x1 = js.native
  def apply[T](callbackOrIterateeOrIterateeOrIteratee: __): LodashMapValues1x2[T] = js.native
  def apply[T](callbackOrIterateeOrIterateeOrIteratee: __, obj: Dictionary[T]): LodashMapValues1x2[T] = js.native
  def apply[T](callbackOrIterateeOrIterateeOrIteratee: __, obj: NumericDictionary[T]): LodashMapValues1x2[T] = js.native
  def apply[T /* <: js.Object */](callbackOrIterateeOrIteratee: __, obj: T): LodashMapValues2x2[T] = js.native
  def apply[T /* <: js.Object */](iteratee: String, obj: T): /* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof T ]: any} */ js.Any = js.native
  def apply[T](iteratee: String, obj: Dictionary[T]): Dictionary[Any] = js.native
  def apply[T](iteratee: String, obj: NumericDictionary[T]): Dictionary[Any] = js.native
  def apply[T /* <: js.Object */](iteratee: js.Object, obj: T): /* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof T ]: boolean} */ js.Any = js.native
  def apply[T](iteratee: js.Object, obj: Dictionary[T]): Dictionary[Boolean] = js.native
  def apply[T](iteratee: js.Object, obj: NumericDictionary[T]): Dictionary[Boolean] = js.native
  def apply[T, TResult](callback: js.Function1[/* value */ T, TResult]): Dictionary[TResult] = js.native
  def apply[T /* <: js.Object */, TResult](
    callback: js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ /* value */ js.Any, 
      TResult
    ],
    obj: T
  ): /* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof T ]: TResult} */ js.Any = js.native
  def apply[T, TResult](callback: js.Function1[/* value */ T, TResult], obj: Dictionary[T]): Dictionary[TResult] = js.native
  def apply[T, TResult](callback: js.Function1[/* value */ T, TResult], obj: NumericDictionary[T]): Dictionary[TResult] = js.native
  def apply[T, TKey /* <: /* keyof T */ String */](iteratee: TKey): Dictionary[
    /* import warning: importer.ImportType#apply Failed type conversion: T[TKey] */ js.Any
  ] = js.native
  def apply[T, TKey /* <: /* keyof T */ String */](iteratee: TKey, obj: Dictionary[T]): Dictionary[
    /* import warning: importer.ImportType#apply Failed type conversion: T[TKey] */ js.Any
  ] = js.native
  def apply[T, TKey /* <: /* keyof T */ String */](iteratee: TKey, obj: NumericDictionary[T]): Dictionary[
    /* import warning: importer.ImportType#apply Failed type conversion: T[TKey] */ js.Any
  ] = js.native
}
