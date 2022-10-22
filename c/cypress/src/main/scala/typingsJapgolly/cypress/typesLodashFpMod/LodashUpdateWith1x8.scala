package typingsJapgolly.cypress.typesLodashFpMod

import typingsJapgolly.cypress.typesLodashMod.PropertyPath
import typingsJapgolly.cypress.typesLodashMod.SetWithCustomizer
import typingsJapgolly.cypress.typesLodashMod.__
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LodashUpdateWith1x8[T] extends StObject {
  
  def apply(customizer: SetWithCustomizer[T]): LodashUpdateWith1x9[T] = js.native
  def apply(customizer: SetWithCustomizer[T], path: PropertyPath): LodashUpdateWith1x11[T] = js.native
  def apply(
    customizer: SetWithCustomizer[T],
    path: PropertyPath,
    updater: js.Function1[/* oldValue */ Any, Any]
  ): T = js.native
  def apply(customizer: SetWithCustomizer[T], path: __, updater: js.Function1[/* oldValue */ Any, Any]): LodashUpdateWith1x13[T] = js.native
  def apply(customizer: __, path: PropertyPath): LodashUpdateWith1x10[T] = js.native
  def apply(customizer: __, path: PropertyPath, updater: js.Function1[/* oldValue */ Any, Any]): LodashUpdateWith1x14[T] = js.native
  def apply(customizer: __, path: __, updater: js.Function1[/* oldValue */ Any, Any]): LodashUpdateWith1x12[T] = js.native
}
