package typingsJapgolly.lodash.fpMod

import typingsJapgolly.lodash.lodashMod.__
import typingsJapgolly.std.Exclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashPathOr1x2[TObject, TKey /* <: String */] extends js.Object {
  def apply(defaultValue: __): LodashPathOr1x6[TObject, TKey] = js.native
  def apply(defaultValue: __, `object`: TObject): LodashPathOr1x6[TObject, TKey] = js.native
  def apply[TDefault](defaultValue: TDefault): LodashPathOr1x3[TObject, TKey, TDefault] = js.native
  def apply[TDefault](defaultValue: TDefault, `object`: TObject): (Exclude[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey] */ js.Any, 
    js.UndefOr[scala.Nothing]
  ]) | TDefault = js.native
}

