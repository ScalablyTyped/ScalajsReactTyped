package typingsJapgolly.tsJest

import typingsJapgolly.bsLogger.distLoggerContextMod.LogContext
import typingsJapgolly.bsLogger.distLoggerMod.Logger
import typingsJapgolly.std.Record
import typingsJapgolly.tsJest.anon.NodeResolve
import typingsJapgolly.tsJest.distRawCompilerOptionsMod.RawCompilerOptions
import typingsJapgolly.tsJest.distTypesMod.ProjectConfigTsJest
import typingsJapgolly.tsJest.distTypesMod.TTypeScript
import typingsJapgolly.tsJest.distTypesMod.TsJestAstTransformer
import typingsJapgolly.typescript.mod.Diagnostic
import typingsJapgolly.typescript.mod.ParsedCommandLine
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLegacyConfigConfigSetMod {
  
  @JSImport("ts-jest/dist/legacy/config/config-set", "ConfigSet")
  @js.native
  open class ConfigSet () extends StObject {
    def this(jestConfig: ProjectConfigTsJest) = this()
    def this(jestConfig: Unit, parentLogger: Logger) = this()
    def this(jestConfig: ProjectConfigTsJest, parentLogger: Logger) = this()
    
    /* protected */ def _resolveTsConfig(): Record[String, Any] = js.native
    /* protected */ def _resolveTsConfig(compilerOptions: Unit, resolvedConfigFile: String): Record[String, Any] = js.native
    /* protected */ def _resolveTsConfig(compilerOptions: RawCompilerOptions): Record[String, Any] = js.native
    /* protected */ def _resolveTsConfig(compilerOptions: RawCompilerOptions, resolvedConfigFile: String): Record[String, Any] = js.native
    
    var cacheSuffix: String = js.native
    
    val compilerModule: TTypeScript = js.native
    
    val cwd: String = js.native
    
    def isTestFile(fileName: String): Boolean = js.native
    
    val isolatedModules: Boolean = js.native
    
    def logger(context: LogContext, message: String, args: Any*): Unit = js.native
    def logger(message: String, args: Any*): Unit = js.native
    @JSName("logger")
    val logger_Original: Logger = js.native
    
    val parentLogger: js.UndefOr[Logger] = js.native
    
    var parsedTsConfig: ParsedCommandLine | (Record[String, Any]) = js.native
    
    def raiseDiagnostics(diagnostics: js.Array[Diagnostic]): Unit = js.native
    def raiseDiagnostics(diagnostics: js.Array[Diagnostic], filePath: String): Unit = js.native
    def raiseDiagnostics(diagnostics: js.Array[Diagnostic], filePath: String, logger: Logger): Unit = js.native
    def raiseDiagnostics(diagnostics: js.Array[Diagnostic], filePath: Unit, logger: Logger): Unit = js.native
    
    def resolvePath(inputPath: String): String = js.native
    def resolvePath(inputPath: String, hasThrowIfMissingNodeResolve: NodeResolve): String = js.native
    
    var resolvedTransformers: TsJestAstTransformer = js.native
    
    val rootDir: String = js.native
    
    def shouldReportDiagnostics(filePath: String): Boolean = js.native
    
    def shouldStringifyContent(filePath: String): Boolean = js.native
    
    var tsCacheDir: js.UndefOr[String] = js.native
    
    val tsJestDigest: String = js.native
    
    var useESM: Boolean = js.native
  }
}
