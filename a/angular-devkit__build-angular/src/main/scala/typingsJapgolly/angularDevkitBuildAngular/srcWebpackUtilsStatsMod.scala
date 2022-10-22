package typingsJapgolly.angularDevkitBuildAngular

import typingsJapgolly.angularDevkitBuildAngular.anon.EstimatedTransferSize
import typingsJapgolly.angularDevkitBuildAngular.srcBuildersBrowserSchemaMod.Schema
import typingsJapgolly.angularDevkitBuildAngular.srcUtilsBundleCalculatorMod.BudgetCalculatorResult
import typingsJapgolly.angularDevkitBuildAngular.srcWebpackUtilsHelpersMod.WebpackStatsOptions
import typingsJapgolly.angularDevkitBuildWebpack.srcWebpackMod.WebpackLoggingCallback
import typingsJapgolly.angularDevkitCore.srcLoggerLoggerMod.LoggerApi
import typingsJapgolly.webpack.mod.Configuration
import typingsJapgolly.webpack.mod.StatsCompilation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcWebpackUtilsStatsMod {
  
  @JSImport("@angular-devkit/build-angular/src/webpack/utils/stats", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createWebpackLoggingCallback(options: Schema, logger: LoggerApi): WebpackLoggingCallback = (^.asInstanceOf[js.Dynamic].applyDynamic("createWebpackLoggingCallback")(options.asInstanceOf[js.Any], logger.asInstanceOf[js.Any])).asInstanceOf[WebpackLoggingCallback]
  
  inline def formatSize(size: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("formatSize")(size.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def generateBundleStats(info: EstimatedTransferSize): BundleStats = ^.asInstanceOf[js.Dynamic].applyDynamic("generateBundleStats")(info.asInstanceOf[js.Any]).asInstanceOf[BundleStats]
  
  inline def statsErrorsToString(json: StatsCompilation, statsConfig: WebpackStatsOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("statsErrorsToString")(json.asInstanceOf[js.Any], statsConfig.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def statsHasErrors(json: StatsCompilation): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("statsHasErrors")(json.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def statsHasWarnings(json: StatsCompilation): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("statsHasWarnings")(json.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def statsWarningsToString(json: StatsCompilation, statsConfig: WebpackStatsOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("statsWarningsToString")(json.asInstanceOf[js.Any], statsConfig.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def webpackStatsLogger(logger: LoggerApi, json: StatsCompilation, config: Configuration): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("webpackStatsLogger")(logger.asInstanceOf[js.Any], json.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def webpackStatsLogger(
    logger: LoggerApi,
    json: StatsCompilation,
    config: Configuration,
    budgetFailures: js.Array[BudgetCalculatorResult]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("webpackStatsLogger")(logger.asInstanceOf[js.Any], json.asInstanceOf[js.Any], config.asInstanceOf[js.Any], budgetFailures.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait BundleStats extends StObject {
    
    var initial: Boolean
    
    var stats: BundleStatsData
  }
  object BundleStats {
    
    inline def apply(initial: Boolean, stats: BundleStatsData): BundleStats = {
      val __obj = js.Dynamic.literal(initial = initial.asInstanceOf[js.Any], stats = stats.asInstanceOf[js.Any])
      __obj.asInstanceOf[BundleStats]
    }
    
    extension [Self <: BundleStats](x: Self) {
      
      inline def setInitial(value: Boolean): Self = StObject.set(x, "initial", value.asInstanceOf[js.Any])
      
      inline def setStats(value: BundleStatsData): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
    }
  }
  
  type BundleStatsData = js.Tuple4[
    /* files */ String, 
    /* names */ String, 
    /* rawSize */ Double | String, 
    /* estimatedTransferSize */ Double | String
  ]
}
