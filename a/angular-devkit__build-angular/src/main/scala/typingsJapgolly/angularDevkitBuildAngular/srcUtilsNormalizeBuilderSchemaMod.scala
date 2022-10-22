package typingsJapgolly.angularDevkitBuildAngular

import typingsJapgolly.angularDevkitBuildAngular.angularDevkitBuildAngularStrings.browser
import typingsJapgolly.angularDevkitBuildAngular.angularDevkitBuildAngularStrings.server
import typingsJapgolly.angularDevkitBuildAngular.srcBuildersBrowserSchemaMod.AssetPatternClass
import typingsJapgolly.angularDevkitBuildAngular.srcBuildersBrowserSchemaMod.IndexUnion
import typingsJapgolly.angularDevkitBuildAngular.srcBuildersBrowserSchemaMod.Schema
import typingsJapgolly.angularDevkitBuildAngular.srcBuildersBrowserSchemaMod.SourceMapClass
import typingsJapgolly.angularDevkitBuildAngular.srcUtilsNormalizeCacheMod.NormalizedCachedOptions
import typingsJapgolly.angularDevkitBuildAngular.srcUtilsNormalizeFileReplacementsMod.NormalizedFileReplacement
import typingsJapgolly.angularDevkitBuildAngular.srcUtilsNormalizeOptimizationMod.NormalizedOptimizationOptions
import typingsJapgolly.angularDevkitCore.srcJsonUtilsMod.JsonObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcUtilsNormalizeBuilderSchemaMod {
  
  @JSImport("@angular-devkit/build-angular/src/utils/normalize-builder-schema", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def normalizeBrowserSchema(
    workspaceRoot: String,
    projectRoot: String,
    projectSourceRoot: String,
    options: Schema,
    metadata: JsonObject
  ): NormalizedBrowserBuilderSchema = (^.asInstanceOf[js.Dynamic].applyDynamic("normalizeBrowserSchema")(workspaceRoot.asInstanceOf[js.Any], projectRoot.asInstanceOf[js.Any], projectSourceRoot.asInstanceOf[js.Any], options.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[NormalizedBrowserBuilderSchema]
  inline def normalizeBrowserSchema(
    workspaceRoot: String,
    projectRoot: String,
    projectSourceRoot: Unit,
    options: Schema,
    metadata: JsonObject
  ): NormalizedBrowserBuilderSchema = (^.asInstanceOf[js.Dynamic].applyDynamic("normalizeBrowserSchema")(workspaceRoot.asInstanceOf[js.Any], projectRoot.asInstanceOf[js.Any], projectSourceRoot.asInstanceOf[js.Any], options.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[NormalizedBrowserBuilderSchema]
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsJapgolly.angularDevkitBuildAngular.srcUtilsBuildOptionsMod.BuildOptions because var conflicts: allowedCommonJsDependencies, aot, assets, baseHref, budgets, buildOptimizer, commonChunk, crossOrigin, deleteOutputPath, deployUrl, extractLicenses, fileReplacements, i18nMissingTranslation, index, inlineStyleLanguage, localize, main, namedChunks, optimization, outputHashing, outputPath, poll, polyfills, preserveSymlinks, progress, resourcesOutputPath, scripts, serviceWorker, sourceMap, statsJson, stylePreprocessorOptions, styles, subresourceIntegrity, vendorChunk, verbose, watch, webWorkerTsConfig. Inlined environment, bundleDependencies, externalDependencies, hmr, platform, cache, codeCoverage, codeCoverageExclude, supportedBrowsers */ trait NormalizedBrowserBuilderSchema
    extends StObject
       with Schema {
    
    @JSName("assets")
    var assets_NormalizedBrowserBuilderSchema: js.Array[AssetPatternClass]
    
    var bundleDependencies: js.UndefOr[Boolean] = js.undefined
    
    var cache: NormalizedCachedOptions
    
    var codeCoverage: js.UndefOr[Boolean] = js.undefined
    
    var codeCoverageExclude: js.UndefOr[js.Array[String]] = js.undefined
    
    var environment: js.UndefOr[String] = js.undefined
    
    var externalDependencies: js.UndefOr[js.Array[String]] = js.undefined
    
    @JSName("fileReplacements")
    var fileReplacements_NormalizedBrowserBuilderSchema: js.Array[NormalizedFileReplacement]
    
    var hmr: js.UndefOr[Boolean] = js.undefined
    
    @JSName("optimization")
    var optimization_NormalizedBrowserBuilderSchema: NormalizedOptimizationOptions
    
    var platform: js.UndefOr[browser | server] = js.undefined
    
    @JSName("sourceMap")
    var sourceMap_NormalizedBrowserBuilderSchema: SourceMapClass
    
    var supportedBrowsers: js.Array[String]
  }
  object NormalizedBrowserBuilderSchema {
    
    inline def apply(
      assets: js.Array[AssetPatternClass],
      cache: NormalizedCachedOptions,
      fileReplacements: js.Array[NormalizedFileReplacement],
      index: IndexUnion,
      main: String,
      optimization: NormalizedOptimizationOptions,
      outputPath: String,
      sourceMap: SourceMapClass,
      supportedBrowsers: js.Array[String],
      tsConfig: String
    ): NormalizedBrowserBuilderSchema = {
      val __obj = js.Dynamic.literal(assets = assets.asInstanceOf[js.Any], cache = cache.asInstanceOf[js.Any], fileReplacements = fileReplacements.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], main = main.asInstanceOf[js.Any], optimization = optimization.asInstanceOf[js.Any], outputPath = outputPath.asInstanceOf[js.Any], sourceMap = sourceMap.asInstanceOf[js.Any], supportedBrowsers = supportedBrowsers.asInstanceOf[js.Any], tsConfig = tsConfig.asInstanceOf[js.Any])
      __obj.asInstanceOf[NormalizedBrowserBuilderSchema]
    }
    
    extension [Self <: NormalizedBrowserBuilderSchema](x: Self) {
      
      inline def setAssets(value: js.Array[AssetPatternClass]): Self = StObject.set(x, "assets", value.asInstanceOf[js.Any])
      
      inline def setAssetsVarargs(value: AssetPatternClass*): Self = StObject.set(x, "assets", js.Array(value*))
      
      inline def setBundleDependencies(value: Boolean): Self = StObject.set(x, "bundleDependencies", value.asInstanceOf[js.Any])
      
      inline def setBundleDependenciesUndefined: Self = StObject.set(x, "bundleDependencies", js.undefined)
      
      inline def setCache(value: NormalizedCachedOptions): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      inline def setCodeCoverage(value: Boolean): Self = StObject.set(x, "codeCoverage", value.asInstanceOf[js.Any])
      
      inline def setCodeCoverageExclude(value: js.Array[String]): Self = StObject.set(x, "codeCoverageExclude", value.asInstanceOf[js.Any])
      
      inline def setCodeCoverageExcludeUndefined: Self = StObject.set(x, "codeCoverageExclude", js.undefined)
      
      inline def setCodeCoverageExcludeVarargs(value: String*): Self = StObject.set(x, "codeCoverageExclude", js.Array(value*))
      
      inline def setCodeCoverageUndefined: Self = StObject.set(x, "codeCoverage", js.undefined)
      
      inline def setEnvironment(value: String): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
      
      inline def setEnvironmentUndefined: Self = StObject.set(x, "environment", js.undefined)
      
      inline def setExternalDependencies(value: js.Array[String]): Self = StObject.set(x, "externalDependencies", value.asInstanceOf[js.Any])
      
      inline def setExternalDependenciesUndefined: Self = StObject.set(x, "externalDependencies", js.undefined)
      
      inline def setExternalDependenciesVarargs(value: String*): Self = StObject.set(x, "externalDependencies", js.Array(value*))
      
      inline def setFileReplacements(value: js.Array[NormalizedFileReplacement]): Self = StObject.set(x, "fileReplacements", value.asInstanceOf[js.Any])
      
      inline def setFileReplacementsVarargs(value: NormalizedFileReplacement*): Self = StObject.set(x, "fileReplacements", js.Array(value*))
      
      inline def setHmr(value: Boolean): Self = StObject.set(x, "hmr", value.asInstanceOf[js.Any])
      
      inline def setHmrUndefined: Self = StObject.set(x, "hmr", js.undefined)
      
      inline def setOptimization(value: NormalizedOptimizationOptions): Self = StObject.set(x, "optimization", value.asInstanceOf[js.Any])
      
      inline def setPlatform(value: browser | server): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
      
      inline def setPlatformUndefined: Self = StObject.set(x, "platform", js.undefined)
      
      inline def setSourceMap(value: SourceMapClass): Self = StObject.set(x, "sourceMap", value.asInstanceOf[js.Any])
      
      inline def setSupportedBrowsers(value: js.Array[String]): Self = StObject.set(x, "supportedBrowsers", value.asInstanceOf[js.Any])
      
      inline def setSupportedBrowsersVarargs(value: String*): Self = StObject.set(x, "supportedBrowsers", js.Array(value*))
    }
  }
}
