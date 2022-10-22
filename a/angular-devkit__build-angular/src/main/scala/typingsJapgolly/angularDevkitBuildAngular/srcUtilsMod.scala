package typingsJapgolly.angularDevkitBuildAngular

import typingsJapgolly.angularDevkitArchitect.srcApiMod.BuilderOutput
import typingsJapgolly.angularDevkitBuildAngular.srcBuildersBrowserSchemaMod.AssetPattern
import typingsJapgolly.angularDevkitBuildAngular.srcBuildersBrowserSchemaMod.AssetPatternClass
import typingsJapgolly.angularDevkitBuildAngular.srcBuildersBrowserSchemaMod.FileReplacement
import typingsJapgolly.angularDevkitBuildAngular.srcBuildersBrowserSchemaMod.OptimizationUnion
import typingsJapgolly.angularDevkitBuildAngular.srcBuildersBrowserSchemaMod.Schema
import typingsJapgolly.angularDevkitBuildAngular.srcBuildersBrowserSchemaMod.SourceMapClass
import typingsJapgolly.angularDevkitBuildAngular.srcBuildersBrowserSchemaMod.SourceMapUnion
import typingsJapgolly.angularDevkitBuildAngular.srcUtilsNormalizeBuilderSchemaMod.NormalizedBrowserBuilderSchema
import typingsJapgolly.angularDevkitBuildAngular.srcUtilsNormalizeFileReplacementsMod.NormalizedFileReplacement
import typingsJapgolly.angularDevkitBuildAngular.srcUtilsNormalizeOptimizationMod.NormalizedOptimizationOptions
import typingsJapgolly.angularDevkitCore.srcJsonUtilsMod.JsonObject
import typingsJapgolly.rxjs.mod.Observable_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcUtilsMod {
  
  @JSImport("@angular-devkit/build-angular/src/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular-devkit/build-angular/src/utils", "MissingAssetSourceRootException")
  @js.native
  open class MissingAssetSourceRootException protected ()
    extends typingsJapgolly.angularDevkitBuildAngular.srcUtilsNormalizeAssetPatternsMod.MissingAssetSourceRootException {
    def this(path: String) = this()
  }
  
  @JSImport("@angular-devkit/build-angular/src/utils", "MissingFileReplacementException")
  @js.native
  open class MissingFileReplacementException protected ()
    extends typingsJapgolly.angularDevkitBuildAngular.srcUtilsNormalizeFileReplacementsMod.MissingFileReplacementException {
    def this(path: String) = this()
  }
  
  inline def defaultProgress(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultProgress")().asInstanceOf[Boolean]
  inline def defaultProgress(progress: Boolean): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultProgress")(progress.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def deleteOutputDir(root: String, outputPath: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("deleteOutputDir")(root.asInstanceOf[js.Any], outputPath.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def normalizeAssetPatterns(assetPatterns: js.Array[AssetPattern], workspaceRoot: String, projectRoot: String): js.Array[AssetPatternClass] = (^.asInstanceOf[js.Dynamic].applyDynamic("normalizeAssetPatterns")(assetPatterns.asInstanceOf[js.Any], workspaceRoot.asInstanceOf[js.Any], projectRoot.asInstanceOf[js.Any])).asInstanceOf[js.Array[AssetPatternClass]]
  inline def normalizeAssetPatterns(
    assetPatterns: js.Array[AssetPattern],
    workspaceRoot: String,
    projectRoot: String,
    projectSourceRoot: String
  ): js.Array[AssetPatternClass] = (^.asInstanceOf[js.Dynamic].applyDynamic("normalizeAssetPatterns")(assetPatterns.asInstanceOf[js.Any], workspaceRoot.asInstanceOf[js.Any], projectRoot.asInstanceOf[js.Any], projectSourceRoot.asInstanceOf[js.Any])).asInstanceOf[js.Array[AssetPatternClass]]
  
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
  
  inline def normalizeFileReplacements(fileReplacements: js.Array[FileReplacement], workspaceRoot: String): js.Array[NormalizedFileReplacement] = (^.asInstanceOf[js.Dynamic].applyDynamic("normalizeFileReplacements")(fileReplacements.asInstanceOf[js.Any], workspaceRoot.asInstanceOf[js.Any])).asInstanceOf[js.Array[NormalizedFileReplacement]]
  
  inline def normalizeOptimization(): NormalizedOptimizationOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeOptimization")().asInstanceOf[NormalizedOptimizationOptions]
  inline def normalizeOptimization(optimization: OptimizationUnion): NormalizedOptimizationOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeOptimization")(optimization.asInstanceOf[js.Any]).asInstanceOf[NormalizedOptimizationOptions]
  
  inline def normalizeSourceMaps(sourceMap: SourceMapUnion): SourceMapClass = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeSourceMaps")(sourceMap.asInstanceOf[js.Any]).asInstanceOf[SourceMapClass]
  
  inline def runModuleAsObservableFork(cwd: String, modulePath: String, exportName: String, args: js.Array[Any]): Observable_[BuilderOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("runModuleAsObservableFork")(cwd.asInstanceOf[js.Any], modulePath.asInstanceOf[js.Any], exportName.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Observable_[BuilderOutput]]
  inline def runModuleAsObservableFork(cwd: String, modulePath: String, exportName: Unit, args: js.Array[Any]): Observable_[BuilderOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("runModuleAsObservableFork")(cwd.asInstanceOf[js.Any], modulePath.asInstanceOf[js.Any], exportName.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Observable_[BuilderOutput]]
  
  inline def urlJoin(parts: String*): String = ^.asInstanceOf[js.Dynamic].applyDynamic("urlJoin")(parts.asInstanceOf[Seq[js.Any]]*).asInstanceOf[String]
}
