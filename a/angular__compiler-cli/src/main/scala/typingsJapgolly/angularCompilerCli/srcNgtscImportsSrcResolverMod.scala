package typingsJapgolly.angularCompilerCli

import typingsJapgolly.angularCompilerCli.anon.ModuleResolutionHostPickC
import typingsJapgolly.typescript.mod.CompilerOptions
import typingsJapgolly.typescript.mod.ModuleResolutionCache
import typingsJapgolly.typescript.mod.Program
import typingsJapgolly.typescript.mod.SourceFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcNgtscImportsSrcResolverMod {
  
  @JSImport("@angular/compiler-cli/src/ngtsc/imports/src/resolver", "ModuleResolver")
  @js.native
  open class ModuleResolver protected () extends StObject {
    def this(program: Program, compilerOptions: CompilerOptions, host: ModuleResolutionHostPickC) = this()
    def this(
      program: Program,
      compilerOptions: CompilerOptions,
      host: ModuleResolutionHostPickC,
      moduleResolutionCache: ModuleResolutionCache
    ) = this()
    
    /* private */ var compilerOptions: Any = js.native
    
    /* private */ var host: Any = js.native
    
    /* private */ var moduleResolutionCache: Any = js.native
    
    /* private */ var program: Any = js.native
    
    def resolveModule(moduleName: String, containingFile: String): SourceFile | Null = js.native
  }
}
