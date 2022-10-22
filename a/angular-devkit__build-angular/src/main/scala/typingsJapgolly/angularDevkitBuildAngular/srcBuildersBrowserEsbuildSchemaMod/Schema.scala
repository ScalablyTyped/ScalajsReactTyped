package typingsJapgolly.angularDevkitBuildAngular.srcBuildersBrowserEsbuildSchemaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Schema extends StObject {
  
  /**
    * A list of CommonJS packages that are allowed to be used without a build time warning.
    */
  var allowedCommonJsDependencies: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Build using Ahead of Time compilation.
    */
  var aot: js.UndefOr[Boolean] = js.undefined
  
  /**
    * List of static application assets.
    */
  var assets: js.UndefOr[js.Array[AssetPattern]] = js.undefined
  
  /**
    * Base url for the application being built.
    */
  var baseHref: js.UndefOr[String] = js.undefined
  
  /**
    * Budget thresholds to ensure parts of your application stay within boundaries which you
    * set.
    */
  var budgets: js.UndefOr[js.Array[Budget]] = js.undefined
  
  /**
    * Enables advanced build optimizations when using the 'aot' option.
    */
  var buildOptimizer: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Generate a seperate bundle containing code used across multiple bundles.
    */
  var commonChunk: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Define the crossorigin attribute setting of elements that provide CORS support.
    */
  var crossOrigin: js.UndefOr[CrossOrigin] = js.undefined
  
  /**
    * Delete the output path before building.
    */
  var deleteOutputPath: js.UndefOr[Boolean] = js.undefined
  
  /**
    * URL where files will be deployed.
    * @deprecated Use "baseHref" option, "APP_BASE_HREF" DI token or a combination of both
    * instead. For more information, see https://angular.io/guide/deployment#the-deploy-url.
    */
  var deployUrl: js.UndefOr[String] = js.undefined
  
  /**
    * Exclude the listed external dependencies from being bundled into the bundle. Instead, the
    * created bundle relies on these dependencies to be available during runtime.
    */
  var externalDependencies: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Extract all licenses in a separate file.
    */
  var extractLicenses: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Replace compilation source files with other compilation source files in the build.
    */
  var fileReplacements: js.UndefOr[js.Array[FileReplacement]] = js.undefined
  
  /**
    * How to handle duplicate translations for i18n.
    */
  var i18nDuplicateTranslation: js.UndefOr[I18NTranslation] = js.undefined
  
  /**
    * How to handle missing translations for i18n.
    */
  var i18nMissingTranslation: js.UndefOr[I18NTranslation] = js.undefined
  
  /**
    * Configures the generation of the application's HTML index.
    */
  var index: IndexUnion
  
  /**
    * The stylesheet language to use for the application's inline component styles.
    */
  var inlineStyleLanguage: js.UndefOr[InlineStyleLanguage] = js.undefined
  
  /**
    * Translate the bundles in one or more locales.
    */
  var localize: js.UndefOr[Localize] = js.undefined
  
  /**
    * The full path for the main entry point to the app, relative to the current workspace.
    */
  var main: String
  
  /**
    * Use file name for lazy loaded chunks.
    */
  var namedChunks: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Path to ngsw-config.json.
    */
  var ngswConfigPath: js.UndefOr[String] = js.undefined
  
  /**
    * Enables optimization of the build output. Including minification of scripts and styles,
    * tree-shaking, dead-code elimination, inlining of critical CSS and fonts inlining. For
    * more information, see
    * https://angular.io/guide/workspace-config#optimization-configuration.
    */
  var optimization: js.UndefOr[OptimizationUnion] = js.undefined
  
  /**
    * Define the output filename cache-busting hashing mode.
    */
  var outputHashing: js.UndefOr[OutputHashing] = js.undefined
  
  /**
    * The full path for the new output directory, relative to the current workspace.
    * By default, writes output to a folder named dist/ in the current project.
    */
  var outputPath: String
  
  /**
    * Enable and define the file watching poll time period in milliseconds.
    */
  var poll: js.UndefOr[Double] = js.undefined
  
  /**
    * The full path for the polyfills file, relative to the current workspace.
    */
  var polyfills: js.UndefOr[String] = js.undefined
  
  /**
    * Do not use the real path when resolving modules. If unset then will default to `true` if
    * NodeJS option --preserve-symlinks is set.
    */
  var preserveSymlinks: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Log progress to the console while building.
    */
  var progress: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The path where style resources will be placed, relative to outputPath.
    */
  var resourcesOutputPath: js.UndefOr[String] = js.undefined
  
  /**
    * Global scripts to be included in the build.
    */
  var scripts: js.UndefOr[js.Array[ScriptElement]] = js.undefined
  
  /**
    * Generates a service worker config for production builds.
    */
  var serviceWorker: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Output source maps for scripts and styles. For more information, see
    * https://angular.io/guide/workspace-config#source-map-configuration.
    */
  var sourceMap: js.UndefOr[SourceMapUnion] = js.undefined
  
  /**
    * Generates a 'stats.json' file which can be analyzed using tools such as
    * 'webpack-bundle-analyzer'.
    */
  var statsJson: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Options to pass to style preprocessors.
    */
  var stylePreprocessorOptions: js.UndefOr[StylePreprocessorOptions] = js.undefined
  
  /**
    * Global styles to be included in the build.
    */
  var styles: js.UndefOr[js.Array[StyleElement]] = js.undefined
  
  /**
    * Enables the use of subresource integrity validation.
    */
  var subresourceIntegrity: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The full path for the TypeScript configuration file, relative to the current workspace.
    */
  var tsConfig: String
  
  /**
    * Generate a seperate bundle containing only vendor libraries. This option should only used
    * for development.
    */
  var vendorChunk: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Adds more details to output logging.
    */
  var verbose: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Run build when files change.
    */
  var watch: js.UndefOr[Boolean] = js.undefined
  
  /**
    * TypeScript configuration for Web Worker modules.
    */
  var webWorkerTsConfig: js.UndefOr[String] = js.undefined
}
object Schema {
  
  inline def apply(index: IndexUnion, main: String, outputPath: String, tsConfig: String): Schema = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], main = main.asInstanceOf[js.Any], outputPath = outputPath.asInstanceOf[js.Any], tsConfig = tsConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema]
  }
  
  extension [Self <: Schema](x: Self) {
    
    inline def setAllowedCommonJsDependencies(value: js.Array[String]): Self = StObject.set(x, "allowedCommonJsDependencies", value.asInstanceOf[js.Any])
    
    inline def setAllowedCommonJsDependenciesUndefined: Self = StObject.set(x, "allowedCommonJsDependencies", js.undefined)
    
    inline def setAllowedCommonJsDependenciesVarargs(value: String*): Self = StObject.set(x, "allowedCommonJsDependencies", js.Array(value*))
    
    inline def setAot(value: Boolean): Self = StObject.set(x, "aot", value.asInstanceOf[js.Any])
    
    inline def setAotUndefined: Self = StObject.set(x, "aot", js.undefined)
    
    inline def setAssets(value: js.Array[AssetPattern]): Self = StObject.set(x, "assets", value.asInstanceOf[js.Any])
    
    inline def setAssetsUndefined: Self = StObject.set(x, "assets", js.undefined)
    
    inline def setAssetsVarargs(value: AssetPattern*): Self = StObject.set(x, "assets", js.Array(value*))
    
    inline def setBaseHref(value: String): Self = StObject.set(x, "baseHref", value.asInstanceOf[js.Any])
    
    inline def setBaseHrefUndefined: Self = StObject.set(x, "baseHref", js.undefined)
    
    inline def setBudgets(value: js.Array[Budget]): Self = StObject.set(x, "budgets", value.asInstanceOf[js.Any])
    
    inline def setBudgetsUndefined: Self = StObject.set(x, "budgets", js.undefined)
    
    inline def setBudgetsVarargs(value: Budget*): Self = StObject.set(x, "budgets", js.Array(value*))
    
    inline def setBuildOptimizer(value: Boolean): Self = StObject.set(x, "buildOptimizer", value.asInstanceOf[js.Any])
    
    inline def setBuildOptimizerUndefined: Self = StObject.set(x, "buildOptimizer", js.undefined)
    
    inline def setCommonChunk(value: Boolean): Self = StObject.set(x, "commonChunk", value.asInstanceOf[js.Any])
    
    inline def setCommonChunkUndefined: Self = StObject.set(x, "commonChunk", js.undefined)
    
    inline def setCrossOrigin(value: CrossOrigin): Self = StObject.set(x, "crossOrigin", value.asInstanceOf[js.Any])
    
    inline def setCrossOriginUndefined: Self = StObject.set(x, "crossOrigin", js.undefined)
    
    inline def setDeleteOutputPath(value: Boolean): Self = StObject.set(x, "deleteOutputPath", value.asInstanceOf[js.Any])
    
    inline def setDeleteOutputPathUndefined: Self = StObject.set(x, "deleteOutputPath", js.undefined)
    
    inline def setDeployUrl(value: String): Self = StObject.set(x, "deployUrl", value.asInstanceOf[js.Any])
    
    inline def setDeployUrlUndefined: Self = StObject.set(x, "deployUrl", js.undefined)
    
    inline def setExternalDependencies(value: js.Array[String]): Self = StObject.set(x, "externalDependencies", value.asInstanceOf[js.Any])
    
    inline def setExternalDependenciesUndefined: Self = StObject.set(x, "externalDependencies", js.undefined)
    
    inline def setExternalDependenciesVarargs(value: String*): Self = StObject.set(x, "externalDependencies", js.Array(value*))
    
    inline def setExtractLicenses(value: Boolean): Self = StObject.set(x, "extractLicenses", value.asInstanceOf[js.Any])
    
    inline def setExtractLicensesUndefined: Self = StObject.set(x, "extractLicenses", js.undefined)
    
    inline def setFileReplacements(value: js.Array[FileReplacement]): Self = StObject.set(x, "fileReplacements", value.asInstanceOf[js.Any])
    
    inline def setFileReplacementsUndefined: Self = StObject.set(x, "fileReplacements", js.undefined)
    
    inline def setFileReplacementsVarargs(value: FileReplacement*): Self = StObject.set(x, "fileReplacements", js.Array(value*))
    
    inline def setI18nDuplicateTranslation(value: I18NTranslation): Self = StObject.set(x, "i18nDuplicateTranslation", value.asInstanceOf[js.Any])
    
    inline def setI18nDuplicateTranslationUndefined: Self = StObject.set(x, "i18nDuplicateTranslation", js.undefined)
    
    inline def setI18nMissingTranslation(value: I18NTranslation): Self = StObject.set(x, "i18nMissingTranslation", value.asInstanceOf[js.Any])
    
    inline def setI18nMissingTranslationUndefined: Self = StObject.set(x, "i18nMissingTranslation", js.undefined)
    
    inline def setIndex(value: IndexUnion): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setInlineStyleLanguage(value: InlineStyleLanguage): Self = StObject.set(x, "inlineStyleLanguage", value.asInstanceOf[js.Any])
    
    inline def setInlineStyleLanguageUndefined: Self = StObject.set(x, "inlineStyleLanguage", js.undefined)
    
    inline def setLocalize(value: Localize): Self = StObject.set(x, "localize", value.asInstanceOf[js.Any])
    
    inline def setLocalizeUndefined: Self = StObject.set(x, "localize", js.undefined)
    
    inline def setLocalizeVarargs(value: String*): Self = StObject.set(x, "localize", js.Array(value*))
    
    inline def setMain(value: String): Self = StObject.set(x, "main", value.asInstanceOf[js.Any])
    
    inline def setNamedChunks(value: Boolean): Self = StObject.set(x, "namedChunks", value.asInstanceOf[js.Any])
    
    inline def setNamedChunksUndefined: Self = StObject.set(x, "namedChunks", js.undefined)
    
    inline def setNgswConfigPath(value: String): Self = StObject.set(x, "ngswConfigPath", value.asInstanceOf[js.Any])
    
    inline def setNgswConfigPathUndefined: Self = StObject.set(x, "ngswConfigPath", js.undefined)
    
    inline def setOptimization(value: OptimizationUnion): Self = StObject.set(x, "optimization", value.asInstanceOf[js.Any])
    
    inline def setOptimizationUndefined: Self = StObject.set(x, "optimization", js.undefined)
    
    inline def setOutputHashing(value: OutputHashing): Self = StObject.set(x, "outputHashing", value.asInstanceOf[js.Any])
    
    inline def setOutputHashingUndefined: Self = StObject.set(x, "outputHashing", js.undefined)
    
    inline def setOutputPath(value: String): Self = StObject.set(x, "outputPath", value.asInstanceOf[js.Any])
    
    inline def setPoll(value: Double): Self = StObject.set(x, "poll", value.asInstanceOf[js.Any])
    
    inline def setPollUndefined: Self = StObject.set(x, "poll", js.undefined)
    
    inline def setPolyfills(value: String): Self = StObject.set(x, "polyfills", value.asInstanceOf[js.Any])
    
    inline def setPolyfillsUndefined: Self = StObject.set(x, "polyfills", js.undefined)
    
    inline def setPreserveSymlinks(value: Boolean): Self = StObject.set(x, "preserveSymlinks", value.asInstanceOf[js.Any])
    
    inline def setPreserveSymlinksUndefined: Self = StObject.set(x, "preserveSymlinks", js.undefined)
    
    inline def setProgress(value: Boolean): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
    
    inline def setProgressUndefined: Self = StObject.set(x, "progress", js.undefined)
    
    inline def setResourcesOutputPath(value: String): Self = StObject.set(x, "resourcesOutputPath", value.asInstanceOf[js.Any])
    
    inline def setResourcesOutputPathUndefined: Self = StObject.set(x, "resourcesOutputPath", js.undefined)
    
    inline def setScripts(value: js.Array[ScriptElement]): Self = StObject.set(x, "scripts", value.asInstanceOf[js.Any])
    
    inline def setScriptsUndefined: Self = StObject.set(x, "scripts", js.undefined)
    
    inline def setScriptsVarargs(value: ScriptElement*): Self = StObject.set(x, "scripts", js.Array(value*))
    
    inline def setServiceWorker(value: Boolean): Self = StObject.set(x, "serviceWorker", value.asInstanceOf[js.Any])
    
    inline def setServiceWorkerUndefined: Self = StObject.set(x, "serviceWorker", js.undefined)
    
    inline def setSourceMap(value: SourceMapUnion): Self = StObject.set(x, "sourceMap", value.asInstanceOf[js.Any])
    
    inline def setSourceMapUndefined: Self = StObject.set(x, "sourceMap", js.undefined)
    
    inline def setStatsJson(value: Boolean): Self = StObject.set(x, "statsJson", value.asInstanceOf[js.Any])
    
    inline def setStatsJsonUndefined: Self = StObject.set(x, "statsJson", js.undefined)
    
    inline def setStylePreprocessorOptions(value: StylePreprocessorOptions): Self = StObject.set(x, "stylePreprocessorOptions", value.asInstanceOf[js.Any])
    
    inline def setStylePreprocessorOptionsUndefined: Self = StObject.set(x, "stylePreprocessorOptions", js.undefined)
    
    inline def setStyles(value: js.Array[StyleElement]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    
    inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
    
    inline def setStylesVarargs(value: StyleElement*): Self = StObject.set(x, "styles", js.Array(value*))
    
    inline def setSubresourceIntegrity(value: Boolean): Self = StObject.set(x, "subresourceIntegrity", value.asInstanceOf[js.Any])
    
    inline def setSubresourceIntegrityUndefined: Self = StObject.set(x, "subresourceIntegrity", js.undefined)
    
    inline def setTsConfig(value: String): Self = StObject.set(x, "tsConfig", value.asInstanceOf[js.Any])
    
    inline def setVendorChunk(value: Boolean): Self = StObject.set(x, "vendorChunk", value.asInstanceOf[js.Any])
    
    inline def setVendorChunkUndefined: Self = StObject.set(x, "vendorChunk", js.undefined)
    
    inline def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
    
    inline def setVerboseUndefined: Self = StObject.set(x, "verbose", js.undefined)
    
    inline def setWatch(value: Boolean): Self = StObject.set(x, "watch", value.asInstanceOf[js.Any])
    
    inline def setWatchUndefined: Self = StObject.set(x, "watch", js.undefined)
    
    inline def setWebWorkerTsConfig(value: String): Self = StObject.set(x, "webWorkerTsConfig", value.asInstanceOf[js.Any])
    
    inline def setWebWorkerTsConfigUndefined: Self = StObject.set(x, "webWorkerTsConfig", js.undefined)
  }
}
