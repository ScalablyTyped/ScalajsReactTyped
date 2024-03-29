package typingsJapgolly.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.arcgisJsApi.esri.HeatmapStatisticsResult
import typingsJapgolly.arcgisJsApi.esri.heatmapStatisticsHeatmapStatisticsParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriSmartMappingStatisticsHeatmapStatisticsMod extends Shortcut {
  
  @JSImport("esri/smartMapping/statistics/heatmapStatistics", JSImport.Namespace)
  @js.native
  val ^ : js.Function1[
    /* params */ heatmapStatisticsHeatmapStatisticsParams, 
    js.Promise[HeatmapStatisticsResult]
  ] = js.native
  
  type _To = js.Function1[
    /* params */ heatmapStatisticsHeatmapStatisticsParams, 
    js.Promise[HeatmapStatisticsResult]
  ]
  
  /* This means you don't have to write `^`, but can instead just say `esriSmartMappingStatisticsHeatmapStatisticsMod.foo` */
  override def _to: js.Function1[
    /* params */ heatmapStatisticsHeatmapStatisticsParams, 
    js.Promise[HeatmapStatisticsResult]
  ] = ^
}
