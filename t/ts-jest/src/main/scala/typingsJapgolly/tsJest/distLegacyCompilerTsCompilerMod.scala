package typingsJapgolly.tsJest

import typingsJapgolly.bsLogger.distLoggerContextMod.LogContext
import typingsJapgolly.bsLogger.distLoggerMod.Logger
import typingsJapgolly.tsJest.distLegacyConfigConfigSetMod.ConfigSet
import typingsJapgolly.tsJest.distTypesMod.CompiledOutput
import typingsJapgolly.tsJest.distTypesMod.StringMap
import typingsJapgolly.tsJest.distTypesMod.TTypeScript
import typingsJapgolly.tsJest.distTypesMod.TsCompilerInstance
import typingsJapgolly.tsJest.distTypesMod.TsJestAstTransformer
import typingsJapgolly.tsJest.distTypesMod.TsJestCompileOptions
import typingsJapgolly.typescript.mod.CompilerOptions
import typingsJapgolly.typescript.mod.CustomTransformers
import typingsJapgolly.typescript.mod.TranspileOutput
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLegacyCompilerTsCompilerMod {
  
  @JSImport("ts-jest/dist/legacy/compiler/ts-compiler", "TsCompiler")
  @js.native
  open class TsCompiler protected ()
    extends StObject
       with TsCompilerInstance {
    def this(configSet: ConfigSet, runtimeCacheFS: StringMap) = this()
    
    /* protected */ var _compilerOptions: CompilerOptions = js.native
    
    /* private */ var _fileContentCache: Any = js.native
    
    /* protected */ val _initialCompilerOptions: CompilerOptions = js.native
    
    /* protected */ def _logger(context: LogContext, message: String, args: Any*): Unit = js.native
    /* protected */ def _logger(message: String, args: Any*): Unit = js.native
    /* protected */ @JSName("_logger")
    val _logger_Original: Logger = js.native
    
    /* protected */ def _makeTransformers(customTransformers: TsJestAstTransformer): CustomTransformers = js.native
    
    /* private */ var _runtimeCacheFS: Any = js.native
    
    /* protected */ def _transpileOutput(fileContent: String, fileName: String): TranspileOutput = js.native
    
    /* protected */ val _ts: TTypeScript = js.native
    
    /* CompleteClass */
    var configSet: ConfigSet = js.native
    
    /* CompleteClass */
    override def getCompiledOutput(fileContent: String, fileName: String, options: TsJestCompileOptions): CompiledOutput = js.native
    
    /* CompleteClass */
    override def getResolvedModules(fileContent: String, fileName: String, runtimeCacheFS: StringMap): js.Array[String] = js.native
    
    val runtimeCacheFS: StringMap = js.native
  }
}
