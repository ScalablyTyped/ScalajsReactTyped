package typingsJapgolly.cypress.typesLodashFpMod

import typingsJapgolly.cypress.typesLodashMod.__
import typingsJapgolly.std.Exclude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LodashGetOr1x2[TObject, TKey /* <: /* keyof TObject */ String */] extends StObject {
  
  def apply(defaultValue: __): LodashGetOr1x6[TObject, TKey] = js.native
  def apply(defaultValue: __, `object`: TObject): LodashGetOr1x6[TObject, TKey] = js.native
  def apply[TDefault](defaultValue: TDefault): LodashGetOr1x3[TObject, TKey, TDefault] = js.native
  def apply[TDefault](defaultValue: TDefault, `object`: TObject): (Exclude[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey] */ js.Any, 
    Unit
  ]) | TDefault = js.native
}
