package typingsJapgolly.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.arcgisJsApi.esri.UniqueValuesResult
import typingsJapgolly.arcgisJsApi.esri.uniqueValuesUniqueValuesParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriSmartMappingStatisticsUniqueValuesMod extends Shortcut {
  
  @JSImport("esri/smartMapping/statistics/uniqueValues", JSImport.Namespace)
  @js.native
  val ^ : js.Function1[/* params */ uniqueValuesUniqueValuesParams, js.Promise[UniqueValuesResult]] = js.native
  
  type _To = js.Function1[/* params */ uniqueValuesUniqueValuesParams, js.Promise[UniqueValuesResult]]
  
  /* This means you don't have to write `^`, but can instead just say `esriSmartMappingStatisticsUniqueValuesMod.foo` */
  override def _to: js.Function1[/* params */ uniqueValuesUniqueValuesParams, js.Promise[UniqueValuesResult]] = ^
}
