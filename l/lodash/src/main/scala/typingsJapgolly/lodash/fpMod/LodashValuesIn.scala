package typingsJapgolly.lodash.fpMod

import typingsJapgolly.lodash.mod.Dictionary
import typingsJapgolly.lodash.mod.NumericDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LodashValuesIn extends StObject {
  
  def apply[T](): js.Array[T] = js.native
  def apply[T /* <: js.Object */](`object`: T): js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ] = js.native
  def apply[T](`object`: Dictionary[T]): js.Array[T] = js.native
  def apply[T](`object`: typingsJapgolly.lodash.mod.List[T]): js.Array[T] = js.native
  def apply[T](`object`: NumericDictionary[T]): js.Array[T] = js.native
}
