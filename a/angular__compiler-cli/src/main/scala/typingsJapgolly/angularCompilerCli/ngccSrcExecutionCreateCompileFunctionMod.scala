package typingsJapgolly.angularCompilerCli

import typingsJapgolly.angularCompilerCli.ngccSrcExecutionApiMod.CreateCompileFn
import typingsJapgolly.angularCompilerCli.ngccSrcPathMappingsMod.PathMappings
import typingsJapgolly.angularCompilerCli.ngccSrcWritingFileWriterMod.FileWriter
import typingsJapgolly.angularCompilerCli.srcNgtscFileSystemSrcTypesMod.FileSystem
import typingsJapgolly.angularCompilerCli.srcNgtscLoggingSrcLoggerMod.Logger
import typingsJapgolly.angularCompilerCli.srcPerformCompileMod.ParsedConfiguration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ngccSrcExecutionCreateCompileFunctionMod {
  
  @JSImport("@angular/compiler-cli/ngcc/src/execution/create_compile_function", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getCreateCompileFn(
    fileSystem: FileSystem,
    logger: Logger,
    fileWriter: FileWriter,
    enableI18nLegacyMessageIdFormat: Boolean
  ): CreateCompileFn = (^.asInstanceOf[js.Dynamic].applyDynamic("getCreateCompileFn")(fileSystem.asInstanceOf[js.Any], logger.asInstanceOf[js.Any], fileWriter.asInstanceOf[js.Any], enableI18nLegacyMessageIdFormat.asInstanceOf[js.Any])).asInstanceOf[CreateCompileFn]
  inline def getCreateCompileFn(
    fileSystem: FileSystem,
    logger: Logger,
    fileWriter: FileWriter,
    enableI18nLegacyMessageIdFormat: Boolean,
    tsConfig: Null,
    pathMappings: PathMappings
  ): CreateCompileFn = (^.asInstanceOf[js.Dynamic].applyDynamic("getCreateCompileFn")(fileSystem.asInstanceOf[js.Any], logger.asInstanceOf[js.Any], fileWriter.asInstanceOf[js.Any], enableI18nLegacyMessageIdFormat.asInstanceOf[js.Any], tsConfig.asInstanceOf[js.Any], pathMappings.asInstanceOf[js.Any])).asInstanceOf[CreateCompileFn]
  inline def getCreateCompileFn(
    fileSystem: FileSystem,
    logger: Logger,
    fileWriter: FileWriter,
    enableI18nLegacyMessageIdFormat: Boolean,
    tsConfig: ParsedConfiguration
  ): CreateCompileFn = (^.asInstanceOf[js.Dynamic].applyDynamic("getCreateCompileFn")(fileSystem.asInstanceOf[js.Any], logger.asInstanceOf[js.Any], fileWriter.asInstanceOf[js.Any], enableI18nLegacyMessageIdFormat.asInstanceOf[js.Any], tsConfig.asInstanceOf[js.Any])).asInstanceOf[CreateCompileFn]
  inline def getCreateCompileFn(
    fileSystem: FileSystem,
    logger: Logger,
    fileWriter: FileWriter,
    enableI18nLegacyMessageIdFormat: Boolean,
    tsConfig: ParsedConfiguration,
    pathMappings: PathMappings
  ): CreateCompileFn = (^.asInstanceOf[js.Dynamic].applyDynamic("getCreateCompileFn")(fileSystem.asInstanceOf[js.Any], logger.asInstanceOf[js.Any], fileWriter.asInstanceOf[js.Any], enableI18nLegacyMessageIdFormat.asInstanceOf[js.Any], tsConfig.asInstanceOf[js.Any], pathMappings.asInstanceOf[js.Any])).asInstanceOf[CreateCompileFn]
}
