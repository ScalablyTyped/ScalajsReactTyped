package typingsJapgolly.lodash.fpMod

import typingsJapgolly.lodash.lodashMod.__
import typingsJapgolly.std.Exclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashGetOr4x2[TObject, TKey1 /* <: String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TKey3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2] */ js.Any */, TKey4 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2][TKey3] */ js.Any */] extends js.Object {
  def apply(defaultValue: __): LodashGetOr4x6[TObject, TKey1, TKey2, TKey3, TKey4] = js.native
  def apply(defaultValue: __, `object`: TObject): LodashGetOr4x6[TObject, TKey1, TKey2, TKey3, TKey4] = js.native
  def apply[TDefault](defaultValue: TDefault): LodashGetOr4x3[TObject, TKey1, TKey2, TKey3, TKey4, TDefault] = js.native
  def apply[TDefault](defaultValue: TDefault, `object`: TObject): (Exclude[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey1][TKey2][TKey3][TKey4] */ js.Any, 
    js.UndefOr[scala.Nothing]
  ]) | TDefault = js.native
}

