package typingsJapgolly.tsLoader

import typingsJapgolly.tsLoader.distInterfacesMod.FilePathKey
import typingsJapgolly.tsLoader.distInterfacesMod.LoaderOptions
import typingsJapgolly.tsLoader.distInterfacesMod.ServiceHostWhichMayBeCacheable
import typingsJapgolly.tsLoader.distInterfacesMod.SolutionBuilderWithWatchHost
import typingsJapgolly.tsLoader.distInterfacesMod.TSInstance
import typingsJapgolly.tsLoader.distInterfacesMod.WatchHost
import typingsJapgolly.typescript.mod.ProjectReference
import typingsJapgolly.webpack.mod.LoaderContext
import typingsJapgolly.webpack.mod.WebpackError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distServicesHostMod {
  
  @JSImport("ts-loader/dist/servicesHost", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getSolutionErrors(instance: TSInstance, context: String): js.Array[WebpackError] = (^.asInstanceOf[js.Dynamic].applyDynamic("getSolutionErrors")(instance.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Array[WebpackError]]
  
  inline def makeServicesHost(scriptRegex: js.RegExp, loader: LoaderContext[LoaderOptions], instance: TSInstance): ServiceHostWhichMayBeCacheable = (^.asInstanceOf[js.Dynamic].applyDynamic("makeServicesHost")(scriptRegex.asInstanceOf[js.Any], loader.asInstanceOf[js.Any], instance.asInstanceOf[js.Any])).asInstanceOf[ServiceHostWhichMayBeCacheable]
  inline def makeServicesHost(
    scriptRegex: js.RegExp,
    loader: LoaderContext[LoaderOptions],
    instance: TSInstance,
    projectReferences: js.Array[ProjectReference]
  ): ServiceHostWhichMayBeCacheable = (^.asInstanceOf[js.Dynamic].applyDynamic("makeServicesHost")(scriptRegex.asInstanceOf[js.Any], loader.asInstanceOf[js.Any], instance.asInstanceOf[js.Any], projectReferences.asInstanceOf[js.Any])).asInstanceOf[ServiceHostWhichMayBeCacheable]
  
  inline def makeSolutionBuilderHost(scriptRegex: js.RegExp, loader: LoaderContext[LoaderOptions], instance: TSInstance): SolutionBuilderWithWatchHost = (^.asInstanceOf[js.Dynamic].applyDynamic("makeSolutionBuilderHost")(scriptRegex.asInstanceOf[js.Any], loader.asInstanceOf[js.Any], instance.asInstanceOf[js.Any])).asInstanceOf[SolutionBuilderWithWatchHost]
  
  inline def makeWatchHost(scriptRegex: js.RegExp, loader: LoaderContext[LoaderOptions], instance: TSInstance): WatchHost = (^.asInstanceOf[js.Dynamic].applyDynamic("makeWatchHost")(scriptRegex.asInstanceOf[js.Any], loader.asInstanceOf[js.Any], instance.asInstanceOf[js.Any])).asInstanceOf[WatchHost]
  inline def makeWatchHost(
    scriptRegex: js.RegExp,
    loader: LoaderContext[LoaderOptions],
    instance: TSInstance,
    projectReferences: js.Array[ProjectReference]
  ): WatchHost = (^.asInstanceOf[js.Dynamic].applyDynamic("makeWatchHost")(scriptRegex.asInstanceOf[js.Any], loader.asInstanceOf[js.Any], instance.asInstanceOf[js.Any], projectReferences.asInstanceOf[js.Any])).asInstanceOf[WatchHost]
  
  inline def updateFileWithText(
    instance: TSInstance,
    key: FilePathKey,
    filePath: String,
    text: js.Function1[/* nFilePath */ String, String]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("updateFileWithText")(instance.asInstanceOf[js.Any], key.asInstanceOf[js.Any], filePath.asInstanceOf[js.Any], text.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
