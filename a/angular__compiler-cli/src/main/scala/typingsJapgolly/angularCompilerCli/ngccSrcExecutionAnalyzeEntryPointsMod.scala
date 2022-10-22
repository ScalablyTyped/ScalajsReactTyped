package typingsJapgolly.angularCompilerCli

import typingsJapgolly.angularCompilerCli.ngccSrcEntryPointFinderInterfaceMod.EntryPointFinder
import typingsJapgolly.angularCompilerCli.ngccSrcExecutionApiMod.AnalyzeEntryPointsFn
import typingsJapgolly.angularCompilerCli.ngccSrcPackagesEntryPointMod.EntryPointJsonProperty
import typingsJapgolly.angularCompilerCli.srcNgtscFileSystemSrcTypesMod.FileSystem
import typingsJapgolly.angularCompilerCli.srcNgtscLoggingSrcLoggerMod.Logger
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ngccSrcExecutionAnalyzeEntryPointsMod {
  
  @JSImport("@angular/compiler-cli/ngcc/src/execution/analyze_entry_points", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getAnalyzeEntryPointsFn(
    logger: Logger,
    finder: EntryPointFinder,
    fileSystem: FileSystem,
    supportedPropertiesToConsider: js.Array[EntryPointJsonProperty],
    typingsOnly: Boolean,
    compileAllFormats: Boolean,
    propertiesToConsider: js.Array[String],
    inParallel: Boolean
  ): AnalyzeEntryPointsFn = (^.asInstanceOf[js.Dynamic].applyDynamic("getAnalyzeEntryPointsFn")(logger.asInstanceOf[js.Any], finder.asInstanceOf[js.Any], fileSystem.asInstanceOf[js.Any], supportedPropertiesToConsider.asInstanceOf[js.Any], typingsOnly.asInstanceOf[js.Any], compileAllFormats.asInstanceOf[js.Any], propertiesToConsider.asInstanceOf[js.Any], inParallel.asInstanceOf[js.Any])).asInstanceOf[AnalyzeEntryPointsFn]
}
