package typingsJapgolly.angularDevkitBuildAngular

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.angularCompilerCli.srcPerformCompileMod.ParsedConfiguration
import typingsJapgolly.angularDevkitBuildAngular.angularDevkitBuildAngularStrings.browser
import typingsJapgolly.angularDevkitBuildAngular.angularDevkitBuildAngularStrings.server
import typingsJapgolly.angularDevkitBuildAngular.anon.IncludePaths
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
import typingsJapgolly.angularDevkitBuildAngular.srcUtilsNormalizeCacheMod.NormalizedCachedOptions
import typingsJapgolly.angularDevkitBuildAngular.srcUtilsNormalizeFileReplacementsMod.NormalizedFileReplacement
import typingsJapgolly.angularDevkitBuildAngular.srcUtilsNormalizeOptimizationMod.NormalizedOptimizationOptions
import typingsJapgolly.angularDevkitCore.mod.logging.Logger
import typingsJapgolly.typescript.mod.ScriptTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcUtilsBuildOptionsMod {
  
  trait BuildOptions extends StObject {
    
    var allowedCommonJsDependencies: js.UndefOr[js.Array[String]] = js.undefined
    
    var aot: js.UndefOr[Boolean] = js.undefined
    
    var assets: js.Array[AssetPatternClass]
    
    var baseHref: js.UndefOr[String] = js.undefined
    
    var budgets: js.Array[Budget]
    
    var buildOptimizer: js.UndefOr[Boolean] = js.undefined
    
    var bundleDependencies: js.UndefOr[Boolean] = js.undefined
    
    var cache: NormalizedCachedOptions
    
    var codeCoverage: js.UndefOr[Boolean] = js.undefined
    
    var codeCoverageExclude: js.UndefOr[js.Array[String]] = js.undefined
    
    var commonChunk: js.UndefOr[Boolean] = js.undefined
    
    var crossOrigin: js.UndefOr[CrossOrigin] = js.undefined
    
    var deleteOutputPath: js.UndefOr[Boolean] = js.undefined
    
    var deployUrl: js.UndefOr[String] = js.undefined
    
    var environment: js.UndefOr[String] = js.undefined
    
    var externalDependencies: js.UndefOr[js.Array[String]] = js.undefined
    
    var extractLicenses: js.UndefOr[Boolean] = js.undefined
    
    var fileReplacements: js.Array[NormalizedFileReplacement]
    
    var hmr: js.UndefOr[Boolean] = js.undefined
    
    var i18nMissingTranslation: js.UndefOr[I18NTranslation] = js.undefined
    
    var index: js.UndefOr[IndexUnion] = js.undefined
    
    var inlineStyleLanguage: js.UndefOr[InlineStyleLanguage] = js.undefined
    
    var localize: js.UndefOr[Localize] = js.undefined
    
    var main: String
    
    var namedChunks: js.UndefOr[Boolean] = js.undefined
    
    var optimization: NormalizedOptimizationOptions
    
    var outputHashing: js.UndefOr[OutputHashing] = js.undefined
    
    var outputPath: String
    
    var platform: js.UndefOr[browser | server] = js.undefined
    
    var poll: js.UndefOr[Double] = js.undefined
    
    var polyfills: js.UndefOr[String] = js.undefined
    
    var preserveSymlinks: js.UndefOr[Boolean] = js.undefined
    
    var progress: js.UndefOr[Boolean] = js.undefined
    
    var resourcesOutputPath: js.UndefOr[String] = js.undefined
    
    var scripts: js.Array[ScriptElement]
    
    var serviceWorker: js.UndefOr[Boolean] = js.undefined
    
    var sourceMap: SourceMapClass
    
    var statsJson: Boolean
    
    var stylePreprocessorOptions: js.UndefOr[IncludePaths] = js.undefined
    
    var styles: js.Array[StyleElement]
    
    var subresourceIntegrity: js.UndefOr[Boolean] = js.undefined
    
    var supportedBrowsers: js.Array[String]
    
    var vendorChunk: js.UndefOr[Boolean] = js.undefined
    
    var verbose: js.UndefOr[Boolean] = js.undefined
    
    var watch: js.UndefOr[Boolean] = js.undefined
    
    var webWorkerTsConfig: js.UndefOr[String] = js.undefined
  }
  object BuildOptions {
    
    inline def apply(
      assets: js.Array[AssetPatternClass],
      budgets: js.Array[Budget],
      cache: NormalizedCachedOptions,
      fileReplacements: js.Array[NormalizedFileReplacement],
      main: String,
      optimization: NormalizedOptimizationOptions,
      outputPath: String,
      scripts: js.Array[ScriptElement],
      sourceMap: SourceMapClass,
      statsJson: Boolean,
      styles: js.Array[StyleElement],
      supportedBrowsers: js.Array[String]
    ): BuildOptions = {
      val __obj = js.Dynamic.literal(assets = assets.asInstanceOf[js.Any], budgets = budgets.asInstanceOf[js.Any], cache = cache.asInstanceOf[js.Any], fileReplacements = fileReplacements.asInstanceOf[js.Any], main = main.asInstanceOf[js.Any], optimization = optimization.asInstanceOf[js.Any], outputPath = outputPath.asInstanceOf[js.Any], scripts = scripts.asInstanceOf[js.Any], sourceMap = sourceMap.asInstanceOf[js.Any], statsJson = statsJson.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any], supportedBrowsers = supportedBrowsers.asInstanceOf[js.Any])
      __obj.asInstanceOf[BuildOptions]
    }
    
    extension [Self <: BuildOptions](x: Self) {
      
      inline def setAllowedCommonJsDependencies(value: js.Array[String]): Self = StObject.set(x, "allowedCommonJsDependencies", value.asInstanceOf[js.Any])
      
      inline def setAllowedCommonJsDependenciesUndefined: Self = StObject.set(x, "allowedCommonJsDependencies", js.undefined)
      
      inline def setAllowedCommonJsDependenciesVarargs(value: String*): Self = StObject.set(x, "allowedCommonJsDependencies", js.Array(value*))
      
      inline def setAot(value: Boolean): Self = StObject.set(x, "aot", value.asInstanceOf[js.Any])
      
      inline def setAotUndefined: Self = StObject.set(x, "aot", js.undefined)
      
      inline def setAssets(value: js.Array[AssetPatternClass]): Self = StObject.set(x, "assets", value.asInstanceOf[js.Any])
      
      inline def setAssetsVarargs(value: AssetPatternClass*): Self = StObject.set(x, "assets", js.Array(value*))
      
      inline def setBaseHref(value: String): Self = StObject.set(x, "baseHref", value.asInstanceOf[js.Any])
      
      inline def setBaseHrefUndefined: Self = StObject.set(x, "baseHref", js.undefined)
      
      inline def setBudgets(value: js.Array[Budget]): Self = StObject.set(x, "budgets", value.asInstanceOf[js.Any])
      
      inline def setBudgetsVarargs(value: Budget*): Self = StObject.set(x, "budgets", js.Array(value*))
      
      inline def setBuildOptimizer(value: Boolean): Self = StObject.set(x, "buildOptimizer", value.asInstanceOf[js.Any])
      
      inline def setBuildOptimizerUndefined: Self = StObject.set(x, "buildOptimizer", js.undefined)
      
      inline def setBundleDependencies(value: Boolean): Self = StObject.set(x, "bundleDependencies", value.asInstanceOf[js.Any])
      
      inline def setBundleDependenciesUndefined: Self = StObject.set(x, "bundleDependencies", js.undefined)
      
      inline def setCache(value: NormalizedCachedOptions): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
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
      
      inline def setFileReplacementsVarargs(value: NormalizedFileReplacement*): Self = StObject.set(x, "fileReplacements", js.Array(value*))
      
      inline def setHmr(value: Boolean): Self = StObject.set(x, "hmr", value.asInstanceOf[js.Any])
      
      inline def setHmrUndefined: Self = StObject.set(x, "hmr", js.undefined)
      
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
      
      inline def setNamedChunks(value: Boolean): Self = StObject.set(x, "namedChunks", value.asInstanceOf[js.Any])
      
      inline def setNamedChunksUndefined: Self = StObject.set(x, "namedChunks", js.undefined)
      
      inline def setOptimization(value: NormalizedOptimizationOptions): Self = StObject.set(x, "optimization", value.asInstanceOf[js.Any])
      
      inline def setOutputHashing(value: OutputHashing): Self = StObject.set(x, "outputHashing", value.asInstanceOf[js.Any])
      
      inline def setOutputHashingUndefined: Self = StObject.set(x, "outputHashing", js.undefined)
      
      inline def setOutputPath(value: String): Self = StObject.set(x, "outputPath", value.asInstanceOf[js.Any])
      
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
      
      inline def setScriptsVarargs(value: ScriptElement*): Self = StObject.set(x, "scripts", js.Array(value*))
      
      inline def setServiceWorker(value: Boolean): Self = StObject.set(x, "serviceWorker", value.asInstanceOf[js.Any])
      
      inline def setServiceWorkerUndefined: Self = StObject.set(x, "serviceWorker", js.undefined)
      
      inline def setSourceMap(value: SourceMapClass): Self = StObject.set(x, "sourceMap", value.asInstanceOf[js.Any])
      
      inline def setStatsJson(value: Boolean): Self = StObject.set(x, "statsJson", value.asInstanceOf[js.Any])
      
      inline def setStylePreprocessorOptions(value: IncludePaths): Self = StObject.set(x, "stylePreprocessorOptions", value.asInstanceOf[js.Any])
      
      inline def setStylePreprocessorOptionsUndefined: Self = StObject.set(x, "stylePreprocessorOptions", js.undefined)
      
      inline def setStyles(value: js.Array[StyleElement]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      inline def setStylesVarargs(value: StyleElement*): Self = StObject.set(x, "styles", js.Array(value*))
      
      inline def setSubresourceIntegrity(value: Boolean): Self = StObject.set(x, "subresourceIntegrity", value.asInstanceOf[js.Any])
      
      inline def setSubresourceIntegrityUndefined: Self = StObject.set(x, "subresourceIntegrity", js.undefined)
      
      inline def setSupportedBrowsers(value: js.Array[String]): Self = StObject.set(x, "supportedBrowsers", value.asInstanceOf[js.Any])
      
      inline def setSupportedBrowsersVarargs(value: String*): Self = StObject.set(x, "supportedBrowsers", js.Array(value*))
      
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
  
  trait WebpackConfigOptions[T] extends StObject {
    
    var buildOptions: T
    
    var logger: Logger
    
    var projectName: String
    
    var projectRoot: String
    
    var root: String
    
    var scriptTarget: ScriptTarget
    
    var sourceRoot: js.UndefOr[String] = js.undefined
    
    var tsConfig: ParsedConfiguration
    
    var tsConfigPath: String
  }
  object WebpackConfigOptions {
    
    inline def apply[T](
      buildOptions: T,
      logger: Logger,
      projectName: String,
      projectRoot: String,
      root: String,
      scriptTarget: ScriptTarget,
      tsConfig: ParsedConfiguration,
      tsConfigPath: String
    ): WebpackConfigOptions[T] = {
      val __obj = js.Dynamic.literal(buildOptions = buildOptions.asInstanceOf[js.Any], logger = logger.asInstanceOf[js.Any], projectName = projectName.asInstanceOf[js.Any], projectRoot = projectRoot.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], scriptTarget = scriptTarget.asInstanceOf[js.Any], tsConfig = tsConfig.asInstanceOf[js.Any], tsConfigPath = tsConfigPath.asInstanceOf[js.Any])
      __obj.asInstanceOf[WebpackConfigOptions[T]]
    }
    
    extension [Self <: WebpackConfigOptions[?], T](x: Self & WebpackConfigOptions[T]) {
      
      inline def setBuildOptions(value: T): Self = StObject.set(x, "buildOptions", value.asInstanceOf[js.Any])
      
      inline def setLogger(value: Logger): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
      
      inline def setProjectName(value: String): Self = StObject.set(x, "projectName", value.asInstanceOf[js.Any])
      
      inline def setProjectRoot(value: String): Self = StObject.set(x, "projectRoot", value.asInstanceOf[js.Any])
      
      inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setScriptTarget(value: ScriptTarget): Self = StObject.set(x, "scriptTarget", value.asInstanceOf[js.Any])
      
      inline def setSourceRoot(value: String): Self = StObject.set(x, "sourceRoot", value.asInstanceOf[js.Any])
      
      inline def setSourceRootUndefined: Self = StObject.set(x, "sourceRoot", js.undefined)
      
      inline def setTsConfig(value: ParsedConfiguration): Self = StObject.set(x, "tsConfig", value.asInstanceOf[js.Any])
      
      inline def setTsConfigPath(value: String): Self = StObject.set(x, "tsConfigPath", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined parent @angular-devkit/build-angular.@angular-devkit/build-angular/src/utils/build-options.BuildOptions */
  /* Inlined parent std.Omit<@angular-devkit/build-angular.@angular-devkit/build-angular/src/builders/dev-server/schema.Schema, 'optimization' | 'sourceMap' | 'browserTarget'> */
  trait WebpackDevServerOptions extends StObject {
    
    var allowedCommonJsDependencies: js.UndefOr[js.Array[String]] = js.undefined
    
    var allowedHosts: js.UndefOr[js.Array[String]] = js.undefined
    
    var aot: js.UndefOr[Boolean] = js.undefined
    
    var assets: js.Array[AssetPatternClass]
    
    var baseHref: js.UndefOr[String] = js.undefined
    
    var budgets: js.Array[Budget]
    
    var buildOptimizer: js.UndefOr[Boolean] = js.undefined
    
    var bundleDependencies: js.UndefOr[Boolean] = js.undefined
    
    var cache: NormalizedCachedOptions
    
    var codeCoverage: js.UndefOr[Boolean] = js.undefined
    
    var codeCoverageExclude: js.UndefOr[js.Array[String]] = js.undefined
    
    var commonChunk: js.UndefOr[Boolean] = js.undefined
    
    var crossOrigin: js.UndefOr[CrossOrigin] = js.undefined
    
    var deleteOutputPath: js.UndefOr[Boolean] = js.undefined
    
    var deployUrl: js.UndefOr[String] = js.undefined
    
    var disableHostCheck: js.UndefOr[Boolean] = js.undefined
    
    var environment: js.UndefOr[String] = js.undefined
    
    var externalDependencies: js.UndefOr[js.Array[String]] = js.undefined
    
    var extractLicenses: js.UndefOr[Boolean] = js.undefined
    
    var fileReplacements: js.Array[NormalizedFileReplacement]
    
    var headers: js.UndefOr[StringDictionary[String]] = js.undefined
    
    var hmr: js.UndefOr[Boolean] = js.undefined
    
    var host: js.UndefOr[String] = js.undefined
    
    var i18nMissingTranslation: js.UndefOr[I18NTranslation] = js.undefined
    
    var index: js.UndefOr[IndexUnion] = js.undefined
    
    var inlineStyleLanguage: js.UndefOr[InlineStyleLanguage] = js.undefined
    
    var liveReload: js.UndefOr[Boolean] = js.undefined
    
    var localize: js.UndefOr[Localize] = js.undefined
    
    var main: String
    
    var namedChunks: js.UndefOr[Boolean] = js.undefined
    
    var open: js.UndefOr[Boolean] = js.undefined
    
    var optimization: NormalizedOptimizationOptions
    
    var outputHashing: js.UndefOr[OutputHashing] = js.undefined
    
    var outputPath: String
    
    var platform: js.UndefOr[browser | server] = js.undefined
    
    var poll: js.UndefOr[Double] = js.undefined
    
    var polyfills: js.UndefOr[String] = js.undefined
    
    var port: js.UndefOr[Double] = js.undefined
    
    var preserveSymlinks: js.UndefOr[Boolean] = js.undefined
    
    var progress: js.UndefOr[Boolean] = js.undefined
    
    var proxyConfig: js.UndefOr[String] = js.undefined
    
    var publicHost: js.UndefOr[String] = js.undefined
    
    var resourcesOutputPath: js.UndefOr[String] = js.undefined
    
    var scripts: js.Array[ScriptElement]
    
    var servePath: js.UndefOr[String] = js.undefined
    
    var serviceWorker: js.UndefOr[Boolean] = js.undefined
    
    var sourceMap: SourceMapClass
    
    var ssl: js.UndefOr[Boolean] = js.undefined
    
    var sslCert: js.UndefOr[String] = js.undefined
    
    var sslKey: js.UndefOr[String] = js.undefined
    
    var statsJson: Boolean
    
    var stylePreprocessorOptions: js.UndefOr[IncludePaths] = js.undefined
    
    var styles: js.Array[StyleElement]
    
    var subresourceIntegrity: js.UndefOr[Boolean] = js.undefined
    
    var supportedBrowsers: js.Array[String]
    
    var vendorChunk: js.UndefOr[Boolean] = js.undefined
    
    var verbose: js.UndefOr[Boolean] = js.undefined
    
    var watch: js.UndefOr[Boolean] = js.undefined
    
    var webWorkerTsConfig: js.UndefOr[String] = js.undefined
  }
  object WebpackDevServerOptions {
    
    inline def apply(
      assets: js.Array[AssetPatternClass],
      budgets: js.Array[Budget],
      cache: NormalizedCachedOptions,
      fileReplacements: js.Array[NormalizedFileReplacement],
      main: String,
      optimization: NormalizedOptimizationOptions,
      outputPath: String,
      scripts: js.Array[ScriptElement],
      sourceMap: SourceMapClass,
      statsJson: Boolean,
      styles: js.Array[StyleElement],
      supportedBrowsers: js.Array[String]
    ): WebpackDevServerOptions = {
      val __obj = js.Dynamic.literal(assets = assets.asInstanceOf[js.Any], budgets = budgets.asInstanceOf[js.Any], cache = cache.asInstanceOf[js.Any], fileReplacements = fileReplacements.asInstanceOf[js.Any], main = main.asInstanceOf[js.Any], optimization = optimization.asInstanceOf[js.Any], outputPath = outputPath.asInstanceOf[js.Any], scripts = scripts.asInstanceOf[js.Any], sourceMap = sourceMap.asInstanceOf[js.Any], statsJson = statsJson.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any], supportedBrowsers = supportedBrowsers.asInstanceOf[js.Any])
      __obj.asInstanceOf[WebpackDevServerOptions]
    }
    
    extension [Self <: WebpackDevServerOptions](x: Self) {
      
      inline def setAllowedCommonJsDependencies(value: js.Array[String]): Self = StObject.set(x, "allowedCommonJsDependencies", value.asInstanceOf[js.Any])
      
      inline def setAllowedCommonJsDependenciesUndefined: Self = StObject.set(x, "allowedCommonJsDependencies", js.undefined)
      
      inline def setAllowedCommonJsDependenciesVarargs(value: String*): Self = StObject.set(x, "allowedCommonJsDependencies", js.Array(value*))
      
      inline def setAllowedHosts(value: js.Array[String]): Self = StObject.set(x, "allowedHosts", value.asInstanceOf[js.Any])
      
      inline def setAllowedHostsUndefined: Self = StObject.set(x, "allowedHosts", js.undefined)
      
      inline def setAllowedHostsVarargs(value: String*): Self = StObject.set(x, "allowedHosts", js.Array(value*))
      
      inline def setAot(value: Boolean): Self = StObject.set(x, "aot", value.asInstanceOf[js.Any])
      
      inline def setAotUndefined: Self = StObject.set(x, "aot", js.undefined)
      
      inline def setAssets(value: js.Array[AssetPatternClass]): Self = StObject.set(x, "assets", value.asInstanceOf[js.Any])
      
      inline def setAssetsVarargs(value: AssetPatternClass*): Self = StObject.set(x, "assets", js.Array(value*))
      
      inline def setBaseHref(value: String): Self = StObject.set(x, "baseHref", value.asInstanceOf[js.Any])
      
      inline def setBaseHrefUndefined: Self = StObject.set(x, "baseHref", js.undefined)
      
      inline def setBudgets(value: js.Array[Budget]): Self = StObject.set(x, "budgets", value.asInstanceOf[js.Any])
      
      inline def setBudgetsVarargs(value: Budget*): Self = StObject.set(x, "budgets", js.Array(value*))
      
      inline def setBuildOptimizer(value: Boolean): Self = StObject.set(x, "buildOptimizer", value.asInstanceOf[js.Any])
      
      inline def setBuildOptimizerUndefined: Self = StObject.set(x, "buildOptimizer", js.undefined)
      
      inline def setBundleDependencies(value: Boolean): Self = StObject.set(x, "bundleDependencies", value.asInstanceOf[js.Any])
      
      inline def setBundleDependenciesUndefined: Self = StObject.set(x, "bundleDependencies", js.undefined)
      
      inline def setCache(value: NormalizedCachedOptions): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
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
      
      inline def setDisableHostCheck(value: Boolean): Self = StObject.set(x, "disableHostCheck", value.asInstanceOf[js.Any])
      
      inline def setDisableHostCheckUndefined: Self = StObject.set(x, "disableHostCheck", js.undefined)
      
      inline def setEnvironment(value: String): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
      
      inline def setEnvironmentUndefined: Self = StObject.set(x, "environment", js.undefined)
      
      inline def setExternalDependencies(value: js.Array[String]): Self = StObject.set(x, "externalDependencies", value.asInstanceOf[js.Any])
      
      inline def setExternalDependenciesUndefined: Self = StObject.set(x, "externalDependencies", js.undefined)
      
      inline def setExternalDependenciesVarargs(value: String*): Self = StObject.set(x, "externalDependencies", js.Array(value*))
      
      inline def setExtractLicenses(value: Boolean): Self = StObject.set(x, "extractLicenses", value.asInstanceOf[js.Any])
      
      inline def setExtractLicensesUndefined: Self = StObject.set(x, "extractLicenses", js.undefined)
      
      inline def setFileReplacements(value: js.Array[NormalizedFileReplacement]): Self = StObject.set(x, "fileReplacements", value.asInstanceOf[js.Any])
      
      inline def setFileReplacementsVarargs(value: NormalizedFileReplacement*): Self = StObject.set(x, "fileReplacements", js.Array(value*))
      
      inline def setHeaders(value: StringDictionary[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setHmr(value: Boolean): Self = StObject.set(x, "hmr", value.asInstanceOf[js.Any])
      
      inline def setHmrUndefined: Self = StObject.set(x, "hmr", js.undefined)
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      inline def setI18nMissingTranslation(value: I18NTranslation): Self = StObject.set(x, "i18nMissingTranslation", value.asInstanceOf[js.Any])
      
      inline def setI18nMissingTranslationUndefined: Self = StObject.set(x, "i18nMissingTranslation", js.undefined)
      
      inline def setIndex(value: IndexUnion): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      inline def setInlineStyleLanguage(value: InlineStyleLanguage): Self = StObject.set(x, "inlineStyleLanguage", value.asInstanceOf[js.Any])
      
      inline def setInlineStyleLanguageUndefined: Self = StObject.set(x, "inlineStyleLanguage", js.undefined)
      
      inline def setLiveReload(value: Boolean): Self = StObject.set(x, "liveReload", value.asInstanceOf[js.Any])
      
      inline def setLiveReloadUndefined: Self = StObject.set(x, "liveReload", js.undefined)
      
      inline def setLocalize(value: Localize): Self = StObject.set(x, "localize", value.asInstanceOf[js.Any])
      
      inline def setLocalizeUndefined: Self = StObject.set(x, "localize", js.undefined)
      
      inline def setLocalizeVarargs(value: String*): Self = StObject.set(x, "localize", js.Array(value*))
      
      inline def setMain(value: String): Self = StObject.set(x, "main", value.asInstanceOf[js.Any])
      
      inline def setNamedChunks(value: Boolean): Self = StObject.set(x, "namedChunks", value.asInstanceOf[js.Any])
      
      inline def setNamedChunksUndefined: Self = StObject.set(x, "namedChunks", js.undefined)
      
      inline def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      inline def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
      
      inline def setOptimization(value: NormalizedOptimizationOptions): Self = StObject.set(x, "optimization", value.asInstanceOf[js.Any])
      
      inline def setOutputHashing(value: OutputHashing): Self = StObject.set(x, "outputHashing", value.asInstanceOf[js.Any])
      
      inline def setOutputHashingUndefined: Self = StObject.set(x, "outputHashing", js.undefined)
      
      inline def setOutputPath(value: String): Self = StObject.set(x, "outputPath", value.asInstanceOf[js.Any])
      
      inline def setPlatform(value: browser | server): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
      
      inline def setPlatformUndefined: Self = StObject.set(x, "platform", js.undefined)
      
      inline def setPoll(value: Double): Self = StObject.set(x, "poll", value.asInstanceOf[js.Any])
      
      inline def setPollUndefined: Self = StObject.set(x, "poll", js.undefined)
      
      inline def setPolyfills(value: String): Self = StObject.set(x, "polyfills", value.asInstanceOf[js.Any])
      
      inline def setPolyfillsUndefined: Self = StObject.set(x, "polyfills", js.undefined)
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      inline def setPreserveSymlinks(value: Boolean): Self = StObject.set(x, "preserveSymlinks", value.asInstanceOf[js.Any])
      
      inline def setPreserveSymlinksUndefined: Self = StObject.set(x, "preserveSymlinks", js.undefined)
      
      inline def setProgress(value: Boolean): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
      
      inline def setProgressUndefined: Self = StObject.set(x, "progress", js.undefined)
      
      inline def setProxyConfig(value: String): Self = StObject.set(x, "proxyConfig", value.asInstanceOf[js.Any])
      
      inline def setProxyConfigUndefined: Self = StObject.set(x, "proxyConfig", js.undefined)
      
      inline def setPublicHost(value: String): Self = StObject.set(x, "publicHost", value.asInstanceOf[js.Any])
      
      inline def setPublicHostUndefined: Self = StObject.set(x, "publicHost", js.undefined)
      
      inline def setResourcesOutputPath(value: String): Self = StObject.set(x, "resourcesOutputPath", value.asInstanceOf[js.Any])
      
      inline def setResourcesOutputPathUndefined: Self = StObject.set(x, "resourcesOutputPath", js.undefined)
      
      inline def setScripts(value: js.Array[ScriptElement]): Self = StObject.set(x, "scripts", value.asInstanceOf[js.Any])
      
      inline def setScriptsVarargs(value: ScriptElement*): Self = StObject.set(x, "scripts", js.Array(value*))
      
      inline def setServePath(value: String): Self = StObject.set(x, "servePath", value.asInstanceOf[js.Any])
      
      inline def setServePathUndefined: Self = StObject.set(x, "servePath", js.undefined)
      
      inline def setServiceWorker(value: Boolean): Self = StObject.set(x, "serviceWorker", value.asInstanceOf[js.Any])
      
      inline def setServiceWorkerUndefined: Self = StObject.set(x, "serviceWorker", js.undefined)
      
      inline def setSourceMap(value: SourceMapClass): Self = StObject.set(x, "sourceMap", value.asInstanceOf[js.Any])
      
      inline def setSsl(value: Boolean): Self = StObject.set(x, "ssl", value.asInstanceOf[js.Any])
      
      inline def setSslCert(value: String): Self = StObject.set(x, "sslCert", value.asInstanceOf[js.Any])
      
      inline def setSslCertUndefined: Self = StObject.set(x, "sslCert", js.undefined)
      
      inline def setSslKey(value: String): Self = StObject.set(x, "sslKey", value.asInstanceOf[js.Any])
      
      inline def setSslKeyUndefined: Self = StObject.set(x, "sslKey", js.undefined)
      
      inline def setSslUndefined: Self = StObject.set(x, "ssl", js.undefined)
      
      inline def setStatsJson(value: Boolean): Self = StObject.set(x, "statsJson", value.asInstanceOf[js.Any])
      
      inline def setStylePreprocessorOptions(value: IncludePaths): Self = StObject.set(x, "stylePreprocessorOptions", value.asInstanceOf[js.Any])
      
      inline def setStylePreprocessorOptionsUndefined: Self = StObject.set(x, "stylePreprocessorOptions", js.undefined)
      
      inline def setStyles(value: js.Array[StyleElement]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      inline def setStylesVarargs(value: StyleElement*): Self = StObject.set(x, "styles", js.Array(value*))
      
      inline def setSubresourceIntegrity(value: Boolean): Self = StObject.set(x, "subresourceIntegrity", value.asInstanceOf[js.Any])
      
      inline def setSubresourceIntegrityUndefined: Self = StObject.set(x, "subresourceIntegrity", js.undefined)
      
      inline def setSupportedBrowsers(value: js.Array[String]): Self = StObject.set(x, "supportedBrowsers", value.asInstanceOf[js.Any])
      
      inline def setSupportedBrowsersVarargs(value: String*): Self = StObject.set(x, "supportedBrowsers", js.Array(value*))
      
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
}
