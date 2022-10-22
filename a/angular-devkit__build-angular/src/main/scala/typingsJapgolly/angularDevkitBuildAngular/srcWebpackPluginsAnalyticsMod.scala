package typingsJapgolly.angularDevkitBuildAngular

import typingsJapgolly.angularDevkitCore.srcAnalyticsApiMod.Analytics
import typingsJapgolly.webpack.mod.Compilation
import typingsJapgolly.webpack.mod.Compiler
import typingsJapgolly.webpack.mod.Module
import typingsJapgolly.webpack.mod.NormalModule
import typingsJapgolly.webpack.mod.Stats
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcWebpackPluginsAnalyticsMod {
  
  @JSImport("@angular-devkit/build-angular/src/webpack/plugins/analytics", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular-devkit/build-angular/src/webpack/plugins/analytics", "NgBuildAnalyticsPlugin")
  @js.native
  open class NgBuildAnalyticsPlugin protected () extends StObject {
    def this(_projectRoot: String, _analytics: Analytics, _category: String) = this()
    
    /* protected */ var _analytics: Analytics = js.native
    
    /* protected */ var _built: Boolean = js.native
    
    /* protected */ var _category: String = js.native
    
    /* protected */ def _checkTsNormalModule(module: NormalModule): Unit = js.native
    
    /* protected */ def _collectBundleStats(compilation: Compilation): Unit = js.native
    
    /* protected */ def _collectErrors(stats: Stats): Unit = js.native
    
    /* protected */ def _compilation(compiler: Compiler, compilation: Compilation): Unit = js.native
    
    /* protected */ def _done(stats: Stats): Unit = js.native
    
    /* protected */ def _getDimensions(): js.Array[String | Double | Boolean] = js.native
    
    /* protected */ def _getMetrics(stats: Stats): js.Array[String | Double] = js.native
    
    /* protected */ var _projectRoot: String = js.native
    
    /* protected */ def _reportBuildMetrics(stats: Stats): Unit = js.native
    
    /* protected */ def _reportRebuildMetrics(stats: Stats): Unit = js.native
    
    /* protected */ def _reset(): Unit = js.native
    
    /* protected */ var _stats: AnalyticsBuildStats = js.native
    
    /** **********************************************************************************************
      * The next section is all the different Webpack hooks for this plugin.
      */
    /**
      * Reports a succeed module.
      * @private
      */
    /* protected */ def _succeedModule(module: Module): Unit = js.native
    
    @JSName("apply")
    def apply(compiler: Compiler): Unit = js.native
  }
  
  inline def countOccurrences(source: String, `match`: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("countOccurrences")(source.asInstanceOf[js.Any], `match`.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def countOccurrences(source: String, `match`: String, wordBreak: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("countOccurrences")(source.asInstanceOf[js.Any], `match`.asInstanceOf[js.Any], wordBreak.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /**
    * Holder of statistics related to the build.
    */
  trait AnalyticsBuildStats extends StObject {
    
    var assetCount: Double
    
    var assetSize: Double
    
    var cssSize: Double
    
    var errors: js.Array[String]
    
    var initialChunkSize: Double
    
    var lazyChunkCount: Double
    
    var lazyChunkSize: Double
    
    var numberOfComponents: Double
    
    var numberOfNgOnInit: Double
    
    var polyfillSize: Double
    
    var totalChunkCount: Double
    
    var totalChunkSize: Double
  }
  object AnalyticsBuildStats {
    
    inline def apply(
      assetCount: Double,
      assetSize: Double,
      cssSize: Double,
      errors: js.Array[String],
      initialChunkSize: Double,
      lazyChunkCount: Double,
      lazyChunkSize: Double,
      numberOfComponents: Double,
      numberOfNgOnInit: Double,
      polyfillSize: Double,
      totalChunkCount: Double,
      totalChunkSize: Double
    ): AnalyticsBuildStats = {
      val __obj = js.Dynamic.literal(assetCount = assetCount.asInstanceOf[js.Any], assetSize = assetSize.asInstanceOf[js.Any], cssSize = cssSize.asInstanceOf[js.Any], errors = errors.asInstanceOf[js.Any], initialChunkSize = initialChunkSize.asInstanceOf[js.Any], lazyChunkCount = lazyChunkCount.asInstanceOf[js.Any], lazyChunkSize = lazyChunkSize.asInstanceOf[js.Any], numberOfComponents = numberOfComponents.asInstanceOf[js.Any], numberOfNgOnInit = numberOfNgOnInit.asInstanceOf[js.Any], polyfillSize = polyfillSize.asInstanceOf[js.Any], totalChunkCount = totalChunkCount.asInstanceOf[js.Any], totalChunkSize = totalChunkSize.asInstanceOf[js.Any])
      __obj.asInstanceOf[AnalyticsBuildStats]
    }
    
    extension [Self <: AnalyticsBuildStats](x: Self) {
      
      inline def setAssetCount(value: Double): Self = StObject.set(x, "assetCount", value.asInstanceOf[js.Any])
      
      inline def setAssetSize(value: Double): Self = StObject.set(x, "assetSize", value.asInstanceOf[js.Any])
      
      inline def setCssSize(value: Double): Self = StObject.set(x, "cssSize", value.asInstanceOf[js.Any])
      
      inline def setErrors(value: js.Array[String]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      inline def setErrorsVarargs(value: String*): Self = StObject.set(x, "errors", js.Array(value*))
      
      inline def setInitialChunkSize(value: Double): Self = StObject.set(x, "initialChunkSize", value.asInstanceOf[js.Any])
      
      inline def setLazyChunkCount(value: Double): Self = StObject.set(x, "lazyChunkCount", value.asInstanceOf[js.Any])
      
      inline def setLazyChunkSize(value: Double): Self = StObject.set(x, "lazyChunkSize", value.asInstanceOf[js.Any])
      
      inline def setNumberOfComponents(value: Double): Self = StObject.set(x, "numberOfComponents", value.asInstanceOf[js.Any])
      
      inline def setNumberOfNgOnInit(value: Double): Self = StObject.set(x, "numberOfNgOnInit", value.asInstanceOf[js.Any])
      
      inline def setPolyfillSize(value: Double): Self = StObject.set(x, "polyfillSize", value.asInstanceOf[js.Any])
      
      inline def setTotalChunkCount(value: Double): Self = StObject.set(x, "totalChunkCount", value.asInstanceOf[js.Any])
      
      inline def setTotalChunkSize(value: Double): Self = StObject.set(x, "totalChunkSize", value.asInstanceOf[js.Any])
    }
  }
}
