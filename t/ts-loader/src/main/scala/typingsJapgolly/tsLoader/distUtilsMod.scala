package typingsJapgolly.tsLoader

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.chalk.mod.Chalk
import typingsJapgolly.node.bufferMod.global.BufferEncoding
import typingsJapgolly.std.Map
import typingsJapgolly.tsLoader.anon.File
import typingsJapgolly.tsLoader.anon.Typeoftypescript
import typingsJapgolly.tsLoader.distInterfacesMod.FileLocation
import typingsJapgolly.tsLoader.distInterfacesMod.FilePathKey
import typingsJapgolly.tsLoader.distInterfacesMod.LoaderOptions
import typingsJapgolly.tsLoader.distInterfacesMod.ResolvedModule
import typingsJapgolly.tsLoader.distInterfacesMod.ReverseDependencyGraph
import typingsJapgolly.tsLoader.distInterfacesMod.TSInstance
import typingsJapgolly.tsLoader.tsLoaderBooleans.`true`
import typingsJapgolly.typescript.mod.Diagnostic
import typingsJapgolly.typescript.mod.Program
import typingsJapgolly.webpack.mod.WebpackError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUtilsMod {
  
  @JSImport("ts-loader/dist/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def appendSuffixIfMatch(patterns: js.Array[js.RegExp | String], filePath: String, suffix: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("appendSuffixIfMatch")(patterns.asInstanceOf[js.Any], filePath.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def appendSuffixesIfMatch(suffixDict: StringDictionary[js.Array[js.RegExp | String]], filePath: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("appendSuffixesIfMatch")(suffixDict.asInstanceOf[js.Any], filePath.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def arrify[T](`val`: T): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("arrify")(`val`.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  inline def arrify[T](`val`: js.Array[T]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("arrify")(`val`.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  
  inline def collectAllDependants(reverseDependencyGraph: ReverseDependencyGraph, fileName: FilePathKey): Map[FilePathKey, `true`] = (^.asInstanceOf[js.Dynamic].applyDynamic("collectAllDependants")(reverseDependencyGraph.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any])).asInstanceOf[Map[FilePathKey, `true`]]
  
  inline def collectAllDependants_true(
    reverseDependencyGraph: ReverseDependencyGraph,
    fileName: FilePathKey,
    result: Map[FilePathKey, `true`]
  ): Map[FilePathKey, `true`] = (^.asInstanceOf[js.Dynamic].applyDynamic("collectAllDependants")(reverseDependencyGraph.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Map[FilePathKey, `true`]]
  
  inline def ensureProgram(instance: TSInstance): js.UndefOr[Program] = ^.asInstanceOf[js.Dynamic].applyDynamic("ensureProgram")(instance.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Program]]
  
  inline def formatErrors(
    diagnostics: js.Array[Diagnostic],
    loaderOptions: LoaderOptions,
    colors: Chalk,
    compiler: Typeoftypescript,
    merge: File,
    context: String
  ): js.Array[WebpackError] = (^.asInstanceOf[js.Dynamic].applyDynamic("formatErrors")(diagnostics.asInstanceOf[js.Any], loaderOptions.asInstanceOf[js.Any], colors.asInstanceOf[js.Any], compiler.asInstanceOf[js.Any], merge.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Array[WebpackError]]
  inline def formatErrors(
    diagnostics: Unit,
    loaderOptions: LoaderOptions,
    colors: Chalk,
    compiler: Typeoftypescript,
    merge: File,
    context: String
  ): js.Array[WebpackError] = (^.asInstanceOf[js.Dynamic].applyDynamic("formatErrors")(diagnostics.asInstanceOf[js.Any], loaderOptions.asInstanceOf[js.Any], colors.asInstanceOf[js.Any], compiler.asInstanceOf[js.Any], merge.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Array[WebpackError]]
  
  inline def fsReadFile(fileName: String): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("fsReadFile")(fileName.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
  inline def fsReadFile(fileName: String, encoding: BufferEncoding): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("fsReadFile")(fileName.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
  
  inline def isReferencedFile(instance: TSInstance, filePath: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isReferencedFile")(instance.asInstanceOf[js.Any], filePath.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def makeError(loaderOptions: LoaderOptions, message: String, file: String): WebpackError = (^.asInstanceOf[js.Dynamic].applyDynamic("makeError")(loaderOptions.asInstanceOf[js.Any], message.asInstanceOf[js.Any], file.asInstanceOf[js.Any])).asInstanceOf[WebpackError]
  inline def makeError(
    loaderOptions: LoaderOptions,
    message: String,
    file: String,
    location: Unit,
    endLocation: FileLocation
  ): WebpackError = (^.asInstanceOf[js.Dynamic].applyDynamic("makeError")(loaderOptions.asInstanceOf[js.Any], message.asInstanceOf[js.Any], file.asInstanceOf[js.Any], location.asInstanceOf[js.Any], endLocation.asInstanceOf[js.Any])).asInstanceOf[WebpackError]
  inline def makeError(loaderOptions: LoaderOptions, message: String, file: String, location: FileLocation): WebpackError = (^.asInstanceOf[js.Dynamic].applyDynamic("makeError")(loaderOptions.asInstanceOf[js.Any], message.asInstanceOf[js.Any], file.asInstanceOf[js.Any], location.asInstanceOf[js.Any])).asInstanceOf[WebpackError]
  inline def makeError(
    loaderOptions: LoaderOptions,
    message: String,
    file: String,
    location: FileLocation,
    endLocation: FileLocation
  ): WebpackError = (^.asInstanceOf[js.Dynamic].applyDynamic("makeError")(loaderOptions.asInstanceOf[js.Any], message.asInstanceOf[js.Any], file.asInstanceOf[js.Any], location.asInstanceOf[js.Any], endLocation.asInstanceOf[js.Any])).asInstanceOf[WebpackError]
  
  inline def populateDependencyGraph(resolvedModules: js.Array[ResolvedModule], instance: TSInstance, containingFile: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("populateDependencyGraph")(resolvedModules.asInstanceOf[js.Any], instance.asInstanceOf[js.Any], containingFile.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def populateReverseDependencyGraph(instance: TSInstance): ReverseDependencyGraph = ^.asInstanceOf[js.Dynamic].applyDynamic("populateReverseDependencyGraph")(instance.asInstanceOf[js.Any]).asInstanceOf[ReverseDependencyGraph]
  
  inline def supportsSolutionBuild(instance: TSInstance): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("supportsSolutionBuild")(instance.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def tsLoaderSource(loaderOptions: LoaderOptions): String = ^.asInstanceOf[js.Dynamic].applyDynamic("tsLoaderSource")(loaderOptions.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def unorderedRemoveItem[T](array: js.Array[T], item: T): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("unorderedRemoveItem")(array.asInstanceOf[js.Any], item.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def useCaseSensitiveFileNames(compiler: Typeoftypescript, loaderOptions: LoaderOptions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("useCaseSensitiveFileNames")(compiler.asInstanceOf[js.Any], loaderOptions.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
