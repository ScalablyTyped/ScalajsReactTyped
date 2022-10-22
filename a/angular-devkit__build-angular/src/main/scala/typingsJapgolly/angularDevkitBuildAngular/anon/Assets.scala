package typingsJapgolly.angularDevkitBuildAngular.anon

import typingsJapgolly.angularDevkitBuildAngular.srcBuildersBrowserSchemaMod.AssetPatternClass
import typingsJapgolly.angularDevkitBuildAngular.srcBuildersBrowserSchemaMod.SourceMapClass
import typingsJapgolly.angularDevkitBuildAngular.srcUtilsNormalizeOptimizationMod.NormalizedOptimizationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Assets extends StObject {
  
  var assets: js.UndefOr[js.Array[AssetPatternClass]] = js.undefined
  
  var mainEntryPoint: String
  
  var optimizationOptions: NormalizedOptimizationOptions
  
  var outputNames: Bundles
  
  var outputPath: String
  
  var polyfillsEntryPoint: js.UndefOr[String] = js.undefined
  
  var projectRoot: String
  
  var sourcemapOptions: SourceMapClass
  
  var tsconfig: String
  
  var workspaceRoot: String
}
object Assets {
  
  inline def apply(
    mainEntryPoint: String,
    optimizationOptions: NormalizedOptimizationOptions,
    outputNames: Bundles,
    outputPath: String,
    projectRoot: String,
    sourcemapOptions: SourceMapClass,
    tsconfig: String,
    workspaceRoot: String
  ): Assets = {
    val __obj = js.Dynamic.literal(mainEntryPoint = mainEntryPoint.asInstanceOf[js.Any], optimizationOptions = optimizationOptions.asInstanceOf[js.Any], outputNames = outputNames.asInstanceOf[js.Any], outputPath = outputPath.asInstanceOf[js.Any], projectRoot = projectRoot.asInstanceOf[js.Any], sourcemapOptions = sourcemapOptions.asInstanceOf[js.Any], tsconfig = tsconfig.asInstanceOf[js.Any], workspaceRoot = workspaceRoot.asInstanceOf[js.Any])
    __obj.asInstanceOf[Assets]
  }
  
  extension [Self <: Assets](x: Self) {
    
    inline def setAssets(value: js.Array[AssetPatternClass]): Self = StObject.set(x, "assets", value.asInstanceOf[js.Any])
    
    inline def setAssetsUndefined: Self = StObject.set(x, "assets", js.undefined)
    
    inline def setAssetsVarargs(value: AssetPatternClass*): Self = StObject.set(x, "assets", js.Array(value*))
    
    inline def setMainEntryPoint(value: String): Self = StObject.set(x, "mainEntryPoint", value.asInstanceOf[js.Any])
    
    inline def setOptimizationOptions(value: NormalizedOptimizationOptions): Self = StObject.set(x, "optimizationOptions", value.asInstanceOf[js.Any])
    
    inline def setOutputNames(value: Bundles): Self = StObject.set(x, "outputNames", value.asInstanceOf[js.Any])
    
    inline def setOutputPath(value: String): Self = StObject.set(x, "outputPath", value.asInstanceOf[js.Any])
    
    inline def setPolyfillsEntryPoint(value: String): Self = StObject.set(x, "polyfillsEntryPoint", value.asInstanceOf[js.Any])
    
    inline def setPolyfillsEntryPointUndefined: Self = StObject.set(x, "polyfillsEntryPoint", js.undefined)
    
    inline def setProjectRoot(value: String): Self = StObject.set(x, "projectRoot", value.asInstanceOf[js.Any])
    
    inline def setSourcemapOptions(value: SourceMapClass): Self = StObject.set(x, "sourcemapOptions", value.asInstanceOf[js.Any])
    
    inline def setTsconfig(value: String): Self = StObject.set(x, "tsconfig", value.asInstanceOf[js.Any])
    
    inline def setWorkspaceRoot(value: String): Self = StObject.set(x, "workspaceRoot", value.asInstanceOf[js.Any])
  }
}
