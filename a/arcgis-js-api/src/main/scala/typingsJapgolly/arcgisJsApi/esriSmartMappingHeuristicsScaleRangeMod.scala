package typingsJapgolly.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.arcgisJsApi.esri.ScaleRangeResult
import typingsJapgolly.arcgisJsApi.esri.scaleRangeScaleRangeParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriSmartMappingHeuristicsScaleRangeMod extends Shortcut {
  
  @JSImport("esri/smartMapping/heuristics/scaleRange", JSImport.Namespace)
  @js.native
  val ^ : js.Function1[/* params */ scaleRangeScaleRangeParams, js.Promise[ScaleRangeResult]] = js.native
  
  type _To = js.Function1[/* params */ scaleRangeScaleRangeParams, js.Promise[ScaleRangeResult]]
  
  /* This means you don't have to write `^`, but can instead just say `esriSmartMappingHeuristicsScaleRangeMod.foo` */
  override def _to: js.Function1[/* params */ scaleRangeScaleRangeParams, js.Promise[ScaleRangeResult]] = ^
}
