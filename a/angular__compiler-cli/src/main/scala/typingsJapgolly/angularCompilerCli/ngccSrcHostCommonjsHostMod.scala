package typingsJapgolly.angularCompilerCli

import typingsJapgolly.angularCompilerCli.ngccSrcHostEsm5HostMod.Esm5ReflectionHost
import typingsJapgolly.angularCompilerCli.ngccSrcPackagesBundleProgramMod.BundleProgram
import typingsJapgolly.angularCompilerCli.ngccSrcUtilsMod.FactoryMap
import typingsJapgolly.angularCompilerCli.srcNgtscLoggingSrcLoggerMod.Logger
import typingsJapgolly.std.Map
import typingsJapgolly.typescript.mod.CallExpression
import typingsJapgolly.typescript.mod.CompilerHost
import typingsJapgolly.typescript.mod.Declaration
import typingsJapgolly.typescript.mod.Program
import typingsJapgolly.typescript.mod.SourceFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ngccSrcHostCommonjsHostMod {
  
  @JSImport("@angular/compiler-cli/ngcc/src/host/commonjs_host", "CommonJsReflectionHost")
  @js.native
  open class CommonJsReflectionHost protected () extends Esm5ReflectionHost {
    def this(logger: Logger, isCore: Boolean, src: BundleProgram) = this()
    def this(logger: Logger, isCore: Boolean, src: BundleProgram, dts: BundleProgram) = this()
    
    /* protected */ var commonJsExports: FactoryMap[
        SourceFile, 
        (Map[
          String, 
          typingsJapgolly.angularCompilerCli.srcNgtscReflectionSrcHostMod.Declaration[Declaration]
        ]) | Null
      ] = js.native
    
    /* protected */ var compilerHost: CompilerHost = js.native
    
    /* private */ var computeExportsOfCommonJsModule: Any = js.native
    
    /* private */ var extractBasicCommonJsExportDeclaration: Any = js.native
    
    /* private */ var extractCommonJsDefinePropertyExportDeclaration: Any = js.native
    
    /* private */ var extractCommonJsWildcardReexports: Any = js.native
    
    /* private */ var findCommonJsImport: Any = js.native
    
    /**
      * Handle the case where the identifier represents a reference to a whole CommonJS
      * module, i.e. the result of a call to `require(...)`.
      *
      * @param id the identifier whose declaration we are looking for.
      * @returns a declaration if `id` refers to a CommonJS module, or `null` otherwise.
      */
    /* private */ var getCommonJsModuleDeclaration: Any = js.native
    
    /**
      * Find all the helper calls at the top level of a source file.
      *
      * We cache the helper calls per source file so that we don't have to keep parsing the code for
      * each class in a file.
      *
      * @param sourceFile the source who may contain helper calls.
      * @param helperNames the names of the helpers (e.g. `__decorate`) whose calls we are interested
      * in.
      * @returns an array of nodes of calls to the helper with the given name.
      */
    /* private */ var getTopLevelHelperCalls: Any = js.native
    
    /* protected */ var program: Program = js.native
    
    /* private */ var resolveModuleName: Any = js.native
    
    /* protected */ var topLevelHelperCalls: FactoryMap[String, FactoryMap[SourceFile, js.Array[CallExpression]]] = js.native
  }
}
