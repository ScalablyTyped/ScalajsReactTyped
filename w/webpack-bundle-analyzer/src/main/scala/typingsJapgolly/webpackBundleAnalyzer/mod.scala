package typingsJapgolly.webpackBundleAnalyzer

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.Instantiable1
import typingsJapgolly.node.httpMod.IncomingMessage
import typingsJapgolly.node.httpMod.Server
import typingsJapgolly.node.httpMod.ServerResponse
import typingsJapgolly.node.nodeColonnetMod.Socket
import typingsJapgolly.webpack.mod.Compiler
import typingsJapgolly.webpack.mod.Stats
import typingsJapgolly.webpack.mod.StatsOptions
import typingsJapgolly.webpack.mod.WebpackPluginInstance
import typingsJapgolly.webpackBundleAnalyzer.anon.BoundAddress
import typingsJapgolly.webpackBundleAnalyzer.mod.BundleAnalyzerPlugin.Options
import typingsJapgolly.webpackBundleAnalyzer.mod.BundleAnalyzerPlugin.Stats.ToJsonOptions
import typingsJapgolly.webpackBundleAnalyzer.webpackBundleAnalyzerStrings.auto
import typingsJapgolly.webpackBundleAnalyzer.webpackBundleAnalyzerStrings.disabled
import typingsJapgolly.webpackBundleAnalyzer.webpackBundleAnalyzerStrings.error
import typingsJapgolly.webpackBundleAnalyzer.webpackBundleAnalyzerStrings.gzip
import typingsJapgolly.webpackBundleAnalyzer.webpackBundleAnalyzerStrings.info
import typingsJapgolly.webpackBundleAnalyzer.webpackBundleAnalyzerStrings.json
import typingsJapgolly.webpackBundleAnalyzer.webpackBundleAnalyzerStrings.parsed
import typingsJapgolly.webpackBundleAnalyzer.webpackBundleAnalyzerStrings.server
import typingsJapgolly.webpackBundleAnalyzer.webpackBundleAnalyzerStrings.silent
import typingsJapgolly.webpackBundleAnalyzer.webpackBundleAnalyzerStrings.stat
import typingsJapgolly.webpackBundleAnalyzer.webpackBundleAnalyzerStrings.static
import typingsJapgolly.webpackBundleAnalyzer.webpackBundleAnalyzerStrings.warn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("webpack-bundle-analyzer", "BundleAnalyzerPlugin")
  @js.native
  open class BundleAnalyzerPlugin ()
    extends StObject
       with WebpackPluginInstance {
    def this(options: Options) = this()
    
    /**
    	 * The run point of the plugin, required method.
    	 */
    /* CompleteClass */
    @JSName("apply")
    override def apply(compiler: Compiler): Unit = js.native
    
    var compiler: js.UndefOr[Compiler] = js.native
    
    /** @async */
    def generateJSONReport(stats: Stats): js.Promise[Unit] = js.native
    
    /** @async */
    def generateStaticReport(stats: Stats): js.Promise[Unit] = js.native
    
    def generateStatsFile(stats: Stats): js.Promise[Unit] = js.native
    
    def getBundleDirFromCompiler(): Null | String = js.native
    
    var opts: Options = js.native
    
    var server: Null | (Server[
        Instantiable1[/* socket */ Socket, IncomingMessage], 
        Instantiable1[
          /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
          ServerResponse[IncomingMessage]
        ]
      ]) = js.native
    
    /** @async */
    def startAnalyzerServer(stats: Stats): js.Promise[Unit] = js.native
  }
  object BundleAnalyzerPlugin {
    
    type ExcludeAssetsPattern = String | js.RegExp | ExcludeAssetsPatternFn
    
    type ExcludeAssetsPatternFn = js.Function1[/* assetName */ String, Boolean]
    
    /** The json report that will be produced if `analyzerMode: 'json'` */
    type JsonReport = js.Array[JsonReportItem]
    
    trait JsonReportItem extends StObject {
      
      var concatenated: js.UndefOr[Boolean] = js.undefined
      
      var groups: js.UndefOr[js.Array[JsonReportItem]] = js.undefined
      
      /** in bytes */
      var gzipSize: Double
      
      var id: js.UndefOr[Double | Null] = js.undefined
      
      var inaccurateSizes: js.UndefOr[Boolean] = js.undefined
      
      var isAsset: js.UndefOr[Boolean] = js.undefined
      
      var label: String
      
      /** in bytes */
      var parsedSize: Double
      
      var path: js.UndefOr[String] = js.undefined
      
      /** in bytes */
      var statSize: Double
    }
    object JsonReportItem {
      
      inline def apply(gzipSize: Double, label: String, parsedSize: Double, statSize: Double): JsonReportItem = {
        val __obj = js.Dynamic.literal(gzipSize = gzipSize.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], parsedSize = parsedSize.asInstanceOf[js.Any], statSize = statSize.asInstanceOf[js.Any])
        __obj.asInstanceOf[JsonReportItem]
      }
      
      extension [Self <: JsonReportItem](x: Self) {
        
        inline def setConcatenated(value: Boolean): Self = StObject.set(x, "concatenated", value.asInstanceOf[js.Any])
        
        inline def setConcatenatedUndefined: Self = StObject.set(x, "concatenated", js.undefined)
        
        inline def setGroups(value: js.Array[JsonReportItem]): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
        
        inline def setGroupsUndefined: Self = StObject.set(x, "groups", js.undefined)
        
        inline def setGroupsVarargs(value: JsonReportItem*): Self = StObject.set(x, "groups", js.Array(value*))
        
        inline def setGzipSize(value: Double): Self = StObject.set(x, "gzipSize", value.asInstanceOf[js.Any])
        
        inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        inline def setIdNull: Self = StObject.set(x, "id", null)
        
        inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
        
        inline def setInaccurateSizes(value: Boolean): Self = StObject.set(x, "inaccurateSizes", value.asInstanceOf[js.Any])
        
        inline def setInaccurateSizesUndefined: Self = StObject.set(x, "inaccurateSizes", js.undefined)
        
        inline def setIsAsset(value: Boolean): Self = StObject.set(x, "isAsset", value.asInstanceOf[js.Any])
        
        inline def setIsAssetUndefined: Self = StObject.set(x, "isAsset", js.undefined)
        
        inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
        
        inline def setParsedSize(value: Double): Self = StObject.set(x, "parsedSize", value.asInstanceOf[js.Any])
        
        inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
        
        inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
        
        inline def setStatSize(value: Double): Self = StObject.set(x, "statSize", value.asInstanceOf[js.Any])
      }
    }
    
    trait Options extends StObject {
      
      /**
        * Host that will be used in `server` mode to start HTTP server.
        * @default '127.0.0.1'
        */
      var analyzerHost: js.UndefOr[String] = js.undefined
      
      /**
        * Can be "server", "static" or "disabled".
        * Defaults to "server".
        * In "server" mode analyzer will start HTTP server to show bundle report.
        * In "static" mode single HTML file with bundle report will be generated.
        * In "json" mode single JSON file with bundle report will be generated
        * In "disabled" mode you can use this plugin to just generate Webpack Stats JSON file by setting "generateStatsFile" to true.
        */
      var analyzerMode: js.UndefOr[server | static | json | disabled] = js.undefined
      
      /**
        * Port that will be used in `server` mode to start HTTP server.
        * @default 8888
        */
      var analyzerPort: js.UndefOr[Double | auto] = js.undefined
      
      /**
        * The URL printed to console with server mode.
        * @default 'http://${listenHost}:${boundAddress.port}'
        */
      var analyzerUrl: js.UndefOr[js.Function1[/* options */ BoundAddress, String]] = js.undefined
      
      /**
        * Module sizes to show in report by default.
        * Should be one of "stat", "parsed" or "gzip".
        * @default 'parsed'
        */
      var defaultSizes: js.UndefOr[parsed | stat | gzip] = js.undefined
      
      /**
        * Patterns that will be used to match against asset names to exclude them from the report.
        * If pattern is a string it will be converted to RegExp via `new RegExp(str)`.
        * If pattern is a function it should have the following signature `(assetName: string) => boolean`
        * and should return true to exclude matching asset.
        * If multiple patterns are provided asset should match at least one of them to be excluded.
        * @default null
        */
      var excludeAssets: js.UndefOr[Null | ExcludeAssetsPattern | js.Array[ExcludeAssetsPattern]] = js.undefined
      
      /**
        * If true, Webpack Stats JSON file will be generated in bundles output directory.
        * @default false
        */
      var generateStatsFile: js.UndefOr[Boolean] = js.undefined
      
      /**
        * Log level. Can be "info", "warn", "error" or "silent".
        * @default 'info'
        */
      var logLevel: js.UndefOr[info | warn | error | silent] = js.undefined
      
      /**
        * Automatically open report in default browser.
        * @default true
        */
      var openAnalyzer: js.UndefOr[Boolean] = js.undefined
      
      /**
        * Path to bundle report file that will be generated in "static" mode.
        * Relative to bundles output directory.
        * @default 'report.html'
        */
      var reportFilename: js.UndefOr[String] = js.undefined
      
      /**
        * Content of the HTML title element; or a function of the form () => string that provides the content.
        * @default function that returns pretty printed current date and time.
        */
      var reportTitle: js.UndefOr[String | js.Function0[String]] = js.undefined
      
      /**
        * Name of Webpack Stats JSON file that will be generated if generateStatsFile is true.
        * Relative to bundles output directory.
        * @default 'stats.json'
        */
      var statsFilename: js.UndefOr[String] = js.undefined
      
      /**
        * Options for stats.toJson() method.
        * For example you can exclude sources of your modules from stats file with "source: false" option.
        * @default null
        */
      var statsOptions: js.UndefOr[Null | ToJsonOptions] = js.undefined
    }
    object Options {
      
      inline def apply(): Options = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Options]
      }
      
      extension [Self <: Options](x: Self) {
        
        inline def setAnalyzerHost(value: String): Self = StObject.set(x, "analyzerHost", value.asInstanceOf[js.Any])
        
        inline def setAnalyzerHostUndefined: Self = StObject.set(x, "analyzerHost", js.undefined)
        
        inline def setAnalyzerMode(value: server | static | json | disabled): Self = StObject.set(x, "analyzerMode", value.asInstanceOf[js.Any])
        
        inline def setAnalyzerModeUndefined: Self = StObject.set(x, "analyzerMode", js.undefined)
        
        inline def setAnalyzerPort(value: Double | auto): Self = StObject.set(x, "analyzerPort", value.asInstanceOf[js.Any])
        
        inline def setAnalyzerPortUndefined: Self = StObject.set(x, "analyzerPort", js.undefined)
        
        inline def setAnalyzerUrl(value: /* options */ BoundAddress => String): Self = StObject.set(x, "analyzerUrl", js.Any.fromFunction1(value))
        
        inline def setAnalyzerUrlUndefined: Self = StObject.set(x, "analyzerUrl", js.undefined)
        
        inline def setDefaultSizes(value: parsed | stat | gzip): Self = StObject.set(x, "defaultSizes", value.asInstanceOf[js.Any])
        
        inline def setDefaultSizesUndefined: Self = StObject.set(x, "defaultSizes", js.undefined)
        
        inline def setExcludeAssets(value: ExcludeAssetsPattern | js.Array[ExcludeAssetsPattern]): Self = StObject.set(x, "excludeAssets", value.asInstanceOf[js.Any])
        
        inline def setExcludeAssetsFunction1(value: /* assetName */ String => Boolean): Self = StObject.set(x, "excludeAssets", js.Any.fromFunction1(value))
        
        inline def setExcludeAssetsNull: Self = StObject.set(x, "excludeAssets", null)
        
        inline def setExcludeAssetsUndefined: Self = StObject.set(x, "excludeAssets", js.undefined)
        
        inline def setExcludeAssetsVarargs(value: ExcludeAssetsPattern*): Self = StObject.set(x, "excludeAssets", js.Array(value*))
        
        inline def setGenerateStatsFile(value: Boolean): Self = StObject.set(x, "generateStatsFile", value.asInstanceOf[js.Any])
        
        inline def setGenerateStatsFileUndefined: Self = StObject.set(x, "generateStatsFile", js.undefined)
        
        inline def setLogLevel(value: info | warn | error | silent): Self = StObject.set(x, "logLevel", value.asInstanceOf[js.Any])
        
        inline def setLogLevelUndefined: Self = StObject.set(x, "logLevel", js.undefined)
        
        inline def setOpenAnalyzer(value: Boolean): Self = StObject.set(x, "openAnalyzer", value.asInstanceOf[js.Any])
        
        inline def setOpenAnalyzerUndefined: Self = StObject.set(x, "openAnalyzer", js.undefined)
        
        inline def setReportFilename(value: String): Self = StObject.set(x, "reportFilename", value.asInstanceOf[js.Any])
        
        inline def setReportFilenameUndefined: Self = StObject.set(x, "reportFilename", js.undefined)
        
        inline def setReportTitle(value: String | js.Function0[String]): Self = StObject.set(x, "reportTitle", value.asInstanceOf[js.Any])
        
        inline def setReportTitleCallbackTo(value: CallbackTo[String]): Self = StObject.set(x, "reportTitle", value.toJsFn)
        
        inline def setReportTitleUndefined: Self = StObject.set(x, "reportTitle", js.undefined)
        
        inline def setStatsFilename(value: String): Self = StObject.set(x, "statsFilename", value.asInstanceOf[js.Any])
        
        inline def setStatsFilenameUndefined: Self = StObject.set(x, "statsFilename", js.undefined)
        
        inline def setStatsOptions(value: ToJsonOptions): Self = StObject.set(x, "statsOptions", value.asInstanceOf[js.Any])
        
        inline def setStatsOptionsNull: Self = StObject.set(x, "statsOptions", null)
        
        inline def setStatsOptionsUndefined: Self = StObject.set(x, "statsOptions", js.undefined)
      }
    }
    
    // Copied from @types/webpack@4 as webpack@5 only has `any` defined at the moment.
    // See https://github.com/webpack/webpack/issues/11630
    object Stats {
      
      /* Rewritten from type alias, can be one of: 
        - scala.Boolean
        - typingsJapgolly.webpackBundleAnalyzer.webpackBundleAnalyzerStrings.`errors-only`
        - typingsJapgolly.webpackBundleAnalyzer.webpackBundleAnalyzerStrings.`errors-warnings`
        - typingsJapgolly.webpackBundleAnalyzer.webpackBundleAnalyzerStrings.minimal
        - typingsJapgolly.webpackBundleAnalyzer.webpackBundleAnalyzerStrings.none
        - typingsJapgolly.webpackBundleAnalyzer.webpackBundleAnalyzerStrings.normal
        - typingsJapgolly.webpackBundleAnalyzer.webpackBundleAnalyzerStrings.verbose
      */
      type Preset = _Preset | Boolean
      
      type StatsExcludeFilter = String | (js.Array[(js.Function1[/* assetName */ String, Boolean]) | js.RegExp | String]) | js.RegExp | (js.Function1[/* assetName */ String, Boolean])
      
      type ToJsonOptions = Preset | ToJsonOptionsObject
      
      type ToJsonOptionsObject = StatsOptions
      
      trait _Preset extends StObject
    }
  }
}
