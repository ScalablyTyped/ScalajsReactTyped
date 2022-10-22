package typingsJapgolly.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.arcgisJsApi.esri.SummaryStatisticsResult
import typingsJapgolly.arcgisJsApi.esri.summaryStatisticsSummaryStatisticsParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriSmartMappingStatisticsSummaryStatisticsMod extends Shortcut {
  
  @JSImport("esri/smartMapping/statistics/summaryStatistics", JSImport.Namespace)
  @js.native
  val ^ : js.Function1[
    /* params */ summaryStatisticsSummaryStatisticsParams, 
    js.Promise[SummaryStatisticsResult]
  ] = js.native
  
  type _To = js.Function1[
    /* params */ summaryStatisticsSummaryStatisticsParams, 
    js.Promise[SummaryStatisticsResult]
  ]
  
  /* This means you don't have to write `^`, but can instead just say `esriSmartMappingStatisticsSummaryStatisticsMod.foo` */
  override def _to: js.Function1[
    /* params */ summaryStatisticsSummaryStatisticsParams, 
    js.Promise[SummaryStatisticsResult]
  ] = ^
}
