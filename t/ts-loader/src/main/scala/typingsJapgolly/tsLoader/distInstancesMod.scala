package typingsJapgolly.tsLoader

import typingsJapgolly.tsLoader.anon.Error
import typingsJapgolly.tsLoader.distInterfacesMod.LoaderOptions
import typingsJapgolly.tsLoader.distInterfacesMod.TSInstance
import typingsJapgolly.typescript.mod.OutputFile
import typingsJapgolly.typescript.mod.ParsedCommandLine
import typingsJapgolly.typescript.mod.ResolvedProjectReference
import typingsJapgolly.webpack.mod.LoaderContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distInstancesMod {
  
  @JSImport("ts-loader/dist/instances", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def buildSolutionReferences(instance: TSInstance, loader: LoaderContext[LoaderOptions]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("buildSolutionReferences")(instance.asInstanceOf[js.Any], loader.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def forEachResolvedProjectReference[T](
    resolvedProjectReferences: js.Array[js.UndefOr[ResolvedProjectReference]],
    cb: js.Function1[/* resolvedProjectReference */ ResolvedProjectReference, js.UndefOr[T]]
  ): js.UndefOr[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("forEachResolvedProjectReference")(resolvedProjectReferences.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[T]]
  inline def forEachResolvedProjectReference[T](
    resolvedProjectReferences: Unit,
    cb: js.Function1[/* resolvedProjectReference */ ResolvedProjectReference, js.UndefOr[T]]
  ): js.UndefOr[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("forEachResolvedProjectReference")(resolvedProjectReferences.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[T]]
  
  inline def getEmitFromWatchHost(instance: TSInstance): js.UndefOr[js.Array[OutputFile]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getEmitFromWatchHost")(instance.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[js.Array[OutputFile]]]
  inline def getEmitFromWatchHost(instance: TSInstance, filePath: String): js.UndefOr[js.Array[OutputFile]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getEmitFromWatchHost")(instance.asInstanceOf[js.Any], filePath.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Array[OutputFile]]]
  
  inline def getEmitOutput(instance: TSInstance, filePath: String): js.Array[OutputFile] = (^.asInstanceOf[js.Dynamic].applyDynamic("getEmitOutput")(instance.asInstanceOf[js.Any], filePath.asInstanceOf[js.Any])).asInstanceOf[js.Array[OutputFile]]
  
  inline def getInputFileNameFromOutput(instance: TSInstance, filePath: String): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getInputFileNameFromOutput")(instance.asInstanceOf[js.Any], filePath.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
  
  inline def getOutputFileNames(instance: TSInstance, configFile: ParsedCommandLine, inputFileName: String): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getOutputFileNames")(instance.asInstanceOf[js.Any], configFile.asInstanceOf[js.Any], inputFileName.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  inline def getTypeScriptInstance(loaderOptions: LoaderOptions, loader: LoaderContext[LoaderOptions]): Error = (^.asInstanceOf[js.Dynamic].applyDynamic("getTypeScriptInstance")(loaderOptions.asInstanceOf[js.Any], loader.asInstanceOf[js.Any])).asInstanceOf[Error]
  
  inline def initializeInstance(loader: LoaderContext[LoaderOptions], instance: TSInstance): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("initializeInstance")(loader.asInstanceOf[js.Any], instance.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def reportTranspileErrors(instance: TSInstance, loader: LoaderContext[LoaderOptions]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("reportTranspileErrors")(instance.asInstanceOf[js.Any], loader.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
