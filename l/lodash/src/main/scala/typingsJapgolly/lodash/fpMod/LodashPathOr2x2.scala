package typingsJapgolly.lodash.fpMod

import typingsJapgolly.lodash.mod.__
import typingsJapgolly.std.Exclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashPathOr2x2[TObject, TKey1 /* <: String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */] extends js.Object {
  def apply(defaultValue: __): LodashPathOr2x6[TObject, TKey1, TKey2] = js.native
  def apply(defaultValue: __, `object`: TObject): LodashPathOr2x6[TObject, TKey1, TKey2] = js.native
  def apply[TDefault](defaultValue: TDefault): (Exclude[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey1][TKey2] */ js.Any, 
    js.UndefOr[scala.Nothing]
  ]) | TDefault = js.native
  def apply[TDefault](defaultValue: TDefault, `object`: TObject): (Exclude[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey1][TKey2] */ js.Any, 
    js.UndefOr[scala.Nothing]
  ]) | TDefault = js.native
}

