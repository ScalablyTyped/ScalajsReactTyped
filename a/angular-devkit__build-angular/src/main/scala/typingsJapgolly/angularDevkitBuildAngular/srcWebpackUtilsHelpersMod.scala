package typingsJapgolly.angularDevkitBuildAngular

import typingsJapgolly.angularDevkitBuildAngular.angularDevkitBuildAngularStrings.`errors-only`
import typingsJapgolly.angularDevkitBuildAngular.angularDevkitBuildAngularStrings.`errors-warnings`
import typingsJapgolly.angularDevkitBuildAngular.angularDevkitBuildAngularStrings.detailed
import typingsJapgolly.angularDevkitBuildAngular.angularDevkitBuildAngularStrings.minimal
import typingsJapgolly.angularDevkitBuildAngular.angularDevkitBuildAngularStrings.none
import typingsJapgolly.angularDevkitBuildAngular.angularDevkitBuildAngularStrings.normal
import typingsJapgolly.angularDevkitBuildAngular.angularDevkitBuildAngularStrings.summary
import typingsJapgolly.angularDevkitBuildAngular.angularDevkitBuildAngularStrings.verbose
import typingsJapgolly.angularDevkitBuildAngular.anon.BundleName
import typingsJapgolly.angularDevkitBuildAngular.anon.PickWebpackOptionsNormali
import typingsJapgolly.angularDevkitBuildAngular.srcBuildersBrowserSchemaMod.AssetPatternClass
import typingsJapgolly.angularDevkitBuildAngular.srcBuildersBrowserSchemaMod.OutputHashing
import typingsJapgolly.angularDevkitBuildAngular.srcBuildersBrowserSchemaMod.ScriptElement
import typingsJapgolly.angularDevkitBuildAngular.srcBuildersBrowserSchemaMod.StyleElement
import typingsJapgolly.angularDevkitBuildAngular.srcUtilsBuildOptionsMod.BuildOptions
import typingsJapgolly.angularDevkitBuildAngular.srcUtilsBuildOptionsMod.WebpackConfigOptions
import typingsJapgolly.copyWebpackPlugin.mod.ObjectPattern
import typingsJapgolly.std.Exclude
import typingsJapgolly.std.Required
import typingsJapgolly.std.Set
import typingsJapgolly.typescript.mod.ScriptTarget
import typingsJapgolly.webpack.mod.CacheOptionsNormalized
import typingsJapgolly.webpack.mod.StatsOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcWebpackUtilsHelpersMod {
  
  @JSImport("@angular-devkit/build-angular/src/webpack/utils/helpers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def assetNameTemplateFactory(hashFormat: HashFormat): js.Function1[/* resourcePath */ String, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("assetNameTemplateFactory")(hashFormat.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* resourcePath */ String, String]]
  
  inline def assetPatterns(root: String, assets: js.Array[AssetPatternClass]): js.Array[ObjectPattern] = (^.asInstanceOf[js.Dynamic].applyDynamic("assetPatterns")(root.asInstanceOf[js.Any], assets.asInstanceOf[js.Any])).asInstanceOf[js.Array[ObjectPattern]]
  
  inline def externalizePackages(
    context: String,
    request: String,
    callback: js.Function2[/* error */ js.UndefOr[js.Error], /* result */ js.UndefOr[String], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("externalizePackages")(context.asInstanceOf[js.Any], request.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def externalizePackages(
    context: String,
    request: Unit,
    callback: js.Function2[/* error */ js.UndefOr[js.Error], /* result */ js.UndefOr[String], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("externalizePackages")(context.asInstanceOf[js.Any], request.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def getCacheSettings(wco: WebpackConfigOptions[BuildOptions], angularVersion: String): CacheOptionsNormalized = (^.asInstanceOf[js.Dynamic].applyDynamic("getCacheSettings")(wco.asInstanceOf[js.Any], angularVersion.asInstanceOf[js.Any])).asInstanceOf[CacheOptionsNormalized]
  
  inline def getInstrumentationExcludedPaths(root: String, excludedPaths: js.Array[String]): Set[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getInstrumentationExcludedPaths")(root.asInstanceOf[js.Any], excludedPaths.asInstanceOf[js.Any])).asInstanceOf[Set[String]]
  
  inline def getMainFieldsAndConditionNames(target: ScriptTarget, platformServer: Boolean): PickWebpackOptionsNormali = (^.asInstanceOf[js.Dynamic].applyDynamic("getMainFieldsAndConditionNames")(target.asInstanceOf[js.Any], platformServer.asInstanceOf[js.Any])).asInstanceOf[PickWebpackOptionsNormali]
  
  inline def getOutputHashFormat(): HashFormat = ^.asInstanceOf[js.Dynamic].applyDynamic("getOutputHashFormat")().asInstanceOf[HashFormat]
  inline def getOutputHashFormat(outputHashing: Unit, length: Double): HashFormat = (^.asInstanceOf[js.Dynamic].applyDynamic("getOutputHashFormat")(outputHashing.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[HashFormat]
  inline def getOutputHashFormat(outputHashing: OutputHashing): HashFormat = ^.asInstanceOf[js.Dynamic].applyDynamic("getOutputHashFormat")(outputHashing.asInstanceOf[js.Any]).asInstanceOf[HashFormat]
  inline def getOutputHashFormat(outputHashing: OutputHashing, length: Double): HashFormat = (^.asInstanceOf[js.Dynamic].applyDynamic("getOutputHashFormat")(outputHashing.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[HashFormat]
  
  inline def getStatsOptions(): WebpackStatsOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("getStatsOptions")().asInstanceOf[WebpackStatsOptions]
  inline def getStatsOptions(verbose: Boolean): WebpackStatsOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("getStatsOptions")(verbose.asInstanceOf[js.Any]).asInstanceOf[WebpackStatsOptions]
  
  inline def globalScriptsByBundleName(root: String, scripts: js.Array[ScriptElement]): js.Array[BundleName] = (^.asInstanceOf[js.Dynamic].applyDynamic("globalScriptsByBundleName")(root.asInstanceOf[js.Any], scripts.asInstanceOf[js.Any])).asInstanceOf[js.Array[BundleName]]
  
  inline def normalizeExtraEntryPoints(extraEntryPoints: js.Array[ScriptElement | StyleElement], defaultBundleName: String): js.Array[NormalizedEntryPoint] = (^.asInstanceOf[js.Dynamic].applyDynamic("normalizeExtraEntryPoints")(extraEntryPoints.asInstanceOf[js.Any], defaultBundleName.asInstanceOf[js.Any])).asInstanceOf[js.Array[NormalizedEntryPoint]]
  
  trait HashFormat extends StObject {
    
    var chunk: String
    
    var extract: String
    
    var file: String
    
    var script: String
  }
  object HashFormat {
    
    inline def apply(chunk: String, extract: String, file: String, script: String): HashFormat = {
      val __obj = js.Dynamic.literal(chunk = chunk.asInstanceOf[js.Any], extract = extract.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any], script = script.asInstanceOf[js.Any])
      __obj.asInstanceOf[HashFormat]
    }
    
    extension [Self <: HashFormat](x: Self) {
      
      inline def setChunk(value: String): Self = StObject.set(x, "chunk", value.asInstanceOf[js.Any])
      
      inline def setExtract(value: String): Self = StObject.set(x, "extract", value.asInstanceOf[js.Any])
      
      inline def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      inline def setScript(value: String): Self = StObject.set(x, "script", value.asInstanceOf[js.Any])
    }
  }
  
  type NormalizedEntryPoint = Required[Exclude[ScriptElement | StyleElement, String]]
  
  type WebpackStatsOptions = Exclude[
    js.UndefOr[
      Boolean | StatsOptions | none | verbose | summary | `errors-only` | `errors-warnings` | minimal | normal | detailed
    ], 
    js.UndefOr[String | Boolean]
  ]
}
