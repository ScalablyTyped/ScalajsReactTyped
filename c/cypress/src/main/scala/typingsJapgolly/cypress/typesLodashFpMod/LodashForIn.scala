package typingsJapgolly.cypress.typesLodashFpMod

import typingsJapgolly.cypress.typesLodashMod.__
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LodashForIn extends StObject {
  
  def apply[T](iteratee: js.Function1[/* value */ T, Any]): LodashForIn1x1[T] = js.native
  def apply[T](
    iteratee: js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ /* value */ js.Any, 
      Any
    ],
    `object`: T
  ): js.UndefOr[T | Null] = js.native
  def apply[T](iteratee: __): LodashForIn2x2[T] = js.native
  def apply[T](iteratee: __, `object`: T): LodashForIn1x2[T] = js.native
}
