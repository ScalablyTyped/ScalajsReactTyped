package typingsJapgolly.angularDevkitBuildAngular.anon

import typingsJapgolly.angularDevkitBuildAngular.angularDevkitBuildAngularStrings.browser
import typingsJapgolly.angularDevkitBuildAngular.angularDevkitBuildAngularStrings.server
import typingsJapgolly.angularDevkitBuildAngular.srcBuildersBrowserSchemaMod.AssetPatternClass
import typingsJapgolly.angularDevkitBuildAngular.srcBuildersBrowserSchemaMod.Budget
import typingsJapgolly.angularDevkitBuildAngular.srcBuildersBrowserSchemaMod.CrossOrigin
import typingsJapgolly.angularDevkitBuildAngular.srcBuildersBrowserSchemaMod.I18NTranslation
import typingsJapgolly.angularDevkitBuildAngular.srcBuildersBrowserSchemaMod.IndexUnion
import typingsJapgolly.angularDevkitBuildAngular.srcBuildersBrowserSchemaMod.InlineStyleLanguage
import typingsJapgolly.angularDevkitBuildAngular.srcBuildersBrowserSchemaMod.Localize
import typingsJapgolly.angularDevkitBuildAngular.srcBuildersBrowserSchemaMod.OutputHashing
import typingsJapgolly.angularDevkitBuildAngular.srcBuildersBrowserSchemaMod.ScriptElement
import typingsJapgolly.angularDevkitBuildAngular.srcBuildersBrowserSchemaMod.SourceMapClass
import typingsJapgolly.angularDevkitBuildAngular.srcBuildersBrowserSchemaMod.StyleElement
import typingsJapgolly.angularDevkitBuildAngular.srcBuildersBrowserSchemaMod.StylePreprocessorOptions
import typingsJapgolly.angularDevkitBuildAngular.srcUtilsNormalizeCacheMod.NormalizedCachedOptions
import typingsJapgolly.angularDevkitBuildAngular.srcUtilsNormalizeFileReplacementsMod.NormalizedFileReplacement
import typingsJapgolly.angularDevkitBuildAngular.srcUtilsNormalizeOptimizationMod.NormalizedOptimizationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@angular-devkit/build-angular.@angular-devkit/build-angular/src/utils.NormalizedBrowserBuilderSchema> */
trait PartialNormalizedBrowserB extends StObject {
  
  var allowedCommonJsDependencies: js.UndefOr[js.Array[String]] = js.undefined
  
  var aot: js.UndefOr[Boolean] = js.undefined
  
  var assets: js.UndefOr[js.Array[AssetPatternClass]] = js.undefined
  
  var baseHref: js.UndefOr[String] = js.undefined
  
  var budgets: js.UndefOr[js.Array[Budget]] = js.undefined
  
  var buildOptimizer: js.UndefOr[Boolean] = js.undefined
  
  var bundleDependencies: js.UndefOr[Boolean] = js.undefined
  
  var cache: js.UndefOr[NormalizedCachedOptions] = js.undefined
  
  var codeCoverage: js.UndefOr[Boolean] = js.undefined
  
  var codeCoverageExclude: js.UndefOr[js.Array[String]] = js.undefined
  
  var commonChunk: js.UndefOr[Boolean] = js.undefined
  
  var crossOrigin: js.UndefOr[CrossOrigin] = js.undefined
  
  var deleteOutputPath: js.UndefOr[Boolean] = js.undefined
  
  var deployUrl: js.UndefOr[String] = js.undefined
  
  var environment: js.UndefOr[String] = js.undefined
  
  var externalDependencies: js.UndefOr[js.Array[String]] = js.undefined
  
  var extractLicenses: js.UndefOr[Boolean] = js.undefined
  
  var fileReplacements: js.UndefOr[js.Array[NormalizedFileReplacement]] = js.undefined
  
  var hmr: js.UndefOr[Boolean] = js.undefined
  
  var i18nDuplicateTranslation: js.UndefOr[I18NTranslation] = js.undefined
  
  var i18nMissingTranslation: js.UndefOr[I18NTranslation] = js.undefined
  
  var index: js.UndefOr[IndexUnion] = js.undefined
  
  var inlineStyleLanguage: js.UndefOr[InlineStyleLanguage] = js.undefined
  
  var localize: js.UndefOr[Localize] = js.undefined
  
  var main: js.UndefOr[String] = js.undefined
  
  var namedChunks: js.UndefOr[Boolean] = js.undefined
  
  var ngswConfigPath: js.UndefOr[String] = js.undefined
  
  var optimization: js.UndefOr[NormalizedOptimizationOptions] = js.undefined
  
  var outputHashing: js.UndefOr[OutputHashing] = js.undefined
  
  var outputPath: js.UndefOr[String] = js.undefined
  
  var platform: js.UndefOr[browser | server] = js.undefined
  
  var poll: js.UndefOr[Double] = js.undefined
  
  var polyfills: js.UndefOr[String] = js.undefined
  
  var preserveSymlinks: js.UndefOr[Boolean] = js.undefined
  
  var progress: js.UndefOr[Boolean] = js.undefined
  
  var resourcesOutputPath: js.UndefOr[String] = js.undefined
  
  var scripts: js.UndefOr[js.Array[ScriptElement]] = js.undefined
  
  var serviceWorker: js.UndefOr[Boolean] = js.undefined
  
  var sourceMap: js.UndefOr[SourceMapClass] = js.undefined
  
  var statsJson: js.UndefOr[Boolean] = js.undefined
  
  var stylePreprocessorOptions: js.UndefOr[StylePreprocessorOptions] = js.undefined
  
  var styles: js.UndefOr[js.Array[StyleElement]] = js.undefined
  
  var subresourceIntegrity: js.UndefOr[Boolean] = js.undefined
  
  var supportedBrowsers: js.UndefOr[js.Array[String]] = js.undefined
  
  var tsConfig: js.UndefOr[String] = js.undefined
  
  var vendorChunk: js.UndefOr[Boolean] = js.undefined
  
  var verbose: js.UndefOr[Boolean] = js.undefined
  
  var watch: js.UndefOr[Boolean] = js.undefined
  
  var webWorkerTsConfig: js.UndefOr[String] = js.undefined
}
object PartialNormalizedBrowserB {
  
  inline def apply(): PartialNormalizedBrowserB = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialNormalizedBrowserB]
  }
  
  extension [Self <: PartialNormalizedBrowserB](x: Self) {
    
    inline def setAllowedCommonJsDependencies(value: js.Array[String]): Self = StObject.set(x, "allowedCommonJsDependencies", value.asInstanceOf[js.Any])
    
    inline def setAllowedCommonJsDependenciesUndefined: Self = StObject.set(x, "allowedCommonJsDependencies", js.undefined)
    
    inline def setAllowedCommonJsDependenciesVarargs(value: String*): Self = StObject.set(x, "allowedCommonJsDependencies", js.Array(value*))
    
    inline def setAot(value: Boolean): Self = StObject.set(x, "aot", value.asInstanceOf[js.Any])
    
    inline def setAotUndefined: Self = StObject.set(x, "aot", js.undefined)
    
    inline def setAssets(value: js.Array[AssetPatternClass]): Self = StObject.set(x, "assets", value.asInstanceOf[js.Any])
    
    inline def setAssetsUndefined: Self = StObject.set(x, "assets", js.undefined)
    
    inline def setAssetsVarargs(value: AssetPatternClass*): Self = StObject.set(x, "assets", js.Array(value*))
    
    inline def setBaseHref(value: String): Self = StObject.set(x, "baseHref", value.asInstanceOf[js.Any])
    
    inline def setBaseHrefUndefined: Self = StObject.set(x, "baseHref", js.undefined)
    
    inline def setBudgets(value: js.Array[Budget]): Self = StObject.set(x, "budgets", value.asInstanceOf[js.Any])
    
    inline def setBudgetsUndefined: Self = StObject.set(x, "budgets", js.undefined)
    
    inline def setBudgetsVarargs(value: Budget*): Self = StObject.set(x, "budgets", js.Array(value*))
    
    inline def setBuildOptimizer(value: Boolean): Self = StObject.set(x, "buildOptimizer", value.asInstanceOf[js.Any])
    
    inline def setBuildOptimizerUndefined: Self = StObject.set(x, "buildOptimizer", js.undefined)
    
    inline def setBundleDependencies(value: Boolean): Self = StObject.set(x, "bundleDependencies", value.asInstanceOf[js.Any])
    
    inline def setBundleDependenciesUndefined: Self = StObject.set(x, "bundleDependencies", js.undefined)
    
    inline def setCache(value: NormalizedCachedOptions): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
    
    inline def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
    
    inline def setCodeCoverage(value: Boolean): Self = StObject.set(x, "codeCoverage", value.asInstanceOf[js.Any])
    
    inline def setCodeCoverageExclude(value: js.Array[String]): Self = StObject.set(x, "codeCoverageExclude", value.asInstanceOf[js.Any])
    
    inline def setCodeCoverageExcludeUndefined: Self = StObject.set(x, "codeCoverageExclude", js.undefined)
    
    inline def setCodeCoverageExcludeVarargs(value: String*): Self = StObject.set(x, "codeCoverageExclude", js.Array(value*))
    
    inline def setCodeCoverageUndefined: Self = StObject.set(x, "codeCoverage", js.undefined)
    
    inline def setCommonChunk(value: Boolean): Self = StObject.set(x, "commonChunk", value.asInstanceOf[js.Any])
    
    inline def setCommonChunkUndefined: Self = StObject.set(x, "commonChunk", js.undefined)
    
    inline def setCrossOrigin(value: CrossOrigin): Self = StObject.set(x, "crossOrigin", value.asInstanceOf[js.Any])
    
    inline def setCrossOriginUndefined: Self = StObject.set(x, "crossOrigin", js.undefined)
    
    inline def setDeleteOutputPath(value: Boolean): Self = StObject.set(x, "deleteOutputPath", value.asInstanceOf[js.Any])
    
    inline def setDeleteOutputPathUndefined: Self = StObject.set(x, "deleteOutputPath", js.undefined)
    
    inline def setDeployUrl(value: String): Self = StObject.set(x, "deployUrl", value.asInstanceOf[js.Any])
    
    inline def setDeployUrlUndefined: Self = StObject.set(x, "deployUrl", js.undefined)
    
    inline def setEnvironment(value: String): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentUndefined: Self = StObject.set(x, "environment", js.undefined)
    
    inline def setExternalDependencies(value: js.Array[String]): Self = StObject.set(x, "externalDependencies", value.asInstanceOf[js.Any])
    
    inline def setExternalDependenciesUndefined: Self = StObject.set(x, "externalDependencies", js.undefined)
    
    inline def setExternalDependenciesVarargs(value: String*): Self = StObject.set(x, "externalDependencies", js.Array(value*))
    
    inline def setExtractLicenses(value: Boolean): Self = StObject.set(x, "extractLicenses", value.asInstanceOf[js.Any])
    
    inline def setExtractLicensesUndefined: Self = StObject.set(x, "extractLicenses", js.undefined)
    
    inline def setFileReplacements(value: js.Array[NormalizedFileReplacement]): Self = StObject.set(x, "fileReplacements", value.asInstanceOf[js.Any])
    
    inline def setFileReplacementsUndefined: Self = StObject.set(x, "fileReplacements", js.undefined)
    
    inline def setFileReplacementsVarargs(value: NormalizedFileReplacement*): Self = StObject.set(x, "fileReplacements", js.Array(value*))
    
    inline def setHmr(value: Boolean): Self = StObject.set(x, "hmr", value.asInstanceOf[js.Any])
    
    inline def setHmrUndefined: Self = StObject.set(x, "hmr", js.undefined)
    
    inline def setI18nDuplicateTranslation(value: I18NTranslation): Self = StObject.set(x, "i18nDuplicateTranslation", value.asInstanceOf[js.Any])
    
    inline def setI18nDuplicateTranslationUndefined: Self = StObject.set(x, "i18nDuplicateTranslation", js.undefined)
    
    inline def setI18nMissingTranslation(value: I18NTranslation): Self = StObject.set(x, "i18nMissingTranslation", value.asInstanceOf[js.Any])
    
    inline def setI18nMissingTranslationUndefined: Self = StObject.set(x, "i18nMissingTranslation", js.undefined)
    
    inline def setIndex(value: IndexUnion): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setInlineStyleLanguage(value: InlineStyleLanguage): Self = StObject.set(x, "inlineStyleLanguage", value.asInstanceOf[js.Any])
    
    inline def setInlineStyleLanguageUndefined: Self = StObject.set(x, "inlineStyleLanguage", js.undefined)
    
    inline def setLocalize(value: Localize): Self = StObject.set(x, "localize", value.asInstanceOf[js.Any])
    
    inline def setLocalizeUndefined: Self = StObject.set(x, "localize", js.undefined)
    
    inline def setLocalizeVarargs(value: String*): Self = StObject.set(x, "localize", js.Array(value*))
    
    inline def setMain(value: String): Self = StObject.set(x, "main", value.asInstanceOf[js.Any])
    
    inline def setMainUndefined: Self = StObject.set(x, "main", js.undefined)
    
    inline def setNamedChunks(value: Boolean): Self = StObject.set(x, "namedChunks", value.asInstanceOf[js.Any])
    
    inline def setNamedChunksUndefined: Self = StObject.set(x, "namedChunks", js.undefined)
    
    inline def setNgswConfigPath(value: String): Self = StObject.set(x, "ngswConfigPath", value.asInstanceOf[js.Any])
    
    inline def setNgswConfigPathUndefined: Self = StObject.set(x, "ngswConfigPath", js.undefined)
    
    inline def setOptimization(value: NormalizedOptimizationOptions): Self = StObject.set(x, "optimization", value.asInstanceOf[js.Any])
    
    inline def setOptimizationUndefined: Self = StObject.set(x, "optimization", js.undefined)
    
    inline def setOutputHashing(value: OutputHashing): Self = StObject.set(x, "outputHashing", value.asInstanceOf[js.Any])
    
    inline def setOutputHashingUndefined: Self = StObject.set(x, "outputHashing", js.undefined)
    
    inline def setOutputPath(value: String): Self = StObject.set(x, "outputPath", value.asInstanceOf[js.Any])
    
    inline def setOutputPathUndefined: Self = StObject.set(x, "outputPath", js.undefined)
    
    inline def setPlatform(value: browser | server): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
    
    inline def setPlatformUndefined: Self = StObject.set(x, "platform", js.undefined)
    
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
    
    inline def setSourceMap(value: SourceMapClass): Self = StObject.set(x, "sourceMap", value.asInstanceOf[js.Any])
    
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
    
    inline def setSupportedBrowsers(value: js.Array[String]): Self = StObject.set(x, "supportedBrowsers", value.asInstanceOf[js.Any])
    
    inline def setSupportedBrowsersUndefined: Self = StObject.set(x, "supportedBrowsers", js.undefined)
    
    inline def setSupportedBrowsersVarargs(value: String*): Self = StObject.set(x, "supportedBrowsers", js.Array(value*))
    
    inline def setTsConfig(value: String): Self = StObject.set(x, "tsConfig", value.asInstanceOf[js.Any])
    
    inline def setTsConfigUndefined: Self = StObject.set(x, "tsConfig", js.undefined)
    
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
