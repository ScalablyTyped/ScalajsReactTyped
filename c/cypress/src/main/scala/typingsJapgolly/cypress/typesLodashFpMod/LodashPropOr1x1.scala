package typingsJapgolly.cypress.typesLodashFpMod

import typingsJapgolly.cypress.typesLodashMod.NumericDictionary
import typingsJapgolly.cypress.typesLodashMod.PropertyPath
import typingsJapgolly.cypress.typesLodashMod.__
import typingsJapgolly.std.Exclude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LodashPropOr1x1[TDefault] extends StObject {
  
  def apply(path: Double): LodashPropOr5x3[TDefault] = js.native
  def apply(path: PropertyPath): TDefault = js.native
  def apply(path: __): LodashPropOr6x5[TDefault] = js.native
  def apply[T](path: Double, `object`: NumericDictionary[T]): T | TDefault = js.native
  def apply[TObject /* <: js.Object */](path: __, `object`: TObject): LodashPropOr1x5[TObject, TDefault] = js.native
  def apply[T](path: __, `object`: NumericDictionary[T]): LodashPropOr5x5[T, TDefault] = js.native
  def apply[TObject /* <: js.Object */, TKey /* <: /* keyof TObject */ String */](path: TKey, `object`: TObject): (Exclude[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey] */ js.Any, 
    Unit
  ]) | TDefault = js.native
  def apply[TObject /* <: js.Object */, TKey /* <: /* keyof TObject */ String */](path: js.Array[TKey]): LodashPropOr1x3[TObject, TKey, TDefault] = js.native
  def apply[TObject /* <: js.Object */, TKey /* <: /* keyof TObject */ String */](path: js.Array[TKey], `object`: TObject): (Exclude[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey] */ js.Any, 
    Unit
  ]) | TDefault = js.native
  def apply[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */](path: js.Tuple2[TKey1, TKey2]): (Exclude[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey1][TKey2] */ js.Any, 
    Unit
  ]) | TDefault = js.native
  def apply[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */](path: js.Tuple2[TKey1, TKey2], `object`: TObject): (Exclude[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey1][TKey2] */ js.Any, 
    Unit
  ]) | TDefault = js.native
  def apply[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TKey3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2] */ js.Any */](path: js.Tuple3[TKey1, TKey2, TKey3]): (Exclude[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey1][TKey2][TKey3] */ js.Any, 
    Unit
  ]) | TDefault = js.native
  def apply[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TKey3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2] */ js.Any */](path: js.Tuple3[TKey1, TKey2, TKey3], `object`: TObject): (Exclude[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey1][TKey2][TKey3] */ js.Any, 
    Unit
  ]) | TDefault = js.native
  def apply[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TKey3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2] */ js.Any */, TKey4 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2][TKey3] */ js.Any */](path: js.Tuple4[TKey1, TKey2, TKey3, TKey4]): LodashPropOr4x3[TObject, TKey1, TKey2, TKey3, TKey4, TDefault] = js.native
  def apply[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TKey3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2] */ js.Any */, TKey4 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2][TKey3] */ js.Any */](path: js.Tuple4[TKey1, TKey2, TKey3, TKey4], `object`: TObject): (Exclude[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey1][TKey2][TKey3][TKey4] */ js.Any, 
    Unit
  ]) | TDefault = js.native
}
