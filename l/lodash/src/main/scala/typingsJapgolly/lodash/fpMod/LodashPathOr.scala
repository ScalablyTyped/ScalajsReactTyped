package typingsJapgolly.lodash.fpMod

import typingsJapgolly.lodash.mod.NumericDictionary
import typingsJapgolly.lodash.mod.PropertyPath
import typingsJapgolly.lodash.mod.__
import typingsJapgolly.std.Exclude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LodashPathOr extends StObject {
  
  def apply(defaultValue: Any): LodashPathOr7x1 = js.native
  def apply(defaultValue: Any, path: PropertyPath): LodashPathOr7x3 = js.native
  def apply(defaultValue: Any, path: PropertyPath, `object`: Any): Any = js.native
  def apply(defaultValue: Any, path: __, `object`: Any): LodashPathOr7x5 = js.native
  def apply(defaultValue: __, path: Double): LodashPathOr5x2 = js.native
  def apply(defaultValue: __, path: PropertyPath): LodashPathOr6x6 = js.native
  def apply(defaultValue: __, path: PropertyPath, `object`: Any): LodashPathOr7x6 = js.native
  def apply(defaultValue: __, path: __): LodashPathOr6x4 = js.native
  def apply(defaultValue: __, path: __, `object`: Any): LodashPathOr7x4 = js.native
  def apply[TDefault](defaultValue: TDefault, path: Double): LodashPathOr5x3[TDefault] = js.native
  def apply[TDefault](defaultValue: TDefault, path: __): LodashPathOr6x5[TDefault] = js.native
  def apply[T](defaultValue: __, path: Double, `object`: NumericDictionary[T]): LodashPathOr5x6[T] = js.native
  def apply[T](defaultValue: __, path: __, `object`: NumericDictionary[T]): LodashPathOr5x4[T] = js.native
  def apply[T, TDefault](defaultValue: TDefault, path: Double, `object`: NumericDictionary[T]): T | TDefault = js.native
  def apply[T, TDefault](defaultValue: TDefault, path: __, `object`: NumericDictionary[T]): LodashPathOr5x5[T, TDefault] = js.native
  def apply[TObject /* <: js.Object */, TKey /* <: /* keyof TObject */ String */](defaultValue: __, path: js.Array[TKey]): LodashPathOr1x6[TObject, TKey] = js.native
  def apply[TObject /* <: js.Object */, TKey /* <: /* keyof TObject */ String */](defaultValue: __, path: js.Array[TKey], `object`: TObject): LodashPathOr1x6[TObject, TKey] = js.native
  def apply[TObject /* <: js.Object */, TKey /* <: /* keyof TObject */ String */, TDefault](defaultValue: TDefault, path: js.Array[TKey]): (Exclude[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey] */ js.Any, 
    Unit
  ]) | TDefault = js.native
  def apply[TObject /* <: js.Object */, TKey /* <: /* keyof TObject */ String */, TDefault](defaultValue: TDefault, path: js.Array[TKey], `object`: TObject): (Exclude[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey] */ js.Any, 
    Unit
  ]) | TDefault = js.native
  def apply[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */](defaultValue: __, path: js.Tuple2[TKey1, TKey2]): LodashPathOr2x2[TObject, TKey1, TKey2] = js.native
  def apply[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */](defaultValue: __, path: js.Tuple2[TKey1, TKey2], `object`: TObject): LodashPathOr2x6[TObject, TKey1, TKey2] = js.native
  def apply[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TDefault](defaultValue: TDefault, path: js.Tuple2[TKey1, TKey2]): LodashPathOr2x3[TObject, TKey1, TKey2, TDefault] = js.native
  def apply[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TDefault](defaultValue: TDefault, path: js.Tuple2[TKey1, TKey2], `object`: TObject): (Exclude[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey1][TKey2] */ js.Any, 
    Unit
  ]) | TDefault = js.native
  def apply[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TKey3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2] */ js.Any */](defaultValue: __, path: js.Tuple3[TKey1, TKey2, TKey3]): LodashPathOr3x2[TObject, TKey1, TKey2, TKey3] = js.native
  def apply[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TKey3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2] */ js.Any */](defaultValue: __, path: js.Tuple3[TKey1, TKey2, TKey3], `object`: TObject): LodashPathOr3x6[TObject, TKey1, TKey2, TKey3] = js.native
  def apply[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TKey3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2] */ js.Any */, TDefault](defaultValue: TDefault, path: js.Tuple3[TKey1, TKey2, TKey3]): LodashPathOr3x3[TObject, TKey1, TKey2, TKey3, TDefault] = js.native
  def apply[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TKey3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2] */ js.Any */, TDefault](defaultValue: TDefault, path: js.Tuple3[TKey1, TKey2, TKey3], `object`: TObject): (Exclude[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey1][TKey2][TKey3] */ js.Any, 
    Unit
  ]) | TDefault = js.native
  def apply[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TKey3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2] */ js.Any */, TKey4 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2][TKey3] */ js.Any */](defaultValue: __, path: js.Tuple4[TKey1, TKey2, TKey3, TKey4]): LodashPathOr4x2[TObject, TKey1, TKey2, TKey3, TKey4] = js.native
  def apply[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TKey3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2] */ js.Any */, TKey4 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2][TKey3] */ js.Any */](defaultValue: __, path: js.Tuple4[TKey1, TKey2, TKey3, TKey4], `object`: TObject): LodashPathOr4x6[TObject, TKey1, TKey2, TKey3, TKey4] = js.native
  def apply[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TKey3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2] */ js.Any */, TKey4 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2][TKey3] */ js.Any */, TDefault](defaultValue: TDefault, path: js.Tuple4[TKey1, TKey2, TKey3, TKey4]): LodashPathOr4x3[TObject, TKey1, TKey2, TKey3, TKey4, TDefault] = js.native
  def apply[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TKey3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2] */ js.Any */, TKey4 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2][TKey3] */ js.Any */, TDefault](defaultValue: TDefault, path: js.Tuple4[TKey1, TKey2, TKey3, TKey4], `object`: TObject): (Exclude[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey1][TKey2][TKey3][TKey4] */ js.Any, 
    Unit
  ]) | TDefault = js.native
}
